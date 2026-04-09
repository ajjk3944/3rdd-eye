package rr;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final as.p f21697a;

    /* renamed from: b, reason: collision with root package name */
    public static final as.p f21698b;

    /* renamed from: c, reason: collision with root package name */
    public static final as.p f21699c;

    /* renamed from: d, reason: collision with root package name */
    public static final as.p f21700d;

    /* renamed from: e, reason: collision with root package name */
    public static final as.p f21701e;

    /* renamed from: f, reason: collision with root package name */
    public static final as.p f21702f;

    /* renamed from: g, reason: collision with root package name */
    public static final as.p f21703g;

    /* renamed from: h, reason: collision with root package name */
    public static final as.p f21704h;

    /* renamed from: i, reason: collision with root package name */
    public static final as.p f21705i;
    public static final as.p j;
    public static final p0 k;

    /* renamed from: l, reason: collision with root package name */
    public static final p0 f21706l;

    /* renamed from: m, reason: collision with root package name */
    public static final p0 f21707m;

    /* renamed from: n, reason: collision with root package name */
    public static final ot.o f21708n;

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f21709o;

    static {
        z0 z0Var = z0.f21726r;
        as.p pVar = new as.p(z0Var, 3);
        f21697a = pVar;
        a1 a1Var = a1.f21675r;
        as.p pVar2 = new as.p(a1Var, 4);
        f21698b = pVar2;
        b1 b1Var = b1.f21677r;
        as.p pVar3 = new as.p(b1Var, 5);
        f21699c = pVar3;
        w0 w0Var = w0.f21723r;
        as.p pVar4 = new as.p(w0Var, 6);
        f21700d = pVar4;
        c1 c1Var = c1.f21680r;
        as.p pVar5 = new as.p(c1Var, 7);
        f21701e = pVar5;
        y0 y0Var = y0.f21725r;
        as.p pVar6 = new as.p(y0Var, 8);
        f21702f = pVar6;
        v0 v0Var = v0.f21721r;
        as.p pVar7 = new as.p(v0Var, 9);
        f21703g = pVar7;
        x0 x0Var = x0.f21724r;
        as.p pVar8 = new as.p(x0Var, 10);
        f21704h = pVar8;
        d1 d1Var = d1.f21681r;
        as.p pVar9 = new as.p(d1Var, 11);
        f21705i = pVar9;
        Collections.unmodifiableSet(mq.l.B0(new as.p[]{pVar, pVar2, pVar4, pVar6}));
        HashMap map = new HashMap(6);
        map.put(pVar2, 0);
        map.put(pVar, 0);
        map.put(pVar4, 1);
        map.put(pVar3, 1);
        map.put(pVar5, 2);
        Collections.unmodifiableMap(map);
        j = pVar5;
        k = new p0(2);
        f21706l = new p0(3);
        f21707m = new p0(4);
        try {
            Iterator it = Arrays.asList(new ot.o[0]).iterator();
            f21708n = it.hasNext() ? (ot.o) it.next() : ot.o.f19819a;
            HashMap map2 = new HashMap();
            f21709o = map2;
            map2.put(z0Var, pVar);
            map2.put(a1Var, pVar2);
            map2.put(b1Var, pVar3);
            map2.put(w0Var, pVar4);
            map2.put(c1Var, pVar5);
            map2.put(y0Var, pVar6);
            map2.put(v0Var, pVar7);
            map2.put(x0Var, pVar8);
            map2.put(d1Var, pVar9);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.p.a(int):void");
    }

    public static Integer b(as.p pVar, as.p pVar2) {
        if (pVar == null) {
            a(12);
            throw null;
        }
        n.a aVar = pVar.f2239a;
        if (pVar2 == null) {
            a(13);
            throw null;
        }
        n.a aVar2 = pVar2.f2239a;
        Integer numA = aVar.a(aVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = aVar2.a(aVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static o c(bt.d dVar, o oVar, l lVar) {
        o oVarC;
        if (oVar == null) {
            a(8);
            throw null;
        }
        if (lVar == null) {
            a(9);
            throw null;
        }
        for (o oVar2 = (o) oVar.u1(); oVar2 != null && oVar2.c() != f21702f; oVar2 = (o) ts.d.i(oVar2, o.class, true)) {
            if (!oVar2.c().a(dVar, oVar2, lVar)) {
                return oVar2;
            }
        }
        if (!(oVar instanceof ur.m0) || (oVarC = c(dVar, ((ur.n0) ((ur.m0) oVar)).f23656c0, lVar)) == null) {
            return null;
        }
        return oVarC;
    }

    public static boolean d(o oVar, l lVar) {
        if (lVar == null) {
            a(7);
            throw null;
        }
        p0 p0VarF = ts.d.f(lVar);
        if (p0VarF != p0.f21710d) {
            return p0VarF.equals(ts.d.f(oVar));
        }
        return false;
    }

    public static boolean e(as.p pVar) {
        if (pVar != null) {
            return pVar == f21697a || pVar == f21698b;
        }
        a(14);
        throw null;
    }

    public static as.p f(n.a aVar) {
        if (aVar == null) {
            a(15);
            throw null;
        }
        as.p pVar = (as.p) f21709o.get(aVar);
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + aVar);
    }
}
