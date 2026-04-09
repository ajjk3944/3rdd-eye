package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.d11;
import com.yandex.mobile.ads.impl.e11;

@M9.h
/* loaded from: classes3.dex */
public final class b11 {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final d11 f25043a;

    /* renamed from: b, reason: collision with root package name */
    private final e11 f25044b;

    public static final class a implements Q9.H<b11> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25045a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f25046b;

        static {
            a aVar = new a();
            f25045a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", aVar, 2);
            c1547o0.k(com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, false);
            c1547o0.k("response", false);
            f25046b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{d11.a.f25924a, N9.a.b(e11.a.f26623a)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f25046b;
            P9.b bVarD = decoder.d(c1547o0);
            d11 d11Var = null;
            boolean z10 = true;
            int i = 0;
            e11 e11Var = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    d11Var = (d11) bVarD.h(c1547o0, 0, d11.a.f25924a, d11Var);
                    i |= 1;
                } else {
                    if (iX != 1) {
                        throw new M9.n(iX);
                    }
                    e11Var = (e11) bVarD.G(c1547o0, 1, e11.a.f26623a, e11Var);
                    i |= 2;
                }
            }
            bVarD.b(c1547o0);
            return new b11(i, d11Var, e11Var);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f25046b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            b11 value = (b11) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f25046b;
            P9.c cVarD = encoder.d(c1547o0);
            b11.a(value, cVarD, c1547o0);
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

        public final M9.b<b11> serializer() {
            return a.f25045a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ b11(int i, d11 d11Var, e11 e11Var) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f25045a.getDescriptor());
            throw null;
        }
        this.f25043a = d11Var;
        this.f25044b = e11Var;
    }

    public static final /* synthetic */ void a(b11 b11Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.y(c1547o0, 0, d11.a.f25924a, b11Var.f25043a);
        cVar.w(c1547o0, 1, e11.a.f26623a, b11Var.f25044b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11)) {
            return false;
        }
        b11 b11Var = (b11) obj;
        return kotlin.jvm.internal.l.b(this.f25043a, b11Var.f25043a) && kotlin.jvm.internal.l.b(this.f25044b, b11Var.f25044b);
    }

    public final int hashCode() {
        int iHashCode = this.f25043a.hashCode() * 31;
        e11 e11Var = this.f25044b;
        return iHashCode + (e11Var == null ? 0 : e11Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f25043a + ", response=" + this.f25044b + ")";
    }

    public b11(d11 request, e11 e11Var) {
        kotlin.jvm.internal.l.f(request, "request");
        this.f25043a = request;
        this.f25044b = e11Var;
    }
}
