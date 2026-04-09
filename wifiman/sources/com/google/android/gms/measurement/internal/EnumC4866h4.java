package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4866h4 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String zzf;

    EnumC4866h4(String str) {
        this.zzf = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzf;
    }
}
