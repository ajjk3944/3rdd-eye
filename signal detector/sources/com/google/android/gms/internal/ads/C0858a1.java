package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858a1 implements X0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13015a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13018d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13019e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13020f;

    public C0858a1(int i, int i3, int i6, int i7, int i8, int i9) {
        this.f13015a = i;
        this.f13016b = i3;
        this.f13017c = i6;
        this.f13018d = i7;
        this.f13019e = i8;
        this.f13020f = i9;
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int a() {
        return 1752331379;
    }

    public final int b() {
        int i = this.f13015a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        AbstractC2022vd.v("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i))));
        return -1;
    }
}
