package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ah1;

/* loaded from: classes3.dex */
public abstract class sj<T> implements ah1.b, lo {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33087a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<T> f33088b;

    /* renamed from: c, reason: collision with root package name */
    private final ah1 f33089c;

    public /* synthetic */ sj(Context context, a8 a8Var) {
        this(context, a8Var, ah1.f24667h.a(context));
    }

    @Override // com.yandex.mobile.ads.impl.lo
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public void c() {
        b();
        getClass().toString();
        fp0.d(new Object[0]);
    }

    public final a8<T> d() {
        return this.f33088b;
    }

    public final Context e() {
        return this.f33087a;
    }

    public final boolean f() {
        return !this.f33089c.b();
    }

    public final void g() {
        getClass().toString();
        fp0.d(new Object[0]);
        this.f33089c.a(this);
    }

    public final void h() {
        getClass().toString();
        fp0.d(new Object[0]);
        this.f33089c.b(this);
    }

    public sj(Context context, a8<T> adResponse, ah1 phoneStateTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(phoneStateTracker, "phoneStateTracker");
        this.f33087a = context;
        this.f33088b = adResponse;
        this.f33089c = phoneStateTracker;
    }
}
