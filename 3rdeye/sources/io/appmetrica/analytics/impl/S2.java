package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class S2 {

    /* renamed from: a, reason: collision with root package name */
    public final Of f40083a;

    /* renamed from: b, reason: collision with root package name */
    public final Xa f40084b;

    public S2(Of of, Xa xa) {
        this.f40083a = of;
        this.f40084b = xa;
    }

    public final boolean a(C4683i6 c4683i6, R2 r22) {
        Iterator it = ((C4815n9) this.f40083a.a(c4683i6.f41047d)).f41305a.iterator();
        while (it.hasNext()) {
            if (r22.a(it.next(), c4683i6)) {
                return true;
            }
        }
        return false;
    }

    public final Of b() {
        return this.f40083a;
    }

    public final Xa a() {
        return this.f40084b;
    }
}
