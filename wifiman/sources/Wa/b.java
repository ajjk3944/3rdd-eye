package Wa;

import Zg.AbstractC3689v;
import com.ui.sso.auth.UiCookieAuthError;
import java.net.HttpCookie;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.t;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23743a = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23744a;

        /* renamed from: b, reason: collision with root package name */
        private final Long f23745b;

        public a(String token, Long l10) {
            AbstractC6492s.i(token, "token");
            this.f23744a = token;
            this.f23745b = l10;
        }

        public final Long a() {
            return this.f23745b;
        }

        public final String b() {
            return this.f23744a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f23744a, aVar.f23744a) && AbstractC6492s.d(this.f23745b, aVar.f23745b);
        }

        public int hashCode() {
            int iHashCode = this.f23744a.hashCode() * 31;
            Long l10 = this.f23745b;
            return iHashCode + (l10 == null ? 0 : l10.hashCode());
        }

        public String toString() {
            return "ParseCookieResult(token=" + this.f23744a + ", expiresAt=" + this.f23745b + ")";
        }
    }

    /* renamed from: Wa.b$b, reason: collision with other inner class name */
    static final class C0884b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f23746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0884b(String str) {
            super(0);
            this.f23746a = str;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse Ui Cookie. Invalid cookie string provided: " + this.f23746a;
        }
    }

    private b() {
    }

    public final a a(String cookieString) {
        AbstractC6492s.i(cookieString, "cookieString");
        try {
            List<HttpCookie> list = HttpCookie.parse(cookieString);
            AbstractC6492s.f(list);
            HttpCookie httpCookie = (HttpCookie) AbstractC3689v.s0(list);
            if (httpCookie == null) {
                throw new UiCookieAuthError.InvalidCookieFormat("Invalid cookie. No Cookie Found in '" + cookieString + "'", null, 2, null);
            }
            String value = httpCookie.getValue();
            if (value == null || t.m0(value)) {
                value = null;
            }
            if (value != null) {
                return new a(value, httpCookie.getMaxAge() > 0 ? Long.valueOf(System.currentTimeMillis() + (httpCookie.getMaxAge() * 1000)) : httpCookie.hasExpired() ? 0L : null);
            }
            throw new UiCookieAuthError.InvalidCookieFormat("Invalid cookie. No token found '" + cookieString + "'", null, 2, null);
        } catch (IllegalArgumentException e10) {
            Ua.a.g(new C0884b(cookieString), null, 2, null);
            throw new UiCookieAuthError.InvalidCookieFormat("Invalid cookie format", e10);
        }
    }
}
