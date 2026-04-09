package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.fC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142fC extends AbstractC2003vB {

    /* renamed from: e, reason: collision with root package name */
    public final Zy f14037e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f14038f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f14039g;

    /* renamed from: h, reason: collision with root package name */
    public int f14040h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14041j;

    public C1142fC(byte[] bArr) {
        Zy zy = new Zy(bArr, 1);
        super(false);
        this.f14037e = zy;
        AbstractC0582Jp.m(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws C1359jE {
        b(te);
        this.f14038f = te.f11361a;
        byte[] bArr = this.f14037e.f12997a;
        this.f14039g = bArr;
        long j6 = te.f11363c;
        int length = bArr.length;
        if (j6 > length) {
            throw new C1359jE();
        }
        int i = (int) j6;
        this.f14040h = i;
        int i3 = length - i;
        this.i = i3;
        long j7 = te.f11364d;
        if (j7 != -1) {
            this.i = (int) Math.min(i3, j7);
        }
        this.f14041j = true;
        e(te);
        return j7 != -1 ? j7 : this.i;
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) {
        if (i3 == 0) {
            return 0;
        }
        int i6 = this.i;
        if (i6 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i6);
        byte[] bArr2 = this.f14039g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f14040h, bArr, i, iMin);
        this.f14040h += iMin;
        this.i -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f14038f;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() {
        if (this.f14041j) {
            this.f14041j = false;
            j();
        }
        this.f14038f = null;
        this.f14039g = null;
    }
}
