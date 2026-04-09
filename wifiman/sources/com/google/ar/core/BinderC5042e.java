package com.google.ar.core;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class BinderC5042e extends com.google.ar.core.dependencies.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f38238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f38239b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ RunnableC5044g f38240c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f38241d;

    BinderC5042e(RunnableC5044g runnableC5044g, AtomicBoolean atomicBoolean, L l10, Activity activity) {
        this.f38238a = atomicBoolean;
        this.f38241d = l10;
        this.f38239b = activity;
        this.f38240c = runnableC5044g;
    }

    @Override // com.google.ar.core.dependencies.j
    public final void b(Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f38238a.getAndSet(true)) {
        }
        int i10 = bundle.getInt("error.code", -100);
        int i11 = bundle.getInt("install.status", 0);
        if (i11 == 4) {
            this.f38241d.a(M.COMPLETED);
            return;
        }
        if (i10 != 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
            sb2.append("requestInstall = ");
            sb2.append(i10);
            sb2.append(", launching fullscreen.");
            Log.w("ARCore-InstallService", sb2.toString());
            RunnableC5044g runnableC5044g = this.f38240c;
            runnableC5044g.f38248c.i(this.f38239b, this.f38241d);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            RunnableC5044g runnableC5044g2 = this.f38240c;
            runnableC5044g2.f38248c.j(this.f38239b, bundle, this.f38241d);
            return;
        }
        if (i11 == 10) {
            this.f38241d.b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            return;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                this.f38241d.a(M.ACCEPTED);
                break;
            case 4:
                this.f38241d.a(M.COMPLETED);
                break;
            case 5:
                this.f38241d.b(new FatalException("Unexpected FAILED install status without error."));
                break;
            case 6:
                this.f38241d.a(M.CANCELLED);
                break;
            default:
                this.f38241d.b(new FatalException(F.b((byte) 27, i11, "Unexpected install status: ")));
                break;
        }
    }

    @Override // com.google.ar.core.dependencies.j
    public final void c(Bundle bundle) {
    }
}
