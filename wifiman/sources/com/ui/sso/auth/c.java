package com.ui.sso.auth;

import Wa.b;
import com.ui.sso.auth.UiCookieAuthError;
import com.ui.sso.auth.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes3.dex */
public final class c extends com.ui.sso.auth.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f42174d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f42175a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f42176b;

    /* renamed from: c, reason: collision with root package name */
    private final a.EnumC1372a f42177c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(String cookieString) {
            AbstractC6492s.i(cookieString, "cookieString");
            b.a aVarA = Wa.b.f23743a.a(cookieString);
            return new c(aVarA.b(), aVarA.a());
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String token, Long l10) {
        super(null);
        AbstractC6492s.i(token, "token");
        this.f42175a = token;
        this.f42176b = l10;
        if (t.m0(a())) {
            throw new UiCookieAuthError.InvalidToken("Token is blank");
        }
        this.f42177c = a.EnumC1372a.UBIC;
    }

    @Override // com.ui.sso.auth.a
    public String a() {
        return this.f42175a;
    }

    @Override // com.ui.sso.auth.a
    public a.EnumC1372a b() {
        return this.f42177c;
    }

    public final Long c() {
        return this.f42176b;
    }

    public final boolean d() {
        return this.f42176b != null && System.currentTimeMillis() > this.f42176b.longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(a(), cVar.a()) && AbstractC6492s.d(this.f42176b, cVar.f42176b) && b() == cVar.b();
    }

    public int hashCode() {
        return (a().hashCode() * 31) + b().hashCode();
    }
}
