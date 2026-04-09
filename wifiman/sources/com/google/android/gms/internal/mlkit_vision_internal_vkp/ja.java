package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Objects;

/* loaded from: classes.dex */
final class ja extends ha {

    /* renamed from: e, reason: collision with root package name */
    static final ha f35696e = new ja(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f35697c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f35698d;

    ja(Object[] objArr, int i10) {
        this.f35697c = objArr;
        this.f35698d = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ha, com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final int g(Object[] objArr, int i10) {
        System.arraycopy(this.f35697c, 0, objArr, 0, this.f35698d);
        return this.f35698d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        W9.a(i10, this.f35698d, "index");
        Object obj = this.f35697c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final int j() {
        return this.f35698d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final int m() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final Object[] o() {
        return this.f35697c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35698d;
    }
}
