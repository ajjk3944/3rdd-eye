package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DependencyNode implements y.d {

    /* renamed from: d, reason: collision with root package name */
    public WidgetRun f1737d;

    /* renamed from: f, reason: collision with root package name */
    public int f1739f;

    /* renamed from: g, reason: collision with root package name */
    public int f1740g;

    /* renamed from: a, reason: collision with root package name */
    public y.d f1734a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1735b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1736c = false;

    /* renamed from: e, reason: collision with root package name */
    public Type f1738e = Type.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public int f1741h = 1;

    /* renamed from: i, reason: collision with root package name */
    public a f1742i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1743j = false;

    /* renamed from: k, reason: collision with root package name */
    public List f1744k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public List f1745l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f1737d = widgetRun;
    }

    @Override // y.d
    public void a(y.d dVar) {
        Iterator it = this.f1745l.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f1743j) {
                return;
            }
        }
        this.f1736c = true;
        y.d dVar2 = this.f1734a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f1735b) {
            this.f1737d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : this.f1745l) {
            if (!(dependencyNode2 instanceof a)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.f1743j) {
            a aVar = this.f1742i;
            if (aVar != null) {
                if (!aVar.f1743j) {
                    return;
                } else {
                    this.f1739f = this.f1741h * aVar.f1740g;
                }
            }
            d(dependencyNode.f1740g + this.f1739f);
        }
        y.d dVar3 = this.f1734a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(y.d dVar) {
        this.f1744k.add(dVar);
        if (this.f1743j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f1745l.clear();
        this.f1744k.clear();
        this.f1743j = false;
        this.f1740g = 0;
        this.f1736c = false;
        this.f1735b = false;
    }

    public void d(int i10) {
        if (this.f1743j) {
            return;
        }
        this.f1743j = true;
        this.f1740g = i10;
        for (y.d dVar : this.f1744k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1737d.f1756b.u());
        sb.append(":");
        sb.append(this.f1738e);
        sb.append("(");
        sb.append(this.f1743j ? Integer.valueOf(this.f1740g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1745l.size());
        sb.append(":d=");
        sb.append(this.f1744k.size());
        sb.append(">");
        return sb.toString();
    }
}
