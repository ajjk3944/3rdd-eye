package o2;

import android.text.TextPaint;
import g1.f0;
import g1.h0;
import g1.p;
import h2.m;
import java.util.ArrayList;
import r2.l;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final a5.d f18757a = new a5.d(2, false);

    public static final void a(m mVar, p pVar, f0 f0Var, float f10, h0 h0Var, l lVar, i1.c cVar) {
        ArrayList arrayList = mVar.f9854h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h2.p pVar2 = (h2.p) arrayList.get(i10);
            pVar2.f9859a.f(pVar, f0Var, f10, h0Var, lVar, cVar);
            pVar.m(0.0f, pVar2.f9859a.b());
        }
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
