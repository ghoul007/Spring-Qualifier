## @Qualifier

The @Qualifier annotation, we can eliminate the issue of which bean needs to be injected.
 @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired
```java
private final EService eService;

@Autowired
public AvoidCrash(@Qualifier("RESTService") EService eService) {
this.eService = eService;
    eService.call();
}
```