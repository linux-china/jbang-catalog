jbang-catalog

=============

# Tips

* Jbang cheat: `cheat jbang`
* Generate picocli command: `jbang init --template=cli Hello.java`
* Install with native mode, please set GRAALVM_HOME first.

```
$ jbang app install --native Hello.java
$ jbang app install --native properties@jbangdev
```

* Maven dependencyManagement or BOM POM's

```
//DEPS org.springframework.boot:spring-boot-dependencies:2.4.2@pom
//DEPS org.projectlombok:lombok:1.18.22
```

# jbang-catalog.json data format
   
Example as following: 
```json
{
  "aliases": {
    "hello": {
      "script-ref": "src/jbang/hello/HelloWorld.java",
      "description": "Hello World",
      "java": "8",
      "main": "",
      "arguments": [],
      "java-options": [],
      "dependencies": [],
      "properties": {}
    }
  }
}
```

# References

* jbang: https://github.com/jbangdev/jbang
* picocli: a mighty tiny command line interface: https://picocli.info/
* Scripting with Quarkus: https://quarkus.io/guides/scripting
* Gradle Source Sets: https://www.baeldung.com/gradle-source-sets
* Gradle Goodness: Add Support For "Scratch" Files To Java Project https://blog.jdriven.com/2021/03/gradle-goodness-add-support-for-scratch-files-to-java-project/
* Gradle Build Language Reference: https://docs.gradle.org/current/dsl/index.html
