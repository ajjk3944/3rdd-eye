package com.ui.sso.auth;

import Wa.b;
import com.ui.sso.auth.UiCookieAuthError;
import com.ui.sso.auth.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes3.dex */
public final class d extends com.ui.sso.auth.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f42178d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f42179a;

    /* renamed from: b, reason: collision with root package name */
    private final a.EnumC1372a f42180b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42181c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String cookieString, String deviceId, String deviceName, String codeVerifier, String method) {
            AbstractC6492s.i(cookieString, "cookieString");
            AbstractC6492s.i(deviceId, "deviceId");
            AbstractC6492s.i(deviceName, "deviceName");
            AbstractC6492s.i(codeVerifier, "codeVerifier");
            AbstractC6492s.i(method, "method");
            b.a aVarA = Wa.b.f23743a.a(cookieString);
            return new d(new b(aVarA.b(), aVarA.a(), deviceId, deviceName, codeVerifier, method));
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f42182a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f42183b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42184c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42185d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42186e;

        /* renamed from: f, reason: collision with root package name */
        private final String f42187f;

        public b(String token, Long l10, String deviceId, String deviceName, String codeVerifier, String method) {
            AbstractC6492s.i(token, "token");
            AbstractC6492s.i(deviceId, "deviceId");
            AbstractC6492s.i(deviceName, "deviceName");
            AbstractC6492s.i(codeVerifier, "codeVerifier");
            AbstractC6492s.i(method, "method");
            this.f42182a = token;
            this.f42183b = l10;
            this.f42184c = deviceId;
            this.f42185d = deviceName;
            this.f42186e = codeVerifier;
            this.f42187f = method;
        }

        public final String a() {
            return this.f42186e;
        }

        public final String b() {
            return this.f42184c;
        }

        public final String c() {
            return this.f42185d;
        }

        public final Long d() {
            return this.f42183b;
        }

        public final String e() {
            return this.f42187f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f42182a, bVar.f42182a) && AbstractC6492s.d(this.f42183b, bVar.f42183b) && AbstractC6492s.d(this.f42184c, bVar.f42184c) && AbstractC6492s.d(this.f42185d, bVar.f42185d) && AbstractC6492s.d(this.f42186e, bVar.f42186e) && AbstractC6492s.d(this.f42187f, bVar.f42187f);
        }

        public final String f() {
            return this.f42182a;
        }

        public int hashCode() {
            int iHashCode = this.f42182a.hashCode() * 31;
            Long l10 = this.f42183b;
            return ((((((((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.f42184c.hashCode()) * 31) + this.f42185d.hashCode()) * 31) + this.f42186e.hashCode()) * 31) + this.f42187f.hashCode();
        }

        public String toString() {
            return "Data(token=" + this.f42182a + ", expiresAt=" + this.f42183b + ", deviceId=" + this.f42184c + ", deviceName=" + this.f42185d + ", codeVerifier=" + this.f42186e + ", method=" + this.f42187f + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b data) {
        super(null);
        AbstractC6492s.i(data, "data");
        String str = null;
        this.f42179a = data;
        this.f42180b = a.EnumC1372a.UBIC_PKCE;
        this.f42181c = data.f();
        if (t.m0(a())) {
            str = "Token is blank";
        } else if (t.m0(data.b())) {
            str = "Device ID is blank";
        } else if (t.m0(data.c())) {
            str = "Device name is blank";
        } else if (t.m0(data.a())) {
            str = "Code verifier is blank";
        } else if (t.m0(data.e())) {
            str = "Method is blank";
        }
        if (str != null) {
            throw new UiCookieAuthError.InvalidToken(str);
        }
    }

    @Override // com.ui.sso.auth.a
    public String a() {
        return this.f42181c;
    }

    @Override // com.ui.sso.auth.a
    public a.EnumC1372a b() {
        return this.f42180b;
    }

    public final b c() {
        return this.f42179a;
    }

    public final boolean d() {
        return this.f42179a.d() != null && System.currentTimeMillis() > this.f42179a.d().longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC6492s.d(this.f42179a, ((d) obj).f42179a);
    }

    public int hashCode() {
        return this.f42179a.hashCode();
    }
}
