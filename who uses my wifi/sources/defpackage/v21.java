package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class v21 implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final ts0 D = new ts0();
    public static final ThreadLocal E = new ThreadLocal();
    public ArrayList p;
    public ArrayList q;
    public u21[] r;
    public final String f = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public mc2 l = new mc2(6);
    public mc2 m = new mc2(6);
    public b9 n = null;
    public final int[] o = C;
    public final ArrayList s = new ArrayList();
    public Animator[] t = B;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public v21 x = null;
    public ArrayList y = null;
    public ArrayList z = new ArrayList();
    public ts0 A = D;

    public static void b(mc2 mc2Var, View view, d31 d31Var) {
        s8 s8Var = (s8) mc2Var.g;
        s8 s8Var2 = (s8) mc2Var.j;
        SparseArray sparseArray = (SparseArray) mc2Var.h;
        l80 l80Var = (l80) mc2Var.i;
        s8Var.put(view, d31Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = e61.a;
        String strK = t51.k(view);
        if (strK != null) {
            if (s8Var2.containsKey(strK)) {
                s8Var2.put(strK, null);
            } else {
                s8Var2.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (l80Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    l80Var.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) l80Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    l80Var.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static s8 p() {
        ThreadLocal threadLocal = E;
        s8 s8Var = (s8) threadLocal.get();
        if (s8Var != null) {
            return s8Var;
        }
        s8 s8Var2 = new s8(0);
        threadLocal.set(s8Var2);
        return s8Var2;
    }

    public static boolean u(d31 d31Var, d31 d31Var2, String str) {
        Object obj = d31Var.a.get(str);
        Object obj2 = d31Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.h = j;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void D(ts0 ts0Var) {
        if (ts0Var == null) {
            this.A = D;
        } else {
            this.A = ts0Var;
        }
    }

    public void F(long j) {
        this.g = j;
    }

    public final void G() {
        if (this.u == 0) {
            v(this, yo.b);
            this.w = false;
        }
        this.u++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.h != -1) {
            sb.append("dur(");
            sb.append(this.h);
            sb.append(") ");
        }
        if (this.g != -1) {
            sb.append("dly(");
            sb.append(this.g);
            sb.append(") ");
        }
        if (this.i != null) {
            sb.append("interp(");
            sb.append(this.i);
            sb.append(") ");
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
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
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(u21 u21Var) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(u21Var);
    }

    public void c() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.t = animatorArr;
        v(this, yo.d);
    }

    public abstract void d(d31 d31Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            d31 d31Var = new d31(view);
            if (z) {
                g(d31Var);
            } else {
                d(d31Var);
            }
            d31Var.c.add(this);
            f(d31Var);
            if (z) {
                b(this.l, view, d31Var);
            } else {
                b(this.m, view, d31Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void g(d31 d31Var);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                d31 d31Var = new d31(viewFindViewById);
                if (z) {
                    g(d31Var);
                } else {
                    d(d31Var);
                }
                d31Var.c.add(this);
                f(d31Var);
                if (z) {
                    b(this.l, viewFindViewById, d31Var);
                } else {
                    b(this.m, viewFindViewById, d31Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            d31 d31Var2 = new d31(view);
            if (z) {
                g(d31Var2);
            } else {
                d(d31Var2);
            }
            d31Var2.c.add(this);
            f(d31Var2);
            if (z) {
                b(this.l, view, d31Var2);
            } else {
                b(this.m, view, d31Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((s8) this.l.g).clear();
            ((SparseArray) this.l.h).clear();
            ((l80) this.l.i).a();
        } else {
            ((s8) this.m.g).clear();
            ((SparseArray) this.m.h).clear();
            ((l80) this.m.i).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public v21 clone() {
        try {
            v21 v21Var = (v21) super.clone();
            v21Var.z = new ArrayList();
            v21Var.l = new mc2(6);
            v21Var.m = new mc2(6);
            v21Var.p = null;
            v21Var.q = null;
            v21Var.x = this;
            v21Var.y = null;
            return v21Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, d31 d31Var, d31 d31Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, mc2 mc2Var, mc2 mc2Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        d31 d31Var;
        Animator animator;
        d31 d31Var2;
        s8 s8VarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            d31 d31Var3 = (d31) arrayList.get(i3);
            d31 d31Var4 = (d31) arrayList2.get(i3);
            if (d31Var3 != null && !d31Var3.c.contains(this)) {
                d31Var3 = null;
            }
            if (d31Var4 != null && !d31Var4.c.contains(this)) {
                d31Var4 = null;
            }
            if ((d31Var3 != null || d31Var4 != null) && (d31Var3 == null || d31Var4 == null || s(d31Var3, d31Var4))) {
                Animator animatorK = k(viewGroup, d31Var3, d31Var4);
                if (animatorK != null) {
                    String str = this.f;
                    if (d31Var4 != null) {
                        view = d31Var4.b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            d31Var2 = new d31(view);
                            d31 d31Var5 = (d31) ((s8) mc2Var2.g).get(view);
                            i = size;
                            if (d31Var5 != null) {
                                int i4 = 0;
                                while (i4 < strArrQ.length) {
                                    String str2 = strArrQ[i4];
                                    d31Var2.a.put(str2, d31Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    d31Var5 = d31Var5;
                                }
                            }
                            i2 = i3;
                            int i5 = s8VarP.h;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = animatorK;
                                    break;
                                }
                                t21 t21Var = (t21) s8VarP.get((Animator) s8VarP.f(i6));
                                if (t21Var.c != null && t21Var.a == view && t21Var.b.equals(str) && t21Var.c.equals(d31Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorK;
                            d31Var2 = null;
                        }
                        animatorK = animator;
                        d31Var = d31Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = d31Var3.b;
                        d31Var = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        t21 t21Var2 = new t21();
                        t21Var2.a = view;
                        t21Var2.b = str;
                        t21Var2.c = d31Var;
                        t21Var2.d = windowId;
                        t21Var2.e = this;
                        t21Var2.f = animatorK;
                        s8VarP.put(animatorK, t21Var2);
                        this.z.add(animatorK);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                t21 t21Var3 = (t21) s8VarP.get((Animator) this.z.get(sparseIntArray.keyAt(i7)));
                t21Var3.f.setStartDelay(t21Var3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            v(this, yo.c);
            for (int i2 = 0; i2 < ((l80) this.l.i).f(); i2++) {
                View view = (View) ((l80) this.l.i).g(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((l80) this.m.i).f(); i3++) {
                View view2 = (View) ((l80) this.m.i).g(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (defpackage.d31) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.d31 n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            b9 r0 = r4.n
            if (r0 == 0) goto L9
            d31 r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.p
            goto L10
        Le:
            java.util.ArrayList r0 = r4.q
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            d31 r3 = (defpackage.d31) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
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
            java.util.ArrayList r5 = r4.q
            goto L35
        L33:
            java.util.ArrayList r5 = r4.p
        L35:
            java.lang.Object r5 = r5.get(r2)
            d31 r5 = (defpackage.d31) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.n(android.view.View, boolean):d31");
    }

    public final v21 o() {
        b9 b9Var = this.n;
        return b9Var != null ? b9Var.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final d31 r(View view, boolean z) {
        b9 b9Var = this.n;
        if (b9Var != null) {
            return b9Var.r(view, z);
        }
        return (d31) ((s8) (z ? this.l : this.m).g).get(view);
    }

    public boolean s(d31 d31Var, d31 d31Var2) {
        if (d31Var != null && d31Var2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (u(d31Var, d31Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = d31Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(d31Var, d31Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(v21 v21Var, yo yoVar) {
        v21 v21Var2 = this.x;
        if (v21Var2 != null) {
            v21Var2.v(v21Var, yoVar);
        }
        ArrayList arrayList = this.y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.y.size();
        u21[] u21VarArr = this.r;
        if (u21VarArr == null) {
            u21VarArr = new u21[size];
        }
        this.r = null;
        u21[] u21VarArr2 = (u21[]) this.y.toArray(u21VarArr);
        for (int i = 0; i < size; i++) {
            u21 u21Var = u21VarArr2[i];
            switch (yoVar.a) {
                case 4:
                    u21Var.e(v21Var);
                    break;
                case 5:
                    u21Var.d(v21Var);
                    break;
                case 6:
                    u21Var.f(v21Var);
                    break;
                case 7:
                    u21Var.b();
                    break;
                default:
                    u21Var.c();
                    break;
            }
            u21VarArr2[i] = null;
        }
        this.r = u21VarArr2;
    }

    public void w(View view) {
        if (this.w) {
            return;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.t = animatorArr;
        v(this, yo.e);
        this.v = true;
    }

    public v21 x(u21 u21Var) {
        v21 v21Var;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            if (!arrayList.remove(u21Var) && (v21Var = this.x) != null) {
                v21Var.x(u21Var);
            }
            if (this.y.size() == 0) {
                this.y = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.v) {
            if (!this.w) {
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
                this.t = B;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.t = animatorArr;
                v(this, yo.f);
            }
            this.v = false;
        }
    }

    public void z() {
        G();
        s8 s8VarP = p();
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (s8VarP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new s21(this, s8VarP));
                    long j = this.h;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.g;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new n1(10, this));
                    animator.start();
                }
            }
        }
        this.z.clear();
        m();
    }

    public void E() {
    }

    public void B(bd2 bd2Var) {
    }

    public void f(d31 d31Var) {
    }
}
