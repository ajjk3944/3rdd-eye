package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13538a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final g f13539a = new g();
    }

    public static g a() {
        return b.f13539a;
    }

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    private g() {
        this.f13538a = false;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public boolean b() {
        return this.f13538a;
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b<?> bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public void a(f fVar) {
        if (this.f13538a) {
            return;
        }
        l.c().a(fVar);
        i.b().a(fVar.e());
        com.mbridge.msdk.config.component.load.downloader.core.f.a().c();
        this.f13538a = true;
    }
}
