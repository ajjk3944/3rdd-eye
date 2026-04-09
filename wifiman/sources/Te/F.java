package Te;

import android.graphics.Canvas;
import kotlin.jvm.internal.AbstractC6492s;
import o6.C7093d;
import o6.InterfaceC7092c;
import u6.InterfaceC8137b;

/* loaded from: classes4.dex */
final class F extends C7093d {

    /* renamed from: l, reason: collision with root package name */
    private final float f21625l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC7092c shape, float f10, int i10) {
        super(shape, i10, null, null, 0.0f, 0, 60, null);
        AbstractC6492s.i(shape, "shape");
        this.f21625l = f10;
    }

    @Override // o6.C7093d, m6.AbstractC6775a
    public void b(InterfaceC8137b context, float f10, float f11, float f12, float f13) {
        AbstractC6492s.i(context, "context");
        Canvas canvasD = context.d();
        int iSave = canvasD.save();
        canvasD.rotate(this.f21625l, ((f12 - f10) / 2.0f) + f10, ((f13 - f11) / 2.0f) + f11);
        try {
            super.b(context, f10, f11, f12, f13);
        } finally {
            canvasD.restoreToCount(iSave);
        }
    }
}
