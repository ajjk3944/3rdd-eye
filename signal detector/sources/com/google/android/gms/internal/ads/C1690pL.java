package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.pL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1690pL extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f16161a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f16162b;

    /* renamed from: c, reason: collision with root package name */
    public int f16163c;

    /* renamed from: d, reason: collision with root package name */
    public int f16164d;

    /* renamed from: e, reason: collision with root package name */
    public int f16165e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16166f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f16167g;

    /* renamed from: h, reason: collision with root package name */
    public int f16168h;
    public long i;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.f16161a;
        do {
            this.f16164d++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f16162b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f16165e = this.f16162b.position();
        if (this.f16162b.hasArray()) {
            this.f16166f = true;
            this.f16167g = this.f16162b.array();
            this.f16168h = this.f16162b.arrayOffset();
            return true;
        }
        this.f16166f = false;
        this.i = WL.n(this.f16162b);
        this.f16167g = null;
        return true;
    }

    public final void b(int i) {
        int i3 = this.f16165e + i;
        this.f16165e = i3;
        if (i3 == this.f16162b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f16164d == this.f16163c) {
            return -1;
        }
        if (this.f16166f) {
            int i = this.f16167g[this.f16165e + this.f16168h] & 255;
            b(1);
            return i;
        }
        int iQ1 = WL.f12214c.q1(this.f16165e + this.i) & 255;
        b(1);
        return iQ1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) {
        if (this.f16164d == this.f16163c) {
            return -1;
        }
        int iLimit = this.f16162b.limit();
        int i6 = this.f16165e;
        int i7 = iLimit - i6;
        if (i3 > i7) {
            i3 = i7;
        }
        if (this.f16166f) {
            System.arraycopy(this.f16167g, i6 + this.f16168h, bArr, i, i3);
            b(i3);
            return i3;
        }
        int iPosition = this.f16162b.position();
        this.f16162b.position(this.f16165e);
        this.f16162b.get(bArr, i, i3);
        this.f16162b.position(iPosition);
        b(i3);
        return i3;
    }
}
