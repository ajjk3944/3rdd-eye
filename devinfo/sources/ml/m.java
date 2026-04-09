package ml;

import b7.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import zj.s;
import zj.t;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class m implements kl.d, b {

    /* renamed from: a, reason: collision with root package name */
    public final String f29422a;

    /* renamed from: b, reason: collision with root package name */
    public final e f29423b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29424c;

    /* renamed from: d, reason: collision with root package name */
    public int f29425d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f29426e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f29427f;
    public final boolean[] g;

    /* renamed from: h, reason: collision with root package name */
    public Object f29428h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f29429i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f29430k;

    public m(String str, e eVar, int i4) {
        this.f29422a = str;
        this.f29423b = eVar;
        this.f29424c = i4;
        String[] strArr = new String[i4];
        for (int i10 = 0; i10 < i4; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f29426e = strArr;
        int i11 = this.f29424c;
        this.f29427f = new List[i11];
        this.g = new boolean[i11];
        this.f29428h = t.f38318a;
        final int i12 = 0;
        mk.a aVar = new mk.a(this) { // from class: ml.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f29421b;

            {
                this.f29421b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yj.f] */
            @Override // mk.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f29421b.f29423b.c();
                    default:
                        m mVar = this.f29421b;
                        kl.d[] dVarArr = (kl.d[]) mVar.j.getValue();
                        nk.k.e(dVarArr, "typeParams");
                        int iHashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(dVarArr);
                        int iF = mVar.f();
                        int i13 = 1;
                        while (true) {
                            int iHashCode2 = 0;
                            if (iF > 0) {
                                int i14 = iF - 1;
                                int i15 = i13 * 31;
                                String strA = mVar.j(mVar.f() - iF).a();
                                if (strA != null) {
                                    iHashCode2 = strA.hashCode();
                                }
                                i13 = i15 + iHashCode2;
                                iF = i14;
                            } else {
                                int iF2 = mVar.f();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iF2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + i13) * 31) + iHashCode3);
                                    }
                                    int i16 = iF2 - 1;
                                    int i17 = iHashCode3 * 31;
                                    ii.a aVarE = mVar.j(mVar.f() - iF2).e();
                                    iHashCode3 = i17 + (aVarE != null ? aVarE.hashCode() : 0);
                                    iF2 = i16;
                                }
                            }
                        }
                }
            }
        };
        yj.g gVar = yj.g.f37635a;
        this.f29429i = a.a.t(gVar, aVar);
        this.j = a.a.t(gVar, new b6.a(this));
        final int i13 = 1;
        this.f29430k = a.a.t(gVar, new mk.a(this) { // from class: ml.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f29421b;

            {
                this.f29421b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yj.f] */
            @Override // mk.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return this.f29421b.f29423b.c();
                    default:
                        m mVar = this.f29421b;
                        kl.d[] dVarArr = (kl.d[]) mVar.j.getValue();
                        nk.k.e(dVarArr, "typeParams");
                        int iHashCode = (mVar.a().hashCode() * 31) + Arrays.hashCode(dVarArr);
                        int iF = mVar.f();
                        int i132 = 1;
                        while (true) {
                            int iHashCode2 = 0;
                            if (iF > 0) {
                                int i14 = iF - 1;
                                int i15 = i132 * 31;
                                String strA = mVar.j(mVar.f() - iF).a();
                                if (strA != null) {
                                    iHashCode2 = strA.hashCode();
                                }
                                i132 = i15 + iHashCode2;
                                iF = i14;
                            } else {
                                int iF2 = mVar.f();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iF2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + i132) * 31) + iHashCode3);
                                    }
                                    int i16 = iF2 - 1;
                                    int i17 = iHashCode3 * 31;
                                    ii.a aVarE = mVar.j(mVar.f() - iF2).e();
                                    iHashCode3 = i17 + (aVarE != null ? aVarE.hashCode() : 0);
                                    iF2 = i16;
                                }
                            }
                        }
                }
            }
        });
    }

    @Override // kl.d
    public final String a() {
        return this.f29422a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // ml.b
    public final Set b() {
        return this.f29428h.keySet();
    }

    @Override // kl.d
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kl.d
    public final int d(String str) {
        nk.k.e(str, "name");
        Integer num = (Integer) this.f29428h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kl.d
    public final ii.a e() {
        return kl.f.f28378c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, yj.f] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            kl.d dVar = (kl.d) obj;
            if (this.f29422a.equals(dVar.a()) && Arrays.equals((kl.d[]) this.j.getValue(), (kl.d[]) ((m) obj).j.getValue())) {
                int iF = dVar.f();
                int i4 = this.f29424c;
                if (i4 == iF) {
                    for (int i10 = 0; i10 < i4; i10++) {
                        if (nk.k.a(j(i10).a(), dVar.j(i10).a()) && nk.k.a(j(i10).e(), dVar.j(i10).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kl.d
    public final int f() {
        return this.f29424c;
    }

    @Override // kl.d
    public final String g(int i4) {
        return this.f29426e[i4];
    }

    @Override // kl.d
    public final List getAnnotations() {
        return s.f38317a;
    }

    @Override // kl.d
    public boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yj.f] */
    public int hashCode() {
        return ((Number) this.f29430k.getValue()).intValue();
    }

    @Override // kl.d
    public final List i(int i4) {
        List list = this.f29427f[i4];
        return list == null ? s.f38317a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yj.f] */
    @Override // kl.d
    public final kl.d j(int i4) {
        return ((il.a[]) this.f29429i.getValue())[i4].d();
    }

    @Override // kl.d
    public final boolean k(int i4) {
        return this.g[i4];
    }

    public final void l(String str, boolean z3) {
        int i4 = this.f29425d + 1;
        this.f29425d = i4;
        String[] strArr = this.f29426e;
        strArr[i4] = str;
        this.g[i4] = z3;
        this.f29427f[i4] = null;
        if (i4 == this.f29424c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f29428h = map;
        }
    }

    public final String toString() {
        return zj.n.g0(ci.b.E(0, this.f29424c), ", ", this.f29422a.concat("("), ")", new u(15, this), 24);
    }
}
