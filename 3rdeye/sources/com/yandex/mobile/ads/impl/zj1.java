package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.bk1;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class zj1 {
    public static final b Companion = new b(0);

    /* renamed from: b, reason: collision with root package name */
    private static final M9.b<Object>[] f36528b = {new C1526e(bk1.a.f25317a)};

    /* renamed from: a, reason: collision with root package name */
    private final List<bk1> f36529a;

    public static final class a implements Q9.H<zj1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36530a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f36531b;

        static {
            a aVar = new a();
            f36530a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", aVar, 1);
            c1547o0.k("prefetched_mediation_data", false);
            f36531b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{zj1.f36528b[0]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f36531b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = zj1.f36528b;
            List list = null;
            boolean z10 = true;
            int i = 0;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new M9.n(iX);
                    }
                    list = (List) bVarD.h(c1547o0, 0, bVarArr[0], list);
                    i = 1;
                }
            }
            bVarD.b(c1547o0);
            return new zj1(i, list);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f36531b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            zj1 value = (zj1) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f36531b;
            P9.c cVarD = encoder.d(c1547o0);
            zj1.a(value, cVarD, c1547o0);
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

        public final M9.b<zj1> serializer() {
            return a.f36530a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ zj1(int i, List list) {
        if (1 == (i & 1)) {
            this.f36529a = list;
        } else {
            Q9.G0.a(i, 1, a.f36530a.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void a(zj1 zj1Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.y(c1547o0, 0, f36528b[0], zj1Var.f36529a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj1) && kotlin.jvm.internal.l.b(this.f36529a, ((zj1) obj).f36529a);
    }

    public final int hashCode() {
        return this.f36529a.hashCode();
    }

    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f36529a + ")";
    }

    public zj1(List<bk1> mediationPrefetchAdapters) {
        kotlin.jvm.internal.l.f(mediationPrefetchAdapters, "mediationPrefetchAdapters");
        this.f36529a = mediationPrefetchAdapters;
    }
}
