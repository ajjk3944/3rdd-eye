package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4093d3 extends fi2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f25936d = 0;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4135j3 f25937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4093d3(EnumC4135j3 reason, nc1 nc1Var) {
        super(nc1Var);
        kotlin.jvm.internal.l.f(reason, "reason");
        this.f25937c = reason;
    }

    public final EnumC4135j3 a() {
        return this.f25937c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4093d3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f25937c == ((C4093d3) obj).f25937c;
    }

    public final int hashCode() {
        return this.f25937c.hashCode();
    }

    /* renamed from: com.yandex.mobile.ads.impl.d3$a */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.C4093d3 a(com.yandex.mobile.ads.impl.nc1 r5) {
            /*
                r0 = -1
                if (r5 == 0) goto L6
                int r1 = r5.f30835a
                goto L7
            L6:
                r1 = r0
            L7:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r2
                com.yandex.mobile.ads.impl.fp0.b(r3)
                r2 = 204(0xcc, float:2.86E-43)
                if (r2 != r1) goto L1b
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28934d
                goto L70
            L1b:
                r2 = 0
                if (r5 == 0) goto L21
                java.util.Map<java.lang.String, java.lang.String> r3 = r5.f30837c
                goto L22
            L21:
                r3 = r2
            L22:
                if (r5 == 0) goto L2a
                int r2 = r5.f30835a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            L2a:
                if (r2 != 0) goto L2d
                goto L50
            L2d:
                int r2 = r2.intValue()
                r4 = 400(0x190, float:5.6E-43)
                if (r4 != r2) goto L50
                if (r3 == 0) goto L50
                com.yandex.mobile.ads.impl.gh0 r2 = com.yandex.mobile.ads.impl.gh0.f27710X
                int r4 = com.yandex.mobile.ads.impl.hf0.f28193b
                java.lang.String r4 = "httpHeader"
                kotlin.jvm.internal.l.f(r2, r4)
                java.lang.String r2 = com.yandex.mobile.ads.impl.hf0.a(r3, r2)
                if (r2 != 0) goto L47
                goto L50
            L47:
                boolean r2 = java.lang.Boolean.parseBoolean(r2)
                if (r2 == 0) goto L50
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28938h
                goto L70
            L50:
                r2 = 403(0x193, float:5.65E-43)
                if (r2 != r1) goto L57
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28937g
                goto L70
            L57:
                r2 = 404(0x194, float:5.66E-43)
                if (r2 != r1) goto L5e
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28932b
                goto L70
            L5e:
                r2 = 500(0x1f4, float:7.0E-43)
                if (r2 > r1) goto L69
                r2 = 599(0x257, float:8.4E-43)
                if (r1 > r2) goto L69
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28936f
                goto L70
            L69:
                if (r0 != r1) goto L6e
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28940k
                goto L70
            L6e:
                com.yandex.mobile.ads.impl.j3 r0 = com.yandex.mobile.ads.impl.EnumC4135j3.f28935e
            L70:
                com.yandex.mobile.ads.impl.d3 r1 = new com.yandex.mobile.ads.impl.d3
                r1.<init>(r0, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4093d3.a.a(com.yandex.mobile.ads.impl.nc1):com.yandex.mobile.ads.impl.d3");
        }

        public static C4093d3 a(fi2 volleyError) {
            EnumC4135j3 enumC4135j3;
            kotlin.jvm.internal.l.f(volleyError, "volleyError");
            nc1 nc1Var = volleyError.f27346b;
            Integer numValueOf = nc1Var != null ? Integer.valueOf(nc1Var.f30835a) : null;
            if (numValueOf == null) {
                if (volleyError instanceof dd1) {
                    enumC4135j3 = EnumC4135j3.f28940k;
                } else if (volleyError instanceof y42) {
                    enumC4135j3 = EnumC4135j3.f28941l;
                } else if (volleyError instanceof th) {
                    enumC4135j3 = EnumC4135j3.f28942m;
                } else if (volleyError instanceof zo) {
                    enumC4135j3 = EnumC4135j3.f28943n;
                } else {
                    enumC4135j3 = volleyError instanceof xf1 ? EnumC4135j3.f28944o : EnumC4135j3.f28945p;
                }
            } else {
                int iIntValue = numValueOf.intValue();
                enumC4135j3 = (500 > iIntValue || iIntValue > 599) ? EnumC4135j3.f28935e : EnumC4135j3.f28936f;
            }
            fp0.b(numValueOf);
            return new C4093d3(enumC4135j3, nc1Var);
        }
    }
}
