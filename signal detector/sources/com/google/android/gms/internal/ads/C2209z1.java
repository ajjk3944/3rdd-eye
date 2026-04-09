package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2209z1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17807b;

    public C2209z1(String str, byte[] bArr) {
        super(str);
        this.f17807b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2209z1.class == obj.getClass()) {
            C2209z1 c2209z1 = (C2209z1) obj;
            if (this.f8061a.equals(c2209z1.f8061a) && Arrays.equals(this.f17807b, c2209z1.f17807b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17807b) + ((this.f8061a.hashCode() + 527) * 31);
    }
}
