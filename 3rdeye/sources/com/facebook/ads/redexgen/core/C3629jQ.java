package com.facebook.ads.redexgen.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3629jQ implements InterfaceC2678Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC2678Ks
    public final C2677Kr<File> A3p(File file, LA la2) {
        if (file.exists()) {
            return new C2677Kr<>(true, file);
        }
        return new C2677Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2678Ks
    public final void A55(File file, LA la2) {
    }
}
