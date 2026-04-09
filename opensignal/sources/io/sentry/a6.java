package io.sentry;

import java.util.Locale;

/* loaded from: classes.dex */
public enum a6 {
    LOW(0.8f, 50000, 10),
    MEDIUM(1.0f, 75000, 30),
    HIGH(1.0f, 100000, 50);

    public final int bitRate;
    public final int screenshotQuality;
    public final float sizeScale;

    a6(float f10, int i10, int i11) {
        this.sizeScale = f10;
        this.bitRate = i10;
        this.screenshotQuality = i11;
    }

    public String serializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
