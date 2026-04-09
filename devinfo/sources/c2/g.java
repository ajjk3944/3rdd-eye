package c2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g {
    public static long a(MotionEvent motionEvent, int i4) {
        float rawX = motionEvent.getRawX(i4);
        float rawY = motionEvent.getRawY(i4);
        return (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
