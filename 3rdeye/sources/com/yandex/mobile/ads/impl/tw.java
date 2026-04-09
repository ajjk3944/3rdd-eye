package com.yandex.mobile.ads.impl;

import Q9.C1547o0;
import Q9.C1549p0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.impl.Oo;

@M9.h
/* loaded from: classes3.dex */
public final class tw {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f33783a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33784b;

    public static final class a implements Q9.H<tw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33785a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f33786b;

        static {
            a aVar = new a();
            f33785a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelBiddingParameter", aVar, 2);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.VALUE, false);
            f33786b = c1547o0;
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
            C1547o0 c1547o0 = f33786b;
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
            return new tw(i, strN, strN2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f33786b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            tw value = (tw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f33786b;
            P9.c cVarD = encoder.d(c1547o0);
            tw.a(value, cVarD, c1547o0);
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

        public final M9.b<tw> serializer() {
            return a.f33785a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ tw(int i, String str, String str2) {
        if (3 != (i & 3)) {
            Q9.G0.a(i, 3, a.f33785a.getDescriptor());
            throw null;
        }
        this.f33783a = str;
        this.f33784b = str2;
    }

    public final String a() {
        return this.f33783a;
    }

    public final String b() {
        return this.f33784b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw)) {
            return false;
        }
        tw twVar = (tw) obj;
        return kotlin.jvm.internal.l.b(this.f33783a, twVar.f33783a) && kotlin.jvm.internal.l.b(this.f33784b, twVar.f33784b);
    }

    public final int hashCode() {
        return this.f33784b.hashCode() + (this.f33783a.hashCode() * 31);
    }

    public final String toString() {
        return Oo.h("DebugPanelBiddingParameter(name=", this.f33783a, ", value=", this.f33784b, ")");
    }

    public static final /* synthetic */ void a(tw twVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.k(c1547o0, 0, twVar.f33783a);
        cVar.k(c1547o0, 1, twVar.f33784b);
    }
}
