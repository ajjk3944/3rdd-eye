package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C1606ji A01;
    public final AbstractC1601jd A02;
    public final C1436gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C0742Ow A07;
    public final AbstractC0736Oq A08;
    public final AbstractC1380fo A09;
    public final C1381fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Z2(C1436gi c1436gi, VA va2, C0842Sx c0842Sx, WeakReference<Z1> weakReference, int i4, int i10, int i11, int i12, C1606ji c1606ji, String str) {
        super(c1436gi);
        this.A06 = new Y2();
        this.A03 = c1436gi;
        this.A04 = va2;
        this.A01 = c1606ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC1601jd abstractC1601jdA0F = this.A01.A0F();
        if (abstractC1601jdA0F == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i4, i12, i10, i11);
        LinearLayout linearLayout = new LinearLayout(c1436gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c0842Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(abstractC1601jdA0F);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = (byte) ((bArrCopyOfRange[i12] - i11) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i12] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C0742Ow A02(AbstractC1601jd abstractC1601jd) {
        C0694Na c0694NaA00;
        NR nrA29 = abstractC1601jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i4, int i10, int i11) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
                int i12 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i12 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 4);
                    i12++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0977Yh
            public final void A4j(String str) {
                P2.A00(this.A00.A03).A07(new Intent(str + A00(0, 1, 92) + this.A00.A0B));
            }
        };
        if (getOrientation() == 1) {
            c0694NaA00 = abstractC1601jd.A28().A01();
        } else {
            NN nnA28 = abstractC1601jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            c0694NaA00 = nnA28.A00();
        }
        C0742Ow c0742Ow = new C0742Ow(this.A03, A0F, c0694NaA00, nrA29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC1601jd.A2A());
        c0742Ow.setInfo(nrA29.A0I(), nrA29.A0J(), this.A01.A7O(), abstractC1601jd.A2C().A01(), null, null);
        if (C0886Up.A1N(this.A03)) {
            c0742Ow.A0k();
        }
        return c0742Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC0736Oq A04(C0842Sx c0842Sx) {
        final ViewOnClickListenerC0995Yz viewOnClickListenerC0995Yz = new ViewOnClickListenerC0995Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c0842Sx, this.A01) && videoUrl != null) {
            C02806g videoView = new C02806g(this.A03, this.A04, c0842Sx, this.A05, viewOnClickListenerC0995Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C0886Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C0898Vb c0898VbA0H = this.A01.A0H();
        if (c0898VbA0H == null) {
            return null;
        }
        final C1436gi c1436gi = this.A03;
        final VI vi2 = this.A05;
        final AbstractC1601jd abstractC1601jd = this.A02;
        C02906q c02906qA0I = new AbstractC0736Oq(c1436gi, viewOnClickListenerC0995Yz, vi2, abstractC1601jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C1089b5 A00;

            {
                super(c1436gi, viewOnClickListenerC0995Yz, vi2, abstractC1601jd);
                this.A00 = new C1089b5(c1436gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0736Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0736Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC0736Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C02906q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C0737Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0736Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(c0898VbA0H.getUrl());
        if (C0886Up.A1P(this.A03)) {
            setViewAsCTA(c02906qA0I);
        }
        return c02906qA0I;
    }

    private C0721Ob A06() {
        return new C0721Ob(this);
    }

    private C1381fp A07(int i4, int i10, int i11, int i12) {
        C1381fp c1381fp = new C1381fp(this, i4, i10, true, new WeakReference(this.A09), this.A03);
        c1381fp.A0W(i11);
        c1381fp.A0X(i12);
        return c1381fp;
    }

    private void A0C() throws SecurityException {
        String strA0M = this.A01.A0M();
        if (!TextUtils.isEmpty(strA0M)) {
            X6 x62 = new X6();
            C1436gi c1436gi = this.A03;
            Uri uriA00 = XB.A00(strA0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x62, c1436gi, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() throws SecurityException {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC0727Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC0999Zd abstractC0999ZdA01 = AbstractC1000Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (abstractC0999ZdA01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(abstractC0999ZdA01, new FrameLayout.LayoutParams(-1, -1));
        abstractC0999ZdA01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C0842Sx c0842Sx, C1606ji c1606ji) {
        String strA0e = c1606ji.A0e();
        if (TextUtils.isEmpty(strA0e)) {
            return false;
        }
        String videoUrl = c0842Sx.A0T(strA0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC0736Oq abstractC0736Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0736Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C1381fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
