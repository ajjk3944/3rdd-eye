package com.instagram.common.viewpoint.core;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0605Jo {
    public static final Comparator<C0605Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C0605Jo) obj2).A00, ((C0605Jo) obj).A00);
        }
    };
    public final int A00;
    public final C1946pT A01;

    public C0605Jo(CharSequence charSequence, Layout.Alignment alignment, float f10, int i4, int i10, float f11, int i11, float f12, boolean z3, int i12, int i13) {
        C02103o cueBuilder = new C02103o().A0G(charSequence).A0F(alignment).A07(f10, i4).A09(i10).A04(f11).A0A(i11).A06(f12);
        if (z3) {
            cueBuilder.A0C(i12);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i13;
    }
}
