package Q7;

import H6.B;
import b9.j;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import kotlin.jvm.internal.l;
import l8.b;
import l8.d;

/* compiled from: AdUnitIdProviderFactory.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: AdUnitIdProviderFactory.kt */
    /* renamed from: Q7.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0147a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11379a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.ADMOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.APPLOVIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11379a = iArr;
        }
    }

    public static B a(l8.b configuration) {
        Enum enumValueOf;
        l.f(configuration, "configuration");
        d<String> PH_ADS_PROVIDER = i8.d.f38547a;
        l.e(PH_ADS_PROVIDER, "PH_ADS_PROVIDER");
        String str = PH_ADS_PROVIDER.f43924a;
        String str2 = PH_ADS_PROVIDER.f43925b;
        String str3 = (String) configuration.a(configuration, str, str2);
        try {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.a.class, upperCase);
            l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.a.class, upperCase2);
        }
        int i = C0147a.f11379a[((b.a) enumValueOf).ordinal()];
        if (i == 1) {
            return new b(configuration);
        }
        if (i == 2) {
            return new c(configuration);
        }
        throw new j();
    }
}
