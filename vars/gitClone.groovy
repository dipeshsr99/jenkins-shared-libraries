def call(String repoUrl, Map args = [:]) {
    def branch = args.get('branch', 'main')

    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
