package ch.schulealtendorf.pra;

import ch.schulealtendorf.pra.api.*;
import com.sun.tools.javadoc.Start;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.logging.Logger;

/**
 * Factory class to get api instances. This class loads
 * APIs through a {@link ServiceLoader}.
 * 
 * @author nmaerchy
 * @version 1.0.0
 */
public class ReportAPIFactory {
    
    private final static Logger log = Logger.getLogger(ReportAPIFactory.class.getName());
    
    private static TotalRankingAPI totalRankingApi = null;
    
    public static TotalRankingAPI getTotalRanking() {
        return instance(totalRankingApi, TotalRankingAPI.class);
    }
    
    private static DisciplineRankingAPI disciplineRankingAPI = null;
    
    public static DisciplineRankingAPI getDisciplineRanking() {
        return instance(disciplineRankingAPI, DisciplineRankingAPI.class);
    }
    
    private static DisciplineGroupRankingAPI disciplineGroupRankingAPI = null;
    
    public static DisciplineGroupRankingAPI getDisciplineGroupRanking() {
        return instance(disciplineGroupRankingAPI, DisciplineGroupRankingAPI.class);
    }
    
    private static ParticipantListAPI participantListAPI = null;
    
    public static ParticipantListAPI getParticipantList() {
        return instance(participantListAPI, ParticipantListAPI.class);
    }
    
    private static EventSheetAPI eventSheetAPI = null;
    
    public static EventSheetAPI getEventSheet() {
        return instance(eventSheetAPI, EventSheetAPI.class);
    }

    private static StartListAPI startListAPI = null;

    public static StartListAPI getStartList() {
        return instance(startListAPI, StartListAPI.class);
    }

    /**
     * If the given {@code field} is null
     * an api of the given {@code type} is created
     * and assigned to the field. Otherwise the field is returned.
     * 
     * @param field the field to check on null
     * @param type the api type to create
     * @param <T>
     * @return the given field
     */
    private static <T> T instance(T field, Class<T> type) {
        
        if (field == null) {
            field = createApi(type);
        }
        return field;
    }

    /**
     * Creates the api matching the given {@code type}.
     * 
     * @param type the type to load with the service loader
     * @param <T> The api type
     *           
     * @return the found api
     */
    private static <T> T createApi(Class<T> type) {

        List<T> apiList = new ArrayList<>();
        ServiceLoader.load(type).forEach(apiList::add);

        Function<List<T>, T> strategy = new DefaultAPIEvaluationStrategy<>();

        return strategy.apply(apiList);
    }
    
    private static class DefaultAPIEvaluationStrategy<T extends List<K>, K> implements Function<T, K> {

        /**
         * Checks, if an api exists in the given argument.
         * If more than one api exists its not known which one is used.
         *
         * @param t a list of api instances, should only contain one
         * @return the api instance
         * @throws IllegalStateException if no api is found
         */
        @Override
        public K apply(T t) {
            
            if (t.isEmpty()) {
                throw new IllegalStateException("No report api found: type=" + t.getClass());
            }

            if (t.size() > 1) {
                log.warning("Multiple available report api found. Which one is used is not known.");
            }

            return t.get(0);
        }
    }
}
