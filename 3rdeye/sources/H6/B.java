package H6;

import N7.S2;
import N7.Z;
import android.view.View;
import b9.C1992A;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import o2.InterfaceC5418i;
import v2.C5673a;
import z6.C5865d;

/* compiled from: DivViewBinder.kt */
/* loaded from: classes.dex */
public abstract class B implements InterfaceC5418i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2033a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2034b;

    public B(l8.b configuration) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        this.f2034b = configuration;
    }

    @Override // o2.InterfaceC5418i
    public List b() {
        return (List) this.f2034b;
    }

    @Override // o2.InterfaceC5418i
    public boolean c() {
        List list = (List) this.f2034b;
        return list.isEmpty() || (list.size() == 1 && ((C5673a) list.get(0)).c());
    }

    public void d(View view, C0672i c0672i, S2 s22, S2 s23) {
        kotlin.jvm.internal.l.f(view, "<this>");
    }

    public void e(View view, C0672i c0672i, S2 s22, S2 s23, C5865d path) {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(path, "path");
        d(view, c0672i, s22, s23);
    }

    public void f(C0672i c0672i, View view, Z div) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        h(c0672i, view, div, null);
    }

    public void g(C0672i c0672i, View view, Z div, C5865d c5865d) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        h(c0672i, view, div, c5865d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(C0672i c0672i, View view, Z z10, C5865d c5865d) {
        C0672i c0672i2;
        View view2;
        C1992A c1992a;
        S2 s2D;
        B b10;
        C5865d c5865d2;
        kotlin.jvm.internal.l.d(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<TData of com.yandex.div.core.view2.DivViewBinder>");
        Z div = ((O6.l) view).getDiv();
        if (z10 == div) {
            return;
        }
        ((K6.D) this.f2034b).f(c0672i, view, z10, div);
        if (c5865d != null) {
            S2 s2D2 = z10.d();
            kotlin.jvm.internal.l.d(s2D2, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder.bindViewInternal$lambda$0");
            if (div != null) {
                s2D = div.d();
                c0672i2 = c0672i;
                view2 = view;
                c5865d2 = c5865d;
                b10 = this;
            } else {
                s2D = null;
                b10 = this;
                c0672i2 = c0672i;
                view2 = view;
                c5865d2 = c5865d;
            }
            b10.e(view2, c0672i2, s2D2, s2D, c5865d2);
            c1992a = C1992A.f18074a;
        } else {
            c0672i2 = c0672i;
            view2 = view;
            c1992a = null;
        }
        if (c1992a == null) {
            S2 s2D3 = z10.d();
            kotlin.jvm.internal.l.d(s2D3, "null cannot be cast to non-null type TDataValue of com.yandex.div.core.view2.DivViewBinder");
            d(view2, c0672i2, s2D3, div != null ? div.d() : null);
        }
    }

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public void l(O2.i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f2034b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    public String toString() {
        switch (this.f2033a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f2034b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public B() {
        char[] cArr = h3.l.f38217a;
        this.f2034b = new ArrayDeque(20);
    }

    public B(K6.D baseBinder) {
        kotlin.jvm.internal.l.f(baseBinder, "baseBinder");
        this.f2034b = baseBinder;
    }

    public B(List list) {
        this.f2034b = list;
    }
}
