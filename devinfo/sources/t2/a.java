package t2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i4, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z3, TextUtils.TruncateAt truncateAt, int i10) {
        return new BoringLayout(charSequence, textPaint, i4, alignment, 1.0f, 0.0f, metrics, z3, truncateAt, i10, true);
    }
}
