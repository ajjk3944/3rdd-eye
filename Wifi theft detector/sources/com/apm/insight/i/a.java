package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f5003a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f5004b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f5003a == null) {
            synchronized (a.class) {
                if (f5003a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f5003a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f5003a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f5003a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f5003a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f5004b)) {
                new a(context);
                UUID uuid = f5003a;
                if (uuid != null) {
                    f5004b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5004b;
    }
}
