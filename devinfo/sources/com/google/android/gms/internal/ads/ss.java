package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ss implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16528a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16529b;

    public /* synthetic */ ss(vc0 vc0Var) {
        this.f16529b = vc0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16528a) {
            case 0:
                ((ts) this.f16529b).C(true);
                break;
            default:
                ((vc0) this.f16529b).j.f35223b = true;
                break;
        }
    }

    public ss(ts tsVar) {
        Objects.requireNonNull(tsVar);
        this.f16529b = tsVar;
    }
}
