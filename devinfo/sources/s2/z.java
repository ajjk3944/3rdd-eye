package s2;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final yb.i f33454a;

    /* renamed from: b, reason: collision with root package name */
    public static final yb.i f33455b;

    /* renamed from: c, reason: collision with root package name */
    public static final yb.i f33456c;

    /* renamed from: d, reason: collision with root package name */
    public static final yb.i f33457d;

    /* renamed from: e, reason: collision with root package name */
    public static final yb.i f33458e;

    static {
        int i4 = 16;
        boolean z3 = false;
        f33454a = new yb.i(new u(11), z3, new t(24), i4);
        f33455b = new yb.i(new u(12), z3, new t(25), i4);
        f33456c = new yb.i(new u(13), z3, new t(26), i4);
        f33457d = new yb.i(new u(14), z3, new t(27), i4);
        f33458e = new yb.i(new u(15), z3, new t(28), i4);
    }

    public static a a(String str, h0 h0Var, long j, d3.d dVar, v2.d dVar2, int i4) {
        zj.s sVar = zj.s.f38317a;
        return new a(new z2.c(str, h0Var, sVar, sVar, dVar2, dVar), i4, 1, j);
    }

    public static final long b(int i4, int i10) {
        if (i4 < 0 || i10 < 0) {
            x2.a.a("start and end cannot be negative. [start: " + i4 + ", end: " + i10 + ']');
        }
        long j = (i10 & 4294967295L) | (i4 << 32);
        int i11 = g0.f33387c;
        return j;
    }

    public static final int c(int i4, List list) {
        int i10;
        int i11 = ((m) zj.n.h0(list)).f33404c;
        if (i4 > ((m) zj.n.h0(list)).f33404c) {
            x2.a.a("Index " + i4 + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i10 = -(i12 + 1);
                break;
            }
            i10 = (i12 + size) >>> 1;
            m mVar = (m) list.get(i10);
            char c9 = mVar.f33403b > i4 ? (char) 1 : mVar.f33404c <= i4 ? (char) 65535 : (char) 0;
            if (c9 >= 0) {
                if (c9 <= 0) {
                    break;
                }
                size = i10 - 1;
            } else {
                i12 = i10 + 1;
            }
        }
        if (i10 >= 0 && i10 < list.size()) {
            return i10;
        }
        StringBuilder sbW = je.u.w(i10, "Found paragraph index ", " should be in range [0, ");
        sbW.append(list.size());
        sbW.append(").\nDebug info: index=");
        sbW.append(i4);
        sbW.append(", paragraphs=[");
        sbW.append(f3.a.a(list, null, new b7.w(22), 31));
        sbW.append(']');
        x2.a.a(sbW.toString());
        return i10;
    }

    public static final int d(int i4, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            m mVar = (m) list.get(i11);
            char c9 = mVar.f33405d > i4 ? (char) 1 : mVar.f33406e <= i4 ? (char) 65535 : (char) 0;
            if (c9 < 0) {
                i10 = i11 + 1;
            } else {
                if (c9 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final h0 e(h0 h0Var, d3.l lVar) {
        a0 a0Var = h0Var.f33391a;
        c3.o oVar = b0.f33349d;
        c3.o oVarC = a0Var.f33333a.c(new r0.i0(3));
        long j = a0Var.f33334b;
        d3.o[] oVarArr = d3.n.f21970b;
        if ((j & 1095216660480L) == 0) {
            j = b0.f33346a;
        }
        long j8 = j;
        v2.k kVar = a0Var.f33335c;
        if (kVar == null) {
            kVar = v2.k.f35777c;
        }
        v2.k kVar2 = kVar;
        v2.i iVar = a0Var.f33336d;
        v2.i iVar2 = new v2.i(iVar != null ? iVar.f35774a : 0);
        v2.j jVar = a0Var.f33337e;
        v2.j jVar2 = new v2.j(jVar != null ? jVar.f35775a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        v2.p pVar = a0Var.f33338f;
        if (pVar == null) {
            pVar = v2.p.f35782a;
        }
        v2.p pVar2 = pVar;
        String str = a0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j9 = a0Var.f33339h;
        if ((j9 & 1095216660480L) == 0) {
            j9 = b0.f33347b;
        }
        long j10 = j9;
        c3.a aVar = a0Var.f33340i;
        float f10 = aVar != null ? aVar.f2702a : 0.0f;
        c3.a aVar2 = new c3.a(Float.isNaN(f10) ? 0.0f : f10);
        c3.p pVar3 = a0Var.j;
        if (pVar3 == null) {
            pVar3 = c3.p.f2728c;
        }
        c3.p pVar4 = pVar3;
        y2.c cVarB = a0Var.f33341k;
        if (cVarB == null) {
            y2.c cVar = y2.c.f37319c;
            cVarB = y2.e.f37322a.b();
        }
        y2.c cVar2 = cVarB;
        long j11 = a0Var.f33342l;
        if (j11 == 16) {
            j11 = b0.f33348c;
        }
        long j12 = j11;
        c3.l lVar2 = a0Var.f33343m;
        if (lVar2 == null) {
            lVar2 = c3.l.f2723b;
        }
        c3.l lVar3 = lVar2;
        p1.i0 i0Var = a0Var.f33344n;
        if (i0Var == null) {
            i0Var = p1.i0.f30982d;
        }
        p1.i0 i0Var2 = i0Var;
        r1.c cVar3 = a0Var.f33345o;
        if (cVar3 == null) {
            cVar3 = r1.f.f32723b;
        }
        a0 a0Var2 = new a0(oVarC, j8, kVar2, iVar2, jVar2, pVar2, str2, j10, aVar2, pVar4, cVar2, j12, lVar3, i0Var2, cVar3);
        p pVar5 = h0Var.f33392b;
        int i4 = q.f33420b;
        int i10 = pVar5.f33411a;
        int i11 = 5;
        int i12 = i10 == 0 ? 5 : i10;
        int i13 = pVar5.f33412b;
        if (i13 == 3) {
            int iOrdinal = lVar.ordinal();
            if (iOrdinal == 0) {
                i11 = 4;
            } else if (iOrdinal != 1) {
                throw new ac.m();
            }
        } else if (i13 == 0) {
            int iOrdinal2 = lVar.ordinal();
            if (iOrdinal2 == 0) {
                i11 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new ac.m();
                }
                i11 = 2;
            }
        } else {
            i11 = i13;
        }
        long j13 = pVar5.f33413c;
        if ((j13 & 1095216660480L) == 0) {
            j13 = q.f33419a;
        }
        long j14 = j13;
        c3.q qVar = pVar5.f33414d;
        if (qVar == null) {
            qVar = c3.q.f2731c;
        }
        c3.q qVar2 = qVar;
        r rVar = pVar5.f33415e;
        c3.i iVar3 = pVar5.f33416f;
        int i14 = pVar5.g;
        if (i14 == 0) {
            i14 = c3.e.f2707b;
        }
        int i15 = i14;
        int i16 = pVar5.f33417h;
        int i17 = i16 == 0 ? 1 : i16;
        c3.s sVar = pVar5.f33418i;
        if (sVar == null) {
            sVar = c3.s.f2735c;
        }
        return new h0(a0Var2, new p(i12, i11, j14, qVar2, rVar, iVar3, i15, i17, sVar), h0Var.f33393c);
    }
}
