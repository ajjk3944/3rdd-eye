package com.ui.wifiman.model.ubiquiti.cloud.sso;

import Yg.m;
import Yg.n;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f43558a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43559b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43560c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43561d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43562e;

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f43563f;

    /* renamed from: g, reason: collision with root package name */
    private final String f43564g;

    /* renamed from: h, reason: collision with root package name */
    private final String f43565h;

    /* renamed from: i, reason: collision with root package name */
    private final String f43566i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f43567j;

    /* renamed from: k, reason: collision with root package name */
    private final long f43568k;

    /* renamed from: l, reason: collision with root package name */
    private final m f43569l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f43570a;

        private /* synthetic */ a(UUID uuid) {
            this.f43570a = uuid;
        }

        public static final /* synthetic */ a a(UUID uuid) {
            return new a(uuid);
        }

        public static UUID b(UUID uuid) {
            AbstractC6492s.i(uuid, "uuid");
            return uuid;
        }

        public static boolean c(UUID uuid, Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(uuid, ((a) obj).g());
        }

        public static final boolean d(UUID uuid, UUID uuid2) {
            return AbstractC6492s.d(uuid, uuid2);
        }

        public static int e(UUID uuid) {
            return uuid.hashCode();
        }

        public static String f(UUID uuid) {
            return "ID(uuid=" + uuid + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f43570a, obj);
        }

        public final /* synthetic */ UUID g() {
            return this.f43570a;
        }

        public int hashCode() {
            return e(this.f43570a);
        }

        public String toString() {
            return f(this.f43570a);
        }
    }

    public /* synthetic */ b(UUID uuid, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, str2, str3, str4, bool, str5, str6, str7, z10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(b bVar) {
        String str;
        if (bVar.f43560c == null && bVar.f43561d == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = bVar.f43560c;
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        String str3 = bVar.f43560c;
        sb2.append((str3 == null || t.m0(str3) || (str = bVar.f43561d) == null || t.m0(str)) ? "" : " ");
        String str4 = bVar.f43561d;
        sb2.append(str4 != null ? str4 : "");
        return sb2.toString();
    }

    public final String b() {
        return this.f43566i;
    }

    public final String c() {
        return this.f43562e;
    }

    public final String d() {
        return this.f43560c;
    }

    public final UUID e() {
        return this.f43558a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccount");
        b bVar = (b) obj;
        return a.d(this.f43558a, bVar.f43558a) && AbstractC6492s.d(this.f43559b, bVar.f43559b) && AbstractC6492s.d(this.f43560c, bVar.f43560c) && AbstractC6492s.d(this.f43561d, bVar.f43561d) && AbstractC6492s.d(this.f43562e, bVar.f43562e) && AbstractC6492s.d(this.f43563f, bVar.f43563f) && AbstractC6492s.d(this.f43564g, bVar.f43564g) && AbstractC6492s.d(this.f43565h, bVar.f43565h) && AbstractC6492s.d(this.f43566i, bVar.f43566i) && this.f43567j == bVar.f43567j && this.f43568k == bVar.f43568k;
    }

    public final String f() {
        return this.f43561d;
    }

    public final String g() {
        return (String) this.f43569l.getValue();
    }

    public final String h() {
        return this.f43565h;
    }

    public int hashCode() {
        return a.e(this.f43558a);
    }

    public final String i() {
        return this.f43564g;
    }

    public final long j() {
        return this.f43568k;
    }

    public final String k() {
        return this.f43559b;
    }

    public final Boolean l() {
        return this.f43563f;
    }

    public final boolean m() {
        return this.f43567j;
    }

    public String toString() {
        return "UiAccount[" + this.f43558a + "](username: " + this.f43559b + ", email:" + this.f43562e + ", updated:" + this.f43568k + ")";
    }

    private b(UUID id2, String username, String str, String str2, String email, Boolean bool, String str3, String str4, String str5, boolean z10, long j10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(username, "username");
        AbstractC6492s.i(email, "email");
        this.f43558a = id2;
        this.f43559b = username;
        this.f43560c = str;
        this.f43561d = str2;
        this.f43562e = email;
        this.f43563f = bool;
        this.f43564g = str3;
        this.f43565h = str4;
        this.f43566i = str5;
        this.f43567j = z10;
        this.f43568k = j10;
        this.f43569l = n.b(new InterfaceC6824a() { // from class: Nd.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return com.ui.wifiman.model.ubiquiti.cloud.sso.b.n(this.f16399a);
            }
        });
    }
}
