fun main(){
    //Make a variable (Int) that holds the player's score, is added to whenever answer is right (score)
    //Use printlns to ask the user a question
    //Make a val that holds the correct answer, as well as a variable that is the player's answer
    //Use .compareTo to compare the player's answer with the correct one, I made it ignore case but still formatted the answers anyways
    //If the answers match, add one to score
    //Print results at the end
    var score = 0
    println("Pokemon Emerald Quiz!")
    println("Question One: What type of berry is only found on Mirage Island?")
    val ans1 = "Liechi"
    var userAns1 = readLine()!!.toLowerCase().capitalize()
    var result1 = userAns1.compareTo(ans1, true)
    if (result1 == 0) {
        score++
        println("Correct!")
    } else{
        score + 0
        println("Incorrect. The Liechi berry is only found on Mirage Island.")
    }
    println("\n")
    println("Question Two: What Pokemon in the Hoenn region is found in the location 'Island Cave?'")
    val ans2 = "Regice"
    var userAns2 = readLine()!!.toLowerCase().capitalize()
    var result2 = userAns2.compareTo(ans2, true)
    if (result2 == 0) {
        score++
        println("Correct!")
    } else {
        score + 0
        println("Incorrect. Regice is found in the Island Cave")
    }
    println("\n")
    println("Question Three: Pokemon Emerald players are restricted from trading Pokemon with copies \nof Pokemon FireRed/LeafGreen, Colosseum and XD: Gale of Darkness until they obtain \nthe National Dex: True or False?")
    val ans3 = "False"
    var userAns3 = readLine()!!.toLowerCase().capitalize()
    var result3 = userAns3.compareTo(ans3, true)
    if (result3 == 0){
        score++
        println("Correct!")
        println("You either had a luck guess or you really know your stuff!")
    } else {
        score + 0
        println("Incorrect. Emerald introduced trading restrictions for when the player only owns the \nHoenn Dex and not the National. However, Colosseum is the odd exception, and can trade\nPokemon not appearing on the Hoenn Dex.")
    }
    println("\n")
    println("Question Four: Game designer and composer, Junichi Masuda, added an NPC to Pokemon Ruby, \nSapphire and Emerald in Sootopolis City who gives the player up to two berries a day. \nShe is named after Masuda's daughter, born shortly before the release of Ruby and Sapphire. \nWhat is her name?")
    val ans4 = "Kiri"
    var userAns4 = readLine()!!.toLowerCase().capitalize()
    var result4 = userAns4.compareTo(ans4, true)
    if (result4 == 0){
        score++
        println("Correct!")
        println("I can't believe you remembered that.")
    } else {
        score + 0
        println("Incorrect. Her name is Kiri.")
    }
    println("\n")
    println("Final Question: Which Pokemon introduced in Ruby/Sapphire/Emerald has a gender difference \nwhere the only change is that the males have a speck on their butt?")
    val ans5 = "Torchic"
    var userAns5 = readLine()!!.toLowerCase().capitalize()
    var result5 = userAns5.compareTo(ans5, true)
    if (result5 == 0){
        score++
        println("Correct!")
    } else {
        score + 0
        println("Incorrect. It's Torchic!")
    }
    println("Your score is $score/5")
}
