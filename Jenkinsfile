node{
  stage('SCM Checkout'){
    tool name: 'localMaven', type: 'maven'
    
    git 'https://github.com/DarshAsawa/Maven'
    }
    stage('Compile-Package'){
    sh 'mvn install'
    }
   }
