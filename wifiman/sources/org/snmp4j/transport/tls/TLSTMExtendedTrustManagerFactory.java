package org.snmp4j.transport.tls;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import org.snmp4j.TransportStateReference;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes2.dex */
public class TLSTMExtendedTrustManagerFactory implements TLSTM.TLSTMTrustManagerFactory {
    private CounterSupport counterSupport;
    private TlsTmSecurityCallback<X509Certificate> securityCallback;

    public TLSTMExtendedTrustManagerFactory(CounterSupport counterSupport, TlsTmSecurityCallback<X509Certificate> tlsTmSecurityCallback) {
        this.counterSupport = counterSupport;
        this.securityCallback = tlsTmSecurityCallback;
    }

    @Override // org.snmp4j.transport.TLSTM.TLSTMTrustManagerFactory
    public X509TrustManager create(X509TrustManager x509TrustManager, boolean z10, TransportStateReference transportStateReference) {
        return new TLSTMExtendedTrustManager(this.counterSupport, this.securityCallback, x509TrustManager, z10, transportStateReference);
    }
}
