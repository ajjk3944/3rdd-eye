package M6;

import K6.C0768z;
import L0.ViewTreeObserverOnPreDrawListenerC0791w;
import N7.G7;
import N7.J7;
import android.view.View;

/* compiled from: DivPagerBinder.kt */
/* loaded from: classes.dex */
public final class h implements j6.d, View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public int f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q1.f f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0768z f4243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G7 f4244e;

    public h(Q1.f fVar, C0768z c0768z, G7 g72) {
        this.f4242c = fVar;
        this.f4243d = c0768z;
        this.f4244e = g72;
        fVar.addOnLayoutChangeListener(this);
        ViewTreeObserverOnPreDrawListenerC0791w.a(fVar, new H0.a(fVar, this, c0768z));
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f4242c.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v10, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        kotlin.jvm.internal.l.f(v10, "v");
        Q1.f fVar = this.f4242c;
        int width = fVar.getOrientation() == 0 ? fVar.getWidth() : fVar.getHeight();
        if (this.f4241b != width) {
            this.f4241b = width;
            this.f4243d.invoke(Integer.valueOf(width));
        } else if (this.f4244e.f5365u instanceof J7.b) {
            fVar.b();
        }
    }
}
