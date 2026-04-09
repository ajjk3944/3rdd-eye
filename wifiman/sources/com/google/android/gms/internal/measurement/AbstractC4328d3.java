package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4328d3 {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f35201a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f35202b = !a();

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    private static boolean d(Context context) {
        if (f35202b) {
            return true;
        }
        synchronized (AbstractC4328d3.class) {
            try {
                if (f35202b) {
                    return true;
                }
                boolean zE = e(context);
                if (zE) {
                    f35202b = zE;
                }
                return zE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean e(Context context) {
        boolean z10;
        boolean z11 = true;
        int i10 = 1;
        while (true) {
            z10 = false;
            if (i10 > 2) {
                break;
            }
            if (f35201a == null) {
                f35201a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f35201a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z11 = false;
                }
            } catch (NullPointerException e10) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                f35201a = null;
                i10++;
            }
        }
        z10 = z11;
        if (z10) {
            f35201a = null;
        }
        return z10;
    }
}
