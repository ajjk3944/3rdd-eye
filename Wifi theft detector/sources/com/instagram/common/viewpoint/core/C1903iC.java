package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1903iC implements InterfaceC1109Ol {
    public final SharedPreferences.Editor A00;

    public C1903iC(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1903iC A00(String str, long j10) {
        this.A00.putLong(str, j10);
        return this;
    }

    public final C1903iC A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
