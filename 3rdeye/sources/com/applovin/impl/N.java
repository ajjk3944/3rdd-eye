package com.applovin.impl;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class N implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18834c;

    public /* synthetic */ N(Object obj, int i) {
        this.f18833b = i;
        this.f18834c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f18833b) {
            case 0:
                ((AbstractActivityC2127k) this.f18834c).a(dialogInterface);
                break;
            default:
                com.vungle.ads.internal.presenter.h.m97showGdpr$lambda9((com.vungle.ads.internal.presenter.h) this.f18834c, dialogInterface);
                break;
        }
    }
}
