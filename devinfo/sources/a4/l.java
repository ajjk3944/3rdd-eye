package a4;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l {
    public static ColorStateList a(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static float c(View view) {
        return view.getTransitionAlpha();
    }

    public static boolean d() {
        return Trace.isEnabled();
    }

    public static Object e(int i4) {
        switch (i3.e.c(i4)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets f(int i4, int i10, int i11, int i12) {
        return Insets.of(i4, i10, i11, i12);
    }

    public static void g(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void h(View view, int i4, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i4, i10, i11, i12);
    }

    public static void i(Outline outline, Path path) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            vc.b.a(outline, path);
            return;
        }
        if (i4 >= 29) {
            try {
                vc.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            vc.a.a(outline, path);
        }
    }

    public static void j(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public static void k(int i4, View view) {
        view.setTransitionVisibility(i4);
    }

    public static void l(SystemForegroundService systemForegroundService, int i4, Notification notification, int i10) {
        systemForegroundService.startForeground(i4, notification, i10);
    }

    public static void m(SystemForegroundService systemForegroundService, int i4, Notification notification, int i10) {
        try {
            systemForegroundService.startForeground(i4, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e2) {
            v vVarE = v.e();
            String str = SystemForegroundService.f1623e;
            if (vVarE.f34400a <= 5) {
                Log.w(str, "Unable to start foreground service", e2);
            }
        } catch (SecurityException e10) {
            v vVarE2 = v.e();
            String str2 = SystemForegroundService.f1623e;
            if (vVarE2.f34400a <= 5) {
                Log.w(str2, "Unable to start foreground service", e10);
            }
        }
    }

    public static void n(ViewGroup viewGroup, boolean z3) {
        viewGroup.suppressLayout(z3);
    }

    public static final void o(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static void p(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
