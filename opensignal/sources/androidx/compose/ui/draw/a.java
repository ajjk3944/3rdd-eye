package androidx.compose.ui.draw;

import z0.b;
import z0.e;
import z0.m;

/* loaded from: classes.dex */
public abstract class a {
    public static m a(m mVar, l1.a aVar, float f10, g1.m mVar2, int i10) {
        e eVar = b.f26484x;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        return mVar.c(new PainterElement(aVar, eVar, f10, mVar2));
    }
}
