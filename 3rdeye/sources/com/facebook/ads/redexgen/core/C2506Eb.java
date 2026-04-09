package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Eb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2506Eb extends QC<EZ> {
    public final int A00;
    public final C3272dL A01;
    public final KE A02;
    public final List<String> A03;

    public C2506Eb(C3272dL c3272dL, List<String> screenshotUrls, int i, KE ke) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c3272dL;
        this.A02 = ke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final EZ A0F(ViewGroup viewGroup, int i) {
        C2505Ea c2505Ea = new C2505Ea(this.A01);
        if (U7.A1C(this.A01)) {
            c2505Ea.setOnClickListener(new ViewOnClickListenerC3268dH(this));
        }
        return new EZ(c2505Ea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(EZ ez, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        ez.A0p().setLayoutParams(marginLayoutParams);
        ez.A0p().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A03.size();
    }
}
