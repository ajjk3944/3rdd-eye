package com.apm.insight.b;

import android.content.Context;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f6004a;

    /* renamed from: c, reason: collision with root package name */
    private static g f6005c;

    /* renamed from: b, reason: collision with root package name */
    private final b f6006b;

    private f(Context context) {
        this.f6006b = new b(context);
        g gVar = new g();
        f6005c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f6004a == null) {
            synchronized (f.class) {
                try {
                    if (f6004a == null) {
                        f6004a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f6004a;
    }

    public static g b() {
        return f6005c;
    }

    public final void c() {
        this.f6006b.a();
    }

    public final void d() {
        this.f6006b.b();
    }

    public final b a() {
        return this.f6006b;
    }
}
