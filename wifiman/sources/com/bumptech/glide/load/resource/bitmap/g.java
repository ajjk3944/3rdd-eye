package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class g implements E2.c, E2.b {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f34531a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.d f34532b;

    public g(Bitmap bitmap, F2.d dVar) {
        this.f34531a = (Bitmap) W2.k.e(bitmap, "Bitmap must not be null");
        this.f34532b = (F2.d) W2.k.e(dVar, "BitmapPool must not be null");
    }

    public static g f(Bitmap bitmap, F2.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, dVar);
    }

    @Override // E2.c
    public int a() {
        return W2.l.h(this.f34531a);
    }

    @Override // E2.b
    public void b() {
        this.f34531a.prepareToDraw();
    }

    @Override // E2.c
    public void c() {
        this.f34532b.c(this.f34531a);
    }

    @Override // E2.c
    public Class d() {
        return Bitmap.class;
    }

    @Override // E2.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f34531a;
    }
}
