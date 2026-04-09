package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.impl.Oo;

@M9.h
/* loaded from: classes3.dex */
public final class hy {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f28414a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28415b;

    public static final class a implements Q9.H<hy> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28416a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f28417b;

        static {
            a aVar = new a();
            f28416a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCurrency", aVar, 2);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k("symbol", false);
            f28417b = c1547o0;
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
            C1547o0 c1547o0 = f28417b;
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
            return new hy(i, strN, strN2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f28417b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            hy value = (hy) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f28417b;
            P9.c cVarD = encoder.d(c1547o0);
            hy.a(value, cVarD, c1547o0);
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

        public final M9.b<hy> serializer() {
            return a.f28416a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ hy(int i, String str, String str2) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f28416a.getDescriptor());
            throw null;
        }
        this.f28414a = str;
        this.f28415b = str2;
    }

    public static final /* synthetic */ void a(hy hyVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, hyVar.f28414a);
        cVar.k(c1547o0, 1, hyVar.f28415b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy)) {
            return false;
        }
        hy hyVar = (hy) obj;
        return kotlin.jvm.internal.l.b(this.f28414a, hyVar.f28414a) && kotlin.jvm.internal.l.b(this.f28415b, hyVar.f28415b);
    }

    public final int hashCode() {
        return this.f28415b.hashCode() + (this.f28414a.hashCode() * 31);
    }

    public final String toString() {
        return Oo.h("DebugPanelWaterfallCurrency(name=", this.f28414a, ", symbol=", this.f28415b, ")");
    }
}
