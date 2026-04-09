package L3;

import android.view.View;

/* loaded from: classes.dex */
public final class h implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2586b;

    public h(i iVar, View view) {
        this.f2586b = iVar;
        this.f2585a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
        View view2 = this.f2585a;
        if (view2.getVisibility() == 0) {
            this.f2586b.c(view2);
        }
    }
}
