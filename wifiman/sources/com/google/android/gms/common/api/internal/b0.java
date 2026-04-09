package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC4278g f34806a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f34807b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f34808c;

    b0(c0 c0Var, AbstractC4278g abstractC4278g, String str) {
        this.f34806a = abstractC4278g;
        this.f34807b = str;
        this.f34808c = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        c0 c0Var = this.f34808c;
        if (c0Var.f34815b > 0) {
            AbstractC4278g abstractC4278g = this.f34806a;
            if (c0Var.f34816c != null) {
                bundle = c0Var.f34816c.getBundle(this.f34807b);
            } else {
                bundle = null;
            }
            abstractC4278g.onCreate(bundle);
        }
        if (this.f34808c.f34815b >= 2) {
            this.f34806a.onStart();
        }
        if (this.f34808c.f34815b >= 3) {
            this.f34806a.onResume();
        }
        if (this.f34808c.f34815b >= 4) {
            this.f34806a.onStop();
        }
        if (this.f34808c.f34815b >= 5) {
            this.f34806a.onDestroy();
        }
    }
}
