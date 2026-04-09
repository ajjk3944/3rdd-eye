package H8;

import A9.C0575f;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.DetectInfraredActivity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.MainActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.support.ContactSupportActivity;
import com.zipoapps.premiumhelper.toto.TotoManager;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import f8.AbstractActivityC4340c;
import i8.C4461a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.t;
import p9.InterfaceC5480a;
import t8.f;
import va.a;
import w1.AbstractC5715a;
import x2.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2315c;

    public /* synthetic */ e(Object obj, int i) {
        this.f2314b = i;
        this.f2315c = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        boolean z10 = true;
        Object obj = this.f2315c;
        switch (this.f2314b) {
            case 0:
                w9.i<Object>[] iVarArr = PHSplashActivity.i;
                PHSplashActivity pHSplashActivity = (PHSplashActivity) obj;
                pHSplashActivity.getClass();
                C0575f.e(A2.l.y(pHSplashActivity), null, null, new g(pHSplashActivity, null), 3);
                return C1992A.f18074a;
            case 1:
                ((t) obj).f43657b = true;
                return C1992A.f18074a;
            case 2:
                return TotoManager.userAgent_delegate$lambda$0((TotoManager) obj);
            case 3:
                int i = AbstractActivityC4340c.i;
                return (TextView) ((AbstractActivityC4340c) obj).findViewById(R.id.tvTerms);
            case 4:
                f.b bVar = (f.b) obj;
                Bundle bundleA = G0.d.a(new b9.l("offers_loading_time", Long.valueOf(bVar.calculateDuration(bVar.f46459b, bVar.f46458a))), new b9.l("offers_cache_hit", bVar.booleanToString(bVar.f46460c)), new b9.l("screen_name", bVar.f46461d), new b9.l("update_offers_cache_time", Long.valueOf(bVar.calculateDuration(bVar.f46463f, bVar.f46462e))), new b9.l("failed_skus", bVar.listToCsv(bVar.f46464g)), new b9.l("cache_prepared", bVar.booleanToString(bVar.f46465h)));
                a.b bVar2 = va.a.f47104a;
                bVar2.o("PurchasesTracker");
                bVar2.k(bundleA.toString(), new Object[0]);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                C4461a c4461a = e.a.a().f37021k;
                c4461a.getClass();
                c4461a.r(c4461a.c("Performance_offers", false, bundleA));
                return C1992A.f18074a;
            case 5:
                int i10 = ContactSupportActivity.f37060f;
                return (MaterialToolbar) ((ContactSupportActivity) obj).findViewById(R.id.toolbar);
            case 6:
                androidx.room.c cVar = (androidx.room.c) obj;
                if (cVar.f16789a.l() && !cVar.f16789a.p()) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 7:
                return ((Callable) obj).call();
            case 8:
                o oVar = (o) obj;
                oVar.getClass();
                MainActivity mainActivity = oVar.f47663b;
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) DetectInfraredActivity.class));
                mainActivity.f22089g.dismiss();
                return null;
            default:
                return ((AbstractC5715a.C0543a) obj).a(":memory:");
        }
    }
}
