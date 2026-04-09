package com.google.android.gms.internal.ads;

import android.view.View;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rz implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uv f15792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i00 f15793b;

    public rz(i00 i00Var, uv uvVar) {
        this.f15792a = uvVar;
        this.f15793b = i00Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws IllegalStateException, JSONException, InterruptedException, za.j {
        this.f15793b.k(view, this.f15792a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
