package l8;

import android.view.View;
import wt.z;

/* loaded from: classes.dex */
public final class t implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f14977a;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.ui.a f14978d;

    /* renamed from: g, reason: collision with root package name */
    public z f14979g;

    /* renamed from: r, reason: collision with root package name */
    public s f14980r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14981x;

    public t(View view) {
        this.f14977a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        s sVar = this.f14980r;
        if (sVar == null) {
            return;
        }
        this.f14981x = true;
        sVar.f14972a.b(sVar.f14973d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        s sVar = this.f14980r;
        if (sVar != null) {
            androidx.lifecycle.o oVar = sVar.f14975r;
            sVar.f14976x.h(null);
            n8.a aVar = sVar.f14974g;
            if (aVar != null) {
                oVar.m1(aVar);
            }
            oVar.m1(sVar);
        }
    }
}
