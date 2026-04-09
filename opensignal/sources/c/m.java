package c;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* synthetic */ LineBreakConfig.Builder b() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout f(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11, true);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback g(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher j(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
