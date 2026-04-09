package g1;

import d1.C5281a;
import e1.C5412a;
import j1.d;
import java.util.HashMap;

/* renamed from: g1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5850h {

    /* renamed from: v, reason: collision with root package name */
    public static float f47496v = Float.NaN;

    /* renamed from: a, reason: collision with root package name */
    public j1.e f47497a;

    /* renamed from: b, reason: collision with root package name */
    public int f47498b;

    /* renamed from: c, reason: collision with root package name */
    public int f47499c;

    /* renamed from: d, reason: collision with root package name */
    public int f47500d;

    /* renamed from: e, reason: collision with root package name */
    public int f47501e;

    /* renamed from: f, reason: collision with root package name */
    public float f47502f;

    /* renamed from: g, reason: collision with root package name */
    public float f47503g;

    /* renamed from: h, reason: collision with root package name */
    public float f47504h;

    /* renamed from: i, reason: collision with root package name */
    public float f47505i;

    /* renamed from: j, reason: collision with root package name */
    public float f47506j;

    /* renamed from: k, reason: collision with root package name */
    public float f47507k;

    /* renamed from: l, reason: collision with root package name */
    public float f47508l;

    /* renamed from: m, reason: collision with root package name */
    public float f47509m;

    /* renamed from: n, reason: collision with root package name */
    public float f47510n;

    /* renamed from: o, reason: collision with root package name */
    public float f47511o;

    /* renamed from: p, reason: collision with root package name */
    public float f47512p;

    /* renamed from: q, reason: collision with root package name */
    public float f47513q;

    /* renamed from: r, reason: collision with root package name */
    public int f47514r;

    /* renamed from: s, reason: collision with root package name */
    private final HashMap f47515s;

    /* renamed from: t, reason: collision with root package name */
    public String f47516t;

    /* renamed from: u, reason: collision with root package name */
    C5412a f47517u;

    public C5850h(j1.e eVar) {
        this.f47497a = null;
        this.f47498b = 0;
        this.f47499c = 0;
        this.f47500d = 0;
        this.f47501e = 0;
        this.f47502f = Float.NaN;
        this.f47503g = Float.NaN;
        this.f47504h = Float.NaN;
        this.f47505i = Float.NaN;
        this.f47506j = Float.NaN;
        this.f47507k = Float.NaN;
        this.f47508l = Float.NaN;
        this.f47509m = Float.NaN;
        this.f47510n = Float.NaN;
        this.f47511o = Float.NaN;
        this.f47512p = Float.NaN;
        this.f47513q = Float.NaN;
        this.f47514r = 0;
        this.f47515s = new HashMap();
        this.f47516t = null;
        this.f47497a = eVar;
    }

    private static void a(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private static void b(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void f(StringBuilder sb2, d.a aVar) {
        j1.d dVarL = this.f47497a.l(aVar);
        if (dVarL == null || dVarL.f49852f == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(aVar.name());
        sb2.append(": ['");
        String str = dVarL.f49852f.h().f49920o;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(dVarL.f49852f.k().name());
        sb2.append("', '");
        sb2.append(dVarL.f49853g);
        sb2.append("'],\n");
    }

    public String c() {
        j1.e eVar = this.f47497a;
        return eVar == null ? "unknown" : eVar.f49920o;
    }

    public boolean d() {
        return Float.isNaN(this.f47504h) && Float.isNaN(this.f47505i) && Float.isNaN(this.f47506j) && Float.isNaN(this.f47507k) && Float.isNaN(this.f47508l) && Float.isNaN(this.f47509m) && Float.isNaN(this.f47510n) && Float.isNaN(this.f47511o) && Float.isNaN(this.f47512p);
    }

    public StringBuilder e(StringBuilder sb2, boolean z10) {
        sb2.append("{\n");
        b(sb2, "left", this.f47498b);
        b(sb2, "top", this.f47499c);
        b(sb2, "right", this.f47500d);
        b(sb2, "bottom", this.f47501e);
        a(sb2, "pivotX", this.f47502f);
        a(sb2, "pivotY", this.f47503g);
        a(sb2, "rotationX", this.f47504h);
        a(sb2, "rotationY", this.f47505i);
        a(sb2, "rotationZ", this.f47506j);
        a(sb2, "translationX", this.f47507k);
        a(sb2, "translationY", this.f47508l);
        a(sb2, "translationZ", this.f47509m);
        a(sb2, "scaleX", this.f47510n);
        a(sb2, "scaleY", this.f47511o);
        a(sb2, "alpha", this.f47512p);
        b(sb2, "visibility", this.f47514r);
        a(sb2, "interpolatedPos", this.f47513q);
        if (this.f47497a != null) {
            for (d.a aVar : d.a.values()) {
                f(sb2, aVar);
            }
        }
        if (z10) {
            a(sb2, "phone_orientation", f47496v);
        }
        if (z10) {
            a(sb2, "phone_orientation", f47496v);
        }
        if (this.f47515s.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.f47515s.keySet()) {
                C5281a c5281a = (C5281a) this.f47515s.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (c5281a.h()) {
                    case 900:
                        sb2.append(c5281a.e());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb2.append(c5281a.d());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(C5281a.a(c5281a.e()));
                        sb2.append("',\n");
                        break;
                    case 903:
                        sb2.append("'");
                        sb2.append(c5281a.g());
                        sb2.append("',\n");
                        break;
                    case 904:
                        sb2.append("'");
                        sb2.append(c5281a.c());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void g(String str, int i10, float f10) {
        if (this.f47515s.containsKey(str)) {
            ((C5281a) this.f47515s.get(str)).i(f10);
        } else {
            this.f47515s.put(str, new C5281a(str, i10, f10));
        }
    }

    public void h(String str, int i10, int i11) {
        if (this.f47515s.containsKey(str)) {
            ((C5281a) this.f47515s.get(str)).j(i11);
        } else {
            this.f47515s.put(str, new C5281a(str, i10, i11));
        }
    }

    void i(C5412a c5412a) {
        this.f47517u = c5412a;
    }

    public C5850h j() {
        j1.e eVar = this.f47497a;
        if (eVar != null) {
            this.f47498b = eVar.y();
            this.f47499c = this.f47497a.J();
            this.f47500d = this.f47497a.H();
            this.f47501e = this.f47497a.o();
            k(this.f47497a.f49918n);
        }
        return this;
    }

    public void k(C5850h c5850h) {
        if (c5850h == null) {
            return;
        }
        this.f47502f = c5850h.f47502f;
        this.f47503g = c5850h.f47503g;
        this.f47504h = c5850h.f47504h;
        this.f47505i = c5850h.f47505i;
        this.f47506j = c5850h.f47506j;
        this.f47507k = c5850h.f47507k;
        this.f47508l = c5850h.f47508l;
        this.f47509m = c5850h.f47509m;
        this.f47510n = c5850h.f47510n;
        this.f47511o = c5850h.f47511o;
        this.f47512p = c5850h.f47512p;
        this.f47514r = c5850h.f47514r;
        i(c5850h.f47517u);
        this.f47515s.clear();
        for (C5281a c5281a : c5850h.f47515s.values()) {
            this.f47515s.put(c5281a.f(), c5281a.b());
        }
    }

    public C5850h(C5850h c5850h) {
        this.f47497a = null;
        this.f47498b = 0;
        this.f47499c = 0;
        this.f47500d = 0;
        this.f47501e = 0;
        this.f47502f = Float.NaN;
        this.f47503g = Float.NaN;
        this.f47504h = Float.NaN;
        this.f47505i = Float.NaN;
        this.f47506j = Float.NaN;
        this.f47507k = Float.NaN;
        this.f47508l = Float.NaN;
        this.f47509m = Float.NaN;
        this.f47510n = Float.NaN;
        this.f47511o = Float.NaN;
        this.f47512p = Float.NaN;
        this.f47513q = Float.NaN;
        this.f47514r = 0;
        this.f47515s = new HashMap();
        this.f47516t = null;
        this.f47497a = c5850h.f47497a;
        this.f47498b = c5850h.f47498b;
        this.f47499c = c5850h.f47499c;
        this.f47500d = c5850h.f47500d;
        this.f47501e = c5850h.f47501e;
        k(c5850h);
    }
}
