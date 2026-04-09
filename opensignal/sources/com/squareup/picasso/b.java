package com.squareup.picasso;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f5869a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f5870b;

    /* renamed from: c, reason: collision with root package name */
    public final a f5871c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5872d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5873e;

    /* renamed from: f, reason: collision with root package name */
    public final b f5874f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5875g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5876h;

    public b(f0 f0Var, Object obj, k0 k0Var, int i10, String str) {
        this.f5869a = f0Var;
        this.f5870b = k0Var;
        this.f5871c = obj == null ? null : new a(this, obj, f0Var.f5896i);
        this.f5872d = i10;
        this.f5873e = str;
        this.f5874f = this;
    }

    public void a() {
        this.f5876h = true;
    }

    public abstract void b(Bitmap bitmap, c0 c0Var);

    public abstract void c();

    public final Object d() {
        a aVar = this.f5871c;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }
}
