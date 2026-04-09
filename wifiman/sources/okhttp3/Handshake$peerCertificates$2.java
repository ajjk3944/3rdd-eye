package okhttp3;

import Zg.AbstractC3689v;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class Handshake$peerCertificates$2 extends AbstractC6494u implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6824a f56027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$peerCertificates$2(InterfaceC6824a interfaceC6824a) {
        super(0);
        this.f56027a = interfaceC6824a;
    }

    @Override // mh.InterfaceC6824a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        try {
            return (List) this.f56027a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return AbstractC3689v.l();
        }
    }
}
