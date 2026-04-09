package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4723t1 extends AbstractC4734u1 {

    /* renamed from: a, reason: collision with root package name */
    private int f35725a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f35726b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B1 f35727c;

    C4723t1(B1 b12) {
        this.f35727c = b12;
        this.f35726b = b12.m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35725a < this.f35726b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4756w1
    public final byte zza() {
        int i10 = this.f35725a;
        if (i10 >= this.f35726b) {
            throw new NoSuchElementException();
        }
        this.f35725a = i10 + 1;
        return this.f35727c.j(i10);
    }
}
