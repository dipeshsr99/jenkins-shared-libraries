def call(String url, String branch){
  git url: "${url}", branch: "${branch}"
  checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
