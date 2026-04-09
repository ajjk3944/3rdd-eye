package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;

@M9.h
/* loaded from: classes3.dex */
public final class mk1 {
    public static final b Companion = new b(0);

    /* renamed from: d, reason: collision with root package name */
    private static final M9.b<Object>[] f30420d = {nk1.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    private final nk1 f30421a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30422b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f30423c;

    public static final class a implements Q9.H<mk1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30424a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f30425b;

        static {
            a aVar = new a();
            f30424a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", aVar, 3);
            c1547o0.k("status", false);
            c1547o0.k("error_message", false);
            c1547o0.k("status_code", false);
            f30425b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{mk1.f30420d[0], N9.a.b(Q9.C0.f11399a), N9.a.b(Q9.Q.f11448a)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f30425b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = mk1.f30420d;
            nk1 nk1Var = null;
            boolean z10 = true;
            int i = 0;
            String str = null;
            Integer num = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    nk1Var = (nk1) bVarD.h(c1547o0, 0, bVarArr[0], nk1Var);
                    i |= 1;
                } else if (iX == 1) {
                    str = (String) bVarD.G(c1547o0, 1, Q9.C0.f11399a, str);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new M9.n(iX);
                    }
                    num = (Integer) bVarD.G(c1547o0, 2, Q9.Q.f11448a, num);
                    i |= 4;
                }
            }
            bVarD.b(c1547o0);
            return new mk1(i, nk1Var, str, num);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f30425b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            mk1 value = (mk1) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f30425b;
            P9.c cVarD = encoder.d(c1547o0);
            mk1.a(value, cVarD, c1547o0);
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

        public final M9.b<mk1> serializer() {
            return a.f30424a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ mk1(int i, nk1 nk1Var, String str, Integer num) {
        if (7 != (i & 7)) {
            Q9.G0.a(i, 7, a.f30424a.getDescriptor());
            throw null;
        }
        this.f30421a = nk1Var;
        this.f30422b = str;
        this.f30423c = num;
    }

    public static final /* synthetic */ void a(mk1 mk1Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.y(c1547o0, 0, f30420d[0], mk1Var.f30421a);
        cVar.w(c1547o0, 1, Q9.C0.f11399a, mk1Var.f30422b);
        cVar.w(c1547o0, 2, Q9.Q.f11448a, mk1Var.f30423c);
    }

    public mk1(nk1 status, String str, Integer num) {
        kotlin.jvm.internal.l.f(status, "status");
        this.f30421a = status;
        this.f30422b = str;
        this.f30423c = num;
    }
}
