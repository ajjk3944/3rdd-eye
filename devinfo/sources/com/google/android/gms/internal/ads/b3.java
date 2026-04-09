package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b3 implements y2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9563c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9565e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9566f;

    public b3(int i4, int i10, int i11, int i12, int i13, int i14) {
        this.f9561a = i4;
        this.f9562b = i10;
        this.f9563c = i11;
        this.f9564d = i12;
        this.f9565e = i13;
        this.f9566f = i14;
    }

    public final int a() {
        int i4 = this.f9561a;
        if (i4 == 1935960438) {
            return 2;
        }
        if (i4 == 1935963489) {
            return 1;
        }
        if (i4 == 1937012852) {
            return 3;
        }
        ls.t("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i4))));
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.y2
    public final int b() {
        return 1752331379;
    }
}
