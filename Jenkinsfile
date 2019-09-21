node{
  stage('SCM Checkout'){
    git 'https://github.com/DarshAsawa/Maven'
    }
    stage('Compile-Package'){
      def mvnHome =  tool name: 'localMaven', type: 'maven'
      sh '${mvnHome}/bin/mvn install'
    }
   }
