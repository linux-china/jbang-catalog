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
//DEPS org.projectlombok:lombok
```

# jbang-catalog.json data format
   
Example as following: 
```json
{
  "aliases": {
    "demo": {
      "script-ref": "src/jbang/demo/Demo.java",
      "description": "Demo",
      "java": "8",
      "main": "",
      "arguments": [],
      "javaOptions": [],
      "dependencies": [],
      "properties": {}
    }
  }
}
```

# References

* jbang: https://github.com/jbangdev/jbang
* picocli: a mighty tiny command line interface: https://picocli.info/
