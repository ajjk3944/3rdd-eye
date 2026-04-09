package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC0848Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0848Eh<T extends AbstractC0848Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2374qI A02;
    public final C2337pg A03;

    public abstract int A08();

    public abstract boolean A09(T t10);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0848Eh(int i10, C2337pg c2337pg, int i11) {
        this.A00 = i10;
        this.A03 = c2337pg;
        this.A01 = i11;
        this.A02 = c2337pg.A08(i11);
    }
}
