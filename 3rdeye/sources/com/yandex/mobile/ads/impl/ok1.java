package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import Q9.C1562z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

@M9.h
/* loaded from: classes3.dex */
public final class ok1 {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final double f31410a;

    public static final class a implements Q9.H<ok1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31411a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f31412b;

        static {
            a aVar = new a();
            f31411a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", aVar, 1);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.VALUE, false);
            f31412b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{C1562z.f11544a};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f31412b;
            P9.b bVarD = decoder.d(c1547o0);
            double dY = 0.0d;
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
                    dY = bVarD.y(c1547o0, 0);
                    i = 1;
                }
            }
            bVarD.b(c1547o0);
            return new ok1(i, dY);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f31412b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            ok1 value = (ok1) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f31412b;
            P9.c cVarD = encoder.d(c1547o0);
            ok1.a(value, cVarD, c1547o0);
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

        public final M9.b<ok1> serializer() {
            return a.f31411a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public ok1(double d10) {
        this.f31410a = d10;
    }

    public static final /* synthetic */ void a(ok1 ok1Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.i(c1547o0, 0, ok1Var.f31410a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok1) && Double.compare(this.f31410a, ((ok1) obj).f31410a) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f31410a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f31410a + ")";
    }

    public /* synthetic */ ok1(int i, double d10) {
        if (1 == (i & 1)) {
            this.f31410a = d10;
        } else {
            Q9.G0.a(i, 1, a.f31411a.getDescriptor());
            throw null;
        }
    }
}
