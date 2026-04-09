package com.yandex.mobile.ads.impl;

import c9.C2097r;
import ia.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class zn {

    /* renamed from: c, reason: collision with root package name */
    public static final zn f36553c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set<c> f36554a;

    /* renamed from: b, reason: collision with root package name */
    private final yn f36555b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f36556a = new ArrayList();

        public final zn a() {
            return new zn(C2097r.L0(this.f36556a), null);
        }
    }

    public static final class b {
        public static String a(X509Certificate certificate) {
            kotlin.jvm.internal.l.f(certificate, "certificate");
            return androidx.work.s.d("sha256/", c(certificate).a());
        }

        public static ia.h b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.l.f(x509Certificate, "<this>");
            ia.h hVar = ia.h.f38646e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.l.e(encoded, "getEncoded(...)");
            return h.a.d(encoded).b("SHA-1");
        }

        public static ia.h c(X509Certificate x509Certificate) {
            kotlin.jvm.internal.l.f(x509Certificate, "<this>");
            ia.h hVar = ia.h.f38646e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.l.e(encoded, "getEncoded(...)");
            return h.a.d(encoded).b("SHA-256");
        }
    }

    public static final class c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends X509Certificate>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f36558c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Certificate> list, String str) {
            super(0);
            this.f36558c = list;
            this.f36559d = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
        @Override // p9.InterfaceC5480a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<? extends java.security.cert.X509Certificate> invoke() throws javax.net.ssl.SSLPeerUnverifiedException {
            /*
                r4 = this;
                com.yandex.mobile.ads.impl.zn r0 = com.yandex.mobile.ads.impl.zn.this
                com.yandex.mobile.ads.impl.yn r0 = r0.a()
                if (r0 == 0) goto L12
                java.util.List<java.security.cert.Certificate> r1 = r4.f36558c
                java.lang.String r2 = r4.f36559d
                java.util.List r0 = r0.a(r2, r1)
                if (r0 != 0) goto L14
            L12:
                java.util.List<java.security.cert.Certificate> r0 = r4.f36558c
            L14:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = c9.C2092m.T(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L23:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3a
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                java.lang.String r3 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
                kotlin.jvm.internal.l.d(r2, r3)
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L23
            L3a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zn.d.invoke():java.lang.Object");
        }
    }

    public zn(Set<c> pins, yn ynVar) {
        kotlin.jvm.internal.l.f(pins, "pins");
        this.f36554a = pins;
        this.f36555b = ynVar;
    }

    public final void a(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        kotlin.jvm.internal.l.f(peerCertificates, "peerCertificates");
        a(hostname, new d(peerCertificates, hostname));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return kotlin.jvm.internal.l.b(znVar.f36554a, this.f36554a) && kotlin.jvm.internal.l.b(znVar.f36555b, this.f36555b);
    }

    public final int hashCode() {
        int iHashCode = (this.f36554a.hashCode() + 1517) * 41;
        yn ynVar = this.f36555b;
        return iHashCode + (ynVar != null ? ynVar.hashCode() : 0);
    }

    public final void a(String hostname, InterfaceC5480a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        kotlin.jvm.internal.l.f(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Iterator<T> it = this.f36554a.iterator();
        if (it.hasNext()) {
            ((c) it.next()).getClass();
            y9.n.a0(null, "**.", false);
            throw null;
        }
    }

    public final yn a() {
        return this.f36555b;
    }

    public final zn a(yn certificateChainCleaner) {
        kotlin.jvm.internal.l.f(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.l.b(this.f36555b, certificateChainCleaner) ? this : new zn(this.f36554a, certificateChainCleaner);
    }
}
