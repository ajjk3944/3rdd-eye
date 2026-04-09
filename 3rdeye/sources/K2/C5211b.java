package k2;

import H6.C0675l;
import N7.C1418x4;
import N7.S2;
import android.graphics.Path;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import t6.InterfaceC5609a;
import u2.C5629h;

/* compiled from: CompoundTrimPathContent.java */
/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5211b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f43173a;

    public C5211b() {
        this.f43173a = new ArrayList();
    }

    public void a(Path path) {
        ArrayList arrayList = this.f43173a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            C5629h.a aVar = C5629h.f46557a;
            if (uVar != null && !uVar.f43293a) {
                C5629h.a(path, uVar.f43296d.l() / 100.0f, uVar.f43297e.l() / 100.0f, uVar.f43298f.l() / 360.0f);
            }
        }
    }

    public void b(C0675l divView, A7.d resolver, View view, S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        if (d(div)) {
            for (InterfaceC5609a interfaceC5609a : this.f43173a) {
                if (interfaceC5609a.matches(div)) {
                    interfaceC5609a.beforeBindView(divView, resolver, view, div);
                }
            }
        }
    }

    public void c(C0675l divView, A7.d resolver, View view, S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        if (d(div)) {
            for (InterfaceC5609a interfaceC5609a : this.f43173a) {
                if (interfaceC5609a.matches(div)) {
                    interfaceC5609a.bindView(divView, resolver, view, div);
                }
            }
        }
    }

    public boolean d(S2 s22) {
        List<C1418x4> extensions = s22.getExtensions();
        return (extensions == null || extensions.isEmpty() || this.f43173a.isEmpty()) ? false : true;
    }

    public void e(S2 div, A7.d resolver) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        if (d(div)) {
            for (InterfaceC5609a interfaceC5609a : this.f43173a) {
                if (interfaceC5609a.matches(div)) {
                    interfaceC5609a.preprocess(div, resolver);
                }
            }
        }
    }

    public void f(C0675l divView, A7.d resolver, View view, S2 div) {
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        if (d(div)) {
            for (InterfaceC5609a interfaceC5609a : this.f43173a) {
                if (interfaceC5609a.matches(div)) {
                    interfaceC5609a.unbindView(divView, resolver, view, div);
                }
            }
        }
    }

    public C5211b(ArrayList extensionHandlers) {
        kotlin.jvm.internal.l.f(extensionHandlers, "extensionHandlers");
        this.f43173a = extensionHandlers;
    }
}
