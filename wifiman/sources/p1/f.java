package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    m f57475d;

    /* renamed from: f, reason: collision with root package name */
    int f57477f;

    /* renamed from: g, reason: collision with root package name */
    public int f57478g;

    /* renamed from: a, reason: collision with root package name */
    public d f57472a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f57473b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f57474c = false;

    /* renamed from: e, reason: collision with root package name */
    a f57476e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f57479h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f57480i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f57481j = false;

    /* renamed from: k, reason: collision with root package name */
    List f57482k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f57483l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f57475d = mVar;
    }

    @Override // p1.d
    public void a(d dVar) {
        Iterator it = this.f57483l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f57481j) {
                return;
            }
        }
        this.f57474c = true;
        d dVar2 = this.f57472a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f57473b) {
            this.f57475d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f57483l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f57481j) {
            g gVar = this.f57480i;
            if (gVar != null) {
                if (!gVar.f57481j) {
                    return;
                } else {
                    this.f57477f = this.f57479h * gVar.f57478g;
                }
            }
            d(fVar.f57478g + this.f57477f);
        }
        d dVar3 = this.f57472a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f57482k.add(dVar);
        if (this.f57481j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f57483l.clear();
        this.f57482k.clear();
        this.f57481j = false;
        this.f57478g = 0;
        this.f57474c = false;
        this.f57473b = false;
    }

    public void d(int i10) {
        if (this.f57481j) {
            return;
        }
        this.f57481j = true;
        this.f57478g = i10;
        for (d dVar : this.f57482k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57475d.f57499b.r());
        sb2.append(":");
        sb2.append(this.f57476e);
        sb2.append("(");
        sb2.append(this.f57481j ? Integer.valueOf(this.f57478g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f57483l.size());
        sb2.append(":d=");
        sb2.append(this.f57482k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
