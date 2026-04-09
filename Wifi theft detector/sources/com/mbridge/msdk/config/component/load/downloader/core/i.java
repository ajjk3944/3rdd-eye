package com.mbridge.msdk.config.component.load.downloader.core;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private j f13454a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final i f13455a = new i();
    }

    public static i b() {
        return b.f13455a;
    }

    public void a(int i10) {
        this.f13454a = new com.mbridge.msdk.config.component.load.downloader.core.a(i10);
    }

    private i() {
    }

    public j a() {
        if (this.f13454a == null) {
            this.f13454a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.f13454a;
    }
}
