package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class JC {
    public static final Comparator<JC> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.JB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((JC) obj2).A00, ((JC) obj).A00);
        }
    };
    public final int A00;
    public final C3900o2 A01;

    public JC(CharSequence charSequence, Layout.Alignment alignment, float f10, int i, int i10, float f11, int i11, float f12, boolean z10, int i12, int i13) {
        C3C cueBuilder = new C3C().A0G(charSequence).A0F(alignment).A07(f10, i).A09(i10).A04(f11).A0A(i11).A06(f12);
        if (z10) {
            cueBuilder.A0C(i12);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i13;
    }
}
