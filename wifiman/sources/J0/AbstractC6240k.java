package j0;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import m0.AbstractC6673I0;
import m0.c1;
import m0.i1;

/* renamed from: j0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6240k {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, i1 i1Var, boolean z10, long j10, long j11) {
        return (Y0.h.h(f10, Y0.h.j((float) 0)) > 0 || z10) ? eVar.b0(new ShadowGraphicsLayerElement(f10, i1Var, z10, j10, j11, null)) : eVar;
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, i1 i1Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        i1 i1VarA = (i10 & 2) != 0 ? c1.a() : i1Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (Y0.h.h(f10, Y0.h.j(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(eVar, f10, i1VarA, z11, (i10 & 8) != 0 ? AbstractC6673I0.a() : j10, (i10 & 16) != 0 ? AbstractC6673I0.a() : j11);
    }
}
