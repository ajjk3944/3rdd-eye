package com.ui.sso.api.provider;

import android.net.Uri;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface f {

    private static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final String f42148a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f42149b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f42150c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f42151d;

        public a(String authority) {
            AbstractC6492s.i(authority, "authority");
            this.f42148a = authority;
            Uri uri = Uri.parse("content://" + b());
            AbstractC6492s.h(uri, "parse(...)");
            this.f42149b = uri;
            Uri uri2 = Uri.parse("content://" + b() + "/accounts");
            AbstractC6492s.h(uri2, "parse(...)");
            this.f42150c = uri2;
            Uri uri3 = Uri.parse("content://" + b() + "/auth");
            AbstractC6492s.h(uri3, "parse(...)");
            this.f42151d = uri3;
        }

        @Override // com.ui.sso.api.provider.f
        public Uri a() {
            return this.f42150c;
        }

        @Override // com.ui.sso.api.provider.f
        public String b() {
            return this.f42148a;
        }

        @Override // com.ui.sso.api.provider.f
        public Uri c() {
            return this.f42149b;
        }

        @Override // com.ui.sso.api.provider.f
        public Uri d(UUID accId) {
            AbstractC6492s.i(accId, "accId");
            Uri uri = Uri.parse("content://" + b() + "/auth/" + accId);
            AbstractC6492s.h(uri, "parse(...)");
            return uri;
        }

        @Override // com.ui.sso.api.provider.f
        public Uri e() {
            return this.f42151d;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42152a = a.f42153a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f42153a = new a();

            /* renamed from: b, reason: collision with root package name */
            private static final b f42154b = new C1370a();

            /* renamed from: com.ui.sso.api.provider.f$b$a$a, reason: collision with other inner class name */
            public static final class C1370a implements b {
                C1370a() {
                }

                @Override // com.ui.sso.api.provider.f.b
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public a b(String authority) {
                    AbstractC6492s.i(authority, "authority");
                    return new a(authority);
                }

                @Override // com.ui.sso.api.provider.f.b
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public a a(String packageName, String authoritySuffix) {
                    AbstractC6492s.i(packageName, "packageName");
                    AbstractC6492s.i(authoritySuffix, "authoritySuffix");
                    return new a(packageName + "." + authoritySuffix);
                }
            }

            private a() {
            }

            public final b a() {
                return f42154b;
            }
        }

        /* renamed from: com.ui.sso.api.provider.f$b$b, reason: collision with other inner class name */
        public static final class C1371b {
            public static /* synthetic */ f a(b bVar, String str, String str2, int i10, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: new");
                }
                if ((i10 & 2) != 0) {
                    str2 = "ui.account.provider";
                }
                return bVar.a(str, str2);
            }
        }

        f a(String str, String str2);

        f b(String str);
    }

    Uri a();

    String b();

    Uri c();

    Uri d(UUID uuid);

    Uri e();
}
