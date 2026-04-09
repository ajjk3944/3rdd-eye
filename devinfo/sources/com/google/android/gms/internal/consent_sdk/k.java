package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.ump.ConsentForm;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f19386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f19387b;

    public k(m mVar, Activity activity) {
        Objects.requireNonNull(mVar);
        this.f19387b = mVar;
        this.f19386a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m mVar = this.f19387b;
        Dialog dialog = mVar.g;
        AtomicReference atomicReference = mVar.f19430l;
        if (dialog == null || !mVar.f19431m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        v vVar = mVar.f19422b;
        if (vVar != null) {
            vVar.f19541a = activity;
        }
        k kVar = (k) atomicReference.getAndSet(null);
        if (kVar != null) {
            kVar.f19387b.f19421a.unregisterActivityLifecycleCallbacks(kVar);
            k kVar2 = new k(mVar, activity);
            mVar.f19421a.registerActivityLifecycleCallbacks(kVar2);
            atomicReference.set(kVar2);
        }
        Dialog dialog2 = mVar.g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f19386a) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        m mVar = this.f19387b;
        if (zIsChangingConfigurations && mVar.f19431m && (dialog = mVar.g) != null) {
            dialog.dismiss();
            return;
        }
        r1 r1Var = new r1(3, "Activity is destroyed.");
        Dialog dialog2 = mVar.g;
        if (dialog2 != null) {
            dialog2.dismiss();
            mVar.g = null;
        }
        mVar.f19422b.f19541a = null;
        k kVar = (k) mVar.f19430l.getAndSet(null);
        if (kVar != null) {
            kVar.f19387b.f19421a.unregisterActivityLifecycleCallbacks(kVar);
        }
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) mVar.f19429k.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        mVar.c(r1Var);
        onConsentFormDismissedListener.onConsentFormDismissed(r1Var.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
