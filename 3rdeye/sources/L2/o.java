package l2;

import n2.C5348b;
import v2.C5673a;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class o extends AbstractC5274g<C5348b> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l2.AbstractC5268a
    public final Object g(C5673a c5673a, float f10) {
        T t10;
        B0.f fVar = this.f43690e;
        Object obj = c5673a.f47012b;
        if (fVar == null) {
            return (f10 != 1.0f || (t10 = c5673a.f47013c) == 0) ? (C5348b) obj : (C5348b) t10;
        }
        Float f11 = c5673a.f47018h;
        float fFloatValue = f11 == null ? Float.MAX_VALUE : f11.floatValue();
        C5348b c5348b = (C5348b) obj;
        Object obj2 = c5673a.f47013c;
        return (C5348b) fVar.e(c5673a.f47017g, fFloatValue, c5348b, obj2 == null ? c5348b : (C5348b) obj2, f10, d(), this.f43689d);
    }
}
