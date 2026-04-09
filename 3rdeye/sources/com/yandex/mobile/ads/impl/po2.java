package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.tn2;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class po2 implements do2, tn2.a {

    /* renamed from: f, reason: collision with root package name */
    private static po2 f31858f;

    /* renamed from: a, reason: collision with root package name */
    private float f31859a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final mo2 f31860b;

    /* renamed from: c, reason: collision with root package name */
    private final sn2 f31861c;

    /* renamed from: d, reason: collision with root package name */
    private ho2 f31862d;

    /* renamed from: e, reason: collision with root package name */
    private jn2 f31863e;

    public po2(mo2 mo2Var, sn2 sn2Var) {
        this.f31860b = mo2Var;
        this.f31861c = sn2Var;
    }

    public static po2 a() {
        if (f31858f == null) {
            f31858f = new po2(new mo2(), new sn2());
        }
        return f31858f;
    }

    public final void b() {
        tn2.a().a(this);
        tn2.a().b();
        t62.g().getClass();
        t62.a();
        this.f31862d.a();
    }

    public final void c() {
        t62.g().b();
        tn2.a().c();
        this.f31862d.b();
    }

    public final float d() {
        return this.f31859a;
    }

    public final void a(float f10) {
        this.f31859a = f10;
        if (this.f31863e == null) {
            this.f31863e = jn2.a();
        }
        Iterator<in2> it = this.f31863e.c().iterator();
        while (it.hasNext()) {
            it.next().j().a(f10);
        }
    }

    public final void a(Context context) {
        this.f31861c.getClass();
        qn2 qn2Var = new qn2();
        mo2 mo2Var = this.f31860b;
        Handler handler = new Handler();
        mo2Var.getClass();
        this.f31862d = new ho2(handler, context, qn2Var, this);
    }
}
