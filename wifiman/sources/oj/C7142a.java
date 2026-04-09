package oj;

import java.util.Enumeration;
import java.util.Hashtable;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* renamed from: oj.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7142a implements MqttClientPersistence {

    /* renamed from: a, reason: collision with root package name */
    private Hashtable f55741a;

    private void a() throws MqttPersistenceException {
        if (this.f55741a == null) {
            throw new MqttPersistenceException();
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void clear() throws MqttPersistenceException {
        a();
        this.f55741a.clear();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence, java.lang.AutoCloseable
    public void close() {
        Hashtable hashtable = this.f55741a;
        if (hashtable != null) {
            hashtable.clear();
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public boolean containsKey(String str) throws MqttPersistenceException {
        a();
        return this.f55741a.containsKey(str);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public MqttPersistable get(String str) throws MqttPersistenceException {
        a();
        return (MqttPersistable) this.f55741a.get(str);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public Enumeration keys() throws MqttPersistenceException {
        a();
        return this.f55741a.keys();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void open(String str, String str2) {
        this.f55741a = new Hashtable();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
        a();
        this.f55741a.put(str, mqttPersistable);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttClientPersistence
    public void remove(String str) throws MqttPersistenceException {
        a();
        this.f55741a.remove(str);
    }
}
