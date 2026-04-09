package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class y implements C2.i {

    private static final class a implements E2.c {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f34599a;

        a(Bitmap bitmap) {
            this.f34599a = bitmap;
        }

        @Override // E2.c
        public int a() {
            return W2.l.h(this.f34599a);
        }

        @Override // E2.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f34599a;
        }

        @Override // E2.c
        public void c() {
        }

        @Override // E2.c
        public Class d() {
            return Bitmap.class;
        }
    }

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(Bitmap bitmap, int i10, int i11, C2.g gVar) {
        return new a(bitmap);
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, C2.g gVar) {
        return true;
    }
}
