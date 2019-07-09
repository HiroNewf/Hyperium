/*
 *       Copyright (C) 2018-present Hyperium <https://hyperium.cc/>
 *
 *       This program is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published
 *       by the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       This program is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.addons;

import cc.hyperium.addons.bossbar.BossbarAddon;
import cc.hyperium.addons.customcrosshair.CustomCrosshairAddon;
import cc.hyperium.addons.sidebar.SidebarAddon;

public class InternalAddons {

    private final CustomCrosshairAddon customCrosshairAddon;
    private final SidebarAddon sidebarAddon;
    private final BossbarAddon bossbarAddon;

    public InternalAddons() {
        this.customCrosshairAddon = ((CustomCrosshairAddon) new CustomCrosshairAddon().init());
        this.sidebarAddon = ((SidebarAddon) new SidebarAddon().init());
        this.bossbarAddon = ((BossbarAddon) new BossbarAddon().init());
    }

    public CustomCrosshairAddon getCustomCrosshairAddon() {
        return customCrosshairAddon;
    }

    public SidebarAddon getSidebarAddon() {
        return sidebarAddon;
    }

    public BossbarAddon getBossbarAddon() {
        return bossbarAddon;
    }
}
