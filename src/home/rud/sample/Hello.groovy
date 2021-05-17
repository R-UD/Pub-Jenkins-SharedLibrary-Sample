package home.rud.sample

calss Hello implements Serializable {
    def pipeline

    Hello (pipeline) {
        this.pipeline = pipeline
    }

    def printMessage(String msg) {
        println(msg)
    }

    def printMesageByEcho(String msg) {
        pipeline.echo(msg);
    }

    def printEnv() {
        println("env.BUILD_DISPLAY_NAME:" + pipeline.env.BUILD_DISPLAY_NAME)
        pipeline.sh("printenv")
    }
}