package W2;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
public final class d extends c<Drawable> {
    @Override // N2.u
    public final Class<Drawable> c() {
        return this.f13335b.getClass();
    }

    @Override // N2.u
    public final int getSize() {
        T t10 = this.f13335b;
        return Math.max(1, t10.getIntrinsicHeight() * t10.getIntrinsicWidth() * 4);
    }

    @Override // N2.u
    public final void a() {
    }
}
