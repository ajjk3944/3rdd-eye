package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fw3 implements kw3 {
    public int f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public fw3(String str, v34 v34Var, a54 a54Var, int i, i04 i04Var, Integer num) {
        this.g = str;
        this.h = v34Var;
        this.i = a54Var;
        this.f = i;
        this.j = i04Var;
        this.k = num;
    }

    public static fw3 v(String str, a54 a54Var, int i, i04 i04Var, Integer num) throws GeneralSecurityException {
        if (i04Var == i04.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new fw3(str, ow3.b(str), a54Var, i, i04Var, num);
    }

    public void a() {
        View view = (View) this.g;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((gc3) this.i) != null) {
                if (((gc3) this.k) == null) {
                    this.k = new gc3();
                }
                gc3 gc3Var = (gc3) this.k;
                gc3Var.c = null;
                gc3Var.b = false;
                gc3Var.d = null;
                gc3Var.a = false;
                WeakHashMap weakHashMap = e61.a;
                ColorStateList colorStateListG = t51.g(view);
                if (colorStateListG != null) {
                    gc3Var.b = true;
                    gc3Var.c = colorStateListG;
                }
                PorterDuff.Mode modeH = t51.h(view);
                if (modeH != null) {
                    gc3Var.a = true;
                    gc3Var.d = modeH;
                }
                if (gc3Var.b || gc3Var.a) {
                    l6.e(background, gc3Var, view.getDrawableState());
                    return;
                }
            }
            gc3 gc3Var2 = (gc3) this.j;
            if (gc3Var2 != null) {
                l6.e(background, gc3Var2, view.getDrawableState());
                return;
            }
            gc3 gc3Var3 = (gc3) this.i;
            if (gc3Var3 != null) {
                l6.e(background, gc3Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g3 g3Var = (g3) arrayList.get(i2);
            int i3 = g3Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = g3Var.b;
                    int i5 = g3Var.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(g3Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zs1) this.j).u((g3) arrayList.get(i));
        }
        q(arrayList);
        this.f = 0;
    }

    public void d() {
        zs1 zs1Var = (zs1) this.j;
        c();
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g3 g3Var = (g3) arrayList.get(i);
            int i2 = g3Var.a;
            if (i2 == 1) {
                zs1Var.u(g3Var);
                zs1Var.z(g3Var.b, g3Var.d);
            } else if (i2 == 2) {
                zs1Var.u(g3Var);
                int i3 = g3Var.b;
                int i4 = g3Var.d;
                RecyclerView recyclerView = (RecyclerView) zs1Var.g;
                recyclerView.O(i3, i4, true);
                recyclerView.n0 = true;
                recyclerView.k0.c += i4;
            } else if (i2 == 4) {
                zs1Var.u(g3Var);
                zs1Var.y(g3Var.b, g3Var.c, g3Var.d);
            } else if (i2 == 8) {
                zs1Var.u(g3Var);
                zs1Var.A(g3Var.b, g3Var.d);
            }
        }
        q(arrayList);
        this.f = 0;
    }

    public void e(g3 g3Var) {
        int i;
        hl0 hl0Var = (hl0) this.g;
        int i2 = g3Var.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iU = u(g3Var.b, i2);
        int i3 = g3Var.b;
        int i4 = g3Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + g3Var);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < g3Var.d; i6++) {
            int iU2 = u((i * i6) + g3Var.b, g3Var.a);
            int i7 = g3Var.a;
            if (i7 == 2 ? iU2 != iU : !(i7 == 4 && iU2 == iU + 1)) {
                g3 g3VarL = l(g3Var.c, i7, iU, i5);
                f(g3VarL, i3);
                g3VarL.c = null;
                hl0Var.c(g3VarL);
                if (g3Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iU = iU2;
            } else {
                i5++;
            }
        }
        Object obj = g3Var.c;
        g3Var.c = null;
        hl0Var.c(g3Var);
        if (i5 > 0) {
            g3 g3VarL2 = l(obj, g3Var.a, iU, i5);
            f(g3VarL2, i3);
            g3VarL2.c = null;
            hl0Var.c(g3VarL2);
        }
    }

    public void f(g3 g3Var, int i) {
        zs1 zs1Var = (zs1) this.j;
        zs1Var.u(g3Var);
        int i2 = g3Var.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            zs1Var.y(i, g3Var.c, g3Var.d);
            return;
        }
        int i3 = g3Var.d;
        RecyclerView recyclerView = (RecyclerView) zs1Var.g;
        recyclerView.O(i, i3, true);
        recyclerView.n0 = true;
        recyclerView.k0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        while (i2 < size) {
            g3 g3Var = (g3) arrayList.get(i2);
            int i3 = g3Var.a;
            if (i3 == 8) {
                int i4 = g3Var.b;
                if (i4 == i) {
                    i = g3Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (g3Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = g3Var.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = g3Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += g3Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        gc3 gc3Var = (gc3) this.j;
        if (gc3Var != null) {
            return (ColorStateList) gc3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        gc3 gc3Var = (gc3) this.j;
        if (gc3Var != null) {
            return (PorterDuff.Mode) gc3Var.d;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.h).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.g;
        Context context = view.getContext();
        int[] iArr = hn0.A;
        xb4 xb4VarR = xb4.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) xb4VarR.h;
        View view2 = (View) this.g;
        e61.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) xb4VarR.h, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f = typedArray.getResourceId(0, -1);
                l6 l6Var = (l6) this.h;
                Context context2 = view.getContext();
                int i2 = this.f;
                synchronized (l6Var) {
                    colorStateListF = l6Var.a.f(context2, i2);
                }
                if (colorStateListF != null) {
                    r(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                t51.q(view, xb4VarR.k(1));
            }
            if (typedArray.hasValue(2)) {
                t51.r(view, yp.c(typedArray.getInt(2, -1), null));
            }
            xb4VarR.z();
        } catch (Throwable th) {
            xb4VarR.z();
            throw th;
        }
    }

    public g3 l(Object obj, int i, int i2, int i3) {
        g3 g3Var = (g3) ((hl0) this.g).a();
        if (g3Var != null) {
            g3Var.a = i;
            g3Var.b = i2;
            g3Var.d = i3;
            g3Var.c = obj;
            return g3Var;
        }
        g3 g3Var2 = new g3();
        g3Var2.a = i;
        g3Var2.b = i2;
        g3Var2.d = i3;
        g3Var2.c = obj;
        return g3Var2;
    }

    public void m() {
        this.f = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateListF;
        this.f = i;
        l6 l6Var = (l6) this.h;
        if (l6Var != null) {
            Context context = ((View) this.g).getContext();
            synchronized (l6Var) {
                colorStateListF = l6Var.a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        r(colorStateListF);
        a();
    }

    public void o(g3 g3Var) {
        zs1 zs1Var = (zs1) this.j;
        ((ArrayList) this.i).add(g3Var);
        int i = g3Var.a;
        if (i == 1) {
            zs1Var.z(g3Var.b, g3Var.d);
            return;
        }
        if (i == 2) {
            int i2 = g3Var.b;
            int i3 = g3Var.d;
            RecyclerView recyclerView = (RecyclerView) zs1Var.g;
            recyclerView.O(i2, i3, false);
            recyclerView.n0 = true;
            return;
        }
        if (i == 4) {
            zs1Var.y(g3Var.b, g3Var.c, g3Var.d);
        } else if (i == 8) {
            zs1Var.A(g3Var.b, g3Var.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + g3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw3.p():void");
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g3 g3Var = (g3) arrayList.get(i);
            g3Var.c = null;
            ((hl0) this.g).c(g3Var);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((gc3) this.i) == null) {
                this.i = new gc3();
            }
            gc3 gc3Var = (gc3) this.i;
            gc3Var.c = colorStateList;
            gc3Var.b = true;
        } else {
            this.i = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((gc3) this.j) == null) {
            this.j = new gc3();
        }
        gc3 gc3Var = (gc3) this.j;
        gc3Var.c = colorStateList;
        gc3Var.b = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((gc3) this.j) == null) {
            this.j = new gc3();
        }
        gc3 gc3Var = (gc3) this.j;
        gc3Var.d = mode;
        gc3Var.a = true;
        a();
    }

    public int u(int i, int i2) {
        int i3;
        int i4;
        hl0 hl0Var = (hl0) this.g;
        ArrayList arrayList = (ArrayList) this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g3 g3Var = (g3) arrayList.get(size);
            int i5 = g3Var.a;
            if (i5 == 8) {
                int i6 = g3Var.b;
                int i7 = g3Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            g3Var.b = i6 + 1;
                            g3Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            g3Var.b = i6 - 1;
                            g3Var.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        g3Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        g3Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        g3Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        g3Var.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = g3Var.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= g3Var.d;
                    } else if (i5 == 2) {
                        i += g3Var.d;
                    }
                } else if (i2 == 1) {
                    g3Var.b = i8 + 1;
                } else if (i2 == 2) {
                    g3Var.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            g3 g3Var2 = (g3) arrayList.get(size2);
            if (g3Var2.a == 8) {
                int i9 = g3Var2.d;
                if (i9 == g3Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g3Var2.c = null;
                    hl0Var.c(g3Var2);
                }
            } else if (g3Var2.d <= 0) {
                arrayList.remove(size2);
                g3Var2.c = null;
                hl0Var.c(g3Var2);
            }
        }
        return i;
    }

    public void w(int i) {
        zt0.b0(i >= 0);
        this.f = i;
        y(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 < r1.g) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(long r8, defpackage.kz2 r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.j
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            ob3 r1 = (defpackage.ob3) r1
            java.lang.String r3 = defpackage.v23.a
            long r3 = r1.g
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.h
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            kz2 r1 = new kz2
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            kz2 r1 = (defpackage.kz2) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.a
            int r10 = r10.b
            byte[] r4 = r1.a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.k
            ob3 r10 = (defpackage.ob3) r10
            if (r10 == 0) goto L6a
            long r3 = r10.g
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r8 = r10.f
            r8.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.i
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            ob3 r10 = new ob3
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            ob3 r10 = (defpackage.ob3) r10
        L80:
            java.util.ArrayList r3 = r10.f
            boolean r4 = r3.isEmpty()
            defpackage.zt0.b0(r4)
            r10.g = r8
            r3.add(r1)
            r0.add(r10)
            r7.k = r10
            int r8 = r7.f
            if (r8 == r2) goto L9a
            r7.y(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r0 = r7.g
            zb3 r0 = (defpackage.zb3) r0
            r0.S(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw3.x(long, kz2):void");
    }

    public void y(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.j;
            if (priorityQueue.size() <= i) {
                return;
            }
            ob3 ob3Var = (ob3) priorityQueue.poll();
            String str = v23.a;
            int i2 = 0;
            while (true) {
                arrayList = ob3Var.f;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((zb3) this.g).S(ob3Var.g, (kz2) arrayList.get(i2));
                ((ArrayDeque) this.h).push((kz2) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            ob3 ob3Var2 = (ob3) this.k;
            if (ob3Var2 != null && ob3Var2.g == ob3Var.g) {
                this.k = null;
            }
            ((ArrayDeque) this.i).push(ob3Var);
        }
    }

    public void z(Object obj) {
        Object obj2 = this.j;
        this.j = obj;
        if (obj2.equals(obj)) {
            return;
        }
        il3 il3Var = (il3) this.i;
        il3Var.getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        ya4 ya4Var = (ya4) il3Var.g;
        ya4Var.j2();
        ya4Var.k2(1, num, 10);
        ya4Var.k2(2, num, 10);
        t24 t24Var = new t24(iIntValue);
        mu2 mu2Var = ya4Var.t;
        mu2Var.c(21, t24Var);
        mu2Var.d();
    }

    public fw3(Looper looper, Looper looper2, pz pzVar, il3 il3Var) {
        this.g = pzVar.p(looper, null);
        this.h = pzVar.p(looper2, null);
        this.j = 0;
        this.k = 0;
        this.i = il3Var;
    }

    public fw3(zb3 zb3Var) {
        this.g = zb3Var;
        this.h = new ArrayDeque();
        this.i = new ArrayDeque();
        this.j = new PriorityQueue();
        this.f = -1;
    }

    public fw3(View view) {
        this.f = -1;
        this.g = view;
        this.h = l6.a();
    }

    public fw3(zs1 zs1Var) {
        this.g = new hl0(30);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.f = 0;
        this.j = zs1Var;
        this.k = new z71(7, this);
    }
}
