package M0;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2627a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f2628b;

    public /* synthetic */ c() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f2627a) {
            case 0:
                ((f) this.f2628b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        switch (this.f2627a) {
            case 0:
                ((f) this.f2628b).scheduleSelf(runnable, j6);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f2628b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j6);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2627a) {
            case 0:
                ((f) this.f2628b).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f2628b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public c(f fVar) {
        this.f2628b = fVar;
    }

    private final void a(Drawable drawable) {
    }
}
