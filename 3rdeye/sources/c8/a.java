package C8;

import B.f;
import B4.e;
import C.J;
import D9.G;
import E3.l;
import H6.K;
import H6.L;
import N7.Z;
import Q6.q;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.github.appintro.AppIntroBase;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.AbstractC4062u;
import com.vungle.ads.L;
import com.vungle.ads.internal.j;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import h5.d;
import i2.C4435H;
import j5.C5194a;
import j5.c;
import j6.z;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import n5.ServiceConnectionC5363F;
import p4.C5452b;
import p9.InterfaceC5480a;
import v.C5664t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f960c;

    public /* synthetic */ a(Object obj, int i) {
        this.f959b = i;
        this.f960c = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [kotlin.jvm.internal.m, p9.a] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C5194a c5194aC;
        C5194a c5194aH;
        boolean z10 = true;
        switch (this.f959b) {
            case 0:
                ((PhDeleteAccountActivity) this.f960c).finish();
                return;
            case 1:
                l lVar = (l) this.f960c;
                lVar.getClass();
                lVar.f1415d.e(new f(lVar, 5));
                return;
            case 2:
                L this$0 = (L) this.f960c;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                WeakHashMap<View, Z> visibleViews = this$0.f2070g;
                K k10 = this$0.f2065b;
                kotlin.jvm.internal.l.f(visibleViews, "visibleViews");
                Iterator it = k10.f2059b.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).a();
                }
                this$0.f2074l = false;
                return;
            case 3:
                q this$02 = (q) this.f960c;
                kotlin.jvm.internal.l.f(this$02, "this$0");
                this$02.f11371d.setVisibility(this$02.f11370c.getItemCount() == 0 ? 8 : 0);
                return;
            case 4:
                ((CarouselLayoutManager) this.f960c).q1();
                return;
            case 5:
                C5664t.b bVar = (C5664t.b) this.f960c;
                if (C5664t.this.f46876f == C5664t.f.PENDING_OPEN) {
                    C5664t.this.K(false);
                    return;
                }
                return;
            case 6:
                ((MaxAdViewImpl) this.f960c).g();
                return;
            case 7:
                ((MaxFullscreenAdImpl) this.f960c).b();
                return;
            case 8:
                ((k) this.f960c).K0();
                return;
            case 9:
                ((com.applovin.impl.sdk.network.b) this.f960c).e();
                return;
            case 10:
                ((MaxAdPlacer) this.f960c).b();
                return;
            case 11:
                AppIntroBase.m11onPostCreate$lambda2((AppIntroBase) this.f960c);
                return;
            case 12:
                AbstractC4059q.m123onLoadSuccess$lambda0((AbstractC4059q) this.f960c);
                return;
            case 13:
                AbstractC4062u.a.m125onAdEnd$lambda2((AbstractC4062u) this.f960c);
                return;
            case 14:
                L.b.m22onAdStart$lambda0((com.vungle.ads.L) this.f960c);
                return;
            case 15:
                j.m65onInitSuccess$lambda13((j) this.f960c);
                return;
            case 16:
                ((J.h) this.f960c).a();
                return;
            case 17:
                h5.b bVar2 = (h5.b) this.f960c;
                bVar2.getClass();
                synchronized (h5.b.f38246m) {
                    try {
                        e eVar = bVar2.f38247a;
                        eVar.a();
                        G gF = G.f(eVar.f487a);
                        try {
                            c5194aC = bVar2.f38249c.c();
                            if (gF != null) {
                                gF.i();
                            }
                        } catch (Throwable th) {
                            if (gF != null) {
                                gF.i();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    c.a aVarF = c5194aC.f();
                    c.a aVar = c.a.REGISTER_ERROR;
                    if (aVarF == aVar) {
                        c5194aH = bVar2.h(c5194aC);
                    } else {
                        if (c5194aC.f() != c.a.UNREGISTERED) {
                            z10 = false;
                        }
                        if (z10) {
                            c5194aH = bVar2.h(c5194aC);
                        } else if (!bVar2.f38250d.a(c5194aC)) {
                            return;
                        } else {
                            c5194aH = bVar2.d(c5194aC);
                        }
                    }
                    bVar2.e(c5194aH);
                    bVar2.l(c5194aC, c5194aH);
                    if (c5194aH.f() == c.a.REGISTERED) {
                        bVar2.k(c5194aH.f42956b);
                    }
                    if (c5194aH.f() == aVar) {
                        d.a aVar2 = d.a.BAD_CONFIG;
                        bVar2.i(new d());
                        return;
                    }
                    c.a aVar3 = c.a.NOT_GENERATED;
                    c.a aVar4 = c5194aH.f42957c;
                    if (aVar4 == aVar3 || aVar4 == c.a.ATTEMPT_MIGRATION) {
                        bVar2.i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        bVar2.j(c5194aH);
                        return;
                    }
                } catch (d e4) {
                    bVar2.i(e4);
                    return;
                }
            case 18:
                ((C4435H) this.f960c).d();
                return;
            case 19:
                n5.j.a((Intent) this.f960c);
                return;
            case 20:
                StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                ServiceConnectionC5363F.a aVar5 = (ServiceConnectionC5363F.a) this.f960c;
                sb.append(aVar5.f44314a.getAction());
                sb.append(" finishing.");
                Log.w("FirebaseMessaging", sb.toString());
                aVar5.f44315b.trySetResult(null);
                return;
            case 21:
                ((Toolbar) this.f960c).n();
                return;
            case 22:
                ((m) this.f960c).invoke();
                return;
            case 23:
                ((C5452b) this.f960c).t(true);
                return;
            default:
                C5664t.e.a aVar6 = (C5664t.e.a) this.f960c;
                if (C5664t.this.f46876f == C5664t.f.OPENING) {
                    C5664t.this.u("Camera onError timeout, reopen it.", null);
                    C5664t.this.F(C5664t.f.REOPENING);
                    C5664t.this.f46879j.b();
                    return;
                } else {
                    C5664t.this.u("Camera skip reopen at state: " + C5664t.this.f46876f, null);
                    return;
                }
        }
    }

    public /* synthetic */ a(n5.j jVar, Intent intent) {
        this.f959b = 19;
        this.f960c = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(InterfaceC5480a interfaceC5480a) {
        this.f959b = 22;
        this.f960c = (m) interfaceC5480a;
    }
}
