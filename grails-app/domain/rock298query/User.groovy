package rock298query

class User {
    String name
    static hasMany = [files: PlayerFile]
}
