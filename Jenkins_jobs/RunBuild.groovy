@Library('RHTAP_Jenkins') _
 

node {
    stage('Demo') {
        def rhtap = new RHTAP_Jenkins();
        rhtap.init()
    }
}
