def call(string dockerHubUser string dockerhubPass string ProjectName string imageTag ){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
}
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}" 
}
