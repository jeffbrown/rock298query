package rock298query

class PlayerFile {
    String playersJson
    Date dateCreated
    Date lastUpdated

    static belongsTo = [owner: User]

    User owner

    static constraints = {
        playersJson sqlType: 'text', nullable: false, widget: 'textarea'
        owner nullable: false, editable: false
    }
}
