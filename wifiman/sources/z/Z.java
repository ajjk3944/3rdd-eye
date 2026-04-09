package z;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import f0.c;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class Z implements Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f66823a = new Z();

    private Z() {
    }

    @Override // z.Y
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            return eVar.b0(new LayoutWeightElement(AbstractC7978m.f(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // z.Y
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, c.InterfaceC1752c interfaceC1752c) {
        return eVar.b0(new VerticalAlignElement(interfaceC1752c));
    }
}
