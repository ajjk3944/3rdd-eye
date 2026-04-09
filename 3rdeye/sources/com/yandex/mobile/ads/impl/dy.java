package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class dy {

    public static final class a extends dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f26524a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26525b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26526c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String format, String id) {
            super(0);
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(format, "format");
            kotlin.jvm.internal.l.f(id, "id");
            this.f26524a = name;
            this.f26525b = format;
            this.f26526c = id;
        }

        public final String a() {
            return this.f26525b;
        }

        public final String b() {
            return this.f26526c;
        }

        public final String c() {
            return this.f26524a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f26524a, aVar.f26524a) && kotlin.jvm.internal.l.b(this.f26525b, aVar.f26525b) && kotlin.jvm.internal.l.b(this.f26526c, aVar.f26526c);
        }

        public final int hashCode() {
            return this.f26526c.hashCode() + C4121h3.a(this.f26525b, this.f26524a.hashCode() * 31, 31);
        }

        public final String toString() {
            String str = this.f26524a;
            String str2 = this.f26525b;
            return B4.f.c(j6.l.d("AdUnit(name=", str, ", format=", str2, ", id="), this.f26526c, ")");
        }
    }

    public static final class b extends dy {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26527a = new b();

        private b() {
            super(0);
        }
    }

    public static final class c extends dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f26528a;

        /* renamed from: b, reason: collision with root package name */
        private final a f26529b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f26530b;

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a[] f26531c;

            static {
                a aVar = new a();
                f26530b = aVar;
                a[] aVarArr = {aVar};
                f26531c = aVarArr;
                com.google.gson.internal.c.l(aVarArr);
            }

            private a() {
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26531c.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            a actionType = a.f26530b;
            kotlin.jvm.internal.l.f(actionType, "actionType");
            this.f26528a = "Enable Test mode";
            this.f26529b = actionType;
        }

        public final a a() {
            return this.f26529b;
        }

        public final String b() {
            return this.f26528a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.l.b(this.f26528a, cVar.f26528a) && this.f26529b == cVar.f26529b;
        }

        public final int hashCode() {
            return this.f26529b.hashCode() + (this.f26528a.hashCode() * 31);
        }

        public final String toString() {
            return "Button(text=" + this.f26528a + ", actionType=" + this.f26529b + ")";
        }
    }

    public static final class d extends dy {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26532a = new d();

        private d() {
            super(0);
        }
    }

    public static final class e extends dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f26533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String text) {
            super(0);
            kotlin.jvm.internal.l.f(text, "text");
            this.f26533a = text;
        }

        public final String a() {
            return this.f26533a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.l.b(this.f26533a, ((e) obj).f26533a);
        }

        public final int hashCode() {
            return this.f26533a.hashCode();
        }

        public final String toString() {
            return C1154e9.i("Header(text=", this.f26533a, ")");
        }
    }

    public static final class f extends dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f26534a;

        /* renamed from: b, reason: collision with root package name */
        private final wx f26535b;

        /* renamed from: c, reason: collision with root package name */
        private final uw f26536c;

        public /* synthetic */ f(String str, wx wxVar) {
            this(str, wxVar, null);
        }

        public final String a() {
            return this.f26534a;
        }

        public final wx b() {
            return this.f26535b;
        }

        public final uw c() {
            return this.f26536c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.l.b(this.f26534a, fVar.f26534a) && kotlin.jvm.internal.l.b(this.f26535b, fVar.f26535b) && kotlin.jvm.internal.l.b(this.f26536c, fVar.f26536c);
        }

        public final int hashCode() {
            String str = this.f26534a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            wx wxVar = this.f26535b;
            int iHashCode2 = (iHashCode + (wxVar == null ? 0 : wxVar.hashCode())) * 31;
            uw uwVar = this.f26536c;
            return iHashCode2 + (uwVar != null ? uwVar.hashCode() : 0);
        }

        public final String toString() {
            return "KeyValue(title=" + this.f26534a + ", subtitle=" + this.f26535b + ", text=" + this.f26536c + ")";
        }

        public f(String str, wx wxVar, uw uwVar) {
            super(0);
            this.f26534a = str;
            this.f26535b = wxVar;
            this.f26536c = uwVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(String title, String text) {
            this(title, new wx(text, 0, null, 0, 14));
            kotlin.jvm.internal.l.f(title, "title");
            kotlin.jvm.internal.l.f(text, "text");
        }
    }

    public static final class h extends dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f26547a;

        /* renamed from: b, reason: collision with root package name */
        private final a f26548b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26549c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f26550b;

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a[] f26551c;

            static {
                a aVar = new a();
                f26550b = aVar;
                a[] aVarArr = {aVar};
                f26551c = aVarArr;
                com.google.gson.internal.c.l(aVarArr);
            }

            private a() {
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26551c.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10) {
            super(0);
            a switchType = a.f26550b;
            kotlin.jvm.internal.l.f(switchType, "switchType");
            this.f26547a = "Debug Error Indicator";
            this.f26548b = switchType;
            this.f26549c = z10;
        }

        public final boolean a() {
            return this.f26549c;
        }

        public final a b() {
            return this.f26548b;
        }

        public final String c() {
            return this.f26547a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.l.b(this.f26547a, hVar.f26547a) && this.f26548b == hVar.f26548b && this.f26549c == hVar.f26549c;
        }

        public final int hashCode() {
            return (this.f26549c ? 1231 : 1237) + ((this.f26548b.hashCode() + (this.f26547a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            String str = this.f26547a;
            a aVar = this.f26548b;
            boolean z10 = this.f26549c;
            StringBuilder sb = new StringBuilder("Switch(text=");
            sb.append(str);
            sb.append(", switchType=");
            sb.append(aVar);
            sb.append(", initialState=");
            return androidx.work.s.h(sb, z10, ")");
        }

        @Override // com.yandex.mobile.ads.impl.dy
        public final boolean a(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.l.b(this.f26547a, hVar.f26547a) && this.f26548b == hVar.f26548b;
        }
    }

    private dy() {
    }

    public boolean a(Object obj) {
        return equals(obj);
    }

    public /* synthetic */ dy(int i) {
        this();
    }

    public static final class g extends dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f26537a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26538b;

        /* renamed from: c, reason: collision with root package name */
        private final wx f26539c;

        /* renamed from: d, reason: collision with root package name */
        private final uw f26540d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26541e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26542f;

        /* renamed from: g, reason: collision with root package name */
        private final String f26543g;

        /* renamed from: h, reason: collision with root package name */
        private final List<kx> f26544h;
        private final List<gy> i;

        /* renamed from: j, reason: collision with root package name */
        private final nw f26545j;

        /* renamed from: k, reason: collision with root package name */
        private final String f26546k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String name, String str, wx wxVar, uw infoSecond, String str2, String str3, String str4, List<kx> list, List<gy> list2, nw type, String str5) {
            super(0);
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(infoSecond, "infoSecond");
            kotlin.jvm.internal.l.f(type, "type");
            this.f26537a = name;
            this.f26538b = str;
            this.f26539c = wxVar;
            this.f26540d = infoSecond;
            this.f26541e = str2;
            this.f26542f = str3;
            this.f26543g = str4;
            this.f26544h = list;
            this.i = list2;
            this.f26545j = type;
            this.f26546k = str5;
        }

        public final String a() {
            return this.f26542f;
        }

        public final List<gy> b() {
            return this.i;
        }

        public final wx c() {
            return this.f26539c;
        }

        public final uw d() {
            return this.f26540d;
        }

        public final String e() {
            return this.f26538b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.l.b(this.f26537a, gVar.f26537a) && kotlin.jvm.internal.l.b(this.f26538b, gVar.f26538b) && kotlin.jvm.internal.l.b(this.f26539c, gVar.f26539c) && kotlin.jvm.internal.l.b(this.f26540d, gVar.f26540d) && kotlin.jvm.internal.l.b(this.f26541e, gVar.f26541e) && kotlin.jvm.internal.l.b(this.f26542f, gVar.f26542f) && kotlin.jvm.internal.l.b(this.f26543g, gVar.f26543g) && kotlin.jvm.internal.l.b(this.f26544h, gVar.f26544h) && kotlin.jvm.internal.l.b(this.i, gVar.i) && this.f26545j == gVar.f26545j && kotlin.jvm.internal.l.b(this.f26546k, gVar.f26546k);
        }

        public final String f() {
            return this.f26537a;
        }

        public final String g() {
            return this.f26543g;
        }

        public final List<kx> h() {
            return this.f26544h;
        }

        public final int hashCode() {
            int iHashCode = this.f26537a.hashCode() * 31;
            String str = this.f26538b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            wx wxVar = this.f26539c;
            int iHashCode3 = (this.f26540d.hashCode() + ((iHashCode2 + (wxVar == null ? 0 : wxVar.hashCode())) * 31)) * 31;
            String str2 = this.f26541e;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26542f;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26543g;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<kx> list = this.f26544h;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<gy> list2 = this.i;
            int iHashCode8 = (this.f26545j.hashCode() + ((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
            String str5 = this.f26546k;
            return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
        }

        public final nw i() {
            return this.f26545j;
        }

        public final String j() {
            return this.f26541e;
        }

        public final String toString() {
            String str = this.f26537a;
            String str2 = this.f26538b;
            wx wxVar = this.f26539c;
            uw uwVar = this.f26540d;
            String str3 = this.f26541e;
            String str4 = this.f26542f;
            String str5 = this.f26543g;
            List<kx> list = this.f26544h;
            List<gy> list2 = this.i;
            nw nwVar = this.f26545j;
            String str6 = this.f26546k;
            StringBuilder sbD = j6.l.d("MediationAdapter(name=", str, ", logoUrl=", str2, ", infoFirst=");
            sbD.append(wxVar);
            sbD.append(", infoSecond=");
            sbD.append(uwVar);
            sbD.append(", waringMessage=");
            com.google.android.gms.measurement.internal.a.l(sbD, str3, ", adUnitId=", str4, ", networkAdUnitIdName=");
            sbD.append(str5);
            sbD.append(", parameters=");
            sbD.append(list);
            sbD.append(", cpmFloors=");
            sbD.append(list2);
            sbD.append(", type=");
            sbD.append(nwVar);
            sbD.append(", sdk=");
            return B4.f.c(sbD, str6, ")");
        }

        public /* synthetic */ g(String str, String str2, wx wxVar, uw uwVar, String str3, String str4, String str5, List list, List list2, nw nwVar, String str6, int i) {
            this(str, str2, wxVar, uwVar, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? nw.f31031e : nwVar, (i & 1024) != 0 ? null : str6);
        }
    }
}
