package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23366x {
    public static final C3796mL A0E = new C3796mL(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C3796mL A04;
    public final C3796mL A05;
    public final C3786mA A06;
    public final EL A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC3525hX A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C23366x(Timeline timeline, long j4, C3786mA c3786mA, EL el) {
        this(timeline, A0E, j4, -9223372036854775807L, 1, false, c3786mA, el, A0E, j4, j4, j4, EnumC3525hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C23366x(Timeline timeline, C3796mL c3796mL, long j4, long j10, int i, boolean z10, C3786mA c3786mA, EL el, C3796mL c3796mL2, long j11, long j12, long j13) {
        this(timeline, c3796mL, j4, j10, i, z10, c3786mA, el, c3796mL2, j11, j12, j13, EnumC3525hX.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C23366x(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C3796mL c3796mL, long j4, long j10, int i, boolean z10, C3786mA c3786mA, EL el, C3796mL c3796mL2, long j11, long j12, long j13, EnumC3525hX enumC3525hX, boolean z11) {
        this.A03 = timeline;
        this.A05 = c3796mL;
        this.A02 = j4;
        this.A01 = j10;
        this.A0C = j4;
        this.A00 = i;
        this.A0A = z10;
        this.A06 = c3786mA;
        this.A07 = el;
        this.A04 = c3796mL2;
        this.A0B = j11;
        this.A0D = j12;
        this.A0C = j13;
        this.A08 = enumC3525hX;
        this.A09 = z11;
    }

    public static void A00(C23366x c23366x, C23366x c23366x2) {
        c23366x2.A0C = c23366x.A0C;
        c23366x2.A0B = c23366x.A0B;
        c23366x2.A0D = c23366x.A0D;
    }

    public final C23366x A01(int i) {
        C23366x c23366x = new C23366x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23366x);
        return c23366x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C23366x A02(int i, EnumC3525hX enumC3525hX, boolean z10) {
        C23366x c23366x = new C23366x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC3525hX, z10);
        A00(this, c23366x);
        return c23366x;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C23366x A03(int i, boolean z10) {
        C23366x c23366x = new C23366x(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z10);
        A00(this, c23366x);
        return c23366x;
    }

    public final C23366x A04(Timeline timeline) {
        C23366x c23366x = new C23366x(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23366x);
        return c23366x;
    }

    public final C23366x A05(C3796mL c3796mL) {
        return new C23366x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c3796mL, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C23366x A06(C3796mL c3796mL, long j4, long j10, long j11) {
        long j12 = j10;
        Timeline timeline = this.A03;
        if (!c3796mL.A00()) {
            j12 = -9223372036854775807L;
        }
        return new C23366x(timeline, c3796mL, j4, j12, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j11, j4);
    }

    public final C23366x A07(C3786mA c3786mA, EL el) {
        C23366x c23366x = new C23366x(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c3786mA, el, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23366x);
        return c23366x;
    }

    public final C23366x A08(boolean z10) {
        C23366x c23366x = new C23366x(this.A03, this.A05, this.A02, this.A01, this.A00, z10, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23366x);
        return c23366x;
    }
}
