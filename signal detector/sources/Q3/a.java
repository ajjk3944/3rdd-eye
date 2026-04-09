package Q3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;
import u3.InterfaceC2955a;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2955a f3181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f3182d;

    public a(ExpandableBehavior expandableBehavior, View view, int i, InterfaceC2955a interfaceC2955a) {
        this.f3182d = expandableBehavior;
        this.f3179a = view;
        this.f3180b = i;
        this.f3181c = interfaceC2955a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f3179a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f3182d;
        if (expandableBehavior.f18608a == this.f3180b) {
            Object obj = this.f3181c;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).f18348C.f22475a, false);
        }
        return false;
    }
}
