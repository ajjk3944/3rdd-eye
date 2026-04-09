package Y;

import android.view.View;

/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4202a;

    public /* synthetic */ e(int i) {
        this.f4202a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws SecurityException, IllegalArgumentException {
        switch (this.f4202a) {
            case 0:
                h.d(view).f4209b.run();
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f4202a;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
