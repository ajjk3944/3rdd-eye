package U7;

import J8.y;
import P7.r;
import P7.s;
import P7.t;
import android.app.Activity;
import android.os.Bundle;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import l8.b;

/* compiled from: InterstitialManager.kt */
/* loaded from: classes3.dex */
public final class h extends s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f12528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f12529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, s sVar, Activity activity, y yVar, long j4) {
        super(yVar, j4);
        this.f12527c = fVar;
        this.f12528d = sVar;
        this.f12529e = activity;
    }

    @Override // P7.s
    public final void a() {
        f fVar = this.f12527c;
        va.a.f47104a.a("[InterstitialManager] onClick", new Object[0]);
        C4461a.g(fVar.f12510d, r.INTERSTITIAL);
        this.f12528d.a();
    }

    @Override // P7.s
    public final void b() {
        Enum enumValueOf;
        f fVar = this.f12527c;
        va.a.f47104a.a("[InterstitialManager] onClosed", new Object[0]);
        fVar.f12520o = null;
        fVar.e(0L);
        b bVar = (b) fVar.f12511e.getValue();
        bVar.f12504b.c();
        bVar.f12503a.c();
        l8.d<String> PH_INTERSTITIAL_CAPPING_TYPE = i8.d.f38521A;
        kotlin.jvm.internal.l.e(PH_INTERSTITIAL_CAPPING_TYPE, "PH_INTERSTITIAL_CAPPING_TYPE");
        l8.a aVar = fVar.f12508b;
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
        if (enumValueOf == b.EnumC0492b.GLOBAL) {
            fVar.f12509c.n(Long.valueOf(System.currentTimeMillis()), "interstitial_capping_timestamp");
        }
        this.f12528d.b();
    }

    @Override // P7.s
    public final void c(t tVar) {
        f fVar = this.f12527c;
        va.a.f47104a.c("[InterstitialManager] onError: error=" + tVar, new Object[0]);
        fVar.f12520o = null;
        fVar.e(0L);
        K9.d dVar = Z7.a.f14051a;
        Z7.a.a(this.f12529e, com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, tVar.f10796a);
        this.f12528d.c(tVar);
    }

    @Override // P7.s
    public final void d() {
        va.a.f47104a.a("[InterstitialManager] onImpression", new Object[0]);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        kotlin.jvm.internal.l.f(c4461a, "<this>");
        c4461a.u("First_interstitial_impression", new Bundle[0]);
        this.f12528d.d();
    }

    @Override // P7.s
    public final void e() {
        f fVar = this.f12527c;
        va.a.f47104a.a("[InterstitialManager] onStartShow", new Object[0]);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        kotlin.jvm.internal.l.f(c4461a, "<this>");
        c4461a.u("First_interstitial_shown", new Bundle[0]);
        C4461a.h(fVar.f12510d, r.INTERSTITIAL);
        this.f12528d.e();
    }
}
