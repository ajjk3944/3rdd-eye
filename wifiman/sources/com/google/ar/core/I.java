package com.google.ar.core;

import android.view.View;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* loaded from: classes3.dex */
final class I implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InstallActivity f38182a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f38183b;

    I(InstallActivity installActivity, int i10) {
        this.f38183b = i10;
        this.f38182a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f38183b != 0) {
            this.f38182a.c(new UnavailableUserDeclinedInstallationException());
        } else {
            this.f38182a.b();
            this.f38182a.d();
        }
    }
}
