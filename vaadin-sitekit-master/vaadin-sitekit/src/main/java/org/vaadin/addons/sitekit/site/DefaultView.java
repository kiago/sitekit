/**
 * Copyright 2013 Tommi S.E. Laukkanen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.addons.sitekit.site;

import com.vaadin.ui.AbstractComponent;

import java.io.IOException;

/**
 * Fixed width implementation of PageWindow.
 * @author Tommi S.E. Laukkanen
 */
public final class DefaultView extends AbstractCustomView {
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    /**
     * The default portal window.
     */
    public DefaultView() throws IOException {
        super(DefaultView.class.getResourceAsStream("/VAADIN/themes/sitekit/layouts/default.html"));
        setImmediate(true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void initializeComponents() {

        final AbstractComponent logoComponent = getComponent("logo");
        addComponent(logoComponent, "logo");

        final AbstractComponent navigationComponent = getComponent("navigation");
        addComponent(navigationComponent, "navigation");

        final AbstractComponent profileComponent = getComponent("profile");
        addComponent(profileComponent, "profile");

        final AbstractComponent contentComponent = getComponent("content");
        addComponent(contentComponent, "content");

        final AbstractComponent footerComponent = getComponent("footer");
        addComponent(footerComponent, "footer");
    }


}