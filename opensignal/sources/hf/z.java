package hf;

import android.graphics.Insets;
import android.net.wifi.ScanResult;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* bridge */ /* synthetic */ ScanResult.InformationElement i(Object obj) {
        return (ScanResult.InformationElement) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds k(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation l(int i10, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i10, interpolator, j);
    }

    public static /* synthetic */ void q() {
    }
}
