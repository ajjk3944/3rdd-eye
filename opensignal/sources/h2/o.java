package h2;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import lf.t1;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9858a;

    public /* synthetic */ o(int i10) {
        this.f9858a = i10;
    }

    @Override // ar.k
    public final Object a(Object obj) throws ba.l {
        int i10 = this.f9858a;
        int i11 = 5;
        int i12 = 9;
        int i13 = 22;
        int i14 = 21;
        int i15 = 20;
        int i16 = 19;
        int i17 = 18;
        int i18 = 6;
        lq.b0 b0Var = lq.b0.f15562a;
        c0 c0Var = null;
        h0Var = null;
        g1.h0 h0Var = null;
        sVar = null;
        r2.s sVar = null;
        h0Var = null;
        h0 h0Var2 = null;
        jVar = null;
        j jVar = null;
        kVar = null;
        k kVar = null;
        l0Var = null;
        l0 l0Var = null;
        m0Var = null;
        m0 m0Var = null;
        c0Var = null;
        c0 c0Var2 = null;
        sVar = null;
        s sVar2 = null;
        h0Var = null;
        h0 h0Var3 = null;
        c0Var = null;
        int i19 = 1;
        switch (i10) {
            case 0:
                p pVar = (p) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(pVar.f9860b);
                sb2.append(", ");
                return c7.a.q(sb2, pVar.f9861c, ')');
            case 1:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                ar.k kVar2 = (ar.k) a0.f9766h.f20680g;
                Boolean bool = Boolean.FALSE;
                c0 c0Var3 = (br.l.a(obj2, bool) || obj2 == null) ? null : (c0) kVar2.a(obj2);
                Object obj3 = list.get(1);
                c0 c0Var4 = (br.l.a(obj3, bool) || obj3 == null) ? null : (c0) kVar2.a(obj3);
                Object obj4 = list.get(2);
                c0 c0Var5 = (br.l.a(obj4, bool) || obj4 == null) ? null : (c0) kVar2.a(obj4);
                Object obj5 = list.get(3);
                if (!br.l.a(obj5, bool) && obj5 != null) {
                    c0Var = (c0) kVar2.a(obj5);
                }
                return new h0(c0Var3, c0Var4, c0Var5, c0Var);
            case 2:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (br.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((ar.k) a0.f9759a.f20680g).a(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                br.l.b(str);
                return new f(list3, str);
            case 3:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r2.l(((Integer) obj).intValue());
            case 4:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new r2.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                t2.l[] lVarArr = t2.k.f22393b;
                ar.k kVar3 = a0.f9773q.f9885d;
                Boolean bool2 = Boolean.FALSE;
                br.l.a(obj8, bool2);
                t2.k kVar4 = obj8 != null ? (t2.k) kVar3.a(obj8) : null;
                br.l.b(kVar4);
                long j = kVar4.f22395a;
                Object obj9 = list5.get(1);
                br.l.a(obj9, bool2);
                t2.k kVar5 = obj9 != null ? (t2.k) kVar3.a(obj9) : null;
                br.l.b(kVar5);
                return new r2.q(j, kVar5.f22395a);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k2.r(((Integer) obj).intValue());
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new r2.a(((Float) obj).floatValue());
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                br.l.b(num);
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                br.l.b(num2);
                return new i0(b0.b(iIntValue, num2.intValue()));
            case 9:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i20 = g1.r.f9270h;
                Boolean bool3 = Boolean.FALSE;
                br.l.a(obj12, bool3);
                g1.r rVar = obj12 != null ? br.l.a(obj12, Boolean.FALSE) ? new g1.r(g1.r.f9269g) : new g1.r(g1.f0.b(((Integer) obj12).intValue())) : null;
                br.l.b(rVar);
                long j7 = rVar.f9271a;
                Object obj13 = list7.get(1);
                y yVar = a0.f9774r;
                br.l.a(obj13, bool3);
                f1.b bVar = obj13 != null ? (f1.b) yVar.f9885d.a(obj13) : null;
                br.l.b(bVar);
                long j10 = bVar.f8402a;
                Object obj14 = list7.get(2);
                Float f10 = obj14 != null ? (Float) obj14 : null;
                br.l.b(f10);
                return new g1.h0(j7, j10, f10.floatValue());
            case 10:
                if (br.l.a(obj, Boolean.FALSE)) {
                    return new t2.k(t2.k.f22394c);
                }
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f11 = obj15 != null ? (Float) obj15 : null;
                br.l.b(f11);
                float fFloatValue = f11.floatValue();
                Object obj16 = list8.get(1);
                t2.l lVar = obj16 != null ? (t2.l) obj16 : null;
                br.l.b(lVar);
                return new t2.k(t1.B(lVar.f22396a, fFloatValue));
            case 11:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                br.l.b(str2);
                Object obj18 = list9.get(1);
                q3.a aVar = a0.f9767i;
                if (!br.l.a(obj18, Boolean.FALSE) && obj18 != null) {
                    h0Var3 = (h0) ((ar.k) aVar.f20680g).a(obj18);
                }
                return new k(str2, h0Var3);
            case 12:
                if (br.l.a(obj, Boolean.FALSE)) {
                    return new f1.b(9205357640488583168L);
                }
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f12 = obj19 != null ? (Float) obj19 : null;
                br.l.b(f12);
                float fFloatValue2 = f12.floatValue();
                Object obj20 = list10.get(1);
                br.l.b(obj20 != null ? (Float) obj20 : null);
                return new f1.b((Float.floatToRawIntBits(fFloatValue2) << 32) | (Float.floatToRawIntBits(r17.floatValue()) & 4294967295L));
            case 13:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                for (int i21 = 0; i21 < size; i21++) {
                    Object obj21 = list11.get(i21);
                    n2.a aVar2 = (br.l.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (n2.a) ((ar.k) a0.f9776t.f20680g).a(obj21);
                    br.l.b(aVar2);
                    arrayList.add(aVar2);
                }
                return new n2.b(arrayList);
            case 14:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                for (int i22 = 0; i22 < size2; i22++) {
                    Object obj22 = list12.get(i22);
                    d dVar = (br.l.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (d) ((ar.k) a0.f9760b.f20680g).a(obj22);
                    br.l.b(dVar);
                    arrayList2.add(dVar);
                }
                return arrayList2;
            case 15:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                n2.c.f17381a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (br.l.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    io.sentry.android.core.e0.d("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new n2.a(localeForLanguageTag);
            case 16:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                r2.f fVar = obj23 != null ? (r2.f) obj23 : null;
                br.l.b(fVar);
                float f13 = fVar.f21202a;
                Object obj24 = list13.get(1);
                r2.h hVar = obj24 != null ? (r2.h) obj24 : null;
                br.l.b(hVar);
                int i23 = hVar.f21203a;
                Object obj25 = list13.get(2);
                br.l.b(obj25 != null ? (r2.g) obj25 : null);
                return new r2.i(i23, f13);
            case 17:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                h hVar2 = obj26 != null ? (h) obj26 : null;
                br.l.b(hVar2);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                br.l.b(num3);
                int iIntValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                br.l.b(num4);
                int iIntValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str4 = obj29 != null ? (String) obj29 : null;
                br.l.b(str4);
                switch (z.f9886a[hVar2.ordinal()]) {
                    case 1:
                        Object obj30 = list14.get(1);
                        q3.a aVar3 = a0.f9765g;
                        if (!br.l.a(obj30, Boolean.FALSE) && obj30 != null) {
                            sVar2 = (s) ((ar.k) aVar3.f20680g).a(obj30);
                        }
                        s sVar3 = sVar2;
                        br.l.b(sVar3);
                        return new d(sVar3, iIntValue2, iIntValue3, str4);
                    case 2:
                        Object obj31 = list14.get(1);
                        q3.a aVar4 = a0.f9766h;
                        if (!br.l.a(obj31, Boolean.FALSE) && obj31 != null) {
                            c0Var2 = (c0) ((ar.k) aVar4.f20680g).a(obj31);
                        }
                        c0 c0Var6 = c0Var2;
                        br.l.b(c0Var6);
                        return new d(c0Var6, iIntValue2, iIntValue3, str4);
                    case 3:
                        Object obj32 = list14.get(1);
                        q3.a aVar5 = a0.f9761c;
                        if (!br.l.a(obj32, Boolean.FALSE) && obj32 != null) {
                            m0Var = (m0) ((ar.k) aVar5.f20680g).a(obj32);
                        }
                        m0 m0Var2 = m0Var;
                        br.l.b(m0Var2);
                        return new d(m0Var2, iIntValue2, iIntValue3, str4);
                    case 4:
                        Object obj33 = list14.get(1);
                        q3.a aVar6 = a0.f9762d;
                        if (!br.l.a(obj33, Boolean.FALSE) && obj33 != null) {
                            l0Var = (l0) ((ar.k) aVar6.f20680g).a(obj33);
                        }
                        l0 l0Var2 = l0Var;
                        br.l.b(l0Var2);
                        return new d(l0Var2, iIntValue2, iIntValue3, str4);
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        Object obj34 = list14.get(1);
                        q3.a aVar7 = a0.f9763e;
                        if (!br.l.a(obj34, Boolean.FALSE) && obj34 != null) {
                            kVar = (k) ((ar.k) aVar7.f20680g).a(obj34);
                        }
                        k kVar6 = kVar;
                        br.l.b(kVar6);
                        return new d(kVar6, iIntValue2, iIntValue3, str4);
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj35 = list14.get(1);
                        q3.a aVar8 = a0.f9764f;
                        if (!br.l.a(obj35, Boolean.FALSE) && obj35 != null) {
                            jVar = (j) ((ar.k) aVar8.f20680g).a(obj35);
                        }
                        j jVar2 = jVar;
                        br.l.b(jVar2);
                        return new d(jVar2, iIntValue2, iIntValue3, str4);
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        Object obj36 = list14.get(1);
                        String str5 = obj36 != null ? (String) obj36 : null;
                        br.l.b(str5);
                        return new d(new e0(str5), iIntValue2, iIntValue3, str4);
                    default:
                        throw new bf.n();
                }
            case 18:
                String str6 = obj != null ? (String) obj : null;
                br.l.b(str6);
                return new m0(str6);
            case 19:
                String str7 = obj != null ? (String) obj : null;
                br.l.b(str7);
                return new l0(str7);
            case 20:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str8 = obj37 != null ? (String) obj37 : null;
                br.l.b(str8);
                Object obj38 = list15.get(1);
                q3.a aVar9 = a0.f9767i;
                if (!br.l.a(obj38, Boolean.FALSE) && obj38 != null) {
                    h0Var2 = (h0) ((ar.k) aVar9.f20680g).a(obj38);
                }
                return new j(str8, h0Var2);
            case 21:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                r2.k kVar7 = obj39 != null ? (r2.k) obj39 : null;
                br.l.b(kVar7);
                int i24 = kVar7.f21207a;
                Object obj40 = list16.get(1);
                r2.m mVar = obj40 != null ? (r2.m) obj40 : null;
                br.l.b(mVar);
                int i25 = mVar.f21211a;
                Object obj41 = list16.get(2);
                t2.l[] lVarArr2 = t2.k.f22393b;
                y yVar2 = a0.f9773q;
                Boolean bool4 = Boolean.FALSE;
                br.l.a(obj41, bool4);
                t2.k kVar8 = obj41 != null ? (t2.k) yVar2.f9885d.a(obj41) : null;
                br.l.b(kVar8);
                long j11 = kVar8.f22395a;
                Object obj42 = list16.get(3);
                r2.q qVar = r2.q.f21216c;
                r2.q qVar2 = (br.l.a(obj42, bool4) || obj42 == null) ? null : (r2.q) ((ar.k) a0.f9768l.f20680g).a(obj42);
                Object obj43 = list16.get(4);
                u uVar = (br.l.a(obj43, bool4) || obj43 == null) ? null : (u) ((ar.k) b0.f9784a.f20680g).a(obj43);
                Object obj44 = list16.get(5);
                r2.i iVar = r2.i.f21204c;
                r2.i iVar2 = (br.l.a(obj44, bool4) || obj44 == null) ? null : (r2.i) ((ar.k) a0.f9777u.f20680g).a(obj44);
                Object obj45 = list16.get(6);
                r2.e eVar = (br.l.a(obj45, bool4) || obj45 == null) ? null : (r2.e) ((ar.k) b0.f9785b.f20680g).a(obj45);
                br.l.b(eVar);
                int i26 = eVar.f21198a;
                Object obj46 = list16.get(7);
                r2.d dVar2 = obj46 != null ? (r2.d) obj46 : null;
                br.l.b(dVar2);
                int i27 = dVar2.f21196a;
                Object obj47 = list16.get(8);
                boolean zA = br.l.a(obj47, bool4);
                q3.a aVar10 = b0.f9786c;
                if (!zA && obj47 != null) {
                    sVar = (r2.s) ((ar.k) aVar10.f20680g).a(obj47);
                }
                return new s(i24, i25, j11, qVar2, uVar, iVar2, i26, i27, sVar);
            case 22:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i28 = g1.r.f9270h;
                Boolean bool5 = Boolean.FALSE;
                br.l.a(obj48, bool5);
                g1.r rVar2 = obj48 != null ? obj48.equals(bool5) ? new g1.r(g1.r.f9269g) : new g1.r(g1.f0.b(((Integer) obj48).intValue())) : null;
                br.l.b(rVar2);
                long j12 = rVar2.f9271a;
                Object obj49 = list17.get(1);
                t2.l[] lVarArr3 = t2.k.f22393b;
                ar.k kVar9 = a0.f9773q.f9885d;
                br.l.a(obj49, bool5);
                t2.k kVar10 = obj49 != null ? (t2.k) kVar9.a(obj49) : null;
                br.l.b(kVar10);
                long j13 = kVar10.f22395a;
                Object obj50 = list17.get(2);
                k2.r rVar3 = k2.r.f13999d;
                k2.r rVar4 = (br.l.a(obj50, bool5) || obj50 == null) ? null : (k2.r) ((ar.k) a0.f9769m.f20680g).a(obj50);
                Object obj51 = list17.get(3);
                k2.n nVar = obj51 != null ? (k2.n) obj51 : null;
                Object obj52 = list17.get(4);
                k2.o oVar = obj52 != null ? (k2.o) obj52 : null;
                Object obj53 = list17.get(6);
                String str9 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                br.l.a(obj54, bool5);
                t2.k kVar11 = obj54 != null ? (t2.k) kVar9.a(obj54) : null;
                br.l.b(kVar11);
                long j14 = kVar11.f22395a;
                Object obj55 = list17.get(8);
                r2.a aVar11 = (br.l.a(obj55, bool5) || obj55 == null) ? null : (r2.a) ((ar.k) a0.f9770n.f20680g).a(obj55);
                Object obj56 = list17.get(9);
                r2.p pVar2 = (br.l.a(obj56, bool5) || obj56 == null) ? null : (r2.p) ((ar.k) a0.k.f20680g).a(obj56);
                Object obj57 = list17.get(10);
                n2.b bVar2 = n2.b.f17378g;
                n2.b bVar3 = (br.l.a(obj57, bool5) || obj57 == null) ? null : (n2.b) ((ar.k) a0.f9775s.f20680g).a(obj57);
                Object obj58 = list17.get(11);
                br.l.a(obj58, bool5);
                g1.r rVar5 = obj58 != null ? obj58.equals(bool5) ? new g1.r(g1.r.f9269g) : new g1.r(g1.f0.b(((Integer) obj58).intValue())) : null;
                br.l.b(rVar5);
                long j15 = rVar5.f9271a;
                Object obj59 = list17.get(12);
                r2.l lVar2 = (br.l.a(obj59, bool5) || obj59 == null) ? null : (r2.l) ((ar.k) a0.j.f20680g).a(obj59);
                Object obj60 = list17.get(13);
                g1.h0 h0Var4 = g1.h0.f9234d;
                q3.a aVar12 = a0.f9771o;
                if (!br.l.a(obj60, bool5) && obj60 != null) {
                    h0Var = (g1.h0) ((ar.k) aVar12.f20680g).a(obj60);
                }
                return new c0(j12, j13, rVar4, nVar, oVar, (k2.h) null, str9, j14, aVar11, pVar2, bVar3, j15, lVar2, h0Var, 49184);
            case 23:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                br.l.b(bool6);
                boolean zBooleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                br.l.b(obj62 != null ? (i) obj62 : null);
                return new u(zBooleanValue);
            case 24:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r2.e(((Integer) obj).intValue());
            case 25:
                br.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                r2.r rVar6 = obj63 != null ? (r2.r) obj63 : null;
                br.l.b(rVar6);
                int i29 = rVar6.f21219a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                br.l.b(bool7);
                return new r2.s(i29, bool7.booleanValue());
            case 26:
                qv.a aVar13 = (qv.a) obj;
                br.l.e(aVar13, "$this$module");
                il.a aVar14 = new il.a(i12);
                mv.d dVarA = aVar13.a();
                sv.a aVar15 = aVar13.f21092a;
                mv.c cVar = mv.c.Single;
                br.y yVar3 = br.x.f2918a;
                mv.b bVar4 = new mv.b(aVar15, yVar3.b(gl.a.class), null, aVar14, cVar, dVarA);
                HashSet hashSet = aVar13.f21095d;
                i4.c(hashSet, bVar4);
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(ch.f.class), null, new il.a(i19), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(com.staircase3.opensignal.utils.a.class), null, new il.a(i11), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(qm.f.class), null, new il.a(i18), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(com.staircase3.opensignal.utils.r.class), null, new il.a(7), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(SharedPreferences.class), new sv.a("OPENSIGNAL_PREFERENCES"), new il.a(8), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(SharedPreferences.class), new sv.a("DEFAULT_PREFERENCES"), new il.a(10), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(SharedPreferences.class), new sv.a("PREFERENCE_MANAGER_DEFAULT"), new il.a(11), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(ActivityManager.class), null, new il.a(12), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(SensorManager.class), null, new il.a(13), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(com.squareup.picasso.f0.class), null, new il.a(14), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(com.staircase3.opensignal.utils.o.class), null, new il.a(15), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(qm.e.class), null, new il.a(16), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(qm.g.class), null, new il.a(17), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(com.staircase3.opensignal.utils.k.class), null, new il.a(i17), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(fl.c.class), null, new il.a(i16), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(kn.d.class), null, new il.a(i15), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(ll.a.class), null, new il.a(i14), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(ll.c.class), null, new au.r(29), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(tm.e.class), null, new il.a(0), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(bl.a.class), null, new il.a(2), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(el.b.class), null, new il.a(3), cVar, aVar13.a()));
                i4.c(hashSet, new mv.b(aVar13.f21092a, yVar3.b(el.c.class), null, new il.a(4), cVar, aVar13.a()));
                return b0Var;
            case 27:
                qv.a aVar16 = (qv.a) obj;
                br.l.e(aVar16, "$this$module");
                il.a aVar17 = new il.a(i13);
                mv.d dVarA2 = aVar16.a();
                sv.a aVar18 = aVar16.f21092a;
                mv.c cVar2 = mv.c.Single;
                br.y yVar4 = br.x.f2918a;
                mv.b bVar5 = new mv.b(aVar18, yVar4.b(cm.a.class), null, aVar17, cVar2, dVarA2);
                HashSet hashSet2 = aVar16.f21095d;
                i4.c(hashSet2, bVar5);
                i4.c(hashSet2, new mv.b(aVar16.f21092a, yVar4.b(jn.c.class), null, new il.a(23), cVar2, aVar16.a()));
                i4.c(hashSet2, new mv.b(aVar16.f21092a, yVar4.b(jn.b.class), null, new il.a(24), cVar2, aVar16.a()));
                return b0Var;
            case 28:
                throw w.g.c(obj);
            default:
                iu.a aVar19 = (iu.a) obj;
                br.l.e(aVar19, "$this$buildSerialDescriptor");
                iu.a.a(aVar19, "JsonPrimitive", new iu.l(new c0.a0(i17)));
                iu.a.a(aVar19, "JsonNull", new iu.l(new c0.a0(i16)));
                iu.a.a(aVar19, "JsonLiteral", new iu.l(new c0.a0(i15)));
                iu.a.a(aVar19, "JsonObject", new iu.l(new c0.a0(i14)));
                iu.a.a(aVar19, "JsonArray", new iu.l(new c0.a0(i13)));
                return b0Var;
        }
    }

    public /* synthetic */ o(t2.e eVar) {
        this.f9858a = 28;
    }
}
