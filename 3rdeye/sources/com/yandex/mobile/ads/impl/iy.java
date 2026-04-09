package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.impl.Oo;

@M9.h
/* loaded from: classes3.dex */
public final class iy {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f28893a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28894b;

    public static final class a implements Q9.H<iy> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28895a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f28896b;

        static {
            a aVar = new a();
            f28895a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallParameter", aVar, 2);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.VALUE, false);
            f28896b = c1547o0;
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
            C1547o0 c1547o0 = f28896b;
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
            return new iy(i, strN, strN2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f28896b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            iy value = (iy) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f28896b;
            P9.c cVarD = encoder.d(c1547o0);
            iy.a(value, cVarD, c1547o0);
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

        public final M9.b<iy> serializer() {
            return a.f28895a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ iy(int i, String str, String str2) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f28895a.getDescriptor());
            throw null;
        }
        this.f28893a = str;
        this.f28894b = str2;
    }

    public final String a() {
        return this.f28893a;
    }

    public final String b() {
        return this.f28894b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy)) {
            return false;
        }
        iy iyVar = (iy) obj;
        return kotlin.jvm.internal.l.b(this.f28893a, iyVar.f28893a) && kotlin.jvm.internal.l.b(this.f28894b, iyVar.f28894b);
    }

    public final int hashCode() {
        return this.f28894b.hashCode() + (this.f28893a.hashCode() * 31);
    }

    public final String toString() {
        return Oo.h("DebugPanelWaterfallParameter(name=", this.f28893a, ", value=", this.f28894b, ")");
    }

    public static final /* synthetic */ void a(iy iyVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, iyVar.f28893a);
        cVar.k(c1547o0, 1, iyVar.f28894b);
    }
}
