///usr/bin/env jbang "$0" "$@" ; exit $?

//KOTLIN 1.8.21
//JAVA 17
//REPOS mavencentral,jetbrains=https://packages.jetbrains.team/maven/p/ij/intellij-shared-indexes
//DEPS org.jetbrains.kotlin:kotlin-bom:1.8.21@pom
//DEPS com.jetbrains.intellij.indexing.shared:ij-shared-indexes-tool:0.9.0
//DEPS org.slf4j:slf4j-simple:2.0.7

import com.intellij.indexing.shared.builder.IntelliJ
import com.intellij.indexing.shared.builder.IntelliJSharedIndexes
import com.intellij.indexing.shared.builder.serverDir
import com.intellij.indexing.shared.builder.tempDir
import java.nio.file.Paths
import kotlin.io.path.Path
import kotlin.io.path.name


fun main(args: Array<String>) {
    val indexHostingSiteUrl = "https://indexes.example.com/"
    val currentDir = Paths.get("").toAbsolutePath();
    val projectName = if (args.isNotEmpty()) args[0] else currentDir.name
    val projectDir = if (args.size > 1) Path(args[1]) else currentDir
    val dataDir = Path(System.getProperty("user.home"), "ij-shared-indexes-tool-data")
    //val intellij = IntelliJ.byProductAndVersion(IntelliJBasedProduct.IDEAUltimate, "2023.1")
    val ijHome =
        Path("${System.getProperty("user.home")}/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-2/232.5150.116/IntelliJ IDEA 2023.2 EAP.app")
    val intellij = IntelliJ.fromLocallyInstalled(ijHome)
    IntelliJSharedIndexes(dataDir.tempDir())
        .project(projectName, projectDir)
        .using(intellij)
        .buildAndUpload(dataDir.serverDir(), indexHostingSiteUrl) { true }
}
