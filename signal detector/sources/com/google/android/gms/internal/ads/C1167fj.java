package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167fj extends AbstractC1166fi {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0812Xh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1167fj.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1166fi
    public final C1703ph k(C1703ph c1703ph) throws C0625Mh {
        int i = c1703ph.f16199c;
        if (i != 3) {
            if (i == 2) {
                return C1703ph.f16196e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new C0625Mh("Unhandled input format:", c1703ph);
            }
        }
        return new C1703ph(c1703ph.f16197a, c1703ph.f16198b, 2);
    }
}
