package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03579n extends AbstractC1851nv implements DI {
    public long A00;
    public InterfaceC02675t A01;
    public InterfaceC1677ku<InterfaceExecutorC0490Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C1985q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C03579n(C1985q7 c1985q7, C5Y c5y, DC dc, A6 a62, FF ff2, int i4, InterfaceC1677ku<InterfaceExecutorC0490Fb> interfaceC1677ku) {
        this.A07 = (AnonymousClass32) AbstractC02203y.A01(c1985q7.A03);
        this.A08 = c1985q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a62 == null ? A6.A00 : a62;
        this.A0C = ff2;
        this.A06 = i4;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC1677ku;
    }

    private void A00() {
        final Timeline c03569m = new C03569m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c03569m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C1963pl A0I(int i4, C1963pl c1963pl, boolean z3) {
                    super.A0I(i4, c1963pl, z3);
                    c1963pl.A05 = true;
                    return c1963pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C1961pj A0L(int i4, C1961pj c1961pj, long j) {
                    super.A0L(i4, c1961pj, j);
                    c1961pj.A0F = true;
                    return c1961pj;
                }
            };
            c03569m = timeline;
        }
        A05(c03569m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1851nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1851nv
    public final void A0A(InterfaceC02675t interfaceC02675t) {
        this.A01 = interfaceC02675t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC02203y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC1845np A5W(C1844no c1844no, F0 f02, long j) {
        InterfaceExecutorC0490Fb interfaceExecutorC0490Fb;
        InterfaceC1932pF interfaceC1932pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC1932pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD ddA5X = this.A0B.A5X(C8O.A03);
        A6 a62 = this.A0A;
        A1 a1A01 = A01(c1844no);
        FF ff2 = this.A0C;
        D8 d8A02 = A02(c1844no);
        String str = this.A07.A04;
        int i4 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0490Fb = this.A02.get();
        } else {
            interfaceExecutorC0490Fb = null;
        }
        return new C03599p(uri, interfaceC1932pFA5I, ddA5X, a62, a1A01, ff2, d8A02, this, f02, str, i4, interfaceExecutorC0490Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
    public final void AG0(long j, boolean z3, boolean z10) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z3 && this.A03 == z10) {
            return;
        }
        this.A00 = j;
        this.A05 = z3;
        this.A03 = z10;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    public final void AHk(InterfaceC1845np interfaceC1845np) {
        ((C03599p) interfaceC1845np).A0a();
    }
}
