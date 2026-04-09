package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.tw;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class dw {
    public static final b Companion = new b(0);

    /* renamed from: f, reason: collision with root package name */
    private static final M9.b<Object>[] f26499f = {null, null, new C1526e(tw.a.f33785a), null, null};

    /* renamed from: a, reason: collision with root package name */
    private final String f26500a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26501b;

    /* renamed from: c, reason: collision with root package name */
    private final List<tw> f26502c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26503d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26504e;

    public static final class a implements Q9.H<dw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26505a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f26506b;

        static {
            a aVar = new a();
            f26505a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", aVar, 5);
            c1547o0.k("adapter", true);
            c1547o0.k("network_name", false);
            c1547o0.k("bidding_parameters", false);
            c1547o0.k("network_ad_unit_id", true);
            c1547o0.k("network_ad_unit_id_name", true);
            f26506b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = dw.f26499f;
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{N9.a.b(c02), c02, bVarArr[2], N9.a.b(c02), N9.a.b(c02)};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f26506b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = dw.f26499f;
            int i = 0;
            String str = null;
            String strN = null;
            List list = null;
            String str2 = null;
            String str3 = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    str = (String) bVarD.G(c1547o0, 0, Q9.C0.f11399a, str);
                    i |= 1;
                } else if (iX == 1) {
                    strN = bVarD.n(c1547o0, 1);
                    i |= 2;
                } else if (iX == 2) {
                    list = (List) bVarD.h(c1547o0, 2, bVarArr[2], list);
                    i |= 4;
                } else if (iX == 3) {
                    str2 = (String) bVarD.G(c1547o0, 3, Q9.C0.f11399a, str2);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new M9.n(iX);
                    }
                    str3 = (String) bVarD.G(c1547o0, 4, Q9.C0.f11399a, str3);
                    i |= 16;
                }
            }
            bVarD.b(c1547o0);
            return new dw(i, str, strN, list, str2, str3);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f26506b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            dw value = (dw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f26506b;
            P9.c cVarD = encoder.d(c1547o0);
            dw.a(value, cVarD, c1547o0);
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

        public final M9.b<dw> serializer() {
            return a.f26505a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ dw(int i, String str, String str2, List list, String str3, String str4) {
        if (6 != (i & 6)) {
            Q9.G0.a(i, 6, a.f26505a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f26500a = null;
        } else {
            this.f26500a = str;
        }
        this.f26501b = str2;
        this.f26502c = list;
        if ((i & 8) == 0) {
            this.f26503d = null;
        } else {
            this.f26503d = str3;
        }
        if ((i & 16) == 0) {
            this.f26504e = null;
        } else {
            this.f26504e = str4;
        }
    }

    public static final /* synthetic */ void a(dw dwVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f26499f;
        if (cVar.F(c1547o0, 0) || dwVar.f26500a != null) {
            cVar.w(c1547o0, 0, Q9.C0.f11399a, dwVar.f26500a);
        }
        cVar.k(c1547o0, 1, dwVar.f26501b);
        cVar.y(c1547o0, 2, bVarArr[2], dwVar.f26502c);
        if (cVar.F(c1547o0, 3) || dwVar.f26503d != null) {
            cVar.w(c1547o0, 3, Q9.C0.f11399a, dwVar.f26503d);
        }
        if (!cVar.F(c1547o0, 4) && dwVar.f26504e == null) {
            return;
        }
        cVar.w(c1547o0, 4, Q9.C0.f11399a, dwVar.f26504e);
    }

    public final String b() {
        return this.f26503d;
    }

    public final List<tw> c() {
        return this.f26502c;
    }

    public final String d() {
        return this.f26504e;
    }

    public final String e() {
        return this.f26501b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return kotlin.jvm.internal.l.b(this.f26500a, dwVar.f26500a) && kotlin.jvm.internal.l.b(this.f26501b, dwVar.f26501b) && kotlin.jvm.internal.l.b(this.f26502c, dwVar.f26502c) && kotlin.jvm.internal.l.b(this.f26503d, dwVar.f26503d) && kotlin.jvm.internal.l.b(this.f26504e, dwVar.f26504e);
    }

    public final int hashCode() {
        String str = this.f26500a;
        int iA = m9.a(this.f26502c, C4121h3.a(this.f26501b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f26503d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26504e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f26500a;
        String str2 = this.f26501b;
        List<tw> list = this.f26502c;
        String str3 = this.f26503d;
        String str4 = this.f26504e;
        StringBuilder sbD = j6.l.d("DebugPanelAdUnitBiddingMediation(adapter=", str, ", networkName=", str2, ", biddingParameters=");
        sbD.append(list);
        sbD.append(", adUnitId=");
        sbD.append(str3);
        sbD.append(", networkAdUnitIdName=");
        return B4.f.c(sbD, str4, ")");
    }
}
