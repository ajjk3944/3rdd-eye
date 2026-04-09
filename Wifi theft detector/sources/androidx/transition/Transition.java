package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.h;
import y1.o;
import y1.q;
import y1.r;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final Animator[] I = new Animator[0];
    public static final int[] J = {2, 1, 3, 4};
    public static final y1.d K = new a();
    public static ThreadLocal L = new ThreadLocal();
    public e F;
    public r.a G;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f4155t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4156u;

    /* renamed from: v, reason: collision with root package name */
    public f[] f4157v;

    /* renamed from: a, reason: collision with root package name */
    public String f4136a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f4137b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f4138c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f4139d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4140e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f4141f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f4142g = null;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4143h = null;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4144i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f4145j = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4146k = null;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4147l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4148m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4149n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4150o = null;

    /* renamed from: p, reason: collision with root package name */
    public r f4151p = new r();

    /* renamed from: q, reason: collision with root package name */
    public r f4152q = new r();

    /* renamed from: r, reason: collision with root package name */
    public androidx.transition.f f4153r = null;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4154s = J;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4158w = false;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f4159x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public Animator[] f4160y = I;

    /* renamed from: z, reason: collision with root package name */
    public int f4161z = 0;
    public boolean A = false;
    public boolean B = false;
    public Transition C = null;
    public ArrayList D = null;
    public ArrayList E = new ArrayList();
    public y1.d H = K;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface MatchOrder {
    }

    public class a extends y1.d {
        @Override // y1.d
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r.a f4162a;

        public b(r.a aVar) {
            this.f4162a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4162a.remove(animator);
            Transition.this.f4159x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f4159x.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.o();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public View f4165a;

        /* renamed from: b, reason: collision with root package name */
        public String f4166b;

        /* renamed from: c, reason: collision with root package name */
        public q f4167c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f4168d;

        /* renamed from: e, reason: collision with root package name */
        public Transition f4169e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f4170f;

        public d(View view, String str, Transition transition, WindowId windowId, q qVar, Animator animator) {
            this.f4165a = view;
            this.f4166b = str;
            this.f4167c = qVar;
            this.f4168d = windowId;
            this.f4169e = transition;
            this.f4170f = animator;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition, boolean z10);

        void e(Transition transition);

        void f(Transition transition);

        void g(Transition transition, boolean z10);
    }

    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4171a = new g() { // from class: y1.i
            @Override // androidx.transition.Transition.g
            public final void a(Transition.f fVar, Transition transition, boolean z10) {
                fVar.g(transition, z10);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final g f4172b = new g() { // from class: y1.j
            @Override // androidx.transition.Transition.g
            public final void a(Transition.f fVar, Transition transition, boolean z10) {
                fVar.d(transition, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final g f4173c = new g() { // from class: y1.k
            @Override // androidx.transition.Transition.g
            public final void a(Transition.f fVar, Transition transition, boolean z10) {
                fVar.f(transition);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final g f4174d = new g() { // from class: y1.l
            @Override // androidx.transition.Transition.g
            public final void a(Transition.f fVar, Transition transition, boolean z10) {
                fVar.c(transition);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final g f4175e = new g() { // from class: y1.m
            @Override // androidx.transition.Transition.g
            public final void a(Transition.f fVar, Transition transition, boolean z10) {
                fVar.a(transition);
            }
        };

        void a(f fVar, Transition transition, boolean z10);
    }

    public static boolean H(q qVar, q qVar2, String str) {
        Object obj = qVar.f25089a.get(str);
        Object obj2 = qVar2.f25089a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(r rVar, View view, q qVar) {
        rVar.f25092a.put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            if (rVar.f25093b.indexOfKey(id) >= 0) {
                rVar.f25093b.put(id, null);
            } else {
                rVar.f25093b.put(id, view);
            }
        }
        String strH = ViewCompat.H(view);
        if (strH != null) {
            if (rVar.f25095d.containsKey(strH)) {
                rVar.f25095d.put(strH, null);
            } else {
                rVar.f25095d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (rVar.f25094c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    rVar.f25094c.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) rVar.f25094c.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    rVar.f25094c.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static r.a x() {
        r.a aVar = (r.a) L.get();
        if (aVar != null) {
            return aVar;
        }
        r.a aVar2 = new r.a();
        L.set(aVar2);
        return aVar2;
    }

    public List A() {
        return this.f4142g;
    }

    public List B() {
        return this.f4143h;
    }

    public List C() {
        return this.f4141f;
    }

    public String[] D() {
        return null;
    }

    public q E(View view, boolean z10) {
        androidx.transition.f fVar = this.f4153r;
        if (fVar != null) {
            return fVar.E(view, z10);
        }
        return (q) (z10 ? this.f4151p : this.f4152q).f25092a.get(view);
    }

    public boolean F(q qVar, q qVar2) {
        if (qVar != null && qVar2 != null) {
            String[] strArrD = D();
            if (strArrD != null) {
                for (String str : strArrD) {
                    if (H(qVar, qVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = qVar.f25089a.keySet().iterator();
                while (it.hasNext()) {
                    if (H(qVar, qVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean G(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f4144i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f4145j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f4146k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f4146k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f4147l != null && ViewCompat.H(view) != null && this.f4147l.contains(ViewCompat.H(view))) {
            return false;
        }
        if ((this.f4140e.size() == 0 && this.f4141f.size() == 0 && (((arrayList = this.f4143h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f4142g) == null || arrayList2.isEmpty()))) || this.f4140e.contains(Integer.valueOf(id)) || this.f4141f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f4142g;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.H(view))) {
            return true;
        }
        if (this.f4143h != null) {
            for (int i11 = 0; i11 < this.f4143h.size(); i11++) {
                if (((Class) this.f4143h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void I(r.a aVar, r.a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && G(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && G(view)) {
                q qVar = (q) aVar.get(view2);
                q qVar2 = (q) aVar2.get(view);
                if (qVar != null && qVar2 != null) {
                    this.f4155t.add(qVar);
                    this.f4156u.add(qVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void J(r.a aVar, r.a aVar2) {
        q qVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.h(size);
            if (view != null && G(view) && (qVar = (q) aVar2.remove(view)) != null && G(qVar.f25090b)) {
                this.f4155t.add((q) aVar.j(size));
                this.f4156u.add(qVar);
            }
        }
    }

    public final void K(r.a aVar, r.a aVar2, h hVar, h hVar2) {
        View view;
        int iK = hVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            View view2 = (View) hVar.l(i10);
            if (view2 != null && G(view2) && (view = (View) hVar2.d(hVar.g(i10))) != null && G(view)) {
                q qVar = (q) aVar.get(view2);
                q qVar2 = (q) aVar2.get(view);
                if (qVar != null && qVar2 != null) {
                    this.f4155t.add(qVar);
                    this.f4156u.add(qVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void L(r.a aVar, r.a aVar2, r.a aVar3, r.a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) aVar3.l(i10);
            if (view2 != null && G(view2) && (view = (View) aVar4.get(aVar3.h(i10))) != null && G(view)) {
                q qVar = (q) aVar.get(view2);
                q qVar2 = (q) aVar2.get(view);
                if (qVar != null && qVar2 != null) {
                    this.f4155t.add(qVar);
                    this.f4156u.add(qVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void M(r rVar, r rVar2) {
        r.a aVar = new r.a(rVar.f25092a);
        r.a aVar2 = new r.a(rVar2.f25092a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4154s;
            if (i10 >= iArr.length) {
                c(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                J(aVar, aVar2);
            } else if (i11 == 2) {
                L(aVar, aVar2, rVar.f25095d, rVar2.f25095d);
            } else if (i11 == 3) {
                I(aVar, aVar2, rVar.f25093b, rVar2.f25093b);
            } else if (i11 == 4) {
                K(aVar, aVar2, rVar.f25094c, rVar2.f25094c);
            }
            i10++;
        }
    }

    public final void N(Transition transition, g gVar, boolean z10) {
        Transition transition2 = this.C;
        if (transition2 != null) {
            transition2.N(transition, gVar, z10);
        }
        ArrayList arrayList = this.D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.D.size();
        f[] fVarArr = this.f4157v;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f4157v = null;
        f[] fVarArr2 = (f[]) this.D.toArray(fVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            gVar.a(fVarArr2[i10], transition, z10);
            fVarArr2[i10] = null;
        }
        this.f4157v = fVarArr2;
    }

    public void O(g gVar, boolean z10) {
        N(this, gVar, z10);
    }

    public void P(View view) {
        if (this.B) {
            return;
        }
        int size = this.f4159x.size();
        Animator[] animatorArr = (Animator[]) this.f4159x.toArray(this.f4160y);
        this.f4160y = I;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f4160y = animatorArr;
        O(g.f4174d, false);
        this.A = true;
    }

    public void Q(ViewGroup viewGroup) {
        d dVar;
        this.f4155t = new ArrayList();
        this.f4156u = new ArrayList();
        M(this.f4151p, this.f4152q);
        r.a aVarX = x();
        int size = aVarX.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) aVarX.h(i10);
            if (animator != null && (dVar = (d) aVarX.get(animator)) != null && dVar.f4165a != null && windowId.equals(dVar.f4168d)) {
                q qVar = dVar.f4167c;
                View view = dVar.f4165a;
                q qVarE = E(view, true);
                q qVarS = s(view, true);
                if (qVarE == null && qVarS == null) {
                    qVarS = (q) this.f4152q.f25092a.get(view);
                }
                if ((qVarE != null || qVarS != null) && dVar.f4169e.F(qVar, qVarS)) {
                    dVar.f4169e.w().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        aVarX.remove(animator);
                    }
                }
            }
        }
        n(viewGroup, this.f4151p, this.f4152q, this.f4155t, this.f4156u);
        V();
    }

    public Transition R(f fVar) {
        Transition transition;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (transition = this.C) != null) {
                transition.R(fVar);
            }
            if (this.D.size() == 0) {
                this.D = null;
            }
        }
        return this;
    }

    public Transition S(View view) {
        this.f4141f.remove(view);
        return this;
    }

    public void T(View view) {
        if (this.A) {
            if (!this.B) {
                int size = this.f4159x.size();
                Animator[] animatorArr = (Animator[]) this.f4159x.toArray(this.f4160y);
                this.f4160y = I;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f4160y = animatorArr;
                O(g.f4175e, false);
            }
            this.A = false;
        }
    }

    public final void U(Animator animator, r.a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    public void V() {
        c0();
        r.a aVarX = x();
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (aVarX.containsKey(animator)) {
                c0();
                U(animator, aVarX);
            }
        }
        this.E.clear();
        o();
    }

    public Transition W(long j10) {
        this.f4138c = j10;
        return this;
    }

    public void X(e eVar) {
        this.F = eVar;
    }

    public Transition Y(TimeInterpolator timeInterpolator) {
        this.f4139d = timeInterpolator;
        return this;
    }

    public void Z(y1.d dVar) {
        if (dVar == null) {
            this.H = K;
        } else {
            this.H = dVar;
        }
    }

    public Transition a(f fVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(fVar);
        return this;
    }

    public Transition b(View view) {
        this.f4141f.add(view);
        return this;
    }

    public Transition b0(long j10) {
        this.f4137b = j10;
        return this;
    }

    public final void c(r.a aVar, r.a aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            q qVar = (q) aVar.l(i10);
            if (G(qVar.f25090b)) {
                this.f4155t.add(qVar);
                this.f4156u.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            q qVar2 = (q) aVar2.l(i11);
            if (G(qVar2.f25090b)) {
                this.f4156u.add(qVar2);
                this.f4155t.add(null);
            }
        }
    }

    public void c0() {
        if (this.f4161z == 0) {
            O(g.f4171a, false);
            this.B = false;
        }
        this.f4161z++;
    }

    public void cancel() {
        int size = this.f4159x.size();
        Animator[] animatorArr = (Animator[]) this.f4159x.toArray(this.f4160y);
        this.f4160y = I;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f4160y = animatorArr;
        O(g.f4173c, false);
    }

    public String d0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4138c != -1) {
            sb.append("dur(");
            sb.append(this.f4138c);
            sb.append(") ");
        }
        if (this.f4137b != -1) {
            sb.append("dly(");
            sb.append(this.f4137b);
            sb.append(") ");
        }
        if (this.f4139d != null) {
            sb.append("interp(");
            sb.append(this.f4139d);
            sb.append(") ");
        }
        if (this.f4140e.size() > 0 || this.f4141f.size() > 0) {
            sb.append("tgts(");
            if (this.f4140e.size() > 0) {
                for (int i10 = 0; i10 < this.f4140e.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f4140e.get(i10));
                }
            }
            if (this.f4141f.size() > 0) {
                for (int i11 = 0; i11 < this.f4141f.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f4141f.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void e(Animator animator) {
        if (animator == null) {
            o();
            return;
        }
        if (p() >= 0) {
            animator.setDuration(p());
        }
        if (y() >= 0) {
            animator.setStartDelay(y() + animator.getStartDelay());
        }
        if (r() != null) {
            animator.setInterpolator(r());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void f(q qVar);

    public final void g(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f4144i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f4145j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f4146k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f4146k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    q qVar = new q(view);
                    if (z10) {
                        i(qVar);
                    } else {
                        f(qVar);
                    }
                    qVar.f25091c.add(this);
                    h(qVar);
                    if (z10) {
                        d(this.f4151p, view, qVar);
                    } else {
                        d(this.f4152q, view, qVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f4148m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f4149n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f4150o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f4150o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                g(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public abstract void i(q qVar);

    public void j(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        r.a aVar;
        k(z10);
        if ((this.f4140e.size() > 0 || this.f4141f.size() > 0) && (((arrayList = this.f4142g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f4143h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f4140e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f4140e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    q qVar = new q(viewFindViewById);
                    if (z10) {
                        i(qVar);
                    } else {
                        f(qVar);
                    }
                    qVar.f25091c.add(this);
                    h(qVar);
                    if (z10) {
                        d(this.f4151p, viewFindViewById, qVar);
                    } else {
                        d(this.f4152q, viewFindViewById, qVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f4141f.size(); i11++) {
                View view = (View) this.f4141f.get(i11);
                q qVar2 = new q(view);
                if (z10) {
                    i(qVar2);
                } else {
                    f(qVar2);
                }
                qVar2.f25091c.add(this);
                h(qVar2);
                if (z10) {
                    d(this.f4151p, view, qVar2);
                } else {
                    d(this.f4152q, view, qVar2);
                }
            }
        } else {
            g(viewGroup, z10);
        }
        if (z10 || (aVar = this.G) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f4151p.f25095d.remove((String) this.G.h(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f4151p.f25095d.put((String) this.G.l(i13), view2);
            }
        }
    }

    public void k(boolean z10) {
        if (z10) {
            this.f4151p.f25092a.clear();
            this.f4151p.f25093b.clear();
            this.f4151p.f25094c.b();
        } else {
            this.f4152q.f25092a.clear();
            this.f4152q.f25093b.clear();
            this.f4152q.f25094c.b();
        }
    }

    @Override // 
    /* renamed from: l */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.E = new ArrayList();
            transition.f4151p = new r();
            transition.f4152q = new r();
            transition.f4155t = null;
            transition.f4156u = null;
            transition.C = this;
            transition.D = null;
            return transition;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    public void n(ViewGroup viewGroup, r rVar, r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        q qVar;
        View view2;
        Animator animator2;
        r.a aVarX = x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        w().getClass();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar2 = (q) arrayList.get(i10);
            q qVar3 = (q) arrayList2.get(i10);
            if (qVar2 != null && !qVar2.f25091c.contains(this)) {
                qVar2 = null;
            }
            if (qVar3 != null && !qVar3.f25091c.contains(this)) {
                qVar3 = null;
            }
            if ((qVar2 != null || qVar3 != null) && (qVar2 == null || qVar3 == null || F(qVar2, qVar3))) {
                Animator animatorM = m(viewGroup, qVar2, qVar3);
                if (animatorM != null) {
                    if (qVar3 != null) {
                        View view3 = qVar3.f25090b;
                        String[] strArrD = D();
                        if (strArrD != null && strArrD.length > 0) {
                            qVar = new q(view3);
                            q qVar4 = (q) rVar2.f25092a.get(view3);
                            if (qVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrD.length) {
                                    Map map = qVar.f25089a;
                                    String[] strArr = strArrD;
                                    String str = strArr[i11];
                                    map.put(str, qVar4.f25089a.get(str));
                                    i11++;
                                    strArrD = strArr;
                                }
                            }
                            int size2 = aVarX.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorM;
                                    break;
                                }
                                d dVar = (d) aVarX.get((Animator) aVarX.h(i12));
                                if (dVar.f4167c != null && dVar.f4165a == view3) {
                                    view2 = view3;
                                    if (dVar.f4166b.equals(t()) && dVar.f4167c.equals(qVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i12++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorM;
                            qVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = qVar2.f25090b;
                        animator = animatorM;
                        qVar = null;
                    }
                    if (animator != null) {
                        aVarX.put(animator, new d(view, t(), this, viewGroup.getWindowId(), qVar, animator));
                        this.E.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar2 = (d) aVarX.get((Animator) this.E.get(sparseIntArray.keyAt(i13)));
                dVar2.f4170f.setStartDelay((sparseIntArray.valueAt(i13) - Long.MAX_VALUE) + dVar2.f4170f.getStartDelay());
            }
        }
    }

    public void o() {
        int i10 = this.f4161z - 1;
        this.f4161z = i10;
        if (i10 == 0) {
            O(g.f4172b, false);
            for (int i11 = 0; i11 < this.f4151p.f25094c.k(); i11++) {
                View view = (View) this.f4151p.f25094c.l(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f4152q.f25094c.k(); i12++) {
                View view2 = (View) this.f4152q.f25094c.l(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.B = true;
        }
    }

    public long p() {
        return this.f4138c;
    }

    public e q() {
        return this.F;
    }

    public TimeInterpolator r() {
        return this.f4139d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f4156u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f4155t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (y1.q) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y1.q s(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.f r0 = r5.f4153r
            if (r0 == 0) goto L9
            y1.q r6 = r0.s(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f4155t
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f4156u
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            y1.q r4 = (y1.q) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f25090b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f4156u
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f4155t
        L36:
            java.lang.Object r6 = r6.get(r3)
            y1.q r6 = (y1.q) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.s(android.view.View, boolean):y1.q");
    }

    public String t() {
        return this.f4136a;
    }

    public String toString() {
        return d0("");
    }

    public y1.d u() {
        return this.H;
    }

    public o v() {
        return null;
    }

    public final Transition w() {
        androidx.transition.f fVar = this.f4153r;
        return fVar != null ? fVar.w() : this;
    }

    public long y() {
        return this.f4137b;
    }

    public List z() {
        return this.f4140e;
    }

    public void a0(o oVar) {
    }

    public void h(q qVar) {
    }
}
