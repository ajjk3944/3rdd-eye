package K1;

import L0.I;
import L0.S;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.C5308a;
import m0.C5313f;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class i implements Cloneable {

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<p> f2988l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<p> f2989m;

    /* renamed from: n, reason: collision with root package name */
    public d[] f2990n;

    /* renamed from: w, reason: collision with root package name */
    public c f2999w;

    /* renamed from: y, reason: collision with root package name */
    public static final Animator[] f2977y = new Animator[0];

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2978z = {2, 1, 3, 4};

    /* renamed from: A, reason: collision with root package name */
    public static final a f2975A = new a();

    /* renamed from: B, reason: collision with root package name */
    public static final ThreadLocal<C5308a<Animator, b>> f2976B = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public final String f2979b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    public long f2980c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f2981d = -1;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2982e = null;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<Integer> f2983f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<View> f2984g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public q f2985h = new q();
    public q i = new q();

    /* renamed from: j, reason: collision with root package name */
    public n f2986j = null;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2987k = f2978z;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList<Animator> f2991o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    public Animator[] f2992p = f2977y;

    /* renamed from: q, reason: collision with root package name */
    public int f2993q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2994r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2995s = false;

    /* renamed from: t, reason: collision with root package name */
    public i f2996t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<d> f2997u = null;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList<Animator> f2998v = new ArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    public a f3000x = f2975A;

    /* compiled from: Transition.java */
    public class a extends I9.g {
        public final Path i0(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* compiled from: Transition.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public View f3001a;

        /* renamed from: b, reason: collision with root package name */
        public String f3002b;

        /* renamed from: c, reason: collision with root package name */
        public p f3003c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f3004d;

        /* renamed from: e, reason: collision with root package name */
        public i f3005e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f3006f;
    }

    /* compiled from: Transition.java */
    public static abstract class c {
    }

    /* compiled from: Transition.java */
    public interface d {
        void a(i iVar);

        void b(i iVar);

        void c(i iVar);

        void d(i iVar);

        void e(i iVar);

        void f(i iVar);

        void g(i iVar);
    }

    /* compiled from: Transition.java */
    public interface e {

        /* renamed from: X7, reason: collision with root package name */
        public static final B4.f f3007X7 = new B4.f(7);

        /* renamed from: Y7, reason: collision with root package name */
        public static final B4.g f3008Y7 = new B4.g(6);

        /* renamed from: Z7, reason: collision with root package name */
        public static final B4.h f3009Z7 = new B4.h(6);

        /* renamed from: a8, reason: collision with root package name */
        public static final B4.i f3010a8 = new B4.i(5);

        /* renamed from: b8, reason: collision with root package name */
        public static final F3.h f3011b8 = new F3.h(5);

        void b(d dVar, i iVar);
    }

    public static void e(q qVar, View view, p pVar) {
        ((C5308a) qVar.f3034b).put(view, pVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) qVar.f3036d;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        String strK = I.d.k(view);
        if (strK != null) {
            C5308a c5308a = (C5308a) qVar.f3035c;
            if (c5308a.containsKey(strK)) {
                c5308a.put(strK, null);
            } else {
                c5308a.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C5313f c5313f = (C5313f) qVar.f3037e;
                if (c5313f.g(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c5313f.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c5313f.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c5313f.i(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C5308a<Animator, b> s() {
        ThreadLocal<C5308a<Animator, b>> threadLocal = f2976B;
        C5308a<Animator, b> c5308a = threadLocal.get();
        if (c5308a != null) {
            return c5308a;
        }
        C5308a<Animator, b> c5308a2 = new C5308a<>();
        threadLocal.set(c5308a2);
        return c5308a2;
    }

    public void B(View view) {
        this.f2984g.remove(view);
    }

    public void C(View view) {
        if (this.f2994r) {
            if (!this.f2995s) {
                ArrayList<Animator> arrayList = this.f2991o;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2992p);
                this.f2992p = f2977y;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2992p = animatorArr;
                x(this, e.f3011b8);
            }
            this.f2994r = false;
        }
    }

    public void D() {
        K();
        C5308a<Animator, b> c5308aS = s();
        Iterator<Animator> it = this.f2998v.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c5308aS.containsKey(next)) {
                K();
                if (next != null) {
                    next.addListener(new j(this, c5308aS));
                    long j4 = this.f2981d;
                    if (j4 >= 0) {
                        next.setDuration(j4);
                    }
                    long j10 = this.f2980c;
                    if (j10 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f2982e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.f2998v.clear();
        o();
    }

    public void E(long j4) {
        this.f2981d = j4;
    }

    public void F(c cVar) {
        this.f2999w = cVar;
    }

    public void G(TimeInterpolator timeInterpolator) {
        this.f2982e = timeInterpolator;
    }

    public void H(a aVar) {
        if (aVar == null) {
            this.f3000x = f2975A;
        } else {
            this.f3000x = aVar;
        }
    }

    public void J(long j4) {
        this.f2980c = j4;
    }

    public final void K() {
        if (this.f2993q == 0) {
            x(this, e.f3007X7);
            this.f2995s = false;
        }
        this.f2993q++;
    }

    public String L(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2981d != -1) {
            sb.append("dur(");
            sb.append(this.f2981d);
            sb.append(") ");
        }
        if (this.f2980c != -1) {
            sb.append("dly(");
            sb.append(this.f2980c);
            sb.append(") ");
        }
        if (this.f2982e != null) {
            sb.append("interp(");
            sb.append(this.f2982e);
            sb.append(") ");
        }
        ArrayList<Integer> arrayList = this.f2983f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2984g;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i10));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(d dVar) {
        if (this.f2997u == null) {
            this.f2997u = new ArrayList<>();
        }
        this.f2997u.add(dVar);
    }

    public void b(int i) {
        if (i != 0) {
            this.f2983f.add(Integer.valueOf(i));
        }
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.f2991o;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2992p);
        this.f2992p = f2977y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2992p = animatorArr;
        x(this, e.f3009Z7);
    }

    public void d(View view) {
        this.f2984g.add(view);
    }

    public abstract void f(p pVar);

    public final void g(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            p pVar = new p(view);
            if (z10) {
                i(pVar);
            } else {
                f(pVar);
            }
            pVar.f3033c.add(this);
            h(pVar);
            if (z10) {
                e(this.f2985h, view, pVar);
            } else {
                e(this.i, view, pVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z10);
            }
        }
    }

    public abstract void i(p pVar);

    public final void j(ViewGroup viewGroup, boolean z10) {
        k(z10);
        ArrayList<Integer> arrayList = this.f2983f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2984g;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z10);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i).intValue());
            if (viewFindViewById != null) {
                p pVar = new p(viewFindViewById);
                if (z10) {
                    i(pVar);
                } else {
                    f(pVar);
                }
                pVar.f3033c.add(this);
                h(pVar);
                if (z10) {
                    e(this.f2985h, viewFindViewById, pVar);
                } else {
                    e(this.i, viewFindViewById, pVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = arrayList2.get(i10);
            p pVar2 = new p(view);
            if (z10) {
                i(pVar2);
            } else {
                f(pVar2);
            }
            pVar2.f3033c.add(this);
            h(pVar2);
            if (z10) {
                e(this.f2985h, view, pVar2);
            } else {
                e(this.i, view, pVar2);
            }
        }
    }

    public final void k(boolean z10) {
        if (z10) {
            ((C5308a) this.f2985h.f3034b).clear();
            ((SparseArray) this.f2985h.f3036d).clear();
            ((C5313f) this.f2985h.f3037e).b();
        } else {
            ((C5308a) this.i.f3034b).clear();
            ((SparseArray) this.i.f3036d).clear();
            ((C5313f) this.i.f3037e).b();
        }
    }

    @Override // 
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f2998v = new ArrayList<>();
            iVar.f2985h = new q();
            iVar.i = new q();
            iVar.f2988l = null;
            iVar.f2989m = null;
            iVar.f2996t = this;
            iVar.f2997u = null;
            return iVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator m(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        int i;
        int i10;
        View view;
        p pVar;
        Animator animator;
        p pVar2;
        C5308a<Animator, b> c5308aS = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        r().getClass();
        int i11 = 0;
        while (i11 < size) {
            p pVar3 = arrayList.get(i11);
            p pVar4 = arrayList2.get(i11);
            if (pVar3 != null && !pVar3.f3033c.contains(this)) {
                pVar3 = null;
            }
            if (pVar4 != null && !pVar4.f3033c.contains(this)) {
                pVar4 = null;
            }
            if ((pVar3 != null || pVar4 != null) && (pVar3 == null || pVar4 == null || v(pVar3, pVar4))) {
                Animator animatorM = m(viewGroup, pVar3, pVar4);
                if (animatorM != null) {
                    String str = this.f2979b;
                    if (pVar4 != null) {
                        String[] strArrT = t();
                        view = pVar4.f3032b;
                        if (strArrT != null && strArrT.length > 0) {
                            pVar2 = new p(view);
                            p pVar5 = (p) ((C5308a) qVar2.f3034b).get(view);
                            i = size;
                            if (pVar5 != null) {
                                int i12 = 0;
                                while (i12 < strArrT.length) {
                                    HashMap map = pVar2.f3031a;
                                    int i13 = i11;
                                    String str2 = strArrT[i12];
                                    map.put(str2, pVar5.f3031a.get(str2));
                                    i12++;
                                    i11 = i13;
                                }
                            }
                            i10 = i11;
                            int i14 = c5308aS.f44030d;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    animator = animatorM;
                                    break;
                                }
                                b bVar = c5308aS.get(c5308aS.g(i15));
                                if (bVar.f3003c != null && bVar.f3001a == view && bVar.f3002b.equals(str) && bVar.f3003c.equals(pVar2)) {
                                    animator = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i = size;
                            i10 = i11;
                            animator = animatorM;
                            pVar2 = null;
                        }
                        animatorM = animator;
                        pVar = pVar2;
                    } else {
                        i = size;
                        i10 = i11;
                        view = pVar3.f3032b;
                        pVar = null;
                    }
                    if (animatorM != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        b bVar2 = new b();
                        bVar2.f3001a = view;
                        bVar2.f3002b = str;
                        bVar2.f3003c = pVar;
                        bVar2.f3004d = windowId;
                        bVar2.f3005e = this;
                        bVar2.f3006f = animatorM;
                        c5308aS.put(animatorM, bVar2);
                        this.f2998v.add(animatorM);
                    }
                }
                i11 = i10 + 1;
                size = i;
            }
            i = size;
            i10 = i11;
            i11 = i10 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                b bVar3 = c5308aS.get(this.f2998v.get(sparseIntArray.keyAt(i16)));
                bVar3.f3006f.setStartDelay(bVar3.f3006f.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.f2993q - 1;
        this.f2993q = i;
        if (i == 0) {
            x(this, e.f3008Y7);
            for (int i10 = 0; i10 < ((C5313f) this.f2985h.f3037e).j(); i10++) {
                View view = (View) ((C5313f) this.f2985h.f3037e).k(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((C5313f) this.i.f3037e).j(); i11++) {
                View view2 = (View) ((C5313f) this.i.f3037e).k(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2995s = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(ViewGroup viewGroup) {
        C5308a<Animator, b> c5308aS = s();
        int i = c5308aS.f44030d;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C5308a c5308a = new C5308a(c5308aS);
        c5308aS.clear();
        for (int i10 = i - 1; i10 >= 0; i10--) {
            b bVar = (b) c5308a.l(i10);
            if (bVar.f3001a != null && windowId.equals(bVar.f3004d)) {
                ((Animator) c5308a.g(i10)).end();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f2989m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f2988l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final K1.p q(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            K1.n r0 = r4.f2986j
            if (r0 == 0) goto L9
            K1.p r5 = r0.q(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList<K1.p> r0 = r4.f2988l
            goto L10
        Le:
            java.util.ArrayList<K1.p> r0 = r4.f2989m
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            K1.p r3 = (K1.p) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f3032b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList<K1.p> r5 = r4.f2989m
            goto L35
        L33:
            java.util.ArrayList<K1.p> r5 = r4.f2988l
        L35:
            java.lang.Object r5 = r5.get(r2)
            K1.p r5 = (K1.p) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.i.q(android.view.View, boolean):K1.p");
    }

    public final i r() {
        n nVar = this.f2986j;
        return nVar != null ? nVar.r() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return L("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p u(View view, boolean z10) {
        n nVar = this.f2986j;
        if (nVar != null) {
            return nVar.u(view, z10);
        }
        return (p) ((C5308a) (z10 ? this.f2985h : this.i).f3034b).get(view);
    }

    public boolean v(p pVar, p pVar2) {
        if (pVar != null && pVar2 != null) {
            String[] strArrT = t();
            HashMap map = pVar.f3031a;
            HashMap map2 = pVar2.f3031a;
            if (strArrT != null) {
                for (String str : strArrT) {
                    Object obj = map.get(str);
                    Object obj2 = map2.get(str);
                    if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                        return true;
                    }
                }
            } else {
                for (String str2 : map.keySet()) {
                    Object obj3 = map.get(str2);
                    Object obj4 = map2.get(str2);
                    if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean w(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f2983f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2984g;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void x(i iVar, e eVar) {
        i iVar2 = this.f2996t;
        if (iVar2 != null) {
            iVar2.x(iVar, eVar);
        }
        ArrayList<d> arrayList = this.f2997u;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2997u.size();
        d[] dVarArr = this.f2990n;
        if (dVarArr == null) {
            dVarArr = new d[size];
        }
        this.f2990n = null;
        d[] dVarArr2 = (d[]) this.f2997u.toArray(dVarArr);
        for (int i = 0; i < size; i++) {
            eVar.b(dVarArr2[i], iVar);
            dVarArr2[i] = null;
        }
        this.f2990n = dVarArr2;
    }

    public void y(ViewGroup viewGroup) {
        if (this.f2995s) {
            return;
        }
        ArrayList<Animator> arrayList = this.f2991o;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2992p);
        this.f2992p = f2977y;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2992p = animatorArr;
        x(this, e.f3010a8);
        this.f2994r = true;
    }

    public i z(d dVar) {
        i iVar;
        ArrayList<d> arrayList = this.f2997u;
        if (arrayList != null) {
            if (!arrayList.remove(dVar) && (iVar = this.f2996t) != null) {
                iVar.z(dVar);
            }
            if (this.f2997u.size() == 0) {
                this.f2997u = null;
            }
        }
        return this;
    }

    public void I() {
    }

    public void h(p pVar) {
    }
}
