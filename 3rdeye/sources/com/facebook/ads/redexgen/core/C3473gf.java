package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3473gf implements O8 {
    public final SharedPreferences A00;

    public C3473gf(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.O8
    public final C3474gg A6A() {
        return new C3474gg(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.O8
    public final long A8I(String str, long j4) {
        return this.A00.getLong(str, j4);
    }

    @Override // com.facebook.ads.redexgen.core.O8
    public final String A96(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
