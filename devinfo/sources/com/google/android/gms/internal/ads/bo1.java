package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bo1 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f9739a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f9740b;

    /* renamed from: c, reason: collision with root package name */
    public int f9741c;

    /* renamed from: d, reason: collision with root package name */
    public int f9742d;

    /* renamed from: e, reason: collision with root package name */
    public int f9743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9744f;
    public byte[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f9745h;

    /* renamed from: i, reason: collision with root package name */
    public long f9746i;

    public final boolean c() {
        ByteBuffer byteBuffer;
        Iterator it = this.f9739a;
        do {
            this.f9742d++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f9740b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f9743e = this.f9740b.position();
        if (this.f9740b.hasArray()) {
            this.f9744f = true;
            this.g = this.f9740b.array();
            this.f9745h = this.f9740b.arrayOffset();
            return true;
        }
        this.f9744f = false;
        this.f9746i = ip1.n(this.f9740b);
        this.g = null;
        return true;
    }

    public final void e(int i4) {
        int i10 = this.f9743e + i4;
        this.f9743e = i10;
        if (i10 == this.f9740b.limit()) {
            c();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f9742d == this.f9741c) {
            return -1;
        }
        if (this.f9744f) {
            int i4 = this.g[this.f9743e + this.f9745h] & 255;
            e(1);
            return i4;
        }
        int iD1 = ip1.f12412c.d1(this.f9743e + this.f9746i) & 255;
        e(1);
        return iD1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i10) {
        if (this.f9742d == this.f9741c) {
            return -1;
        }
        int iLimit = this.f9740b.limit();
        int i11 = this.f9743e;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f9744f) {
            System.arraycopy(this.g, i11 + this.f9745h, bArr, i4, i10);
            e(i10);
            return i10;
        }
        int iPosition = this.f9740b.position();
        this.f9740b.position(this.f9743e);
        this.f9740b.get(bArr, i4, i10);
        this.f9740b.position(iPosition);
        e(i10);
        return i10;
    }
}
