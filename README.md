Setting up multiple DB connections inside single Java - Spring - Hibernate application

* This architecture includes a single java, spring, hibernate web application which can communicate with two separate MySQL databases. This architecture has been tested under following suites.
    Java 7, spring 3, Hibernate 4 (GIT Branch : master)
    Java 8, spring 4, Hibernate 5 (GIT Branch : java8)

* This application keeps two sets of database database details in a single system.properties file
* In a single mvc-dispatcher-servlet.xml following beans should be created related to each DB(eg: If we are going to communicate with 2 DBs, 2 sets of following beans should be created)
    Data Source bean
    Session factory bean
    Transaction manager beans
* Each session factory bean should have a qualifier property
* Include mvc:interceptors for each session factory
* Model classes should be separated to packages according to available DBs.(Eg: If two DBs available, two packages with model classes of each DB should be created)
* Those packages should be provided for each created session factories under property packagesToScan
* Better to keep separated DAO packages relevant to each DB
* Should have UniversalDaoImpl classes relevant to each available DBs
* When auto-wiring the session factory bean, relevant Session Factory bean configuration should be set using the @Qualifir(“Qualifier_name”) annotation
* Better to keep separate service packages relevant to each DB (NOTE: It might be possible to keep a single package)
* Select the relevant transactional bean, service method wise with @Tranactional(“transactional_manager_bean_name”)

