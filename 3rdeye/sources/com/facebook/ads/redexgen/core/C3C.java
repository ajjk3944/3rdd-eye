package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C {
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

    public C3C() {
        this.A0F = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = RecyclerView.UNDEFINED_DURATION;
        this.A06 = RecyclerView.UNDEFINED_DURATION;
        this.A02 = -3.4028235E38f;
        this.A08 = RecyclerView.UNDEFINED_DURATION;
        this.A09 = RecyclerView.UNDEFINED_DURATION;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0G = false;
        this.A0B = -16777216;
        this.A0A = RecyclerView.UNDEFINED_DURATION;
    }

    public C3C(C3900o2 c3900o2) {
        this.A0F = c3900o2.A0F;
        this.A0C = c3900o2.A0C;
        this.A0E = c3900o2.A0E;
        this.A0D = c3900o2.A0D;
        this.A01 = c3900o2.A01;
        this.A07 = c3900o2.A07;
        this.A06 = c3900o2.A06;
        this.A02 = c3900o2.A02;
        this.A08 = c3900o2.A08;
        this.A09 = c3900o2.A09;
        this.A05 = c3900o2.A05;
        this.A04 = c3900o2.A04;
        this.A00 = c3900o2.A00;
        this.A0G = c3900o2.A0G;
        this.A0B = c3900o2.A0B;
        this.A0A = c3900o2.A0A;
        this.A03 = c3900o2.A03;
    }

    @Pure
    public final int A00() {
        return this.A06;
    }

    @Pure
    public final int A01() {
        return this.A08;
    }

    public final C3C A02() {
        this.A0G = false;
        return this;
    }

    public final C3C A03(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C3C A04(float f10) {
        this.A02 = f10;
        return this;
    }

    public final C3C A05(float f10) {
        this.A03 = f10;
        return this;
    }

    public final C3C A06(float f10) {
        this.A04 = f10;
        return this;
    }

    public final C3C A07(float f10, int i) {
        this.A01 = f10;
        this.A07 = i;
        return this;
    }

    public final C3C A08(float f10, int i) {
        this.A05 = f10;
        this.A09 = i;
        return this;
    }

    public final C3C A09(int i) {
        this.A06 = i;
        return this;
    }

    public final C3C A0A(int i) {
        this.A08 = i;
        return this;
    }

    public final C3C A0B(int i) {
        this.A0A = i;
        return this;
    }

    public final C3C A0C(int i) {
        this.A0B = i;
        this.A0G = true;
        return this;
    }

    public final C3C A0D(Bitmap bitmap) {
        this.A0C = bitmap;
        return this;
    }

    public final C3C A0E(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C3C A0F(Layout.Alignment alignment) {
        this.A0E = alignment;
        return this;
    }

    public final C3C A0G(CharSequence charSequence) {
        this.A0F = charSequence;
        return this;
    }

    public final C3900o2 A0H() {
        return new C3900o2(this.A0F, this.A0E, this.A0D, this.A0C, this.A01, this.A07, this.A06, this.A02, this.A08, this.A09, this.A05, this.A04, this.A00, this.A0G, this.A0B, this.A0A, this.A03);
    }

    @Pure
    public final CharSequence A0I() {
        return this.A0F;
    }
}
