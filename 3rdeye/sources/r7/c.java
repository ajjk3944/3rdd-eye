package R7;

import P7.r;
import android.os.Bundle;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import kotlin.jvm.internal.l;
import t8.C5613a;
import t8.c;

/* compiled from: BannerManager.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.banner.a f11762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11763b;

    public c(com.zipoapps.ads.banner.a aVar, boolean z10) {
        this.f11762a = aVar;
        this.f11763b = z10;
    }

    public final void a() {
        va.a.f47104a.a("[BannerManager] onAdClosed", new Object[0]);
    }

    public final void b() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        l.f(c4461a, "<this>");
        c4461a.u("First_banner_impression", new Bundle[0]);
        va.a.f47104a.a("[BannerManager] onAdImpression", new Object[0]);
        C4461a.h(this.f11762a.f36965d, r.BANNER);
    }

    public final void c() {
        va.a.f47104a.a("[BannerManager] onAdOpened", new Object[0]);
    }

    public final void d() {
        va.a.f47104a.a("[BannerManager] onBannerClicked", new Object[0]);
        C4461a.g(this.f11762a.f36965d, r.BANNER);
    }

    public final void e(a aVar) {
        va.a.f47104a.a("[BannerManager] onLoadingCompleted", new Object[0]);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        l.f(c4461a, "<this>");
        c4461a.u("First_banner_loaded", new Bundle[0]);
        com.zipoapps.ads.banner.a aVar2 = this.f11762a;
        aVar2.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - aVar2.f36970j;
        t8.c.f46451c.getClass();
        t8.e.a(new C5613a(jCurrentTimeMillis, c.a.a()));
        if (aVar2.i.get(aVar.a()) != null || this.f11763b) {
            return;
        }
        aVar2.b(aVar.a());
    }
}
