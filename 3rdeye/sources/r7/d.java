package R7;

import F9.C0663f;
import I9.g;
import b9.j;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import kotlin.jvm.internal.l;
import l8.b;

/* compiled from: BannerProviderFactory.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0663f f11764a;

    /* renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f11765b;

    /* compiled from: BannerProviderFactory.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11766a;

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
            f11766a = iArr;
        }
    }

    public d(C0663f c0663f, com.zipoapps.premiumhelper.d dVar) {
        this.f11764a = c0663f;
        this.f11765b = dVar;
    }

    public final g a(l8.b bVar) {
        Enum enumValueOf;
        l8.d<String> PH_ADS_PROVIDER = i8.d.f38547a;
        l.e(PH_ADS_PROVIDER, "PH_ADS_PROVIDER");
        String str = PH_ADS_PROVIDER.f43924a;
        String str2 = PH_ADS_PROVIDER.f43925b;
        String str3 = (String) bVar.a(bVar, str, str2);
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
        int i = a.f11766a[((b.a) enumValueOf).ordinal()];
        com.zipoapps.premiumhelper.d dVar = this.f11765b;
        C0663f c0663f = this.f11764a;
        if (i == 1) {
            return new S7.c(c0663f, dVar, bVar);
        }
        if (i == 2) {
            return new T7.c(c0663f, dVar);
        }
        throw new j();
    }
}
