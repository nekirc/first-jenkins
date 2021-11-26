#!/usr/bin/env groovy

class TestInput implements Serializable{
    String testInput
}

def call(Map input){
    echo("STEP TestInput called with: " +input.toString())
    call(new TestInput(input))
}

def call(TestInput input) {

    def token = sh(script: "export ${input.testInput}='1234567890'", returnStdout: true)

}
