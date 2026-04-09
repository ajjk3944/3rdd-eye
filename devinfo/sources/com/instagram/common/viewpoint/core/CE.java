package com.instagram.common.viewpoint.core;

import android.util.Log;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CE implements InterfaceC1486hW {
    public int A00;

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final void A9t(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final void A9u(String str, String str2, Throwable th2) {
        Log.i(str, str2, th2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final boolean AAY(int i4) {
        return this.A00 <= i4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1486hW
    public final void AJY(int i4) {
        this.A00 = i4;
    }
}
