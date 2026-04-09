package com.yandex.mobile.ads.impl;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public final class sk implements x62 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f33095a;

    public sk(X509Certificate... caCerts) {
        kotlin.jvm.internal.l.f(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            kotlin.jvm.internal.l.e(subjectX500Principal, "getSubjectX500Principal(...)");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f33095a = linkedHashMap;
    }

    @Override // com.yandex.mobile.ads.impl.x62
    public final X509Certificate a(X509Certificate cert) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        kotlin.jvm.internal.l.f(cert, "cert");
        Set set = (Set) this.f33095a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof sk) && kotlin.jvm.internal.l.b(((sk) obj).f33095a, this.f33095a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f33095a.hashCode();
    }
}
