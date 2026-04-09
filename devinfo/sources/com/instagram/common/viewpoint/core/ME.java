package com.instagram.common.viewpoint.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC0999Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C0726Og A01;
    public final C1436gi A02;

    public ME(C1436gi c1436gi, VA va2, String str, C0706Nm c0706Nm, InterfaceC0978Yi interfaceC0978Yi, InterfaceC0977Yh interfaceC0977Yh) {
        super(c1436gi, va2, str, c0706Nm, interfaceC0978Yi, interfaceC0977Yh);
        this.A02 = c1436gi;
        this.A01 = AbstractC0727Oh.A00(c1436gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C0886Up.A2b(c1436gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z3 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0O() {
        C0730Ok c0730OkA0A = this.A01.A0A();
        C1014Zs c1014Zs = new C1014Zs(this.A02);
        c1014Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1014Zs.setOnClickListener(new ViewOnClickListenerC1005Zj(this));
        C0730Ok c0730OkA0B = this.A01.A0B();
        C1014Zs c1014Zs2 = new C1014Zs(this.A02);
        c1014Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1014Zs2.setOnClickListener(new ViewOnClickListenerC1006Zk(this));
        C1014Zs c1014Zs3 = new C1014Zs(this.A02);
        c1014Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1014Zs3.setOnClickListener(new ViewOnClickListenerC1007Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!c0730OkA0A.A05().isEmpty()) {
            linearLayout.addView(c1014Zs, itemParams);
        }
        if (!c0730OkA0B.A05().isEmpty()) {
            linearLayout.addView(c1014Zs2, itemParams);
        }
        linearLayout.addView(c1014Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0Q(C0730Ok c0730Ok, EnumC0728Oi enumC0728Oi) {
        String strA0E;
        int i4;
        String strA01;
        if (enumC0728Oi == EnumC0728Oi.A05) {
            return;
        }
        boolean z3 = enumC0728Oi == EnumC0728Oi.A06;
        C0996Za c0996Za = new C0996Za(this.A02, this.A0D);
        if (z3) {
            C0726Og c0726Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = c0726Og.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C0996Za c0996ZaA0D = c0996Za.A0H(strA0E).A0G(this.A01.A0D()).A0E(c0730Ok.A04()).A0D(z3 ? YM.REPORT_AD : YM.HIDE_AD);
        if (z3) {
            i4 = -552389;
        } else {
            i4 = -13272859;
        }
        C0996Za c0996ZaA0C = c0996ZaA0D.A0C(i4);
        if (this.A0C != null) {
            C0706Nm c0706Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                strA01 = c0706Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = c0706Nm.A01();
            }
        } else {
            strA01 = "";
        }
        C0997Zb adHiddenView = c0996ZaA0C.A0F(strA01).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c0730Ok, enumC0728Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final void A0R(C0730Ok c0730Ok, EnumC0728Oi enumC0728Oi) {
        String strA0H;
        boolean z3 = enumC0728Oi == EnumC0728Oi.A06;
        C1436gi c1436gi = this.A02;
        InterfaceC1001Zf interfaceC1001Zf = this.A0D;
        if (z3) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C1017Zv c1017Zv = new C1017Zv(c1436gi, c0730Ok, interfaceC1001Zf, strA0H, z3 ? YM.REPORT_AD : YM.HIDE_AD);
        c1017Zv.setClickable(true);
        YB.A0N(c1017Zv, -1);
        c1017Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1017Zv, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
