package ku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class r0 implements iu.e, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f14606a;

    /* renamed from: b, reason: collision with root package name */
    public final z f14607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14608c;

    /* renamed from: d, reason: collision with root package name */
    public int f14609d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f14610e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f14611f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f14612g;

    /* renamed from: h, reason: collision with root package name */
    public Object f14613h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f14614i;
    public final Object j;
    public final Object k;

    public r0(String str, z zVar, int i10) {
        this.f14606a = str;
        this.f14607b = zVar;
        this.f14608c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f14610e = strArr;
        int i12 = this.f14608c;
        this.f14611f = new List[i12];
        this.f14612g = new boolean[i12];
        this.f14613h = mq.x.f16946a;
        lq.j jVar = lq.j.PUBLICATION;
        final int i13 = 0;
        this.f14614i = kc.f.E(jVar, new ar.a(this) { // from class: ku.q0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0 f14601d;

            {
                this.f14601d = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lq.h] */
            @Override // ar.a
            public final Object c() {
                gu.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                gu.a[] aVarArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        z zVar2 = this.f14601d.f14607b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? p0.f14595b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.f14601d.f14607b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (gu.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return p0.c(arrayList);
                    default:
                        r0 r0Var = this.f14601d;
                        return Integer.valueOf(p0.e(r0Var, (iu.e[]) r0Var.j.getValue()));
                }
            }
        });
        final int i14 = 1;
        this.j = kc.f.E(jVar, new ar.a(this) { // from class: ku.q0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0 f14601d;

            {
                this.f14601d = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lq.h] */
            @Override // ar.a
            public final Object c() {
                gu.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                gu.a[] aVarArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        z zVar2 = this.f14601d.f14607b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? p0.f14595b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.f14601d.f14607b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (gu.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return p0.c(arrayList);
                    default:
                        r0 r0Var = this.f14601d;
                        return Integer.valueOf(p0.e(r0Var, (iu.e[]) r0Var.j.getValue()));
                }
            }
        });
        final int i15 = 2;
        this.k = kc.f.E(jVar, new ar.a(this) { // from class: ku.q0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0 f14601d;

            {
                this.f14601d = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lq.h] */
            @Override // ar.a
            public final Object c() {
                gu.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                gu.a[] aVarArrTypeParametersSerializers;
                switch (i15) {
                    case 0:
                        z zVar2 = this.f14601d.f14607b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? p0.f14595b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.f14601d.f14607b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (gu.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return p0.c(arrayList);
                    default:
                        r0 r0Var = this.f14601d;
                        return Integer.valueOf(p0.e(r0Var, (iu.e[]) r0Var.j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // ku.j
    public final Set a() {
        return this.f14613h.keySet();
    }

    public final void b(String str, boolean z10) {
        br.l.e(str, "name");
        int i10 = this.f14609d + 1;
        this.f14609d = i10;
        String[] strArr = this.f14610e;
        strArr[i10] = str;
        this.f14612g[i10] = z10;
        this.f14611f[i10] = null;
        if (i10 == this.f14608c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f14613h = map;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, lq.h] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            iu.e eVar = (iu.e) obj;
            if (this.f14606a.equals(eVar.h()) && Arrays.equals((iu.e[]) this.j.getValue(), (iu.e[]) ((r0) obj).j.getValue())) {
                int iK = eVar.k();
                int i10 = this.f14608c;
                if (i10 == iK) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (br.l.a(n(i11).h(), eVar.n(i11).h()) && br.l.a(n(i11).f(), eVar.n(i11).f())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // iu.e
    public i3.g f() {
        return iu.j.f13011d;
    }

    @Override // iu.e
    public boolean g() {
        return false;
    }

    @Override // iu.e
    public final List getAnnotations() {
        return mq.w.f16945a;
    }

    @Override // iu.e
    public final String h() {
        return this.f14606a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // iu.e
    public final boolean i() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // iu.e
    public final int j(String str) {
        br.l.e(str, "name");
        Integer num = (Integer) this.f14613h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // iu.e
    public final int k() {
        return this.f14608c;
    }

    @Override // iu.e
    public final String l(int i10) {
        return this.f14610e[i10];
    }

    @Override // iu.e
    public final List m(int i10) {
        List list = this.f14611f[i10];
        return list == null ? mq.w.f16945a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // iu.e
    public iu.e n(int i10) {
        return ((gu.a[]) this.f14614i.getValue())[i10].getDescriptor();
    }

    @Override // iu.e
    public final boolean o(int i10) {
        return this.f14612g[i10];
    }

    public String toString() {
        return mq.o.x0(vc.e.T(0, this.f14608c), ", ", this.f14606a.concat("("), ")", new cg.j(6, this), 24);
    }
}
