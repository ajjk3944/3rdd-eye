package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class mw {

    /* renamed from: a, reason: collision with root package name */
    private final String f30527a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30528b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30529c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30530d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30531e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30532f;

    /* renamed from: g, reason: collision with root package name */
    private final a f30533g;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f30534h;

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.mw$a$a, reason: collision with other inner class name */
        public static final class C0413a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0413a f30535a = new C0413a();

            private C0413a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final gz0 f30536a;

            public b() {
                gz0 error = gz0.f28043b;
                kotlin.jvm.internal.l.f(error, "error");
                this.f30536a = error;
            }

            public final gz0 a() {
                return this.f30536a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f30536a == ((b) obj).f30536a;
            }

            public final int hashCode() {
                return this.f30536a.hashCode();
            }

            public final String toString() {
                return "InvalidIntegration(error=" + this.f30536a + ")";
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f30537a = new c();

            private c() {
            }
        }
    }

    public mw(String name, String str, boolean z10, String str2, String str3, String str4, a adapterStatus, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(adapterStatus, "adapterStatus");
        this.f30527a = name;
        this.f30528b = str;
        this.f30529c = z10;
        this.f30530d = str2;
        this.f30531e = str3;
        this.f30532f = str4;
        this.f30533g = adapterStatus;
        this.f30534h = arrayList;
    }

    public final a a() {
        return this.f30533g;
    }

    public final String b() {
        return this.f30530d;
    }

    public final String c() {
        return this.f30531e;
    }

    public final String d() {
        return this.f30528b;
    }

    public final String e() {
        return this.f30527a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return kotlin.jvm.internal.l.b(this.f30527a, mwVar.f30527a) && kotlin.jvm.internal.l.b(this.f30528b, mwVar.f30528b) && this.f30529c == mwVar.f30529c && kotlin.jvm.internal.l.b(this.f30530d, mwVar.f30530d) && kotlin.jvm.internal.l.b(this.f30531e, mwVar.f30531e) && kotlin.jvm.internal.l.b(this.f30532f, mwVar.f30532f) && kotlin.jvm.internal.l.b(this.f30533g, mwVar.f30533g) && kotlin.jvm.internal.l.b(this.f30534h, mwVar.f30534h);
    }

    public final String f() {
        return this.f30532f;
    }

    public final int hashCode() {
        int iHashCode = this.f30527a.hashCode() * 31;
        String str = this.f30528b;
        int iA = m6.a(this.f30529c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f30530d;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30531e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30532f;
        int iHashCode4 = (this.f30533g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List<String> list = this.f30534h;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30527a;
        String str2 = this.f30528b;
        boolean z10 = this.f30529c;
        String str3 = this.f30530d;
        String str4 = this.f30531e;
        String str5 = this.f30532f;
        a aVar = this.f30533g;
        List<String> list = this.f30534h;
        StringBuilder sbD = j6.l.d("DebugPanelAdapterData(name=", str, ", logoUrl=", str2, ", adapterIntegrationStatus=");
        sbD.append(z10);
        sbD.append(", adapterVersion=");
        sbD.append(str3);
        sbD.append(", latestAdapterVersion=");
        com.google.android.gms.measurement.internal.a.l(sbD, str4, ", sdkVersion=", str5, ", adapterStatus=");
        sbD.append(aVar);
        sbD.append(", formats=");
        sbD.append(list);
        sbD.append(")");
        return sbD.toString();
    }
}
