package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class W3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12150a;

    /* renamed from: b, reason: collision with root package name */
    public int f12151b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12152c;

    /* renamed from: d, reason: collision with root package name */
    public int f12153d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12154e;

    public W3(C1747qO c1747qO) {
        this.f12154e = c1747qO;
    }

    public void a() {
        this.f12150a = false;
        this.f12152c = false;
    }

    public void b(int i) {
        this.f12150a = 1 == ((this.f12150a ? 1 : 0) | i);
        this.f12151b += i;
    }

    public void c(int i) {
        AbstractC0582Jp.h0(!this.f12150a);
        boolean z6 = i == this.f12151b;
        this.f12150a = z6;
        if (z6) {
            this.f12153d = 3;
            this.f12152c = false;
        }
    }

    public void d(int i, int i3, byte[] bArr) {
        if (this.f12150a) {
            int i6 = i3 - i;
            byte[] bArr2 = (byte[]) this.f12154e;
            int length = bArr2.length;
            int i7 = this.f12153d + i6;
            if (length < i7) {
                this.f12154e = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i, (byte[]) this.f12154e, this.f12153d, i6);
            this.f12153d += i6;
        }
    }

    public boolean e(int i) {
        if (!this.f12150a) {
            return false;
        }
        this.f12153d -= i;
        this.f12150a = false;
        this.f12152c = true;
        return true;
    }

    public W3(int i) {
        this.f12151b = i;
        byte[] bArr = new byte[131];
        this.f12154e = bArr;
        bArr[2] = 1;
    }
}
