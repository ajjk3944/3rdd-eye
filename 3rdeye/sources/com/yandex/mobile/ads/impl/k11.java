package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;

@M9.h
/* loaded from: classes3.dex */
public final class k11 {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f29464a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29465b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29466c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29467d;

    public static final class a implements Q9.H<k11> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29468a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f29469b;

        static {
            a aVar = new a();
            f29468a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", aVar, 4);
            c1547o0.k("timestamp", false);
            c1547o0.k("type", false);
            c1547o0.k("tag", false);
            c1547o0.k("text", false);
            f29469b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{Q9.Y.f11465a, c02, c02, c02};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f29469b;
            P9.b bVarD = decoder.d(c1547o0);
            int i = 0;
            long jC = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
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
                } else {
                    if (iX != 3) {
                        throw new M9.n(iX);
                    }
                    strN3 = bVarD.n(c1547o0, 3);
                    i |= 8;
                }
            }
            bVarD.b(c1547o0);
            return new k11(i, jC, strN, strN2, strN3);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f29469b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            k11 value = (k11) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f29469b;
            P9.c cVarD = encoder.d(c1547o0);
            k11.a(value, cVarD, c1547o0);
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

        public final M9.b<k11> serializer() {
            return a.f29468a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ k11(int i, long j4, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            Q9.G0.a(i, 15, a.f29468a.getDescriptor());
            throw null;
        }
        this.f29464a = j4;
        this.f29465b = str;
        this.f29466c = str2;
        this.f29467d = str3;
    }

    public static final /* synthetic */ void a(k11 k11Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.m(c1547o0, 0, k11Var.f29464a);
        cVar.k(c1547o0, 1, k11Var.f29465b);
        cVar.k(c1547o0, 2, k11Var.f29466c);
        cVar.k(c1547o0, 3, k11Var.f29467d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k11)) {
            return false;
        }
        k11 k11Var = (k11) obj;
        return this.f29464a == k11Var.f29464a && kotlin.jvm.internal.l.b(this.f29465b, k11Var.f29465b) && kotlin.jvm.internal.l.b(this.f29466c, k11Var.f29466c) && kotlin.jvm.internal.l.b(this.f29467d, k11Var.f29467d);
    }

    public final int hashCode() {
        long j4 = this.f29464a;
        return this.f29467d.hashCode() + C4121h3.a(this.f29466c, C4121h3.a(this.f29465b, ((int) (j4 ^ (j4 >>> 32))) * 31, 31), 31);
    }

    public final String toString() {
        long j4 = this.f29464a;
        String str = this.f29465b;
        String str2 = this.f29466c;
        String str3 = this.f29467d;
        StringBuilder sb = new StringBuilder("MobileAdsSdkLog(timestamp=");
        sb.append(j4);
        sb.append(", type=");
        sb.append(str);
        com.google.android.gms.measurement.internal.a.l(sb, ", tag=", str2, ", text=", str3);
        sb.append(")");
        return sb.toString();
    }

    public k11(long j4, String type, String tag, String text) {
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(tag, "tag");
        kotlin.jvm.internal.l.f(text, "text");
        this.f29464a = j4;
        this.f29465b = type;
        this.f29466c = tag;
        this.f29467d = text;
    }
}
