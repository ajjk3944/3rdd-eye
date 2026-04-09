package I6;

import android.view.View;
import android.widget.ImageView;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class s implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f2590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2591c;

    public s(View view, ImageView imageView) {
        this.f2590b = imageView;
        this.f2591c = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2590b.removeOnAttachStateChangeListener(this);
        v.b(this.f2591c, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
