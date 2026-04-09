package kj;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttToken;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: e, reason: collision with root package name */
    private static final String f51604e = "kj.f";

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f51605a;

    /* renamed from: b, reason: collision with root package name */
    private final Hashtable f51606b;

    /* renamed from: c, reason: collision with root package name */
    private String f51607c;

    /* renamed from: d, reason: collision with root package name */
    private MqttException f51608d;

    public f(String str) {
        String str2 = f51604e;
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str2);
        this.f51605a = aVarA;
        this.f51608d = null;
        aVarA.setResourceName(str);
        this.f51606b = new Hashtable();
        this.f51607c = str;
        this.f51605a.fine(str2, "<Init>", "308");
    }

    public void a() {
        this.f51605a.fine(f51604e, "clear", "305", new Object[]{Integer.valueOf(this.f51606b.size())});
        synchronized (this.f51606b) {
            this.f51606b.clear();
        }
    }

    public int b() {
        int size;
        synchronized (this.f51606b) {
            size = this.f51606b.size();
        }
        return size;
    }

    public MqttDeliveryToken[] c() {
        MqttDeliveryToken[] mqttDeliveryTokenArr;
        synchronized (this.f51606b) {
            try {
                this.f51605a.fine(f51604e, "getOutstandingDelTokens", "311");
                Vector vector = new Vector();
                Enumeration enumerationElements = this.f51606b.elements();
                while (enumerationElements.hasMoreElements()) {
                    MqttToken mqttToken = (MqttToken) enumerationElements.nextElement();
                    if (mqttToken != null && (mqttToken instanceof MqttDeliveryToken) && !mqttToken.internalTok.p()) {
                        vector.addElement(mqttToken);
                    }
                }
                mqttDeliveryTokenArr = (MqttDeliveryToken[]) vector.toArray(new MqttDeliveryToken[vector.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mqttDeliveryTokenArr;
    }

    public Vector d() {
        Vector vector;
        synchronized (this.f51606b) {
            try {
                this.f51605a.fine(f51604e, "getOutstandingTokens", "312");
                vector = new Vector();
                Enumeration enumerationElements = this.f51606b.elements();
                while (enumerationElements.hasMoreElements()) {
                    MqttToken mqttToken = (MqttToken) enumerationElements.nextElement();
                    if (mqttToken != null) {
                        vector.addElement(mqttToken);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vector;
    }

    public MqttToken e(String str) {
        return (MqttToken) this.f51606b.get(str);
    }

    public MqttToken f(nj.u uVar) {
        return (MqttToken) this.f51606b.get(uVar.i());
    }

    public void g() {
        synchronized (this.f51606b) {
            this.f51605a.fine(f51604e, "open", "310");
            this.f51608d = null;
        }
    }

    protected void h(MqttException mqttException) {
        synchronized (this.f51606b) {
            this.f51605a.fine(f51604e, "quiesce", "309", new Object[]{mqttException});
            this.f51608d = mqttException;
        }
    }

    public MqttToken i(String str) {
        this.f51605a.fine(f51604e, "removeToken", "306", new Object[]{str});
        if (str != null) {
            return (MqttToken) this.f51606b.remove(str);
        }
        return null;
    }

    public MqttToken j(nj.u uVar) {
        if (uVar != null) {
            return i(uVar.i());
        }
        return null;
    }

    protected MqttDeliveryToken k(nj.o oVar) {
        MqttDeliveryToken mqttDeliveryToken;
        synchronized (this.f51606b) {
            try {
                String string = Integer.toString(oVar.j());
                if (this.f51606b.containsKey(string)) {
                    mqttDeliveryToken = (MqttDeliveryToken) this.f51606b.get(string);
                    this.f51605a.fine(f51604e, "restoreToken", "302", new Object[]{string, oVar, mqttDeliveryToken});
                } else {
                    mqttDeliveryToken = new MqttDeliveryToken(this.f51607c);
                    mqttDeliveryToken.internalTok.w(string);
                    this.f51606b.put(string, mqttDeliveryToken);
                    this.f51605a.fine(f51604e, "restoreToken", "303", new Object[]{string, oVar, mqttDeliveryToken});
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mqttDeliveryToken;
    }

    protected void l(MqttToken mqttToken, String str) {
        synchronized (this.f51606b) {
            this.f51605a.fine(f51604e, "saveToken", "307", new Object[]{str, mqttToken.toString()});
            mqttToken.internalTok.w(str);
            this.f51606b.put(str, mqttToken);
        }
    }

    protected void m(MqttToken mqttToken, nj.u uVar) {
        synchronized (this.f51606b) {
            try {
                MqttException mqttException = this.f51608d;
                if (mqttException != null) {
                    throw mqttException;
                }
                String strI = uVar.i();
                this.f51605a.fine(f51604e, "saveToken", "300", new Object[]{strI, uVar});
                l(mqttToken, strI);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        String string;
        String property = System.getProperty("line.separator", "\n");
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this.f51606b) {
            try {
                Enumeration enumerationElements = this.f51606b.elements();
                while (enumerationElements.hasMoreElements()) {
                    stringBuffer.append("{" + ((MqttToken) enumerationElements.nextElement()).internalTok + "}" + property);
                }
                string = stringBuffer.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
