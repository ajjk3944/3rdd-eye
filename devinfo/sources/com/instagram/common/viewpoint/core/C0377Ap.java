package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0377Ap implements InterfaceC2040rI {
    public final /* synthetic */ C0376Ao A00;

    public C0377Ap(C0376Ao c0376Ao) {
        this.A00 = c0376Ao;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2040rI
    public final void AFq() {
        ArrayList arrayList;
        synchronized (this.A00.A06) {
            arrayList = new ArrayList(this.A00.A06.size());
            for (Runnable runnable : this.A00.A06.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A06.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A01 != null) {
            this.A00.A01.AFq();
        }
    }
}
