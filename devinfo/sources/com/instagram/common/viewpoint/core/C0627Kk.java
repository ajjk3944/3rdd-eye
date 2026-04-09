package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0627Kk implements Comparable<C0627Kk> {
    public final int A00;
    public final C0618Kb A01;

    public C0627Kk(int i4, C0618Kb c0618Kb) {
        this.A00 = i4;
        this.A01 = c0618Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0627Kk c0627Kk) {
        return Integer.compare(this.A00, c0627Kk.A00);
    }
}
