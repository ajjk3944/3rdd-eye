package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2800Pn implements Runnable {
    public final /* synthetic */ C23226j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC2800Pn(C23226j c23226j, ArrayList arrayList) {
        this.A00 = c23226j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C2809Pw c2809Pw = (C2809Pw) it.next();
            this.A00.A0e(c2809Pw.A04, c2809Pw.A00, c2809Pw.A01, c2809Pw.A02, c2809Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
