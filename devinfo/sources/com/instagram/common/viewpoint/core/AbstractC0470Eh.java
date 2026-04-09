package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC0470Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0470Eh<T extends AbstractC0470Eh<T>> {
    public final int A00;
    public final int A01;
    public final C1996qI A02;
    public final C1959pg A03;

    public abstract int A08();

    public abstract boolean A09(T t10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0470Eh(int i4, C1959pg c1959pg, int i10) {
        this.A00 = i4;
        this.A03 = c1959pg;
        this.A01 = i10;
        this.A02 = c1959pg.A08(i10);
    }
}
