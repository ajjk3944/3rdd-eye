package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final int f12620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12621c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12622d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f12623e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12624f;

    public j4(int i4, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12620b = i4;
        this.f12621c = i10;
        this.f12622d = i11;
        this.f12623e = iArr;
        this.f12624f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j4.class == obj.getClass()) {
            j4 j4Var = (j4) obj;
            if (this.f12620b == j4Var.f12620b && this.f12621c == j4Var.f12621c && this.f12622d == j4Var.f12622d && Arrays.equals(this.f12623e, j4Var.f12623e) && Arrays.equals(this.f12624f, j4Var.f12624f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12624f) + ((Arrays.hashCode(this.f12623e) + ((((((this.f12620b + 527) * 31) + this.f12621c) * 31) + this.f12622d) * 31)) * 31);
    }
}
