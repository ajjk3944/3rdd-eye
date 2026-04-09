package k2;

import com.google.android.gms.internal.measurement.e5;

/* loaded from: classes.dex */
public final class r implements Comparable {
    public static final r B;

    /* renamed from: d, reason: collision with root package name */
    public static final r f13999d;

    /* renamed from: g, reason: collision with root package name */
    public static final r f14000g;

    /* renamed from: r, reason: collision with root package name */
    public static final r f14001r;

    /* renamed from: x, reason: collision with root package name */
    public static final r f14002x;

    /* renamed from: y, reason: collision with root package name */
    public static final r f14003y;

    /* renamed from: a, reason: collision with root package name */
    public final int f14004a;

    static {
        r rVar = new r(100);
        r rVar2 = new r(200);
        r rVar3 = new r(300);
        r rVar4 = new r(400);
        f13999d = rVar4;
        r rVar5 = new r(500);
        f14000g = rVar5;
        r rVar6 = new r(600);
        f14001r = rVar6;
        r rVar7 = new r(700);
        r rVar8 = new r(800);
        r rVar9 = new r(900);
        f14002x = rVar4;
        f14003y = rVar5;
        B = rVar7;
        e5.I(rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9);
    }

    public r(int i10) {
        this.f14004a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        m2.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        return br.l.g(this.f14004a, rVar.f14004a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f14004a == ((r) obj).f14004a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14004a;
    }

    public final String toString() {
        return c7.a.q(new StringBuilder("FontWeight(weight="), this.f14004a, ')');
    }
}
