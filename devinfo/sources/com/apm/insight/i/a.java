package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f3229a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f3230b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f3229a == null) {
            synchronized (a.class) {
                if (f3229a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f3229a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f3229a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f3229a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f3229a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f3230b)) {
                new a(context);
                UUID uuid = f3229a;
                if (uuid != null) {
                    f3230b = uuid.toString();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3230b;
    }
}
