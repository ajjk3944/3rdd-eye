package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9200b;

    public a4(String str, byte[] bArr) {
        super(str);
        this.f9200b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a4.class == obj.getClass()) {
            a4 a4Var = (a4) obj;
            if (this.f11366a.equals(a4Var.f11366a) && Arrays.equals(this.f9200b, a4Var.f9200b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9200b) + ((this.f11366a.hashCode() + 527) * 31);
    }
}
