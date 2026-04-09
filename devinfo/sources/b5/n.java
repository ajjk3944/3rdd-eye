package b5;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1837a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1838b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1839c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1840d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1841e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1842f;

    public n(ViewGroup viewGroup) {
        nk.k.e(viewGroup, "container");
        this.f1837a = viewGroup;
        this.f1838b = new ArrayList();
        this.f1839c = new ArrayList();
    }

    public static final n i(ViewGroup viewGroup, u0 u0Var) {
        nk.k.e(viewGroup, "container");
        nk.k.e(u0Var, "fragmentManager");
        nk.k.d(u0Var.I(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof n) {
            return (n) tag;
        }
        n nVar = new n(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, nVar);
        return nVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z3;
        int size = arrayList.size();
        int i4 = 0;
        loop0: while (true) {
            z3 = true;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                g1 g1Var = (g1) obj;
                if (!g1Var.f1807k.isEmpty()) {
                    ArrayList arrayList2 = g1Var.f1807k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            f1 f1Var = (f1) obj2;
                            f1Var.getClass();
                            if (!(f1Var instanceof j)) {
                                break;
                            }
                        }
                    }
                }
                z3 = false;
            }
            break loop0;
        }
        if (z3) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList.get(i11);
                i11++;
                zj.n.W(arrayList3, ((g1) obj3).f1807k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(g1 g1Var) {
        nk.k.e(g1Var, "operation");
        if (g1Var.f1806i) {
            a0.g.d(g1Var.f1799a, g1Var.f1801c.X(), this.f1837a);
            g1Var.f1806i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z3) {
        Object obj;
        Object obj2;
        if (u0.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            g1 g1Var = (g1) obj;
            View view = g1Var.f1801c.H;
            nk.k.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(je.u.r(visibility, "Unknown visibility "));
                    }
                } else if (g1Var.f1799a != 2) {
                    break;
                }
            }
        }
        g1 g1Var2 = (g1) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            Object objPrevious = listIterator.previous();
            g1 g1Var3 = (g1) objPrevious;
            View view2 = g1Var3.f1801c.H;
            nk.k.d(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(je.u.r(visibility2, "Unknown visibility "));
                }
            }
            if (g1Var3.f1799a == 2) {
                obj2 = objPrevious;
                break;
            }
        }
        g1 g1Var4 = (g1) obj2;
        if (u0.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + g1Var2 + " to " + g1Var4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        z zVar = ((g1) zj.n.h0(arrayList)).f1801c;
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj3 = arrayList.get(i10);
            i10++;
            x xVar = ((g1) obj3).f1801c.K;
            x xVar2 = zVar.K;
            xVar.f1921b = xVar2.f1921b;
            xVar.f1922c = xVar2.f1922c;
            xVar.f1923d = xVar2.f1923d;
            xVar.f1924e = xVar2.f1924e;
        }
        int size3 = arrayList.size();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 >= size3) {
                break;
            }
            Object obj4 = arrayList.get(i11);
            i11++;
            g1 g1Var5 = (g1) obj4;
            arrayList2.add(new h(g1Var5, z3));
            if (!z3 ? g1Var5 != g1Var4 : g1Var5 != g1Var2) {
                z10 = false;
            }
            z zVar2 = g1Var5.f1801c;
            m mVar = new m(g1Var5);
            if (g1Var5.f1799a == 2) {
                if (z3) {
                    x xVar3 = zVar2.K;
                } else {
                    zVar2.getClass();
                }
            } else if (z3) {
                x xVar4 = zVar2.K;
            } else {
                zVar2.getClass();
            }
            if (g1Var5.f1799a == 2) {
                if (z3) {
                    x xVar5 = zVar2.K;
                } else {
                    x xVar6 = zVar2.K;
                }
            }
            if (z10) {
                if (z3) {
                    x xVar7 = zVar2.K;
                } else {
                    zVar2.getClass();
                }
            }
            arrayList3.add(mVar);
            g1Var5.f1802d.add(new d(this, g1Var5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i12 = 0;
        while (i12 < size4) {
            Object obj5 = arrayList3.get(i12);
            i12++;
            if (!((m) obj5).t()) {
                arrayList4.add(obj5);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList4.size();
        int i13 = 0;
        while (i13 < size5) {
            Object obj6 = arrayList4.get(i13);
            i13++;
            ((m) obj6).getClass();
        }
        int size6 = arrayList5.size();
        int i14 = 0;
        while (i14 < size6) {
            Object obj7 = arrayList5.get(i14);
            i14++;
            ((m) obj7).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        int size7 = arrayList2.size();
        int i15 = 0;
        while (i15 < size7) {
            Object obj8 = arrayList2.get(i15);
            i15++;
            zj.n.W(arrayList7, ((g1) ((h) obj8).f218b).f1807k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        int size8 = arrayList2.size();
        boolean z11 = false;
        int i16 = 0;
        while (i16 < size8) {
            Object obj9 = arrayList2.get(i16);
            i16++;
            h hVar = (h) obj9;
            Context context = this.f1837a.getContext();
            g1 g1Var6 = (g1) hVar.f218b;
            nk.k.d(context, "context");
            y4.a aVarC = hVar.C(context);
            if (aVarC != null) {
                if (((AnimatorSet) aVarC.f37324b) == null) {
                    arrayList6.add(hVar);
                } else {
                    z zVar3 = g1Var6.f1801c;
                    if (g1Var6.f1807k.isEmpty()) {
                        if (g1Var6.f1799a == 3) {
                            g1Var6.f1806i = false;
                        }
                        g1Var6.j.add(new j(hVar));
                        z11 = true;
                    } else if (u0.K(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + zVar3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size9 = arrayList6.size();
        int i17 = 0;
        while (i17 < size9) {
            Object obj10 = arrayList6.get(i17);
            i17++;
            h hVar2 = (h) obj10;
            g1 g1Var7 = (g1) hVar2.f218b;
            z zVar4 = g1Var7.f1801c;
            if (zIsEmpty) {
                if (!z11) {
                    g1Var7.j.add(new g(hVar2));
                } else if (u0.K(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + zVar4 + " as Animations cannot run alongside Animators.");
                }
            } else if (u0.K(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + zVar4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(List list) {
        nk.k.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zj.n.W(arrayList, ((g1) it.next()).f1807k);
        }
        List listR0 = zj.n.r0(zj.n.v0(arrayList));
        int size = listR0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((f1) listR0.get(i4)).b(this.f1837a);
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((g1) list.get(i10));
        }
        List listR02 = zj.n.r0(list);
        int size3 = listR02.size();
        for (int i11 = 0; i11 < size3; i11++) {
            g1 g1Var = (g1) listR02.get(i11);
            if (g1Var.f1807k.isEmpty()) {
                g1Var.b();
            }
        }
    }

    public final void d(int i4, int i10, b1 b1Var) {
        synchronized (this.f1838b) {
            try {
                z zVar = b1Var.f1747c;
                nk.k.d(zVar, "fragmentStateManager.fragment");
                g1 g1VarF = f(zVar);
                if (g1VarF == null) {
                    z zVar2 = b1Var.f1747c;
                    g1VarF = (zVar2.f1940n || zVar2.f1939m) ? g(zVar2) : null;
                }
                if (g1VarF != null) {
                    g1VarF.d(i4, i10);
                    return;
                }
                g1 g1Var = new g1(i4, i10, b1Var);
                this.f1838b.add(g1Var);
                g1Var.f1802d.add(new d(this, g1Var, 1));
                g1Var.f1802d.add(new d(this, g1Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z3;
        if (this.f1842f) {
            return;
        }
        if (!this.f1837a.isAttachedToWindow()) {
            h();
            this.f1841e = false;
            return;
        }
        synchronized (this.f1838b) {
            try {
                ArrayList arrayListS0 = zj.n.s0(this.f1839c);
                this.f1839c.clear();
                int size = arrayListS0.size();
                int i4 = 0;
                while (true) {
                    z3 = true;
                    if (i4 >= size) {
                        break;
                    }
                    Object obj = arrayListS0.get(i4);
                    i4++;
                    g1 g1Var = (g1) obj;
                    if (this.f1838b.isEmpty() || !g1Var.f1801c.f1940n) {
                        z3 = false;
                    }
                    g1Var.g = z3;
                }
                int size2 = arrayListS0.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayListS0.get(i10);
                    i10++;
                    g1 g1Var2 = (g1) obj2;
                    if (this.f1840d) {
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + g1Var2);
                        }
                        g1Var2.b();
                    } else {
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + g1Var2);
                        }
                        g1Var2.a(this.f1837a);
                    }
                    this.f1840d = false;
                    if (!g1Var2.f1804f) {
                        this.f1839c.add(g1Var2);
                    }
                }
                if (!this.f1838b.isEmpty()) {
                    l();
                    ArrayList arrayListS02 = zj.n.s0(this.f1838b);
                    if (arrayListS02.isEmpty()) {
                        return;
                    }
                    this.f1838b.clear();
                    this.f1839c.addAll(arrayListS02);
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListS02, this.f1841e);
                    boolean zJ = j(arrayListS02);
                    int size3 = arrayListS02.size();
                    int i11 = 0;
                    boolean z10 = true;
                    while (i11 < size3) {
                        Object obj3 = arrayListS02.get(i11);
                        i11++;
                        if (!((g1) obj3).f1801c.f1940n) {
                            z10 = false;
                        }
                    }
                    if (!z10 || zJ) {
                        z3 = false;
                    }
                    this.f1840d = z3;
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z10);
                    }
                    if (!z10) {
                        k(arrayListS02);
                        c(arrayListS02);
                    } else if (zJ) {
                        k(arrayListS02);
                        int size4 = arrayListS02.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            a((g1) arrayListS02.get(i12));
                        }
                    }
                    this.f1841e = false;
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final g1 f(z zVar) {
        Object obj;
        ArrayList arrayList = this.f1838b;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            g1 g1Var = (g1) obj;
            if (nk.k.a(g1Var.f1801c, zVar) && !g1Var.f1803e) {
                break;
            }
        }
        return (g1) obj;
    }

    public final g1 g(z zVar) {
        Object obj;
        ArrayList arrayList = this.f1839c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            g1 g1Var = (g1) obj;
            if (nk.k.a(g1Var.f1801c, zVar) && !g1Var.f1803e) {
                break;
            }
        }
        return (g1) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (u0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f1837a.isAttachedToWindow();
        synchronized (this.f1838b) {
            try {
                l();
                k(this.f1838b);
                ArrayList arrayListS0 = zj.n.s0(this.f1839c);
                int size = arrayListS0.size();
                int i4 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayListS0.get(i10);
                    i10++;
                    ((g1) obj).g = false;
                }
                int size2 = arrayListS0.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayListS0.get(i11);
                    i11++;
                    g1 g1Var = (g1) obj2;
                    if (u0.K(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1837a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + g1Var);
                    }
                    g1Var.a(this.f1837a);
                }
                ArrayList arrayListS02 = zj.n.s0(this.f1838b);
                int size3 = arrayListS02.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = arrayListS02.get(i12);
                    i12++;
                    ((g1) obj3).g = false;
                }
                int size4 = arrayListS02.size();
                while (i4 < size4) {
                    Object obj4 = arrayListS02.get(i4);
                    i4++;
                    g1 g1Var2 = (g1) obj4;
                    if (u0.K(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1837a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + g1Var2);
                    }
                    g1Var2.a(this.f1837a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            g1 g1Var = (g1) list.get(i4);
            b1 b1Var = g1Var.f1808l;
            if (!g1Var.f1805h) {
                g1Var.f1805h = true;
                int i10 = g1Var.f1800b;
                if (i10 == 2) {
                    z zVar = b1Var.f1747c;
                    nk.k.d(zVar, "fragmentStateManager.fragment");
                    View viewFindFocus = zVar.H.findFocus();
                    if (viewFindFocus != null) {
                        zVar.m().f1928k = viewFindFocus;
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + zVar);
                        }
                    }
                    View viewX = g1Var.f1801c.X();
                    if (viewX.getParent() == null) {
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "Adding fragment " + zVar + " view " + viewX + " to container in onStart");
                        }
                        b1Var.b();
                        viewX.setAlpha(0.0f);
                    }
                    if (viewX.getAlpha() == 0.0f && viewX.getVisibility() == 0) {
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "Making view " + viewX + " INVISIBLE in onStart");
                        }
                        viewX.setVisibility(4);
                    }
                    x xVar = zVar.K;
                    viewX.setAlpha(xVar == null ? 1.0f : xVar.j);
                    if (u0.K(2)) {
                        StringBuilder sb2 = new StringBuilder("Setting view alpha to ");
                        x xVar2 = zVar.K;
                        sb2.append(xVar2 != null ? xVar2.j : 1.0f);
                        sb2.append(" in onStart");
                        Log.v("FragmentManager", sb2.toString());
                    }
                } else if (i10 == 3) {
                    z zVar2 = b1Var.f1747c;
                    nk.k.d(zVar2, "fragmentStateManager.fragment");
                    View viewX2 = zVar2.X();
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewX2.findFocus() + " on view " + viewX2 + " for Fragment " + zVar2);
                    }
                    viewX2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zj.n.W(arrayList, ((g1) it.next()).f1807k);
        }
        List listR0 = zj.n.r0(zj.n.v0(arrayList));
        int size2 = listR0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            f1 f1Var = (f1) listR0.get(i11);
            f1Var.getClass();
            ViewGroup viewGroup = this.f1837a;
            nk.k.e(viewGroup, "container");
            if (!f1Var.f1795a) {
                f1Var.d(viewGroup);
            }
            f1Var.f1795a = true;
        }
    }

    public final void l() {
        ArrayList arrayList = this.f1838b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            g1 g1Var = (g1) obj;
            int i10 = 2;
            if (g1Var.f1800b == 2) {
                int visibility = g1Var.f1801c.X().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(je.u.r(visibility, "Unknown visibility "));
                        }
                        i10 = 3;
                    }
                }
                g1Var.d(i10, 1);
            }
        }
    }
}
