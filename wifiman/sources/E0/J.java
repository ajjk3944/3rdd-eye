package E0;

import androidx.compose.ui.e;

/* loaded from: classes.dex */
public abstract class J {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(InterfaceC2632j interfaceC2632j) {
        int iA = e0.a(4);
        int iA2 = e0.a(2);
        e.c cVarB2 = interfaceC2632j.h1().b2();
        if (cVarB2 == null || (cVarB2.a2() & iA) == 0) {
            return null;
        }
        while (cVarB2 != null && (cVarB2.f2() & iA2) == 0) {
            if ((cVarB2.f2() & iA) != 0) {
                return cVarB2;
            }
            cVarB2 = cVarB2.b2();
        }
        return null;
    }
}
