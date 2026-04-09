package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class M6 extends LinearLayout implements InterfaceC1079av {
    public static byte[] A0E;
    public static String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final Uri A0L;
    public static final View.OnTouchListener A0M;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public C1071an A05;
    public InterfaceC1078au A06;
    public String A07;
    public final WebView A08;
    public final C1436gi A09;
    public final InterfaceC1075ar A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public static String A06(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, 18, -114, -73, -70, -66, -80, -22, 19, 22, 27, 5, 22, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, 14, 13, -45, -5, 5, -6, 7, 4, 23, 36, 26, 40, 37, 31, 26, -28, 31, 36, 42, 27, 36, 42, -28, 23, 25, 42, 31, 37, 36, -28, 12, -1, -5, 13, 18, 30, 28, -35, 16, 29, 19, 33, 30, 24, 19, -35, 18, 23, 33, 30, 28, 20, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0I = Color.rgb(224, 224, 224);
        A0L = XB.A00(A06(90, 23, 25));
        A0M = new ViewOnTouchListenerC1060ac();
        A0K = Color.argb(34, 0, 0, 0);
        A0G = XV.A0P;
        A0H = XV.A0I;
        A0J = XV.A0A;
    }

    public M6(C1436gi c1436gi, WebView webView) {
        this(c1436gi, webView, false, false);
    }

    public M6(C1436gi c1436gi, WebView webView, boolean z3, boolean z10) {
        super(c1436gi);
        this.A0A = new M7(this);
        this.A08 = webView;
        this.A09 = c1436gi;
        this.A0B = AbstractC0887Uq.A06(c1436gi);
        this.A0D = z3;
        this.A0C = z10;
        A08();
        if (z10) {
            A0C(false);
        }
    }

    private void A08() {
        float f10;
        YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0G, A0G);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(YN.A01(YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0M);
        this.A01.setOnClickListener(new ViewOnClickListenerC1061ad(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !C0886Up.A2w(this.A09)) {
            this.A00 = new ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            ViewGroup.LayoutParams backButtonParams = new LinearLayout.LayoutParams(A0G, A0G);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
            this.A00.setOnTouchListener(A0M);
            this.A00.setOnClickListener(new ViewOnClickListenerC1062ae(this));
            addView(this.A00, backButtonParams);
        }
        this.A05 = new C1071an(this.A09);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0B || C0886Up.A2w(this.A09)) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        layoutParams2.weight = f10;
        this.A05.setGravity(17);
        if (C0886Up.A2w(this.A09) && !this.A0D) {
            this.A04 = new LinearLayout(this.A09);
            this.A04.setOrientation(1);
            this.A04.setPadding(0, A0J, 0, A0J);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A09);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(YN.A01(YM.HANDLER));
            imageView.setPadding(0, A0H, 0, A0H);
            LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(imageView, closeButtonParams);
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A05, titleViewsParams);
        } else {
            addView(this.A05, layoutParams2);
        }
        if (this.A0B && !C0886Up.A2w(this.A09)) {
            this.A02 = new ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            ViewGroup.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(A0G, A0G);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(YN.A02(YM.BACK_ARROW));
            this.A02.setOnTouchListener(A0M);
            this.A02.setOnClickListener(new ViewOnClickListenerC1063af(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A09);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0G, A0G);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0M);
        this.A03.setOnClickListener(new ViewOnClickListenerC1064ag(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09() {
        /*
            r7 = this;
            r3 = 0
            com.facebook.ads.redexgen.X.gi r0 = r7.A09
            boolean r6 = com.instagram.common.viewpoint.core.C0886Up.A0k(r0)
            r4 = 0
            if (r6 != 0) goto L36
            com.facebook.ads.redexgen.X.gi r0 = r7.A09
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            if (r5 == 0) goto L36
            r2 = 46
            r1 = 26
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r2 = A06(r2, r1, r0)
            android.net.Uri r0 = com.instagram.common.viewpoint.core.M6.A0L
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 65536(0x10000, float:9.1835E-41)
            java.util.List r5 = r5.queryIntentActivities(r1, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L4f
            android.widget.ImageView r1 = r7.A03
            r0 = 8
            r1.setVisibility(r0)
        L36:
            com.facebook.ads.redexgen.X.gi r0 = r7.A09
            boolean r0 = com.instagram.common.viewpoint.core.C0886Up.A2w(r0)
            if (r0 != 0) goto L40
            if (r6 == 0) goto L49
        L40:
            android.widget.ImageView r0 = r7.A03
            r0.setVisibility(r4)
            android.graphics.Bitmap r3 = r7.getExternalBrowserBitmap()
        L49:
            android.widget.ImageView r0 = r7.A03
            r0.setImageBitmap(r3)
            return
        L4f:
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto Ld1
            java.lang.Object r3 = r5.get(r4)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.M6.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L74
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L74:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.M6.A0F
            java.lang.String r1 = "Y9G9nX"
            r0 = 6
            r2[r0] = r1
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            if (r0 == 0) goto Ld1
            java.lang.Object r3 = r5.get(r4)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.M6.A0F
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto Lba
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.M6.A0F
            java.lang.String r1 = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "kBU630hheaj535sYoezwG0Sk33mkxVnX"
            r0 = 3
            r2[r0] = r1
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            java.lang.String r3 = r0.packageName
            r2 = 72
            r1 = 18
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld1
        Lb2:
            com.facebook.ads.redexgen.X.YM r0 = com.instagram.common.viewpoint.core.YM.BROWSER_LAUNCH_CHROME
            android.graphics.Bitmap r3 = com.instagram.common.viewpoint.core.YN.A01(r0)
            goto L36
        Lba:
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            java.lang.String r3 = r0.packageName
            r2 = 72
            r1 = 18
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld1
            goto Lb2
        Ld1:
            android.graphics.Bitmap r3 = r7.getExternalBrowserBitmap()
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.M6.A09():void");
    }

    private void A0C(boolean z3) {
        int i4 = z3 ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0F[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0F[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i4);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z3) {
        if (z3) {
            A0C(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1079av
    public InterfaceC1075ar getBrowserNavigationListener() {
        return this.A0A;
    }

    private Bitmap getExternalBrowserBitmap() {
        if (this.A0C) {
            return YN.A01(YM.BROWSER_LAUNCH_NATIVE_V2);
        }
        return YN.A01(YM.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i4) {
        this.A01.setVisibility(i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1079av
    public void setListener(InterfaceC1078au interfaceC1078au) {
        this.A06 = interfaceC1078au;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1079av
    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1079av
    public void setUrl(String str) throws SecurityException {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0I, PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }
}
