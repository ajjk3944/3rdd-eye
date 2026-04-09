package mj;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kj.p;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import pj.InterfaceC7379a;

/* renamed from: mj.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6849f implements InterfaceC7379a {
    @Override // pj.InterfaceC7379a
    public Set a() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList("ws")));
    }

    @Override // pj.InterfaceC7379a
    public p b(URI uri, MqttConnectOptions mqttConnectOptions, String str) throws MqttException {
        String host = uri.getHost();
        int port = uri.getPort();
        if (port == -1) {
            port = 80;
        }
        int i10 = port;
        SocketFactory socketFactory = mqttConnectOptions.getSocketFactory();
        if (socketFactory == null) {
            socketFactory = SocketFactory.getDefault();
        } else if (socketFactory instanceof SSLSocketFactory) {
            throw kj.i.a(32105);
        }
        C6848e c6848e = new C6848e(socketFactory, uri.toString(), host, i10, str, mqttConnectOptions.getCustomWebSocketHeaders());
        c6848e.c(mqttConnectOptions.getConnectionTimeout());
        return c6848e;
    }

    @Override // pj.InterfaceC7379a
    public void c(URI uri) {
    }
}
