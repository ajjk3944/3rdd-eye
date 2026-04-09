package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2227nt implements DT {
    public static String[] A03 = {"SXf2ikyU7x67I20o8i24dVpGUFSBqQTw", "mkUiuiIj8yhWc2", "ZVpzrzkkS3TCIC8ssuB1q665Cly", "AyVvw5Y1t2x", "iglXNLTRJoy", "iTKB7JlXxZgW", "zcduVvETVwMCfQslxyZfhoZ", "8SZ4gfyzqyWZuyWUMuDO3PJ5JnvEF7yK"};
    public boolean A00;
    public final DT A01;
    public final /* synthetic */ C9v A02;

    public C2227nt(C9v c9v, DT dt) {
        this.A02 = c9v;
        this.A01 = dt;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final boolean AAe() {
        if (!this.A02.A03()) {
            boolean zAAe = this.A01.AAe();
            String[] strArr = A03;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "tfusTrbeCFgw";
            strArr2[6] = "N1qkw3c8e5Hqf14VA9IMw1Y";
            if (zAAe) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final void ACR() throws IOException {
        this.A01.ACR();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // com.instagram.common.viewpoint.core.DT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AHP(com.instagram.common.viewpoint.core.C06776z r13, com.instagram.common.viewpoint.core.C2295p0 r14, int r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2227nt.AHP(com.facebook.ads.redexgen.X.6z, com.facebook.ads.redexgen.X.p0, int):int");
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AK2(long j10) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AK2(j10);
    }
}
