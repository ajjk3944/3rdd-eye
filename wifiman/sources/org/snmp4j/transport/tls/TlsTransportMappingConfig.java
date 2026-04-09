package org.snmp4j.transport.tls;

import java.security.cert.Certificate;

/* loaded from: classes2.dex */
public interface TlsTransportMappingConfig<C extends Certificate> {
    String getKeyStore();

    String getKeyStorePassword();

    String getProtocolVersionPropertyName();

    String[] getProtocolVersions();

    TlsTmSecurityCallback<C> getSecurityCallback();

    String getTrustStore();

    String getTrustStorePassword();

    void setKeyStore(String str);

    void setKeyStorePassword(String str);

    void setLocalCertificateAlias(String str);

    void setProtocolVersions(String[] strArr);

    void setSecurityCallback(TlsTmSecurityCallback<C> tlsTmSecurityCallback);

    void setTrustStore(String str);

    void setTrustStorePassword(String str);
}
