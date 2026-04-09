package com.github.appintro.internal;

import android.util.Log;
import kotlin.jvm.internal.l;
import w9.InterfaceC5748c;

/* compiled from: LogHelper.kt */
/* loaded from: classes.dex */
public final class LogHelper {
    public static final LogHelper INSTANCE = new LogHelper();

    private LogHelper() {
    }

    private final String cutTagLength(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        String strSubstring = str.substring(0, i - 1);
        l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int d(String tag, String message) {
        l.f(tag, "tag");
        l.f(message, "message");
        return Log.d(tag, message);
    }

    public static final void e(String tag, String message) {
        l.f(tag, "tag");
        l.f(message, "message");
        e$default(tag, message, null, 4, null);
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        e(str, str2, th);
    }

    public static final int i(String tag, String message) {
        l.f(tag, "tag");
        l.f(message, "message");
        return Log.i(tag, message);
    }

    public static final String makeLogTag(Class<?> cls) {
        l.f(cls, "cls");
        return l.k(INSTANCE.cutTagLength(cls.getSimpleName(), 18), "Log: ");
    }

    public static final int v(String tag, String message) {
        l.f(tag, "tag");
        l.f(message, "message");
        return Log.v(tag, message);
    }

    public static final void w(String tag, String message) {
        l.f(tag, "tag");
        l.f(message, "message");
        w$default(tag, message, null, 4, null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public static final void wtf(String tag, String message) {
        l.f(tag, "tag");
        l.f(message, "message");
        wtf$default(tag, message, null, 4, null);
    }

    public static /* synthetic */ void wtf$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        wtf(str, str2, th);
    }

    public static final void e(String tag, String message, Throwable th) {
        l.f(tag, "tag");
        l.f(message, "message");
        Log.e(tag, message, th);
    }

    public static final void w(String tag, String message, Throwable th) {
        l.f(tag, "tag");
        l.f(message, "message");
        Log.w(tag, message, th);
    }

    public static final void wtf(String tag, String message, Throwable th) {
        l.f(tag, "tag");
        l.f(message, "message");
        Log.wtf(tag, message, th);
    }

    public final String makeLogTag(InterfaceC5748c<?> cls) {
        l.f(cls, "cls");
        String strD = cls.d();
        if (strD == null) {
            strD = "";
        }
        return l.k(cutTagLength(strD, 18), "Log: ");
    }
}
