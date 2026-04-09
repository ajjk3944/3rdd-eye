package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.fk1;
import com.yandex.mobile.ads.impl.mk1;
import com.yandex.mobile.ads.impl.ok1;

@M9.h
/* loaded from: classes3.dex */
public final class bk1 {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f25312a;

    /* renamed from: b, reason: collision with root package name */
    private final fk1 f25313b;

    /* renamed from: c, reason: collision with root package name */
    private final ok1 f25314c;

    /* renamed from: d, reason: collision with root package name */
    private final mk1 f25315d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25316e;

    public static final class a implements Q9.H<bk1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25317a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f25318b;

        static {
            a aVar = new a();
            f25317a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", aVar, 5);
            c1547o0.k("adapter", false);
            c1547o0.k("network_winner", false);
            c1547o0.k("revenue", false);
            c1547o0.k("result", false);
            c1547o0.k("network_ad_info", false);
            f25318b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{c02, N9.a.b(fk1.a.f27361a), N9.a.b(ok1.a.f31411a), mk1.a.f30424a, N9.a.b(c02)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f25318b;
            P9.b bVarD = decoder.d(c1547o0);
            int i = 0;
            String strN = null;
            fk1 fk1Var = null;
            ok1 ok1Var = null;
            mk1 mk1Var = null;
            String str = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    fk1Var = (fk1) bVarD.G(c1547o0, 1, fk1.a.f27361a, fk1Var);
                    i |= 2;
                } else if (iX == 2) {
                    ok1Var = (ok1) bVarD.G(c1547o0, 2, ok1.a.f31411a, ok1Var);
                    i |= 4;
                } else if (iX == 3) {
                    mk1Var = (mk1) bVarD.h(c1547o0, 3, mk1.a.f30424a, mk1Var);
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
            return new bk1(i, strN, fk1Var, ok1Var, mk1Var, str);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f25318b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            bk1 value = (bk1) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f25318b;
            P9.c cVarD = encoder.d(c1547o0);
            bk1.a(value, cVarD, c1547o0);
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

        public final M9.b<bk1> serializer() {
            return a.f25317a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ bk1(int i, String str, fk1 fk1Var, ok1 ok1Var, mk1 mk1Var, String str2) {
        if (31 != (i & 31)) {
            Q9.G0.a(i, 31, a.f25317a.getDescriptor());
            throw null;
        }
        this.f25312a = str;
        this.f25313b = fk1Var;
        this.f25314c = ok1Var;
        this.f25315d = mk1Var;
        this.f25316e = str2;
    }

    public static final /* synthetic */ void a(bk1 bk1Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, bk1Var.f25312a);
        cVar.w(c1547o0, 1, fk1.a.f27361a, bk1Var.f25313b);
        cVar.w(c1547o0, 2, ok1.a.f31411a, bk1Var.f25314c);
        cVar.y(c1547o0, 3, mk1.a.f30424a, bk1Var.f25315d);
        cVar.w(c1547o0, 4, Q9.C0.f11399a, bk1Var.f25316e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk1)) {
            return false;
        }
        bk1 bk1Var = (bk1) obj;
        return kotlin.jvm.internal.l.b(this.f25312a, bk1Var.f25312a) && kotlin.jvm.internal.l.b(this.f25313b, bk1Var.f25313b) && kotlin.jvm.internal.l.b(this.f25314c, bk1Var.f25314c) && kotlin.jvm.internal.l.b(this.f25315d, bk1Var.f25315d) && kotlin.jvm.internal.l.b(this.f25316e, bk1Var.f25316e);
    }

    public final int hashCode() {
        int iHashCode = this.f25312a.hashCode() * 31;
        fk1 fk1Var = this.f25313b;
        int iHashCode2 = (iHashCode + (fk1Var == null ? 0 : fk1Var.hashCode())) * 31;
        ok1 ok1Var = this.f25314c;
        int iHashCode3 = (this.f25315d.hashCode() + ((iHashCode2 + (ok1Var == null ? 0 : ok1Var.hashCode())) * 31)) * 31;
        String str = this.f25316e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f25312a;
        fk1 fk1Var = this.f25313b;
        ok1 ok1Var = this.f25314c;
        mk1 mk1Var = this.f25315d;
        String str2 = this.f25316e;
        StringBuilder sb = new StringBuilder("PrefetchedMediationInfo(adapter=");
        sb.append(str);
        sb.append(", networkWinner=");
        sb.append(fk1Var);
        sb.append(", revenue=");
        sb.append(ok1Var);
        sb.append(", result=");
        sb.append(mk1Var);
        sb.append(", networkAdInfo=");
        return B4.f.c(sb, str2, ")");
    }

    public bk1(String adapter, fk1 fk1Var, ok1 ok1Var, mk1 result, String str) {
        kotlin.jvm.internal.l.f(adapter, "adapter");
        kotlin.jvm.internal.l.f(result, "result");
        this.f25312a = adapter;
        this.f25313b = fk1Var;
        this.f25314c = ok1Var;
        this.f25315d = result;
        this.f25316e = str;
    }
}
