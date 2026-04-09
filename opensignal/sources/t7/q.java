package t7;

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

/* loaded from: classes.dex */
public abstract class q implements Cloneable {
    public static final Animator[] V = new Animator[0];
    public static final int[] W = {2, 1, 3, 4};
    public static final df.c X = new df.c();
    public static final ThreadLocal Y = new ThreadLocal();
    public ArrayList H;
    public ArrayList I;
    public o[] J;
    public long T;
    public long U;

    /* renamed from: a, reason: collision with root package name */
    public final String f22512a = getClass().getName();

    /* renamed from: d, reason: collision with root package name */
    public long f22513d = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f22514g = -1;

    /* renamed from: r, reason: collision with root package name */
    public TimeInterpolator f22515r = null;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f22516x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f22517y = new ArrayList();
    public ArrayList B = null;
    public js.e D = new js.e(15);
    public js.e E = new js.e(15);
    public a F = null;
    public final int[] G = W;
    public final ArrayList K = new ArrayList();
    public Animator[] L = V;
    public int M = 0;
    public boolean N = false;
    public boolean O = false;
    public q P = null;
    public ArrayList Q = null;
    public ArrayList R = new ArrayList();
    public df.c S = X;

    public static void b(js.e eVar, View view, y yVar) {
        u.e eVar2 = (u.e) eVar.f13798g;
        u.e eVar3 = (u.e) eVar.f13797d;
        SparseArray sparseArray = (SparseArray) eVar.f13799r;
        u.o oVar = (u.o) eVar.f13800x;
        eVar2.put(view, yVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = u3.i0.f23177a;
        String strE = u3.z.e(view);
        if (strE != null) {
            if (eVar3.containsKey(strE)) {
                eVar3.put(strE, null);
            } else {
                eVar3.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (oVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    oVar.e(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) oVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    oVar.e(null, itemIdAtPosition);
                }
            }
        }
    }

    public static u.e q() {
        ThreadLocal threadLocal = Y;
        u.e eVar = (u.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        u.e eVar2 = new u.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean w(y yVar, y yVar2, String str) {
        Object obj = yVar.f22528a.get(str);
        Object obj2 = yVar2.f22528a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public q A(o oVar) {
        q qVar;
        ArrayList arrayList = this.Q;
        if (arrayList != null) {
            if (!arrayList.remove(oVar) && (qVar = this.P) != null) {
                qVar.A(oVar);
            }
            if (this.Q.size() == 0) {
                this.Q = null;
            }
        }
        return this;
    }

    public void B(View view) {
        if (this.N) {
            if (!this.O) {
                ArrayList arrayList = this.K;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
                this.L = V;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.L = animatorArr;
                x(this, p.f22511z, false);
            }
            this.N = false;
        }
    }

    public void C() {
        K();
        u.e eVarQ = q();
        Iterator it = this.R.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (eVarQ.containsKey(animator)) {
                K();
                if (animator != null) {
                    animator.addListener(new j(this, eVarQ));
                    long j = this.f22514g;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j7 = this.f22513d;
                    if (j7 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.f22515r;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new id.b(5, this));
                    animator.start();
                }
            }
        }
        this.R.clear();
        m();
    }

    public void D(long j, long j7) {
        long j10 = this.T;
        int i10 = 0;
        boolean z10 = j < j7;
        if ((j7 < 0 && j >= 0) || (j7 > j10 && j <= j10)) {
            this.O = false;
            x(this, p.f22507t, z10);
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = V;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            l.b(animator, Math.min(Math.max(0L, j), l.a(animator)));
            i10++;
            j10 = j10;
        }
        long j11 = j10;
        this.L = animatorArr;
        if ((j <= j11 || j7 > j11) && (j >= 0 || j7 < 0)) {
            return;
        }
        if (j > j11) {
            this.O = true;
        }
        x(this, p.f22508u, z10);
    }

    public void E(long j) {
        this.f22514g = j;
    }

    public void G(TimeInterpolator timeInterpolator) {
        this.f22515r = timeInterpolator;
    }

    public void H(df.c cVar) {
        if (cVar == null) {
            this.S = X;
        } else {
            this.S = cVar;
        }
    }

    public void J(long j) {
        this.f22513d = j;
    }

    public final void K() {
        if (this.M == 0) {
            x(this, p.f22507t, false);
            this.O = false;
        }
        this.M++;
    }

    public String L(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f22514g != -1) {
            sb2.append("dur(");
            sb2.append(this.f22514g);
            sb2.append(") ");
        }
        if (this.f22513d != -1) {
            sb2.append("dly(");
            sb2.append(this.f22513d);
            sb2.append(") ");
        }
        if (this.f22515r != null) {
            sb2.append("interp(");
            sb2.append(this.f22515r);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f22516x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f22517y;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(o oVar) {
        if (this.Q == null) {
            this.Q = new ArrayList();
        }
        this.Q.add(oVar);
    }

    public void c() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = V;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.L = animatorArr;
        x(this, p.f22509v, false);
    }

    public abstract void d(y yVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.B.get(i10)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            y yVar = new y(view);
            if (z10) {
                g(yVar);
            } else {
                d(yVar);
            }
            yVar.f22530c.add(this);
            f(yVar);
            if (z10) {
                b(this.D, view, yVar);
            } else {
                b(this.E, view, yVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), z10);
            }
        }
    }

    public abstract void g(y yVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList arrayList = this.f22516x;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f22517y;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                y yVar = new y(viewFindViewById);
                if (z10) {
                    g(yVar);
                } else {
                    d(yVar);
                }
                yVar.f22530c.add(this);
                f(yVar);
                if (z10) {
                    b(this.D, viewFindViewById, yVar);
                } else {
                    b(this.E, viewFindViewById, yVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            y yVar2 = new y(view);
            if (z10) {
                g(yVar2);
            } else {
                d(yVar2);
            }
            yVar2.f22530c.add(this);
            f(yVar2);
            if (z10) {
                b(this.D, view, yVar2);
            } else {
                b(this.E, view, yVar2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((u.e) this.D.f13798g).clear();
            ((SparseArray) this.D.f13799r).clear();
            ((u.o) this.D.f13800x).a();
        } else {
            ((u.e) this.E.f13798g).clear();
            ((SparseArray) this.E.f13799r).clear();
            ((u.o) this.E.f13800x).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.R = new ArrayList();
            qVar.D = new js.e(15);
            qVar.E = new js.e(15);
            qVar.H = null;
            qVar.I = null;
            qVar.P = this;
            qVar.Q = null;
            return qVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator k(ViewGroup viewGroup, y yVar, y yVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, js.e eVar, js.e eVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int i11;
        View view;
        y yVar;
        Animator animator;
        y yVar2;
        u.e eVarQ = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i12 = 0;
        while (i12 < size) {
            y yVar3 = (y) arrayList.get(i12);
            y yVar4 = (y) arrayList2.get(i12);
            if (yVar3 != null && !yVar3.f22530c.contains(this)) {
                yVar3 = null;
            }
            if (yVar4 != null && !yVar4.f22530c.contains(this)) {
                yVar4 = null;
            }
            if ((yVar3 != null || yVar4 != null) && (yVar3 == null || yVar4 == null || u(yVar3, yVar4))) {
                Animator animatorK = k(viewGroup, yVar3, yVar4);
                if (animatorK != null) {
                    String str = this.f22512a;
                    if (yVar4 != null) {
                        view = yVar4.f22529b;
                        String[] strArrR = r();
                        if (strArrR != null && strArrR.length > 0) {
                            yVar2 = new y(view);
                            y yVar5 = (y) ((u.e) eVar2.f13798g).get(view);
                            i10 = size;
                            if (yVar5 != null) {
                                int i13 = 0;
                                while (i13 < strArrR.length) {
                                    String str2 = strArrR[i13];
                                    yVar2.f22528a.put(str2, yVar5.f22528a.get(str2));
                                    i13++;
                                    i12 = i12;
                                    yVar5 = yVar5;
                                }
                            }
                            i11 = i12;
                            int i14 = eVarQ.f23077g;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    animator = animatorK;
                                    break;
                                }
                                k kVar = (k) eVarQ.get((Animator) eVarQ.f(i15));
                                if (kVar.f22502c != null && kVar.f22500a == view && kVar.f22501b.equals(str) && kVar.f22502c.equals(yVar2)) {
                                    animator = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i10 = size;
                            i11 = i12;
                            animator = animatorK;
                            yVar2 = null;
                        }
                        animatorK = animator;
                        yVar = yVar2;
                    } else {
                        i10 = size;
                        i11 = i12;
                        view = yVar3.f22529b;
                        yVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        k kVar2 = new k();
                        kVar2.f22500a = view;
                        kVar2.f22501b = str;
                        kVar2.f22502c = yVar;
                        kVar2.f22503d = windowId;
                        kVar2.f22504e = this;
                        kVar2.f22505f = animatorK;
                        eVarQ.put(animatorK, kVar2);
                        this.R.add(animatorK);
                    }
                }
                i12 = i11 + 1;
                size = i10;
            }
            i10 = size;
            i11 = i12;
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                k kVar3 = (k) eVarQ.get((Animator) this.R.get(sparseIntArray.keyAt(i16)));
                kVar3.f22505f.setStartDelay(kVar3.f22505f.getStartDelay() + (sparseIntArray.valueAt(i16) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.M - 1;
        this.M = i10;
        if (i10 == 0) {
            x(this, p.f22508u, false);
            for (int i11 = 0; i11 < ((u.o) this.D.f13800x).g(); i11++) {
                View view = (View) ((u.o) this.D.f13800x).h(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((u.o) this.E.f13800x).g(); i12++) {
                View view2 = (View) ((u.o) this.E.f13800x).h(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.O = true;
        }
    }

    public void n() {
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.B = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (t7.y) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t7.y o(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            t7.a r0 = r4.F
            if (r0 == 0) goto L9
            t7.y r5 = r0.o(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.H
            goto L10
        Le:
            java.util.ArrayList r0 = r4.I
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            t7.y r3 = (t7.y) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f22529b
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
            java.util.ArrayList r5 = r4.I
            goto L35
        L33:
            java.util.ArrayList r5 = r4.H
        L35:
            java.lang.Object r5 = r5.get(r2)
            t7.y r5 = (t7.y) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.q.o(android.view.View, boolean):t7.y");
    }

    public final q p() {
        a aVar = this.F;
        return aVar != null ? aVar.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final y s(View view, boolean z10) {
        a aVar = this.F;
        if (aVar != null) {
            return aVar.s(view, z10);
        }
        return (y) ((u.e) (z10 ? this.D : this.E).f13798g).get(view);
    }

    public boolean t() {
        return !this.K.isEmpty();
    }

    public final String toString() {
        return L("");
    }

    public boolean u(y yVar, y yVar2) {
        if (yVar != null && yVar2 != null) {
            String[] strArrR = r();
            if (strArrR != null) {
                for (String str : strArrR) {
                    if (w(yVar, yVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = yVar.f22528a.keySet().iterator();
                while (it.hasNext()) {
                    if (w(yVar, yVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.B.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f22516x;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = this.f22517y;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id2)) || arrayList3.contains(view);
    }

    public final void x(q qVar, p pVar, boolean z10) {
        q qVar2 = this.P;
        if (qVar2 != null) {
            qVar2.x(qVar, pVar, z10);
        }
        ArrayList arrayList = this.Q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.Q.size();
        o[] oVarArr = this.J;
        if (oVarArr == null) {
            oVarArr = new o[size];
        }
        this.J = null;
        o[] oVarArr2 = (o[]) this.Q.toArray(oVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            pVar.c(oVarArr2[i10], qVar, z10);
            oVarArr2[i10] = null;
        }
        this.J = oVarArr2;
    }

    public void y(View view) {
        if (this.O) {
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.L);
        this.L = V;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.L = animatorArr;
        x(this, p.f22510w, false);
        this.N = true;
    }

    public void z() {
        u.e eVarQ = q();
        this.T = 0L;
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            Animator animator = (Animator) this.R.get(i10);
            k kVar = (k) eVarQ.get(animator);
            if (animator != null && kVar != null) {
                Animator animator2 = kVar.f22505f;
                long j = this.f22514g;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j7 = this.f22513d;
                if (j7 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j7);
                }
                TimeInterpolator timeInterpolator = this.f22515r;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.K.add(animator);
                this.T = Math.max(this.T, l.a(animator));
            }
        }
        this.R.clear();
    }

    public void I() {
    }

    public void F(xu.d dVar) {
    }

    public void f(y yVar) {
    }
}
