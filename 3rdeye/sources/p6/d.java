package p6;

import H6.C0675l;
import K6.C0713c;
import N7.Ba;
import N7.X9;
import N7.Z;
import T1.B;
import androidx.recyclerview.widget.RecyclerView;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import o6.C5426c;
import z6.C5865d;

/* compiled from: DivRuntimeVisitor.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final E7.b f45211a;

    /* renamed from: b, reason: collision with root package name */
    public final Q6.d f45212b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.f f45213c;

    public d(E7.b divStateCache, Q6.d dVar, F3.f fVar) {
        l.f(divStateCache, "divStateCache");
        this.f45211a = divStateCache;
        this.f45212b = dVar;
        this.f45213c = fVar;
    }

    public static String a(String str, String str2) {
        return str + '/' + str2;
    }

    public static C5426c c(Z z10, C0675l c0675l, String str, C5426c c5426c) {
        C5426c c5426cA;
        if (!B.k(z10)) {
            return c5426c;
        }
        h runtimeStore$div_release = c0675l.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null || (c5426cA = h.a(runtimeStore$div_release, str, z10, null, c5426c, 4)) == null) {
            return null;
        }
        c5426cA.a(c0675l);
        return c5426cA;
    }

    public static ArrayList d(C5865d c5865d) {
        List<b9.l<String, String>> list = c5865d.f48459b;
        ArrayList arrayList = new ArrayList(list.size() * 4);
        arrayList.add(String.valueOf(c5865d.f48458a));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b9.l lVar = (b9.l) it.next();
            arrayList.add(lVar.f18083b);
            arrayList.add(lVar.f18084c);
        }
        return arrayList;
    }

    public final void b(Z z10, C5865d c5865d, C0675l divView) {
        C5426c c5426c;
        l.f(divView, "divView");
        h runtimeStore$div_release = divView.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null || (c5426c = runtimeStore$div_release.i) == null) {
            return;
        }
        c5426c.a(divView);
        e(z10, divView, c5865d.b(), d(c5865d), c5426c);
    }

    public final void e(Z z10, C0675l c0675l, String str, ArrayList arrayList, C5426c c5426c) {
        if (z10 instanceof Z.a) {
            f(z10, c0675l, ((Z.a) z10).f7813c.f9824A, str, arrayList, c5426c);
            return;
        }
        if (z10 instanceof Z.e) {
            f(z10, c0675l, ((Z.e) z10).f7817c.f9719y, str, arrayList, c5426c);
            return;
        }
        if (z10 instanceof Z.c) {
            f(z10, c0675l, ((Z.c) z10).f7815c.f8976u, str, arrayList, c5426c);
            return;
        }
        if (z10 instanceof Z.i) {
            f(z10, c0675l, ((Z.i) z10).f7821c.f5364t, str, arrayList, c5426c);
            return;
        }
        if (z10 instanceof Z.m) {
            g(((Z.m) z10).f7825c, c0675l, str, arrayList, c5426c);
            return;
        }
        if (z10 instanceof Z.o) {
            h(((Z.o) z10).f7827c, c0675l, str, arrayList, c5426c);
            return;
        }
        if (z10 instanceof Z.b) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.d) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.f) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.g) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.h) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.j) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.k) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.l) {
            c(z10, c0675l, str, c5426c);
            return;
        }
        if (z10 instanceof Z.p) {
            c(z10, c0675l, str, c5426c);
        } else if (z10 instanceof Z.q) {
            c(z10, c0675l, str, c5426c);
        } else if (z10 instanceof Z.n) {
            c(z10, c0675l, str, c5426c);
        }
    }

    public final void f(Z z10, C0675l c0675l, List list, String str, ArrayList arrayList, C5426c c5426c) {
        C5426c c5426cC = c(z10, c0675l, str, c5426c);
        if (c5426cC == null || list == null) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Z z11 = (Z) obj;
            e(z11, c0675l, a(str, C0713c.L(z11.d(), i)), arrayList, c5426cC);
            i = i10;
        }
    }

    public final void g(X9 x92, C0675l c0675l, String str, ArrayList arrayList, C5426c c5426c) {
        String strA;
        C0675l c0675l2;
        C5426c c5426c2;
        i iVar;
        String strValueOf;
        l.f(x92, "<this>");
        String str2 = x92.f7730l;
        if (str2 == null && (str2 = x92.f7735q) == null) {
            str2 = "";
        }
        arrayList.add(str2);
        ArrayList arrayList2 = arrayList;
        String strU0 = C2097r.u0(arrayList2, "/", null, null, null, 62);
        String str3 = c0675l.getDivTag().f38455a;
        String strC = this.f45212b.c(str3, strU0);
        List<X9.a> list = x92.f7743y;
        if (strC == null && (strC = this.f45211a.l(str3, strU0)) == null) {
            strC = null;
            String str4 = x92.f7742x;
            if (str4 != null) {
                Z6.d dVarA = c5426c.f44858b.a(str4);
                strValueOf = String.valueOf(dVarA != null ? dVarA.b() : null);
            } else {
                strValueOf = null;
            }
            if (strValueOf == null) {
                A7.b<String> bVar = x92.f7728j;
                strA = bVar != null ? bVar.a(c5426c.f44857a) : null;
                if (strA == null) {
                    X9.a aVar = (X9.a) C2097r.q0(list);
                    if (aVar != null) {
                        strC = aVar.f7748d;
                    }
                    strA = strC;
                }
            } else {
                strA = strValueOf;
            }
        } else {
            strA = strC;
        }
        for (X9.a aVar2 : list) {
            ArrayList arrayList3 = arrayList2;
            Z z10 = aVar2.f7747c;
            if (z10 == null) {
                c0675l2 = c0675l;
                c5426c2 = c5426c;
            } else {
                String str5 = aVar2.f7748d;
                String strA2 = a(str, str5);
                if (str5.equals(strA)) {
                    c0675l2 = c0675l;
                    c5426c2 = c5426c;
                    e(z10, c0675l2, strA2, arrayList3, c5426c2);
                } else {
                    c0675l2 = c0675l;
                    c5426c2 = c5426c;
                    arrayList2 = arrayList3;
                    h runtimeStore$div_release = c0675l2.getRuntimeStore$div_release();
                    if (runtimeStore$div_release != null && (iVar = runtimeStore$div_release.f45228h) != null) {
                        iVar.a(c5426c2, strA2, C5468b.f45209g);
                    }
                    c0675l = c0675l2;
                    c5426c = c5426c2;
                }
            }
            arrayList2 = arrayList3;
            c0675l = c0675l2;
            c5426c = c5426c2;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList2.remove(C2092m.V(arrayList2));
    }

    public final void h(Ba ba2, C0675l c0675l, String path, ArrayList arrayList, C5426c c5426c) {
        int iIntValue;
        i iVar;
        String str = c0675l.getDataTag().f38455a;
        F3.f fVar = this.f45213c;
        l.f(path, "path");
        Map map = (Map) ((LinkedHashMap) fVar.f1607b).get(str);
        Integer num = map != null ? (Integer) map.get(path) : null;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            long jLongValue = ba2.f4957y.a(c5426c.f44857a).longValue();
            long j4 = jLongValue >> 31;
            iIntValue = (j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        }
        int i = iIntValue;
        int i10 = 0;
        for (Object obj : ba2.f4949q) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C2092m.a0();
                throw null;
            }
            Ba.a aVar = (Ba.a) obj;
            String strA = a(path, C0713c.L(aVar.f4959a.d(), i10));
            if (i == i10) {
                e(aVar.f4959a, c0675l, strA, arrayList, c5426c);
            } else {
                h runtimeStore$div_release = c0675l.getRuntimeStore$div_release();
                if (runtimeStore$div_release != null && (iVar = runtimeStore$div_release.f45228h) != null) {
                    iVar.a(c5426c, strA, c.f45210g);
                }
            }
            i10 = i11;
        }
    }
}
