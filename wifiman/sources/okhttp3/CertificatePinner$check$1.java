package okhttp3;

import Zg.AbstractC3689v;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class CertificatePinner$check$1 extends AbstractC6494u implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CertificatePinner f55830a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f55831b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f55832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f55830a = certificatePinner;
        this.f55831b = list;
        this.f55832c = str;
    }

    @Override // mh.InterfaceC6824a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        List listA;
        CertificateChainCleaner certificateChainCleaner = this.f55830a.getCertificateChainCleaner();
        if (certificateChainCleaner == null || (listA = certificateChainCleaner.a(this.f55831b, this.f55832c)) == null) {
            listA = this.f55831b;
        }
        List<Certificate> list = listA;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (Certificate certificate : list) {
            AbstractC6492s.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
