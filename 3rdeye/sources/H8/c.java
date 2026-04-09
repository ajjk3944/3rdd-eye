package H8;

import android.widget.ImageView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity f2311c;

    public /* synthetic */ c(PHSplashActivity pHSplashActivity, int i) {
        this.f2310b = i;
        this.f2311c = pHSplashActivity;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        PHSplashActivity pHSplashActivity = this.f2311c;
        switch (this.f2310b) {
            case 0:
                w9.i<Object>[] iVarArr = PHSplashActivity.i;
                return pHSplashActivity.findViewById(R.id.root);
            default:
                return (ImageView) pHSplashActivity.findViewById(R.id.ph_splash_logo_image);
        }
    }
}
