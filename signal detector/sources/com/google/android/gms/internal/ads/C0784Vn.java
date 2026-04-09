package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.Executor;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784Vn {

    /* renamed from: a, reason: collision with root package name */
    public final C0852Zn f12083a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f12084b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12085c;

    public C0784Vn(C0852Zn c0852Zn, C0623Mf c0623Mf) {
        this.f12083a = c0852Zn;
        c0852Zn.getClass();
        this.f12085c = new HashMap(c0852Zn.f12958a);
        this.f12084b = c0623Mf;
    }

    public final C0697Ql a() {
        C0697Ql c0697Ql = new C0697Ql(this);
        ((ConcurrentHashMap) c0697Ql.f10691b).putAll(this.f12085c);
        return c0697Ql;
    }

    public final void b() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Pc)).booleanValue()) {
            C0697Ql c0697QlA = a();
            c0697QlA.r("action", "pecr");
            c0697QlA.s();
        }
    }
}
