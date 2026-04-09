package com.apm.insight.b;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f3057a;

    /* renamed from: c, reason: collision with root package name */
    private static g f3058c;

    /* renamed from: b, reason: collision with root package name */
    private final b f3059b;

    private f(Context context) {
        this.f3059b = new b(context);
        g gVar = new g();
        f3058c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f3057a == null) {
            synchronized (f.class) {
                try {
                    if (f3057a == null) {
                        f3057a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f3057a;
    }

    public static g b() {
        return f3058c;
    }

    public final void c() {
        this.f3059b.a();
    }

    public final void d() {
        this.f3059b.b();
    }

    public final b a() {
        return this.f3059b;
    }
}
