package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jw0;

/* loaded from: classes3.dex */
public abstract class s52 {

    /* renamed from: a, reason: collision with root package name */
    private a f32877a;

    /* renamed from: b, reason: collision with root package name */
    private pi f32878b;

    public interface a {
        void a();
    }

    public abstract t52 a(to1[] to1VarArr, m52 m52Var, jw0.b bVar, v42 v42Var) throws h60;

    public void a(ih ihVar) {
    }

    public abstract void a(Object obj);

    public final void b() {
        a aVar = this.f32877a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean c() {
        return this instanceof n00;
    }

    public void d() {
        this.f32877a = null;
        this.f32878b = null;
    }

    public final pi a() {
        pi piVar = this.f32878b;
        if (piVar != null) {
            return piVar;
        }
        throw new IllegalStateException();
    }

    public final void a(a aVar, pi piVar) {
        this.f32877a = aVar;
        this.f32878b = piVar;
    }
}
