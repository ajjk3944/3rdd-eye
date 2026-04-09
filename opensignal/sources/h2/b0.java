package h2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q3.a f9784a;

    /* renamed from: b, reason: collision with root package name */
    public static final q3.a f9785b;

    /* renamed from: c, reason: collision with root package name */
    public static final q3.a f9786c;

    static {
        int i10 = 16;
        f9784a = new q3.a(new au.r(26), i10, new o(23));
        f9785b = new q3.a(new au.r(27), i10, new o(24));
        f9786c = new q3.a(new au.r(28), i10, new o(25));
    }

    public static b a(String str, j0 j0Var, long j, t2.d dVar, k2.g gVar, int i10) {
        mq.w wVar = mq.w.f16945a;
        return new b(new o2.d(str, j0Var, wVar, wVar, gVar, dVar), i10, 1, j);
    }

    public static final long b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            m2.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j = (i11 & 4294967295L) | (i10 << 32);
        int i12 = i0.f9835c;
        return j;
    }

    public static final int c(int i10, List list) {
        int i11;
        int i12 = ((p) mq.o.z0(list)).f9861c;
        if (i10 > ((p) mq.o.z0(list)).f9861c) {
            m2.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            p pVar = (p) list.get(i11);
            char c4 = pVar.f9860b > i10 ? (char) 1 : pVar.f9861c <= i10 ? (char) 65535 : (char) 0;
            if (c4 >= 0) {
                if (c4 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbU = h0.b.u("Found paragraph index ", i11, " should be in range [0, ");
        sbU.append(list.size());
        sbU.append(").\nDebug info: index=");
        sbU.append(i10);
        sbU.append(", paragraphs=[");
        sbU.append(v2.a.a(list, null, new o(0), 31));
        sbU.append(']');
        m2.a.a(sbU.toString());
        return i11;
    }

    public static final int d(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            p pVar = (p) list.get(i12);
            char c4 = pVar.f9862d > i10 ? (char) 1 : pVar.f9863e <= i10 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i11 = i12 + 1;
            } else {
                if (c4 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final j0 e(j0 j0Var, t2.i iVar) {
        r2.o oVar;
        long j;
        k2.r rVar;
        k2.n nVar;
        n2.b bVar;
        c0 c0Var = j0Var.f9840a;
        r2.o oVar2 = d0.f9807d;
        r2.o oVar3 = c0Var.f9787a;
        if (oVar3.equals(r2.n.f21212a)) {
            oVar3 = d0.f9807d;
        }
        r2.o oVar4 = oVar3;
        long j7 = c0Var.f9788b;
        t2.l[] lVarArr = t2.k.f22393b;
        if ((j7 & 1095216660480L) == 0) {
            j7 = d0.f9804a;
        }
        long j10 = j7;
        k2.r rVar2 = c0Var.f9789c;
        if (rVar2 == null) {
            rVar2 = k2.r.f14002x;
        }
        k2.r rVar3 = rVar2;
        k2.n nVar2 = c0Var.f9790d;
        k2.n nVar3 = new k2.n(nVar2 != null ? nVar2.f13996a : 0);
        k2.o oVar5 = c0Var.f9791e;
        k2.o oVar6 = new k2.o(oVar5 != null ? oVar5.f13997a : 65535);
        k2.h hVar = c0Var.f9792f;
        if (hVar == null) {
            hVar = k2.h.f13982a;
        }
        k2.h hVar2 = hVar;
        String str = c0Var.f9793g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j11 = c0Var.f9794h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = d0.f9805b;
        }
        r2.a aVar = c0Var.f9795i;
        r2.a aVar2 = new r2.a(aVar != null ? aVar.f21192a : 0.0f);
        r2.p pVar = c0Var.j;
        if (pVar == null) {
            pVar = r2.p.f21213c;
        }
        r2.p pVar2 = pVar;
        n2.b bVar2 = c0Var.k;
        if (bVar2 == null) {
            n2.b bVar3 = n2.b.f17378g;
            io.sentry.k kVar = n2.c.f17381a;
            kVar.getClass();
            LocaleList localeList = LocaleList.getDefault();
            oVar = oVar4;
            synchronized (((df.c) kVar.f12399r)) {
                j = j10;
                try {
                    bVar = (n2.b) kVar.f12398g;
                    if (bVar == null || localeList != ((LocaleList) kVar.f12397d)) {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        rVar = rVar3;
                        int i10 = 0;
                        while (i10 < size) {
                            arrayList.add(new n2.a(localeList.get(i10)));
                            i10++;
                            size = size;
                            nVar3 = nVar3;
                        }
                        nVar = nVar3;
                        bVar = new n2.b(arrayList);
                        kVar.f12397d = localeList;
                        kVar.f12398g = bVar;
                    } else {
                        rVar = rVar3;
                        nVar = nVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            bVar2 = bVar;
        } else {
            oVar = oVar4;
            j = j10;
            rVar = rVar3;
            nVar = nVar3;
        }
        n2.b bVar4 = bVar2;
        long j12 = c0Var.f9796l;
        if (j12 == 16) {
            j12 = d0.f9806c;
        }
        r2.l lVar = c0Var.f9797m;
        if (lVar == null) {
            lVar = r2.l.f21208b;
        }
        g1.h0 h0Var = c0Var.f9798n;
        if (h0Var == null) {
            h0Var = g1.h0.f9234d;
        }
        i1.c cVar = c0Var.f9799o;
        if (cVar == null) {
            cVar = i1.f.f11146b;
        }
        c0 c0Var2 = new c0(oVar, j, rVar, nVar, oVar6, hVar2, str2, j11, aVar2, pVar2, bVar4, j12, lVar, h0Var, cVar);
        s sVar = j0Var.f9841b;
        int i11 = t.f9879b;
        int i12 = sVar.f9869a;
        int i13 = 5;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 5;
        }
        int i14 = sVar.f9870b;
        if (i14 == 3) {
            int i15 = k0.f9845a[iVar.ordinal()];
            if (i15 == 1) {
                i13 = 4;
            } else if (i15 != 2) {
                throw new bf.n();
            }
        } else if (i14 == Integer.MIN_VALUE) {
            int i16 = k0.f9845a[iVar.ordinal()];
            if (i16 == 1) {
                i13 = 1;
            } else {
                if (i16 != 2) {
                    throw new bf.n();
                }
                i13 = 2;
            }
        } else {
            i13 = i14;
        }
        long j13 = sVar.f9871c;
        if ((j13 & 1095216660480L) == 0) {
            j13 = t.f9878a;
        }
        r2.q qVar = sVar.f9872d;
        if (qVar == null) {
            qVar = r2.q.f21216c;
        }
        u uVar = sVar.f9873e;
        r2.q qVar2 = qVar;
        r2.i iVar2 = sVar.f9874f;
        int i17 = sVar.f9875g;
        if (i17 == 0) {
            i17 = r2.e.f21197b;
        }
        int i18 = sVar.f9876h;
        if (i18 == Integer.MIN_VALUE) {
            i18 = 1;
        }
        r2.s sVar2 = sVar.f9877i;
        if (sVar2 == null) {
            sVar2 = r2.s.f21220c;
        }
        return new j0(c0Var2, new s(i12, i13, j13, qVar2, uVar, iVar2, i17, i18, sVar2), j0Var.f9842c);
    }
}
