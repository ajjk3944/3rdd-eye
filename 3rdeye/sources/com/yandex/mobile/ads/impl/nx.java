package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.yandex.mobile.ads.impl.b11;
import com.yandex.mobile.ads.impl.ez0;
import com.yandex.mobile.ads.impl.k11;
import com.yandex.mobile.ads.impl.sw;
import com.yandex.mobile.ads.impl.tx;
import com.yandex.mobile.ads.impl.vw;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class nx {
    public static final b Companion = new b(0);

    /* renamed from: g, reason: collision with root package name */
    private static final M9.b<Object>[] f31036g = {null, null, new C1526e(ez0.a.f27123a), null, new C1526e(k11.a.f29468a), new C1526e(b11.a.f25045a)};

    /* renamed from: a, reason: collision with root package name */
    private final sw f31037a;

    /* renamed from: b, reason: collision with root package name */
    private final tx f31038b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ez0> f31039c;

    /* renamed from: d, reason: collision with root package name */
    private final vw f31040d;

    /* renamed from: e, reason: collision with root package name */
    private final List<k11> f31041e;

    /* renamed from: f, reason: collision with root package name */
    private final List<b11> f31042f;

    public static final class a implements Q9.H<nx> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31043a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f31044b;

        static {
            a aVar = new a();
            f31043a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", aVar, 6);
            c1547o0.k("app_data", false);
            c1547o0.k("sdk_data", false);
            c1547o0.k("adapters_data", false);
            c1547o0.k("consents_data", false);
            c1547o0.k("sdk_logs", false);
            c1547o0.k("network_logs", false);
            f31044b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = nx.f31036g;
            return new M9.b[]{sw.a.f33299a, tx.a.f33799a, bVarArr[2], vw.a.f34716a, bVarArr[4], bVarArr[5]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f31044b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = nx.f31036g;
            int i = 0;
            sw swVar = null;
            tx txVar = null;
            List list = null;
            vw vwVar = null;
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
                        swVar = (sw) bVarD.h(c1547o0, 0, sw.a.f33299a, swVar);
                        i |= 1;
                        break;
                    case 1:
                        txVar = (tx) bVarD.h(c1547o0, 1, tx.a.f33799a, txVar);
                        i |= 2;
                        break;
                    case 2:
                        list = (List) bVarD.h(c1547o0, 2, bVarArr[2], list);
                        i |= 4;
                        break;
                    case 3:
                        vwVar = (vw) bVarD.h(c1547o0, 3, vw.a.f34716a, vwVar);
                        i |= 8;
                        break;
                    case 4:
                        list2 = (List) bVarD.h(c1547o0, 4, bVarArr[4], list2);
                        i |= 16;
                        break;
                    case 5:
                        list3 = (List) bVarD.h(c1547o0, 5, bVarArr[5], list3);
                        i |= 32;
                        break;
                    default:
                        throw new M9.n(iX);
                }
            }
            bVarD.b(c1547o0);
            return new nx(i, swVar, txVar, list, vwVar, list2, list3);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f31044b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            nx value = (nx) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f31044b;
            P9.c cVarD = encoder.d(c1547o0);
            nx.a(value, cVarD, c1547o0);
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

        public final M9.b<nx> serializer() {
            return a.f31043a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ nx(int i, sw swVar, tx txVar, List list, vw vwVar, List list2, List list3) {
        if (63 != (i & 63)) {
            Q9.G0.a(i, 63, a.f31043a.getDescriptor());
            throw null;
        }
        this.f31037a = swVar;
        this.f31038b = txVar;
        this.f31039c = list;
        this.f31040d = vwVar;
        this.f31041e = list2;
        this.f31042f = list3;
    }

    public static final /* synthetic */ void a(nx nxVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f31036g;
        cVar.y(c1547o0, 0, sw.a.f33299a, nxVar.f31037a);
        cVar.y(c1547o0, 1, tx.a.f33799a, nxVar.f31038b);
        cVar.y(c1547o0, 2, bVarArr[2], nxVar.f31039c);
        cVar.y(c1547o0, 3, vw.a.f34716a, nxVar.f31040d);
        cVar.y(c1547o0, 4, bVarArr[4], nxVar.f31041e);
        cVar.y(c1547o0, 5, bVarArr[5], nxVar.f31042f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx)) {
            return false;
        }
        nx nxVar = (nx) obj;
        return kotlin.jvm.internal.l.b(this.f31037a, nxVar.f31037a) && kotlin.jvm.internal.l.b(this.f31038b, nxVar.f31038b) && kotlin.jvm.internal.l.b(this.f31039c, nxVar.f31039c) && kotlin.jvm.internal.l.b(this.f31040d, nxVar.f31040d) && kotlin.jvm.internal.l.b(this.f31041e, nxVar.f31041e) && kotlin.jvm.internal.l.b(this.f31042f, nxVar.f31042f);
    }

    public final int hashCode() {
        return this.f31042f.hashCode() + m9.a(this.f31041e, (this.f31040d.hashCode() + m9.a(this.f31039c, (this.f31038b.hashCode() + (this.f31037a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelReportData(appData=" + this.f31037a + ", sdkData=" + this.f31038b + ", networksData=" + this.f31039c + ", consentsData=" + this.f31040d + ", sdkLogs=" + this.f31041e + ", networkLogs=" + this.f31042f + ")";
    }

    public nx(sw appData, tx sdkData, List<ez0> networksData, vw consentsData, List<k11> sdkLogs, List<b11> networkLogs) {
        kotlin.jvm.internal.l.f(appData, "appData");
        kotlin.jvm.internal.l.f(sdkData, "sdkData");
        kotlin.jvm.internal.l.f(networksData, "networksData");
        kotlin.jvm.internal.l.f(consentsData, "consentsData");
        kotlin.jvm.internal.l.f(sdkLogs, "sdkLogs");
        kotlin.jvm.internal.l.f(networkLogs, "networkLogs");
        this.f31037a = appData;
        this.f31038b = sdkData;
        this.f31039c = networksData;
        this.f31040d = consentsData;
        this.f31041e = sdkLogs;
        this.f31042f = networkLogs;
    }
}
