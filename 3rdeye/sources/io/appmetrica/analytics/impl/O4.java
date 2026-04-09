package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class O4 extends Nd {

    /* renamed from: f, reason: collision with root package name */
    public final Object f39921f;

    public O4(int i, String str, Object obj, InterfaceC4804mo interfaceC4804mo, W2 w22) {
        super(i, str, interfaceC4804mo, w22);
        this.f39921f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Nd, io.appmetrica.analytics.impl.Yn
    public final void a(Xn xn) {
        if (f()) {
            W2 w22 = this.f39899d;
            int i = this.f39897b;
            Zn znA = w22.a(xn, (Zn) ((HashMap) xn.f40399a.get(i)).get(this.f39896a), this);
            if (znA != null) {
                a(znA);
            }
        }
    }

    public abstract void a(Zn zn);

    public final Object g() {
        return this.f39921f;
    }
}
