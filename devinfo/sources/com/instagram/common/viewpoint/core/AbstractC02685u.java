package com.instagram.common.viewpoint.core;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.5u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC02685u {
    public int A00;

    public final void A00(int i4) {
        this.A00 |= i4;
    }

    public final void A01(int i4) {
        this.A00 &= ~i4;
    }

    public final void A02(int i4) {
        this.A00 = i4;
    }

    public final boolean A03() {
        return A09(268435456);
    }

    public final boolean A04() {
        return A09(LinearLayoutManager.INVALID_OFFSET);
    }

    public final boolean A05() {
        return A09(4);
    }

    public final boolean A06() {
        return A09(134217728);
    }

    public final boolean A07() {
        return A09(1);
    }

    @MetaExoPlayerCustomization("Add method to determine if we are at the last sample")
    public final boolean A08() {
        return A09(536870912);
    }

    public final boolean A09(int i4) {
        return (this.A00 & i4) == i4;
    }

    public void A0A() {
        this.A00 = 0;
    }
}
