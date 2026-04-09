package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f18028a;

    /* renamed from: b, reason: collision with root package name */
    private final g f18029b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f18030c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f18031d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f18028a = d0Var;
        this.f18029b = gVar;
        this.f18030c = list;
        this.f18031d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.EMPTY_LIST);
    }

    public List<Certificate> b() {
        return this.f18030c;
    }

    public d0 c() {
        return this.f18028a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f18028a.equals(qVar.f18028a) && this.f18029b.equals(qVar.f18029b) && this.f18030c.equals(qVar.f18030c) && this.f18031d.equals(qVar.f18031d);
    }

    public int hashCode() {
        return ((((((this.f18028a.hashCode() + 527) * 31) + this.f18029b.hashCode()) * 31) + this.f18030c.hashCode()) * 31) + this.f18031d.hashCode();
    }

    public g a() {
        return this.f18029b;
    }
}
