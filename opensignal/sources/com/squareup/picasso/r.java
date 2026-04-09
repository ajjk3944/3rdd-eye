package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class r extends b {

    /* renamed from: i, reason: collision with root package name */
    public g f5975i;

    @Override // com.squareup.picasso.b
    public final void a() {
        this.f5876h = true;
        if (this.f5975i != null) {
            this.f5975i = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.b
    public final void b(Bitmap bitmap, c0 c0Var) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        ImageView imageView = (ImageView) this.f5871c.get();
        if (imageView == null) {
            return;
        }
        Context context = this.f5869a.f5890c;
        int i10 = g0.f5897e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new g0(context, bitmap, drawable, c0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.b
    public final void c() {
        g gVar;
        if (((ImageView) this.f5871c.get()) == null || (gVar = this.f5975i) == null) {
            return;
        }
        gVar.j();
    }
}
