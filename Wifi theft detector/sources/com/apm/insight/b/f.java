package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f4819a;

    /* renamed from: c, reason: collision with root package name */
    private static g f4820c;

    /* renamed from: b, reason: collision with root package name */
    private final b f4821b;

    private f(@NonNull Context context) {
        this.f4821b = new b(context);
        g gVar = new g();
        f4820c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f4819a == null) {
            synchronized (f.class) {
                try {
                    if (f4819a == null) {
                        f4819a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f4819a;
    }

    public static g b() {
        return f4820c;
    }

    public final void c() {
        this.f4821b.a();
    }

    public final void d() {
        this.f4821b.b();
    }

    public final b a() {
        return this.f4821b;
    }
}
