def call(String ImageName , String ImageTag, String dockerHUbUser){
  sh "docker build -t ${dockerHubUser}/${ImageName}:${ImageTag} ."
}
