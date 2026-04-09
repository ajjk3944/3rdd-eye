package androidx.compose.ui.platform;

import T.AbstractC3550q;
import T.AbstractC3555t;
import T.InterfaceC3548p;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f29249a = new ViewGroup.LayoutParams(-2, -2);

    public static final T.U0 a(E0.G g10, AbstractC3550q abstractC3550q) {
        return AbstractC3555t.b(new E0.D0(g10), abstractC3550q);
    }

    private static final InterfaceC3548p b(r rVar, AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        if (AbstractC3964z0.b()) {
            int i10 = f0.h.f46610K;
            if (rVar.getTag(i10) == null) {
                rVar.setTag(i10, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        InterfaceC3548p interfaceC3548pA = AbstractC3555t.a(new E0.D0(rVar.getRoot()), abstractC3550q);
        View view = rVar.getView();
        int i11 = f0.h.f46611L;
        Object tag = view.getTag(i11);
        K1 k12 = tag instanceof K1 ? (K1) tag : null;
        if (k12 == null) {
            k12 = new K1(rVar, interfaceC3548pA);
            rVar.getView().setTag(i11, k12);
        }
        k12.e(interfaceC6839p);
        if (!AbstractC6492s.d(rVar.getCoroutineContext(), abstractC3550q.h())) {
            rVar.setCoroutineContext(abstractC3550q.h());
        }
        return k12;
    }

    public static final InterfaceC3548p c(AbstractC3901a abstractC3901a, AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        C3952t0.f29588a.b();
        r rVar = null;
        if (abstractC3901a.getChildCount() > 0) {
            View childAt = abstractC3901a.getChildAt(0);
            if (childAt instanceof r) {
                rVar = (r) childAt;
            }
        } else {
            abstractC3901a.removeAllViews();
        }
        if (rVar == null) {
            rVar = new r(abstractC3901a.getContext(), abstractC3550q.h());
            abstractC3901a.addView(rVar.getView(), f29249a);
        }
        return b(rVar, abstractC3550q, interfaceC6839p);
    }
}
