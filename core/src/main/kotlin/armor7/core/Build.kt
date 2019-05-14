package armor7.core

import sun.font.Decoration

data class Build(
    val necklace: Armor? = null,
    val armorSet: ArmorSet,
    val decorations: List<Decoration> = listOf()
) {
}

data class Decoration(val skill: Skill, val size: Int)

enum class Part {
    head, trunk, waist, legs, feet
}

data class ArmorSet(
    val head: Armor? = null,
    val trunk: Armor? = null,
    val waist: Armor? = null,
    val legs: Armor? = null,
    val feet: Armor? = null)

data class Armor(
    val part: Part,
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