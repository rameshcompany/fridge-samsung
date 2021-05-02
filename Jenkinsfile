pipeline{
    agent any
    environment{
        myvar = "outer block"
    }
    stages{
       
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
