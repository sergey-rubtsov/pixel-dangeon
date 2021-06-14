/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.watabou.pixeldungeon.items.food;

import com.watabou.noosa.Game;
import com.watabou.pixeldungeon.R;
import com.watabou.pixeldungeon.actors.buffs.Hunger;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;

public class OverpricedRation extends Food {

    {
        name = Game.instance.getString(R.string.overpriced_food_ration);
        image = ItemSpriteSheet.OVERPRICED;
        energy = Hunger.STARVING - Hunger.HUNGRY;
        message = Game.instance.getString(R.string.That_food_tasted_ok);
    }

    @Override
    public String info() {
        return Game.instance.getString(R.string.It_looks_exactly_like_a_standard_ration_of_food_but_smaller);
    }

    @Override
    public int price() {
        return 20 * quantity;
    }
}
