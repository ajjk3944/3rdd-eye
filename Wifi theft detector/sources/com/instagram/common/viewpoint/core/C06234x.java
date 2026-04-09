package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06234x extends AbstractC0901Gj {
    public static byte[] A07;
    public static String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC1527c3 A00;
    public DZ A01;
    public final ImageView A02;
    public final InterfaceC1182Rk A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    static {
        A07();
    }

    public C06234x(C1814gi c1814gi, ZU zu, VA va, AbstractC1979jd abstractC1979jd, C1220Sx c1220Sx, InterfaceC1355Yh interfaceC1355Yh) {
        super(c1814gi, zu, va, abstractC1979jd, c1220Sx, interfaceC1355Yh);
        this.A03 = new C0894Gc(this);
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A02 = new ImageView(getContext());
        if (abstractC1979jd.A29().A0H().A04() > 0) {
            this.A01 = new DZ(c1814gi, abstractC1979jd.A29().A0H().A04() * 1000);
        }
        this.A02.setScaleType(ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new LM(this.A02, super.A05).A05(super.A03.A29().A0H().A00(), super.A03.A29().A0H().A01()).A06(new C0893Gb(this)).A07(super.A03.A29().A0H().A08());
    }

    private AbstractC1527c3 A01(int i10) throws SecurityException {
        if (this.A02.getParent() != null) {
            YB.A0J(this.A02);
        }
        C1530c6 c1530c6A0M = new C1530c6(super.A05, super.A06, this.A0A, super.A03, this.A02, this.A0C, this.A08).A0J(this.A09.getToolbarHeight()).A0P(this.A09).A0I(i10).A0M(this.A07);
        if (this.A01 != null) {
            c1530c6A0M.A0R(this.A01);
        }
        c1530c6A0M.A0L(C1067Mu.A00(super.A05, super.A06, A03(0, 0, 52), XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C1531c7 params = c1530c6A0M.A0U();
        return AbstractC1528c4.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(int r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            com.instagram.common.viewpoint.core.YB.A0J(r0)
            com.facebook.ads.redexgen.X.c3 r0 = r7.A01(r8)
            r7.A00 = r0
            com.facebook.ads.redexgen.X.c3 r1 = r7.A00
            com.facebook.ads.redexgen.X.Gd r0 = new com.facebook.ads.redexgen.X.Gd
            r0.<init>()
            r1.setAccidentalClickCappingListener(r0)
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            com.facebook.ads.redexgen.X.Na r5 = r0.getColors()
            java.lang.Integer r0 = r7.getBackgroundColorForToolbar()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L55
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            if (r0 == 0) goto L7a
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            boolean r0 = r0.A1O()
            if (r0 != 0) goto L53
            com.facebook.ads.redexgen.X.c3 r6 = r7.A00
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C06234x.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L43
        L3d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L43:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06234x.A08
            java.lang.String r1 = "fKHhGKaWmtnLqlWg01lC"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "lG6mBbCbmu9ZuvMubYOS"
            r0 = 5
            r2[r0] = r1
            boolean r0 = r6 instanceof com.instagram.common.viewpoint.core.AbstractC0995Ka
            if (r0 == 0) goto L7a
        L53:
            r0 = 1
            goto L7b
        L55:
            int r6 = r0.intValue()
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06234x.A08
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L6f
            com.instagram.common.viewpoint.core.YB.A0N(r7, r6)
            goto L82
        L6f:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06234x.A08
            java.lang.String r1 = "OBMiQo8I4Ts7yjqshk6bkpwsmCqa0sTm"
            r0 = 0
            r2[r0] = r1
            com.instagram.common.viewpoint.core.YB.A0N(r7, r6)
            goto L82
        L7a:
            r0 = 0
        L7b:
            int r0 = r5.A08(r0)
            com.instagram.common.viewpoint.core.YB.A0N(r7, r0)
        L82:
            com.facebook.ads.redexgen.X.Yb r6 = r7.A09
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06234x.A08
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L97
            goto L3d
        L97:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C06234x.A08
            java.lang.String r1 = "a7i0pPPxGgijq0ih0stJ"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "yYRdNfPwhLNXT50Mgldr"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            boolean r0 = r0.A1O()
            r6.setFullscreen(r0)
            com.facebook.ads.redexgen.X.Yb r1 = r7.A09
            com.facebook.ads.redexgen.X.jd r0 = r7.A03
            boolean r0 = com.instagram.common.viewpoint.core.ViewOnClickListenerC1012Kr.A05(r0)
            r1.A0D(r5, r0)
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            r7.A0j(r0)
            android.view.ViewGroup r0 = r7.A01
            if (r0 == 0) goto Lc7
            android.view.ViewGroup r1 = r7.A01
            android.widget.RelativeLayout$LayoutParams r0 = com.instagram.common.viewpoint.core.AbstractC0901Gj.A0H
            r7.addView(r1, r3, r0)
        Lc7:
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            if (r0 == 0) goto Ld7
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            boolean r0 = r0.A1O()
            if (r0 == 0) goto Ld7
        Ld3:
            r7.setUpFullscreenMode(r4)
            return
        Ld7:
            r4 = 0
            goto Ld3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C06234x.A08(int):void");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj
    public final AbstractC1349Yb A0c() {
        AbstractC1349Yb abstractC1349YbA0c = super.A0c();
        if (super.A03.A2T()) {
            abstractC1349YbA0c.setOnClickListener(new ViewOnClickListenerC1635dn(this));
        }
        return abstractC1349YbA0c;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj
    public final void A0g() {
        if (this.A00 != null) {
            this.A07.A04(VH.A0Y, null);
            EnumC1063Mq enumC1063MqA1B = this.A00.A1B(A03(0, 4, 63));
            if (super.A03.A2N()) {
                return;
            }
            EnumC1063Mq actionOutcome = EnumC1063Mq.A09;
            if (enumC1063MqA1B != actionOutcome) {
                EnumC1063Mq actionOutcome2 = EnumC1063Mq.A06;
                if (enumC1063MqA1B != actionOutcome2) {
                    A0f();
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj
    public final void A0h() {
        YB.A0L(this.A00);
        YB.A0L(this.A09);
        this.A04.set(true);
        A06();
        int iA04 = super.A03.A29().A0H().A04();
        int secondsForNextCta = super.A03.A29().A0H().A02();
        if (iA04 > 0) {
            if (this.A00 != null) {
                this.A00.A1G();
            }
            A0i(iA04, new C0892Ga(this), this.A01);
            if (secondsForNextCta == 0 || secondsForNextCta >= iA04) {
                super.A02 = true;
                this.A09.setToolbarActionMode(8);
                return;
            } else {
                if (secondsForNextCta <= 0) {
                    return;
                }
                this.A09.setProgressSpinnerInvisible(true);
                A0i(secondsForNextCta, new GZ(this), null);
                return;
            }
        }
        this.A06.set(true);
        AbstractC1349Yb abstractC1349Yb = this.A09;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC1349Yb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj
    public final void A0k(C1176Re c1176Re) {
        FrameLayout.LayoutParams layoutParams;
        c1176Re.A0A(this.A03);
        int orientation = c1176Re.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        if (A0m()) {
            YB.A0J(this.A09);
        }
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = this.A09.getRequestedMargins();
            if (requestedMargins == null) {
                layoutParams.setMargins(0, XV.A0r, 0, 0);
            } else {
                int i10 = requestedMargins.left;
                int i11 = requestedMargins.top;
                int i12 = requestedMargins.right;
                int i13 = requestedMargins.bottom;
                if (A08[4].length() != 3) {
                    throw new RuntimeException();
                }
                A08[0] = "j24x2xTHwZJixq019qlFmxSWfXtsmamW";
                layoutParams.setMargins(i10, i11, i12, i13);
            }
        } else {
            int orientation2 = this.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation2);
        }
        addView(this.A09, layoutParams);
        YB.A0H(this.A00);
        YB.A0H(this.A09);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj
    public final boolean A0l() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC1527c3 abstractC1527c3 = this.A00;
        if (A08[4].length() != 3) {
            throw new RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC1527c3.A1P(false);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj
    public final boolean A0m() {
        return super.A03.A1j() || super.A03.A1y();
    }

    public final /* synthetic */ void A0n() {
        A0f();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void AFA(boolean z10) {
        if (this.A00 != null) {
            this.A00.A1L(z10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void AFi(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A29().A0T() && !A0m()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0901Gj, com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void onDestroy() {
        if (C1264Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A02);
        }
        if (this.A00 != null) {
            AbstractC1527c3 abstractC1527c3 = this.A00;
            String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC1527c3.A1C();
        }
        super.onDestroy();
    }
}
