package U9;

import U9.I;
import b9.C2001h;
import c9.C2092m;
import c9.C2099t;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p9.InterfaceC5480a;

/* compiled from: Handshake.kt */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final I f12703a;

    /* renamed from: b, reason: collision with root package name */
    public final C1612i f12704b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Certificate> f12705c;

    /* renamed from: d, reason: collision with root package name */
    public final b9.p f12706d;

    /* compiled from: Handshake.kt */
    public static final class a {

        /* compiled from: Handshake.kt */
        /* renamed from: U9.r$a$a, reason: collision with other inner class name */
        public static final class C0178a extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends Certificate>> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ List<Certificate> f12707g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0178a(List<? extends Certificate> list) {
                super(0);
                this.f12707g = list;
            }

            @Override // p9.InterfaceC5480a
            public final List<? extends Certificate> invoke() {
                return this.f12707g;
            }
        }

        public static r a(SSLSession sSLSession) throws IOException {
            Certificate[] peerCertificates;
            List listK = C2099t.f18581b;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            C1612i c1612iB = C1612i.f12649b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            I.Companion.getClass();
            I iA = I.a.a(protocol);
            try {
                peerCertificates = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
            }
            List listK2 = peerCertificates != null ? V9.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK;
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listK = V9.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new r(iA, c1612iB, listK, new C0178a(listK2));
        }
    }

    /* compiled from: Handshake.kt */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends Certificate>> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.m f12708g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC5480a<? extends List<? extends Certificate>> interfaceC5480a) {
            super(0);
            this.f12708g = (kotlin.jvm.internal.m) interfaceC5480a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.m, p9.a] */
        @Override // p9.InterfaceC5480a
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.f12708g.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C2099t.f18581b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(I tlsVersion, C1612i c1612i, List<? extends Certificate> list, InterfaceC5480a<? extends List<? extends Certificate>> interfaceC5480a) {
        kotlin.jvm.internal.l.f(tlsVersion, "tlsVersion");
        this.f12703a = tlsVersion;
        this.f12704b = c1612i;
        this.f12705c = list;
        this.f12706d = C2001h.b(new b(interfaceC5480a));
    }

    public final List<Certificate> a() {
        return (List) this.f12706d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f12703a == this.f12703a && kotlin.jvm.internal.l.b(rVar.f12704b, this.f12704b) && kotlin.jvm.internal.l.b(rVar.a(), a()) && kotlin.jvm.internal.l.b(rVar.f12705c, this.f12705c);
    }

    public final int hashCode() {
        return this.f12705c.hashCode() + ((a().hashCode() + ((this.f12704b.hashCode() + ((this.f12703a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(C2092m.T(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.l.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f12703a);
        sb.append(" cipherSuite=");
        sb.append(this.f12704b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f12705c;
        ArrayList arrayList2 = new ArrayList(C2092m.T(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.l.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
