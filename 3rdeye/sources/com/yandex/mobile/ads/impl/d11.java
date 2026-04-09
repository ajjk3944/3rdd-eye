package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

@M9.h
/* loaded from: classes3.dex */
public final class d11 {
    public static final b Companion = new b(0);

    /* renamed from: f, reason: collision with root package name */
    private static final M9.b<Object>[] f25918f;

    /* renamed from: a, reason: collision with root package name */
    private final long f25919a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25920b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25921c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f25922d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25923e;

    public static final class a implements Q9.H<d11> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25924a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f25925b;

        static {
            a aVar = new a();
            f25924a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", aVar, 5);
            c1547o0.k("timestamp", false);
            c1547o0.k("method", false);
            c1547o0.k(ImagesContract.URL, false);
            c1547o0.k("headers", false);
            c1547o0.k("body", false);
            f25925b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b[] bVarArr = d11.f25918f;
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{Q9.Y.f11465a, c02, c02, N9.a.b(bVarArr[3]), N9.a.b(c02)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f25925b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = d11.f25918f;
            int i = 0;
            String strN = null;
            String strN2 = null;
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
                    strN = bVarD.n(c1547o0, 1);
                    i |= 2;
                } else if (iX == 2) {
                    strN2 = bVarD.n(c1547o0, 2);
                    i |= 4;
                } else if (iX == 3) {
                    map = (Map) bVarD.G(c1547o0, 3, bVarArr[3], map);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new M9.n(iX);
                    }
                    str = (String) bVarD.G(c1547o0, 4, Q9.C0.f11399a, str);
                    i |= 16;
                }
            }
            bVarD.b(c1547o0);
            return new d11(i, jC, strN, strN2, map, str);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f25925b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            d11 value = (d11) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f25925b;
            P9.c cVarD = encoder.d(c1547o0);
            d11.a(value, cVarD, c1547o0);
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

        public final M9.b<d11> serializer() {
            return a.f25924a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    static {
        Q9.C0 c02 = Q9.C0.f11399a;
        f25918f = new M9.b[]{null, null, null, new Q9.U(c02, N9.a.b(c02)), null};
    }

    public /* synthetic */ d11(int i, long j4, String str, String str2, Map map, String str3) {
        if (31 != (i & 31)) {
            Q9.G0.a(i, 31, a.f25924a.getDescriptor());
            throw null;
        }
        this.f25919a = j4;
        this.f25920b = str;
        this.f25921c = str2;
        this.f25922d = map;
        this.f25923e = str3;
    }

    public static final /* synthetic */ void a(d11 d11Var, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f25918f;
        cVar.m(c1547o0, 0, d11Var.f25919a);
        cVar.k(c1547o0, 1, d11Var.f25920b);
        cVar.k(c1547o0, 2, d11Var.f25921c);
        cVar.w(c1547o0, 3, bVarArr[3], d11Var.f25922d);
        cVar.w(c1547o0, 4, Q9.C0.f11399a, d11Var.f25923e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d11)) {
            return false;
        }
        d11 d11Var = (d11) obj;
        return this.f25919a == d11Var.f25919a && kotlin.jvm.internal.l.b(this.f25920b, d11Var.f25920b) && kotlin.jvm.internal.l.b(this.f25921c, d11Var.f25921c) && kotlin.jvm.internal.l.b(this.f25922d, d11Var.f25922d) && kotlin.jvm.internal.l.b(this.f25923e, d11Var.f25923e);
    }

    public final int hashCode() {
        long j4 = this.f25919a;
        int iA = C4121h3.a(this.f25921c, C4121h3.a(this.f25920b, ((int) (j4 ^ (j4 >>> 32))) * 31, 31), 31);
        Map<String, String> map = this.f25922d;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f25923e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkRequestLog(timestamp=" + this.f25919a + ", method=" + this.f25920b + ", url=" + this.f25921c + ", headers=" + this.f25922d + ", body=" + this.f25923e + ")";
    }

    public d11(long j4, String method, String url, Map<String, String> map, String str) {
        kotlin.jvm.internal.l.f(method, "method");
        kotlin.jvm.internal.l.f(url, "url");
        this.f25919a = j4;
        this.f25920b = method;
        this.f25921c = url;
        this.f25922d = map;
        this.f25923e = str;
    }
}
