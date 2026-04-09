package U7;

import F9.C0663f;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import l8.b;

/* compiled from: InterstitialProviderFactory.kt */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C0663f f12551a;

    /* renamed from: b, reason: collision with root package name */
    public final C4461a f12552b;

    /* compiled from: InterstitialProviderFactory.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12553a;

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
            f12553a = iArr;
        }
    }

    public n(C0663f c0663f, C4461a c4461a) {
        this.f12551a = c0663f;
        this.f12552b = c4461a;
    }

    public final m<?> a(l8.b bVar) {
        Enum enumValueOf;
        l8.d<String> PH_ADS_PROVIDER = i8.d.f38547a;
        kotlin.jvm.internal.l.e(PH_ADS_PROVIDER, "PH_ADS_PROVIDER");
        String str = PH_ADS_PROVIDER.f43924a;
        String str2 = PH_ADS_PROVIDER.f43925b;
        String str3 = (String) bVar.a(bVar, str, str2);
        try {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.a.class, upperCase);
            kotlin.jvm.internal.l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.a.class, upperCase2);
        }
        int i = a.f12553a[((b.a) enumValueOf).ordinal()];
        C0663f c0663f = this.f12551a;
        if (i == 1) {
            return new V7.e(c0663f, bVar, this.f12552b);
        }
        if (i == 2) {
            return new W7.d(c0663f);
        }
        throw new b9.j();
    }
}
