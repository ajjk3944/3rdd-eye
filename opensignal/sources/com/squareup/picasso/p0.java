package com.squareup.picasso;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class p0 extends b {
    @Override // com.squareup.picasso.b
    public final void b(Bitmap bitmap, c0 c0Var) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        uk.a aVar = (uk.a) d();
        if (aVar != null) {
            aVar.a(bitmap);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.b
    public final void c() {
        uk.a aVar = (uk.a) d();
        if (aVar != null) {
            uk.b bVar = aVar.f23574b;
            if (bVar.f23577b >= 2) {
                return;
            }
            f0.f(bVar.f23576a).d(aVar.f23573a).d(aVar);
            bVar.f23577b++;
        }
    }
}
