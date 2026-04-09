package z8;

import android.graphics.Paint;

/* loaded from: classes.dex */
public enum u {
    MITER,
    ROUND,
    BEVEL;

    public Paint.Join toPaintJoin() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Paint.Join.MITER;
        }
        if (iOrdinal == 1) {
            return Paint.Join.ROUND;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return Paint.Join.BEVEL;
    }
}
