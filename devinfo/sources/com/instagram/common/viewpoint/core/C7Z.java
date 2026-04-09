package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7Z {
    public static final C1844no A0E = new C1844no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C1844no A04;
    public final C1844no A05;
    public final C1826nW A06;
    public final C0486Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC1562ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C7Z(Timeline timeline, long j, C1826nW c1826nW, C0486Ex c0486Ex) {
        this(timeline, A0E, j, -9223372036854775807L, 1, false, c1826nW, c0486Ex, A0E, j, j, j, EnumC1562ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C7Z(Timeline timeline, C1844no c1844no, long j, long j8, int i4, boolean z3, C1826nW c1826nW, C0486Ex c0486Ex, C1844no c1844no2, long j9, long j10, long j11) {
        this(timeline, c1844no, j, j8, i4, z3, c1826nW, c0486Ex, c1844no2, j9, j10, j11, EnumC1562ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C7Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C1844no c1844no, long j, long j8, int i4, boolean z3, C1826nW c1826nW, C0486Ex c0486Ex, C1844no c1844no2, long j9, long j10, long j11, EnumC1562ir enumC1562ir, boolean z10) {
        this.A03 = timeline;
        this.A05 = c1844no;
        this.A02 = j;
        this.A01 = j8;
        this.A0C = j;
        this.A00 = i4;
        this.A0A = z3;
        this.A06 = c1826nW;
        this.A07 = c0486Ex;
        this.A04 = c1844no2;
        this.A0B = j9;
        this.A0D = j10;
        this.A0C = j11;
        this.A08 = enumC1562ir;
        this.A09 = z10;
    }

    public static void A00(C7Z c7z, C7Z c7z2) {
        c7z2.A0C = c7z.A0C;
        c7z2.A0B = c7z.A0B;
        c7z2.A0D = c7z.A0D;
    }

    public final C7Z A01(int i4) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i4, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C7Z A02(int i4, EnumC1562ir enumC1562ir, boolean z3) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i4, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC1562ir, z3);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C7Z A03(int i4, boolean z3) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i4, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z3);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A04(Timeline timeline) {
        C7Z c7z = new C7Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A05(C1844no c1844no) {
        return new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c1844no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C7Z A06(C1844no c1844no, long j, long j8, long j9) {
        long j10 = j8;
        Timeline timeline = this.A03;
        if (!c1844no.A00()) {
            j10 = -9223372036854775807L;
        }
        return new C7Z(timeline, c1844no, j, j10, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j9, j);
    }

    public final C7Z A07(C1826nW c1826nW, C0486Ex c0486Ex) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c1826nW, c0486Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A08(boolean z3) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, z3, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }
}
