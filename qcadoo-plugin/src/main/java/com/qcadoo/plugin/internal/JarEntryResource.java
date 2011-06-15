/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo Framework
 * Version: 0.4.2
 *
 * This file is part of Qcadoo.
 *
 * Qcadoo is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */
package com.qcadoo.plugin.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.core.io.InputStreamResource;

import com.google.common.base.Preconditions;

public final class JarEntryResource extends InputStreamResource {

    /**
     * Original URL, used for actual access.
     */
    private final URL url;

    public JarEntryResource(final File file, final InputStream inputStream) throws MalformedURLException {
        super(inputStream, "URL and inputStream for jar entry [" + file.getAbsolutePath() + "]");
        Preconditions.checkNotNull(file, "file should not be null");
        this.url = file.toURI().toURL();
    }

    /**
     * This implementation returns the underlying URL reference.
     */
    @Override
    public URL getURL() throws IOException {
        return this.url;
    }

    @Override
    public boolean equals(final Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
