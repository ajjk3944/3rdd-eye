package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import java.util.Map;

@M9.h
/* loaded from: classes3.dex */
public final class e11 {
    public static final b Companion = new b(0);

    /* renamed from: e, reason: collision with root package name */
    private static final M9.b<Object>[] f26618e;

    /* renamed from: a, reason: collision with root package name */
    private final long f26619a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f26620b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f26621c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26622d;

    public static final class a implements Q9.H<e11> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26623a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f26624b;

        static {
            a aVar = new a();
            f26623a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", aVar, 4);
            c1547o0.k("timestamp", false);
            c1547o0.k("code", false);
            c1547o0.k("headers", false);
            c1547o0.k("body", false);
            f26624b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.Y.f11465a, N9.a.b(Q9.Q.f11448a), N9.a.b(e11.f26618e[2]), N9.a.b(Q9.C0.f11399a)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f26624b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = e11.f26618e;
            int i = 0;
            Integer num = null;
            Map map = null;
            String str = null;
            long jC = 0;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    jC = bVarD.C(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    num = (Integer) bVarD.G(c1547o0, 1, Q9.Q.f11448a, num);
                    i |= 2;
                } else if (iX == 2) {
                    map = (Map) bVarD.G(c1547o0, 2, bVarArr[2], map);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new M9.n(iX);
                    }
                    str = (String) bVarD.G(c1547o0, 3, Q9.C0.f11399a, str);
                    i |= 8;
                }
            }
            bVarD.b(c1547o0);
            return new e11(i, jC, num, map, str);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f26624b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            e11 value = (e11) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f26624b;
            P9.c cVarD = encoder.d(c1547o0);
            e11.a(value, cVarD, c1547o0);
            cVarD.b(c1547o0);
        }

        @Override // Q9.H
        public final M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    public static final class b {
        private b() {
        }

        public final M9.b<e11> serializer() {
            return a.f26623a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    static {
        Q9.C0 c02 = Q9.C0.f11399a;
        f26618e = new M9.b[]{null, null, new Q9.U(c02, N9.a.b(c02)), null};
    }

    public /* synthetic */ e11(int i, long j4, Integer num, Map map, String str) {
        if (15 != (i & 15)) {
            Q9.G0.a(i, 15, a.f26623a.getDescriptor());
            throw null;
        }
        this.f26619a = j4;
        this.f26620b = num;
        this.f26621c = map;
        this.f26622d = str;
    }

    public static final /* synthetic */ void a(e11 e11Var, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f26618e;
        cVar.m(c1547o0, 0, e11Var.f26619a);
        cVar.w(c1547o0, 1, Q9.Q.f11448a, e11Var.f26620b);
        cVar.w(c1547o0, 2, bVarArr[2], e11Var.f26621c);
        cVar.w(c1547o0, 3, Q9.C0.f11399a, e11Var.f26622d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e11)) {
            return false;
        }
        e11 e11Var = (e11) obj;
        return this.f26619a == e11Var.f26619a && kotlin.jvm.internal.l.b(this.f26620b, e11Var.f26620b) && kotlin.jvm.internal.l.b(this.f26621c, e11Var.f26621c) && kotlin.jvm.internal.l.b(this.f26622d, e11Var.f26622d);
    }

    public final int hashCode() {
        long j4 = this.f26619a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        Integer num = this.f26620b;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.f26621c;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f26622d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.f26619a + ", statusCode=" + this.f26620b + ", headers=" + this.f26621c + ", body=" + this.f26622d + ")";
    }

    public e11(long j4, Integer num, Map<String, String> map, String str) {
        this.f26619a = j4;
        this.f26620b = num;
        this.f26621c = map;
        this.f26622d = str;
    }
}
