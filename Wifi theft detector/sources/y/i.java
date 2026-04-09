package y;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: h, reason: collision with root package name */
    public static int f25014h;

    /* renamed from: c, reason: collision with root package name */
    public WidgetRun f25017c;

    /* renamed from: d, reason: collision with root package name */
    public WidgetRun f25018d;

    /* renamed from: f, reason: collision with root package name */
    public int f25020f;

    /* renamed from: g, reason: collision with root package name */
    public int f25021g;

    /* renamed from: a, reason: collision with root package name */
    public int f25015a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25016b = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f25019e = new ArrayList();

    public i(WidgetRun widgetRun, int i10) {
        this.f25017c = null;
        this.f25018d = null;
        int i11 = f25014h;
        this.f25020f = i11;
        f25014h = i11 + 1;
        this.f25017c = widgetRun;
        this.f25018d = widgetRun;
        this.f25021g = i10;
    }

    public void a(WidgetRun widgetRun) {
        this.f25019e.add(widgetRun);
        this.f25018d = widgetRun;
    }

    public long b(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        long j10;
        int i11;
        WidgetRun widgetRun = this.f25017c;
        if (widgetRun instanceof c) {
            if (((c) widgetRun).f1760f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.c)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i10 == 0 ? dVar.f1683e : dVar.f1685f).f1762h;
        DependencyNode dependencyNode2 = (i10 == 0 ? dVar.f1683e : dVar.f1685f).f1763i;
        boolean zContains = widgetRun.f1762h.f1745l.contains(dependencyNode);
        boolean zContains2 = this.f25017c.f1763i.f1745l.contains(dependencyNode2);
        long j11 = this.f25017c.j();
        if (zContains && zContains2) {
            long jD = d(this.f25017c.f1762h, 0L);
            long jC = c(this.f25017c.f1763i, 0L);
            long j12 = jD - j11;
            WidgetRun widgetRun2 = this.f25017c;
            int i12 = widgetRun2.f1763i.f1739f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = widgetRun2.f1762h.f1739f;
            long j13 = ((-jC) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float fR = widgetRun2.f1756b.r(i10);
            float f10 = fR > 0.0f ? (long) ((j13 / fR) + (j12 / (1.0f - fR))) : 0L;
            long j14 = ((long) ((f10 * fR) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fR)) + 0.5f));
            j10 = r12.f1762h.f1739f + j14;
            i11 = this.f25017c.f1763i.f1739f;
        } else {
            if (zContains) {
                return Math.max(d(this.f25017c.f1762h, r12.f1739f), this.f25017c.f1762h.f1739f + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f25017c.f1763i, r12.f1739f), (-this.f25017c.f1763i.f1739f) + j11);
            }
            j10 = r12.f1762h.f1739f + this.f25017c.j();
            i11 = this.f25017c.f1763i.f1739f;
        }
        return j10 - i11;
    }

    public final long c(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f1737d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        int size = dependencyNode.f1744k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) dependencyNode.f1744k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f1737d != widgetRun) {
                    jMin = Math.min(jMin, c(dependencyNode2, dependencyNode2.f1739f + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f1763i) {
            return jMin;
        }
        long j11 = j10 - widgetRun.j();
        return Math.min(Math.min(jMin, c(widgetRun.f1762h, j11)), j11 - widgetRun.f1762h.f1739f);
    }

    public final long d(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.f1737d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        int size = dependencyNode.f1744k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) dependencyNode.f1744k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f1737d != widgetRun) {
                    jMax = Math.max(jMax, d(dependencyNode2, dependencyNode2.f1739f + j10));
                }
            }
        }
        if (dependencyNode != widgetRun.f1762h) {
            return jMax;
        }
        long j11 = j10 + widgetRun.j();
        return Math.max(Math.max(jMax, d(widgetRun.f1763i, j11)), j11 - widgetRun.f1763i.f1739f);
    }
}
