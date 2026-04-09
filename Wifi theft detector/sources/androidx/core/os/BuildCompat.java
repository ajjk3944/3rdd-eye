package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class BuildCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final BuildCompat f2549a = new BuildCompat();

    /* renamed from: b, reason: collision with root package name */
    public static final int f2550b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2551c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2552d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2553e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.f21921b)
    public @interface PrereleaseSdkCheck {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2554a = new a();

        @DoNotInline
        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f2550b = i10 >= 30 ? a.f2554a.a(30) : 0;
        f2551c = i10 >= 30 ? a.f2554a.a(31) : 0;
        f2552d = i10 >= 30 ? a.f2554a.a(33) : 0;
        f2553e = i10 >= 30 ? a.f2554a.a(1000000) : 0;
    }

    public static final boolean a(String codename, String buildCodename) {
        p.e(codename, "codename");
        p.e(buildCodename, "buildCodename");
        if (p.a("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        p.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        p.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        p.d(CODENAME, "CODENAME");
        return a("S", CODENAME);
    }

    public static final boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        p.d(CODENAME, "CODENAME");
        return a("UpsideDownCake", CODENAME);
    }

    public static final boolean d() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        p.d(CODENAME, "CODENAME");
        return a("VanillaIceCream", CODENAME);
    }
}
