project {
  modelVersion '4.0.0'
  parent 'org.springframework.boot:spring-boot-starter-parent:1.3.0.RELEASE'
  groupId 'com.example'
  artifactId 'demo'
  version '0.0.1-SNAPSHOT'
  name 'demo'
  description 'Demo project for Spring Boot'
  properties {
    'java.version' '1.8'
    'project.build.sourceEncoding' 'UTF-8'
  }
  dependencies {
    dependency 'org.springframework.boot:spring-boot-starter-web'
    dependency 'org.springframework.boot:spring-boot-configuration-processor', optional: true
    dependency 'org.springframework.boot:spring-boot-starter-test', scope: 'test'
  }
  repositories {
    repository {
      snapshots {
        enabled 'true'
      }
      id 'spring-snapshots'
      name 'Spring Snapshots'
      url 'https://repo.spring.io/snapshot'
    }
    repository {
      snapshots {
        enabled 'false'
      }
      id 'spring-milestones'
      name 'Spring Milestones'
      url 'https://repo.spring.io/milestone'
    }
  }
  pluginRepositories {
    pluginRepository {
      snapshots {
        enabled 'true'
      }
      id 'spring-snapshots'
      name 'Spring Snapshots'
      url 'https://repo.spring.io/snapshot'
    }
    pluginRepository {
      snapshots {
        enabled 'false'
      }
      id 'spring-milestones'
      name 'Spring Milestones'
      url 'https://repo.spring.io/milestone'
    }
  }
  build {
    plugins {
      plugin {
		  groupId 'org.springframework.boot'
		  artifactId 'spring-boot-maven-plugin'
		  configuration {
			executable 'true'
		  }
      }
    }
  }
}
