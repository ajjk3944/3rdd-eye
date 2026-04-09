package F1;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    private static Map f5664a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f5664a.containsKey(velocityTracker)) {
                f5664a.put(velocityTracker, new U());
            }
            ((U) f5664a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i10) {
        c(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        U uE = e(velocityTracker);
        if (uE != null) {
            uE.c(i10, f10);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        U uE = e(velocityTracker);
        if (uE != null) {
            return uE.d(i10);
        }
        return 0.0f;
    }

    private static U e(VelocityTracker velocityTracker) {
        return (U) f5664a.get(velocityTracker);
    }
}
