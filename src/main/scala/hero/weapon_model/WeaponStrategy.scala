package hero.weapon_model

import hero.heros_model.Hero

trait WeaponStrategy {
    def cick(defender: Hero):Unit
}
