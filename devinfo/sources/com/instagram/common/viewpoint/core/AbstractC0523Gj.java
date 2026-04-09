package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0523Gj extends FrameLayout implements InterfaceC0978Yi {
    public static byte[] A0F;
    public static String[] A0G = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0H;
    public boolean A00;
    public ViewGroup A01;
    public boolean A02;
    public final AbstractC1601jd A03;
    public final C0842Sx A04;
    public final C1436gi A05;
    public final VA A06;
    public final VI A07;
    public final Y2 A08;
    public final AbstractC0971Yb A09;
    public final InterfaceC0977Yh A0A;
    public final ZU A0B;
    public final C1381fp A0C;
    public final ViewOnSystemUiVisibilityChangeListenerC0967Xx A0D;
    public final AbstractC1380fo A0E;

    public static String A0Z(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0b() {
        A0F = new byte[]{-22, -19, -4, -23, -24};
    }

    public abstract void A0g();

    public abstract void A0h();

    public abstract void A0k(C0798Re c0798Re);

    public abstract boolean A0l();

    public abstract boolean A0m();

    static {
        A0b();
        A0H = new RelativeLayout.LayoutParams(-1, -1);
    }

    public AbstractC0523Gj(C1436gi c1436gi, ZU zu, VA va2, AbstractC1601jd abstractC1601jd, C0842Sx c0842Sx, InterfaceC0977Yh interfaceC0977Yh) {
        super(c1436gi);
        this.A02 = false;
        this.A0E = new H8(this);
        this.A08 = new Y2();
        this.A00 = false;
        this.A05 = c1436gi;
        this.A0B = zu;
        this.A06 = va2;
        this.A03 = abstractC1601jd;
        this.A04 = c0842Sx;
        this.A0A = interfaceC0977Yh;
        this.A07 = new VI(this.A03.A2E(), this.A06);
        this.A0C = new C1381fp(this, 1, new WeakReference(this.A0E), this.A05);
        this.A0C.A0W(this.A03.A0m());
        this.A0C.A0X(this.A03.A0n());
        this.A09 = A0Y();
        this.A0D = new ViewOnSystemUiVisibilityChangeListenerC0967Xx(this);
        this.A0D.A05(EnumC0966Xw.A02);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC0971Yb A0Y() {
        AbstractC0971Yb abstractC0971YbA0c = A0c();
        abstractC0971YbA0c.setFullscreen(true);
        int iA04 = this.A03.A29().A0H().A04();
        abstractC0971YbA0c.setPageDetails(this.A03.A2C(), this.A03.A2E(), iA04, this.A03.A2D());
        abstractC0971YbA0c.A0D(this.A03.A28().A01(), ViewOnClickListenerC0634Kr.A05(this.A03));
        if (this.A03.A29().A0H().A02() == 0) {
            this.A02 = true;
            abstractC0971YbA0c.setToolbarActionMode(8);
        } else if (iA04 < 0 && this.A03.A29().A0S()) {
            abstractC0971YbA0c.setToolbarActionMode(4);
        }
        if (this.A03.A29().A0H().A02() >= 0) {
            abstractC0971YbA0c.setProgressSpinnerInvisible(true);
        }
        abstractC0971YbA0c.setToolbarListener(new C0525Gl(this));
        return abstractC0971YbA0c;
    }

    private void A0a() {
        if (this.A03.A29().A0W()) {
            C1259dq c1259dqA0F = new Cdo(this.A05, this.A03.A29().A0I(), this.A03.A2C()).A0A(this.A03.A28().A01()).A0F();
            VK.A04(c1259dqA0F, this.A07, VH.A0U);
            addView(c1259dqA0F, A0H);
            c1259dqA0F.A04(new C0538Gy(this));
            return;
        }
        A0h();
    }

    public AbstractC0971Yb A0c() {
        if (A0m()) {
            if (this.A03.A1W()) {
                return new C0750Pe(this.A05, getAppOpenAdVariant(), this.A03, 8, new C0529Gp(this));
            }
            return new PU(this.A05, this.A03, 1);
        }
        return new FullScreenAdToolbar(this.A05, this.A0A, this.A07, 1, this.A03.A22(), this.A03.A1s());
    }

    public void A0d() {
        Rect requestedMargins;
        if (!this.A03.A1W() || (requestedMargins = this.A09.getRequestedMargins()) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A09.getLayoutParams();
        layoutParams.setMargins(requestedMargins.left, requestedMargins.top, requestedMargins.right, requestedMargins.bottom);
        this.A09.setLayoutParams(layoutParams);
    }

    public final void A0e() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public final void A0f() {
        if (this.A09.getToolbarActionMode() == 8) {
            this.A09.setToolbarActionMode(2);
        }
        if (this.A03.A29().A0H().A07() != null) {
            this.A03.A29().A0H().A07().A0S(0);
        }
        this.A03.A2K(false);
        this.A03.A29().A0M(-1);
    }

    public final void A0i(int i4, AbstractRunnableC0923Wc abstractRunnableC0923Wc, DZ dz) {
        new XO(i4, new H0(this, i4, dz, abstractRunnableC0923Wc)).A07();
    }

    public final void A0j(ViewGroup viewGroup) {
        if (this.A03.A1W() && getAppOpenAdVariant() == EnumC0976Yg.A08) {
            C1131bl c1131bl = new C1131bl(this.A05);
            c1131bl.setRadius(XV.A0v);
            c1131bl.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
            this.A01 = c1131bl;
            return;
        }
        this.A01 = viewGroup;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Yi
    public final void AAu(Intent intent, Bundle bundle, C0798Re c0798Re) {
        this.A0A.A45(this, A0H);
        A0k(c0798Re);
        A0a();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Yi
    public final void AIv(Bundle bundle) {
    }

    private EnumC0976Yg getAppOpenAdVariant() {
        if (this.A03.A0v().equals(A0Z(0, 5, 93))) {
            return EnumC0976Yg.A08;
        }
        return EnumC0976Yg.A09;
    }

    public Integer getBackgroundColorForToolbar() {
        if (this.A03.A1W()) {
            return getAppOpenAdVariant().A03;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Yi
    public String getCurrentClientToken() {
        return this.A03.A2E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0978Yi
    public final boolean onActivityResult(int i4, int i10, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        A0d();
        if (A0G[6].charAt(4) == 'Z') {
            throw new RuntimeException();
        }
        A0G[3] = "kF6RESICu85JPno09mseATff07y9WxI4";
    }

    public void onDestroy() {
        this.A0D.A03();
        if (!TextUtils.isEmpty(this.A03.A2E())) {
            this.A06.AB7(this.A03.A2E(), new C1093b9().A03(this.A0C).A02(this.A08).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A08.A06(this.A05, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0977Yh interfaceC0977Yh) {
    }

    public void setUpFullscreenMode(boolean z3) {
        EnumC0966Xw enumC0966Xw;
        if (z3) {
            enumC0966Xw = EnumC0966Xw.A03;
        } else {
            enumC0966Xw = EnumC0966Xw.A02;
        }
        this.A0D.A05(enumC0966Xw);
    }
}
