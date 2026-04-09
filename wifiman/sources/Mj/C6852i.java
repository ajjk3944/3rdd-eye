package mj;

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
import kj.p;
import lj.C6649a;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import pj.InterfaceC7379a;

/* renamed from: mj.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6852i implements InterfaceC7379a {
    @Override // pj.InterfaceC7379a
    public Set a() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList("wss")));
    }

    @Override // pj.InterfaceC7379a
    public p b(URI uri, MqttConnectOptions mqttConnectOptions, String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, MqttException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        C6649a c6649a;
        String[] strArrE;
        String host = uri.getHost();
        int port = uri.getPort();
        if (port == -1) {
            port = 443;
        }
        int i10 = port;
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
                throw kj.i.a(32105);
            }
            c6649a = null;
        }
        C6851h c6851h = new C6851h((SSLSocketFactory) socketFactory, uri.toString(), host, i10, str, mqttConnectOptions.getCustomWebSocketHeaders());
        c6851h.g(mqttConnectOptions.getConnectionTimeout());
        c6851h.f(mqttConnectOptions.getSSLHostnameVerifier());
        c6851h.e(mqttConnectOptions.isHttpsHostnameVerificationEnabled());
        if (c6649a != null && (strArrE = c6649a.e(null)) != null) {
            c6851h.d(strArrE);
        }
        return c6851h;
    }

    @Override // pj.InterfaceC7379a
    public void c(URI uri) {
    }
}
