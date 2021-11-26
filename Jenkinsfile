#!groovy


pipeline {

    agent any

    stages {
        stage("Set Token") {
            steps {
            timeout(time: 30, unit: 'SECONDS') {
                script {
                    env.INPUT = input message: "Please provide token", ok: 'Next',
                        parameters: [
                            choice(name: 'VAR', choices: ['token1', 'token2'], description: "Please select token")
                        ]
                    echo "Selected token: ${env.VAR}"
                }
            }
            }
        }
    }
}