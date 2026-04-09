package com.instagram.common.viewpoint.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC1377Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C1104Og A01;
    public final C1814gi A02;

    public ME(C1814gi c1814gi, VA va, String str, C1084Nm c1084Nm, InterfaceC1356Yi interfaceC1356Yi, InterfaceC1355Yh interfaceC1355Yh) {
        super(c1814gi, va, str, c1084Nm, interfaceC1356Yi, interfaceC1355Yh);
        this.A02 = c1814gi;
        this.A01 = AbstractC1105Oh.A00(c1814gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C1264Up.A2b(c1814gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0O() {
        C1108Ok c1108OkA0A = this.A01.A0A();
        C1392Zs c1392Zs = new C1392Zs(this.A02);
        c1392Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1392Zs.setOnClickListener(new ViewOnClickListenerC1383Zj(this));
        C1108Ok c1108OkA0B = this.A01.A0B();
        C1392Zs c1392Zs2 = new C1392Zs(this.A02);
        c1392Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1392Zs2.setOnClickListener(new ViewOnClickListenerC1384Zk(this));
        C1392Zs c1392Zs3 = new C1392Zs(this.A02);
        c1392Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1392Zs3.setOnClickListener(new ViewOnClickListenerC1385Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!c1108OkA0A.A05().isEmpty()) {
            linearLayout.addView(c1392Zs, itemParams);
        }
        if (!c1108OkA0B.A05().isEmpty()) {
            linearLayout.addView(c1392Zs2, itemParams);
        }
        linearLayout.addView(c1392Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0Q(C1108Ok c1108Ok, EnumC1106Oi enumC1106Oi) {
        String strA0E;
        int i10;
        String strA01;
        if (enumC1106Oi == EnumC1106Oi.A05) {
            return;
        }
        boolean z10 = enumC1106Oi == EnumC1106Oi.A06;
        C1374Za c1374Za = new C1374Za(this.A02, this.A0D);
        if (z10) {
            C1104Og c1104Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            strA0E = c1104Og.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C1374Za c1374ZaA0D = c1374Za.A0H(strA0E).A0G(this.A01.A0D()).A0E(c1108Ok.A04()).A0D(z10 ? YM.REPORT_AD : YM.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        C1374Za c1374ZaA0C = c1374ZaA0D.A0C(i10);
        if (this.A0C != null) {
            C1084Nm c1084Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                strA01 = c1084Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                strA01 = c1084Nm.A01();
            }
        } else {
            strA01 = "";
        }
        C1375Zb adHiddenView = c1374ZaA0C.A0F(strA01).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c1108Ok, enumC1106Oi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final void A0R(C1108Ok c1108Ok, EnumC1106Oi enumC1106Oi) {
        String strA0H;
        boolean z10 = enumC1106Oi == EnumC1106Oi.A06;
        C1814gi c1814gi = this.A02;
        InterfaceC1379Zf interfaceC1379Zf = this.A0D;
        if (z10) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C1395Zv c1395Zv = new C1395Zv(c1814gi, c1108Ok, interfaceC1379Zf, strA0H, z10 ? YM.REPORT_AD : YM.HIDE_AD);
        c1395Zv.setClickable(true);
        YB.A0N(c1395Zv, -1);
        c1395Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1395Zv, A00(false));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1377Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
