package rh;

import android.content.Intent;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.splash.SplashActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f32950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f32951c;

    public /* synthetic */ b(SplashActivity splashActivity, boolean z3, int i4) {
        this.f32949a = i4;
        this.f32950b = splashActivity;
        this.f32951c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f32949a;
        boolean z3 = this.f32951c;
        SplashActivity splashActivity = this.f32950b;
        switch (i4) {
            case 0:
                splashActivity.I = false;
                if (!com.liuzh.deviceinfo.utilities.d.l(splashActivity)) {
                    if (!splashActivity.A) {
                        splashActivity.F(z3);
                        break;
                    } else {
                        splashActivity.H = new b(splashActivity, z3, 1);
                        break;
                    }
                }
                break;
            case 1:
                int i10 = SplashActivity.K;
                splashActivity.E(300L, z3);
                break;
            default:
                int i11 = SplashActivity.K;
                splashActivity.getClass();
                Intent intent = new Intent(splashActivity, (Class<?>) MainActivity.class);
                intent.putExtra("extra.allowProInsert", z3);
                splashActivity.startActivity(intent);
                splashActivity.finish();
                break;
        }
    }
}
