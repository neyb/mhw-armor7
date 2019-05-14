package armor7.core

import sun.font.Decoration

data class Set(
    val armorSet: ArmorSet,
    val decorations: List<Decoration>
) {
    fun withHead(head: Armor) = copy(armorSet = armorSet.copy(head = head))
}

data class Decoration(val skill: Skill, val size: Int)

data class ArmorSet(
    val head: Armor,
    val body: Armor,
    val waist: Armor,
    val legs: Armor,
    val feet: Armor,
    val necklace: Armor
)

data class Armor(
    val defenses: Defenses,
    val skills: List<Skill>,
    val slots: List<Slot>
)

data class Skill(val name: String)

data class Slot(val size: Int)

data class Defenses(
    val basic: Int,
    val augmented: Int,
    val transcended: Int
)