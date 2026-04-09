package t2;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {
    public static final BoringLayout.Metrics a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean b(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean c(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void d(StaticLayout.Builder builder, int i4, int i10) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i4).setLineBreakWordStyle(i10).build());
    }
}
