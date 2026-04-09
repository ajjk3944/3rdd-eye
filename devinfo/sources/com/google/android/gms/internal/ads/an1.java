package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class an1 extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9368f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public int f9371c;

    /* renamed from: e, reason: collision with root package name */
    public int f9373e;

    /* renamed from: a, reason: collision with root package name */
    public final int f9369a = 128;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9370b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9372d = new byte[128];

    public final synchronized bn1 c() {
        try {
            int i4 = this.f9373e;
            byte[] bArr = this.f9372d;
            if (i4 >= bArr.length) {
                this.f9370b.add(new zm1(this.f9372d));
                this.f9372d = f9368f;
            } else if (i4 > 0) {
                this.f9370b.add(new zm1(Arrays.copyOf(bArr, i4)));
            }
            this.f9371c += this.f9373e;
            this.f9373e = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return bn1.x(this.f9370b);
    }

    public final void e(int i4) {
        this.f9370b.add(new zm1(this.f9372d));
        int length = this.f9371c + this.f9372d.length;
        this.f9371c = length;
        this.f9372d = new byte[Math.max(this.f9369a, Math.max(i4, length >>> 1))];
        this.f9373e = 0;
    }

    public final String toString() {
        int i4;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i4 = this.f9371c + this.f9373e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i4));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i4) {
        try {
            if (this.f9373e == this.f9372d.length) {
                e(1);
            }
            byte[] bArr = this.f9372d;
            int i10 = this.f9373e;
            this.f9373e = i10 + 1;
            bArr[i10] = (byte) i4;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i4, int i10) {
        byte[] bArr2 = this.f9372d;
        int length = bArr2.length;
        int i11 = this.f9373e;
        int i12 = length - i11;
        if (i10 <= i12) {
            System.arraycopy(bArr, i4, bArr2, i11, i10);
            this.f9373e += i10;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i11, i12);
        int i13 = i10 - i12;
        e(i13);
        System.arraycopy(bArr, i4 + i12, this.f9372d, 0, i13);
        this.f9373e = i13;
    }
}
