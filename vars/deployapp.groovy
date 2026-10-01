def call(Map config=[:]){
    def appname=config.get('appname', 'demo-app')
    def port=config.get('port', 3000)
    def environment=config.get ('environment','dev')

    echo 'Starting the app...'

    echo "App Name:${appname}"
    echo "Port:${port}"
    echo "Environment:${environment}"

    echo "Deployment Completed..."
}