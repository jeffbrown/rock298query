package rock298query

import grails.gorm.services.Service

@Service(PlayerFile)
interface PlayerFileService {
    PlayerFile get(Serializable id)
    List<PlayerFile> list(Map args)
    Long count()
    void delete(Serializable id)
    PlayerFile save(PlayerFile playerFile)

    List<PlayerFile> findByOwner(User owner)
}
