package jd;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f27515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f27516b;

    public j(k kVar, View view) {
        this.f27516b = kVar;
        this.f27515a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        View view2 = this.f27515a;
        if (view2.getVisibility() == 0) {
            this.f27516b.c(view2);
        }
    }
}
