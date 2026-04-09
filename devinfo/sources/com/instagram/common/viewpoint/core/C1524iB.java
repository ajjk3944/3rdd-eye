package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1524iB implements InterfaceC0732Om {
    public final SharedPreferences A00;

    public C1524iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0732Om
    public final C1525iC A6I() {
        return new C1525iC(this.A00.edit());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0732Om
    public final long A8Q(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0732Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
