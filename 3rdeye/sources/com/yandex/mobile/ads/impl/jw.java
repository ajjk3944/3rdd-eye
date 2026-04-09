package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1547o0;
import Q9.C1549p0;
import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.mobile.ads.impl.gy;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.iy;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class jw {
    public static final b Companion = new b(0);

    /* renamed from: g, reason: collision with root package name */
    private static final M9.b<Object>[] f29361g = {null, null, new C1526e(iy.a.f28895a), null, null, new C1526e(gy.a.f28030a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f29362a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29363b;

    /* renamed from: c, reason: collision with root package name */
    private final List<iy> f29364c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29365d;

    /* renamed from: e, reason: collision with root package name */
    private final hy f29366e;

    /* renamed from: f, reason: collision with root package name */
    private final List<gy> f29367f;

    public static final class a implements Q9.H<jw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29368a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f29369b;

        static {
            a aVar = new a();
            f29368a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", aVar, 6);
            c1547o0.k("adapter", true);
            c1547o0.k("network_name", false);
            c1547o0.k("waterfall_parameters", false);
            c1547o0.k("network_ad_unit_id_name", true);
            c1547o0.k(AppLovinEventParameters.REVENUE_CURRENCY, false);
            c1547o0.k("cpm_floors", false);
            f29369b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = jw.f29361g;
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{N9.a.b(c02), c02, bVarArr[2], N9.a.b(c02), N9.a.b(hy.a.f28416a), bVarArr[5]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f29369b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = jw.f29361g;
            int i = 0;
            String str = null;
            String strN = null;
            List list = null;
            String str2 = null;
            hy hyVar = null;
            List list2 = null;
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
                        list = (List) bVarD.h(c1547o0, 2, bVarArr[2], list);
                        i |= 4;
                        break;
                    case 3:
                        str2 = (String) bVarD.G(c1547o0, 3, Q9.C0.f11399a, str2);
                        i |= 8;
                        break;
                    case 4:
                        hyVar = (hy) bVarD.G(c1547o0, 4, hy.a.f28416a, hyVar);
                        i |= 16;
                        break;
                    case 5:
                        list2 = (List) bVarD.h(c1547o0, 5, bVarArr[5], list2);
                        i |= 32;
                        break;
                    default:
                        throw new M9.n(iX);
                }
            }
            bVarD.b(c1547o0);
            return new jw(i, str, strN, list, str2, hyVar, list2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f29369b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            jw value = (jw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f29369b;
            P9.c cVarD = encoder.d(c1547o0);
            jw.a(value, cVarD, c1547o0);
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

        public final M9.b<jw> serializer() {
            return a.f29368a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ jw(int i, String str, String str2, List list, String str3, hy hyVar, List list2) {
        if (54 != (i & 54)) {
            Q9.G0.a(i, 54, a.f29368a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f29362a = null;
        } else {
            this.f29362a = str;
        }
        this.f29363b = str2;
        this.f29364c = list;
        if ((i & 8) == 0) {
            this.f29365d = null;
        } else {
            this.f29365d = str3;
        }
        this.f29366e = hyVar;
        this.f29367f = list2;
    }

    public static final /* synthetic */ void a(jw jwVar, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f29361g;
        if (cVar.F(c1547o0, 0) || jwVar.f29362a != null) {
            cVar.w(c1547o0, 0, Q9.C0.f11399a, jwVar.f29362a);
        }
        cVar.k(c1547o0, 1, jwVar.f29363b);
        cVar.y(c1547o0, 2, bVarArr[2], jwVar.f29364c);
        if (cVar.F(c1547o0, 3) || jwVar.f29365d != null) {
            cVar.w(c1547o0, 3, Q9.C0.f11399a, jwVar.f29365d);
        }
        cVar.w(c1547o0, 4, hy.a.f28416a, jwVar.f29366e);
        cVar.y(c1547o0, 5, bVarArr[5], jwVar.f29367f);
    }

    public final List<gy> b() {
        return this.f29367f;
    }

    public final hy c() {
        return this.f29366e;
    }

    public final String d() {
        return this.f29365d;
    }

    public final String e() {
        return this.f29363b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return kotlin.jvm.internal.l.b(this.f29362a, jwVar.f29362a) && kotlin.jvm.internal.l.b(this.f29363b, jwVar.f29363b) && kotlin.jvm.internal.l.b(this.f29364c, jwVar.f29364c) && kotlin.jvm.internal.l.b(this.f29365d, jwVar.f29365d) && kotlin.jvm.internal.l.b(this.f29366e, jwVar.f29366e) && kotlin.jvm.internal.l.b(this.f29367f, jwVar.f29367f);
    }

    public final List<iy> f() {
        return this.f29364c;
    }

    public final int hashCode() {
        String str = this.f29362a;
        int iA = m9.a(this.f29364c, C4121h3.a(this.f29363b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f29365d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        hy hyVar = this.f29366e;
        return this.f29367f.hashCode() + ((iHashCode + (hyVar != null ? hyVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f29362a;
        String str2 = this.f29363b;
        List<iy> list = this.f29364c;
        String str3 = this.f29365d;
        hy hyVar = this.f29366e;
        List<gy> list2 = this.f29367f;
        StringBuilder sbD = j6.l.d("DebugPanelAdUnitWaterfallMediation(adapter=", str, ", networkName=", str2, ", waterfallParameters=");
        sbD.append(list);
        sbD.append(", networkAdUnitIdName=");
        sbD.append(str3);
        sbD.append(", currency=");
        sbD.append(hyVar);
        sbD.append(", cpmFloors=");
        sbD.append(list2);
        sbD.append(")");
        return sbD.toString();
    }
}
