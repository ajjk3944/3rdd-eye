package z8;

import android.os.Build;

/* loaded from: classes.dex */
public enum g {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public k3.a toNativeBlendMode() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return Build.VERSION.SDK_INT >= 29 ? k3.a.MULTIPLY : k3.a.MODULATE;
        }
        if (iOrdinal == 2) {
            return k3.a.SCREEN;
        }
        if (iOrdinal == 3) {
            return k3.a.OVERLAY;
        }
        if (iOrdinal == 4) {
            return k3.a.DARKEN;
        }
        if (iOrdinal == 5) {
            return k3.a.LIGHTEN;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return k3.a.PLUS;
    }
}
