package M2;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class k extends j {
    private k(Drawable drawable) {
        super(drawable);
    }

    static E2.c f(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // E2.c
    public int a() {
        return Math.max(1, this.f12466a.getIntrinsicWidth() * this.f12466a.getIntrinsicHeight() * 4);
    }

    @Override // E2.c
    public void c() {
    }

    @Override // E2.c
    public Class d() {
        return this.f12466a.getClass();
    }
}
