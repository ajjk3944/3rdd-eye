package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dm1 {
    public List a = Collections.EMPTY_LIST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public List a(so1 so1Var) {
        String str;
        int i;
        List listSingletonList;
        kz2 kz2Var = new kz2((byte[]) so1Var.h);
        ArrayList arrayList = this.a;
        while (kz2Var.B() > 0) {
            int iK = kz2Var.K();
            int iK2 = kz2Var.b + kz2Var.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = kz2Var.K() & 31;
                for (int i2 = 0; i2 < iK3; i2++) {
                    String strK = kz2Var.k(3, StandardCharsets.UTF_8);
                    int iK4 = kz2Var.K();
                    boolean z = (iK4 & 128) != 0;
                    if (z) {
                        i = iK4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bK = (byte) kz2Var.K();
                    kz2Var.G(1);
                    if (z) {
                        int i3 = bK & 64;
                        byte[] bArr = mo2.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    gg4 gg4Var = new gg4();
                    gg4Var.e(str);
                    gg4Var.d = strK;
                    gg4Var.I = i;
                    gg4Var.o = listSingletonList;
                    arrayList.add(new ph4(gg4Var));
                }
            }
            kz2Var.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
