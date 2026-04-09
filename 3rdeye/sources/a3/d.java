package a3;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: FirstFrameWaiter.java */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f14112c;

    /* compiled from: FirstFrameWaiter.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f14113b;

        public a(d dVar) {
            this.f14113b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            U2.r rVarA = U2.r.a();
            rVarA.getClass();
            h3.l.a();
            rVarA.f12436d.set(true);
            d.this.f14112c.f14116c = true;
            View view = d.this.f14111b;
            view.getViewTreeObserver().removeOnDrawListener(this.f14113b);
            d.this.f14112c.f14115b.clear();
        }
    }

    public d(e eVar, View view) {
        this.f14112c = eVar;
        this.f14111b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        h3.l.f().post(new a(this));
    }
}
