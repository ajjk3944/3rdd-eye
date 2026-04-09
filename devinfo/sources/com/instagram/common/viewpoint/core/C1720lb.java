package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1720lb implements InterfaceC0600Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C1720lb A02 = new C1720lb();
    public final List<C1946pT> A00;

    public C1720lb() {
        this.A00 = Collections.emptyList();
    }

    public C1720lb(C1946pT c1946pT) {
        this.A00 = Collections.singletonList(c1946pT);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final List<C1946pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final long A83(int i4) {
        AbstractC02203y.A07(i4 == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0600Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
