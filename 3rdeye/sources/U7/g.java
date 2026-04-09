package U7;

import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import l8.b;

/* compiled from: InterstitialManager.kt */
/* loaded from: classes3.dex */
public final class g implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12526b;

    public g(f fVar) {
        this.f12526b = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStart(InterfaceC1790x interfaceC1790x) {
        Enum enumValueOf;
        f fVar = this.f12526b;
        l8.a aVar = fVar.f12508b;
        l8.d<String> PH_INTERSTITIAL_CAPPING_TYPE = i8.d.f38521A;
        kotlin.jvm.internal.l.e(PH_INTERSTITIAL_CAPPING_TYPE, "PH_INTERSTITIAL_CAPPING_TYPE");
        String str = PH_INTERSTITIAL_CAPPING_TYPE.f43924a;
        String str2 = PH_INTERSTITIAL_CAPPING_TYPE.f43925b;
        String str3 = (String) aVar.a(aVar, str, str2);
        try {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.EnumC0492b.class, upperCase);
            kotlin.jvm.internal.l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.EnumC0492b.class, upperCase2);
        }
        if (enumValueOf != b.EnumC0492b.SESSION || fVar.f12509c.k()) {
            return;
        }
        b bVar = (b) fVar.f12511e.getValue();
        bVar.f12504b.f2844b = 0L;
        bVar.f12503a.f2844b = 0L;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) {
    }
}
