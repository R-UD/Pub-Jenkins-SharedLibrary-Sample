package home.rud.sample

class Hello implements Serializable {
    def pipeline

    Hello (def pipeline) {
        this.pipeline = pipeline
    }

    def printMessage(String msg) {
        println(msg)
    }

    def printMesageByEcho(String msg) {
        //pipeline.echo(msg);
        println("test" + msg)
    }

    def printEnv() {
        println("env.BUILD_DISPLAY_NAME:" + pipeline.env.BUILD_DISPLAY_NAME)
        pipeline.sh("printenv")
    }
}