package id;

import a2.g;
import android.view.View;
import b4.f;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f11335a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11336d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f11337g;

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f11337g = swipeDismissBehavior;
        this.f11335a = view;
        this.f11336d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        SwipeDismissBehavior swipeDismissBehavior = this.f11337g;
        f fVar = swipeDismissBehavior.f5500a;
        View view = this.f11335a;
        if (fVar != null && fVar.f()) {
            view.postOnAnimation(this);
        } else {
            if (!this.f11336d || (gVar = swipeDismissBehavior.f5501b) == null) {
                return;
            }
            gVar.i(view);
        }
    }
}
