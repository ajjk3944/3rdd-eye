package M6;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O6.t f4236b;

    public d(O6.t tVar) {
        this.f4236b = tVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        this.f4236b.getViewPager().b();
    }
}
