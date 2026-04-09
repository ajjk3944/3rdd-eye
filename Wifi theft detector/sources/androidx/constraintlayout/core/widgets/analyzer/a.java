package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* loaded from: classes.dex */
public class a extends DependencyNode {

    /* renamed from: m, reason: collision with root package name */
    public int f1771m;

    public a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof c) {
            this.f1738e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f1738e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
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
}
