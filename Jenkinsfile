pipeline{
    //agent any
    agent{
        label 'maven'
    }
    environment{
        myvar = "outer block"
    }
    tools {
        
        maven 'maven362'
        
    }
    //timestamps {
    // some block
  //  sh 'echo attaching timestamps'
//}
    
     options {
               timestamps ()
               timeout(10)
               buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '5', numToKeepStr: '5')
}


    stages{
        stage('checkout'){
            steps{
            git credentialsId: 'pipeline', url: 'https://github.com/rameshcompany/war-1-wm-1.git'
        }
        }
        stage('build'){
            steps{
            sh "mvn clean install"
            //sh 'echo buiilding'
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
