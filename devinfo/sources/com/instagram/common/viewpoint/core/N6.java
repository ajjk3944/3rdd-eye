package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C1436gi c1436gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C0886Up.A1O(c1436gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C1623jz();
            case 4:
                return new C1618ju(c1436gi);
            case 5:
                return new C1618ju(c1436gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.instagram.common.viewpoint.core.C1618ju, com.instagram.common.viewpoint.core.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C03227w();
            default:
                return null;
        }
    }
}
