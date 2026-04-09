package E0;

import androidx.compose.ui.e;

/* renamed from: E0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2626d0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(InterfaceC2632j interfaceC2632j, int i10, int i11) {
        e.c cVarB2 = interfaceC2632j.h1().b2();
        if (cVarB2 == null || (cVarB2.a2() & i10) == 0) {
            return null;
        }
        while (cVarB2 != null) {
            int iF2 = cVarB2.f2();
            if ((iF2 & i11) != 0) {
                return null;
            }
            if ((iF2 & i10) != 0) {
                return cVarB2;
            }
            cVarB2 = cVarB2.b2();
        }
        return null;
    }
}
