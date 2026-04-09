package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.impl.Oo;

@M9.h
/* loaded from: classes3.dex */
public final class fk1 {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f27359a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27360b;

    public static final class a implements Q9.H<fk1> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27361a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f27362b;

        static {
            a aVar = new a();
            f27361a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationNetworkWinner", aVar, 2);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k("network_ad_unit", false);
            f27362b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{c02, c02};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f27362b;
            P9.b bVarD = decoder.d(c1547o0);
            String strN = null;
            boolean z10 = true;
            int i = 0;
            String strN2 = null;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(c1547o0, 0);
                    i |= 1;
                } else {
                    if (iX != 1) {
                        throw new M9.n(iX);
                    }
                    strN2 = bVarD.n(c1547o0, 1);
                    i |= 2;
                }
            }
            bVarD.b(c1547o0);
            return new fk1(i, strN, strN2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f27362b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            fk1 value = (fk1) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f27362b;
            P9.c cVarD = encoder.d(c1547o0);
            fk1.a(value, cVarD, c1547o0);
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

        public final M9.b<fk1> serializer() {
            return a.f27361a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ fk1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f27361a.getDescriptor());
            throw null;
        }
        this.f27359a = str;
        this.f27360b = str2;
    }

    public static final /* synthetic */ void a(fk1 fk1Var, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, fk1Var.f27359a);
        cVar.k(c1547o0, 1, fk1Var.f27360b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk1)) {
            return false;
        }
        fk1 fk1Var = (fk1) obj;
        return kotlin.jvm.internal.l.b(this.f27359a, fk1Var.f27359a) && kotlin.jvm.internal.l.b(this.f27360b, fk1Var.f27360b);
    }

    public final int hashCode() {
        return this.f27360b.hashCode() + (this.f27359a.hashCode() * 31);
    }

    public final String toString() {
        return Oo.h("PrefetchedMediationNetworkWinner(networkName=", this.f27359a, ", networkAdUnit=", this.f27360b, ")");
    }

    public fk1(String networkName, String networkAdUnit) {
        kotlin.jvm.internal.l.f(networkName, "networkName");
        kotlin.jvm.internal.l.f(networkAdUnit, "networkAdUnit");
        this.f27359a = networkName;
        this.f27360b = networkAdUnit;
    }
}
