package k1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements InterfaceC6358d {

    /* renamed from: d, reason: collision with root package name */
    p f51047d;

    /* renamed from: f, reason: collision with root package name */
    int f51049f;

    /* renamed from: g, reason: collision with root package name */
    public int f51050g;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6358d f51044a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51045b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51046c = false;

    /* renamed from: e, reason: collision with root package name */
    a f51048e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f51051h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f51052i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f51053j = false;

    /* renamed from: k, reason: collision with root package name */
    List f51054k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List f51055l = new ArrayList();

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

    public f(p pVar) {
        this.f51047d = pVar;
    }

    @Override // k1.InterfaceC6358d
    public void a(InterfaceC6358d interfaceC6358d) {
        Iterator it = this.f51055l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f51053j) {
                return;
            }
        }
        this.f51046c = true;
        InterfaceC6358d interfaceC6358d2 = this.f51044a;
        if (interfaceC6358d2 != null) {
            interfaceC6358d2.a(this);
        }
        if (this.f51045b) {
            this.f51047d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f51055l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f51053j) {
            g gVar = this.f51052i;
            if (gVar != null) {
                if (!gVar.f51053j) {
                    return;
                } else {
                    this.f51049f = this.f51051h * gVar.f51050g;
                }
            }
            d(fVar.f51050g + this.f51049f);
        }
        InterfaceC6358d interfaceC6358d3 = this.f51044a;
        if (interfaceC6358d3 != null) {
            interfaceC6358d3.a(this);
        }
    }

    public void b(InterfaceC6358d interfaceC6358d) {
        this.f51054k.add(interfaceC6358d);
        if (this.f51053j) {
            interfaceC6358d.a(interfaceC6358d);
        }
    }

    public void c() {
        this.f51055l.clear();
        this.f51054k.clear();
        this.f51053j = false;
        this.f51050g = 0;
        this.f51046c = false;
        this.f51045b = false;
    }

    public void d(int i10) {
        if (this.f51053j) {
            return;
        }
        this.f51053j = true;
        this.f51050g = i10;
        for (InterfaceC6358d interfaceC6358d : this.f51054k) {
            interfaceC6358d.a(interfaceC6358d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51047d.f51088b.q());
        sb2.append(":");
        sb2.append(this.f51048e);
        sb2.append("(");
        sb2.append(this.f51053j ? Integer.valueOf(this.f51050g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f51055l.size());
        sb2.append(":d=");
        sb2.append(this.f51054k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
