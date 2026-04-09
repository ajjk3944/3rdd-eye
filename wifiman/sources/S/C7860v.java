package s;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: s.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7860v {

    /* renamed from: a, reason: collision with root package name */
    public static final C7860v f60781a = new C7860v();

    private C7860v() {
    }

    public final EdgeEffect a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? C7842c.f60734a.a(context, null) : new C7832E(context);
    }

    public final float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C7842c.f60734a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C7842c.f60734a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof C7832E) {
            ((C7832E) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
