package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC2558Gb {
    public static final InterfaceC2558Gb A00 = new InterfaceC2558Gb() { // from class: com.facebook.ads.redexgen.X.lL
        @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
        public final GX[] A5F() {
            return AbstractC2557Ga.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC2557Ga.A01(this, uri, map);
        }
    };

    GX[] A5F();

    GX[] A5G(Uri uri, Map<String, List<String>> map);
}
