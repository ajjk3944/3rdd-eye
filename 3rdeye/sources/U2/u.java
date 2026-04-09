package U2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import t4.C5606d;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes.dex */
public final class u implements N2.u<BitmapDrawable>, N2.r {

    /* renamed from: b, reason: collision with root package name */
    public final Resources f12447b;

    /* renamed from: c, reason: collision with root package name */
    public final N2.u<Bitmap> f12448c;

    public u(Resources resources, N2.u<Bitmap> uVar) {
        C5606d.l(resources, "Argument must not be null");
        this.f12447b = resources;
        C5606d.l(uVar, "Argument must not be null");
        this.f12448c = uVar;
    }

    @Override // N2.u
    public final void a() {
        this.f12448c.a();
    }

    @Override // N2.u
    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // N2.u
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f12447b, this.f12448c.get());
    }

    @Override // N2.u
    public final int getSize() {
        return this.f12448c.getSize();
    }

    @Override // N2.r
    public final void initialize() {
        N2.u<Bitmap> uVar = this.f12448c;
        if (uVar instanceof N2.r) {
            ((N2.r) uVar).initialize();
        }
    }
}
