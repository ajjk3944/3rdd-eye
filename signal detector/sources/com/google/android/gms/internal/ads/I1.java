package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class I1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f9056b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9057c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9058d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f9059e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9060f;

    public I1(int i, int i3, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9056b = i;
        this.f9057c = i3;
        this.f9058d = i6;
        this.f9059e = iArr;
        this.f9060f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I1.class == obj.getClass()) {
            I1 i1 = (I1) obj;
            if (this.f9056b == i1.f9056b && this.f9057c == i1.f9057c && this.f9058d == i1.f9058d && Arrays.equals(this.f9059e, i1.f9059e) && Arrays.equals(this.f9060f, i1.f9060f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9060f) + ((Arrays.hashCode(this.f9059e) + ((((((this.f9056b + 527) * 31) + this.f9057c) * 31) + this.f9058d) * 31)) * 31);
    }
}
