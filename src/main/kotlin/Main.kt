import model.Position
import parser.CsvParser
import resolver.Resolver

fun main(args: Array<String>) {
    val players = CsvParser.parse("src/main/resources/fakePlayers.csv")
//    print(players)
    val defender = players.find { it.position == Position.DEFENDER }
    print(defender?.name)
    val resolver = Resolver(players)
    print(resolver.getBestScorerDefender())
    print(resolver.getTheExpensiveGermanPlayerPosition())

}