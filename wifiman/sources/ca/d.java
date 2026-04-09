package ca;

import P9.j;
import P9.n;
import android.app.Application;
import com.ui.core.ui.sso.recaptcha.RecaptchaUseCase;
import gg.D;
import gg.z;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final RecaptchaUseCase f33901a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f33902a;

        /* renamed from: b, reason: collision with root package name */
        private final String f33903b;

        public /* synthetic */ a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public final String a() {
            return this.f33902a;
        }

        public final String b() {
            return this.f33903b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C4234a.d(this.f33902a, aVar.f33902a) && ca.b.d(this.f33903b, aVar.f33903b);
        }

        public int hashCode() {
            return (C4234a.e(this.f33902a) * 31) + ca.b.e(this.f33903b);
        }

        public String toString() {
            return "RecaptchaPayload(siteKey=" + C4234a.f(this.f33902a) + ", token=" + ca.b.f(this.f33903b) + ")";
        }

        private a(String siteKey, String token) {
            AbstractC6492s.i(siteKey, "siteKey");
            AbstractC6492s.i(token, "token");
            this.f33902a = siteKey;
            this.f33903b = token;
        }
    }

    static final class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33904a = new b();

        b() {
        }

        public final String a() {
            j jVarF = n.f18488a.f();
            if (jVarF != null) {
                return jVarF.a();
            }
            throw new IllegalStateException("Missing recaptcha config");
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            String strA = a();
            if (strA != null) {
                return C4234a.a(strA);
            }
            return null;
        }
    }

    static final class c implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33906a;

            a(String str) {
                this.f33906a = str;
            }

            public final a a(String token) {
                AbstractC6492s.i(token, "token");
                String str = this.f33906a;
                AbstractC6492s.f(ca.b.a(token));
                return new a(str, token, null);
            }

            @Override // kg.n
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return a(((ca.b) obj).g());
            }
        }

        c() {
        }

        public final D a(String siteKey) {
            AbstractC6492s.i(siteKey, "siteKey");
            RecaptchaUseCase recaptchaUseCase = d.this.f33901a;
            AbstractC6492s.f(C4234a.a(siteKey));
            return recaptchaUseCase.g(siteKey).A(new a(siteKey));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((C4234a) obj).g());
        }
    }

    public d(RecaptchaUseCase recaptchaUseCase) {
        AbstractC6492s.i(recaptchaUseCase, "recaptchaUseCase");
        this.f33901a = recaptchaUseCase;
    }

    private final z b() {
        z zVarX = z.x(b.f33904a);
        AbstractC6492s.h(zVarX, "fromCallable(...)");
        return zVarX;
    }

    public final z c() {
        z zVarS = b().s(new c());
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Application app) {
        this(new RecaptchaUseCase(app));
        AbstractC6492s.i(app, "app");
    }
}
