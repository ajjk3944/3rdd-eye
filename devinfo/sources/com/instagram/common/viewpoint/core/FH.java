package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class FH extends AbstractC0784Qq<FC> {
    public final int A00;
    public final C1436gi A01;
    public final ViewOnClickListenerC0634Kr A02;
    public final List<String> A03;

    public FH(C1436gi c1436gi, List<String> screenshotUrls, int i4, ViewOnClickListenerC0634Kr viewOnClickListenerC0634Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i4;
        this.A01 = c1436gi;
        this.A02 = viewOnClickListenerC0634Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final FC A0F(ViewGroup viewGroup, int i4) {
        FD fd2 = new FD(this.A01);
        if (C0886Up.A1D(this.A01)) {
            fd2.setOnClickListener(new ViewOnClickListenerC1303eZ(this));
        }
        return new FC(fd2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(FC fc2, int i4) {
        String str = this.A03.get(i4);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i4 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i4 >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        fc2.A0p().setLayoutParams(marginLayoutParams);
        fc2.A0p().A00(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0784Qq
    public final int A0B() {
        return this.A03.size();
    }
}
