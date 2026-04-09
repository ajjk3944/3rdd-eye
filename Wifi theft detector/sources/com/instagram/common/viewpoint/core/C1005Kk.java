package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1005Kk implements Comparable<C1005Kk> {
    public final int A00;
    public final C0996Kb A01;

    public C1005Kk(int i10, C0996Kb c0996Kb) {
        this.A00 = i10;
        this.A01 = c0996Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1005Kk c1005Kk) {
        return Integer.compare(this.A00, c1005Kk.A00);
    }
}
