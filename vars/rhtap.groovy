
// vars/get_resource_dir.groovy
import groovy.transform.SourceURI
import java.nio.file.Path
import java.nio.file.Paths

class ScriptSourceUri {
    @SourceURI
    static URI uri
}

def call() {
    Path scriptLocation = Paths.get(ScriptSourceUri.uri)
    return scriptLocation.getParent().getParent().resolve('resources').toString()
}

def info(message) {
    echo "INFO: ${message}" 
}

def init( ) { 
   
    sh "pwd"
    echo " "  
    sh "ls -al " 
    echo " "  
    sh "ls -al .." 
    echo " " 
    sh "ls -al ../.." 
}  

