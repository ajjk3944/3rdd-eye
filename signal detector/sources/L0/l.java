package L0;

import A3.C0134c;
import G3.C0152f;
import R.F;
import R.O;
import a.AbstractC0241a;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.C2936e;
import u.C2938g;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {

    /* renamed from: L, reason: collision with root package name */
    public static final Animator[] f2453L = new Animator[0];
    public static final int[] M = {2, 1, 3, 4};

    /* renamed from: N, reason: collision with root package name */
    public static final C0152f f2454N = new C0152f(20);

    /* renamed from: O, reason: collision with root package name */
    public static final ThreadLocal f2455O = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2475l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2476m;

    /* renamed from: n, reason: collision with root package name */
    public j[] f2477n;

    /* renamed from: a, reason: collision with root package name */
    public final String f2465a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2466b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2467c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2468d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2469e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2470f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2471g = null;

    /* renamed from: h, reason: collision with root package name */
    public c1.g f2472h = new c1.g(8);
    public c1.g i = new c1.g(8);

    /* renamed from: j, reason: collision with root package name */
    public C0156a f2473j = null;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2474k = M;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f2456C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public Animator[] f2457D = f2453L;

    /* renamed from: E, reason: collision with root package name */
    public int f2458E = 0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2459F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2460G = false;

    /* renamed from: H, reason: collision with root package name */
    public l f2461H = null;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f2462I = null;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f2463J = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    public C0152f f2464K = f2454N;

    public static void b(c1.g gVar, View view, t tVar) {
        C2936e c2936e = (C2936e) gVar.f5896b;
        C2936e c2936e2 = (C2936e) gVar.f5899e;
        SparseArray sparseArray = (SparseArray) gVar.f5897c;
        C2938g c2938g = (C2938g) gVar.f5898d;
        c2936e.put(view, tVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = O.f3270a;
        String strF = F.f(view);
        if (strF != null) {
            if (c2936e2.containsKey(strF)) {
                c2936e2.put(strF, null);
            } else {
                c2936e2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2938g.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2938g.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c2938g.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2938g.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C2936e q() {
        ThreadLocal threadLocal = f2455O;
        C2936e c2936e = (C2936e) threadLocal.get();
        if (c2936e != null) {
            return c2936e;
        }
        C2936e c2936e2 = new C2936e(0);
        threadLocal.set(c2936e2);
        return c2936e2;
    }

    public static boolean v(t tVar, t tVar2, String str) {
        Object obj = tVar.f2488a.get(str);
        Object obj2 = tVar2.f2488a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        H();
        C2936e c2936eQ = q();
        ArrayList arrayList = this.f2463J;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (c2936eQ.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new C0134c(this, c2936eQ));
                    long j6 = this.f2467c;
                    if (j6 >= 0) {
                        animator.setDuration(j6);
                    }
                    long j7 = this.f2466b;
                    if (j7 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.f2468d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new B3.x(3, this));
                    animator.start();
                }
            }
        }
        this.f2463J.clear();
        m();
    }

    public void B(long j6) {
        this.f2467c = j6;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.f2468d = timeInterpolator;
    }

    public void E(C0152f c0152f) {
        if (c0152f == null) {
            this.f2464K = f2454N;
        } else {
            this.f2464K = c0152f;
        }
    }

    public void G(long j6) {
        this.f2466b = j6;
    }

    public final void H() {
        if (this.f2458E == 0) {
            w(this, k.f2448q);
            this.f2460G = false;
        }
        this.f2458E++;
    }

    public String I(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2467c != -1) {
            sb.append("dur(");
            sb.append(this.f2467c);
            sb.append(") ");
        }
        if (this.f2466b != -1) {
            sb.append("dly(");
            sb.append(this.f2466b);
            sb.append(") ");
        }
        if (this.f2468d != null) {
            sb.append("interp(");
            sb.append(this.f2468d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2469e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2470f;
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
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(j jVar) {
        if (this.f2462I == null) {
            this.f2462I = new ArrayList();
        }
        this.f2462I.add(jVar);
    }

    public void c() {
        ArrayList arrayList = this.f2456C;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2457D);
        this.f2457D = f2453L;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2457D = animatorArr;
        w(this, k.f2450s);
    }

    public abstract void d(t tVar);

    public final void e(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.f2471g;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f2471g.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            t tVar = new t(view);
            if (z6) {
                g(tVar);
            } else {
                d(tVar);
            }
            tVar.f2490c.add(this);
            f(tVar);
            if (z6) {
                b(this.f2472h, view, tVar);
            } else {
                b(this.i, view, tVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3), z6);
            }
        }
    }

    public abstract void g(t tVar);

    public final void h(ViewGroup viewGroup, boolean z6) {
        i(z6);
        ArrayList arrayList = this.f2469e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2470f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z6);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                t tVar = new t(viewFindViewById);
                if (z6) {
                    g(tVar);
                } else {
                    d(tVar);
                }
                tVar.f2490c.add(this);
                f(tVar);
                if (z6) {
                    b(this.f2472h, viewFindViewById, tVar);
                } else {
                    b(this.i, viewFindViewById, tVar);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            t tVar2 = new t(view);
            if (z6) {
                g(tVar2);
            } else {
                d(tVar2);
            }
            tVar2.f2490c.add(this);
            f(tVar2);
            if (z6) {
                b(this.f2472h, view, tVar2);
            } else {
                b(this.i, view, tVar2);
            }
        }
    }

    public final void i(boolean z6) {
        if (z6) {
            ((C2936e) this.f2472h.f5896b).clear();
            ((SparseArray) this.f2472h.f5897c).clear();
            ((C2938g) this.f2472h.f5898d).b();
        } else {
            ((C2936e) this.i.f5896b).clear();
            ((SparseArray) this.i.f5897c).clear();
            ((C2938g) this.i.f5898d).b();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f2463J = new ArrayList();
            lVar.f2472h = new c1.g(8);
            lVar.i = new c1.g(8);
            lVar.f2475l = null;
            lVar.f2476m = null;
            lVar.f2461H = this;
            lVar.f2462I = null;
            return lVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public Animator k(ViewGroup viewGroup, t tVar, t tVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, c1.g gVar, c1.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i3;
        View view;
        t tVar;
        Animator animator;
        t tVar2;
        C2936e c2936eQ = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i6 = 0;
        while (i6 < size) {
            t tVar3 = (t) arrayList.get(i6);
            t tVar4 = (t) arrayList2.get(i6);
            if (tVar3 != null && !tVar3.f2490c.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.f2490c.contains(this)) {
                tVar4 = null;
            }
            if ((tVar3 != null || tVar4 != null) && (tVar3 == null || tVar4 == null || t(tVar3, tVar4))) {
                Animator animatorK = k(viewGroup, tVar3, tVar4);
                if (animatorK != null) {
                    String str = this.f2465a;
                    if (tVar4 != null) {
                        view = tVar4.f2489b;
                        String[] strArrR = r();
                        if (strArrR != null && strArrR.length > 0) {
                            tVar2 = new t(view);
                            t tVar5 = (t) ((C2936e) gVar2.f5896b).get(view);
                            i = size;
                            if (tVar5 != null) {
                                int i7 = 0;
                                while (i7 < strArrR.length) {
                                    String str2 = strArrR[i7];
                                    tVar2.f2488a.put(str2, tVar5.f2488a.get(str2));
                                    i7++;
                                    i6 = i6;
                                    tVar5 = tVar5;
                                }
                            }
                            i3 = i6;
                            int i8 = c2936eQ.f23705c;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    animator = animatorK;
                                    break;
                                }
                                i iVar = (i) c2936eQ.get((Animator) c2936eQ.f(i9));
                                if (iVar.f2444c != null && iVar.f2442a == view && iVar.f2443b.equals(str) && iVar.f2444c.equals(tVar2)) {
                                    animator = null;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            i = size;
                            i3 = i6;
                            animator = animatorK;
                            tVar2 = null;
                        }
                        animatorK = animator;
                        tVar = tVar2;
                    } else {
                        i = size;
                        i3 = i6;
                        view = tVar3.f2489b;
                        tVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        i iVar2 = new i();
                        iVar2.f2442a = view;
                        iVar2.f2443b = str;
                        iVar2.f2444c = tVar;
                        iVar2.f2445d = windowId;
                        iVar2.f2446e = this;
                        iVar2.f2447f = animatorK;
                        c2936eQ.put(animatorK, iVar2);
                        this.f2463J.add(animatorK);
                    }
                }
                i6 = i3 + 1;
                size = i;
            }
            i = size;
            i3 = i6;
            i6 = i3 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                i iVar3 = (i) c2936eQ.get((Animator) this.f2463J.get(sparseIntArray.keyAt(i10)));
                iVar3.f2447f.setStartDelay(iVar3.f2447f.getStartDelay() + (sparseIntArray.valueAt(i10) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2458E - 1;
        this.f2458E = i;
        if (i == 0) {
            w(this, k.f2449r);
            for (int i3 = 0; i3 < ((C2938g) this.f2472h.f5898d).j(); i3++) {
                View view = (View) ((C2938g) this.f2472h.f5898d).k(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < ((C2938g) this.i.f5898d).j(); i6++) {
                View view2 = (View) ((C2938g) this.i.f5898d).k(i6);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2460G = true;
        }
    }

    public void n() {
        ArrayList arrayList = this.f2471g;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.f2471g = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f2476m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f2475l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (L0.t) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final L0.t o(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            L0.a r0 = r4.f2473j
            if (r0 == 0) goto L9
            L0.t r5 = r0.o(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f2475l
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f2476m
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            L0.t r3 = (L0.t) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f2489b
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
            java.util.ArrayList r5 = r4.f2476m
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f2475l
        L35:
            java.lang.Object r5 = r5.get(r2)
            L0.t r5 = (L0.t) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.l.o(android.view.View, boolean):L0.t");
    }

    public final l p() {
        C0156a c0156a = this.f2473j;
        return c0156a != null ? c0156a.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final t s(View view, boolean z6) {
        C0156a c0156a = this.f2473j;
        if (c0156a != null) {
            return c0156a.s(view, z6);
        }
        return (t) ((C2936e) (z6 ? this.f2472h : this.i).f5896b).get(view);
    }

    public boolean t(t tVar, t tVar2) {
        if (tVar != null && tVar2 != null) {
            String[] strArrR = r();
            if (strArrR != null) {
                for (String str : strArrR) {
                    if (v(tVar, tVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = tVar.f2488a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(tVar, tVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return I("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2471g;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f2471g.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f2469e;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = this.f2470f;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    public final void w(l lVar, k kVar) {
        l lVar2 = this.f2461H;
        if (lVar2 != null) {
            lVar2.w(lVar, kVar);
        }
        ArrayList arrayList = this.f2462I;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2462I.size();
        j[] jVarArr = this.f2477n;
        if (jVarArr == null) {
            jVarArr = new j[size];
        }
        this.f2477n = null;
        j[] jVarArr2 = (j[]) this.f2462I.toArray(jVarArr);
        for (int i = 0; i < size; i++) {
            kVar.a(jVarArr2[i], lVar);
            jVarArr2[i] = null;
        }
        this.f2477n = jVarArr2;
    }

    public void x(View view) {
        if (this.f2460G) {
            return;
        }
        ArrayList arrayList = this.f2456C;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2457D);
        this.f2457D = f2453L;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2457D = animatorArr;
        w(this, k.f2451t);
        this.f2459F = true;
    }

    public l y(j jVar) {
        l lVar;
        ArrayList arrayList = this.f2462I;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (lVar = this.f2461H) != null) {
                lVar.y(jVar);
            }
            if (this.f2462I.size() == 0) {
                this.f2462I = null;
            }
        }
        return this;
    }

    public void z(View view) {
        if (this.f2459F) {
            if (!this.f2460G) {
                ArrayList arrayList = this.f2456C;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2457D);
                this.f2457D = f2453L;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2457D = animatorArr;
                w(this, k.f2452u);
            }
            this.f2459F = false;
        }
    }

    public void F() {
    }

    public void C(AbstractC0241a abstractC0241a) {
    }

    public void f(t tVar) {
    }
}
