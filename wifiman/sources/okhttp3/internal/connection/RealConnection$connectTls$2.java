package okhttp3.internal.connection;

import Zg.AbstractC3689v;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import okhttp3.Handshake;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class RealConnection$connectTls$2 extends AbstractC6494u implements InterfaceC6824a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RealConnection f56434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f56434a = realConnection;
    }

    @Override // mh.InterfaceC6824a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        Handshake handshake = this.f56434a.handshake;
        AbstractC6492s.f(handshake);
        List<Certificate> listD = handshake.d();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listD, 10));
        for (Certificate certificate : listD) {
            AbstractC6492s.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
