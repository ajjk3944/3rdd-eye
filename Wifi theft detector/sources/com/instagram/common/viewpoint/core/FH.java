package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class FH extends AbstractC1162Qq<FC> {
    public final int A00;
    public final C1814gi A01;
    public final ViewOnClickListenerC1012Kr A02;
    public final List<String> A03;

    public FH(C1814gi c1814gi, List<String> screenshotUrls, int i10, ViewOnClickListenerC1012Kr viewOnClickListenerC1012Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1814gi;
        this.A02 = viewOnClickListenerC1012Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final FC A0F(ViewGroup viewGroup, int i10) {
        FD fd = new FD(this.A01);
        if (C1264Up.A1D(this.A01)) {
            fd.setOnClickListener(new ViewOnClickListenerC1681eZ(this));
        }
        return new FC(fd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(FC fc, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i10 != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i10 >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        fc.A0p().setLayoutParams(marginLayoutParams);
        fc.A0p().A00(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1162Qq
    public final int A0B() {
        return this.A03.size();
    }
}
