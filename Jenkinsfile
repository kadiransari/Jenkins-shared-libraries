@Library("shared") _
pipeline {
    agent {label 'qa'}
    
    stages {
        stage('hello') {
            steps{
                script{
                    firstsharedlib()
                }
            }
        }
        stage('pull the code') {
            steps {
                script{
                 gitclone("https://github.com/kadiransari/django-notes-app.git","main") 
                }
            }
        }
        stage('build the code') {
            steps {
                script{
                echo 'this is build stage start'
                docker_build("notetest","latest","kadiransari7208")
                }
            }
        }
        stage('deployment the code') {
            steps {
                echo 'this is deployment stage'
                sh "docker-compose up -d"
            }
        }
         stage("Push to DockerHub"){
            steps{
                script{
                docker_push ("notetest","latest","kadiransari7208")   
                }
            }
        }
    }
}
