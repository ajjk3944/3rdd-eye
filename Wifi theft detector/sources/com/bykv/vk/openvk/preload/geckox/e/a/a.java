package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private File f9132a;

    public a(File file) {
        this.f9132a = file;
    }

    public abstract InputStream a(File file, String str) throws IOException;

    public final InputStream a(String str) throws IOException {
        return a(this.f9132a, str);
    }

    public abstract boolean b(File file, String str) throws IOException;

    public final boolean b(String str) throws IOException {
        return b(this.f9132a, str);
    }
}
