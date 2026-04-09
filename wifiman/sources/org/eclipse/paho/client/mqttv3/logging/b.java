package org.eclipse.paho.client.mqttv3.logging;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f56895a = "org.eclipse.paho.client.mqttv3.logging.b";

    /* renamed from: b, reason: collision with root package name */
    private static String f56896b;

    /* renamed from: c, reason: collision with root package name */
    private static String f56897c = JSR47Logger.class.getName();

    public static a a(String str, String str2) {
        String str3 = f56896b;
        if (str3 == null) {
            str3 = f56897c;
        }
        a aVarB = b(str3, ResourceBundle.getBundle(str), str2, null);
        if (aVarB != null) {
            return aVarB;
        }
        throw new MissingResourceException("Error locating the logging class", f56895a, str2);
    }

    private static a b(String str, ResourceBundle resourceBundle, String str2, String str3) {
        try {
            a aVar = (a) Class.forName(str).newInstance();
            aVar.initialise(resourceBundle, str2, str3);
            return aVar;
        } catch (ClassNotFoundException | ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoClassDefFoundError | SecurityException unused) {
            return null;
        }
    }
}
