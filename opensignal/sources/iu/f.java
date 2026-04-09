package iu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ku.p0;
import lq.q;
import mq.a0;
import mq.b0;
import mq.o;
import mq.p;
import mq.z;

/* loaded from: classes.dex */
public final class f implements e, ku.j {

    /* renamed from: a, reason: collision with root package name */
    public final String f12997a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.g f12998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12999c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13000d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f13001e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f13002f;

    /* renamed from: g, reason: collision with root package name */
    public final e[] f13003g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f13004h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f13005i;
    public final Map j;
    public final e[] k;

    /* renamed from: l, reason: collision with root package name */
    public final q f13006l;

    public f(String str, i3.g gVar, int i10, List list, a aVar) {
        br.l.e(str, "serialName");
        this.f12997a = str;
        this.f12998b = gVar;
        this.f12999c = i10;
        this.f13000d = aVar.f12983b;
        ArrayList arrayList = aVar.f12984c;
        br.l.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(b0.P(p.a0(arrayList, 12)));
        o.O0(arrayList, hashSet);
        this.f13001e = hashSet;
        int i11 = 0;
        this.f13002f = (String[]) arrayList.toArray(new String[0]);
        this.f13003g = p0.c(aVar.f12986e);
        this.f13004h = (List[]) aVar.f12987f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f12988g;
        br.l.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f13005i = zArr;
        String[] strArr = this.f13002f;
        br.l.e(strArr, "<this>");
        g gVar2 = new g(2, new androidx.lifecycle.p0(11, strArr));
        ArrayList arrayList3 = new ArrayList(p.a0(gVar2, 10));
        Iterator it2 = gVar2.iterator();
        while (true) {
            a0 a0Var = (a0) it2;
            if (!a0Var.f16922d.hasNext()) {
                this.j = b0.V(arrayList3);
                this.k = p0.c(list);
                this.f13006l = kc.f.F(new androidx.lifecycle.p0(7, this));
                return;
            }
            z zVar = (z) a0Var.next();
            arrayList3.add(new lq.l(zVar.f16949b, Integer.valueOf(zVar.f16948a)));
        }
    }

    @Override // ku.j
    public final Set a() {
        return this.f13001e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (br.l.a(this.f12997a, eVar.h()) && Arrays.equals(this.k, ((f) obj).k)) {
                int iK = eVar.k();
                int i10 = this.f12999c;
                if (i10 == iK) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        e[] eVarArr = this.f13003g;
                        if (br.l.a(eVarArr[i11].h(), eVar.n(i11).h()) && br.l.a(eVarArr[i11].f(), eVar.n(i11).f())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // iu.e
    public final i3.g f() {
        return this.f12998b;
    }

    @Override // iu.e
    public final boolean g() {
        return false;
    }

    @Override // iu.e
    public final List getAnnotations() {
        return this.f13000d;
    }

    @Override // iu.e
    public final String h() {
        return this.f12997a;
    }

    public final int hashCode() {
        return ((Number) this.f13006l.getValue()).intValue();
    }

    @Override // iu.e
    public final boolean i() {
        return false;
    }

    @Override // iu.e
    public final int j(String str) {
        br.l.e(str, "name");
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // iu.e
    public final int k() {
        return this.f12999c;
    }

    @Override // iu.e
    public final String l(int i10) {
        return this.f13002f[i10];
    }

    @Override // iu.e
    public final List m(int i10) {
        return this.f13004h[i10];
    }

    @Override // iu.e
    public final e n(int i10) {
        return this.f13003g[i10];
    }

    @Override // iu.e
    public final boolean o(int i10) {
        return this.f13005i[i10];
    }

    public final String toString() {
        return o.x0(vc.e.T(0, this.f12999c), ", ", h0.b.r(new StringBuilder(), this.f12997a, '('), ")", new cg.j(3, this), 24);
    }
}
