/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.pages.main.conversation.views;

import android.view.View;
import com.waz.api.IConversation;
import com.waz.api.Message;
import com.waz.zclient.ServiceContainer;
import com.waz.zclient.pages.main.conversation.views.row.message.views.TextMessageWithTimestamp;
import com.waz.zclient.utils.OtrDestination;

import java.util.Set;

public interface MessageViewsContainer extends ServiceContainer {
    Set<String> getTimestampShownSet();

    int getUnreadMessageCount();

    IConversation.Type getConversationType();

    void setShownTimestampView(TextMessageWithTimestamp shownTimestampView);

    TextMessageWithTimestamp getShownTimestampView();

    boolean ping(boolean hotKnock, String id, String message, int color);

    boolean isPhone();

    boolean isTornDown();

    void openSpotifySettings();

    void onOpenUrl(String url);

    void openSettings();

    void openDevicesPage(OtrDestination otrDestination, View anchorView);

    boolean onItemLongClick(Message message);
}
