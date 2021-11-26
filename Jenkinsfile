#!groovy

library identifier: 'first-jenkins@CHNG-1', retriever: modernSCM(
    [$class: 'GitSCMSource',
    remote: 'https://github.com/nekirc/first-jenkins.git',
    credentialsId: "1"])

pipeline {

    agent any

    post {
        always {
            archiveArtifacts(artifacts: '**/*', defaultExcludes: false)
            //deleteDir()
            //dir("${WORKSPACE}") {
            //    deleteDir()
            //}
        }
    }

    stages {
        stage("Set Token") {
            environment {
                TOKEN = getToken(testInput: "TOKEN")
            }
            steps {
                timeout(time: 30, unit: 'SECONDS') {
                script {
                    env.INPUT = input message: "Please provide token", ok: 'Next',
                        parameters: [
                            choice(name: 'VAR', choices: ['TOKEN', 'TOKEN2'], description: "Please select token")
                        ]
                    echo "Selected token: ${env.INPUT}"
                    echo "Value token: ${env.TOKEN}"
                    sh('printenv | sort')
                }
            }
            }
        }
    }
}