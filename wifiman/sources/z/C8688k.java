package z;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import f0.c;
import sh.AbstractC7978m;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8688k implements InterfaceC8687j {

    /* renamed from: a, reason: collision with root package name */
    public static final C8688k f66923a = new C8688k();

    private C8688k() {
    }

    @Override // z.InterfaceC8687j
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            return eVar.b0(new LayoutWeightElement(AbstractC7978m.f(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // z.InterfaceC8687j
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, c.b bVar) {
        return eVar.b0(new HorizontalAlignElement(bVar));
    }
}
