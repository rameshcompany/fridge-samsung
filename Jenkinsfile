pipeline{
    agent any
    environment{
        myvar = "outer block"
    }
    stages{
        /*stage('checkout'){
            steps{
            git credentialsId: 'pipeline', url: 'https://github.com/rameshcompany/war-1-wm-1.git'
        }
        }/*
        stage('build'){
            steps{
            sh "mvn clean install"
        }
        }
        stage('post tasks'){
            steps{
            sh "echo emailing"
        }
        }
        stage('printing environment var'){
            environment{
                myvar = "inner block"
            }
            steps{
                sh 'echo "this is my var: $myvar"'
            }
        }
    }
}
