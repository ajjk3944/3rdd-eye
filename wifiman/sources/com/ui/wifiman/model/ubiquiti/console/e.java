package com.ui.wifiman.model.ubiquiti.console;

import com.ui.common.semver.SemVer;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f43714a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f43715b;

    /* renamed from: c, reason: collision with root package name */
    private final SemVer f43716c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43717d;

    /* renamed from: e, reason: collision with root package name */
    private final W7.c f43718e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43719f;

    /* renamed from: g, reason: collision with root package name */
    private final Boolean f43720g;

    /* renamed from: h, reason: collision with root package name */
    private final String f43721h;

    /* renamed from: i, reason: collision with root package name */
    private final String f43722i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC8439a.d f43723j;

    /* renamed from: k, reason: collision with root package name */
    private final Boolean f43724k;

    /* renamed from: l, reason: collision with root package name */
    private final a.b f43725l;

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.ubiquiti.console.e$a$a, reason: collision with other inner class name */
        public static final class C1497a extends a {
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final SemVer f43726a;

            /* renamed from: b, reason: collision with root package name */
            private final Rd.a f43727b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SemVer semVer, Rd.a teleportStatus) {
                super(null);
                AbstractC6492s.i(teleportStatus, "teleportStatus");
                this.f43726a = semVer;
                this.f43727b = teleportStatus;
            }

            public final Rd.a a() {
                return this.f43727b;
            }

            public final SemVer b() {
                return this.f43726a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC6492s.d(this.f43726a, bVar.f43726a) && AbstractC6492s.d(this.f43727b, bVar.f43727b);
            }

            public int hashCode() {
                SemVer semVer = this.f43726a;
                return ((semVer == null ? 0 : semVer.hashCode()) * 31) + this.f43727b.hashCode();
            }

            public String toString() {
                return "Network(version=" + this.f43726a + ", teleportStatus=" + this.f43727b + ")";
            }
        }

        public static final class c extends a {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final String f43728a;

        private /* synthetic */ b(String str) {
            this.f43728a = str;
        }

        public static final /* synthetic */ b a(String str) {
            return new b(str);
        }

        public static int c(String str, String other) {
            AbstractC6492s.i(other, "other");
            return str.compareTo(other);
        }

        public static String d(String value) {
            AbstractC6492s.i(value, "value");
            return value;
        }

        public static boolean g(String str, Object obj) {
            return (obj instanceof b) && AbstractC6492s.d(str, ((b) obj).n());
        }

        public static final boolean h(String str, String str2) {
            return AbstractC6492s.d(str, str2);
        }

        public static int j(String str) {
            return str.hashCode();
        }

        public static String l(String str) {
            return "ID(value=" + str + ")";
        }

        public int b(String other) {
            AbstractC6492s.i(other, "other");
            return c(this.f43728a, other);
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return b(((b) obj).n());
        }

        public boolean equals(Object obj) {
            return g(this.f43728a, obj);
        }

        public int hashCode() {
            return j(this.f43728a);
        }

        public final /* synthetic */ String n() {
            return this.f43728a;
        }

        public String toString() {
            return l(this.f43728a);
        }
    }

    public /* synthetic */ e(String str, C5969a c5969a, SemVer semVer, String str2, W7.c cVar, String str3, Boolean bool, String str4, String str5, InterfaceC8439a.d dVar, Boolean bool2, a.b bVar, a.c cVar2, a.C1497a c1497a, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c5969a, semVer, str2, cVar, str3, bool, str4, str5, dVar, bool2, bVar, cVar2, c1497a);
    }

    public static /* synthetic */ e b(e eVar, String str, C5969a c5969a, SemVer semVer, String str2, W7.c cVar, String str3, Boolean bool, String str4, String str5, InterfaceC8439a.d dVar, Boolean bool2, a.b bVar, a.c cVar2, a.C1497a c1497a, int i10, Object obj) {
        a.c cVar3;
        String str6 = (i10 & 1) != 0 ? eVar.f43714a : str;
        C5969a c5969a2 = (i10 & 2) != 0 ? eVar.f43715b : c5969a;
        SemVer semVer2 = (i10 & 4) != 0 ? eVar.f43716c : semVer;
        String str7 = (i10 & 8) != 0 ? eVar.f43717d : str2;
        W7.c cVar4 = (i10 & 16) != 0 ? eVar.f43718e : cVar;
        String str8 = (i10 & 32) != 0 ? eVar.f43719f : str3;
        Boolean bool3 = (i10 & 64) != 0 ? eVar.f43720g : bool;
        String str9 = (i10 & 128) != 0 ? eVar.f43721h : str4;
        String str10 = (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? eVar.f43722i : str5;
        InterfaceC8439a.d dVar2 = (i10 & 512) != 0 ? eVar.f43723j : dVar;
        Boolean bool4 = (i10 & 1024) != 0 ? eVar.f43724k : bool2;
        a.b bVar2 = (i10 & 2048) != 0 ? eVar.f43725l : bVar;
        a.C1497a c1497a2 = null;
        if ((i10 & 4096) != 0) {
            eVar.getClass();
            cVar3 = null;
        } else {
            cVar3 = cVar2;
        }
        if ((i10 & 8192) != 0) {
            eVar.getClass();
        } else {
            c1497a2 = c1497a;
        }
        return eVar.a(str6, c5969a2, semVer2, str7, cVar4, str8, bool3, str9, str10, dVar2, bool4, bVar2, cVar3, c1497a2);
    }

    public final e a(String id2, C5969a c5969a, SemVer semVer, String str, W7.c cVar, String str2, Boolean bool, String str3, String str4, InterfaceC8439a.d dVar, Boolean bool2, a.b bVar, a.c cVar2, a.C1497a c1497a) {
        AbstractC6492s.i(id2, "id");
        return new e(id2, c5969a, semVer, str, cVar, str2, bool, str3, str4, dVar, bool2, bVar, cVar2, c1497a, null);
    }

    public final String c() {
        return this.f43722i;
    }

    public final Boolean d() {
        return this.f43720g;
    }

    public final SemVer e() {
        return this.f43716c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return b.h(this.f43714a, eVar.f43714a) && AbstractC6492s.d(this.f43715b, eVar.f43715b) && AbstractC6492s.d(this.f43716c, eVar.f43716c) && AbstractC6492s.d(this.f43717d, eVar.f43717d) && AbstractC6492s.d(this.f43718e, eVar.f43718e) && AbstractC6492s.d(this.f43719f, eVar.f43719f) && AbstractC6492s.d(this.f43720g, eVar.f43720g) && AbstractC6492s.d(this.f43721h, eVar.f43721h) && AbstractC6492s.d(this.f43722i, eVar.f43722i) && AbstractC6492s.d(this.f43723j, eVar.f43723j) && AbstractC6492s.d(this.f43724k, eVar.f43724k) && AbstractC6492s.d(this.f43725l, eVar.f43725l) && AbstractC6492s.d(null, null) && AbstractC6492s.d(null, null);
    }

    public final String f() {
        return this.f43714a;
    }

    public final W7.c g() {
        return this.f43718e;
    }

    public final String h() {
        return this.f43719f;
    }

    public int hashCode() {
        int iJ = b.j(this.f43714a) * 31;
        C5969a c5969a = this.f43715b;
        int iHashCode = (iJ + (c5969a == null ? 0 : c5969a.hashCode())) * 31;
        SemVer semVer = this.f43716c;
        int iHashCode2 = (iHashCode + (semVer == null ? 0 : semVer.hashCode())) * 31;
        String str = this.f43717d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        W7.c cVar = this.f43718e;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str2 = this.f43719f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f43720g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f43721h;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f43722i;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InterfaceC8439a.d dVar = this.f43723j;
        int iHashCode9 = (iHashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Boolean bool2 = this.f43724k;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        a.b bVar = this.f43725l;
        return (iHashCode10 + (bVar != null ? bVar.hashCode() : 0)) * 961;
    }

    public final C5969a i() {
        return this.f43715b;
    }

    public final String j() {
        return this.f43721h;
    }

    public final String k() {
        return this.f43717d;
    }

    public final a.b l() {
        return this.f43725l;
    }

    public final InterfaceC8439a.d m() {
        return this.f43723j;
    }

    public final boolean n() {
        a.b bVar = this.f43725l;
        return (bVar != null ? bVar.b() : null) != null;
    }

    public final Boolean o() {
        return this.f43724k;
    }

    public String toString() {
        return "UnifiConsole(id=" + b.l(this.f43714a) + ", mac=" + this.f43715b + ", fwVersion=" + this.f43716c + ", name=" + this.f43717d + ", location=" + this.f43718e + ", locationText=" + this.f43719f + ", available=" + this.f43720g + ", model=" + this.f43721h + ", anonid=" + this.f43722i + ", product=" + this.f43723j + ", isOwnedByMe=" + this.f43724k + ", network=" + this.f43725l + ", protect=" + ((Object) null) + ", access=" + ((Object) null) + ")";
    }

    private e(String id2, C5969a c5969a, SemVer semVer, String str, W7.c cVar, String str2, Boolean bool, String str3, String str4, InterfaceC8439a.d dVar, Boolean bool2, a.b bVar, a.c cVar2, a.C1497a c1497a) {
        AbstractC6492s.i(id2, "id");
        this.f43714a = id2;
        this.f43715b = c5969a;
        this.f43716c = semVer;
        this.f43717d = str;
        this.f43718e = cVar;
        this.f43719f = str2;
        this.f43720g = bool;
        this.f43721h = str3;
        this.f43722i = str4;
        this.f43723j = dVar;
        this.f43724k = bool2;
        this.f43725l = bVar;
    }

    public /* synthetic */ e(String str, C5969a c5969a, SemVer semVer, String str2, W7.c cVar, String str3, Boolean bool, String str4, String str5, InterfaceC8439a.d dVar, Boolean bool2, a.b bVar, a.c cVar2, a.C1497a c1497a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : c5969a, (i10 & 4) != 0 ? null : semVer, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : cVar, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : str4, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : str5, (i10 & 512) != 0 ? null : dVar, (i10 & 1024) != 0 ? null : bool2, (i10 & 2048) != 0 ? null : bVar, (i10 & 4096) != 0 ? null : cVar2, (i10 & 8192) != 0 ? null : c1497a, null);
    }
}
