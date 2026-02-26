jdk_tool = 'java-21'
deploy_to_sonatype = 'true'
is_github_repo = 'true'
maven_install = 'openpay-maven-3.9.6'
sonatype_credentials_id = 'ossrh'
secret_name = 'op-mx-dev-jenkins'
git_credentials_id = 'jenkins-github-latam-ct'
jte {
	pipeline_template = "jar_library"
}

libraries {
	maven
}

application_environments{
    dev{name
        bucket = ''
        source = ''
        destination = ''
        secret_name = 'op-jenkins-secrets'
        key_bucket = ''
        key_path = ''
        sign_apk = 'false'
    }
  sandbox {
        bucket = ''
        source = ''
        destination = ''
        secret_name = 'op-jenkins-secrets'
    }
  prod{
        bucket = ''
        source = ''
        destination = ''
        secret_name = 'op-jenkins-secrets'
    }

}
