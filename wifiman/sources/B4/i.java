package B4;

import B4.j;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1188b = new i(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i f1189c = new i(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i f1190d = new i(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i f1191e = new i(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i f1192f = new i(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i f1193g = new i(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i f1194h = new i(new j.c());

    /* renamed from: a, reason: collision with root package name */
    private final e f1195a;

    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final j f1196a;

        @Override // B4.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f1196a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f1196a.a(str, null);
        }

        private b(j jVar) {
            this.f1196a = jVar;
        }
    }

    private static class c implements e {

        /* renamed from: a, reason: collision with root package name */
        private final j f1197a;

        @Override // B4.i.e
        public Object a(String str) {
            return this.f1197a.a(str, null);
        }

        private c(j jVar) {
            this.f1197a = jVar;
        }
    }

    private static class d implements e {

        /* renamed from: a, reason: collision with root package name */
        private final j f1198a;

        @Override // B4.i.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f1198a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private d(j jVar) {
            this.f1198a = jVar;
        }
    }

    private interface e {
        Object a(String str);
    }

    public i(j jVar) {
        if (com.google.crypto.tink.config.internal.b.c()) {
            this.f1195a = new d(jVar);
        } else if (q.b()) {
            this.f1195a = new b(jVar);
        } else {
            this.f1195a = new c(jVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f1195a.a(str);
    }
}
