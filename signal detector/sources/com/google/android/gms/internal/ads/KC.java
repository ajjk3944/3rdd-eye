package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class KC implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final KC f9471c = new KC(new int[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9472a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9473b;

    public KC(int[] iArr, int i) {
        this.f9472a = iArr;
        this.f9473b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KC) {
            KC kc = (KC) obj;
            int i = kc.f9473b;
            int i3 = this.f9473b;
            if (i3 == i) {
                for (int i6 = 0; i6 < i3; i6++) {
                    AbstractC0582Jp.k0(i6, i3);
                    int i7 = this.f9472a[i6];
                    AbstractC0582Jp.k0(i6, kc.f9473b);
                    if (i7 == kc.f9472a[i6]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i3 = 0; i3 < this.f9473b; i3++) {
            i = (i * 31) + this.f9472a[i3];
        }
        return i;
    }

    public final String toString() {
        int i = this.f9473b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f9472a;
        sb.append(iArr[0]);
        for (int i3 = 1; i3 < i; i3++) {
            sb.append(", ");
            sb.append(iArr[i3]);
        }
        sb.append(']');
        return sb.toString();
    }
}
