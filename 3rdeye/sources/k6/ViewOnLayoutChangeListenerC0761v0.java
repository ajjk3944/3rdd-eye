package K6;

import android.view.View;

/* compiled from: View.kt */
/* renamed from: K6.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0761v0 implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H6.I f3653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.d f3654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O6.p f3655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q6.c f3657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IllegalArgumentException f3658g;

    public ViewOnLayoutChangeListenerC0761v0(H6.I i, G6.d dVar, O6.p pVar, boolean z10, Q6.c cVar, IllegalArgumentException illegalArgumentException) {
        this.f3653b = i;
        this.f3654c = dVar;
        this.f3655d = pVar;
        this.f3656e = z10;
        this.f3657f = cVar;
        this.f3658g = illegalArgumentException;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        int iF = this.f3653b.f(this.f3654c.f1937c);
        IllegalArgumentException illegalArgumentException = this.f3658g;
        Q6.c cVar = this.f3657f;
        if (iF == -1) {
            cVar.a(illegalArgumentException);
            return;
        }
        O6.p pVar = this.f3655d;
        View viewFindViewById = pVar.getRootView().findViewById(iF);
        if (viewFindViewById != null) {
            viewFindViewById.setLabelFor(this.f3656e ? -1 : pVar.getId());
        } else {
            cVar.a(illegalArgumentException);
        }
    }
}
