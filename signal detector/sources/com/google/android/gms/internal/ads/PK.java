package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PK extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f10347f = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public int f10350c;

    /* renamed from: e, reason: collision with root package name */
    public int f10352e;

    /* renamed from: a, reason: collision with root package name */
    public final int f10348a = 128;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10349b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10351d = new byte[128];

    public final synchronized QK a() {
        try {
            int i = this.f10352e;
            byte[] bArr = this.f10351d;
            if (i >= bArr.length) {
                this.f10349b.add(new OK(this.f10351d));
                this.f10351d = f10347f;
            } else if (i > 0) {
                this.f10349b.add(new OK(Arrays.copyOf(bArr, i)));
            }
            this.f10350c += this.f10352e;
            this.f10352e = 0;
        } catch (Throwable th) {
            throw th;
        }
        return QK.t(this.f10349b);
    }

    public final void b(int i) {
        this.f10349b.add(new OK(this.f10351d));
        int length = this.f10350c + this.f10351d.length;
        this.f10350c = length;
        this.f10351d = new byte[Math.max(this.f10348a, Math.max(i, length >>> 1))];
        this.f10352e = 0;
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f10350c + this.f10352e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f10352e == this.f10351d.length) {
                b(1);
            }
            byte[] bArr = this.f10351d;
            int i3 = this.f10352e;
            this.f10352e = i3 + 1;
            bArr[i3] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i3) {
        byte[] bArr2 = this.f10351d;
        int length = bArr2.length;
        int i6 = this.f10352e;
        int i7 = length - i6;
        if (i3 <= i7) {
            System.arraycopy(bArr, i, bArr2, i6, i3);
            this.f10352e += i3;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i7);
        int i8 = i3 - i7;
        b(i8);
        System.arraycopy(bArr, i + i7, this.f10351d, 0, i8);
        this.f10352e = i8;
    }
}
