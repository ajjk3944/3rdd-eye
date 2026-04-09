package H8;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity f2313c;

    public /* synthetic */ d(PHSplashActivity pHSplashActivity, int i) {
        this.f2312b = i;
        this.f2313c = pHSplashActivity;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        PHSplashActivity pHSplashActivity = this.f2313c;
        switch (this.f2312b) {
            case 0:
                w9.i<Object>[] iVarArr = PHSplashActivity.i;
                return (ImageView) pHSplashActivity.findViewById(R.id.ph_splash_logo_image);
            case 1:
                return (ProgressBar) pHSplashActivity.findViewById(R.id.ph_splash_progress);
            default:
                return (TextView) pHSplashActivity.findViewById(R.id.ph_splash_title_text);
        }
    }
}
