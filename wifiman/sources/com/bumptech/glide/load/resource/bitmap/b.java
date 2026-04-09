package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* loaded from: classes.dex */
public class b implements C2.j {

    /* renamed from: a, reason: collision with root package name */
    private final F2.d f34525a;

    /* renamed from: b, reason: collision with root package name */
    private final C2.j f34526b;

    public b(F2.d dVar, C2.j jVar) {
        this.f34525a = dVar;
        this.f34526b = jVar;
    }

    @Override // C2.j
    public C2.c b(C2.g gVar) {
        return this.f34526b.b(gVar);
    }

    @Override // C2.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(E2.c cVar, File file, C2.g gVar) {
        return this.f34526b.a(new g(((BitmapDrawable) cVar.get()).getBitmap(), this.f34525a), file, gVar);
    }
}
