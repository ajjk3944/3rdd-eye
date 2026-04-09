package s2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33424a;

    public /* synthetic */ t(int i4) {
        this.f33424a = i4;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        int i4;
        int i10;
        int i11;
        int i12;
        long j;
        c3.s sVar;
        int i13 = 0;
        switch (this.f33424a) {
            case 0:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Integer num = obj2 != null ? (Integer) obj2 : null;
                nk.k.b(num);
                int iIntValue = num.intValue();
                Object obj3 = list.get(1);
                Integer num2 = obj3 != null ? (Integer) obj3 : null;
                nk.k.b(num2);
                return new g0(z.b(iIntValue, num2.intValue()));
            case 1:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int i14 = p1.s.f31019i;
                Boolean bool = Boolean.FALSE;
                nk.k.a(obj4, bool);
                p1.s sVar2 = obj4 != null ? nk.k.a(obj4, Boolean.FALSE) ? new p1.s(p1.s.f31018h) : new p1.s(p1.z.b(((Integer) obj4).intValue())) : null;
                nk.k.b(sVar2);
                long j8 = sVar2.f31020a;
                Object obj5 = list2.get(1);
                x xVar = y.f33451x;
                nk.k.a(obj5, bool);
                o1.b bVar = obj5 != null ? (o1.b) xVar.f33429b.invoke(obj5) : null;
                nk.k.b(bVar);
                long j9 = bVar.f30364a;
                Object obj6 = list2.get(2);
                Float f10 = obj6 != null ? (Float) obj6 : null;
                nk.k.b(f10);
                return new p1.i0(j8, j9, f10.floatValue());
            case 2:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.k(((Integer) obj).intValue());
            case 3:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj7 = list3.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                nk.k.b(str);
                Object obj8 = list3.get(1);
                return new j(str, (nk.k.a(obj8, Boolean.FALSE) || obj8 == null) ? null : (f0) ((mk.c) y.f33437i.f37517c).invoke(obj8));
            case 4:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.m(((Integer) obj).intValue());
            case 5:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.d(((Integer) obj).intValue());
            case 6:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                ArrayList arrayList = new ArrayList(list4.size());
                int size = list4.size();
                while (i13 < size) {
                    Object obj9 = list4.get(i13);
                    c cVar = (nk.k.a(obj9, Boolean.FALSE) || obj9 == null) ? null : (c) ((mk.c) y.f33431b.f37517c).invoke(obj9);
                    nk.k.b(cVar);
                    arrayList.add(cVar);
                    i13++;
                }
                return arrayList;
            case 7:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new v2.i(((Integer) obj).intValue());
            case 8:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new v2.j(((Integer) obj).intValue());
            case 9:
                Boolean bool2 = Boolean.FALSE;
                if (nk.k.a(obj, bool2)) {
                    return new d3.n(d3.n.f21971c);
                }
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f11 = obj10 != null ? (Float) obj10 : null;
                nk.k.b(f11);
                float fFloatValue = f11.floatValue();
                Object obj11 = list5.get(1);
                x xVar2 = y.f33450w;
                nk.k.a(obj11, bool2);
                d3.o oVar = obj11 != null ? (d3.o) xVar2.f33429b.invoke(obj11) : null;
                nk.k.b(oVar);
                return new d3.n(nh.a.p(oVar.f21973a, fFloatValue));
            case 10:
                return nk.k.a(obj, 0) ? new d3.o(8589934592L) : nk.k.a(obj, 1) ? new d3.o(4294967296L) : new d3.o(0L);
            case 11:
                if (nk.k.a(obj, Boolean.FALSE)) {
                    return new o1.b(9205357640488583168L);
                }
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                Float f12 = obj12 != null ? (Float) obj12 : null;
                nk.k.b(f12);
                float fFloatValue2 = f12.floatValue();
                Object obj13 = list6.get(1);
                nk.k.b(obj13 != null ? (Float) obj13 : null);
                return new o1.b((Float.floatToRawIntBits(fFloatValue2) << 32) | (Float.floatToRawIntBits(r14.floatValue()) & 4294967295L));
            case 12:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list7.size());
                int size2 = list7.size();
                while (i13 < size2) {
                    Object obj14 = list7.get(i13);
                    y2.b bVar2 = (nk.k.a(obj14, Boolean.FALSE) || obj14 == null) ? null : (y2.b) ((mk.c) y.f33453z.f37517c).invoke(obj14);
                    nk.k.b(bVar2);
                    arrayList2.add(bVar2);
                    i13++;
                }
                return new y2.c(arrayList2);
            case 13:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.String");
                return new y2.b(y2.e.f37322a.h((String) obj));
            case 14:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                nk.k.b(str2);
                Object obj16 = list8.get(1);
                return new i(str2, (nk.k.a(obj16, Boolean.FALSE) || obj16 == null) ? null : (f0) ((mk.c) y.f33437i.f37517c).invoke(obj16));
            case 15:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                float f13 = c3.f.f2709b;
                x xVar3 = y.B;
                Boolean bool3 = Boolean.FALSE;
                nk.k.a(obj17, bool3);
                c3.f fVar = obj17 != null ? (c3.f) xVar3.f33429b.invoke(obj17) : null;
                nk.k.b(fVar);
                float f14 = fVar.f2712a;
                Object obj18 = list9.get(1);
                x xVar4 = y.C;
                nk.k.a(obj18, bool3);
                c3.h hVar = obj18 != null ? (c3.h) xVar4.f33429b.invoke(obj18) : null;
                nk.k.b(hVar);
                int i15 = hVar.f2714a;
                Object obj19 = list9.get(2);
                x xVar5 = y.D;
                nk.k.a(obj19, bool3);
                c3.g gVar = obj19 != null ? (c3.g) xVar5.f33429b.invoke(obj19) : null;
                nk.k.b(gVar);
                return new c3.i(f14, i15, gVar.f2713a);
            case 16:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) obj).floatValue();
                c3.f.a(fFloatValue3);
                return new c3.f(fFloatValue3);
            case 17:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.h(((Integer) obj).intValue());
            case 18:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj20 = list10.get(0);
                g gVar2 = obj20 != null ? (g) obj20 : null;
                nk.k.b(gVar2);
                Object obj21 = list10.get(2);
                Integer num3 = obj21 != null ? (Integer) obj21 : null;
                nk.k.b(num3);
                int iIntValue2 = num3.intValue();
                Object obj22 = list10.get(3);
                Integer num4 = obj22 != null ? (Integer) obj22 : null;
                nk.k.b(num4);
                int iIntValue3 = num4.intValue();
                Object obj23 = list10.get(4);
                String str3 = obj23 != null ? (String) obj23 : null;
                nk.k.b(str3);
                switch (gVar2.ordinal()) {
                    case 0:
                        Object obj24 = list10.get(1);
                        p pVar = (nk.k.a(obj24, Boolean.FALSE) || obj24 == null) ? null : (p) ((mk.c) y.g.f37517c).invoke(obj24);
                        nk.k.b(pVar);
                        return new c(str3, iIntValue2, iIntValue3, pVar);
                    case 1:
                        Object obj25 = list10.get(1);
                        a0 a0Var = (nk.k.a(obj25, Boolean.FALSE) || obj25 == null) ? null : (a0) ((mk.c) y.f33436h.f37517c).invoke(obj25);
                        nk.k.b(a0Var);
                        return new c(str3, iIntValue2, iIntValue3, a0Var);
                    case 2:
                        Object obj26 = list10.get(1);
                        j0 j0Var = (nk.k.a(obj26, Boolean.FALSE) || obj26 == null) ? null : (j0) ((mk.c) y.f33432c.f37517c).invoke(obj26);
                        nk.k.b(j0Var);
                        return new c(str3, iIntValue2, iIntValue3, j0Var);
                    case 3:
                        Object obj27 = list10.get(1);
                        i0 i0Var = (nk.k.a(obj27, Boolean.FALSE) || obj27 == null) ? null : (i0) ((mk.c) y.f33433d.f37517c).invoke(obj27);
                        nk.k.b(i0Var);
                        return new c(str3, iIntValue2, iIntValue3, i0Var);
                    case 4:
                        Object obj28 = list10.get(1);
                        j jVar = (nk.k.a(obj28, Boolean.FALSE) || obj28 == null) ? null : (j) ((mk.c) y.f33434e.f37517c).invoke(obj28);
                        nk.k.b(jVar);
                        return new c(str3, iIntValue2, iIntValue3, jVar);
                    case 5:
                        Object obj29 = list10.get(1);
                        i iVar = (nk.k.a(obj29, Boolean.FALSE) || obj29 == null) ? null : (i) ((mk.c) y.f33435f.f37517c).invoke(obj29);
                        nk.k.b(iVar);
                        return new c(str3, iIntValue2, iIntValue3, iVar);
                    case 6:
                        Object obj30 = list10.get(1);
                        String str4 = obj30 != null ? (String) obj30 : null;
                        nk.k.b(str4);
                        return new c(str3, iIntValue2, iIntValue3, new c0(str4));
                    default:
                        throw new ac.m();
                }
            case 19:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.g(((Integer) obj).intValue());
            case 20:
                String str5 = obj != null ? (String) obj : null;
                nk.k.b(str5);
                return new j0(str5);
            case 21:
                String str6 = obj != null ? (String) obj : null;
                nk.k.b(str6);
                return new i0(str6);
            case 22:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj31 = list11.get(0);
                x xVar6 = y.f33444q;
                Boolean bool4 = Boolean.FALSE;
                nk.k.a(obj31, bool4);
                c3.k kVar = obj31 != null ? (c3.k) xVar6.f33429b.invoke(obj31) : null;
                nk.k.b(kVar);
                int i16 = kVar.f2722a;
                Object obj32 = list11.get(1);
                x xVar7 = y.f33445r;
                nk.k.a(obj32, bool4);
                c3.m mVar = obj32 != null ? (c3.m) xVar7.f33429b.invoke(obj32) : null;
                nk.k.b(mVar);
                int i17 = mVar.f2726a;
                Object obj33 = list11.get(2);
                d3.o[] oVarArr = d3.n.f21970b;
                x xVar8 = y.f33449v;
                nk.k.a(obj33, bool4);
                d3.n nVar = obj33 != null ? (d3.n) xVar8.f33429b.invoke(obj33) : null;
                nk.k.b(nVar);
                long j10 = nVar.f21972a;
                Object obj34 = list11.get(3);
                c3.q qVar = c3.q.f2731c;
                c3.q qVar2 = (nk.k.a(obj34, bool4) || obj34 == null) ? null : (c3.q) ((mk.c) y.f33439l.f37517c).invoke(obj34);
                Object obj35 = list11.get(4);
                r rVar = (nk.k.a(obj35, bool4) || obj35 == null) ? null : (r) ((mk.c) z.f33454a.f37517c).invoke(obj35);
                Object obj36 = list11.get(5);
                c3.i iVar2 = c3.i.f2715d;
                c3.i iVar3 = (nk.k.a(obj36, bool4) || obj36 == null) ? null : (c3.i) ((mk.c) y.A.f37517c).invoke(obj36);
                Object obj37 = list11.get(6);
                c3.e eVar = (nk.k.a(obj37, bool4) || obj37 == null) ? null : (c3.e) ((mk.c) z.f33456c.f37517c).invoke(obj37);
                nk.k.b(eVar);
                int i18 = eVar.f2708a;
                Object obj38 = list11.get(7);
                x xVar9 = y.f33446s;
                nk.k.a(obj38, bool4);
                c3.d dVar = obj38 != null ? (c3.d) xVar9.f33429b.invoke(obj38) : null;
                nk.k.b(dVar);
                int i19 = dVar.f2706a;
                Object obj39 = list11.get(8);
                boolean zA = nk.k.a(obj39, bool4);
                yb.i iVar4 = z.f33457d;
                if (zA || obj39 == null) {
                    i4 = i16;
                    i10 = i19;
                    i11 = i18;
                    i12 = i17;
                    j = j10;
                    sVar = null;
                } else {
                    i4 = i16;
                    i10 = i19;
                    i11 = i18;
                    i12 = i17;
                    j = j10;
                    sVar = (c3.s) ((mk.c) iVar4.f37517c).invoke(obj39);
                }
                return new p(i4, i12, j, qVar2, rVar, iVar3, i11, i10, sVar);
            case 23:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj40 = list12.get(0);
                int i20 = p1.s.f31019i;
                Boolean bool5 = Boolean.FALSE;
                nk.k.a(obj40, bool5);
                p1.s sVar3 = obj40 != null ? obj40.equals(bool5) ? new p1.s(p1.s.f31018h) : new p1.s(p1.z.b(((Integer) obj40).intValue())) : null;
                nk.k.b(sVar3);
                long j11 = sVar3.f31020a;
                Object obj41 = list12.get(1);
                d3.o[] oVarArr2 = d3.n.f21970b;
                mk.c cVar2 = y.f33449v.f33429b;
                nk.k.a(obj41, bool5);
                d3.n nVar2 = obj41 != null ? (d3.n) cVar2.invoke(obj41) : null;
                nk.k.b(nVar2);
                long j12 = nVar2.f21972a;
                Object obj42 = list12.get(2);
                v2.k kVar2 = v2.k.f35776b;
                v2.k kVar3 = (nk.k.a(obj42, bool5) || obj42 == null) ? null : (v2.k) ((mk.c) y.f33440m.f37517c).invoke(obj42);
                Object obj43 = list12.get(3);
                v2.i iVar5 = (nk.k.a(obj43, bool5) || obj43 == null) ? null : (v2.i) ((mk.c) y.f33447t.f37517c).invoke(obj43);
                Object obj44 = list12.get(4);
                v2.j jVar2 = (nk.k.a(obj44, bool5) || obj44 == null) ? null : (v2.j) ((mk.c) y.f33448u.f37517c).invoke(obj44);
                Object obj45 = list12.get(6);
                String str7 = obj45 != null ? (String) obj45 : null;
                Object obj46 = list12.get(7);
                nk.k.a(obj46, bool5);
                d3.n nVar3 = obj46 != null ? (d3.n) cVar2.invoke(obj46) : null;
                nk.k.b(nVar3);
                long j13 = nVar3.f21972a;
                Object obj47 = list12.get(8);
                c3.a aVar = (nk.k.a(obj47, bool5) || obj47 == null) ? null : (c3.a) ((mk.c) y.f33441n.f37517c).invoke(obj47);
                Object obj48 = list12.get(9);
                c3.p pVar2 = (nk.k.a(obj48, bool5) || obj48 == null) ? null : (c3.p) ((mk.c) y.f33438k.f37517c).invoke(obj48);
                Object obj49 = list12.get(10);
                y2.c cVar3 = y2.c.f37319c;
                y2.c cVar4 = (nk.k.a(obj49, bool5) || obj49 == null) ? null : (y2.c) ((mk.c) y.f33452y.f37517c).invoke(obj49);
                Object obj50 = list12.get(11);
                nk.k.a(obj50, bool5);
                p1.s sVar4 = obj50 != null ? obj50.equals(bool5) ? new p1.s(p1.s.f31018h) : new p1.s(p1.z.b(((Integer) obj50).intValue())) : null;
                nk.k.b(sVar4);
                long j14 = sVar4.f31020a;
                Object obj51 = list12.get(12);
                c3.l lVar = (nk.k.a(obj51, bool5) || obj51 == null) ? null : (c3.l) ((mk.c) y.j.f37517c).invoke(obj51);
                Object obj52 = list12.get(13);
                p1.i0 i0Var2 = p1.i0.f30982d;
                return new a0(j11, j12, kVar3, iVar5, jVar2, (v2.p) null, str7, j13, aVar, pVar2, cVar4, j14, lVar, (nk.k.a(obj52, bool5) || obj52 == null) ? null : (p1.i0) ((mk.c) y.f33442o.f37517c).invoke(obj52), 49184);
            case 24:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                Boolean bool6 = obj53 != null ? (Boolean) obj53 : null;
                nk.k.b(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj54 = list13.get(1);
                h hVar2 = (nk.k.a(obj54, Boolean.FALSE) || obj54 == null) ? null : (h) ((mk.c) z.f33455b.f37517c).invoke(obj54);
                nk.k.b(hVar2);
                return new r(hVar2.f33389a, zBooleanValue);
            case 25:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new h(((Integer) obj).intValue());
            case 26:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.e(((Integer) obj).intValue());
            case 27:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj55 = list14.get(0);
                c3.r rVar2 = (nk.k.a(obj55, Boolean.FALSE) || obj55 == null) ? null : (c3.r) ((mk.c) z.f33458e.f37517c).invoke(obj55);
                nk.k.b(rVar2);
                int i21 = rVar2.f2734a;
                Object obj56 = list14.get(1);
                Boolean bool7 = obj56 != null ? (Boolean) obj56 : null;
                nk.k.b(bool7);
                return new c3.s(i21, bool7.booleanValue());
            case 28:
                nk.k.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new c3.r(((Integer) obj).intValue());
            default:
                sl.c cVar5 = (sl.c) obj;
                nk.k.e(cVar5, "it");
                cm.g gVar3 = cVar5.g;
                if (gVar3 instanceof sl.c) {
                    return (sl.c) gVar3;
                }
                return null;
        }
    }
}
