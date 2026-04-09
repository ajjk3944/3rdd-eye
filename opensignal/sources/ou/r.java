package ou;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f19962a;

    /* renamed from: b, reason: collision with root package name */
    public final l f19963b;

    /* renamed from: c, reason: collision with root package name */
    public final List f19964c;

    /* renamed from: d, reason: collision with root package name */
    public final lq.q f19965d;

    public r(h0 h0Var, l lVar, List list, ar.a aVar) {
        br.l.e(h0Var, "tlsVersion");
        this.f19962a = h0Var;
        this.f19963b = lVar;
        this.f19964c = list;
        this.f19965d = kc.f.F(new ft.p(aVar, 1));
    }

    public final List a() {
        return (List) this.f19965d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f19962a == this.f19962a && br.l.a(rVar.f19963b, this.f19963b) && br.l.a(rVar.a(), a()) && br.l.a(rVar.f19964c, this.f19964c);
    }

    public final int hashCode() {
        return this.f19964c.hashCode() + ((a().hashCode() + ((this.f19963b.hashCode() + ((this.f19962a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(mq.p.a0(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                br.l.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f19962a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f19963b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f19964c;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                br.l.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
