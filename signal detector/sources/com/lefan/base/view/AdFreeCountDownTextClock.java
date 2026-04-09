package com.lefan.base.view;

import F4.e;
import R2.a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class AdFreeCountDownTextClock extends AppCompatTextView implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final Handler f18785h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f18786j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdFreeCountDownTextClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        i.e(attributeSet, "attrs");
        this.f18785h = new Handler(Looper.getMainLooper());
    }

    private final long getRemainingSeconds() {
        Context context = getContext();
        i.d(context, "getContext(...)");
        long j6 = (context.getSharedPreferences("sp", 0).getLong("my_reword_points_time", 0L) + 3600000) - System.currentTimeMillis();
        i.d(getContext(), "getContext(...)");
        long j7 = TTAdConstant.STYLE_SIZE_RADIO_1_1;
        this.f18786j = ((r0.getSharedPreferences("sp", 0).getInt("my_reword_points", 10) / 10) * 3600000) / j7;
        return j6 / j7;
    }

    public static String m(long j6) {
        if (j6 <= 0) {
            return "";
        }
        long j7 = 3600;
        long j8 = j6 / j7;
        long j9 = 60;
        long j10 = (j6 % j7) / j9;
        long j11 = j6 % j9;
        if (j8 > 0) {
            Long lValueOf = Long.valueOf(j8);
            Long lValueOf2 = Long.valueOf(j10);
            Long lValueOf3 = Long.valueOf(j11);
            if (!a.f3390d) {
                return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{lValueOf, lValueOf2, lValueOf3}, 3));
            }
            Locale locale = e.f1457a;
            return String.format(e.b(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{lValueOf, lValueOf2, lValueOf3}, 3));
        }
        if (j10 <= 0) {
            Long lValueOf4 = Long.valueOf(j11);
            if (!a.f3390d) {
                return String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{lValueOf4}, 1));
            }
            Locale locale2 = e.f1457a;
            return String.format(e.b(), "%d", Arrays.copyOf(new Object[]{lValueOf4}, 1));
        }
        Long lValueOf5 = Long.valueOf(j10);
        Long lValueOf6 = Long.valueOf(j11);
        if (!a.f3390d) {
            return String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{lValueOf5, lValueOf6}, 2));
        }
        Locale locale3 = e.f1457a;
        return String.format(e.b(), "%02d:%02d", Arrays.copyOf(new Object[]{lValueOf5, lValueOf6}, 2));
    }

    public final void j() {
        Handler handler = this.f18785h;
        handler.removeCallbacksAndMessages(null);
        this.i = getRemainingSeconds();
        handler.postDelayed(this, 1000L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = getRemainingSeconds();
        this.f18785h.postDelayed(this, 1000L);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18785h.removeCallbacksAndMessages(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6 = this.i - 1;
        this.i = j6;
        if (j6 <= 0) {
            setText(m(this.f18786j));
        } else {
            setText(m(j6 + this.f18786j));
            this.f18785h.postDelayed(this, 1000L);
        }
    }
}
