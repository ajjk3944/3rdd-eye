package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.facebook.ads.redexgen.X.3o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02103o {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public Layout.Alignment A0D;
    public Layout.Alignment A0E;
    public CharSequence A0F;
    public boolean A0G;

    public C02103o() {
        this.A0F = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = LinearLayoutManager.INVALID_OFFSET;
        this.A06 = LinearLayoutManager.INVALID_OFFSET;
        this.A02 = -3.4028235E38f;
        this.A08 = LinearLayoutManager.INVALID_OFFSET;
        this.A09 = LinearLayoutManager.INVALID_OFFSET;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0G = false;
        this.A0B = -16777216;
        this.A0A = LinearLayoutManager.INVALID_OFFSET;
    }

    public C02103o(C1946pT c1946pT) {
        this.A0F = c1946pT.A0F;
        this.A0C = c1946pT.A0C;
        this.A0E = c1946pT.A0E;
        this.A0D = c1946pT.A0D;
        this.A01 = c1946pT.A01;
        this.A07 = c1946pT.A07;
        this.A06 = c1946pT.A06;
        this.A02 = c1946pT.A02;
        this.A08 = c1946pT.A08;
        this.A09 = c1946pT.A09;
        this.A05 = c1946pT.A05;
        this.A04 = c1946pT.A04;
        this.A00 = c1946pT.A00;
        this.A0G = c1946pT.A0G;
        this.A0B = c1946pT.A0B;
        this.A0A = c1946pT.A0A;
        this.A03 = c1946pT.A03;
    }

    @Pure
    public final int A00() {
        return this.A06;
    }

    @Pure
    public final int A01() {
        return this.A08;
    }

    public final C02103o A02() {
        this.A0G = false;
        return this;
    }

    public final C02103o A03(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C02103o A04(float f10) {
        this.A02 = f10;
        return this;
    }

    public final C02103o A05(float f10) {
        this.A03 = f10;
        return this;
    }

    public final C02103o A06(float f10) {
        this.A04 = f10;
        return this;
    }

    public final C02103o A07(float f10, int i4) {
        this.A01 = f10;
        this.A07 = i4;
        return this;
    }

    public final C02103o A08(float f10, int i4) {
        this.A05 = f10;
        this.A09 = i4;
        return this;
    }

    public final C02103o A09(int i4) {
        this.A06 = i4;
        return this;
    }

    public final C02103o A0A(int i4) {
        this.A08 = i4;
        return this;
    }

    public final C02103o A0B(int i4) {
        this.A0A = i4;
        return this;
    }

    public final C02103o A0C(int i4) {
        this.A0B = i4;
        this.A0G = true;
        return this;
    }

    public final C02103o A0D(Bitmap bitmap) {
        this.A0C = bitmap;
        return this;
    }

    public final C02103o A0E(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C02103o A0F(Layout.Alignment alignment) {
        this.A0E = alignment;
        return this;
    }

    public final C02103o A0G(CharSequence charSequence) {
        this.A0F = charSequence;
        return this;
    }

    public final C1946pT A0H() {
        return new C1946pT(this.A0F, this.A0E, this.A0D, this.A0C, this.A01, this.A07, this.A06, this.A02, this.A08, this.A09, this.A05, this.A04, this.A00, this.A0G, this.A0B, this.A0A, this.A03);
    }

    @Pure
    public final CharSequence A0I() {
        return this.A0F;
    }
}
