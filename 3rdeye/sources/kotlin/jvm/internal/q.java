package kotlin.jvm.internal;

import w9.InterfaceC5747b;
import w9.InterfaceC5752g;

/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes3.dex */
public class q extends s implements InterfaceC5752g {
    public q(Class cls, String str, String str2, int i) {
        super(c.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // w9.InterfaceC5752g
    public final void c() {
        ((InterfaceC5752g) getReflected()).c();
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC5747b computeReflected() {
        x.f43661a.getClass();
        return this;
    }

    @Override // w9.InterfaceC5752g
    public Object get(Object obj) {
        c();
        throw null;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
