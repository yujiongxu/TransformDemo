package com.example.myplugin

import com.example.myplugin.applife.ApplifeTransform
import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.AppExtension

class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "MyPlugin registerTransform>>>>>>>>>>>>>>>>>>>>>>>>>"

        def android = project.extensions.getByType(AppExtension)

        android.registerTransform(new MyTransform(project))
        android.registerTransform(new ApplifeTransform(project))
    }

}
