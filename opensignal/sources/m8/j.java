package m8;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16327a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f16328d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f16329g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ wt.g f16330r;

    public j(f fVar, ViewTreeObserver viewTreeObserver, wt.g gVar) {
        this.f16328d = fVar;
        this.f16329g = viewTreeObserver;
        this.f16330r = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f16328d;
        h hVarC = fVar.c();
        if (hVarC != null) {
            ViewTreeObserver viewTreeObserver = this.f16329g;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f16323a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f16327a) {
                this.f16327a = true;
                this.f16330r.g(hVarC);
            }
        }
        return true;
    }
}
