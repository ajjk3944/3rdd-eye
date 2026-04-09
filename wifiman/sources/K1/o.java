package k1;

import c1.C4188d;
import j1.AbstractC6242b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f51073g;

    /* renamed from: b, reason: collision with root package name */
    int f51075b;

    /* renamed from: d, reason: collision with root package name */
    int f51077d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f51074a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    boolean f51076c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f51078e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f51079f = -1;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference f51080a;

        /* renamed from: b, reason: collision with root package name */
        int f51081b;

        /* renamed from: c, reason: collision with root package name */
        int f51082c;

        /* renamed from: d, reason: collision with root package name */
        int f51083d;

        /* renamed from: e, reason: collision with root package name */
        int f51084e;

        /* renamed from: f, reason: collision with root package name */
        int f51085f;

        /* renamed from: g, reason: collision with root package name */
        int f51086g;

        a(j1.e eVar, C4188d c4188d, int i10) {
            this.f51080a = new WeakReference(eVar);
            this.f51081b = c4188d.x(eVar.f49879N);
            this.f51082c = c4188d.x(eVar.f49880O);
            this.f51083d = c4188d.x(eVar.f49881P);
            this.f51084e = c4188d.x(eVar.f49882Q);
            this.f51085f = c4188d.x(eVar.f49883R);
            this.f51086g = i10;
        }
    }

    public o(int i10) {
        int i11 = f51073g;
        f51073g = i11 + 1;
        this.f51075b = i11;
        this.f51077d = i10;
    }

    private String e() {
        int i10 = this.f51077d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(C4188d c4188d, ArrayList arrayList, int i10) {
        int iX;
        int iX2;
        j1.f fVar = (j1.f) ((j1.e) arrayList.get(0)).F();
        c4188d.D();
        fVar.d(c4188d, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((j1.e) arrayList.get(i11)).d(c4188d, false);
        }
        if (i10 == 0 && fVar.f49955V0 > 0) {
            AbstractC6242b.b(fVar, c4188d, arrayList, 0);
        }
        if (i10 == 1 && fVar.f49956W0 > 0) {
            AbstractC6242b.b(fVar, c4188d, arrayList, 1);
        }
        try {
            c4188d.z();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f51078e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f51078e.add(new a((j1.e) arrayList.get(i12), c4188d, i10));
        }
        if (i10 == 0) {
            iX = c4188d.x(fVar.f49879N);
            iX2 = c4188d.x(fVar.f49881P);
            c4188d.D();
        } else {
            iX = c4188d.x(fVar.f49880O);
            iX2 = c4188d.x(fVar.f49882Q);
            c4188d.D();
        }
        return iX2 - iX;
    }

    public boolean a(j1.e eVar) {
        if (this.f51074a.contains(eVar)) {
            return false;
        }
        this.f51074a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f51074a.size();
        if (this.f51079f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f51079f == oVar.f51075b) {
                    g(this.f51077d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f51075b;
    }

    public int d() {
        return this.f51077d;
    }

    public int f(C4188d c4188d, int i10) {
        if (this.f51074a.size() == 0) {
            return 0;
        }
        return j(c4188d, this.f51074a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator it = this.f51074a.iterator();
        while (it.hasNext()) {
            j1.e eVar = (j1.e) it.next();
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.f49872H0 = oVar.c();
            } else {
                eVar.f49874I0 = oVar.c();
            }
        }
        this.f51079f = oVar.f51075b;
    }

    public void h(boolean z10) {
        this.f51076c = z10;
    }

    public void i(int i10) {
        this.f51077d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f51075b + "] <";
        Iterator it = this.f51074a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((j1.e) it.next()).q();
        }
        return str + " >";
    }
}
