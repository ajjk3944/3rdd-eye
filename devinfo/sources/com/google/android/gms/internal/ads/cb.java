package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cb extends wr1 {

    /* renamed from: i, reason: collision with root package name */
    public int f10061i;
    public Date j;

    /* renamed from: k, reason: collision with root package name */
    public Date f10062k;

    /* renamed from: l, reason: collision with root package name */
    public long f10063l;

    /* renamed from: m, reason: collision with root package name */
    public long f10064m;

    /* renamed from: n, reason: collision with root package name */
    public double f10065n;

    /* renamed from: o, reason: collision with root package name */
    public float f10066o;

    /* renamed from: p, reason: collision with root package name */
    public bs1 f10067p;

    /* renamed from: q, reason: collision with root package name */
    public long f10068q;

    @Override // com.google.android.gms.internal.ads.wr1
    public final void b(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.get();
        if (i4 < 0) {
            i4 += 256;
        }
        this.f10061i = i4;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f18151b) {
            d();
        }
        if (this.f10061i == 1) {
            this.j = yo0.h(jz.p(byteBuffer));
            this.f10062k = yo0.h(jz.p(byteBuffer));
            this.f10063l = jz.c(byteBuffer);
            this.f10064m = jz.p(byteBuffer);
        } else {
            this.j = yo0.h(jz.c(byteBuffer));
            this.f10062k = yo0.h(jz.c(byteBuffer));
            this.f10063l = jz.c(byteBuffer);
            this.f10064m = jz.c(byteBuffer);
        }
        this.f10065n = jz.r(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f10066o = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        jz.c(byteBuffer);
        jz.c(byteBuffer);
        this.f10067p = new bs1(jz.r(byteBuffer), jz.r(byteBuffer), jz.r(byteBuffer), jz.r(byteBuffer), jz.u(byteBuffer), jz.u(byteBuffer), jz.u(byteBuffer), jz.r(byteBuffer), jz.r(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f10068q = jz.c(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.j);
        sb2.append(";modificationTime=");
        sb2.append(this.f10062k);
        sb2.append(";timescale=");
        sb2.append(this.f10063l);
        sb2.append(";duration=");
        sb2.append(this.f10064m);
        sb2.append(";rate=");
        sb2.append(this.f10065n);
        sb2.append(";volume=");
        sb2.append(this.f10066o);
        sb2.append(";matrix=");
        sb2.append(this.f10067p);
        sb2.append(";nextTrackId=");
        return je.u.s(this.f10068q, "]", sb2);
    }
}
