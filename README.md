# rhtap-jenkins shared library 

## Files
### API Functions (rhtap.groovy)

| Function   |      Description |
| --- | --- | 
|  init () |  run the Init stage of a pipeline  |  
| buildah_rhtap() |   run a container build and create SBOM     |    
| acs_deploy_check() | use ACS to check deployment yaml  |       
| acs_image_check() |  use ACS to validate image |       
| acs_image_scan() | use ACS to scan image |       
| update_deployment() | update the gitops repository - used to deploy build application  |       
| show_sbom_rhdh() | show SBOM between eyecatches  SBOM_EYECATHER_BEGIN/END |       
| summary() | print a summary of the pipeline results |     

    
 
## How-to

### Setup
[Here](https://jenkins.io/doc/book/pipeline/shared-libraries/) are the instructions on how to add the library to Jenkins
This library can also be loaded dynamically directly from the git url in your `Jenkinsfile`
```
library identifier: 'RHTAP_Jenkins@main', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'https://github.com/jduimovich/rhtap-jenkins.git'])
```

### Usage
You can install a shared library into the global shared library pool, and load that libary with the following  ```@Library('RHTAP_Jenkins') _``` to import the API.
 