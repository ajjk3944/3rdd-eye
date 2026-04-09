package o;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class S {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i, int i3, int i6, int i7) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i3, i6, i7);
    }

    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
