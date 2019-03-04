/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package com.finalfantasysports.player

import spock.lang.Specification

class PlayerTest extends Specification {
    def "someLibraryMethod returns true"() {
        setup:
        def lib = new Player()

        when:
        def result = lib.someLibraryMethod()

        then:
        result == "Hi George!"
    }
}
