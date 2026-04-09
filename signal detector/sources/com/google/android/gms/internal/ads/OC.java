package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final class OC extends QC {
    @Override // com.google.android.gms.internal.ads.QC
    public final /* synthetic */ void s(Object obj) {
        m((InterfaceFutureC2326a) obj);
    }

    @Override // com.google.android.gms.internal.ads.QC
    public final Object t(Object obj, Throwable th) {
        InterfaceC1736qD interfaceC1736qD = (InterfaceC1736qD) obj;
        InterfaceFutureC2326a interfaceFutureC2326aB = interfaceC1736qD.b(th);
        if (interfaceFutureC2326aB != null) {
            return interfaceFutureC2326aB;
        }
        throw new NullPointerException(Cr.E("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC1736qD));
    }
}
