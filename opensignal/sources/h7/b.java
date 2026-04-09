package h7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f9999a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10000b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10001c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10002d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10003e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10004f;

    public b(View view) {
        this.f9999a = -1;
        this.f10000b = view;
        this.f10001c = p.p.a();
    }

    public void a() {
        View view = (View) this.f10000b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((d5.z0) this.f10002d) != null) {
                if (((d5.z0) this.f10004f) == null) {
                    this.f10004f = new d5.z0(3);
                }
                d5.z0 z0Var = (d5.z0) this.f10004f;
                z0Var.f7144d = null;
                z0Var.f7143c = false;
                z0Var.f7145e = null;
                z0Var.f7142b = false;
                WeakHashMap weakHashMap = u3.i0.f23177a;
                ColorStateList colorStateListC = u3.z.c(view);
                if (colorStateListC != null) {
                    z0Var.f7143c = true;
                    z0Var.f7144d = colorStateListC;
                }
                PorterDuff.Mode modeD = u3.z.d(view);
                if (modeD != null) {
                    z0Var.f7142b = true;
                    z0Var.f7145e = modeD;
                }
                if (z0Var.f7143c || z0Var.f7142b) {
                    p.p.e(background, z0Var, view.getDrawableState());
                    return;
                }
            }
            d5.z0 z0Var2 = (d5.z0) this.f10003e;
            if (z0Var2 != null) {
                p.p.e(background, z0Var2, view.getDrawableState());
                return;
            }
            d5.z0 z0Var3 = (d5.z0) this.f10002d;
            if (z0Var3 != null) {
                p.p.e(background, z0Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.f10002d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f9994a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.f9995b;
                    int i14 = aVar.f9996c + i13;
                    while (i13 < i14) {
                        if (g(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.f9996c, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f10002d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h0) this.f10003e).s((a) arrayList.get(i10));
        }
        q(arrayList);
        this.f9999a = 0;
    }

    public void d() {
        h0 h0Var = (h0) this.f10003e;
        c();
        ArrayList arrayList = (ArrayList) this.f10001c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f9994a;
            if (i11 == 1) {
                h0Var.s(aVar);
                h0Var.J(aVar.f9995b, aVar.f9996c);
            } else if (i11 == 2) {
                h0Var.s(aVar);
                int i12 = aVar.f9995b;
                int i13 = aVar.f9996c;
                RecyclerView recyclerView = (RecyclerView) h0Var.f10078a;
                recyclerView.U(i12, true, i13);
                recyclerView.G0 = true;
                recyclerView.D0.f10103c += i13;
            } else if (i11 == 4) {
                h0Var.s(aVar);
                h0Var.I(aVar.f9995b, aVar.f9996c);
            } else if (i11 == 8) {
                h0Var.s(aVar);
                h0Var.N(aVar.f9995b, aVar.f9996c);
            }
        }
        q(arrayList);
        this.f9999a = 0;
    }

    public void e(a aVar) {
        int i10;
        t3.c cVar = (t3.c) this.f10000b;
        int i11 = aVar.f9994a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iU = u(aVar.f9995b, i11);
        int i12 = aVar.f9995b;
        int i13 = aVar.f9994a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.f9996c; i15++) {
            int iU2 = u((i10 * i15) + aVar.f9995b, aVar.f9994a);
            int i16 = aVar.f9994a;
            if (i16 == 2 ? iU2 != iU : !(i16 == 4 && iU2 == iU + 1)) {
                a aVarL = l(i16, iU, i14);
                f(aVarL, i12);
                cVar.c(aVarL);
                if (aVar.f9994a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iU = iU2;
            } else {
                i14++;
            }
        }
        cVar.c(aVar);
        if (i14 > 0) {
            a aVarL2 = l(aVar.f9994a, iU, i14);
            f(aVarL2, i12);
            cVar.c(aVarL2);
        }
    }

    public void f(a aVar, int i10) {
        h0 h0Var = (h0) this.f10003e;
        h0Var.s(aVar);
        int i11 = aVar.f9994a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            h0Var.I(i10, aVar.f9996c);
        } else {
            int i12 = aVar.f9996c;
            RecyclerView recyclerView = (RecyclerView) h0Var.f10078a;
            recyclerView.U(i10, true, i12);
            recyclerView.G0 = true;
            recyclerView.D0.f10103c += i12;
        }
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f10002d;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f9994a;
            if (i12 == 8) {
                int i13 = aVar.f9995b;
                if (i13 == i10) {
                    i10 = aVar.f9996c;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f9996c <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f9995b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f9996c;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f9996c;
                }
            }
            i11++;
        }
        return i10;
    }

    public ColorStateList h() {
        d5.z0 z0Var = (d5.z0) this.f10003e;
        if (z0Var != null) {
            return (ColorStateList) z0Var.f7144d;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        d5.z0 z0Var = (d5.z0) this.f10003e;
        if (z0Var != null) {
            return (PorterDuff.Mode) z0Var.f7145e;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f10001c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = (View) this.f10000b;
        io.sentry.k kVarH0 = io.sentry.k.h0(view.getContext(), attributeSet, h.j.ViewBackgroundHelper, i10);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        View view2 = (View) this.f10000b;
        u3.i0.m(view2, view2.getContext(), h.j.ViewBackgroundHelper, attributeSet, (TypedArray) kVarH0.f12398g, i10, 0);
        try {
            if (typedArray.hasValue(h.j.ViewBackgroundHelper_android_background)) {
                this.f9999a = typedArray.getResourceId(h.j.ViewBackgroundHelper_android_background, -1);
                p.p pVar = (p.p) this.f10001c;
                Context context = view.getContext();
                int i11 = this.f9999a;
                synchronized (pVar) {
                    colorStateListF = pVar.f20132a.f(context, i11);
                }
                if (colorStateListF != null) {
                    r(colorStateListF);
                }
            }
            if (typedArray.hasValue(h.j.ViewBackgroundHelper_backgroundTint)) {
                u3.z.g(view, kVarH0.T(h.j.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(h.j.ViewBackgroundHelper_backgroundTintMode)) {
                u3.z.h(view, p.c1.c(typedArray.getInt(h.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            kVarH0.l0();
        } catch (Throwable th2) {
            kVarH0.l0();
            throw th2;
        }
    }

    public a l(int i10, int i11, int i12) {
        a aVar = (a) ((t3.c) this.f10000b).a();
        if (aVar != null) {
            aVar.f9994a = i10;
            aVar.f9995b = i11;
            aVar.f9996c = i12;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f9994a = i10;
        aVar2.f9995b = i11;
        aVar2.f9996c = i12;
        return aVar2;
    }

    public void m() {
        this.f9999a = -1;
        r(null);
        a();
    }

    public void n(int i10) {
        ColorStateList colorStateListF;
        this.f9999a = i10;
        p.p pVar = (p.p) this.f10001c;
        if (pVar != null) {
            Context context = ((View) this.f10000b).getContext();
            synchronized (pVar) {
                colorStateListF = pVar.f20132a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        r(colorStateListF);
        a();
    }

    public void o(a aVar) {
        h0 h0Var = (h0) this.f10003e;
        ((ArrayList) this.f10002d).add(aVar);
        int i10 = aVar.f9994a;
        if (i10 == 1) {
            h0Var.J(aVar.f9995b, aVar.f9996c);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.f9995b;
            int i12 = aVar.f9996c;
            RecyclerView recyclerView = (RecyclerView) h0Var.f10078a;
            recyclerView.U(i11, false, i12);
            recyclerView.G0 = true;
            return;
        }
        if (i10 == 4) {
            h0Var.I(aVar.f9995b, aVar.f9996c);
        } else if (i10 == 8) {
            h0Var.N(aVar.f9995b, aVar.f9996c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.b.p():void");
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            aVar.getClass();
            ((t3.c) this.f10000b).c(aVar);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((d5.z0) this.f10002d) == null) {
                this.f10002d = new d5.z0(3);
            }
            d5.z0 z0Var = (d5.z0) this.f10002d;
            z0Var.f7144d = colorStateList;
            z0Var.f7143c = true;
        } else {
            this.f10002d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((d5.z0) this.f10003e) == null) {
            this.f10003e = new d5.z0(3);
        }
        d5.z0 z0Var = (d5.z0) this.f10003e;
        z0Var.f7144d = colorStateList;
        z0Var.f7143c = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((d5.z0) this.f10003e) == null) {
            this.f10003e = new d5.z0(3);
        }
        d5.z0 z0Var = (d5.z0) this.f10003e;
        z0Var.f7145e = mode;
        z0Var.f7142b = true;
        a();
    }

    public int u(int i10, int i11) {
        int i12;
        int i13;
        t3.c cVar = (t3.c) this.f10000b;
        ArrayList arrayList = (ArrayList) this.f10002d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.f9994a;
            if (i14 == 8) {
                int i15 = aVar.f9995b;
                int i16 = aVar.f9996c;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.f9995b = i15 + 1;
                            aVar.f9996c = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f9995b = i15 - 1;
                            aVar.f9996c = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.f9996c = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f9996c = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.f9995b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.f9995b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.f9995b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f9996c;
                    } else if (i14 == 2) {
                        i10 += aVar.f9996c;
                    }
                } else if (i11 == 1) {
                    aVar.f9995b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f9995b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f9994a == 8) {
                int i18 = aVar2.f9996c;
                if (i18 == aVar2.f9995b || i18 < 0) {
                    arrayList.remove(size2);
                    cVar.c(aVar2);
                }
            } else if (aVar2.f9996c <= 0) {
                arrayList.remove(size2);
                cVar.c(aVar2);
            }
        }
        return i10;
    }

    public b() {
        this.f10000b = new v1.j[32];
        this.f10001c = new float[32];
        this.f10002d = new byte[32];
        int i10 = u.h0.f23073a;
        this.f10003e = new u.b0();
        this.f10004f = new u.b0();
    }
}
