package com.yandex.mobile.ads.impl;

import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2092m;
import c9.C2099t;
import com.yandex.mobile.ads.impl.d52;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class cf0 {

    /* renamed from: a, reason: collision with root package name */
    private final d52 f25623a;

    /* renamed from: b, reason: collision with root package name */
    private final jo f25624b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f25625c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2000g f25626d;

    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.cf0$a$a, reason: collision with other inner class name */
        public static final class C0402a extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f25627b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0402a(List<? extends Certificate> list) {
                super(0);
                this.f25627b = list;
            }

            @Override // p9.InterfaceC5480a
            public final List<? extends Certificate> invoke() {
                return this.f25627b;
            }
        }

        public static cf0 a(SSLSession sSLSession) throws IOException {
            Certificate[] peerCertificates;
            List listA = C2099t.f18581b;
            kotlin.jvm.internal.l.f(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            jo joVarA = jo.f29226b.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            d52.f25969c.getClass();
            d52 d52VarA = d52.a.a(protocol);
            try {
                peerCertificates = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
            }
            List listA2 = peerCertificates != null ? t82.a(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listA;
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listA = t82.a(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new cf0(d52VarA, joVarA, listA, new C0402a(listA2));
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5480a<List<Certificate>> f25628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC5480a<? extends List<? extends Certificate>> interfaceC5480a) {
            super(0);
            this.f25628b = interfaceC5480a;
        }

        @Override // p9.InterfaceC5480a
        public final List<? extends Certificate> invoke() {
            try {
                return this.f25628b.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C2099t.f18581b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cf0(d52 tlsVersion, jo cipherSuite, List<? extends Certificate> localCertificates, InterfaceC5480a<? extends List<? extends Certificate>> peerCertificatesFn) {
        kotlin.jvm.internal.l.f(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.l.f(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.l.f(localCertificates, "localCertificates");
        kotlin.jvm.internal.l.f(peerCertificatesFn, "peerCertificatesFn");
        this.f25623a = tlsVersion;
        this.f25624b = cipherSuite;
        this.f25625c = localCertificates;
        this.f25626d = C2001h.b(new b(peerCertificatesFn));
    }

    public final jo a() {
        return this.f25624b;
    }

    public final List<Certificate> b() {
        return this.f25625c;
    }

    public final List<Certificate> c() {
        return (List) this.f25626d.getValue();
    }

    public final d52 d() {
        return this.f25623a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cf0)) {
            return false;
        }
        cf0 cf0Var = (cf0) obj;
        return cf0Var.f25623a == this.f25623a && kotlin.jvm.internal.l.b(cf0Var.f25624b, this.f25624b) && kotlin.jvm.internal.l.b((List) cf0Var.f25626d.getValue(), (List) this.f25626d.getValue()) && kotlin.jvm.internal.l.b(cf0Var.f25625c, this.f25625c);
    }

    public final int hashCode() {
        return this.f25625c.hashCode() + m9.a((List) this.f25626d.getValue(), (this.f25624b.hashCode() + ((this.f25623a.hashCode() + 527) * 31)) * 31, 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> list = (List) this.f25626d.getValue();
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.l.e(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        d52 d52Var = this.f25623a;
        jo joVar = this.f25624b;
        List<Certificate> list2 = this.f25625c;
        ArrayList arrayList2 = new ArrayList(C2092m.T(list2, 10));
        for (Certificate certificate2 : list2) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.l.e(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        return "Handshake{tlsVersion=" + d52Var + " cipherSuite=" + joVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + "}";
    }
}
