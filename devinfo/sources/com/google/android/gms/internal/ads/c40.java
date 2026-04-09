package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c40 extends z10 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c40.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final j00 h(j00 j00Var) throws f10 {
        int i4 = j00Var.f12560c;
        if (i4 != 3) {
            if (i4 == 2) {
                return j00.f12557e;
            }
            if (i4 != 268435456 && i4 != 21 && i4 != 1342177280 && i4 != 22 && i4 != 1610612736 && i4 != 4) {
                throw new f10("Unhandled input format:", j00Var);
            }
        }
        return new j00(j00Var.f12558a, j00Var.f12559b, 2);
    }
}
