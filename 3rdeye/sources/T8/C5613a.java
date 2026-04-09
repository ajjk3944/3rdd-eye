package t8;

import android.os.Bundle;
import b9.C1992A;
import b9.l;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import p9.InterfaceC5480a;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5613a implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f46448c;

    public /* synthetic */ C5613a(long j4, c cVar) {
        this.f46447b = j4;
        this.f46448c = cVar;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        l lVar = new l("banner_loading_time", Long.valueOf(this.f46447b));
        l lVar2 = new l("banner_count", Integer.valueOf(this.f46448c.f46453a));
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        Bundle bundleA = G0.d.a(lVar, lVar2, new l("ads_provider", e.a.a().f37034x.d().name()));
        a.b bVar = va.a.f47104a;
        bVar.o("AdsLoadingPerformance");
        bVar.a(bundleA.toString(), new Object[0]);
        C4461a c4461a = e.a.a().f37021k;
        c4461a.getClass();
        c4461a.r(c4461a.c("Performance_banners", false, bundleA));
        return C1992A.f18074a;
    }
}
