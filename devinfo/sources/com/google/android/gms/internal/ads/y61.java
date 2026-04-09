package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y61 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final y61 f18659c = new y61(0, new int[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18661b;

    public y61(int i4, int[] iArr) {
        this.f18660a = iArr;
        this.f18661b = i4;
    }

    public final boolean equals(Object obj) {
        y61 y61Var;
        int i4;
        int i10;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y61) && (i10 = this.f18661b) == (i4 = (y61Var = (y61) obj).f18661b)) {
            for (int i11 = 0; i11 < i10; i11++) {
                mq0.f0(i11, i10);
                int i12 = this.f18660a[i11];
                mq0.f0(i11, i4);
                if (i12 == y61Var.f18660a[i11]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = 1;
        for (int i10 = 0; i10 < this.f18661b; i10++) {
            i4 = (i4 * 31) + this.f18660a[i10];
        }
        return i4;
    }

    public final String toString() {
        int i4 = this.f18661b;
        if (i4 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i4 * 5);
        sb2.append('[');
        int[] iArr = this.f18660a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i4; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
