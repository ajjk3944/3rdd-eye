package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4271a implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final C2.i f34523a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f34524b;

    public C4271a(Resources resources, C2.i iVar) {
        this.f34524b = (Resources) W2.k.d(resources);
        this.f34523a = (C2.i) W2.k.d(iVar);
    }

    @Override // C2.i
    public boolean a(Object obj, C2.g gVar) {
        return this.f34523a.a(obj, gVar);
    }

    @Override // C2.i
    public E2.c b(Object obj, int i10, int i11, C2.g gVar) {
        return s.f(this.f34524b, this.f34523a.b(obj, i10, i11, gVar));
    }
}
