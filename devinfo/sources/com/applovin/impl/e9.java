package com.applovin.impl;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4087b;

    public /* synthetic */ e9(int i4, Object obj) {
        this.f4086a = i4;
        this.f4087b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4086a) {
            case 0:
                ((e1) this.f4087b).a(view);
                break;
            case 1:
                ((o1) this.f4087b).a(view);
                break;
            default:
                ((w1) this.f4087b).a(view);
                break;
        }
    }
}
