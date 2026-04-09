package com.monetization.ads.mediation.banner;

import b9.l;
import c9.C2078B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MediatedBannerSize {
    private final int height;
    private final int width;

    public MediatedBannerSize(int i, int i10) {
        this.width = i;
        this.height = i10;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final Map<String, Integer> toSizeData() {
        return C2078B.o(new l("width", Integer.valueOf(this.width)), new l("height", Integer.valueOf(this.height)));
    }
}
