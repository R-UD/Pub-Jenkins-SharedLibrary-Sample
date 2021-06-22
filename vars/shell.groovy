
def call(String arg) {
    if (isUnix()) {
        // linux agent
        sh arg
    } else {
        // windows agent
        bat arg
    }
}
