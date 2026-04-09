package j2;

import android.view.MotionEvent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f27250a = new p1();

    public final boolean a(MotionEvent motionEvent, int i4) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i4)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i4)) & Integer.MAX_VALUE) < 2139095040;
    }
}
