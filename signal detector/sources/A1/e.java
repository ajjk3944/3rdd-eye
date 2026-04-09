package A1;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f103b;

    public e(f fVar, View view) {
        this.f103b = fVar;
        this.f102a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        H1.p.f().post(new d(this, 0, this));
    }
}
