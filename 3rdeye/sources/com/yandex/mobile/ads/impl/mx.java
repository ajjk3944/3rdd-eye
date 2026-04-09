package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.cw;
import com.yandex.mobile.ads.impl.lx;
import com.yandex.mobile.ads.impl.pw;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class mx {
    public static final b Companion = new b(0);

    /* renamed from: h, reason: collision with root package name */
    private static final M9.b<Object>[] f30561h = {null, null, null, null, new C1526e(pw.a.f31928a), new C1526e(cw.a.f25779a), new C1526e(lx.a.f30122a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f30562a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30563b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30564c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30565d;

    /* renamed from: e, reason: collision with root package name */
    private final List<pw> f30566e;

    /* renamed from: f, reason: collision with root package name */
    private final List<cw> f30567f;

    /* renamed from: g, reason: collision with root package name */
    private final List<lx> f30568g;

    public static final class a implements Q9.H<mx> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30569a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f30570b;

        static {
            a aVar = new a();
            f30569a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", aVar, 7);
            c1547o0.k("page_id", true);
            c1547o0.k("latest_sdk_version", true);
            c1547o0.k("app_ads_txt_url", true);
            c1547o0.k("app_status", true);
            c1547o0.k("alerts", true);
            c1547o0.k("ad_units", true);
            c1547o0.k("mediation_networks", false);
            f30570b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = mx.f30561h;
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(c02), N9.a.b(c02), N9.a.b(bVarArr[4]), N9.a.b(bVarArr[5]), bVarArr[6]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f30570b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = mx.f30561h;
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            List list2 = null;
            List list3 = null;
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
                        str2 = (String) bVarD.G(c1547o0, 1, Q9.C0.f11399a, str2);
                        i |= 2;
                        break;
                    case 2:
                        str3 = (String) bVarD.G(c1547o0, 2, Q9.C0.f11399a, str3);
                        i |= 4;
                        break;
                    case 3:
                        str4 = (String) bVarD.G(c1547o0, 3, Q9.C0.f11399a, str4);
                        i |= 8;
                        break;
                    case 4:
                        list = (List) bVarD.G(c1547o0, 4, bVarArr[4], list);
                        i |= 16;
                        break;
                    case 5:
                        list2 = (List) bVarD.G(c1547o0, 5, bVarArr[5], list2);
                        i |= 32;
                        break;
                    case 6:
                        list3 = (List) bVarD.h(c1547o0, 6, bVarArr[6], list3);
                        i |= 64;
                        break;
                    default:
                        throw new M9.n(iX);
                }
            }
            bVarD.b(c1547o0);
            return new mx(i, str, str2, str3, str4, list, list2, list3);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f30570b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            mx value = (mx) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f30570b;
            P9.c cVarD = encoder.d(c1547o0);
            mx.a(value, cVarD, c1547o0);
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

        public final M9.b<mx> serializer() {
            return a.f30569a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ mx(int i, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i & 64)) {
            Q9.G0.a(i, 64, a.f30569a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f30562a = null;
        } else {
            this.f30562a = str;
        }
        if ((i & 2) == 0) {
            this.f30563b = null;
        } else {
            this.f30563b = str2;
        }
        if ((i & 4) == 0) {
            this.f30564c = null;
        } else {
            this.f30564c = str3;
        }
        if ((i & 8) == 0) {
            this.f30565d = null;
        } else {
            this.f30565d = str4;
        }
        if ((i & 16) == 0) {
            this.f30566e = null;
        } else {
            this.f30566e = list;
        }
        if ((i & 32) == 0) {
            this.f30567f = null;
        } else {
            this.f30567f = list2;
        }
        this.f30568g = list3;
    }

    public static final /* synthetic */ void a(mx mxVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f30561h;
        if (cVar.F(c1547o0, 0) || mxVar.f30562a != null) {
            cVar.w(c1547o0, 0, Q9.C0.f11399a, mxVar.f30562a);
        }
        if (cVar.F(c1547o0, 1) || mxVar.f30563b != null) {
            cVar.w(c1547o0, 1, Q9.C0.f11399a, mxVar.f30563b);
        }
        if (cVar.F(c1547o0, 2) || mxVar.f30564c != null) {
            cVar.w(c1547o0, 2, Q9.C0.f11399a, mxVar.f30564c);
        }
        if (cVar.F(c1547o0, 3) || mxVar.f30565d != null) {
            cVar.w(c1547o0, 3, Q9.C0.f11399a, mxVar.f30565d);
        }
        if (cVar.F(c1547o0, 4) || mxVar.f30566e != null) {
            cVar.w(c1547o0, 4, bVarArr[4], mxVar.f30566e);
        }
        if (cVar.F(c1547o0, 5) || mxVar.f30567f != null) {
            cVar.w(c1547o0, 5, bVarArr[5], mxVar.f30567f);
        }
        cVar.y(c1547o0, 6, bVarArr[6], mxVar.f30568g);
    }

    public final List<cw> b() {
        return this.f30567f;
    }

    public final List<pw> c() {
        return this.f30566e;
    }

    public final String d() {
        return this.f30564c;
    }

    public final String e() {
        return this.f30565d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj;
        return kotlin.jvm.internal.l.b(this.f30562a, mxVar.f30562a) && kotlin.jvm.internal.l.b(this.f30563b, mxVar.f30563b) && kotlin.jvm.internal.l.b(this.f30564c, mxVar.f30564c) && kotlin.jvm.internal.l.b(this.f30565d, mxVar.f30565d) && kotlin.jvm.internal.l.b(this.f30566e, mxVar.f30566e) && kotlin.jvm.internal.l.b(this.f30567f, mxVar.f30567f) && kotlin.jvm.internal.l.b(this.f30568g, mxVar.f30568g);
    }

    public final List<lx> f() {
        return this.f30568g;
    }

    public final String g() {
        return this.f30562a;
    }

    public final int hashCode() {
        String str = this.f30562a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30563b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30564c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30565d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<pw> list = this.f30566e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<cw> list2 = this.f30567f;
        return this.f30568g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f30562a;
        String str2 = this.f30563b;
        String str3 = this.f30564c;
        String str4 = this.f30565d;
        List<pw> list = this.f30566e;
        List<cw> list2 = this.f30567f;
        List<lx> list3 = this.f30568g;
        StringBuilder sbD = j6.l.d("DebugPanelRemoteData(pageId=", str, ", latestSdkVersion=", str2, ", appAdsTxtUrl=");
        com.google.android.gms.measurement.internal.a.l(sbD, str3, ", appStatus=", str4, ", alerts=");
        sbD.append(list);
        sbD.append(", adUnits=");
        sbD.append(list2);
        sbD.append(", mediationNetworks=");
        return C1094a9.h(sbD, list3, ")");
    }
}
