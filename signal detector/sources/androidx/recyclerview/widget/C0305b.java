package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.C1009cp;
import com.google.android.gms.internal.ads.C1014cu;
import com.google.android.gms.internal.ads.C1733qA;
import com.google.android.gms.internal.ads.C1994v2;
import com.google.android.gms.internal.ads.C2036vr;
import com.google.android.gms.internal.ads.EA;
import com.google.android.gms.internal.ads.UN;
import com.google.android.gms.internal.ads.Vt;
import com.google.android.gms.internal.ads.ZJ;
import g.AbstractC2327a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import o.AbstractC2720j0;
import o.Y0;
import o.a1;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305b {

    /* renamed from: a, reason: collision with root package name */
    public int f5430a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5431b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5432c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5433d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5434e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5435f;

    public C0305b(Looper looper, Looper looper2, C1994v2 c1994v2, C1014cu c1014cu) {
        this.f5431b = c1994v2.B(looper, null);
        this.f5432c = c1994v2.B(looper2, null);
        this.f5434e = 0;
        this.f5435f = 0;
        this.f5433d = c1014cu;
    }

    public void a() {
        View view = (View) this.f5431b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((Y0) this.f5433d) != null) {
                if (((Y0) this.f5435f) == null) {
                    this.f5435f = new Y0();
                }
                Y0 y02 = (Y0) this.f5435f;
                y02.f22471a = null;
                y02.f22474d = false;
                y02.f22472b = null;
                y02.f22473c = false;
                WeakHashMap weakHashMap = R.O.f3270a;
                ColorStateList colorStateListC = R.F.c(view);
                if (colorStateListC != null) {
                    y02.f22474d = true;
                    y02.f22471a = colorStateListC;
                }
                PorterDuff.Mode modeD = R.F.d(view);
                if (modeD != null) {
                    y02.f22473c = true;
                    y02.f22472b = modeD;
                }
                if (y02.f22474d || y02.f22473c) {
                    o.r.e(background, y02, view.getDrawableState());
                    return;
                }
            }
            Y0 y03 = (Y0) this.f5434e;
            if (y03 != null) {
                o.r.e(background, y03, view.getDrawableState());
                return;
            }
            Y0 y04 = (Y0) this.f5433d;
            if (y04 != null) {
                o.r.e(background, y04, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.f5433d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0304a c0304a = (C0304a) arrayList.get(i3);
            int i6 = c0304a.f5419a;
            if (i6 != 8) {
                if (i6 == 1) {
                    int i7 = c0304a.f5420b;
                    int i8 = c0304a.f5422d + i7;
                    while (i7 < i8) {
                        if (g(i7, i3 + 1) == i) {
                            return true;
                        }
                        i7++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(c0304a.f5422d, i3 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f5433d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((E) this.f5434e).a((C0304a) arrayList.get(i));
        }
        q(arrayList);
        this.f5430a = 0;
    }

    public void d() {
        E e6 = (E) this.f5434e;
        c();
        ArrayList arrayList = (ArrayList) this.f5432c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0304a c0304a = (C0304a) arrayList.get(i);
            int i3 = c0304a.f5419a;
            if (i3 == 1) {
                e6.a(c0304a);
                e6.d(c0304a.f5420b, c0304a.f5422d);
            } else if (i3 == 2) {
                e6.a(c0304a);
                int i6 = c0304a.f5420b;
                int i7 = c0304a.f5422d;
                RecyclerView recyclerView = e6.f5281a;
                recyclerView.Q(i6, i7, true);
                recyclerView.f5374x0 = true;
                recyclerView.f5372u0.f5444c += i7;
            } else if (i3 == 4) {
                e6.a(c0304a);
                e6.c(c0304a.f5420b, c0304a.f5422d, c0304a.f5421c);
            } else if (i3 == 8) {
                e6.a(c0304a);
                e6.e(c0304a.f5420b, c0304a.f5422d);
            }
        }
        q(arrayList);
        this.f5430a = 0;
    }

    public void e(C0304a c0304a) {
        int i;
        int i3 = c0304a.f5419a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iU = u(c0304a.f5420b, i3);
        int i6 = c0304a.f5420b;
        int i7 = c0304a.f5419a;
        if (i7 == 2) {
            i = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0304a);
            }
            i = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < c0304a.f5422d; i9++) {
            int iU2 = u((i * i9) + c0304a.f5420b, c0304a.f5419a);
            int i10 = c0304a.f5419a;
            if (i10 == 2 ? iU2 != iU : !(i10 == 4 && iU2 == iU + 1)) {
                C0304a c0304aL = l(c0304a.f5421c, i10, iU, i8);
                f(c0304aL, i6);
                c0304aL.f5421c = null;
                ((Q.c) this.f5431b).d(c0304aL);
                if (c0304a.f5419a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                iU = iU2;
            } else {
                i8++;
            }
        }
        Object obj = c0304a.f5421c;
        c0304a.f5421c = null;
        ((Q.c) this.f5431b).d(c0304a);
        if (i8 > 0) {
            C0304a c0304aL2 = l(obj, c0304a.f5419a, iU, i8);
            f(c0304aL2, i6);
            c0304aL2.f5421c = null;
            ((Q.c) this.f5431b).d(c0304aL2);
        }
    }

    public void f(C0304a c0304a, int i) {
        E e6 = (E) this.f5434e;
        e6.a(c0304a);
        int i3 = c0304a.f5419a;
        if (i3 != 2) {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            e6.c(i, c0304a.f5422d, c0304a.f5421c);
        } else {
            int i6 = c0304a.f5422d;
            RecyclerView recyclerView = e6.f5281a;
            recyclerView.Q(i, i6, true);
            recyclerView.f5374x0 = true;
            recyclerView.f5372u0.f5444c += i6;
        }
    }

    public int g(int i, int i3) {
        ArrayList arrayList = (ArrayList) this.f5433d;
        int size = arrayList.size();
        while (i3 < size) {
            C0304a c0304a = (C0304a) arrayList.get(i3);
            int i6 = c0304a.f5419a;
            if (i6 == 8) {
                int i7 = c0304a.f5420b;
                if (i7 == i) {
                    i = c0304a.f5422d;
                } else {
                    if (i7 < i) {
                        i--;
                    }
                    if (c0304a.f5422d <= i) {
                        i++;
                    }
                }
            } else {
                int i8 = c0304a.f5420b;
                if (i8 > i) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = c0304a.f5422d;
                    if (i < i8 + i9) {
                        return -1;
                    }
                    i -= i9;
                } else if (i6 == 1) {
                    i += c0304a.f5422d;
                }
            }
            i3++;
        }
        return i;
    }

    public ColorStateList h() {
        Y0 y02 = (Y0) this.f5434e;
        if (y02 != null) {
            return y02.f22471a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        Y0 y02 = (Y0) this.f5434e;
        if (y02 != null) {
            return y02.f22472b;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f5432c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListI;
        View view = (View) this.f5431b;
        Context context = view.getContext();
        int[] iArr = AbstractC2327a.f20112B;
        a1 a1VarI = a1.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        View view2 = (View) this.f5431b;
        R.O.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) a1VarI.f22480c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f5430a = typedArray.getResourceId(0, -1);
                o.r rVar = (o.r) this.f5432c;
                Context context2 = view.getContext();
                int i3 = this.f5430a;
                synchronized (rVar) {
                    colorStateListI = rVar.f22623a.i(context2, i3);
                }
                if (colorStateListI != null) {
                    r(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                R.F.h(view, a1VarI.c(1));
            }
            if (typedArray.hasValue(2)) {
                R.F.i(view, AbstractC2720j0.c(typedArray.getInt(2, -1), null));
            }
            a1VarI.j();
        } catch (Throwable th) {
            a1VarI.j();
            throw th;
        }
    }

    public C0304a l(Object obj, int i, int i3, int i6) {
        C0304a c0304a = (C0304a) ((Q.c) this.f5431b).h();
        if (c0304a != null) {
            c0304a.f5419a = i;
            c0304a.f5420b = i3;
            c0304a.f5422d = i6;
            c0304a.f5421c = obj;
            return c0304a;
        }
        C0304a c0304a2 = new C0304a();
        c0304a2.f5419a = i;
        c0304a2.f5420b = i3;
        c0304a2.f5422d = i6;
        c0304a2.f5421c = obj;
        return c0304a2;
    }

    public void m() {
        this.f5430a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateListI;
        this.f5430a = i;
        o.r rVar = (o.r) this.f5432c;
        if (rVar != null) {
            Context context = ((View) this.f5431b).getContext();
            synchronized (rVar) {
                colorStateListI = rVar.f22623a.i(context, i);
            }
        } else {
            colorStateListI = null;
        }
        r(colorStateListI);
        a();
    }

    public void o(C0304a c0304a) {
        E e6 = (E) this.f5434e;
        ((ArrayList) this.f5433d).add(c0304a);
        int i = c0304a.f5419a;
        if (i == 1) {
            e6.d(c0304a.f5420b, c0304a.f5422d);
            return;
        }
        if (i == 2) {
            int i3 = c0304a.f5420b;
            int i6 = c0304a.f5422d;
            RecyclerView recyclerView = e6.f5281a;
            recyclerView.Q(i3, i6, false);
            recyclerView.f5374x0 = true;
            return;
        }
        if (i == 4) {
            e6.c(c0304a.f5420b, c0304a.f5422d, c0304a.f5421c);
        } else if (i == 8) {
            e6.e(c0304a.f5420b, c0304a.f5422d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0304a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0305b.p():void");
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0304a c0304a = (C0304a) arrayList.get(i);
            c0304a.f5421c = null;
            ((Q.c) this.f5431b).d(c0304a);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((Y0) this.f5433d) == null) {
                this.f5433d = new Y0();
            }
            Y0 y02 = (Y0) this.f5433d;
            y02.f22471a = colorStateList;
            y02.f22474d = true;
        } else {
            this.f5433d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((Y0) this.f5434e) == null) {
            this.f5434e = new Y0();
        }
        Y0 y02 = (Y0) this.f5434e;
        y02.f22471a = colorStateList;
        y02.f22474d = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((Y0) this.f5434e) == null) {
            this.f5434e = new Y0();
        }
        Y0 y02 = (Y0) this.f5434e;
        y02.f22472b = mode;
        y02.f22473c = true;
        a();
    }

    public int u(int i, int i3) {
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.f5433d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0304a c0304a = (C0304a) arrayList.get(size);
            int i8 = c0304a.f5419a;
            if (i8 == 8) {
                int i9 = c0304a.f5420b;
                int i10 = c0304a.f5422d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i < i7 || i > i6) {
                    if (i < i9) {
                        if (i3 == 1) {
                            c0304a.f5420b = i9 + 1;
                            c0304a.f5422d = i10 + 1;
                        } else if (i3 == 2) {
                            c0304a.f5420b = i9 - 1;
                            c0304a.f5422d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i3 == 1) {
                        c0304a.f5422d = i10 + 1;
                    } else if (i3 == 2) {
                        c0304a.f5422d = i10 - 1;
                    }
                    i++;
                } else {
                    if (i3 == 1) {
                        c0304a.f5420b = i9 + 1;
                    } else if (i3 == 2) {
                        c0304a.f5420b = i9 - 1;
                    }
                    i--;
                }
            } else {
                int i11 = c0304a.f5420b;
                if (i11 <= i) {
                    if (i8 == 1) {
                        i -= c0304a.f5422d;
                    } else if (i8 == 2) {
                        i += c0304a.f5422d;
                    }
                } else if (i3 == 1) {
                    c0304a.f5420b = i11 + 1;
                } else if (i3 == 2) {
                    c0304a.f5420b = i11 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0304a c0304a2 = (C0304a) arrayList.get(size2);
            if (c0304a2.f5419a == 8) {
                int i12 = c0304a2.f5422d;
                if (i12 == c0304a2.f5420b || i12 < 0) {
                    arrayList.remove(size2);
                    c0304a2.f5421c = null;
                    ((Q.c) this.f5431b).d(c0304a2);
                }
            } else if (c0304a2.f5422d <= 0) {
                arrayList.remove(size2);
                c0304a2.f5421c = null;
                ((Q.c) this.f5431b).d(c0304a2);
            }
        }
        return i;
    }

    public void v(int i) {
        AbstractC0582Jp.h0(i >= 0);
        this.f5430a = i;
        x(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r8 < r1.f16328b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r8, com.google.android.gms.internal.ads.C2036vr r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5434e
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L9b
            int r1 = r7.f5430a
            if (r1 == 0) goto L9c
            r2 = -1
            if (r1 == r2) goto L2c
            int r1 = r0.size()
            int r3 = r7.f5430a
            if (r1 < r3) goto L2c
            java.lang.Object r1 = r0.peek()
            com.google.android.gms.internal.ads.qA r1 = (com.google.android.gms.internal.ads.C1733qA) r1
            java.lang.String r3 = com.google.android.gms.internal.ads.Vt.f12096a
            long r3 = r1.f16328b
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2c
            goto L9c
        L2c:
            java.lang.Object r1 = r7.f5432c
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.vr r1 = new com.google.android.gms.internal.ads.vr
            r1.<init>()
            goto L42
        L3c:
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.vr r1 = (com.google.android.gms.internal.ads.C2036vr) r1
        L42:
            int r3 = r10.B()
            r1.y(r3)
            byte[] r3 = r10.f17354a
            int r10 = r10.f17355b
            byte[] r4 = r1.f17354a
            r5 = 0
            int r6 = r1.B()
            java.lang.System.arraycopy(r3, r10, r4, r5, r6)
            java.lang.Object r10 = r7.f5435f
            com.google.android.gms.internal.ads.qA r10 = (com.google.android.gms.internal.ads.C1733qA) r10
            if (r10 == 0) goto L6a
            long r3 = r10.f16328b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L64
            goto L6a
        L64:
            java.util.ArrayList r8 = r10.f16327a
            r8.add(r1)
            return
        L6a:
            java.lang.Object r10 = r7.f5433d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.ads.qA r10 = new com.google.android.gms.internal.ads.qA
            r10.<init>()
            goto L80
        L7a:
            java.lang.Object r10 = r10.pop()
            com.google.android.gms.internal.ads.qA r10 = (com.google.android.gms.internal.ads.C1733qA) r10
        L80:
            java.util.ArrayList r3 = r10.f16327a
            boolean r4 = r3.isEmpty()
            com.google.android.gms.internal.ads.AbstractC0582Jp.h0(r4)
            r10.f16328b = r8
            r3.add(r1)
            r0.add(r10)
            r7.f5435f = r10
            int r8 = r7.f5430a
            if (r8 == r2) goto L9a
            r7.x(r8)
        L9a:
            return
        L9b:
            r8 = r1
        L9c:
            java.lang.Object r0 = r7.f5431b
            com.google.android.gms.internal.ads.EA r0 = (com.google.android.gms.internal.ads.EA) r0
            r0.i(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0305b.w(long, com.google.android.gms.internal.ads.vr):void");
    }

    public void x(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f5434e;
            if (priorityQueue.size() <= i) {
                return;
            }
            C1733qA c1733qA = (C1733qA) priorityQueue.poll();
            String str = Vt.f12096a;
            int i3 = 0;
            while (true) {
                arrayList = c1733qA.f16327a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                ((EA) this.f5431b).i(c1733qA.f16328b, (C2036vr) arrayList.get(i3));
                ((ArrayDeque) this.f5432c).push((C2036vr) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            C1733qA c1733qA2 = (C1733qA) this.f5435f;
            if (c1733qA2 != null && c1733qA2.f16328b == c1733qA.f16328b) {
                this.f5435f = null;
            }
            ((ArrayDeque) this.f5433d).push(c1733qA);
        }
    }

    public void y(Object obj) {
        Object obj2 = this.f5434e;
        this.f5434e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        C1014cu c1014cu = (C1014cu) this.f5433d;
        c1014cu.getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        UN un = (UN) c1014cu.f13695b;
        un.A0();
        un.Z1(1, 10, num);
        un.Z1(2, 10, num);
        ZJ zj = new ZJ(iIntValue);
        C1009cp c1009cp = un.f11690n;
        c1009cp.c(21, zj);
        c1009cp.d();
    }

    public C0305b(EA ea) {
        this.f5431b = ea;
        this.f5432c = new ArrayDeque();
        this.f5433d = new ArrayDeque();
        this.f5434e = new PriorityQueue();
        this.f5430a = -1;
    }

    public C0305b(View view) {
        this.f5430a = -1;
        this.f5431b = view;
        this.f5432c = o.r.a();
    }

    public C0305b(E e6) {
        this.f5431b = new Q.c(30);
        this.f5432c = new ArrayList();
        this.f5433d = new ArrayList();
        this.f5430a = 0;
        this.f5434e = e6;
        this.f5435f = new N(2, this);
    }
}
