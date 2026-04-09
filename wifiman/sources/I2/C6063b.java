package i2;

import android.os.Build;
import android.os.ext.SdkExtensions;
import org.snmp4j.mp.SnmpConstants;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6063b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6063b f48796a = new C6063b();

    /* renamed from: i2.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f48797a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* renamed from: i2.b$b, reason: collision with other inner class name */
    private static final class C1808b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1808b f48798a = new C1808b();

        private C1808b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(SnmpConstants.MILLISECOND_TO_NANOSECOND);
        }
    }

    private C6063b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C1808b.f48798a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return a.f48797a.a();
        }
        return 0;
    }
}
