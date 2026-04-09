package u4;

import F4.e;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.apm.insight.R;
import com.lefan.signal.MyApplication;
import com.lefan.signal.activity.SplashActivity;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import q5.i;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CountDownTimerC2958c extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f23828a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC2958c(SplashActivity splashActivity) {
        super(3000L, 1000L);
        this.f23828a = splashActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        SplashActivity splashActivity = this.f23828a;
        TextView textView = splashActivity.f18823P;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (MyApplication.f18816h) {
            return;
        }
        splashActivity.E();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j6) {
        String str;
        SplashActivity splashActivity = this.f23828a;
        if (splashActivity.isFinishing() || splashActivity.isDestroyed()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j6) + 1;
        TextView textView = splashActivity.f18823P;
        if (textView != null) {
            String string = splashActivity.getString(R.string.skip_string);
            i.d(string, "getString(...)");
            Long lValueOf = Long.valueOf(seconds);
            if (R2.a.f3390d) {
                Locale locale = e.f1457a;
                str = String.format(e.b(), string, Arrays.copyOf(new Object[]{lValueOf}, 1));
            } else {
                str = String.format(Locale.ENGLISH, string, Arrays.copyOf(new Object[]{lValueOf}, 1));
            }
            textView.setText(str);
        }
    }
}
