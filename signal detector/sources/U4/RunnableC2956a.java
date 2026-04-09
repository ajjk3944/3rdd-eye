package u4;

import android.widget.TextView;
import com.lefan.signal.activity.SplashActivity;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2956a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f23825b;

    public /* synthetic */ RunnableC2956a(SplashActivity splashActivity, int i) {
        this.f23824a = i;
        this.f23825b = splashActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23824a;
        SplashActivity splashActivity = this.f23825b;
        switch (i) {
            case 0:
                if (!splashActivity.f18826S) {
                    splashActivity.C();
                    break;
                }
                break;
            case 1:
                int i3 = SplashActivity.f18821W;
                splashActivity.E();
                break;
            default:
                if (!splashActivity.f18828U && !splashActivity.isFinishing() && !splashActivity.isDestroyed()) {
                    CountDownTimerC2958c countDownTimerC2958c = new CountDownTimerC2958c(splashActivity);
                    splashActivity.f18829V = countDownTimerC2958c;
                    countDownTimerC2958c.start();
                    TextView textView = splashActivity.f18823P;
                    int i6 = 0;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    TextView textView2 = splashActivity.f18823P;
                    if (textView2 != null) {
                        textView2.setOnClickListener(new ViewOnClickListenerC2957b(splashActivity, i6));
                        break;
                    }
                }
                break;
        }
    }
}
