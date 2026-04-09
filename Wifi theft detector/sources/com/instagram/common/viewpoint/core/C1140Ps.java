package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.database.DataSetObserver;

/* renamed from: com.facebook.ads.redexgen.X.Ps, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1140Ps extends DataSetObserver {
    public final /* synthetic */ Pv A00;

    public C1140Ps(Pv pv) {
        this.A00 = pv;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws Resources.NotFoundException {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws Resources.NotFoundException {
        this.A00.A0e();
    }
}
