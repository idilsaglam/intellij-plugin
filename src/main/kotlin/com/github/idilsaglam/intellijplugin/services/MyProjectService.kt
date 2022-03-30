package com.github.idilsaglam.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.idilsaglam.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
