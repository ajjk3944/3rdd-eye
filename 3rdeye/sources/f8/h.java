package f8;

import android.os.CountDownTimer;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PremiumViewModel.kt */
/* loaded from: classes3.dex */
public final class h extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4342e f37865a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j4, AbstractC4342e abstractC4342e) {
        super(j4, 1000L);
        this.f37865a = abstractC4342e;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        AbstractC4342e abstractC4342e = this.f37865a;
        abstractC4342e.f37844o = null;
        abstractC4342e.g();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = 60;
        this.f37865a.f37839j.k(String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j4) % 24), Long.valueOf(timeUnit.toMinutes(j4) % j10), Long.valueOf(timeUnit.toSeconds(j4) % j10)}, 3)));
    }
}
