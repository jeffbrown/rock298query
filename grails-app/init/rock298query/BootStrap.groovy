package rock298query

class BootStrap {

    UserService userService
    PlayerFileService playerFileService

    def init = { servletContext ->
        def jeff = userService.save('Jeff')
        def jake = userService.save('Jake')

        jeff.addToFiles(new PlayerFile(playersJson: '{"title":"Jeff File 1"'))
        jeff.addToFiles(new PlayerFile(playersJson: '{"title":"Jeff File 2"'))
        jeff.addToFiles(new PlayerFile(playersJson: '{"title":"Jeff File 3"'))

        userService.save jeff

        jake.addToFiles(new PlayerFile(playersJson: '{"title":"Jake File 1"'))
        jake.addToFiles(new PlayerFile(playersJson: '{"title":"Jake File 2"'))
        jake.addToFiles(new PlayerFile(playersJson: '{"title":"Jake File 3"'))

        userService.save jake

    }
    def destroy = {
    }
}
