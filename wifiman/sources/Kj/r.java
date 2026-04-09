package kj;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes3.dex */
public class r extends n {

    /* renamed from: b, reason: collision with root package name */
    private ResourceBundle f51641b = ResourceBundle.getBundle("org.eclipse.paho.client.mqttv3.internal.nls.messages");

    @Override // kj.n
    protected String a(int i10) {
        try {
            return this.f51641b.getString(Integer.toString(i10));
        } catch (MissingResourceException unused) {
            return "MqttException";
        }
    }
}
