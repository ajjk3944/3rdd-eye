package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.4p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C22764p extends DV {
    public final /* synthetic */ C22744n A00;

    public C22764p(C22744n c22744n) {
        this.A00 = c22744n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3198c8(this));
    }
}
