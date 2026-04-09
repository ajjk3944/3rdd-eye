package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class D3 extends RelativeLayout implements InterfaceC3289dc, View.OnClickListener {
    public E1 A00;
    public final DX A01;
    public final DR A02;
    public final DP A03;
    public final DN A04;
    public final C3312e0 A05;
    public static final int A07 = (int) (AbstractC2975Wl.A02 * 16.0f);
    public static final int A06 = (int) (AbstractC2975Wl.A02 * 6.0f);

    public D3(C3272dL c3272dL) {
        super(c3272dL);
        this.A04 = new DN() { // from class: com.facebook.ads.redexgen.X.2x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.setVisibility(0);
            }
        };
        this.A02 = new DR() { // from class: com.facebook.ads.redexgen.X.2w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                this.A00.A05.setChecked(true);
            }
        };
        this.A03 = new DP() { // from class: com.facebook.ads.redexgen.X.2v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                this.A00.A05.setChecked(false);
            }
        };
        this.A01 = new DX() { // from class: com.facebook.ads.redexgen.X.2u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C22383d c22383d) {
                this.A00.A05.setChecked(true);
            }
        };
        XP.A0Q(this, XP.A06(855638016, A06));
        this.A05 = new C3312e0(c3272dL, true);
        this.A05.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3289dc
    public final void AAm(E1 e12) {
        this.A00 = e12;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3289dc
    public final void AJk(E1 e12) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2951Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == EnumC3342eU.A07 || this.A00.getState() == EnumC3342eU.A05 || this.A00.getState() == EnumC3342eU.A06) {
                this.A00.A0h(EnumC3288db.A04, 11);
            } else if (this.A00.getState() == EnumC3342eU.A0A) {
                this.A00.A0l(true, 7);
            }
        } catch (Throwable th) {
            AbstractC2951Vl.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
