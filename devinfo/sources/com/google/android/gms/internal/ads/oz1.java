package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oz1 {

    /* renamed from: d, reason: collision with root package name */
    public static final oz1 f14819d = new oz1(new ii[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f14820a;

    /* renamed from: b, reason: collision with root package name */
    public final u51 f14821b;

    /* renamed from: c, reason: collision with root package name */
    public int f14822c;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
    }

    public oz1(ii... iiVarArr) {
        this.f14821b = x41.r(iiVarArr);
        this.f14820a = iiVarArr.length;
        int i4 = 0;
        while (i4 < this.f14821b.f17098d) {
            int i10 = i4 + 1;
            int i11 = i10;
            while (true) {
                u51 u51Var = this.f14821b;
                if (i11 < u51Var.f17098d) {
                    if (((ii) u51Var.get(i4)).equals(this.f14821b.get(i11))) {
                        ls.H("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i11++;
                }
            }
            i4 = i10;
        }
    }

    public final ii a(int i4) {
        return (ii) this.f14821b.get(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oz1.class != obj.getClass()) {
            return false;
        }
        oz1 oz1Var = (oz1) obj;
        return this.f14820a == oz1Var.f14820a && this.f14821b.equals(oz1Var.f14821b);
    }

    public final int hashCode() {
        int i4 = this.f14822c;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = this.f14821b.hashCode();
        this.f14822c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f14821b.toString();
    }
}
