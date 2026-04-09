package M6;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q1.f f4239b;

    public f(Q1.f fVar) {
        this.f4239b = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        this.f4239b.b();
    }
}
