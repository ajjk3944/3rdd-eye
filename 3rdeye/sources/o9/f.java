package O9;

import N7.B8;
import Q9.C1545n0;
import Q9.InterfaceC1542m;
import b9.C2001h;
import b9.p;
import c9.C2077A;
import c9.C2078B;
import c9.C2089j;
import c9.C2092m;
import c9.C2097r;
import c9.C2102w;
import c9.C2103x;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import t4.C5606d;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes3.dex */
public final class f implements e, InterfaceC1542m {

    /* renamed from: a, reason: collision with root package name */
    public final String f10502a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10503b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10504c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Annotation> f10505d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f10506e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f10507f;

    /* renamed from: g, reason: collision with root package name */
    public final e[] f10508g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Annotation>[] f10509h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Integer> f10510j;

    /* renamed from: k, reason: collision with root package name */
    public final e[] f10511k;

    /* renamed from: l, reason: collision with root package name */
    public final p f10512l;

    /* compiled from: SerialDescriptors.kt */
    public static final class a extends m implements InterfaceC5480a<Integer> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final Integer invoke() {
            f fVar = f.this;
            return Integer.valueOf(C5606d.y(fVar, fVar.f10511k));
        }
    }

    /* compiled from: SerialDescriptors.kt */
    public static final class b extends m implements p9.l<Integer, CharSequence> {
        public b() {
            super(1);
        }

        @Override // p9.l
        public final CharSequence invoke(Integer num) {
            int iIntValue = num.intValue();
            StringBuilder sb = new StringBuilder();
            f fVar = f.this;
            sb.append(fVar.f10507f[iIntValue]);
            sb.append(": ");
            sb.append(fVar.f10508g[iIntValue].a());
            return sb.toString();
        }
    }

    public f(String serialName, k kind, int i, List<? extends e> list, O9.a aVar) {
        kotlin.jvm.internal.l.f(serialName, "serialName");
        kotlin.jvm.internal.l.f(kind, "kind");
        this.f10502a = serialName;
        this.f10503b = kind;
        this.f10504c = i;
        this.f10505d = aVar.f10482b;
        ArrayList arrayList = aVar.f10483c;
        kotlin.jvm.internal.l.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(C2077A.l(C2092m.T(arrayList, 12)));
        C2097r.E0(arrayList, hashSet);
        this.f10506e = hashSet;
        int i10 = 0;
        this.f10507f = (String[]) arrayList.toArray(new String[0]);
        this.f10508g = C1545n0.b(aVar.f10485e);
        this.f10509h = (List[]) aVar.f10486f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f10487g;
        kotlin.jvm.internal.l.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.i = zArr;
        String[] strArr = this.f10507f;
        kotlin.jvm.internal.l.f(strArr, "<this>");
        C2103x c2103x = new C2103x(new C2089j(strArr, 0));
        ArrayList arrayList3 = new ArrayList(C2092m.T(c2103x, 10));
        Iterator it2 = c2103x.iterator();
        while (true) {
            g gVar = (g) it2;
            if (!((Iterator) gVar.f10517d).hasNext()) {
                this.f10510j = C2078B.s(arrayList3);
                this.f10511k = C1545n0.b(list);
                this.f10512l = C2001h.b(new a());
                return;
            }
            C2102w c2102w = (C2102w) gVar.next();
            arrayList3.add(new b9.l(c2102w.f18585b, Integer.valueOf(c2102w.f18584a)));
        }
    }

    @Override // O9.e
    public final String a() {
        return this.f10502a;
    }

    @Override // Q9.InterfaceC1542m
    public final Set<String> b() {
        return this.f10506e;
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        Integer num = this.f10510j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // O9.e
    public final k e() {
        return this.f10503b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (kotlin.jvm.internal.l.b(this.f10502a, eVar.a()) && Arrays.equals(this.f10511k, ((f) obj).f10511k)) {
                int iF = eVar.f();
                int i = this.f10504c;
                if (i == iF) {
                    for (int i10 = 0; i10 < i; i10++) {
                        e[] eVarArr = this.f10508g;
                        if (kotlin.jvm.internal.l.b(eVarArr[i10].a(), eVar.i(i10).a()) && kotlin.jvm.internal.l.b(eVarArr[i10].e(), eVar.i(i10).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // O9.e
    public final int f() {
        return this.f10504c;
    }

    @Override // O9.e
    public final String g(int i) {
        return this.f10507f[i];
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return this.f10505d;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        return this.f10509h[i];
    }

    public final int hashCode() {
        return ((Number) this.f10512l.getValue()).intValue();
    }

    @Override // O9.e
    public final e i(int i) {
        return this.f10508g[i];
    }

    @Override // O9.e
    public final boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return C2097r.u0(v9.h.O(0, this.f10504c), ", ", B8.j(new StringBuilder(), this.f10502a, '('), ")", new b(), 24);
    }
}
