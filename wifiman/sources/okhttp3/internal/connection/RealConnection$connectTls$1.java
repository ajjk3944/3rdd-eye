package okhttp3.internal.connection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class RealConnection$connectTls$1 extends AbstractC6494u implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CertificatePinner f56431a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Handshake f56432b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Address f56433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f56431a = certificatePinner;
        this.f56432b = handshake;
        this.f56433c = address;
    }

    @Override // mh.InterfaceC6824a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f56431a.getCertificateChainCleaner();
        AbstractC6492s.f(certificateChainCleaner);
        return certificateChainCleaner.a(this.f56432b.d(), this.f56433c.getUrl().getHost());
    }
}
