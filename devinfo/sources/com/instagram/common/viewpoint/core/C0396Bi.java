package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0396Bi<K, V> extends AbstractC1736lr<K, V> {
    public int A00;

    @ParametricNullness
    public final K A01;
    public final /* synthetic */ C1837nh A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1736lr, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        Map<K, V> mapA0h = this.A02.A0h();
        if (mapA0h != null) {
            return (V) AbstractC1993qF.A01(mapA0h.get(this.A01));
        }
        A00();
        return this.A00 == -1 ? (V) AbstractC1993qF.A00() : (V) this.A02.A0F(this.A00);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1736lr, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v10) {
        Map<K, V> mapA0h = this.A02.A0h();
        if (mapA0h != null) {
            return (V) AbstractC1993qF.A01(mapA0h.put(this.A01, v10));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, v10);
            return (V) AbstractC1993qF.A00();
        }
        V v11 = (V) this.A02.A0F(this.A00);
        this.A02.A0R(this.A00, v10);
        return v11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    public C0396Bi(C1837nh c1837nh, int i4) {
        this.A02 = c1837nh;
        this.A01 = (K) c1837nh.A0E(i4);
        this.A00 = i4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    private void A00() {
        if (this.A00 != -1 && this.A00 < this.A02.size() && CB.A01(this.A01, this.A02.A0E(this.A00))) {
            return;
        }
        this.A00 = this.A02.A07(this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    @Override // com.instagram.common.viewpoint.core.AbstractC1736lr, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A01;
    }
}
