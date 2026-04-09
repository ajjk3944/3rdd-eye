package s0;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final p f45923d;

    /* renamed from: f, reason: collision with root package name */
    public int f45925f;

    /* renamed from: g, reason: collision with root package name */
    public int f45926g;

    /* renamed from: a, reason: collision with root package name */
    public p f45920a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45921b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f45922c = false;

    /* renamed from: e, reason: collision with root package name */
    public a f45924e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public int f45927h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45928j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f45929k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f45930l = new ArrayList();

    /* compiled from: DependencyNode.java */
    public enum a {
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
        this.f45923d = pVar;
    }

    @Override // s0.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f45930l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f45928j) {
                return;
            }
        }
        this.f45922c = true;
        p pVar = this.f45920a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f45921b) {
            this.f45923d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f45928j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f45928j) {
                    return;
                } else {
                    this.f45925f = this.f45927h * gVar.f45926g;
                }
            }
            d(fVar.f45926g + this.f45925f);
        }
        p pVar2 = this.f45920a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f45929k.add(pVar);
        if (this.f45928j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f45930l.clear();
        this.f45929k.clear();
        this.f45928j = false;
        this.f45926g = 0;
        this.f45922c = false;
        this.f45921b = false;
    }

    public void d(int i) {
        if (this.f45928j) {
            return;
        }
        this.f45928j = true;
        this.f45926g = i;
        Iterator it = this.f45929k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45923d.f45947b.f45559j0);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(this.f45924e);
        sb.append("(");
        sb.append(this.f45928j ? Integer.valueOf(this.f45926g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f45930l.size());
        sb.append(":d=");
        sb.append(this.f45929k.size());
        sb.append(">");
        return sb.toString();
    }
}
