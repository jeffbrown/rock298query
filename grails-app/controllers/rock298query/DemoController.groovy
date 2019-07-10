package rock298query

class DemoController {

    PlayerFileService playerFileService
    UserService userService

    def jakeFiles() {
        def jake = userService.find('Jake')

        def files = playerFileService.listByOwner(jake)

        render files*.playersJson
    }

    def jeffFiles() {
        def jeff = userService.find('Jeff')

        def files = playerFileService.listByOwner(jeff)

        render files*.playersJson
    }
}
