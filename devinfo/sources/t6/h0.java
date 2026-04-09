package t6;

import java.util.HashSet;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f34357a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f34358b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f34359c;

    /* renamed from: d, reason: collision with root package name */
    public final h f34360d;

    /* renamed from: e, reason: collision with root package name */
    public final h f34361e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34362f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final e f34363h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34364i;
    public final f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34365k;

    /* renamed from: l, reason: collision with root package name */
    public final int f34366l;

    public h0(UUID uuid, g0 g0Var, HashSet hashSet, h hVar, h hVar2, int i4, int i10, e eVar, long j, f0 f0Var, long j8, int i11) {
        nk.k.e(hVar, "outputData");
        nk.k.e(hVar2, "progress");
        this.f34357a = uuid;
        this.f34358b = g0Var;
        this.f34359c = hashSet;
        this.f34360d = hVar;
        this.f34361e = hVar2;
        this.f34362f = i4;
        this.g = i10;
        this.f34363h = eVar;
        this.f34364i = j;
        this.j = f0Var;
        this.f34365k = j8;
        this.f34366l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h0.class.equals(obj.getClass())) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f34362f == h0Var.f34362f && this.g == h0Var.g && this.f34357a.equals(h0Var.f34357a) && this.f34358b == h0Var.f34358b && nk.k.a(this.f34360d, h0Var.f34360d) && this.f34363h.equals(h0Var.f34363h) && this.f34364i == h0Var.f34364i && nk.k.a(this.j, h0Var.j) && this.f34365k == h0Var.f34365k && this.f34366l == h0Var.f34366l && this.f34359c.equals(h0Var.f34359c)) {
            return nk.k.a(this.f34361e, h0Var.f34361e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f34363h.hashCode() + ((((((this.f34361e.hashCode() + ((this.f34359c.hashCode() + ((this.f34360d.hashCode() + ((this.f34358b.hashCode() + (this.f34357a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f34362f) * 31) + this.g) * 31)) * 31;
        long j = this.f34364i;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        f0 f0Var = this.j;
        int iHashCode2 = (i4 + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
        long j8 = this.f34365k;
        return ((iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f34366l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f34357a + "', state=" + this.f34358b + ", outputData=" + this.f34360d + ", tags=" + this.f34359c + ", progress=" + this.f34361e + ", runAttemptCount=" + this.f34362f + ", generation=" + this.g + ", constraints=" + this.f34363h + ", initialDelayMillis=" + this.f34364i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.f34365k + "}, stopReason=" + this.f34366l;
    }
}
