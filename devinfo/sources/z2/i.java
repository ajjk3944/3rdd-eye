package z2;

import android.text.TextPaint;
import s2.h0;
import s2.r;
import s2.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final j f37864a = new j(false);

    public static final boolean a(h0 h0Var) {
        r rVar;
        s sVar = h0Var.f33393c;
        s2.h hVar = (sVar == null || (rVar = sVar.f33423a) == null) ? null : new s2.h(rVar.f33422b);
        boolean z3 = false;
        if (hVar != null && hVar.f33389a == 1) {
            z3 = true;
        }
        return !z3;
    }

    public static final void b(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
