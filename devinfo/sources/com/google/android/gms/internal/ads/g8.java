package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public List f11399a = Collections.EMPTY_LIST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public List a(oa oaVar) {
        String str;
        int i4;
        List listSingletonList;
        sk0 sk0Var = new sk0((byte[]) oaVar.f14619d);
        ArrayList arrayList = this.f11399a;
        while (sk0Var.B() > 0) {
            int iK = sk0Var.K();
            int iK2 = sk0Var.f16447b + sk0Var.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = sk0Var.K() & 31;
                for (int i10 = 0; i10 < iK3; i10++) {
                    String strK = sk0Var.k(3, StandardCharsets.UTF_8);
                    int iK4 = sk0Var.K();
                    boolean z3 = (iK4 & 128) != 0;
                    if (z3) {
                        i4 = iK4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i4 = 1;
                    }
                    byte bK = (byte) sk0Var.K();
                    sk0Var.G(1);
                    if (z3) {
                        int i11 = bK & 64;
                        byte[] bArr = ba0.f9638a;
                        listSingletonList = Collections.singletonList(i11 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    lw1 lw1Var = new lw1();
                    lw1Var.e(str);
                    lw1Var.f13655d = strK;
                    lw1Var.I = i4;
                    lw1Var.f13664o = listSingletonList;
                    arrayList.add(new mx1(lw1Var));
                }
            }
            sk0Var.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
