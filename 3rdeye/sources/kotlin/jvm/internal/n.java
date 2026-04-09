package kotlin.jvm.internal;

import w9.InterfaceC5747b;
import w9.InterfaceC5751f;

/* compiled from: MutablePropertyReference1Impl.java */
/* loaded from: classes3.dex */
public final class n extends s implements InterfaceC5751f {
    public n(Class cls, String str, String str2) {
        super(c.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // w9.InterfaceC5752g
    public final void c() {
        ((InterfaceC5751f) getReflected()).c();
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC5747b computeReflected() {
        x.f43661a.getClass();
        return this;
    }

    @Override // w9.InterfaceC5752g
    public final Object get(Object obj) {
        throw null;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        c();
        throw null;
    }
}
