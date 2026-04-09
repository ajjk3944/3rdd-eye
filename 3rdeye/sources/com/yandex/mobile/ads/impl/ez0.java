package com.yandex.mobile.ads.impl;

import Q9.C1526e;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

@M9.h
/* loaded from: classes3.dex */
public final class ez0 {
    public static final b Companion = new b(0);

    /* renamed from: e, reason: collision with root package name */
    private static final M9.b<Object>[] f27118e = {null, null, null, new C1526e(c.a.f27128a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f27119a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27120b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27121c;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f27122d;

    public static final class a implements Q9.H<ez0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27123a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f27124b;

        static {
            a aVar = new a();
            f27123a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", aVar, 4);
            c1547o0.k(AppMeasurementSdk.ConditionalUserProperty.NAME, false);
            c1547o0.k(FacebookMediationAdapter.KEY_ID, false);
            c1547o0.k("version", false);
            c1547o0.k("adapters", false);
            f27124b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            M9.b<?>[] bVarArr = ez0.f27118e;
            Q9.C0 c02 = Q9.C0.f11399a;
            return new M9.b[]{c02, c02, N9.a.b(c02), bVarArr[3]};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f27124b;
            P9.b bVarD = decoder.d(c1547o0);
            M9.b[] bVarArr = ez0.f27118e;
            int i = 0;
            String strN = null;
            String strN2 = null;
            String str = null;
            List list = null;
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
                    str = (String) bVarD.G(c1547o0, 2, Q9.C0.f11399a, str);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new M9.n(iX);
                    }
                    list = (List) bVarD.h(c1547o0, 3, bVarArr[3], list);
                    i |= 8;
                }
            }
            bVarD.b(c1547o0);
            return new ez0(i, strN, strN2, str, list);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f27124b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            ez0 value = (ez0) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f27124b;
            P9.c cVarD = encoder.d(c1547o0);
            ez0.a(value, cVarD, c1547o0);
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

        public final M9.b<ez0> serializer() {
            return a.f27123a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    @M9.h
    public static final class c {
        public static final b Companion = new b(0);

        /* renamed from: a, reason: collision with root package name */
        private final String f27125a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27126b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27127c;

        public static final class a implements Q9.H<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27128a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C1547o0 f27129b;

            static {
                a aVar = new a();
                f27128a = aVar;
                C1547o0 c1547o0 = new C1547o0("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", aVar, 3);
                c1547o0.k("format", false);
                c1547o0.k("version", false);
                c1547o0.k("isIntegrated", false);
                f27129b = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public final M9.b<?>[] childSerializers() {
                Q9.C0 c02 = Q9.C0.f11399a;
                return new M9.b[]{c02, N9.a.b(c02), C1532h.f11487a};
            }

            @Override // M9.b
            public final Object deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                C1547o0 c1547o0 = f27129b;
                P9.b bVarD = decoder.d(c1547o0);
                String strN = null;
                boolean z10 = true;
                int i = 0;
                boolean zI = false;
                String str = null;
                while (z10) {
                    int iX = bVarD.x(c1547o0);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        strN = bVarD.n(c1547o0, 0);
                        i |= 1;
                    } else if (iX == 1) {
                        str = (String) bVarD.G(c1547o0, 1, Q9.C0.f11399a, str);
                        i |= 2;
                    } else {
                        if (iX != 2) {
                            throw new M9.n(iX);
                        }
                        zI = bVarD.I(c1547o0, 2);
                        i |= 4;
                    }
                }
                bVarD.b(c1547o0);
                return new c(i, strN, str, zI);
            }

            @Override // M9.b
            public final O9.e getDescriptor() {
                return f27129b;
            }

            @Override // M9.b
            public final void serialize(P9.e encoder, Object obj) {
                c value = (c) obj;
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                C1547o0 c1547o0 = f27129b;
                P9.c cVarD = encoder.d(c1547o0);
                c.a(value, cVarD, c1547o0);
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

            public final M9.b<c> serializer() {
                return a.f27128a;
            }

            public /* synthetic */ b(int i) {
                this();
            }
        }

        public /* synthetic */ c(int i, String str, String str2, boolean z10) {
            if (7 != (i & 7)) {
                Q9.G0.a(i, 7, a.f27128a.getDescriptor());
                throw null;
            }
            this.f27125a = str;
            this.f27126b = str2;
            this.f27127c = z10;
        }

        public final String a() {
            return this.f27125a;
        }

        public final String b() {
            return this.f27126b;
        }

        public final boolean c() {
            return this.f27127c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.l.b(this.f27125a, cVar.f27125a) && kotlin.jvm.internal.l.b(this.f27126b, cVar.f27126b) && this.f27127c == cVar.f27127c;
        }

        public final int hashCode() {
            int iHashCode = this.f27125a.hashCode() * 31;
            String str = this.f27126b;
            return (this.f27127c ? 1231 : 1237) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            String str = this.f27125a;
            String str2 = this.f27126b;
            return androidx.work.s.h(j6.l.d("MediationAdapterData(format=", str, ", version=", str2, ", isIntegrated="), this.f27127c, ")");
        }

        public c(String format, String str, boolean z10) {
            kotlin.jvm.internal.l.f(format, "format");
            this.f27125a = format;
            this.f27126b = str;
            this.f27127c = z10;
        }

        public static final /* synthetic */ void a(c cVar, P9.c cVar2, C1547o0 c1547o0) {
            cVar2.k(c1547o0, 0, cVar.f27125a);
            cVar2.w(c1547o0, 1, Q9.C0.f11399a, cVar.f27126b);
            cVar2.B(c1547o0, 2, cVar.f27127c);
        }
    }

