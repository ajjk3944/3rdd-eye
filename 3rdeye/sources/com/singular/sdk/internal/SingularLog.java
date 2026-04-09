package com.singular.sdk.internal;

import android.util.Log;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class SingularLog {
    static boolean ENABLE_LOGGING = false;
    static int LOG_LEVEL = 6;
    private final String TAG;
    private PrintWriter printWriter;
    private final String tag;

    public static SingularLog getLogger(String str) {
        return new SingularLog(str);
    }

    public static String getThreadInfo() {
        return Thread.currentThread().getName();
    }

    public int debug(String str) {
        if (shouldLog(3)) {
            return Log.d("Singular", text(str));
        }
        return 0;
    }

    public int error(String str) {
        if (shouldLog(6)) {
            return Log.e("Singular", text(str));
        }
        return 0;
    }

    public int info(String str) {
        if (shouldLog(4)) {
            return Log.i("Singular", text(str));
        }
        return 0;
    }

    public boolean isDebugEnabled() {
        return shouldLog(3);
    }

    public boolean shouldLog(int i) {
        return ENABLE_LOGGING && LOG_LEVEL <= i;
    }

    public String text(String str) {
        return this.tag + " [" + getThreadInfo() + "] - " + str;
    }

    private SingularLog(String str) {
        this.TAG = "Singular";
        this.tag = str;
    }

    public static SingularLog getLogger(String str, String str2) {
        final boolean z10 = !"PROD".equals(str2);
        return new SingularLog(str) { // from class: com.singular.sdk.internal.SingularLog.1
            @Override // com.singular.sdk.internal.SingularLog
            public boolean shouldLog(int i) {
                return super.shouldLog(i) && z10;
            }
        };
    }

    public int debug(String str, Object... objArr) {
        if (shouldLog(3)) {
            return Log.d("Singular", text(String.format(str, objArr)));
        }
        return 0;
    }

    public int error(String str, Throwable th) {
        if (shouldLog(6)) {
            return Log.e("Singular", text(str), th);
        }
        return 0;
    }

    public int info(String str, Object... objArr) {
        if (shouldLog(4)) {
            return Log.i("Singular", text(String.format(str, objArr)));
        }
        return 0;
    }

    public int error(String str, Object... objArr) {
        if (shouldLog(6)) {
            return Log.e("Singular", text(String.format(str, objArr)));
        }
        return 0;
    }
}
