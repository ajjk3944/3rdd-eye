package n7;

import androidx.lifecycle.f1;
import f7.j;
import java.util.List;
import java.util.Locale;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f29803a;

    /* renamed from: b, reason: collision with root package name */
    public final j f29804b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29805c;

    /* renamed from: d, reason: collision with root package name */
    public final long f29806d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29807e;

    /* renamed from: f, reason: collision with root package name */
    public final long f29808f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final List f29809h;

    /* renamed from: i, reason: collision with root package name */
    public final l7.e f29810i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f29811k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29812l;

    /* renamed from: m, reason: collision with root package name */
    public final float f29813m;

    /* renamed from: n, reason: collision with root package name */
    public final float f29814n;

    /* renamed from: o, reason: collision with root package name */
    public final float f29815o;

    /* renamed from: p, reason: collision with root package name */
    public final float f29816p;

    /* renamed from: q, reason: collision with root package name */
    public final l7.a f29817q;

    /* renamed from: r, reason: collision with root package name */
    public final o f29818r;

    /* renamed from: s, reason: collision with root package name */
    public final l7.b f29819s;

    /* renamed from: t, reason: collision with root package name */
    public final List f29820t;

    /* renamed from: u, reason: collision with root package name */
    public final int f29821u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f29822v;

    /* renamed from: w, reason: collision with root package name */
    public final km.i f29823w;

    /* renamed from: x, reason: collision with root package name */
    public final f1 f29824x;

    /* renamed from: y, reason: collision with root package name */
    public final int f29825y;

    public d(List list, j jVar, String str, long j, int i4, long j8, String str2, List list2, l7.e eVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, l7.a aVar, o oVar, List list3, int i13, l7.b bVar, boolean z3, km.i iVar, f1 f1Var, int i14) {
        this.f29803a = list;
        this.f29804b = jVar;
        this.f29805c = str;
        this.f29806d = j;
        this.f29807e = i4;
        this.f29808f = j8;
        this.g = str2;
        this.f29809h = list2;
        this.f29810i = eVar;
        this.j = i10;
        this.f29811k = i11;
        this.f29812l = i12;
        this.f29813m = f10;
        this.f29814n = f11;
        this.f29815o = f12;
        this.f29816p = f13;
        this.f29817q = aVar;
        this.f29818r = oVar;
        this.f29820t = list3;
        this.f29821u = i13;
        this.f29819s = bVar;
        this.f29822v = z3;
        this.f29823w = iVar;
        this.f29824x = f1Var;
        this.f29825y = i14;
    }

    public final String a(String str) {
        int i4;
        StringBuilder sbZ = d.h.z(str);
        sbZ.append(this.f29805c);
        sbZ.append("\n");
        long j = this.f29808f;
        j jVar = this.f29804b;
        d dVar = (d) jVar.f23757i.e(j);
        if (dVar != null) {
            sbZ.append("\t\tParents: ");
            sbZ.append(dVar.f29805c);
            for (d dVar2 = (d) jVar.f23757i.e(dVar.f29808f); dVar2 != null; dVar2 = (d) jVar.f23757i.e(dVar2.f29808f)) {
                sbZ.append("->");
                sbZ.append(dVar2.f29805c);
            }
            sbZ.append(str);
            sbZ.append("\n");
        }
        List list = this.f29809h;
        if (!list.isEmpty()) {
            sbZ.append(str);
            sbZ.append("\tMasks: ");
            sbZ.append(list.size());
            sbZ.append("\n");
        }
        int i10 = this.j;
        if (i10 != 0 && (i4 = this.f29811k) != 0) {
            sbZ.append(str);
            sbZ.append("\tBackground: ");
            sbZ.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i4), Integer.valueOf(this.f29812l)));
        }
        List list2 = this.f29803a;
        if (!list2.isEmpty()) {
            sbZ.append(str);
            sbZ.append("\tShapes:\n");
            for (Object obj : list2) {
                sbZ.append(str);
                sbZ.append("\t\t");
                sbZ.append(obj);
                sbZ.append("\n");
            }
        }
        return sbZ.toString();
    }

    public final String toString() {
        return a("");
    }
}
