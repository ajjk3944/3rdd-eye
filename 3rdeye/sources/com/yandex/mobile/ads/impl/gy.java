package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import Q9.C1562z;

@M9.h
/* loaded from: classes3.dex */
public final class gy {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f28028a;

    /* renamed from: b, reason: collision with root package name */
    private final double f28029b;

    public static final class a implements Q9.H<gy> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28030a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f28031b;

        static {
            a aVar = new a();
            f28030a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", aVar, 2);
            c1547o0.k("network_ad_unit_id", false);
            c1547o0.k("min_cpm", false);
            f28031b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            return new M9.b[]{Q9.C0.f11399a, C1562z.f11544a};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f28031b;
            P9.b bVarD = decoder.d(c1547o0);
            String strN = null;
            double dY = 0.0d;
            boolean z10 = true;
            int i = 0;
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
                    dY = bVarD.y(c1547o0, 1);
                    i |= 2;
                }
            }
            bVarD.b(c1547o0);
            return new gy(i, strN, dY);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f28031b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            gy value = (gy) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f28031b;
            P9.c cVarD = encoder.d(c1547o0);
            gy.a(value, cVarD, c1547o0);
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

        public final M9.b<gy> serializer() {
            return a.f28030a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ gy(int i, String str, double d10) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f28030a.getDescriptor());
            throw null;
        }
        this.f28028a = str;
        this.f28029b = d10;
    }

    public final double a() {
        return this.f28029b;
    }

    public final String b() {
        return this.f28028a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy)) {
            return false;
        }
        gy gyVar = (gy) obj;
        return kotlin.jvm.internal.l.b(this.f28028a, gyVar.f28028a) && Double.compare(this.f28029b, gyVar.f28029b) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.f28028a.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f28029b);
        return ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f28028a + ", minCpm=" + this.f28029b + ")";
    }

    public static final /* synthetic */ void a(gy gyVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, gyVar.f28028a);
        cVar.i(c1547o0, 1, gyVar.f28029b);
    }
}
