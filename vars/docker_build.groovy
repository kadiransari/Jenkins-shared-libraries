def call(string imagename, string imagetag){
  sh "docker build -t ${imagename}:${imagetag} ."
}
