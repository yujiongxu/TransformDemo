package com.example.myplugin.applife

import javassist.ClassPool
import javassist.CtClass
import javassist.CtConstructor
import javassist.CtMethod

class ApplifeInject {

    private static ClassPool pool = ClassPool.getDefault()

    static void injectDir(File dir) {
        pool.appendClassPath(dir.absolutePath)
        if (dir.isDirectory()) {
            dir.eachFileRecurse { File file ->

                if (file.name.equals("ApplicationLifecycleManager.class")) {
                    println "11>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>11"
                    String className = "com.example.transformdemo.test.ApplicationLifecycleManager"
                    CtClass c = pool.getCtClass(className)
                    println "22>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>22"
                    if (c.isFrozen()) {
                        c.defrost()
                    }
                    def method = c.getDeclaredMethod("init")
                    println method.name
                    method.insertAfter("registerApplicationLifecycleCallbacks(\"哈哈哈11111\");")
                    method.insertAfter("registerApplicationLifecycleCallbacks(\"哈哈哈22222\");")
                    method.insertAfter("registerApplicationLifecycleCallbacks(\"哈哈哈33333\");")
                    c.writeFile(dir.absolutePath)
                    c.detach()
                }
            }
        }
    }


}