package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.66, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass66 extends FrameLayout implements InterfaceC1356Yi, InterfaceC0961Is {
    public static byte[] A0I;
    public static String[] A0J = {"UTx0mthy689a2sWy4JVu0tmbo5tf7DAX", "DpQrJfF4GGVCKG366ycalUQvQmaAeTpv", "eTaJ9UlZkoiVo78onrsfkh8qyWU6l07Y", "ASk", "tRl9yBUHWghtVC3MTlEkON1DGIMHt5L9", "IjjI8eijgHBxehc5IxL2bCSmbEZHlZYm", "ajbOHBl4KDnxYMWXO0J67", "uiq3lL8JcMvDgND3txStxUQziaPHduab"};
    public C1176Re A00;
    public InterfaceC1182Rk A01;
    public InterfaceC1604dI A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC1979jd A06;
    public final C1814gi A07;
    public final VA A08;
    public final VI A09;
    public final ViewOnSystemUiVisibilityChangeListenerC1345Xx A0A;
    public final Y2 A0B;
    public final InterfaceC1355Yh A0C;
    public final ZU A0D;
    public final C1590d4 A0E;
    public final C1598dC A0F;
    public final AbstractC1758fo A0G;
    public final C1759fp A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{24, 47, 47, 50, 47, 125, 62, 47, 56, 60, 41, 52, 51, 58, 125, 62, 50, 51, 59, 52, 58, 125, 23, 14, 18, 19, 78, 69, 76, 68, 67, 72, 73, 114, 76, 73, 36, 47, 38, 46, 41, 34, 35, 24, 38, 35, 24, 46, 41, 35, 34, 63, 46, 37, 44, 36, 35, 40, 41, 18, 44, 41, 18, 57, 34, 57, 44, 33, 91, 80, 89, 81, 86, 93, 92, 103, 76, 81, 85, 93, 103, 75, 72, 93, 86, 76, 35, 44, 41, 35, 43, 31, 51, 47, 53, 50, 35, 37, 74, 76, 90, 77, 92, 83, 86, 92, 84};
    }

    static {
        A0D();
    }

    public AnonymousClass66(C1814gi c1814gi, VA va, InterfaceC1355Yh interfaceC1355Yh, AbstractC1979jd abstractC1979jd, ZU zu, int i10) throws JSONException {
        super(c1814gi);
        this.A01 = new C0973Je(this);
        this.A0G = new C0972Jd(this);
        this.A03 = true;
        this.A07 = c1814gi;
        this.A08 = va;
        this.A0C = interfaceC1355Yh;
        this.A06 = abstractC1979jd;
        this.A0D = zu;
        C1598dC c1598dCA02 = AbstractC1599dD.A02(abstractC1979jd.A1D());
        if (c1598dCA02 == null) {
            this.A0F = new C1598dC(this.A07, abstractC1979jd, va, i10);
            this.A04 = false;
        } else {
            this.A0F = c1598dCA02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new JU(this));
        YB.A0G(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, this.A0F.A0O());
        if (this.A06.A1U()) {
            this.A0E = new C1590d4(this.A07, this.A08, this.A06, new C1220Sx(this.A07), this.A09, this.A0C, this.A0D, new JT(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new ViewOnTouchListenerC1586d0(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C1759fp(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0m());
        this.A0H.A0X(this.A06.A0n());
        this.A0F.A0e(this.A0H);
        this.A0A = new ViewOnSystemUiVisibilityChangeListenerC1345Xx(this);
        this.A0A.A05(EnumC1344Xw.A02);
        setBackgroundColor(0);
        if (C1264Up.A1z(c1814gi)) {
            c1814gi.A0B().AKp(mediaView, abstractC1979jd.A2E(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zA2L = abstractC1979jd.A2L();
            String strA0B = A0B(68, 18, 20);
            String strA0B2 = A0B(36, 16, 107);
            String strA0B3 = A0B(52, 16, 97);
            String strA0B4 = A0B(26, 10, 1);
            if (zA2L) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 0);
                jSONObject.put(strA0B, this.A06.A0r());
            } else if (XC.A05(abstractC1979jd.A0z())) {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, 1);
                jSONObject.put(strA0B, this.A06.A0r());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(AbstractC1226Td.A15, A0B(0, 26, 113));
        }
    }

    private void A0C() {
        C1637dq c1637dqA0F = new Cdo(this.A07, this.A06.A29().A0I(), this.A06.A2C()).A0A(this.A06.A28().A01()).A0F();
        addView(c1637dqA0F, new FrameLayout.LayoutParams(-1, -1));
        c1637dqA0F.A04(new JK(this));
    }

    private final void A0E() throws JSONException {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0F().A66();
            this.A0F.A0X();
        } else {
            this.A07.A0F().A67();
            if (this.A0F.A0k()) {
                AKD();
                if (C1264Up.A1z(this.A07)) {
                    this.A07.A0B().ADb();
                }
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.A0F.A0O().getParent();
        if (viewGroup != null) {
            C1598dC c1598dC = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            A0J[6] = "m5i7x933C7hHEFpC39NkE";
            ViewGroup parent = c1598dC.A0O();
            viewGroup.removeView(parent);
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A45(this, new RelativeLayout.LayoutParams(-1, -1));
        if (this.A06.A1V()) {
            this.A0A.A05(EnumC1344Xw.A03);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1493bV c1493bV = new C1493bV(this.A07, this.A0D.A7M(), this.A0H, this.A0B, this.A08, this.A06.A2A(), this.A0C);
        HashMap map = new HashMap();
        map.put(A0B(86, 12, 108), A0B(98, 9, 19));
        c1493bV.A05(this.A06.A2E(), str, map);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void A9f() {
        A0F(this.A06.A29().A0J().A05());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void A9g(String str) {
        A0F(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void A9k() {
        this.A0C.A4j(this.A0D.A6l());
        C1682ea serverSideRewardHandler = new C1682ea(this.A07, this.A0D, this.A06.A1G(), this.A0C);
        serverSideRewardHandler.A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AAm() {
        new Handler(Looper.getMainLooper()).post(new JN(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void AAu(Intent intent, Bundle bundle, C1176Re c1176Re) throws JSONException {
        C1598dC.A0B().incrementAndGet();
        c1176Re.A0A(this.A01);
        this.A00 = c1176Re;
        A0E();
        if (this.A06.A29().A0W()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AE0() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AE4() {
        if (this.A0E != null) {
            this.A0E.A0P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AEu(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0R(z10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void AFA(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void AFi(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0T(z10);
        }
        if (this.A03) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AFz() {
        if (this.A0E != null) {
            this.A0E.A0Q();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AGX(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0U(z10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AGZ(boolean z10) {
        if (this.A0E != null) {
            this.A0E.A0V(z10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AGo(String str) {
        String urlString = this.A06.A2F(str);
        if (urlString == null) {
            return;
        }
        X6.A0O(new X6(), this.A07, XB.A00(urlString), this.A06.A2E());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void AKD() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0961Is
    public final void close() {
        if (this.A00 == null) {
            return;
        }
        this.A07.A0F().AB0();
        this.A00.finish(4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public String getCurrentClientToken() {
        return this.A06.A2E();
    }

    private ViewGroup getMediaView() {
        if (this.A0E != null) {
            return this.A0E;
        }
        return this.A0F.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1356Yi
    public final void onDestroy() {
        if (C1264Up.A1z(this.A07)) {
            this.A07.A0B().AKU(getMediaView());
        }
        C1590d4 c1590d4 = this.A0E;
        String[] strArr = A0J;
        if (strArr[4].charAt(27) != strArr[5].charAt(27)) {
            throw new RuntimeException();
        }
        A0J[6] = "GZe1biqFkGajjfTMFdC84";
        if (c1590d4 != null) {
            this.A0E.A0O();
        }
        this.A0A.A03();
        this.A08.AB7(this.A06.A2E(), new C1471b9().A02(this.A0B).A03(this.A0H).A05());
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        AbstractC1599dD.A04(this.A06.A1D());
        C1598dC.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1355Yh interfaceC1355Yh) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC1604dI interfaceC1604dI) {
        this.A02 = interfaceC1604dI;
    }
}
