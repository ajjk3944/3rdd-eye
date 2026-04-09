package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class lx {
    public static final b Companion = new b(0);

    /* renamed from: g, reason: collision with root package name */
    private static final M9.b<Object>[] f30115g = {null, null, null, null, new C1526e(Q9.C0.f11399a), null};

    /* renamed from: a, reason: collision with root package name */
    private final String f30116a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30117b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30118c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30119d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f30120e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30121f;

    public static final class a implements Q9.H<lx> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30122a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f30123b;

        static {
            a aVar = new a();
            f30122a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", aVar, 6);
            c1547o0.k(FacebookMediationAdapter.KEY_ID, true);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k("logo_url", true);
            c1547o0.k("adapter_status", true);
            c1547o0.k("adapters", false);
            c1547o0.k("latest_adapter_version", true);
            f30123b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = lx.f30115g;
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{N9.a.b(c02), c02, N9.a.b(c02), N9.a.b(c02), bVarArr[4], N9.a.b(c02)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f30123b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = lx.f30115g;
            int i = 0;
            String str = null;
            String strN = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            String str4 = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                switch (iX) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        str = (String) bVarD.G(c1547o0, 0, Q9.C0.f11399a, str);
                        i |= 1;
                        break;
                    case 1:
                        strN = bVarD.n(c1547o0, 1);
                        i |= 2;
                        break;
                    case 2:
                        str2 = (String) bVarD.G(c1547o0, 2, Q9.C0.f11399a, str2);
                        i |= 4;
                        break;
                    case 3:
                        str3 = (String) bVarD.G(c1547o0, 3, Q9.C0.f11399a, str3);
                        i |= 8;
                        break;
                    case 4:
                        list = (List) bVarD.h(c1547o0, 4, bVarArr[4], list);
                        i |= 16;
                        break;
                    case 5:
                        str4 = (String) bVarD.G(c1547o0, 5, Q9.C0.f11399a, str4);
                        i |= 32;
                        break;
                    default:
                        throw new M9.n(iX);
                }
            }
            bVarD.b(c1547o0);
            return new lx(i, str, strN, str2, str3, list, str4);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f30123b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            lx value = (lx) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f30123b;
            P9.c cVarD = encoder.d(c1547o0);
            lx.a(value, cVarD, c1547o0);
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

        public final M9.b<lx> serializer() {
            return a.f30122a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ lx(int i, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i & 18)) {
            Q9.G0.a(i, 18, a.f30122a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f30116a = null;
        } else {
            this.f30116a = str;
        }
        this.f30117b = str2;
        if ((i & 4) == 0) {
            this.f30118c = null;
        } else {
            this.f30118c = str3;
        }
        if ((i & 8) == 0) {
            this.f30119d = null;
        } else {
            this.f30119d = str4;
        }
        this.f30120e = list;
        if ((i & 32) == 0) {
            this.f30121f = null;
        } else {
            this.f30121f = str5;
        }
    }

    public static final /* synthetic */ void a(lx lxVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f30115g;
        if (cVar.F(c1547o0, 0) || lxVar.f30116a != null) {
            cVar.w(c1547o0, 0, Q9.C0.f11399a, lxVar.f30116a);
        }
        cVar.k(c1547o0, 1, lxVar.f30117b);
        if (cVar.F(c1547o0, 2) || lxVar.f30118c != null) {
            cVar.w(c1547o0, 2, Q9.C0.f11399a, lxVar.f30118c);
        }
        if (cVar.F(c1547o0, 3) || lxVar.f30119d != null) {
            cVar.w(c1547o0, 3, Q9.C0.f11399a, lxVar.f30119d);
        }
        cVar.y(c1547o0, 4, bVarArr[4], lxVar.f30120e);
        if (!cVar.F(c1547o0, 5) && lxVar.f30121f == null) {
            return;
        }
        cVar.w(c1547o0, 5, Q9.C0.f11399a, lxVar.f30121f);
    }

    public final List<String> b() {
        return this.f30120e;
    }

    public final String c() {
        return this.f30116a;
    }

    public final String d() {
        return this.f30121f;
    }

    public final String e() {
        return this.f30118c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return kotlin.jvm.internal.l.b(this.f30116a, lxVar.f30116a) && kotlin.jvm.internal.l.b(this.f30117b, lxVar.f30117b) && kotlin.jvm.internal.l.b(this.f30118c, lxVar.f30118c) && kotlin.jvm.internal.l.b(this.f30119d, lxVar.f30119d) && kotlin.jvm.internal.l.b(this.f30120e, lxVar.f30120e) && kotlin.jvm.internal.l.b(this.f30121f, lxVar.f30121f);
    }

    public final String f() {
        return this.f30117b;
    }

    public final int hashCode() {
        String str = this.f30116a;
        int iA = C4121h3.a(this.f30117b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f30118c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30119d;
        int iA2 = m9.a(this.f30120e, (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f30121f;
        return iA2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30116a;
        String str2 = this.f30117b;
        String str3 = this.f30118c;
        String str4 = this.f30119d;
        List<String> list = this.f30120e;
        String str5 = this.f30121f;
        StringBuilder sbD = j6.l.d("DebugPanelMediationNetwork(id=", str, ", name=", str2, ", logoUrl=");
        com.google.android.gms.measurement.internal.a.l(sbD, str3, ", adapterStatus=", str4, ", adapters=");
        sbD.append(list);
        sbD.append(", latestAdapterVersion=");
        sbD.append(str5);
        sbD.append(")");
        return sbD.toString();
    }
}
