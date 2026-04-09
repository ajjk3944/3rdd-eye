package X6;

import android.os.Build;
import android.widget.TextView;

/* compiled from: FixedLineHeightHelper.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13583a;

    /* renamed from: b, reason: collision with root package name */
    public int f13584b;

    /* renamed from: c, reason: collision with root package name */
    public int f13585c;

    /* renamed from: d, reason: collision with root package name */
    public int f13586d = -1;

    public h(TextView textView) {
        this.f13583a = textView;
        textView.setIncludeFontPadding(false);
    }

    public final void a(int i) {
        TextView textView = this.f13583a;
        if (i == -1) {
            this.f13584b = 0;
            this.f13585c = 0;
            textView.setLineSpacing(0.0f, 1.0f);
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setFallbackLineSpacing(true);
                return;
            }
            return;
        }
        int fontMetricsInt = i - textView.getPaint().getFontMetricsInt(null);
        if (fontMetricsInt < 0) {
            int i10 = fontMetricsInt / 2;
            this.f13584b = i10;
            this.f13585c = fontMetricsInt - i10;
        } else {
            int i11 = fontMetricsInt / 2;
            this.f13585c = i11;
            this.f13584b = fontMetricsInt - i11;
        }
        textView.setLineSpacing(i - textView.getPaint().getFontMetrics(null), 1.0f);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFallbackLineSpacing(false);
        }
    }
}
