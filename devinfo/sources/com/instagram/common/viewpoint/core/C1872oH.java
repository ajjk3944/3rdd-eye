package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1872oH implements A6 {
    @Override // com.instagram.common.viewpoint.core.A6
    public final /* synthetic */ A5 AH3(A1 a12, C1996qI c1996qI) {
        return A3.A00(this, a12, c1996qI);
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final /* synthetic */ void AH4() {
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final InterfaceC03629s A3C(A1 a12, C1996qI c1996qI) {
        if (c1996qI.A0O == null) {
            return null;
        }
        return new C1870oF(new C03609q(new C0365Ab(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final int A7W(C1996qI c1996qI) {
        return c1996qI.A0O != null ? 1 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final void AJe(Looper looper, C8O c8o) {
    }
}
