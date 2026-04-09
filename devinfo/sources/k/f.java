package k;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27770a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f27771b;

    public /* synthetic */ f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f27770a) {
            case 0:
                break;
            default:
                ((k6.e) this.f27771b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f27770a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f27771b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            default:
                ((k6.e) this.f27771b).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f27770a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f27771b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                ((k6.e) this.f27771b).unscheduleSelf(runnable);
                break;
        }
    }

    public f(k6.e eVar) {
        this.f27771b = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
