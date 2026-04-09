package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private File f6750a;

    public a(File file) {
        this.f6750a = file;
    }

    public abstract InputStream a(File file, String str);

    public final InputStream a(String str) {
        return a(this.f6750a, str);
    }

    public abstract boolean b(File file, String str);

    public final boolean b(String str) {
        return b(this.f6750a, str);
    }
}
