def call(string url, string branch){
  git url: "${url}", branch: "${branch}"
  echo "code cloning successful"
}
