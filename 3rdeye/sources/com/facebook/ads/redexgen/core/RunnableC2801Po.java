package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2801Po implements Runnable {
    public final /* synthetic */ C23226j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC2801Po(C23226j c23226j, ArrayList arrayList) {
        this.A00 = c23226j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C2808Pv change = (C2808Pv) it.next();
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
