package com.example.buildSrc

import org.gradle.api.Plugin
import org.gradle.api.Project

class Address {

    String province

    String city
}

class HCExtension {

    String myName
}

class TestExtensionPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.extensions.create('hc', HCExtension)
        project.extensions.create('address', Address)


        project.task('readExtension') << {
            def address = project['address']

            println project['hc'].myName
            println address.province + " " + address.city

        }
    }
}