    public /* synthetic */ ez0(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            Q9.G0.a(i, 15, a.f27123a.getDescriptor());
            throw null;
        }
        this.f27119a = str;
        this.f27120b = str2;
        this.f27121c = str3;
        this.f27122d = list;
    }

    public static final /* synthetic */ void a(ez0 ez0Var, P9.c cVar, C1547o0 c1547o0) {
        M9.b<Object>[] bVarArr = f27118e;
        cVar.k(c1547o0, 0, ez0Var.f27119a);
        cVar.k(c1547o0, 1, ez0Var.f27120b);
        cVar.w(c1547o0, 2, Q9.C0.f11399a, ez0Var.f27121c);
        cVar.y(c1547o0, 3, bVarArr[3], ez0Var.f27122d);
    }

    public final List<c> b() {
        return this.f27122d;
    }

    public final String c() {
        return this.f27120b;
    }

    public final String d() {
        return this.f27119a;
    }

    public final String e() {
        return this.f27121c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez0)) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        return kotlin.jvm.internal.l.b(this.f27119a, ez0Var.f27119a) && kotlin.jvm.internal.l.b(this.f27120b, ez0Var.f27120b) && kotlin.jvm.internal.l.b(this.f27121c, ez0Var.f27121c) && kotlin.jvm.internal.l.b(this.f27122d, ez0Var.f27122d);
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f27120b, this.f27119a.hashCode() * 31, 31);
        String str = this.f27121c;
        return this.f27122d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.f27119a;
        String str2 = this.f27120b;
        String str3 = this.f27121c;
        List<c> list = this.f27122d;
        StringBuilder sbD = j6.l.d("MediationNetworkData(name=", str, ", id=", str2, ", version=");
        sbD.append(str3);
        sbD.append(", adapters=");
        sbD.append(list);
        sbD.append(")");
        return sbD.toString();
    }

    public ez0(String name, String id, String str, ArrayList adapters) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(id, "id");
        kotlin.jvm.internal.l.f(adapters, "adapters");
        this.f27119a = name;
        this.f27120b = id;
        this.f27121c = str;
        this.f27122d = adapters;
    }
}
