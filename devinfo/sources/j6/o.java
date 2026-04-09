package j6;

import a0.x0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import e4.b1;
import e4.m0;
import e4.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f27433k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f27434l;

    /* renamed from: m, reason: collision with root package name */
    public m[] f27435m;

    /* renamed from: w, reason: collision with root package name */
    public long f27445w;

    /* renamed from: x, reason: collision with root package name */
    public long f27446x;

    /* renamed from: y, reason: collision with root package name */
    public static final Animator[] f27423y = new Animator[0];

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f27424z = {2, 1, 3, 4};
    public static final i A = new i(0);
    public static final ThreadLocal B = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final String f27425a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f27426b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f27427c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f27428d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f27429e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27430f = new ArrayList();
    public x0 g = new x0(17);

    /* renamed from: h, reason: collision with root package name */
    public x0 f27431h = new x0(17);

    /* renamed from: i, reason: collision with root package name */
    public a f27432i = null;
    public final int[] j = f27424z;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f27436n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f27437o = f27423y;

    /* renamed from: p, reason: collision with root package name */
    public int f27438p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27439q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f27440r = false;

    /* renamed from: s, reason: collision with root package name */
    public o f27441s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f27442t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f27443u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public i f27444v = A;

    public static void b(x0 x0Var, View view, v vVar) {
        x.e eVar = (x.e) x0Var.f148e;
        x.e eVar2 = (x.e) x0Var.f147d;
        SparseArray sparseArray = (SparseArray) x0Var.f145b;
        x.o oVar = (x.o) x0Var.f146c;
        eVar.put(view, vVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = v0.f22405a;
        String strE = m0.e(view);
        if (strE != null) {
            if (eVar2.containsKey(strE)) {
                eVar2.put(strE, null);
            } else {
                eVar2.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (oVar.g(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    oVar.i(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) oVar.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    oVar.i(null, itemIdAtPosition);
                }
            }
        }
    }

    public static x.e p() {
        ThreadLocal threadLocal = B;
        x.e eVar = (x.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        x.e eVar2 = new x.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean v(v vVar, v vVar2, String str) {
        Object obj = vVar.f27457a.get(str);
        Object obj2 = vVar2.f27457a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.f27439q) {
            if (!this.f27440r) {
                ArrayList arrayList = this.f27436n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f27437o);
                this.f27437o = f27423y;
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    Animator animator = animatorArr[i4];
                    animatorArr[i4] = null;
                    animator.resume();
                }
                this.f27437o = animatorArr;
                w(this, n.W8, false);
            }
            this.f27439q = false;
        }
    }

    public void B() {
        J();
        x.e eVarP = p();
        ArrayList arrayList = this.f27443u;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Animator animator = (Animator) obj;
            if (eVarP.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new b1(this, eVarP));
                    long j = this.f27427c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j8 = this.f27426b;
                    if (j8 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j8);
                    }
                    TimeInterpolator timeInterpolator = this.f27428d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new ad.g(4, this));
                    animator.start();
                }
            }
        }
        this.f27443u.clear();
        m();
    }

    public void C(long j, long j8) {
        long j9 = this.f27445w;
        int i4 = 0;
        boolean z3 = j < j8;
        if ((j8 < 0 && j >= 0) || (j8 > j9 && j <= j9)) {
            this.f27440r = false;
            w(this, n.S8, z3);
        }
        ArrayList arrayList = this.f27436n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f27437o);
        this.f27437o = f27423y;
        while (i4 < size) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            ub.a.q(animator, Math.min(Math.max(0L, j), ub.a.h(animator)));
            i4++;
            j9 = j9;
        }
        long j10 = j9;
        this.f27437o = animatorArr;
        if ((j <= j10 || j8 > j10) && (j >= 0 || j8 < 0)) {
            return;
        }
        if (j > j10) {
            this.f27440r = true;
        }
        w(this, n.T8, z3);
    }

    public void D(long j) {
        this.f27427c = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f27428d = timeInterpolator;
    }

    public void G(i iVar) {
        if (iVar == null) {
            this.f27444v = A;
        } else {
            this.f27444v = iVar;
        }
    }

    public void I(long j) {
        this.f27426b = j;
    }

    public final void J() {
        if (this.f27438p == 0) {
            w(this, n.S8, false);
            this.f27440r = false;
        }
        this.f27438p++;
    }

    public String K(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f27427c != -1) {
            sb2.append("dur(");
            sb2.append(this.f27427c);
            sb2.append(") ");
        }
        if (this.f27426b != -1) {
            sb2.append("dly(");
            sb2.append(this.f27426b);
            sb2.append(") ");
        }
        if (this.f27428d != null) {
            sb2.append("interp(");
            sb2.append(this.f27428d);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f27429e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f27430f;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i4));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i10));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(m mVar) {
        if (this.f27442t == null) {
            this.f27442t = new ArrayList();
        }
        this.f27442t.add(mVar);
    }

    public void cancel() {
        ArrayList arrayList = this.f27436n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f27437o);
        this.f27437o = f27423y;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.cancel();
        }
        this.f27437o = animatorArr;
        w(this, n.U8, false);
    }

    public abstract void d(v vVar);

    public final void e(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z3) {
                g(vVar);
            } else {
                d(vVar);
            }
            vVar.f27459c.add(this);
            f(vVar);
            if (z3) {
                b(this.g, view, vVar);
            } else {
                b(this.f27431h, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4), z3);
            }
        }
    }

    public abstract void g(v vVar);

    public final void h(ViewGroup viewGroup, boolean z3) {
        i(z3);
        ArrayList arrayList = this.f27429e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f27430f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z3);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (viewFindViewById != null) {
                v vVar = new v(viewFindViewById);
                if (z3) {
                    g(vVar);
                } else {
                    d(vVar);
                }
                vVar.f27459c.add(this);
                f(vVar);
                if (z3) {
                    b(this.g, viewFindViewById, vVar);
                } else {
                    b(this.f27431h, viewFindViewById, vVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            v vVar2 = new v(view);
            if (z3) {
                g(vVar2);
            } else {
                d(vVar2);
            }
            vVar2.f27459c.add(this);
            f(vVar2);
            if (z3) {
                b(this.g, view, vVar2);
            } else {
                b(this.f27431h, view, vVar2);
            }
        }
    }

    public final void i(boolean z3) {
        if (z3) {
            ((x.e) this.g.f148e).clear();
            ((SparseArray) this.g.f145b).clear();
            ((x.o) this.g.f146c).b();
        } else {
            ((x.e) this.f27431h.f148e).clear();
            ((SparseArray) this.f27431h.f145b).clear();
            ((x.o) this.f27431h.f146c).b();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f27443u = new ArrayList();
            oVar.g = new x0(17);
            oVar.f27431h = new x0(17);
            oVar.f27433k = null;
            oVar.f27434l = null;
            oVar.f27441s = this;
            oVar.f27442t = null;
            return oVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, x0 x0Var, x0 x0Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int i10;
        View view;
        v vVar;
        Animator animator;
        v vVar2;
        x.e eVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i11 = 0;
        while (i11 < size) {
            v vVar3 = (v) arrayList.get(i11);
            v vVar4 = (v) arrayList2.get(i11);
            if (vVar3 != null && !vVar3.f27459c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.f27459c.contains(this)) {
                vVar4 = null;
            }
            if ((vVar3 != null || vVar4 != null) && (vVar3 == null || vVar4 == null || t(vVar3, vVar4))) {
                Animator animatorK = k(viewGroup, vVar3, vVar4);
                if (animatorK != null) {
                    String str = this.f27425a;
                    if (vVar4 != null) {
                        view = vVar4.f27458b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            vVar2 = new v(view);
                            v vVar5 = (v) ((x.e) x0Var2.f148e).get(view);
                            i4 = size;
                            if (vVar5 != null) {
                                int i12 = 0;
                                while (i12 < strArrQ.length) {
                                    String str2 = strArrQ[i12];
                                    vVar2.f27457a.put(str2, vVar5.f27457a.get(str2));
                                    i12++;
                                    i11 = i11;
                                    vVar5 = vVar5;
                                }
                            }
                            i10 = i11;
                            int i13 = eVarP.f36920c;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= i13) {
                                    animator = animatorK;
                                    break;
                                }
                                j jVar = (j) eVarP.get((Animator) eVarP.f(i14));
                                if (jVar.f27417c != null && jVar.f27415a == view && jVar.f27416b.equals(str) && jVar.f27417c.equals(vVar2)) {
                                    animator = null;
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            i4 = size;
                            i10 = i11;
                            animator = animatorK;
                            vVar2 = null;
                        }
                        animatorK = animator;
                        vVar = vVar2;
                    } else {
                        i4 = size;
                        i10 = i11;
                        view = vVar3.f27458b;
                        vVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        j jVar2 = new j();
                        jVar2.f27415a = view;
                        jVar2.f27416b = str;
                        jVar2.f27417c = vVar;
                        jVar2.f27418d = windowId;
                        jVar2.f27419e = this;
                        jVar2.f27420f = animatorK;
                        eVarP.put(animatorK, jVar2);
                        this.f27443u.add(animatorK);
                    }
                }
                i11 = i10 + 1;
                size = i4;
            }
            i4 = size;
            i10 = i11;
            i11 = i10 + 1;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                j jVar3 = (j) eVarP.get((Animator) this.f27443u.get(sparseIntArray.keyAt(i15)));
                jVar3.f27420f.setStartDelay(jVar3.f27420f.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i4 = this.f27438p - 1;
        this.f27438p = i4;
        if (i4 == 0) {
            w(this, n.T8, false);
            for (int i10 = 0; i10 < ((x.o) this.g.f146c).k(); i10++) {
                View view = (View) ((x.o) this.g.f146c).l(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((x.o) this.f27431h.f146c).k(); i11++) {
                View view2 = (View) ((x.o) this.f27431h.f146c).l(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f27440r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f27434l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f27433k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (j6.v) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j6.v n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            j6.a r0 = r4.f27432i
            if (r0 == 0) goto L9
            j6.v r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f27433k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f27434l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            j6.v r3 = (j6.v) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f27458b
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
            java.util.ArrayList r5 = r4.f27434l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f27433k
        L35:
            java.lang.Object r5 = r5.get(r2)
            j6.v r5 = (j6.v) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.o.n(android.view.View, boolean):j6.v");
    }

    public final o o() {
        a aVar = this.f27432i;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final v r(View view, boolean z3) {
        a aVar = this.f27432i;
        if (aVar != null) {
            return aVar.r(view, z3);
        }
        return (v) ((x.e) (z3 ? this.g : this.f27431h).f148e).get(view);
    }

    public boolean s() {
        return !this.f27436n.isEmpty();
    }

    public boolean t(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (v(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.f27457a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f27429e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f27430f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public final void w(o oVar, n nVar, boolean z3) {
        o oVar2 = this.f27441s;
        if (oVar2 != null) {
            oVar2.w(oVar, nVar, z3);
        }
        ArrayList arrayList = this.f27442t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f27442t.size();
        m[] mVarArr = this.f27435m;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f27435m = null;
        m[] mVarArr2 = (m[]) this.f27442t.toArray(mVarArr);
        for (int i4 = 0; i4 < size; i4++) {
            nVar.b(mVarArr2[i4], oVar, z3);
            mVarArr2[i4] = null;
        }
        this.f27435m = mVarArr2;
    }

    public void x(View view) {
        if (this.f27440r) {
            return;
        }
        ArrayList arrayList = this.f27436n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f27437o);
        this.f27437o = f27423y;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.pause();
        }
        this.f27437o = animatorArr;
        w(this, n.V8, false);
        this.f27439q = true;
    }

    public void y() {
        x.e eVarP = p();
        this.f27445w = 0L;
        for (int i4 = 0; i4 < this.f27443u.size(); i4++) {
            Animator animator = (Animator) this.f27443u.get(i4);
            j jVar = (j) eVarP.get(animator);
            if (animator != null && jVar != null) {
                Animator animator2 = jVar.f27420f;
                long j = this.f27427c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j8 = this.f27426b;
                if (j8 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j8);
                }
                TimeInterpolator timeInterpolator = this.f27428d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f27436n.add(animator);
                this.f27445w = Math.max(this.f27445w, ub.a.h(animator));
            }
        }
        this.f27443u.clear();
    }

    public o z(m mVar) {
        o oVar;
        ArrayList arrayList = this.f27442t;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f27441s) != null) {
                oVar.z(mVar);
            }
            if (this.f27442t.size() == 0) {
                this.f27442t = null;
            }
        }
        return this;
    }

    public void H() {
    }

    public void E(i0 i0Var) {
    }

    public void f(v vVar) {
    }
}
