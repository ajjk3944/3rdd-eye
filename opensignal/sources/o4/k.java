package o4;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18806a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18807b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18808c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18809d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18810e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18811f;

    public k(ViewGroup viewGroup) {
        br.l.e(viewGroup, "container");
        this.f18806a = viewGroup;
        this.f18807b = new ArrayList();
        this.f18808c = new ArrayList();
    }

    public static final k i(ViewGroup viewGroup, androidx.fragment.app.d dVar) {
        br.l.e(viewGroup, "container");
        br.l.e(dVar, "fragmentManager");
        br.l.d(dVar.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(n4.b.special_effects_controller_view_tag);
        if (tag instanceof k) {
            return (k) tag;
        }
        k kVar = new k(viewGroup);
        viewGroup.setTag(n4.b.special_effects_controller_view_tag, kVar);
        return kVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z10;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z10 = true;
            while (it.hasNext()) {
                s0 s0Var = (s0) it.next();
                if (!s0Var.k.isEmpty()) {
                    ArrayList arrayList2 = s0Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            r0 r0Var = (r0) it2.next();
                            r0Var.getClass();
                            if (!(r0Var instanceof g)) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                mq.t.d0(arrayList3, ((s0) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(s0 s0Var) {
        br.l.e(s0Var, "operation");
        if (s0Var.f18858i) {
            s0Var.f18850a.applyState(s0Var.f18852c.Y(), this.f18806a);
            s0Var.f18858i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z10) {
        Object obj;
        Object next;
        androidx.fragment.app.d.K(2);
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            s0 s0Var = (s0) next;
            u0 u0Var = w0.Companion;
            View view = s0Var.f18852c.f1413e0;
            br.l.d(view, "operation.fragment.mView");
            u0Var.getClass();
            w0 w0VarA = u0.a(view);
            w0 w0Var = w0.VISIBLE;
            if (w0VarA == w0Var && s0Var.f18850a != w0Var) {
                break;
            }
        }
        s0 s0Var2 = (s0) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            s0 s0Var3 = (s0) objPrevious;
            u0 u0Var2 = w0.Companion;
            View view2 = s0Var3.f18852c.f1413e0;
            br.l.d(view2, "operation.fragment.mView");
            u0Var2.getClass();
            w0 w0VarA2 = u0.a(view2);
            w0 w0Var2 = w0.VISIBLE;
            if (w0VarA2 != w0Var2 && s0Var3.f18850a == w0Var2) {
                obj = objPrevious;
                break;
            }
        }
        s0 s0Var4 = (s0) obj;
        if (androidx.fragment.app.d.K(2)) {
            Objects.toString(s0Var2);
            Objects.toString(s0Var4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        androidx.fragment.app.b bVar = ((s0) mq.o.z0(arrayList)).f18852c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u uVar = ((s0) it2.next()).f18852c.f1417h0;
            u uVar2 = bVar.f1417h0;
            uVar.f18866b = uVar2.f18866b;
            uVar.f18867c = uVar2.f18867c;
            uVar.f18868d = uVar2.f18868d;
            uVar.f18869e = uVar2.f18869e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z11 = false;
            if (!it3.hasNext()) {
                break;
            }
            s0 s0Var5 = (s0) it3.next();
            arrayList2.add(new e(s0Var5, z10));
            if (!z10 ? s0Var5 == s0Var4 : s0Var5 == s0Var2) {
                z11 = true;
            }
            androidx.fragment.app.b bVar2 = s0Var5.f18852c;
            j jVar = new j(s0Var5);
            w0 w0Var3 = s0Var5.f18850a;
            w0 w0Var4 = w0.VISIBLE;
            if (w0Var3 == w0Var4) {
                if (z10) {
                    u uVar3 = bVar2.f1417h0;
                } else {
                    bVar2.getClass();
                }
            } else if (z10) {
                u uVar4 = bVar2.f1417h0;
            } else {
                bVar2.getClass();
            }
            if (s0Var5.f18850a == w0Var4) {
                if (z10) {
                    u uVar5 = bVar2.f1417h0;
                } else {
                    u uVar6 = bVar2.f1417h0;
                }
            }
            if (z11) {
                if (z10) {
                    u uVar7 = bVar2.f1417h0;
                } else {
                    bVar2.getClass();
                }
            }
            arrayList3.add(jVar);
            s0Var5.f18853d.add(new b(this, s0Var5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!((j) next2).k1()) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((j) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((j) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            mq.t.d0(arrayList7, ((s0) ((e) it7.next()).f1504d).k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        boolean z12 = false;
        while (it8.hasNext()) {
            e eVar = (e) it8.next();
            Context context = this.f18806a.getContext();
            s0 s0Var6 = (s0) eVar.f1504d;
            br.l.d(context, "context");
            i4.b bVarT1 = eVar.t1(context);
            if (bVarT1 != null) {
                if (((AnimatorSet) bVarT1.f11197d) == null) {
                    arrayList6.add(eVar);
                } else {
                    androidx.fragment.app.b bVar3 = s0Var6.f18852c;
                    if (s0Var6.k.isEmpty()) {
                        if (s0Var6.f18850a == w0.GONE) {
                            s0Var6.f18858i = false;
                        }
                        s0Var6.j.add(new g(eVar));
                        z12 = true;
                    } else if (androidx.fragment.app.d.K(2)) {
                        Objects.toString(bVar3);
                    }
                }
            }
        }
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            e eVar2 = (e) it9.next();
            s0 s0Var7 = (s0) eVar2.f1504d;
            androidx.fragment.app.b bVar4 = s0Var7.f18852c;
            if (zIsEmpty) {
                if (!z12) {
                    s0Var7.j.add(new d(eVar2));
                } else if (androidx.fragment.app.d.K(2)) {
                    Objects.toString(bVar4);
                }
            } else if (androidx.fragment.app.d.K(2)) {
                Objects.toString(bVar4);
            }
        }
    }

    public final void c(List list) {
        br.l.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mq.t.d0(arrayList, ((s0) it.next()).k);
        }
        List listQ0 = mq.o.Q0(mq.o.U0(arrayList));
        int size = listQ0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r0) listQ0.get(i10)).b(this.f18806a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((s0) list.get(i11));
        }
        List listQ02 = mq.o.Q0(list);
        int size3 = listQ02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            s0 s0Var = (s0) listQ02.get(i12);
            if (s0Var.k.isEmpty()) {
                s0Var.b();
            }
        }
    }

    public final void d(w0 w0Var, t0 t0Var, androidx.fragment.app.e eVar) {
        synchronized (this.f18807b) {
            try {
                androidx.fragment.app.b bVar = eVar.f1462c;
                br.l.d(bVar, "fragmentStateManager.fragment");
                s0 s0VarF = f(bVar);
                if (s0VarF == null) {
                    androidx.fragment.app.b bVar2 = eVar.f1462c;
                    s0VarF = (bVar2.J || bVar2.I) ? g(bVar2) : null;
                }
                if (s0VarF != null) {
                    s0VarF.d(w0Var, t0Var);
                    return;
                }
                s0 s0Var = new s0(w0Var, t0Var, eVar);
                this.f18807b.add(s0Var);
                s0Var.f18853d.add(new b(this, s0Var, 1));
                s0Var.f18853d.add(new b(this, s0Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z10;
        if (this.f18811f) {
            return;
        }
        if (!this.f18806a.isAttachedToWindow()) {
            h();
            this.f18810e = false;
            return;
        }
        synchronized (this.f18807b) {
            try {
                ArrayList arrayListR0 = mq.o.R0(this.f18808c);
                this.f18808c.clear();
                Iterator it = arrayListR0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    s0 s0Var = (s0) it.next();
                    if (this.f18807b.isEmpty() || !s0Var.f18852c.J) {
                        z10 = false;
                    }
                    s0Var.f18856g = z10;
                }
                Iterator it2 = arrayListR0.iterator();
                while (it2.hasNext()) {
                    s0 s0Var2 = (s0) it2.next();
                    if (this.f18809d) {
                        if (androidx.fragment.app.d.K(2)) {
                            Objects.toString(s0Var2);
                        }
                        s0Var2.b();
                    } else {
                        if (androidx.fragment.app.d.K(2)) {
                            Objects.toString(s0Var2);
                        }
                        s0Var2.a(this.f18806a);
                    }
                    this.f18809d = false;
                    if (!s0Var2.f18855f) {
                        this.f18808c.add(s0Var2);
                    }
                }
                if (!this.f18807b.isEmpty()) {
                    l();
                    ArrayList arrayListR02 = mq.o.R0(this.f18807b);
                    if (arrayListR02.isEmpty()) {
                        return;
                    }
                    this.f18807b.clear();
                    this.f18808c.addAll(arrayListR02);
                    androidx.fragment.app.d.K(2);
                    b(arrayListR02, this.f18810e);
                    boolean zJ = j(arrayListR02);
                    Iterator it3 = arrayListR02.iterator();
                    boolean z11 = true;
                    while (it3.hasNext()) {
                        if (!((s0) it3.next()).f18852c.J) {
                            z11 = false;
                        }
                    }
                    if (!z11 || zJ) {
                        z10 = false;
                    }
                    this.f18809d = z10;
                    androidx.fragment.app.d.K(2);
                    if (!z11) {
                        k(arrayListR02);
                        c(arrayListR02);
                    } else if (zJ) {
                        k(arrayListR02);
                        int size = arrayListR02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            a((s0) arrayListR02.get(i10));
                        }
                    }
                    this.f18810e = false;
                    androidx.fragment.app.d.K(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s0 f(androidx.fragment.app.b bVar) {
        Object next;
        Iterator it = this.f18807b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            s0 s0Var = (s0) next;
            if (br.l.a(s0Var.f18852c, bVar) && !s0Var.f18854e) {
                break;
            }
        }
        return (s0) next;
    }

    public final s0 g(androidx.fragment.app.b bVar) {
        Object next;
        Iterator it = this.f18808c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            s0 s0Var = (s0) next;
            if (br.l.a(s0Var.f18852c, bVar) && !s0Var.f18854e) {
                break;
            }
        }
        return (s0) next;
    }

    public final void h() {
        androidx.fragment.app.d.K(2);
        boolean zIsAttachedToWindow = this.f18806a.isAttachedToWindow();
        synchronized (this.f18807b) {
            try {
                l();
                k(this.f18807b);
                ArrayList arrayListR0 = mq.o.R0(this.f18808c);
                Iterator it = arrayListR0.iterator();
                while (it.hasNext()) {
                    ((s0) it.next()).f18856g = false;
                }
                Iterator it2 = arrayListR0.iterator();
                while (it2.hasNext()) {
                    s0 s0Var = (s0) it2.next();
                    if (androidx.fragment.app.d.K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f18806a);
                        }
                        Objects.toString(s0Var);
                    }
                    s0Var.a(this.f18806a);
                }
                ArrayList arrayListR02 = mq.o.R0(this.f18807b);
                Iterator it3 = arrayListR02.iterator();
                while (it3.hasNext()) {
                    ((s0) it3.next()).f18856g = false;
                }
                Iterator it4 = arrayListR02.iterator();
                while (it4.hasNext()) {
                    s0 s0Var2 = (s0) it4.next();
                    if (androidx.fragment.app.d.K(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f18806a);
                        }
                        Objects.toString(s0Var2);
                    }
                    s0Var2.a(this.f18806a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            s0 s0Var = (s0) list.get(i10);
            androidx.fragment.app.e eVar = s0Var.f18859l;
            if (!s0Var.f18857h) {
                s0Var.f18857h = true;
                t0 t0Var = s0Var.f18851b;
                if (t0Var == t0.ADDING) {
                    androidx.fragment.app.b bVar = eVar.f1462c;
                    br.l.d(bVar, "fragmentStateManager.fragment");
                    View viewFindFocus = bVar.f1413e0.findFocus();
                    if (viewFindFocus != null) {
                        bVar.k().k = viewFindFocus;
                        if (androidx.fragment.app.d.K(2)) {
                            viewFindFocus.toString();
                            bVar.toString();
                        }
                    }
                    View viewY = s0Var.f18852c.Y();
                    if (viewY.getParent() == null) {
                        if (androidx.fragment.app.d.K(2)) {
                            bVar.toString();
                            viewY.toString();
                        }
                        eVar.b();
                        viewY.setAlpha(0.0f);
                    }
                    if (viewY.getAlpha() == 0.0f && viewY.getVisibility() == 0) {
                        if (androidx.fragment.app.d.K(2)) {
                            viewY.toString();
                        }
                        viewY.setVisibility(4);
                    }
                    u uVar = bVar.f1417h0;
                    viewY.setAlpha(uVar == null ? 1.0f : uVar.j);
                    androidx.fragment.app.d.K(2);
                } else if (t0Var == t0.REMOVING) {
                    androidx.fragment.app.b bVar2 = eVar.f1462c;
                    br.l.d(bVar2, "fragmentStateManager.fragment");
                    View viewY2 = bVar2.Y();
                    if (androidx.fragment.app.d.K(2)) {
                        Objects.toString(viewY2.findFocus());
                        viewY2.toString();
                        bVar2.toString();
                    }
                    viewY2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mq.t.d0(arrayList, ((s0) it.next()).k);
        }
        List listQ0 = mq.o.Q0(mq.o.U0(arrayList));
        int size2 = listQ0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            r0 r0Var = (r0) listQ0.get(i11);
            r0Var.getClass();
            ViewGroup viewGroup = this.f18806a;
            br.l.e(viewGroup, "container");
            if (!r0Var.f18847a) {
                r0Var.d(viewGroup);
            }
            r0Var.f18847a = true;
        }
    }

    public final void l() {
        Iterator it = this.f18807b.iterator();
        while (it.hasNext()) {
            s0 s0Var = (s0) it.next();
            if (s0Var.f18851b == t0.ADDING) {
                View viewY = s0Var.f18852c.Y();
                u0 u0Var = w0.Companion;
                int visibility = viewY.getVisibility();
                u0Var.getClass();
                s0Var.d(u0.b(visibility), t0.NONE);
            }
        }
    }
}
