package com.instagram.common.viewpoint.core;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: assets/audience_network/classes2.dex */
public final class KN {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final String A09;

    public KN(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET);
    }

    public KN(String str, float f10, float f11, int i4, int i10, float f12, float f13, int i11, float f14, int i12) {
        this.A09 = str;
        this.A02 = f10;
        this.A01 = f11;
        this.A06 = i4;
        this.A05 = i10;
        this.A04 = f12;
        this.A00 = f13;
        this.A07 = i11;
        this.A03 = f14;
        this.A08 = i12;
    }
}
