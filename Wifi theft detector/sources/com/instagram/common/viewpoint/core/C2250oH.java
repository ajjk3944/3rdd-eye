package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2250oH implements A6 {
    @Override // com.instagram.common.viewpoint.core.A6
    public final /* synthetic */ A5 AH3(A1 a12, C2374qI c2374qI) {
        return A3.A00(this, a12, c2374qI);
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final /* synthetic */ void AH4() {
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final InterfaceC07409s A3C(A1 a12, C2374qI c2374qI) {
        if (c2374qI.A0O == null) {
            return null;
        }
        return new C2248oF(new C07389q(new C0743Ab(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final int A7W(C2374qI c2374qI) {
        return c2374qI.A0O != null ? 1 : 0;
    }

    @Override // com.instagram.common.viewpoint.core.A6
    public final void AJe(Looper looper, C8O c8o) {
    }
}
