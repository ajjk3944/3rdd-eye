package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.gw;

@M9.h
/* loaded from: classes3.dex */
public final class cw {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f25775a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25776b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25777c;

    /* renamed from: d, reason: collision with root package name */
    private final gw f25778d;

    public static final class a implements Q9.H<cw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25779a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f25780b;

        static {
            a aVar = new a();
            f25779a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", aVar, 4);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k(Constants.ADMON_AD_TYPE, false);
            c1547o0.k(Constants.ADMON_AD_UNIT_ID, false);
            c1547o0.k("mediation", true);
            f25780b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?> bVarB = N9.a.b(gw.a.f28010a);
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{c02, c02, c02, bVarB};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f25780b;
            P9.b bVarD = decoder.d(c1547o0);
            int i = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            gw gwVar = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    strN2 = bVarD.n(c1547o0, 1);
                    i |= 2;
                } else if (iX == 2) {
                    strN3 = bVarD.n(c1547o0, 2);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new M9.n(iX);
                    }
                    gwVar = (gw) bVarD.G(c1547o0, 3, gw.a.f28010a, gwVar);
                    i |= 8;
                }
            }
            bVarD.b(c1547o0);
            return new cw(i, strN, strN2, strN3, gwVar);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f25780b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            cw value = (cw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f25780b;
            P9.c cVarD = encoder.d(c1547o0);
            cw.a(value, cVarD, c1547o0);
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

        public final M9.b<cw> serializer() {
            return a.f25779a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ cw(int i, String str, String str2, String str3, gw gwVar) {
        if (7 != (i & 7)) {
            Q9.G0.a(i, 7, a.f25779a.getDescriptor());
            throw null;
        }
        this.f25775a = str;
        this.f25776b = str2;
        this.f25777c = str3;
        if ((i & 8) == 0) {
            this.f25778d = null;
        } else {
            this.f25778d = gwVar;
        }
    }

    public final String a() {
        return this.f25777c;
    }

    public final String b() {
        return this.f25776b;
    }

    public final gw c() {
        return this.f25778d;
    }

    public final String d() {
        return this.f25775a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return kotlin.jvm.internal.l.b(this.f25775a, cwVar.f25775a) && kotlin.jvm.internal.l.b(this.f25776b, cwVar.f25776b) && kotlin.jvm.internal.l.b(this.f25777c, cwVar.f25777c) && kotlin.jvm.internal.l.b(this.f25778d, cwVar.f25778d);
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f25777c, C4121h3.a(this.f25776b, this.f25775a.hashCode() * 31, 31), 31);
        gw gwVar = this.f25778d;
        return iA + (gwVar == null ? 0 : gwVar.hashCode());
    }

    public final String toString() {
        String str = this.f25775a;
        String str2 = this.f25776b;
        String str3 = this.f25777c;
        gw gwVar = this.f25778d;
        StringBuilder sbD = j6.l.d("DebugPanelAdUnit(name=", str, ", format=", str2, ", adUnitId=");
        sbD.append(str3);
        sbD.append(", mediation=");
        sbD.append(gwVar);
        sbD.append(")");
        return sbD.toString();
    }

    public static final /* synthetic */ void a(cw cwVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, cwVar.f25775a);
        cVar.k(c1547o0, 1, cwVar.f25776b);
        cVar.k(c1547o0, 2, cwVar.f25777c);
        if (!cVar.F(c1547o0, 3) && cwVar.f25778d == null) {
            return;
        }
        cVar.w(c1547o0, 3, gw.a.f28010a, cwVar.f25778d);
    }
}
