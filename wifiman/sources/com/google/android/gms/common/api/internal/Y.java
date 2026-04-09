package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import r3.C7564b;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final W f34794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z f34795b;

    Y(Z z10, W w10) {
        this.f34795b = z10;
        this.f34794a = w10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f34795b.f34796a) {
            C7564b c7564bB = this.f34794a.b();
            if (c7564bB.g()) {
                Z z10 = this.f34795b;
                z10.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(z10.getActivity(), (PendingIntent) AbstractC7901p.l(c7564bB.f()), this.f34794a.a(), false), 1);
                return;
            }
            Z z11 = this.f34795b;
            if (z11.f34799d.b(z11.getActivity(), c7564bB.b(), null) != null) {
                Z z12 = this.f34795b;
                z12.f34799d.w(z12.getActivity(), z12.mLifecycleFragment, c7564bB.b(), 2, this.f34795b);
                return;
            }
            if (c7564bB.b() != 18) {
                this.f34795b.a(c7564bB, this.f34794a.a());
                return;
            }
            Z z13 = this.f34795b;
            Dialog dialogR = z13.f34799d.r(z13.getActivity(), z13);
            Z z14 = this.f34795b;
            z14.f34799d.s(z14.getActivity().getApplicationContext(), new X(this, dialogR));
        }
    }
}
