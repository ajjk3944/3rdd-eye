package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209gO {

    /* renamed from: a, reason: collision with root package name */
    public final C1749qQ f14261a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14262b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14263c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14264d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14265e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14266f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14267g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14268h;

    public C1209gO(C1749qQ c1749qQ, long j6, long j7, long j8, long j9, boolean z6, boolean z7, boolean z8) {
        AbstractC0582Jp.m(!z8 || z6);
        AbstractC0582Jp.m(!z7 || z6);
        this.f14261a = c1749qQ;
        this.f14262b = j6;
        this.f14263c = j7;
        this.f14264d = j8;
        this.f14265e = j9;
        this.f14266f = z6;
        this.f14267g = z7;
        this.f14268h = z8;
    }

    public final C1209gO a(long j6) {
        return j6 == this.f14262b ? this : new C1209gO(this.f14261a, j6, this.f14263c, this.f14264d, this.f14265e, this.f14266f, this.f14267g, this.f14268h);
    }

    public final C1209gO b(long j6) {
        return j6 == this.f14263c ? this : new C1209gO(this.f14261a, this.f14262b, j6, this.f14264d, this.f14265e, this.f14266f, this.f14267g, this.f14268h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1209gO.class == obj.getClass()) {
            C1209gO c1209gO = (C1209gO) obj;
            if (this.f14262b == c1209gO.f14262b && this.f14263c == c1209gO.f14263c && this.f14264d == c1209gO.f14264d && this.f14265e == c1209gO.f14265e && this.f14266f == c1209gO.f14266f && this.f14267g == c1209gO.f14267g && this.f14268h == c1209gO.f14268h && Objects.equals(this.f14261a, c1209gO.f14261a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f14261a.hashCode() + 527) * 31) + ((int) this.f14262b)) * 31) + ((int) this.f14263c)) * 31) + ((int) this.f14264d)) * 31) + ((int) this.f14265e)) * 29791) + (this.f14266f ? 1 : 0)) * 31) + (this.f14267g ? 1 : 0)) * 31) + (this.f14268h ? 1 : 0);
    }
}
