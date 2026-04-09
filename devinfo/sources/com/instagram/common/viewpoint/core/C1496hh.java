package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.hh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1496hh implements RN {
    public final /* synthetic */ R2 A00;

    public C1496hh(R2 r22) {
        this.A00 = r22;
    }

    @Override // com.instagram.common.viewpoint.core.RN
    public final View A7H(int i4) {
        return this.A00.A0v(i4);
    }

    @Override // com.instagram.common.viewpoint.core.RN
    public final int A7J(View view) {
        return this.A00.A0l(view) + ((R3) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.RN
    public final int A7K(View view) {
        return this.A00.A0q(view) - ((R3) view.getLayoutParams()).topMargin;
    }

    @Override // com.instagram.common.viewpoint.core.RN
    public final int A8g() {
        return this.A00.A0Z() - this.A00.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.RN
    public final int A8h() {
        return this.A00.A0i();
    }
}
