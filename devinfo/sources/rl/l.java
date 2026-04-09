package rl;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f33107a;

    /* renamed from: b, reason: collision with root package name */
    public final g f33108b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33109c;

    /* renamed from: d, reason: collision with root package name */
    public final yj.n f33110d;

    public l(e0 e0Var, g gVar, List list, mk.a aVar) {
        this.f33107a = e0Var;
        this.f33108b = gVar;
        this.f33109c = list;
        this.f33110d = a.a.u(new k(0, aVar));
    }

    public final List a() {
        return (List) this.f33110d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f33107a == this.f33107a && nk.k.a(lVar.f33108b, this.f33108b) && nk.k.a(lVar.a(), a()) && nk.k.a(lVar.f33109c, this.f33109c);
    }

    public final int hashCode() {
        return this.f33109c.hashCode() + ((a().hashCode() + ((this.f33108b.hashCode() + ((this.f33107a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(zj.o.T(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                nk.k.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f33107a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f33108b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f33109c;
        ArrayList arrayList2 = new ArrayList(zj.o.T(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                nk.k.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
