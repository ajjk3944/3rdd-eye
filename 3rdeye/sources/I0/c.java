package I0;

import C.RunnableC0615b;
import I0.b;
import android.view.View;

/* compiled from: SplashScreen.kt */
/* loaded from: classes.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f2399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2400c;

    public c(b.a aVar, k kVar) {
        this.f2399b = aVar;
        this.f2400c = kVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        kotlin.jvm.internal.l.f(view, "view");
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            b.a aVar = this.f2399b;
            boolean zF = aVar.f2388f.f();
            k kVar = this.f2400c;
            if (zF) {
                aVar.f2390h = kVar;
                return;
            }
            B.d dVar = aVar.f2389g;
            if (dVar == null) {
                return;
            }
            aVar.f2389g = null;
            kVar.f2403a.c().postOnAnimation(new RunnableC0615b(3, kVar, dVar));
        }
    }
}
