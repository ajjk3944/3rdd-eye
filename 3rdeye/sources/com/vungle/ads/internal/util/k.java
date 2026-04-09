package com.vungle.ads.internal.util;

import android.util.Log;
import java.util.regex.Pattern;

/* compiled from: Logger.kt */
/* loaded from: classes2.dex */
public final class k {
    public static final a Companion = new a(null);
    private static boolean enabled;

    /* compiled from: Logger.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int d(String tag, String message) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            if (k.enabled) {
                return Log.d(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int e(String tag, String message) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            if (k.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final void enable(boolean z10) {
            k.enabled = z10;
        }

        public final String eraseSensitiveData(String str) {
            kotlin.jvm.internal.l.f(str, "<this>");
            Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            kotlin.jvm.internal.l.e(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            String strReplaceAll = patternCompile.matcher(str).replaceAll("xxx.xxx.xxx.xxx");
            kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
            return strReplaceAll;
        }

        public final int i(String tag, String message) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            if (k.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int w(String tag, String message) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            if (k.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        private a() {
        }

        public final int e(String tag, String message, Throwable throwable) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            kotlin.jvm.internal.l.f(throwable, "throwable");
            if (!k.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int i(String tag, String message, Throwable throwable) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            kotlin.jvm.internal.l.f(throwable, "throwable");
            if (!k.enabled) {
                return -1;
            }
            return Log.i(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int w(String tag, String message, Throwable throwable) {
            kotlin.jvm.internal.l.f(tag, "tag");
            kotlin.jvm.internal.l.f(message, "message");
            kotlin.jvm.internal.l.f(throwable, "throwable");
            if (!k.enabled) {
                return -1;
            }
            return Log.w(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }
    }

    public static final int d(String str, String str2) {
        return Companion.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return Companion.e(str, str2);
    }

    public static final int i(String str, String str2) {
        return Companion.i(str, str2);
    }

    public static final int w(String str, String str2) {
        return Companion.w(str, str2);
    }

    public static final int e(String str, String str2, Throwable th) {
        return Companion.e(str, str2, th);
    }

    public static final int i(String str, String str2, Throwable th) {
        return Companion.i(str, str2, th);
    }

    public static final int w(String str, String str2, Throwable th) {
        return Companion.w(str, str2, th);
    }
}
