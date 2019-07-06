package rock298query

import grails.gorm.services.Service

@Service(User)
interface UserService {
    User save(String name)
    User save(User user)

    User find(String name)
}
