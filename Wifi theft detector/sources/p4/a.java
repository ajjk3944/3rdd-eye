package p4;

import android.graphics.Canvas;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: p4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0453a {
        void a(Canvas canvas);
    }

    public static int a(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }
}
