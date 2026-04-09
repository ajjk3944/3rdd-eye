package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class G2 extends FrameLayout implements InterfaceC3004Xo {
    public boolean A00;
    public boolean A01;
    public final AbstractC3547hy A02;
    public final SF A03;
    public final C3272dL A04;
    public final US A05;
    public final C2915Ua A06;
    public final XH A07;
    public final AbstractC3002Xm A08;
    public final InterfaceC3003Xn A09;
    public final YY A0A;
    public final C3345eX A0B;
    public final XC A0C;
    public final AbstractC3344eW A0D;
    public static final int A0F = (int) (AbstractC2975Wl.A02 * 48.0f);
    public static final int A0G = (int) (AbstractC2975Wl.A02 * 64.0f);
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);

    public abstract AbstractC3002Xm A0b();

    public abstract void A0e();

    public abstract void A0f();

    public abstract void A0h(R0 r02);

    public abstract boolean A0i();

    public abstract boolean A0j();

    public G2(C3272dL c3272dL, YY yy, US us, AbstractC3547hy abstractC3547hy, SF sf, InterfaceC3003Xn interfaceC3003Xn) {
        super(c3272dL);
        this.A01 = false;
        this.A0D = new G7(this);
        this.A07 = new XH();
        this.A00 = false;
        this.A04 = c3272dL;
        this.A0A = yy;
        this.A05 = us;
        this.A02 = abstractC3547hy;
        this.A03 = sf;
        this.A09 = interfaceC3003Xn;
        this.A06 = new C2915Ua(this.A02.A25(), this.A05);
        this.A0B = new C3345eX(this, 1, new WeakReference(this.A0D), this.A04);
        this.A0B.A0W(this.A02.A0i());
        this.A0B.A0X(this.A02.A0j());
        this.A08 = A0Z();
        this.A0C = new XC(this);
        this.A0C.A05(XB.A02);
        if (!A0j() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC3002Xm A0Z() {
        AbstractC3002Xm abstractC3002XmA0b = A0b();
        abstractC3002XmA0b.setFullscreen(true);
        int iA04 = this.A02.A20().A0H().A04();
        abstractC3002XmA0b.setPageDetails(this.A02.A23(), this.A02.A25(), iA04, this.A02.A24());
        abstractC3002XmA0b.A0A(this.A02.A1z().A01(), KE.A05(this.A02));
        if (this.A02.A20().A0H().A02() == 0) {
            this.A01 = true;
            abstractC3002XmA0b.setToolbarActionMode(8);
        } else if (iA04 < 0 && this.A02.A20().A0S()) {
            abstractC3002XmA0b.setToolbarActionMode(4);
        }
        if (this.A02.A20().A0H().A02() >= 0) {
            abstractC3002XmA0b.setProgressSpinnerInvisible(true);
        }
        abstractC3002XmA0b.setToolbarListener(new G3(this));
        return abstractC3002XmA0b;
    }

    private void A0a() {
        if (this.A02.A20().A0W()) {
            C3223cX c3223cXA0F = new C3221cV(this.A04, this.A02.A20().A0I(), this.A02.A23()).A0A(this.A02.A1z().A01()).A0F();
            AbstractC2917Uc.A04(c3223cXA0F, this.A06, UZ.A0U);
            addView(c3223cXA0F, A0E);
            c3223cXA0F.A04(new G5(this));
            return;
        }
        A0f();
    }

    public final void A0c() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public final void A0d() {
        if (this.A08.getToolbarActionMode() == 8) {
            this.A08.setToolbarActionMode(2);
        }
        this.A02.A2B(false);
        this.A02.A20().A0M(-1);
    }

    public final void A0g(int i, AbstractRunnableC2959Vt abstractRunnableC2959Vt, C2475Cw c2475Cw) {
        new C2969Wd(i, new G6(this, i, c2475Cw, abstractRunnableC2959Vt)).A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) {
        this.A09.A3x(this, A0E);
        A0h(r02);
        A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public String getCurrentClientToken() {
        return this.A02.A25();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3004Xo
    public final boolean onActivityResult(int i, int i10, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0j() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    public void onDestroy() {
        this.A0C.A03();
        if (!TextUtils.isEmpty(this.A02.A25())) {
            this.A05.AAt(this.A02.A25(), new C3057Zp().A03(this.A0B).A02(this.A07).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A07.A06(this.A04, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC3003Xn interfaceC3003Xn) {
    }

    public void setUpFullscreenMode(boolean z10) {
        XB xb;
        if (z10) {
            xb = XB.A03;
        } else {
            xb = XB.A02;
        }
        this.A0C.A05(xb);
    }
}
