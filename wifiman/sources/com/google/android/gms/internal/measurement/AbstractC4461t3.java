package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import o.C7010a;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4461t3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C7010a f35479a = new C7010a();

    public static synchronized Uri a(String str) {
        Uri uri;
        C7010a c7010a = f35479a;
        uri = (Uri) c7010a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c7010a.put(str, uri);
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains(MqttTopic.MULTI_LEVEL_WILDCARD)) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + MqttTopic.MULTI_LEVEL_WILDCARD + "" + context.getPackageName();
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
