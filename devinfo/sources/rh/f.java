package rh;

import com.google.android.gms.internal.ads.oh;
import com.liuzh.deviceinfo.splash.SplashLoadingActivity;
import j$.util.Objects;
import km.o;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashLoadingActivity f32961b;

    public /* synthetic */ f(SplashLoadingActivity splashLoadingActivity, int i4) {
        this.f32960a = i4;
        this.f32961b = splashLoadingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f32960a;
        SplashLoadingActivity splashLoadingActivity = this.f32961b;
        switch (i4) {
            case 0:
                int i10 = SplashLoadingActivity.C;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ag.c cVar = ag.c.f364f;
                la.e eVar = new la.e(splashLoadingActivity, jCurrentTimeMillis);
                int i11 = 0;
                if (!cVar.a(splashLoadingActivity, false)) {
                    eVar.a(false);
                    break;
                } else {
                    Objects.requireNonNull(cVar.f365a);
                    o oVar = cVar.f365a;
                    i iVar = new i(splashLoadingActivity, eVar);
                    oVar.getClass();
                    oh ohVar = (oh) oVar.f28445a;
                    ohVar.f14700b.f15004a = new qi.d(i11, (pi.a) oVar.f28446b, iVar);
                    ohVar.b(splashLoadingActivity);
                    cVar.f368d = true;
                    break;
                }
            default:
                int i12 = SplashLoadingActivity.C;
                splashLoadingActivity.finish();
                break;
        }
    }
}
