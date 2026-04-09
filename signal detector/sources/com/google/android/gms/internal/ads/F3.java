package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    public List f8064a = Collections.EMPTY_LIST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public List a(J4 j42) {
        String str;
        int i;
        List listSingletonList;
        C2036vr c2036vr = new C2036vr((byte[]) j42.f9226d);
        ArrayList arrayList = this.f8064a;
        while (c2036vr.B() > 0) {
            int iK = c2036vr.K();
            int iK2 = c2036vr.f17355b + c2036vr.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = c2036vr.K() & 31;
                for (int i3 = 0; i3 < iK3; i3++) {
                    String strK = c2036vr.k(3, StandardCharsets.UTF_8);
                    int iK4 = c2036vr.K();
                    boolean z6 = (iK4 & 128) != 0;
                    if (z6) {
                        i = iK4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bK = (byte) c2036vr.K();
                    c2036vr.G(1);
                    if (z6) {
                        int i6 = bK & 64;
                        byte[] bArr = AbstractC1224gm.f14369a;
                        listSingletonList = Collections.singletonList(i6 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C1855sP c1855sP = new C1855sP();
                    c1855sP.e(str);
                    c1855sP.f16725d = strK;
                    c1855sP.f16719I = i;
                    c1855sP.f16735o = listSingletonList;
                    arrayList.add(new TP(c1855sP));
                }
            }
            c2036vr.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
