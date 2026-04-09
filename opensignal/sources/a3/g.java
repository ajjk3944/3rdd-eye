package a3;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: d, reason: collision with root package name */
    public final t f54d;

    /* renamed from: f, reason: collision with root package name */
    public int f56f;

    /* renamed from: g, reason: collision with root package name */
    public int f57g;

    /* renamed from: a, reason: collision with root package name */
    public t f51a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53c = false;

    /* renamed from: e, reason: collision with root package name */
    public f f55e = f.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public int f58h = 1;

    /* renamed from: i, reason: collision with root package name */
    public h f59i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f60l = new ArrayList();

    public g(t tVar) {
        this.f54d = tVar;
    }

    @Override // a3.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f60l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).j) {
                return;
            }
        }
        this.f53c = true;
        t tVar = this.f51a;
        if (tVar != null) {
            tVar.a(this);
        }
        if (this.f52b) {
            this.f54d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        g gVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            if (!(gVar2 instanceof h)) {
                i10++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i10 == 1 && gVar.j) {
            h hVar = this.f59i;
            if (hVar != null) {
                if (!hVar.j) {
                    return;
                } else {
                    this.f56f = this.f58h * hVar.f57g;
                }
            }
            d(gVar.f57g + this.f56f);
        }
        t tVar2 = this.f51a;
        if (tVar2 != null) {
            tVar2.a(this);
        }
    }

    public final void b(t tVar) {
        this.k.add(tVar);
        if (this.j) {
            tVar.a(tVar);
        }
    }

    public final void c() {
        this.f60l.clear();
        this.k.clear();
        this.j = false;
        this.f57g = 0;
        this.f53c = false;
        this.f52b = false;
    }

    public void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f57g = i10;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f54d.f76b.f26553i0);
        sb2.append(":");
        sb2.append(this.f55e);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.f57g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f60l.size());
        sb2.append(":d=");
        sb2.append(this.k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
