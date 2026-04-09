package qj;

import java.util.Enumeration;
import java.util.Properties;
import kj.C6473a;

/* renamed from: qj.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7512a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f59424d = C6473a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f59425e = System.getProperty("line.separator", "\n");

    /* renamed from: a, reason: collision with root package name */
    private org.eclipse.paho.client.mqttv3.logging.a f59426a;

    /* renamed from: b, reason: collision with root package name */
    private String f59427b;

    /* renamed from: c, reason: collision with root package name */
    private C6473a f59428c;

    public C7512a(String str, C6473a c6473a) {
        org.eclipse.paho.client.mqttv3.logging.a aVarA = org.eclipse.paho.client.mqttv3.logging.b.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", f59424d);
        this.f59426a = aVarA;
        this.f59427b = str;
        this.f59428c = c6473a;
        aVarA.setResourceName(str);
    }

    public static String a(Properties properties, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        String str2 = f59425e;
        stringBuffer.append(String.valueOf(str2) + "============== " + str + " ==============" + str2);
        while (enumerationPropertyNames.hasMoreElements()) {
            String str3 = (String) enumerationPropertyNames.nextElement();
            stringBuffer.append(String.valueOf(b(str3, 28, ' ')) + ":  " + properties.get(str3) + f59425e);
        }
        stringBuffer.append("==========================================" + f59425e);
        return stringBuffer.toString();
    }

    public static String b(String str, int i10, char c10) {
        if (str.length() >= i10) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(i10);
        stringBuffer.append(str);
        int length = i10 - str.length();
        while (true) {
            length--;
            if (length < 0) {
                return stringBuffer.toString();
            }
            stringBuffer.append(c10);
        }
    }
}
