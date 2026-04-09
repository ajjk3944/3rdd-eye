package B;

import B.InterfaceC2440d;

/* renamed from: B.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2441e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(V.b bVar, int i10) {
        int iO = bVar.o() - 1;
        int i11 = 0;
        while (i11 < iO) {
            int i12 = ((iO - i11) / 2) + i11;
            int iB = ((InterfaceC2440d.a) bVar.m()[i12]).b();
            if (iB == i10) {
                return i12;
            }
            if (iB < i10) {
                i11 = i12 + 1;
                if (i10 < ((InterfaceC2440d.a) bVar.m()[i11]).b()) {
                    return i12;
                }
            } else {
                iO = i12 - 1;
            }
        }
        return i11;
    }
}
