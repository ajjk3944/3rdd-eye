package od;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f30519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc.a f30521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f30522d;

    public a(ExpandableBehavior expandableBehavior, View view, int i4, xc.a aVar) {
        this.f30522d = expandableBehavior;
        this.f30519a = view;
        this.f30520b = i4;
        this.f30521c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f30519a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f30522d;
        if (expandableBehavior.f20679a == this.f30520b) {
            Object obj = this.f30521c;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).f20527o.f30605a, false);
        }
        return false;
    }
}
