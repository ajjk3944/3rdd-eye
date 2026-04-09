package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class K8 implements Comparable<K8> {
    public final int A00;
    public final C2659Jz A01;

    public K8(int i, C2659Jz c2659Jz) {
        this.A00 = i;
        this.A01 = c2659Jz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(K8 k82) {
        return Integer.compare(this.A00, k82.A00);
    }
}
