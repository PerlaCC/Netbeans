pipeline {
    agent any
    tools {
        maven 'devops_maven'
    }
    triggers {
        githubPush()
    }
    environment {
        POM = "pom.xml"
    }
    stages {
        stage('Descarga') {
            steps {
                git url: 'https://github.com/PerlaCC/Netbeans.git', branch: 'main'
            }
        }
        stage('Compilacion') {
            steps {
                sh 'mvn -f $POM -B package'
            }
        }
        stage('Prueba') {
            steps {
                sh 'mvn -f $POM test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Empaquetado') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
