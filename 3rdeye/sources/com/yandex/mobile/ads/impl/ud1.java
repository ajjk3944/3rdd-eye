package com.yandex.mobile.ads.impl;

import c9.C2097r;
import c9.C2099t;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class ud1 implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final ud1 f34038a = new ud1();

    private ud1() {
    }

    public static List a(X509Certificate certificate) throws CertificateParsingException {
        kotlin.jvm.internal.l.f(certificate, "certificate");
        return C2097r.y0(a(certificate, 2), a(certificate, 7));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(session, "session");
        if (host.length() == ((int) com.google.gson.internal.c.I(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                kotlin.jvm.internal.l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return a(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }

    private static List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        C2099t c2099t = C2099t.f18581b;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c2099t;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && kotlin.jvm.internal.l.b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c2099t;
        }
    }

    public static boolean a(String host, X509Certificate certificate) throws CertificateParsingException {
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(certificate, "certificate");
        if (t82.a(host)) {
            String strA = uf0.a(host);
            List listA = a(certificate, 7);
            if ((listA instanceof Collection) && listA.isEmpty()) {
                return false;
            }
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.l.b(strA, uf0.a((String) it.next()))) {
                    return true;
                }
            }
            return false;
        }
        if (host.length() == ((int) com.google.gson.internal.c.I(host))) {
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            host = host.toLowerCase(US);
            kotlin.jvm.internal.l.e(host, "toLowerCase(...)");
        }
        List listA2 = a(certificate, 2);
        if ((listA2 instanceof Collection) && listA2.isEmpty()) {
            return false;
        }
        Iterator it2 = listA2.iterator();
        while (it2.hasNext()) {
            if (a(host, (String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        int length;
        if (str != null && str.length() != 0 && !y9.n.a0(str, ".", false) && !y9.n.T(str, "..") && str2 != null && str2.length() != 0 && !y9.n.a0(str2, ".", false) && !y9.n.T(str2, "..")) {
            if (!y9.n.T(str, ".")) {
                str = str.concat(".");
            }
            if (!y9.n.T(str2, ".")) {
                str2 = str2.concat(".");
            }
            if (str2.length() == ((int) com.google.gson.internal.c.I(str2))) {
                Locale US = Locale.US;
                kotlin.jvm.internal.l.e(US, "US");
                str2 = str2.toLowerCase(US);
                kotlin.jvm.internal.l.e(str2, "toLowerCase(...)");
            }
            if (!y9.q.b0(str2, "*", false)) {
                return kotlin.jvm.internal.l.b(str, str2);
            }
            if (y9.n.a0(str2, "*.", false) && y9.q.f0(str2, '*', 1, 4) == -1 && str.length() >= str2.length() && !"*.".equals(str2)) {
                String strSubstring = str2.substring(1);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                if (y9.n.T(str, strSubstring) && ((length = str.length() - strSubstring.length()) <= 0 || y9.q.k0(str, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
