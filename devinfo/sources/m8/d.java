package m8;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f28955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f28956b;

    public d(e eVar, View view) {
        this.f28956b = eVar;
        this.f28955a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        t8.m.f().post(new fb.r(this, false, this, 4));
    }
}
