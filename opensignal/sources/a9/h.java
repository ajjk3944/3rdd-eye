package a9;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f248a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.h f249b;

    /* renamed from: c, reason: collision with root package name */
    public final String f250c;

    /* renamed from: d, reason: collision with root package name */
    public final long f251d;

    /* renamed from: e, reason: collision with root package name */
    public final f f252e;

    /* renamed from: f, reason: collision with root package name */
    public final long f253f;

    /* renamed from: g, reason: collision with root package name */
    public final String f254g;

    /* renamed from: h, reason: collision with root package name */
    public final List f255h;

    /* renamed from: i, reason: collision with root package name */
    public final y8.d f256i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final int f257l;

    /* renamed from: m, reason: collision with root package name */
    public final float f258m;

    /* renamed from: n, reason: collision with root package name */
    public final float f259n;

    /* renamed from: o, reason: collision with root package name */
    public final float f260o;

    /* renamed from: p, reason: collision with root package name */
    public final float f261p;

    /* renamed from: q, reason: collision with root package name */
    public final y8.a f262q;

    /* renamed from: r, reason: collision with root package name */
    public final q3.a f263r;

    /* renamed from: s, reason: collision with root package name */
    public final y8.b f264s;

    /* renamed from: t, reason: collision with root package name */
    public final List f265t;

    /* renamed from: u, reason: collision with root package name */
    public final g f266u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f267v;

    /* renamed from: w, reason: collision with root package name */
    public final z7.b f268w;

    /* renamed from: x, reason: collision with root package name */
    public final cj.a f269x;

    /* renamed from: y, reason: collision with root package name */
    public final z8.g f270y;

    public h(List list, r8.h hVar, String str, long j, f fVar, long j7, String str2, List list2, y8.d dVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, y8.a aVar, q3.a aVar2, List list3, g gVar, y8.b bVar, boolean z10, z7.b bVar2, cj.a aVar3, z8.g gVar2) {
        this.f248a = list;
        this.f249b = hVar;
        this.f250c = str;
        this.f251d = j;
        this.f252e = fVar;
        this.f253f = j7;
        this.f254g = str2;
        this.f255h = list2;
        this.f256i = dVar;
        this.j = i10;
        this.k = i11;
        this.f257l = i12;
        this.f258m = f10;
        this.f259n = f11;
        this.f260o = f12;
        this.f261p = f13;
        this.f262q = aVar;
        this.f263r = aVar2;
        this.f265t = list3;
        this.f266u = gVar;
        this.f264s = bVar;
        this.f267v = z10;
        this.f268w = bVar2;
        this.f269x = aVar3;
        this.f270y = gVar2;
    }

    public final String a(String str) {
        int i10;
        StringBuilder sbT = c7.a.t(str);
        sbT.append(this.f250c);
        sbT.append("\n");
        long j = this.f253f;
        r8.h hVar = this.f249b;
        h hVar2 = (h) hVar.f21331i.b(j);
        if (hVar2 != null) {
            sbT.append("\t\tParents: ");
            sbT.append(hVar2.f250c);
            for (h hVar3 = (h) hVar.f21331i.b(hVar2.f253f); hVar3 != null; hVar3 = (h) hVar.f21331i.b(hVar3.f253f)) {
                sbT.append("->");
                sbT.append(hVar3.f250c);
            }
            sbT.append(str);
            sbT.append("\n");
        }
        List list = this.f255h;
        if (!list.isEmpty()) {
            sbT.append(str);
            sbT.append("\tMasks: ");
            sbT.append(list.size());
            sbT.append("\n");
        }
        int i11 = this.j;
        if (i11 != 0 && (i10 = this.k) != 0) {
            sbT.append(str);
            sbT.append("\tBackground: ");
            sbT.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f257l)));
        }
        List list2 = this.f248a;
        if (!list2.isEmpty()) {
            sbT.append(str);
            sbT.append("\tShapes:\n");
            for (Object obj : list2) {
                sbT.append(str);
                sbT.append("\t\t");
                sbT.append(obj);
                sbT.append("\n");
            }
        }
        return sbT.toString();
    }

    public final String toString() {
        return a("");
    }
}
