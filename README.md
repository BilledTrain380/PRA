PRA - PSA Report API
====================

PRA is an api specification to generate reports for the [Sporttag PSA](https://github.com/BilledTrain380/sporttag-psa).

## Usage

This project provides a factory class to get the specific implementation. Make sure an implementation
of PRA is on your classpath.

```java
private TotalRankingApi api = new ReportApiFactory.getTotalRanking();
```

## API
The following APIs are available:
* **discipline group ranking api** - to generate ranking for specific disciplines
* **discipline ranking api** - to generate ranking for a single discipline
* **total ranking api** - to generate the total ranking for all disciplines
* **participant list api** - to generate a participant list of a single sport
* **event sheet api** - to generate sheets for a discipline to fill in the results of competitors

## Implement your own

To implement your own report generation you have to add this project as a dependency to your report project.
This project is not available on any public repository expect Github. I recommend to use [JitPack](https://jitpack.io) to add this project as a dependency.

**Step 1.** Add the JitPack repository to your build file
Add it into your root `build.gradle` at the end of repositories:
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add PRA dependency
```groovy
dependencies {
    compile 'com.github.BilledTrain380:PRA:1.0.0'
}
```

## Built With

* [Gradle](https://gradle.org) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/BilledTrain380/PRA/tags). 

## Authors

* **Nicolas Märchy** - *Initial work* - [BilledTrain380](https://github.com/BilledTrain380)

See also the list of [contributors](https://github.com/BilledTrain380/PRA/graphs/contributors) who participated in this project.

## License

This project is licensed under the GNU GPL License - see the [LICENSE.md](LICENSE.md) file for details
