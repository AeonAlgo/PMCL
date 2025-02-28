/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2021  huangyuhui <huanghongxun2008@126.com> and contributors
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.ui.main;

import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import org.jackhuang.hmcl.ui.FXUtils;
import org.jackhuang.hmcl.ui.construct.ComponentList;
import org.jackhuang.hmcl.ui.construct.IconedTwoLineListItem;
import org.jackhuang.hmcl.ui.construct.SpinnerPane;

import static org.jackhuang.hmcl.util.i18n.I18n.i18n;

public class FeedbackPage extends SpinnerPane {

    public FeedbackPage() {
        VBox content = new VBox();
        content.setPadding(new Insets(10));
        content.setSpacing(10);
        content.setFillWidth(true);
        ScrollPane scrollPane = new ScrollPane(content);
        scrollPane.setFitToWidth(true);
        FXUtils.smoothScrolling(scrollPane);
        setContent(scrollPane);

        ComponentList community = new ComponentList();
        {
            IconedTwoLineListItem users = new IconedTwoLineListItem();
            users.setImage(FXUtils.newBuiltinImage("/assets/img/icon.png"));
            users.setTitle(i18n("feedback.qq_group"));
            users.setSubtitle(i18n("feedback.qq_group.statement"));
            users.setExternalLink("https://afdian.net/a/loooo");

            IconedTwoLineListItem github = new IconedTwoLineListItem();
            github.setImage(FXUtils.newBuiltinImage("/assets/img/github.png"));
            github.setTitle(i18n("feedback.github"));
            github.setSubtitle(i18n("feedback.github.statement"));
            github.setExternalLink("https://github.com/xqzi/PMCL/issues/new");

            community.getContent().setAll(users, github);
        }

        content.getChildren().addAll(
                ComponentList.createComponentListTitle(i18n("feedback.channel")),
                community);

        this.setContent(content);
    }

}
