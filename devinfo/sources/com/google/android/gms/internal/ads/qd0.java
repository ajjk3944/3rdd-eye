package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qd0 {

    /* renamed from: a, reason: collision with root package name */
    public final ud0 f15315a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f15316b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15317c;

    public qd0(ud0 ud0Var, ex exVar) {
        this.f15315a = ud0Var;
        ud0Var.getClass();
        this.f15317c = new HashMap(ud0Var.f17174a);
        this.f15316b = exVar;
    }

    public final rt a() {
        rt rtVar = new rt(this);
        ((ConcurrentHashMap) rtVar.f15753b).putAll(this.f15317c);
        return rtVar;
    }

    public final void b() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Rc)).booleanValue()) {
            rt rtVarA = a();
            rtVarA.u("action", "pecr");
            rtVarA.v();
        }
    }
}
