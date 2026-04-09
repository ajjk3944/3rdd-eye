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
    private static volatile UUID f6183a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f6184b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f6183a == null) {
            synchronized (a.class) {
                if (f6183a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f6183a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f6183a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f6183a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f6183a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f6184b)) {
                new a(context);
                UUID uuid = f6183a;
                if (uuid != null) {
                    f6184b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6184b;
    }
}
