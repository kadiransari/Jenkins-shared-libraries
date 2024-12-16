def call(string dockerHubUser string dockerhubPass string ProjectName string imageTag ){
  withCredentials([usernamePassword(credentialsId:"dockerhubcred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")])
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh "docker image tag ${ProjectName}:{imageTag} ${env.dockerHubUser}/${ProjectName}:${imageTag}"
  sh "docker push ${env.dockerHubUser}/${ProjectName}:${imageTag}"
}
