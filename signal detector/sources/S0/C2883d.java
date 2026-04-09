package s0;

import C5.o;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C0300w;
import d5.AbstractC2282j;
import d5.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.AbstractComponentCallbacksC2617v;
import k0.DialogInterfaceOnCancelListenerC2610n;
import k0.E;
import k0.N;
import q0.B;
import q0.C2794g;
import q0.C2796i;
import q0.K;
import q0.L;
import q0.v;
import q5.r;

@K("dialog")
/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2883d extends L {

    /* renamed from: c, reason: collision with root package name */
    public final Context f23404c;

    /* renamed from: d, reason: collision with root package name */
    public final k0.K f23405d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f23406e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final F0.b f23407f = new F0.b(6, this);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f23408g = new LinkedHashMap();

    public C2883d(Context context, k0.K k6) {
        this.f23404c = context;
        this.f23405d = k6;
    }

    @Override // q0.L
    public final v a() {
        return new C2881b(this);
    }

    @Override // q0.L
    public final void d(List list, B b5) {
        k0.K k6 = this.f23405d;
        if (k6.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2794g c2794g = (C2794g) it.next();
            k(c2794g).e0(k6, c2794g.f22969f);
            b().h(c2794g);
        }
    }

    @Override // q0.L
    public final void e(C2796i c2796i) {
        C0300w c0300w;
        this.f22938a = c2796i;
        this.f22939b = true;
        Iterator it = ((List) ((o) c2796i.f22982e.f73b).I()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            k0.K k6 = this.f23405d;
            if (!zHasNext) {
                k6.f21515n.add(new N() { // from class: s0.a
                    @Override // k0.N
                    public final void a(k0.K k7, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
                        q5.i.e(k7, "<anonymous parameter 0>");
                        q5.i.e(abstractComponentCallbacksC2617v, "childFragment");
                        C2883d c2883d = this.f23401a;
                        LinkedHashSet linkedHashSet = c2883d.f23406e;
                        String str = abstractComponentCallbacksC2617v.M;
                        r.a(linkedHashSet);
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC2617v.b0.a(c2883d.f23407f);
                        }
                        LinkedHashMap linkedHashMap = c2883d.f23408g;
                        String str2 = abstractComponentCallbacksC2617v.M;
                        r.b(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
            C2794g c2794g = (C2794g) it.next();
            DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = (DialogInterfaceOnCancelListenerC2610n) k6.C(c2794g.f22969f);
            if (dialogInterfaceOnCancelListenerC2610n == null || (c0300w = dialogInterfaceOnCancelListenerC2610n.b0) == null) {
                this.f23406e.add(c2794g.f22969f);
            } else {
                c0300w.a(this.f23407f);
            }
        }
    }

    @Override // q0.L
    public final void f(C2794g c2794g) {
        String str = c2794g.f22969f;
        k0.K k6 = this.f23405d;
        if (k6.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = (DialogInterfaceOnCancelListenerC2610n) this.f23408g.get(str);
        if (dialogInterfaceOnCancelListenerC2610n == null) {
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vC = k6.C(str);
            dialogInterfaceOnCancelListenerC2610n = abstractComponentCallbacksC2617vC instanceof DialogInterfaceOnCancelListenerC2610n ? (DialogInterfaceOnCancelListenerC2610n) abstractComponentCallbacksC2617vC : null;
        }
        if (dialogInterfaceOnCancelListenerC2610n != null) {
            dialogInterfaceOnCancelListenerC2610n.b0.f(this.f23407f);
            dialogInterfaceOnCancelListenerC2610n.X();
        }
        k(c2794g).e0(k6, str);
        C2796i c2796iB = b();
        List list = (List) ((o) c2796iB.f22982e.f73b).I();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C2794g c2794g2 = (C2794g) listIterator.previous();
            if (q5.i.a(c2794g2.f22969f, str)) {
                o oVar = c2796iB.f22980c;
                oVar.J(y.m(y.m((Set) oVar.I(), c2794g2), c2794g));
                c2796iB.c(c2794g);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // q0.L
    public final void i(C2794g c2794g, boolean z6) {
        q5.i.e(c2794g, "popUpTo");
        k0.K k6 = this.f23405d;
        if (k6.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((o) b().f22982e.f73b).I();
        Iterator it = AbstractC2282j.f0(list.subList(list.indexOf(c2794g), list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vC = k6.C(((C2794g) it.next()).f22969f);
            if (abstractComponentCallbacksC2617vC != null) {
                ((DialogInterfaceOnCancelListenerC2610n) abstractComponentCallbacksC2617vC).X();
            }
        }
        b().f(c2794g, z6);
    }

    public final DialogInterfaceOnCancelListenerC2610n k(C2794g c2794g) {
        v vVar = c2794g.f22965b;
        q5.i.c(vVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C2881b c2881b = (C2881b) vVar;
        String str = c2881b.f23402k;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f23404c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        E E6 = this.f23405d.E();
        context.getClassLoader();
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vA = E6.a(str);
        q5.i.d(abstractComponentCallbacksC2617vA, "fragmentManager.fragment…ader, className\n        )");
        if (DialogInterfaceOnCancelListenerC2610n.class.isAssignableFrom(abstractComponentCallbacksC2617vA.getClass())) {
            DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = (DialogInterfaceOnCancelListenerC2610n) abstractComponentCallbacksC2617vA;
            dialogInterfaceOnCancelListenerC2610n.U(c2794g.a());
            dialogInterfaceOnCancelListenerC2610n.b0.a(this.f23407f);
            this.f23408g.put(c2794g.f22969f, dialogInterfaceOnCancelListenerC2610n);
            return dialogInterfaceOnCancelListenerC2610n;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = c2881b.f23402k;
        if (str2 != null) {
            throw new IllegalArgumentException(A.f.p(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }
}
