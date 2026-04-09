package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.List;

/* loaded from: classes.dex */
final class ga extends ha {

    /* renamed from: c, reason: collision with root package name */
    final transient int f35688c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f35689d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ha f35690e;

    ga(ha haVar, int i10, int i11) {
        this.f35690e = haVar;
        this.f35688c = i10;
        this.f35689d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        W9.a(i10, this.f35689d, "index");
        return this.f35690e.get(i10 + this.f35688c);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final int j() {
        return this.f35690e.m() + this.f35688c + this.f35689d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final int m() {
        return this.f35690e.m() + this.f35688c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ea
    final Object[] o() {
        return this.f35690e.o();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ha
    /* renamed from: s */
    public final ha subList(int i10, int i11) {
        W9.c(i10, i11, this.f35689d);
        int i12 = this.f35688c;
        return this.f35690e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35689d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.ha, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
