package kj;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.snmp4j.smi.GenericAddress;
import pj.InterfaceC7379a;

/* loaded from: classes3.dex */
public class w implements InterfaceC7379a {
    @Override // pj.InterfaceC7379a
    public Set a() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(GenericAddress.TYPE_TCP)));
    }

    @Override // pj.InterfaceC7379a
    public p b(URI uri, MqttConnectOptions mqttConnectOptions, String str) throws MqttException {
        String host = uri.getHost();
        int port = uri.getPort();
        if (port == -1) {
            port = 1883;
        }
        String path = uri.getPath();
        if (path != null && !path.isEmpty()) {
            throw new IllegalArgumentException(uri.toString());
        }
        SocketFactory socketFactory = mqttConnectOptions.getSocketFactory();
        if (socketFactory == null) {
            socketFactory = SocketFactory.getDefault();
        } else if (socketFactory instanceof SSLSocketFactory) {
            throw i.a(32105);
        }
        v vVar = new v(socketFactory, host, port, str);
        vVar.c(mqttConnectOptions.getConnectionTimeout());
        return vVar;
    }

    @Override // pj.InterfaceC7379a
    public void c(URI uri) {
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("URI path must be empty \"" + uri.toString() + "\"");
    }
}
