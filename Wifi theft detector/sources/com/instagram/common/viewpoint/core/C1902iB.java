package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1902iB implements InterfaceC1110Om {
    public final SharedPreferences A00;

    public C1902iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1110Om
    public final C1903iC A6I() {
        return new C1903iC(this.A00.edit());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1110Om
    public final long A8Q(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1110Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
