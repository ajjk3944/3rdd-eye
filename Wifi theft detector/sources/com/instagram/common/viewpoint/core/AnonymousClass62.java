package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass62 extends FrameLayout implements InterfaceC0961Is {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C1759fp A00;
    public final int A01;
    public final AbstractC1979jd A02;
    public final C1814gi A03;
    public final VA A04;
    public final Y2 A05;
    public final InterfaceC1587d1 A06;
    public final C1598dC A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, 24, 28, 31, 43, 58, 55, 59, 48, 61, 59, 16, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, Flags.CD, 14, 4, 12, 56, 20, 8, 18, 21, 4, 2, 90, 85, 64, 93, 66, 81, 117, 80, 112, 85, 64, 85, 118, 65, 90, 80, 88, 81, 27, 29, Flags.CD, 28, 13, 2, 7, 13, 5, 22, 9, 5, 23, 52, 25, 16, 5};
    }

    static {
        A02();
    }

    public AnonymousClass62(C1814gi c1814gi, VA va, InterfaceC1587d1 interfaceC1587d1, AbstractC1979jd abstractC1979jd, String str, int i10, Y2 y22) throws JSONException {
        super(c1814gi);
        this.A03 = c1814gi;
        this.A04 = va;
        this.A02 = abstractC1979jd;
        this.A08 = str;
        this.A06 = interfaceC1587d1;
        this.A01 = i10;
        C1598dC preloadedDynamicWebViewController = AbstractC1599dD.A02(abstractC1979jd.A1D());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C1598dC(this.A03, abstractC1979jd, va, i10);
            AbstractC1599dD.A03(abstractC1979jd, this.A07);
            this.A09 = false;
        }
        if (y22 != null) {
            this.A05 = y22;
            this.A07.A0Z(y22);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new JJ(this));
        this.A07.A0a(interfaceC1587d1);
        EnumC1324Xc.A04(this, EnumC1324Xc.A0B);
        if (C1264Up.A1z(c1814gi)) {
            c1814gi.A0B().AKp(this.A07.A0O(), abstractC1979jd.A2E(), false, false, true);
        }
        A04();
    }

    private final void A03() throws JSONException {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A66();
            this.A07.A0X();
        } else {
            this.A03.A0F().A67();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ADm(this);
                    }
                    if (C1264Up.A1z(this.A03)) {
                        VM vmA0B = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        vmA0B.ADb();
                    }
                } else {
                    AKD();
                }
            }
        }
        A08();
    }

    private final void A04() throws JSONException {
        C1598dC.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC1979jd abstractC1979jd) {
        intent.putExtra(A01(157, 8, 110), WK.A07);
        intent.putExtra(A01(130, 18, 58), abstractC1979jd);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC1979jd abstractC1979jd) {
        AdActivityIntent adActivityIntentA05 = C1318Wu.A05(this.A03);
        A05(adActivityIntentA05, abstractC1979jd);
        try {
            C1318Wu.A0B(this.A03, adActivityIntentA05);
        } catch (Exception e10) {
            this.A03.A08().ABC(A01(107, 11, 42), AbstractC1226Td.A0D, new C1227Te(e10));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1493bV c1493bV = new C1493bV(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A2A());
        HashMap map = new HashMap();
        map.put(A01(118, 12, 105), A01(148, 9, 96));
        c1493bV.A05(this.A02.A2E(), str, map);
    }

    public final void A08() {
        YB.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void A9f() {
        A07(this.A02.A29().A0J().A05());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void A9g(String str) {
        A07(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void A9k() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AAm() {
        new Handler(Looper.getMainLooper()).post(new JF(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AE0() {
        A06(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AE4() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AEu(boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AFz() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AGX(boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AGZ(boolean z10) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AGo(String str) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AKD() {
        if (this.A06 != null) {
            this.A06.ADm(this);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void close() {
    }

    public VA getAdEventManager() {
        return this.A04;
    }

    public C1598dC getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C1759fp c1759fp) {
        this.A00 = c1759fp;
        this.A07.A0e(c1759fp);
    }
}
