package com.facebook.ads.redexgen.core;

import java.util.concurrent.Callable;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public class XZ implements Callable<Void> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int[] A06;

    public XZ(int[] iArr, int i, int i10, int i11, int i12, int i13, int i14) {
        this.A06 = iArr;
        this.A05 = i;
        this.A01 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = i13;
        this.A03 = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    @Nullable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        C2777Oq.A00(this.A06, this.A05, this.A01, this.A02, this.A04, this.A00, this.A03);
        return null;
    }
}
