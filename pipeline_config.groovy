jdk_tool = 'java-21'
deploy_to_sonatype = 'true'
jte {
	pipeline_template = "jar_library"
}

libraries {
	maven
}
