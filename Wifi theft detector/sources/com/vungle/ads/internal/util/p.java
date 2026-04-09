package com.vungle.ads.internal.util;

import android.util.Log;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p {

    @NotNull
    public static final a Companion = new a(null);
    private static boolean enabled;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @JvmStatic
        public final int d(@NotNull String tag, @NotNull String message) {
            kotlin.jvm.internal.p.e(tag, "tag");
            kotlin.jvm.internal.p.e(message, "message");
            if (p.enabled) {
                return Log.d(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @JvmStatic
        public final int e(@NotNull String tag, @NotNull String message) {
            kotlin.jvm.internal.p.e(tag, "tag");
            kotlin.jvm.internal.p.e(message, "message");
            if (p.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final void enable(boolean z10) {
            p.enabled = z10;
        }

        @NotNull
        public final String eraseSensitiveData(@NotNull String str) {
            kotlin.jvm.internal.p.e(str, "<this>");
            Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            kotlin.jvm.internal.p.d(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new Regex(patternCompile).b(str, "xxx.xxx.xxx.xxx");
        }

        @JvmStatic
        public final int i(@NotNull String tag, @NotNull String message) {
            kotlin.jvm.internal.p.e(tag, "tag");
            kotlin.jvm.internal.p.e(message, "message");
            if (p.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        @JvmStatic
        public final int w(@NotNull String tag, @NotNull String message) {
            kotlin.jvm.internal.p.e(tag, "tag");
            kotlin.jvm.internal.p.e(message, "message");
            if (p.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        private a() {
        }

        @JvmStatic
        public final int e(@NotNull String tag, @NotNull String message, @NotNull Throwable throwable) {
            kotlin.jvm.internal.p.e(tag, "tag");
            kotlin.jvm.internal.p.e(message, "message");
            kotlin.jvm.internal.p.e(throwable, "throwable");
            if (!p.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        @JvmStatic
        public final int w(@NotNull String tag, @NotNull l9.a message) {
            kotlin.jvm.internal.p.e(tag, "tag");
            kotlin.jvm.internal.p.e(message, "message");
            if (p.enabled) {
                return Log.w(tag, eraseSensitiveData((String) message.invoke()));
            }
            return -1;
        }
    }

    @JvmStatic
    public static final int d(@NotNull String str, @NotNull String str2) {
        return Companion.d(str, str2);
    }

    @JvmStatic
    public static final int e(@NotNull String str, @NotNull String str2) {
        return Companion.e(str, str2);
    }

    @JvmStatic
    public static final int i(@NotNull String str, @NotNull String str2) {
        return Companion.i(str, str2);
    }

    @JvmStatic
    public static final int w(@NotNull String str, @NotNull String str2) {
        return Companion.w(str, str2);
    }

    @JvmStatic
    public static final int e(@NotNull String str, @NotNull String str2, @NotNull Throwable th) {
        return Companion.e(str, str2, th);
    }

    @JvmStatic
    public static final int w(@NotNull String str, @NotNull l9.a aVar) {
        return Companion.w(str, aVar);
    }
}
