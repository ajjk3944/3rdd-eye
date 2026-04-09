package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.iD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306iD extends AbstractRunnableC1412kD {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1412kD
    public final /* synthetic */ void s(Object obj) {
        m((InterfaceFutureC2326a) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1412kD
    public final Object t(Object obj, Object obj2) {
        InterfaceC1736qD interfaceC1736qD = (InterfaceC1736qD) obj;
        InterfaceFutureC2326a interfaceFutureC2326aB = interfaceC1736qD.b(obj2);
        if (interfaceFutureC2326aB != null) {
            return interfaceFutureC2326aB;
        }
        throw new NullPointerException(Cr.E("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1736qD));
    }
}
