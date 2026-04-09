package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C22513q extends NI {
    public static byte[] A0F;
    public static String[] A0G = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC3547hy A03;
    public SF A04;
    public C21660h A05;
    public C3085aJ A06;
    public FH A07;
    public AbstractC3344eW A08;
    public C3345eX A09;
    public String A0A;
    public List<C3239cn> A0B;
    public boolean A0C;
    public final C3272dL A0D;
    public final XH A0E;

    public static String A0C(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, 18, 5, 23, 1, 18, 4, 5, 4, 54, 9, 4, 5, 15, 33, 4, 36, 1, 20, 1, 34, 21, 14, 4, 12, 5, 118, 110, 108, 117};
    }

    static {
        A0E();
        A0H = (int) (AbstractC2975Wl.A02 * 48.0f);
        A0I = (int) (AbstractC2975Wl.A02 * 8.0f);
        A0J = (int) (AbstractC2975Wl.A02 * 8.0f);
        A0L = (int) (AbstractC2975Wl.A02 * 56.0f);
        A0K = (int) (AbstractC2975Wl.A02 * 12.0f);
    }

    public C22513q(C3272dL c3272dL, US us, SF sf, InterfaceC3003Xn interfaceC3003Xn, AnonymousClass73 anonymousClass73) {
        super(c3272dL, us, interfaceC3003Xn, anonymousClass73);
        this.A0E = new XH();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new C3269dI(c3272dL, new LX(), super.A0A.A1A(), interfaceC3003Xn);
        this.A04 = sf;
        this.A0D = c3272dL;
    }

    public C22513q(C3272dL c3272dL, US us, SF sf, InterfaceC3003Xn interfaceC3003Xn, AnonymousClass77 anonymousClass77) {
        super(c3272dL, us, interfaceC3003Xn, anonymousClass77);
        this.A0E = new XH();
        this.A0C = false;
        this.A04 = sf;
        this.A0D = c3272dL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.ads.redexgen.core.ME A01(java.lang.String r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.ME r5 = com.facebook.ads.redexgen.core.ME.A09
            com.facebook.ads.redexgen.X.0h r0 = r6.A05
            if (r0 != 0) goto L7
            return r5
        L7:
            com.facebook.ads.redexgen.X.0h r4 = r6.A05
            com.facebook.ads.redexgen.X.0h r0 = r6.A05
            com.facebook.ads.redexgen.X.gI r3 = r0.getLayoutManager()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C22513q.A0G
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L91
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C22513q.A0G
            java.lang.String r1 = "E32f1TaBN4dkj3FL0vDfikWnsbqL7SKY"
            r0 = 2
            r2[r0] = r1
            int r0 = r3.A25()
            com.facebook.ads.redexgen.X.Qg r3 = r4.A1G(r0)
            com.facebook.ads.redexgen.X.Ev r3 = (com.facebook.ads.redexgen.core.C2526Ev) r3
            if (r3 == 0) goto L7d
            com.facebook.ads.redexgen.X.KE r0 = r3.A0p()
            if (r0 == 0) goto L7d
            com.facebook.ads.redexgen.X.KE r0 = r3.A0p()
            com.facebook.ads.redexgen.X.ME r5 = r0.A0E(r7)
            com.facebook.ads.redexgen.X.KE r0 = r3.A0p()
            com.facebook.ads.redexgen.X.a5 r4 = r0.getCtaActionHelper()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C22513q.A0G
            r0 = 2
            r1 = r1[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L7e
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C22513q.A0G
            java.lang.String r1 = "i7TFLIHedh0buU6tWLTqbZ60SXZT8zmg"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DCWE7AKb21kTTjPuFVubbU6pDlTglIBY"
            r0 = 6
            r2[r0] = r1
            com.facebook.ads.redexgen.X.MF r0 = r4.A06()
            if (r0 != 0) goto L7d
        L6d:
            com.facebook.ads.redexgen.X.KE r0 = r3.A0p()
            com.facebook.ads.redexgen.X.a5 r1 = r0.getCtaActionHelper()
            com.facebook.ads.redexgen.X.F2 r0 = new com.facebook.ads.redexgen.X.F2
            r0.<init>(r6)
            r1.A07(r0)
        L7d:
            return r5
        L7e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C22513q.A0G
            java.lang.String r1 = "dI26cUvsILIVYWhCptAOIe9hx0G02LwU"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "KP2PoUq36ksxZ0HlOf60WIRRhVJwRZXP"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.MF r0 = r4.A06()
            if (r0 != 0) goto L7d
            goto L6d
        L91:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C22513q.A01(java.lang.String):com.facebook.ads.redexgen.X.ME");
    }

    private AbstractC3547hy A02(Intent intent) {
        if (super.A07) {
            return (AbstractC3547hy) intent.getSerializableExtra(A0C(14, 25, 103));
        }
        return (AbstractC3547hy) intent.getSerializableExtra(A0C(0, 14, 36));
    }

    private final void A0F() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0G[3].charAt(5) != 'n') {
                throw new RuntimeException();
            }
            A0G[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1S();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0G(int i, Bundle bundle) throws IllegalStateException {
        int extraSpacing;
        int i10;
        int height;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i11 = AbstractC2975Wl.A04.widthPixels;
        int i12 = AbstractC2975Wl.A04.heightPixels;
        if (i == 1) {
            extraSpacing = Math.min(i11 - (A0I * 4), i12 / 2);
            i10 = (i11 - extraSpacing) / 8;
            height = i10 * 4;
        } else {
            extraSpacing = i12 - ((A0L + A0H) + (A0I * 4));
            i10 = A0I;
            height = i10 * 2;
        }
        this.A08 = new F3(this);
        this.A09 = new C3345eX(this, 1, new WeakReference(this.A08), this.A0D);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new C21660h(this.A0D);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new FH(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i10;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new F4(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, super.A0E));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i == 1) {
            A0I(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (U7.A1u(this.A0D)) {
            this.A0D.A0B().AK2(this.A05, super.A0A.A25(), false);
        }
        A0Y(this.A02, false, i);
    }

    private void A0H(AbstractC3547hy abstractC3547hy) {
        this.A03 = abstractC3547hy;
        this.A0A = this.A03.A25();
        this.A00 = this.A03.A0i();
        this.A01 = this.A03.A0j();
        List<C2726Mp> listA27 = this.A03.A27();
        List<AdInfo> adInfoList = new ArrayList<>(listA27.size());
        this.A0B = adInfoList;
        for (int i = 0; i < listA27.size(); i++) {
            C2726Mp c2726Mp = listA27.get(i);
            List<C3239cn> list = this.A0B;
            int i10 = listA27.size();
            list.add(new C3239cn(i, i10, c2726Mp));
        }
    }

    private void A0I(FH fh) throws IllegalStateException {
        new C23206h().A0G(this.A05);
        fh.A0Y(new F1(this));
        this.A06 = new C3085aJ(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.NI
    public final void A0W() {
        ME meA01 = A01(A0C(39, 4, 2));
        if (super.A0A.A2D()) {
            return;
        }
        ME actionOutcome = ME.A09;
        if (meA01 != actionOutcome) {
            ME actionOutcome2 = ME.A06;
            if (meA01 != actionOutcome2) {
                A0f();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.NI
    public final boolean A0e() {
        return false;
    }

    public final void A0f() {
        if (super.A0E.getToolbarActionMode() == 8) {
            super.A0E.setToolbarActionMode(2);
        }
        super.A0A.A2B(false);
        super.A0A.A20().A0M(-1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) throws IllegalStateException {
        AbstractC3547hy dataBundle = A02(intent);
        A0Z(r02);
        A0H(dataBundle);
        A0G(r02.A05().getResources().getConfiguration().orientation, bundle);
        r02.A0A(new F0(this, r02));
        AbstractC3547hy dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A20().A0H().A04();
        if (super.A07) {
            AbstractC3547hy dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A20().A0H().A03();
        }
        if (unskippableSec > 0) {
            A0X(unskippableSec);
        }
        AbstractC3547hy dataBundle4 = super.A0A;
        if (dataBundle4.A20().A0H().A02() >= 0) {
            super.A0E.setToolbarActionMode(8);
        }
        AbstractC3547hy dataBundle5 = super.A0A;
        if (dataBundle5.A2K()) {
            super.A0E.setOnClickListener(new ViewOnClickListenerC3242cq(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.NI, com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AEV(boolean z10) {
        super.AEV(z10);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.NI, com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AF0(boolean z10) {
        super.AF0(z10);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AIB(Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NI
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.NI, android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws IllegalStateException {
        Bundle bundle = new Bundle();
        AIB(bundle);
        A0F();
        A0G(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.core.NI, com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void onDestroy() {
        super.onDestroy();
        if (U7.A1u(this.A0D)) {
            this.A0D.A0B().AJj(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.AAt(this.A0A, new C3057Zp().A03(this.A09).A02(this.A0E).A05());
        }
        A0F();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
