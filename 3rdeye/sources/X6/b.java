package X6;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: AdaptiveMaxLines.kt */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13579b;

    public b(a aVar) {
        this.f13579b = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        a aVar = this.f13579b;
        if (aVar.f13574c != null) {
            return;
        }
        c cVar = new c(aVar);
        ViewTreeObserver viewTreeObserver = aVar.f13572a.getViewTreeObserver();
        kotlin.jvm.internal.l.e(viewTreeObserver, "textView.viewTreeObserver");
        viewTreeObserver.addOnPreDrawListener(cVar);
        aVar.f13574c = cVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f13579b.a();
    }
}
