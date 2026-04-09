package kj;

import java.io.IOException;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import lj.C6649a;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import pj.InterfaceC7379a;

/* loaded from: classes3.dex */
public class t implements InterfaceC7379a {
    @Override // pj.InterfaceC7379a
    public Set a() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList("ssl")));
    }

    @Override // pj.InterfaceC7379a
    public p b(URI uri, MqttConnectOptions mqttConnectOptions, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, MqttException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        C6649a c6649a;
        String[] strArrE;
        String host = uri.getHost();
        int port = uri.getPort();
        if (port == -1) {
            port = 8883;
        }
        String path = uri.getPath();
        if (path != null && !path.isEmpty()) {
            throw new IllegalArgumentException(uri.toString());
        }
        SocketFactory socketFactory = mqttConnectOptions.getSocketFactory();
        if (socketFactory == null) {
            C6649a c6649a2 = new C6649a();
            Properties sSLProperties = mqttConnectOptions.getSSLProperties();
            if (sSLProperties != null) {
                c6649a2.t(sSLProperties, null);
            }
            c6649a = c6649a2;
            socketFactory = c6649a2.c(null);
        } else {
            if (!(socketFactory instanceof SSLSocketFactory)) {
                throw i.a(32105);
            }
            c6649a = null;
        }
        s sVar = new s((SSLSocketFactory) socketFactory, host, port, str);
        sVar.g(mqttConnectOptions.getConnectionTimeout());
        sVar.f(mqttConnectOptions.getSSLHostnameVerifier());
        sVar.e(mqttConnectOptions.isHttpsHostnameVerificationEnabled());
        if (c6649a != null && (strArrE = c6649a.e(null)) != null) {
            sVar.d(strArrE);
        }
        return sVar;
    }

    @Override // pj.InterfaceC7379a
    public void c(URI uri) {
        String path = uri.getPath();
        if (path != null && !path.isEmpty()) {
            throw new IllegalArgumentException(uri.toString());
        }
    }
}
