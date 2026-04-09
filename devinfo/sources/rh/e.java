package rh;

import android.os.Handler;
import com.liuzh.deviceinfo.splash.SplashActivity;
import fb.r;
import km.y;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends pi.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32958f;
    public final /* synthetic */ long g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f32959h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SplashActivity splashActivity, long j, int i4) {
        super(0);
        this.f32958f = i4;
        this.f32959h = splashActivity;
        this.g = j;
    }

    @Override // pi.e, cm.g
    public final void B(String str) {
        int i4 = this.f32958f;
        long j = this.g;
        SplashActivity splashActivity = this.f32959h;
        switch (i4) {
            case 0:
                if (!i0.l(splashActivity)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    if (jCurrentTimeMillis <= 5000) {
                        if (jCurrentTimeMillis <= 2000) {
                            int i10 = SplashActivity.K;
                            splashActivity.E(3000L, true);
                            break;
                        } else {
                            int i11 = SplashActivity.K;
                            splashActivity.E(1000L, true);
                            break;
                        }
                    } else {
                        boolean z3 = jCurrentTimeMillis < 15000;
                        int i12 = SplashActivity.K;
                        splashActivity.E(0L, z3);
                        break;
                    }
                }
                break;
            default:
                if (!i0.l(splashActivity)) {
                    splashActivity.J = true;
                    if (splashActivity.I) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                        if (jCurrentTimeMillis2 <= 5000) {
                            if (jCurrentTimeMillis2 <= 2000) {
                                splashActivity.E(1600L, false);
                                break;
                            } else {
                                splashActivity.E(1000L, false);
                                break;
                            }
                        } else {
                            splashActivity.E(0L, false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // pi.e, cm.g
    public final void C(i0.f fVar) {
        int i4 = this.f32958f;
        long j = 0;
        SplashActivity splashActivity = this.f32959h;
        switch (i4) {
            case 0:
                Handler handler = splashActivity.C;
                if (!i0.l(splashActivity)) {
                    int i10 = SplashActivity.K;
                    if (!splashActivity.A) {
                        handler.removeCallbacksAndMessages(null);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j8 = this.g;
                        if (jCurrentTimeMillis - j8 < 300) {
                            j = 1200;
                        } else if (System.currentTimeMillis() - j8 < 500) {
                            j = 1000;
                        }
                        handler.postDelayed(new r(this, false, fVar, 11), j);
                        break;
                    } else {
                        splashActivity.E = fVar;
                        splashActivity.E(0L, false);
                        break;
                    }
                }
                break;
            default:
                if (!i0.l(splashActivity)) {
                    if (!splashActivity.I) {
                        splashActivity.E = fVar;
                        break;
                    } else {
                        splashActivity.C.removeCallbacksAndMessages(null);
                        if (!splashActivity.A) {
                            fVar.T(splashActivity, new y(16, this));
                            break;
                        } else {
                            splashActivity.E = fVar;
                            splashActivity.E(0L, false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // cm.g
    public final void x(pi.b bVar) {
        switch (this.f32958f) {
            case 0:
                cg.a.f2848b.d(bVar);
                break;
            default:
                cg.a.f2848b.d(bVar);
                break;
        }
    }
}
