def call(String ImageName , String ImageTag, String DockerHUbUser){
  sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
}
