package ga;

import c9.C2099t;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.l;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f37965a = new d();

    public static List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        C2099t c2099t = C2099t.f18581b;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return c2099t;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && l.b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r11, java.security.cert.X509Certificate r12) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.d.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        l.f(host, "host");
        l.f(session, "session");
        if (host.length() == ((int) com.google.gson.internal.c.I(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
