package M0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: M0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3267x {

    /* renamed from: a, reason: collision with root package name */
    public static final C3267x f12416a = new C3267x();

    private C3267x() {
    }

    public final boolean a(Canvas canvas, float f10, float f11, float f12, float f13) {
        return canvas.quickReject(f10, f11, f12, f13);
    }

    public final boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
