package v6;

import android.graphics.Paint;
import kotlin.jvm.internal.AbstractC6492s;
import u6.InterfaceC8137b;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8193a {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f63484b;

    /* renamed from: d, reason: collision with root package name */
    private static Paint f63486d;

    /* renamed from: a, reason: collision with root package name */
    public static final C8193a f63483a = new C8193a();

    /* renamed from: c, reason: collision with root package name */
    private static float f63485c = 1.0f;

    static {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-65281);
        f63486d = paint;
    }

    private C8193a() {
    }

    public final void a(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        if (f63484b) {
            f63486d.setStrokeWidth(context.g(f63485c));
            context.d().drawRect(f10, f11, f12, f13, f63486d);
        }
    }
}
