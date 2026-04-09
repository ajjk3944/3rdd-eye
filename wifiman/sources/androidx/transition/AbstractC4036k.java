package androidx.transition;

import F1.W;
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
import androidx.transition.AbstractC4036k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C7010a;
import o.C7028t;

/* renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4036k implements Cloneable {

    /* renamed from: I, reason: collision with root package name */
    private static final Animator[] f32448I = new Animator[0];

    /* renamed from: J, reason: collision with root package name */
    private static final int[] f32449J = {2, 1, 3, 4};

    /* renamed from: N, reason: collision with root package name */
    private static final AbstractC4032g f32450N = new a();

    /* renamed from: X, reason: collision with root package name */
    private static ThreadLocal f32451X = new ThreadLocal();

    /* renamed from: F, reason: collision with root package name */
    private e f32457F;

    /* renamed from: G, reason: collision with root package name */
    private C7010a f32458G;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f32479t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f32480u;

    /* renamed from: v, reason: collision with root package name */
    private f[] f32481v;

    /* renamed from: a, reason: collision with root package name */
    private String f32460a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    private long f32461b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f32462c = -1;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f32463d = null;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f32464e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    ArrayList f32465f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f32466g = null;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f32467h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f32468i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f32469j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f32470k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f32471l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f32472m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f32473n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f32474o = null;

    /* renamed from: p, reason: collision with root package name */
    private w f32475p = new w();

    /* renamed from: q, reason: collision with root package name */
    private w f32476q = new w();

    /* renamed from: r, reason: collision with root package name */
    t f32477r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f32478s = f32449J;

    /* renamed from: w, reason: collision with root package name */
    boolean f32482w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f32483x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private Animator[] f32484y = f32448I;

    /* renamed from: z, reason: collision with root package name */
    int f32485z = 0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f32452A = false;

    /* renamed from: B, reason: collision with root package name */
    boolean f32453B = false;

    /* renamed from: C, reason: collision with root package name */
    private AbstractC4036k f32454C = null;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList f32455D = null;

    /* renamed from: E, reason: collision with root package name */
    ArrayList f32456E = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    private AbstractC4032g f32459H = f32450N;

    /* renamed from: androidx.transition.k$a */
    class a extends AbstractC4032g {
        a() {
        }

        @Override // androidx.transition.AbstractC4032g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: androidx.transition.k$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7010a f32486a;

        b(C7010a c7010a) {
            this.f32486a = c7010a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32486a.remove(animator);
            AbstractC4036k.this.f32483x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC4036k.this.f32483x.add(animator);
        }
    }

    /* renamed from: androidx.transition.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC4036k.this.r();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.k$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f32489a;

        /* renamed from: b, reason: collision with root package name */
        String f32490b;

        /* renamed from: c, reason: collision with root package name */
        v f32491c;

        /* renamed from: d, reason: collision with root package name */
        WindowId f32492d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC4036k f32493e;

        /* renamed from: f, reason: collision with root package name */
        Animator f32494f;

        d(View view, String str, AbstractC4036k abstractC4036k, WindowId windowId, v vVar, Animator animator) {
            this.f32489a = view;
            this.f32490b = str;
            this.f32491c = vVar;
            this.f32492d = windowId;
            this.f32493e = abstractC4036k;
            this.f32494f = animator;
        }
    }

    /* renamed from: androidx.transition.k$e */
    public static abstract class e {
    }

    /* renamed from: androidx.transition.k$f */
    public interface f {
        void a(AbstractC4036k abstractC4036k);

        void b(AbstractC4036k abstractC4036k);

        default void c(AbstractC4036k abstractC4036k, boolean z10) {
            d(abstractC4036k);
        }

        void d(AbstractC4036k abstractC4036k);

        void e(AbstractC4036k abstractC4036k);

        default void f(AbstractC4036k abstractC4036k, boolean z10) {
            a(abstractC4036k);
        }

        void g(AbstractC4036k abstractC4036k);
    }

    /* renamed from: androidx.transition.k$g */
    interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f32495a = new g() { // from class: androidx.transition.l
            @Override // androidx.transition.AbstractC4036k.g
            public final void a(AbstractC4036k.f fVar, AbstractC4036k abstractC4036k, boolean z10) {
                fVar.f(abstractC4036k, z10);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final g f32496b = new g() { // from class: androidx.transition.m
            @Override // androidx.transition.AbstractC4036k.g
            public final void a(AbstractC4036k.f fVar, AbstractC4036k abstractC4036k, boolean z10) {
                fVar.c(abstractC4036k, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final g f32497c = new g() { // from class: androidx.transition.n
            @Override // androidx.transition.AbstractC4036k.g
            public final void a(AbstractC4036k.f fVar, AbstractC4036k abstractC4036k, boolean z10) {
                fVar.e(abstractC4036k);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final g f32498d = new g() { // from class: androidx.transition.o
            @Override // androidx.transition.AbstractC4036k.g
            public final void a(AbstractC4036k.f fVar, AbstractC4036k abstractC4036k, boolean z10) {
                fVar.b(abstractC4036k);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final g f32499e = new g() { // from class: androidx.transition.p
            @Override // androidx.transition.AbstractC4036k.g
            public final void a(AbstractC4036k.f fVar, AbstractC4036k abstractC4036k, boolean z10) {
                fVar.g(abstractC4036k);
            }
        };

        void a(f fVar, AbstractC4036k abstractC4036k, boolean z10);
    }

    private static C7010a E() {
        C7010a c7010a = (C7010a) f32451X.get();
        if (c7010a != null) {
            return c7010a;
        }
        C7010a c7010a2 = new C7010a();
        f32451X.set(c7010a2);
        return c7010a2;
    }

    private static boolean P(v vVar, v vVar2, String str) {
        Object obj = vVar.f32516a.get(str);
        Object obj2 = vVar2.f32516a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void Q(C7010a c7010a, C7010a c7010a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && O(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && O(view)) {
                v vVar = (v) c7010a.get(view2);
                v vVar2 = (v) c7010a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f32479t.add(vVar);
                    this.f32480u.add(vVar2);
                    c7010a.remove(view2);
                    c7010a2.remove(view);
                }
            }
        }
    }

    private void R(C7010a c7010a, C7010a c7010a2) {
        v vVar;
        for (int size = c7010a.size() - 1; size >= 0; size--) {
            View view = (View) c7010a.h(size);
            if (view != null && O(view) && (vVar = (v) c7010a2.remove(view)) != null && O(vVar.f32517b)) {
                this.f32479t.add((v) c7010a.j(size));
                this.f32480u.add(vVar);
            }
        }
    }

    private void S(C7010a c7010a, C7010a c7010a2, C7028t c7028t, C7028t c7028t2) {
        View view;
        int iO = c7028t.o();
        for (int i10 = 0; i10 < iO; i10++) {
            View view2 = (View) c7028t.p(i10);
            if (view2 != null && O(view2) && (view = (View) c7028t2.e(c7028t.i(i10))) != null && O(view)) {
                v vVar = (v) c7010a.get(view2);
                v vVar2 = (v) c7010a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f32479t.add(vVar);
                    this.f32480u.add(vVar2);
                    c7010a.remove(view2);
                    c7010a2.remove(view);
                }
            }
        }
    }

    private void U(C7010a c7010a, C7010a c7010a2, C7010a c7010a3, C7010a c7010a4) {
        View view;
        int size = c7010a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c7010a3.l(i10);
            if (view2 != null && O(view2) && (view = (View) c7010a4.get(c7010a3.h(i10))) != null && O(view)) {
                v vVar = (v) c7010a.get(view2);
                v vVar2 = (v) c7010a2.get(view);
                if (vVar != null && vVar2 != null) {
                    this.f32479t.add(vVar);
                    this.f32480u.add(vVar2);
                    c7010a.remove(view2);
                    c7010a2.remove(view);
                }
            }
        }
    }

    private void V(w wVar, w wVar2) {
        C7010a c7010a = new C7010a(wVar.f32519a);
        C7010a c7010a2 = new C7010a(wVar2.f32519a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f32478s;
            if (i10 >= iArr.length) {
                d(c7010a, c7010a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                R(c7010a, c7010a2);
            } else if (i11 == 2) {
                U(c7010a, c7010a2, wVar.f32522d, wVar2.f32522d);
            } else if (i11 == 3) {
                Q(c7010a, c7010a2, wVar.f32520b, wVar2.f32520b);
            } else if (i11 == 4) {
                S(c7010a, c7010a2, wVar.f32521c, wVar2.f32521c);
            }
            i10++;
        }
    }

    private void W(AbstractC4036k abstractC4036k, g gVar, boolean z10) {
        AbstractC4036k abstractC4036k2 = this.f32454C;
        if (abstractC4036k2 != null) {
            abstractC4036k2.W(abstractC4036k, gVar, z10);
        }
        ArrayList arrayList = this.f32455D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f32455D.size();
        f[] fVarArr = this.f32481v;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.f32481v = null;
        f[] fVarArr2 = (f[]) this.f32455D.toArray(fVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            gVar.a(fVarArr2[i10], abstractC4036k, z10);
            fVarArr2[i10] = null;
        }
        this.f32481v = fVarArr2;
    }

    private void d(C7010a c7010a, C7010a c7010a2) {
        for (int i10 = 0; i10 < c7010a.size(); i10++) {
            v vVar = (v) c7010a.l(i10);
            if (O(vVar.f32517b)) {
                this.f32479t.add(vVar);
                this.f32480u.add(null);
            }
        }
        for (int i11 = 0; i11 < c7010a2.size(); i11++) {
            v vVar2 = (v) c7010a2.l(i11);
            if (O(vVar2.f32517b)) {
                this.f32480u.add(vVar2);
                this.f32479t.add(null);
            }
        }
    }

    private static void e(w wVar, View view, v vVar) {
        wVar.f32519a.put(view, vVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (wVar.f32520b.indexOfKey(id2) >= 0) {
                wVar.f32520b.put(id2, null);
            } else {
                wVar.f32520b.put(id2, view);
            }
        }
        String strH = W.H(view);
        if (strH != null) {
            if (wVar.f32522d.containsKey(strH)) {
                wVar.f32522d.put(strH, null);
            } else {
                wVar.f32522d.put(strH, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (wVar.f32521c.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    wVar.f32521c.k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) wVar.f32521c.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    wVar.f32521c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    private void e0(Animator animator, C7010a c7010a) {
        if (animator != null) {
            animator.addListener(new b(c7010a));
            f(animator);
        }
    }

    private void i(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f32468i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f32469j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f32470k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f32470k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    v vVar = new v(view);
                    if (z10) {
                        l(vVar);
                    } else {
                        h(vVar);
                    }
                    vVar.f32518c.add(this);
                    k(vVar);
                    if (z10) {
                        e(this.f32475p, view, vVar);
                    } else {
                        e(this.f32476q, view, vVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f32472m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f32473n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f32474o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f32474o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                i(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public AbstractC4032g A() {
        return this.f32459H;
    }

    public s B() {
        return null;
    }

    public final AbstractC4036k D() {
        t tVar = this.f32477r;
        return tVar != null ? tVar.D() : this;
    }

    public long F() {
        return this.f32461b;
    }

    public List G() {
        return this.f32464e;
    }

    public List H() {
        return this.f32466g;
    }

    public List I() {
        return this.f32467h;
    }

    public List K() {
        return this.f32465f;
    }

    public String[] L() {
        return null;
    }

    public v M(View view, boolean z10) {
        t tVar = this.f32477r;
        if (tVar != null) {
            return tVar.M(view, z10);
        }
        return (v) (z10 ? this.f32475p : this.f32476q).f32519a.get(view);
    }

    public boolean N(v vVar, v vVar2) {
        if (vVar == null || vVar2 == null) {
            return false;
        }
        String[] strArrL = L();
        if (strArrL == null) {
            Iterator it = vVar.f32516a.keySet().iterator();
            while (it.hasNext()) {
                if (P(vVar, vVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrL) {
            if (!P(vVar, vVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean O(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f32468i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f32469j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f32470k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f32470k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f32471l != null && W.H(view) != null && this.f32471l.contains(W.H(view))) {
            return false;
        }
        if ((this.f32464e.size() == 0 && this.f32465f.size() == 0 && (((arrayList = this.f32467h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f32466g) == null || arrayList2.isEmpty()))) || this.f32464e.contains(Integer.valueOf(id2)) || this.f32465f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f32466g;
        if (arrayList6 != null && arrayList6.contains(W.H(view))) {
            return true;
        }
        if (this.f32467h != null) {
            for (int i11 = 0; i11 < this.f32467h.size(); i11++) {
                if (((Class) this.f32467h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void X(g gVar, boolean z10) {
        W(this, gVar, z10);
    }

    public void Y(View view) {
        if (this.f32453B) {
            return;
        }
        int size = this.f32483x.size();
        Animator[] animatorArr = (Animator[]) this.f32483x.toArray(this.f32484y);
        this.f32484y = f32448I;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f32484y = animatorArr;
        X(g.f32498d, false);
        this.f32452A = true;
    }

    void Z(ViewGroup viewGroup) {
        d dVar;
        this.f32479t = new ArrayList();
        this.f32480u = new ArrayList();
        V(this.f32475p, this.f32476q);
        C7010a c7010aE = E();
        int size = c7010aE.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c7010aE.h(i10);
            if (animator != null && (dVar = (d) c7010aE.get(animator)) != null && dVar.f32489a != null && windowId.equals(dVar.f32492d)) {
                v vVar = dVar.f32491c;
                View view = dVar.f32489a;
                v vVarM = M(view, true);
                v vVarX = x(view, true);
                if (vVarM == null && vVarX == null) {
                    vVarX = (v) this.f32476q.f32519a.get(view);
                }
                if ((vVarM != null || vVarX != null) && dVar.f32493e.N(vVar, vVarX)) {
                    dVar.f32493e.D().getClass();
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c7010aE.remove(animator);
                    }
                }
            }
        }
        q(viewGroup, this.f32475p, this.f32476q, this.f32479t, this.f32480u);
        f0();
    }

    public AbstractC4036k a0(f fVar) {
        AbstractC4036k abstractC4036k;
        ArrayList arrayList = this.f32455D;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(fVar) && (abstractC4036k = this.f32454C) != null) {
            abstractC4036k.a0(fVar);
        }
        if (this.f32455D.size() == 0) {
            this.f32455D = null;
        }
        return this;
    }

    public AbstractC4036k b(f fVar) {
        if (this.f32455D == null) {
            this.f32455D = new ArrayList();
        }
        this.f32455D.add(fVar);
        return this;
    }

    public AbstractC4036k c(View view) {
        this.f32465f.add(view);
        return this;
    }

    public AbstractC4036k c0(View view) {
        this.f32465f.remove(view);
        return this;
    }

    protected void cancel() {
        int size = this.f32483x.size();
        Animator[] animatorArr = (Animator[]) this.f32483x.toArray(this.f32484y);
        this.f32484y = f32448I;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f32484y = animatorArr;
        X(g.f32497c, false);
    }

    public void d0(View view) {
        if (this.f32452A) {
            if (!this.f32453B) {
                int size = this.f32483x.size();
                Animator[] animatorArr = (Animator[]) this.f32483x.toArray(this.f32484y);
                this.f32484y = f32448I;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f32484y = animatorArr;
                X(g.f32499e, false);
            }
            this.f32452A = false;
        }
    }

    protected void f(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (F() >= 0) {
            animator.setStartDelay(F() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void f0() {
        m0();
        C7010a c7010aE = E();
        Iterator it = this.f32456E.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (c7010aE.containsKey(animator)) {
                m0();
                e0(animator, c7010aE);
            }
        }
        this.f32456E.clear();
        r();
    }

    public AbstractC4036k g0(long j10) {
        this.f32462c = j10;
        return this;
    }

    public abstract void h(v vVar);

    public void h0(e eVar) {
        this.f32457F = eVar;
    }

    public AbstractC4036k i0(TimeInterpolator timeInterpolator) {
        this.f32463d = timeInterpolator;
        return this;
    }

    public void j0(AbstractC4032g abstractC4032g) {
        if (abstractC4032g == null) {
            this.f32459H = f32450N;
        } else {
            this.f32459H = abstractC4032g;
        }
    }

    void k(v vVar) {
    }

    public void k0(s sVar) {
    }

    public abstract void l(v vVar);

    public AbstractC4036k l0(long j10) {
        this.f32461b = j10;
        return this;
    }

    void m(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C7010a c7010a;
        n(z10);
        if ((this.f32464e.size() > 0 || this.f32465f.size() > 0) && (((arrayList = this.f32466g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f32467h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f32464e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f32464e.get(i10)).intValue());
                if (viewFindViewById != null) {
                    v vVar = new v(viewFindViewById);
                    if (z10) {
                        l(vVar);
                    } else {
                        h(vVar);
                    }
                    vVar.f32518c.add(this);
                    k(vVar);
                    if (z10) {
                        e(this.f32475p, viewFindViewById, vVar);
                    } else {
                        e(this.f32476q, viewFindViewById, vVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f32465f.size(); i11++) {
                View view = (View) this.f32465f.get(i11);
                v vVar2 = new v(view);
                if (z10) {
                    l(vVar2);
                } else {
                    h(vVar2);
                }
                vVar2.f32518c.add(this);
                k(vVar2);
                if (z10) {
                    e(this.f32475p, view, vVar2);
                } else {
                    e(this.f32476q, view, vVar2);
                }
            }
        } else {
            i(viewGroup, z10);
        }
        if (z10 || (c7010a = this.f32458G) == null) {
            return;
        }
        int size = c7010a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add((View) this.f32475p.f32522d.remove((String) this.f32458G.h(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f32475p.f32522d.put((String) this.f32458G.l(i13), view2);
            }
        }
    }

    protected void m0() {
        if (this.f32485z == 0) {
            X(g.f32495a, false);
            this.f32453B = false;
        }
        this.f32485z++;
    }

    void n(boolean z10) {
        if (z10) {
            this.f32475p.f32519a.clear();
            this.f32475p.f32520b.clear();
            this.f32475p.f32521c.b();
        } else {
            this.f32476q.f32519a.clear();
            this.f32476q.f32520b.clear();
            this.f32476q.f32521c.b();
        }
    }

    String n0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f32462c != -1) {
            sb2.append("dur(");
            sb2.append(this.f32462c);
            sb2.append(") ");
        }
        if (this.f32461b != -1) {
            sb2.append("dly(");
            sb2.append(this.f32461b);
            sb2.append(") ");
        }
        if (this.f32463d != null) {
            sb2.append("interp(");
            sb2.append(this.f32463d);
            sb2.append(") ");
        }
        if (this.f32464e.size() > 0 || this.f32465f.size() > 0) {
            sb2.append("tgts(");
            if (this.f32464e.size() > 0) {
                for (int i10 = 0; i10 < this.f32464e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f32464e.get(i10));
                }
            }
            if (this.f32465f.size() > 0) {
                for (int i11 = 0; i11 < this.f32465f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f32465f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // 
    /* renamed from: o */
    public AbstractC4036k clone() {
        try {
            AbstractC4036k abstractC4036k = (AbstractC4036k) super.clone();
            abstractC4036k.f32456E = new ArrayList();
            abstractC4036k.f32475p = new w();
            abstractC4036k.f32476q = new w();
            abstractC4036k.f32479t = null;
            abstractC4036k.f32480u = null;
            abstractC4036k.f32454C = this;
            abstractC4036k.f32455D = null;
            return abstractC4036k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    void q(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        v vVar;
        int i10;
        Animator animator2;
        v vVar2;
        C7010a c7010aE = E();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        D().getClass();
        int i11 = 0;
        while (i11 < size) {
            v vVar3 = (v) arrayList.get(i11);
            v vVar4 = (v) arrayList2.get(i11);
            if (vVar3 != null && !vVar3.f32518c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.f32518c.contains(this)) {
                vVar4 = null;
            }
            if ((vVar3 != null || vVar4 != null) && (vVar3 == null || vVar4 == null || N(vVar3, vVar4))) {
                Animator animatorP = p(viewGroup, vVar3, vVar4);
                if (animatorP != null) {
                    if (vVar4 != null) {
                        View view2 = vVar4.f32517b;
                        String[] strArrL = L();
                        if (strArrL != null && strArrL.length > 0) {
                            vVar2 = new v(view2);
                            v vVar5 = (v) wVar2.f32519a.get(view2);
                            if (vVar5 != null) {
                                int i12 = 0;
                                while (i12 < strArrL.length) {
                                    Map map = vVar2.f32516a;
                                    Animator animator3 = animatorP;
                                    String str = strArrL[i12];
                                    map.put(str, vVar5.f32516a.get(str));
                                    i12++;
                                    animatorP = animator3;
                                    strArrL = strArrL;
                                }
                            }
                            Animator animator4 = animatorP;
                            int size2 = c7010aE.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) c7010aE.get((Animator) c7010aE.h(i13));
                                if (dVar.f32491c != null && dVar.f32489a == view2 && dVar.f32490b.equals(z()) && dVar.f32491c.equals(vVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            animator2 = animatorP;
                            vVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        vVar = vVar2;
                    } else {
                        view = vVar3.f32517b;
                        animator = animatorP;
                        vVar = null;
                    }
                    if (animator != null) {
                        i10 = size;
                        c7010aE.put(animator, new d(view, z(), this, viewGroup.getWindowId(), vVar, animator));
                        this.f32456E.add(animator);
                    }
                }
                i11++;
                size = i10;
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                d dVar2 = (d) c7010aE.get((Animator) this.f32456E.get(sparseIntArray.keyAt(i14)));
                dVar2.f32494f.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + dVar2.f32494f.getStartDelay());
            }
        }
    }

    protected void r() {
        int i10 = this.f32485z - 1;
        this.f32485z = i10;
        if (i10 == 0) {
            X(g.f32496b, false);
            for (int i11 = 0; i11 < this.f32475p.f32521c.o(); i11++) {
                View view = (View) this.f32475p.f32521c.p(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f32476q.f32521c.o(); i12++) {
                View view2 = (View) this.f32476q.f32521c.p(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f32453B = true;
        }
    }

    public long t() {
        return this.f32462c;
    }

    public String toString() {
        return n0("");
    }

    public e u() {
        return this.f32457F;
    }

    public TimeInterpolator w() {
        return this.f32463d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f32480u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f32479t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (androidx.transition.v) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.transition.v x(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.t r0 = r5.f32477r
            if (r0 == 0) goto L9
            androidx.transition.v r6 = r0.x(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f32479t
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f32480u
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
            androidx.transition.v r4 = (androidx.transition.v) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f32517b
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
            java.util.ArrayList r6 = r5.f32480u
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f32479t
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            androidx.transition.v r1 = (androidx.transition.v) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC4036k.x(android.view.View, boolean):androidx.transition.v");
    }

    public String z() {
        return this.f32460a;
    }
}
