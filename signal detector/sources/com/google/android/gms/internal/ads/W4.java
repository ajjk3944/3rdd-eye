package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class W4 extends AbstractC1368jN {

    /* renamed from: C, reason: collision with root package name */
    public float f12155C;

    /* renamed from: D, reason: collision with root package name */
    public C1638oN f12156D;

    /* renamed from: E, reason: collision with root package name */
    public long f12157E;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Date f12158j;

    /* renamed from: k, reason: collision with root package name */
    public Date f12159k;

    /* renamed from: l, reason: collision with root package name */
    public long f12160l;

    /* renamed from: m, reason: collision with root package name */
    public long f12161m;

    /* renamed from: n, reason: collision with root package name */
    public double f12162n;

    @Override // com.google.android.gms.internal.ads.AbstractC1368jN
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.i = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f14932b) {
            d();
        }
        if (this.i == 1) {
            this.f12158j = AbstractC1984ut.h(AbstractC0709Rg.p(byteBuffer));
            this.f12159k = AbstractC1984ut.h(AbstractC0709Rg.p(byteBuffer));
            this.f12160l = AbstractC0709Rg.a(byteBuffer);
            this.f12161m = AbstractC0709Rg.p(byteBuffer);
        } else {
            this.f12158j = AbstractC1984ut.h(AbstractC0709Rg.a(byteBuffer));
            this.f12159k = AbstractC1984ut.h(AbstractC0709Rg.a(byteBuffer));
            this.f12160l = AbstractC0709Rg.a(byteBuffer);
            this.f12161m = AbstractC0709Rg.a(byteBuffer);
        }
        this.f12162n = AbstractC0709Rg.r(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f12155C = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        AbstractC0709Rg.a(byteBuffer);
        AbstractC0709Rg.a(byteBuffer);
        this.f12156D = new C1638oN(AbstractC0709Rg.r(byteBuffer), AbstractC0709Rg.r(byteBuffer), AbstractC0709Rg.r(byteBuffer), AbstractC0709Rg.r(byteBuffer), AbstractC0709Rg.t(byteBuffer), AbstractC0709Rg.t(byteBuffer), AbstractC0709Rg.t(byteBuffer), AbstractC0709Rg.r(byteBuffer), AbstractC0709Rg.r(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f12157E = AbstractC0709Rg.a(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f12158j + ";modificationTime=" + this.f12159k + ";timescale=" + this.f12160l + ";duration=" + this.f12161m + ";rate=" + this.f12162n + ";volume=" + this.f12155C + ";matrix=" + this.f12156D + ";nextTrackId=" + this.f12157E + "]";
    }
}
