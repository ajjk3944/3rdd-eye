package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.6o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06666o extends E8 {
    public final /* synthetic */ C06586g A00;

    public C06666o(C06586g c06586g) {
        this.A00 = c06586g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e92) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1371Yx(this));
    }
}
