package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class X extends F {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f34792a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y f34793b;

    X(Y y10, Dialog dialog) {
        this.f34793b = y10;
        this.f34792a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.F
    public final void a() {
        this.f34793b.f34795b.d();
        if (this.f34792a.isShowing()) {
            this.f34792a.dismiss();
        }
    }
}
