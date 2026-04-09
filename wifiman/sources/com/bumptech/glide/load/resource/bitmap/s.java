package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class s implements E2.c, E2.b {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f34579a;

    /* renamed from: b, reason: collision with root package name */
    private final E2.c f34580b;

    private s(Resources resources, E2.c cVar) {
        this.f34579a = (Resources) W2.k.d(resources);
        this.f34580b = (E2.c) W2.k.d(cVar);
    }

    public static E2.c f(Resources resources, E2.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new s(resources, cVar);
    }

    @Override // E2.c
    public int a() {
        return this.f34580b.a();
    }

    @Override // E2.b
    public void b() {
        E2.c cVar = this.f34580b;
        if (cVar instanceof E2.b) {
            ((E2.b) cVar).b();
        }
    }

    @Override // E2.c
    public void c() {
        this.f34580b.c();
    }

    @Override // E2.c
    public Class d() {
        return BitmapDrawable.class;
    }

    @Override // E2.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f34579a, (Bitmap) this.f34580b.get());
    }
}
