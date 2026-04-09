package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hp implements ca, t8.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11934a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11935b;

    public /* synthetic */ hp(Object obj) {
        this.f11934a = obj;
    }

    public b8.a a() {
        if (((b8.a) this.f11935b) == null) {
            synchronized (this) {
                try {
                    if (((b8.a) this.f11935b) == null) {
                        File cacheDir = ((b8.e) ((o7.d) this.f11934a).f30421b).f2078a.getCacheDir();
                        b8.d dVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            dVar = new b8.d();
                            dVar.f2076d = new y4.a(8);
                            dVar.f2075c = file;
                            dVar.f2073a = 262144000L;
                            dVar.f2074b = new yb.i(8);
                        }
                        this.f11935b = dVar;
                    }
                    if (((b8.a) this.f11935b) == null) {
                        this.f11935b = new ed.f(5);
                    }
                } finally {
                }
            }
        }
        return (b8.a) this.f11935b;
    }

    @Override // t8.g
    public Object get() {
        if (this.f11935b == null) {
            synchronized (this) {
                try {
                    if (this.f11935b == null) {
                        Object obj = ((t8.g) this.f11934a).get();
                        t8.f.c(obj, "Argument must not be null");
                        this.f11935b = obj;
                    }
                } finally {
                }
            }
        }
        return this.f11935b;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    @Override // com.google.android.gms.internal.ads.ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.fa l(com.google.android.gms.internal.ads.ha r15) throws com.google.android.gms.internal.ads.ka {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hp.l(com.google.android.gms.internal.ads.ha):com.google.android.gms.internal.ads.fa");
    }

    public hp() {
        this.f11934a = new CopyOnWriteArraySet();
    }
}
