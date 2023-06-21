package markdown.grails.test

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import com.vladsch.flexmark.parser.Parser

import groovy.transform.CompileStatic

@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
        println("Running using groovy: ${GroovySystem.getVersion()}!")
        Parser parser = Parser.builder().build()
    }
}
