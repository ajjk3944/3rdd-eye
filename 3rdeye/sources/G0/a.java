package G0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: BuildCompat.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1844a = 0;

    /* compiled from: BuildCompat.kt */
    /* renamed from: G0.a$a, reason: collision with other inner class name */
    public static final class C0033a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0033a f1845a = new C0033a();

        public final int a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        C0033a c0033a = C0033a.f1845a;
        if (i >= 30) {
            c0033a.a(30);
        }
        if (i >= 30) {
            c0033a.a(31);
        }
        if (i >= 30) {
            c0033a.a(33);
        }
        if (i >= 30) {
            c0033a.a(1000000);
        }
    }

    public static final boolean a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        kotlin.jvm.internal.l.f(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        kotlin.jvm.internal.l.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        kotlin.jvm.internal.l.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
