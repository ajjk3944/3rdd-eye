package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class hw {

    /* renamed from: a, reason: collision with root package name */
    private final String f28388a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28389b;

    /* renamed from: c, reason: collision with root package name */
    private final List<kx> f28390c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28391d;

    /* renamed from: e, reason: collision with root package name */
    private final String f28392e;

    /* renamed from: f, reason: collision with root package name */
    private final a f28393f;

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.hw$a$a, reason: collision with other inner class name */
        public static final class C0406a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0406a f28394a = new C0406a();

            private C0406a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final hy f28395a;

            /* renamed from: b, reason: collision with root package name */
            private final List<gy> f28396b;

            public b(hy hyVar, List<gy> cpmFloors) {
                kotlin.jvm.internal.l.f(cpmFloors, "cpmFloors");
                this.f28395a = hyVar;
                this.f28396b = cpmFloors;
            }

            public final List<gy> a() {
                return this.f28396b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.l.b(this.f28395a, bVar.f28395a) && kotlin.jvm.internal.l.b(this.f28396b, bVar.f28396b);
            }

            public final int hashCode() {
                hy hyVar = this.f28395a;
                return this.f28396b.hashCode() + ((hyVar == null ? 0 : hyVar.hashCode()) * 31);
            }

            public final String toString() {
                return "Waterfall(currency=" + this.f28395a + ", cpmFloors=" + this.f28396b + ")";
            }
        }
    }

    public hw(String str, String adapterName, ArrayList parameters, String str2, String str3, a type) {
        kotlin.jvm.internal.l.f(adapterName, "adapterName");
        kotlin.jvm.internal.l.f(parameters, "parameters");
        kotlin.jvm.internal.l.f(type, "type");
        this.f28388a = str;
        this.f28389b = adapterName;
        this.f28390c = parameters;
        this.f28391d = str2;
        this.f28392e = str3;
        this.f28393f = type;
    }

    public final String a() {
        return this.f28391d;
    }

    public final String b() {
        return this.f28389b;
    }

    public final String c() {
        return this.f28388a;
    }

    public final String d() {
        return this.f28392e;
    }

    public final List<kx> e() {
        return this.f28390c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        return kotlin.jvm.internal.l.b(this.f28388a, hwVar.f28388a) && kotlin.jvm.internal.l.b(this.f28389b, hwVar.f28389b) && kotlin.jvm.internal.l.b(this.f28390c, hwVar.f28390c) && kotlin.jvm.internal.l.b(this.f28391d, hwVar.f28391d) && kotlin.jvm.internal.l.b(this.f28392e, hwVar.f28392e) && kotlin.jvm.internal.l.b(this.f28393f, hwVar.f28393f);
    }

    public final a f() {
        return this.f28393f;
    }

    public final int hashCode() {
        String str = this.f28388a;
        int iA = m9.a(this.f28390c, C4121h3.a(this.f28389b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f28391d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28392e;
        return this.f28393f.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f28388a;
        String str2 = this.f28389b;
        List<kx> list = this.f28390c;
        String str3 = this.f28391d;
        String str4 = this.f28392e;
        a aVar = this.f28393f;
        StringBuilder sbD = j6.l.d("DebugPanelAdUnitMediationAdapterData(logoUrl=", str, ", adapterName=", str2, ", parameters=");
        sbD.append(list);
        sbD.append(", adUnitId=");
        sbD.append(str3);
        sbD.append(", networkAdUnitIdName=");
        sbD.append(str4);
        sbD.append(", type=");
        sbD.append(aVar);
        sbD.append(")");
        return sbD.toString();
    }
}
