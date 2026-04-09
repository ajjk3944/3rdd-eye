package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18317a;

    /* renamed from: b, reason: collision with root package name */
    public int f18318b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18319c;

    /* renamed from: d, reason: collision with root package name */
    public int f18320d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18321e;

    public x8(eu1 eu1Var) {
        this.f18321e = eu1Var;
    }

    public void a() {
        this.f18317a = false;
        this.f18319c = false;
    }

    public void b(int i4) {
        this.f18317a = 1 == ((this.f18317a ? 1 : 0) | i4);
        this.f18318b += i4;
    }

    public void c(int i4) {
        mq0.c0(!this.f18317a);
        boolean z3 = i4 == this.f18318b;
        this.f18317a = z3;
        if (z3) {
            this.f18320d = 3;
            this.f18319c = false;
        }
    }

    public void d(int i4, int i10, byte[] bArr) {
        if (this.f18317a) {
            int i11 = i10 - i4;
            byte[] bArr2 = (byte[]) this.f18321e;
            int length = bArr2.length;
            int i12 = this.f18320d + i11;
            if (length < i12) {
                this.f18321e = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i4, (byte[]) this.f18321e, this.f18320d, i11);
            this.f18320d += i11;
        }
    }

    public boolean e(int i4) {
        if (!this.f18317a) {
            return false;
        }
        this.f18320d -= i4;
        this.f18317a = false;
        this.f18319c = true;
        return true;
    }

    public x8(int i4) {
        this.f18318b = i4;
        byte[] bArr = new byte[131];
        this.f18321e = bArr;
        bArr[2] = 1;
    }
}
