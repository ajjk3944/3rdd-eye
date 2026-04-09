package A1;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.SnmpConstants;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f212a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f213b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f214c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f215d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f216e;

    /* renamed from: A1.a$a, reason: collision with other inner class name */
    private static final class C0002a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0002a f217a = new C0002a();

        private C0002a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f213b = i10 >= 30 ? C0002a.f217a.a(30) : 0;
        f214c = i10 >= 30 ? C0002a.f217a.a(31) : 0;
        f215d = i10 >= 30 ? C0002a.f217a.a(33) : 0;
        f216e = i10 >= 30 ? C0002a.f217a.a(SnmpConstants.MILLISECOND_TO_NANOSECOND) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        AbstractC6492s.i(codename, "codename");
        AbstractC6492s.i(buildCodename, "buildCodename");
        if (AbstractC6492s.d("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        AbstractC6492s.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        AbstractC6492s.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 35) {
            if (i10 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC6492s.h(CODENAME, "CODENAME");
                if (a("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
