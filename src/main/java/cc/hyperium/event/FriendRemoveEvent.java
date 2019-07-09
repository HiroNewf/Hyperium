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

package cc.hyperium.event;

import com.google.common.base.Preconditions;
import org.jetbrains.annotations.NotNull;

public final class FriendRemoveEvent extends Event {

    @NotNull
    private final String fullName;
    @NotNull
    private final String name;

    public FriendRemoveEvent(@NotNull String fullName, @NotNull String name) {
        Preconditions.checkNotNull(fullName, "fullName");
        Preconditions.checkNotNull(name, "name");

        this.fullName = fullName;
        this.name = name;
    }

    @NotNull
    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
