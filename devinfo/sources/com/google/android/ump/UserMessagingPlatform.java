package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.d;
import com.google.android.gms.internal.consent_sdk.d3;
import com.google.android.gms.internal.consent_sdk.e0;
import com.google.android.gms.internal.consent_sdk.e6;
import com.google.android.gms.internal.consent_sdk.g2;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.j;
import com.google.android.gms.internal.consent_sdk.j0;
import com.google.android.gms.internal.consent_sdk.k7;
import com.google.android.gms.internal.consent_sdk.l7;
import com.google.android.gms.internal.consent_sdk.p;
import com.google.android.gms.internal.consent_sdk.q;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import j$.util.Objects;
import java.util.Queue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class UserMessagingPlatform {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return (d3) ((h7) d.h(context).f19301h).a();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        d dVarH = d.h(activity);
        if (((d3) ((h7) dVarH.f19301h).a()).canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        ((Queue) ((e0) ((h7) dVarH.g).a()).f19330i.get()).add(Long.valueOf(System.currentTimeMillis()));
        q qVar = (q) ((h7) dVarH.f19299e).a();
        j0.a();
        p pVar = new p(activity, onConsentFormDismissedListener);
        Objects.requireNonNull(onConsentFormDismissedListener);
        qVar.a(pVar, new e6(2, onConsentFormDismissedListener), true);
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        d dVarH = d.h(context);
        ((Queue) ((e0) ((h7) dVarH.g).a()).g.get()).add(Long.valueOf(System.currentTimeMillis()));
        ((q) ((h7) dVarH.f19299e).a()).a(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        boolean z3;
        q qVar = (q) ((h7) d.h(activity).f19299e).a();
        qVar.getClass();
        j0.a();
        d3 d3Var = (d3) ((h7) d.h(activity).f19301h).a();
        if (d3Var == null) {
            final int i4 = 0;
            j0.f19383a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            onConsentFormDismissedListener.onConsentFormDismissed(new r1(1, "No consentInformation.").a());
                            break;
                        case 1:
                            onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "No valid response received yet.").a());
                            break;
                        case 2:
                            onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is not required.").a());
                            break;
                        default:
                            onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is being loading. Please try again later.").a());
                            break;
                    }
                }
            });
            return;
        }
        if (d3Var.isConsentFormAvailable() || d3Var.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            if (d3Var.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                final int i10 = 2;
                j0.f19383a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(1, "No consentInformation.").a());
                                break;
                            case 1:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "No valid response received yet.").a());
                                break;
                            case 2:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is not required.").a());
                                break;
                            default:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is being loading. Please try again later.").a());
                                break;
                        }
                    }
                });
                return;
            }
            ConsentForm consentForm = (ConsentForm) qVar.f19472d.get();
            if (consentForm == null) {
                final int i11 = 3;
                j0.f19383a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(1, "No consentInformation.").a());
                                break;
                            case 1:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "No valid response received yet.").a());
                                break;
                            case 2:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is not required.").a());
                                break;
                            default:
                                onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is being loading. Please try again later.").a());
                                break;
                        }
                    }
                });
                return;
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                qVar.f19470b.execute(new j(1, qVar));
                return;
            }
        }
        final int i12 = 1;
        j0.f19383a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        onConsentFormDismissedListener.onConsentFormDismissed(new r1(1, "No consentInformation.").a());
                        break;
                    case 1:
                        onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "No valid response received yet.").a());
                        break;
                    case 2:
                        onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is not required.").a());
                        break;
                    default:
                        onConsentFormDismissedListener.onConsentFormDismissed(new r1(3, "Privacy options form is being loading. Please try again later.").a());
                        break;
                }
            }
        });
        if (d3Var.b()) {
            synchronized (d3Var.f19312e) {
                z3 = d3Var.f19314h;
            }
            if (!z3) {
                d3Var.a(true);
                l7 l7Var = d3Var.f19309b;
                ConsentRequestParameters consentRequestParameters = d3Var.f19315i;
                g2 g2Var = new g2(d3Var);
                g2 g2Var2 = new g2(d3Var);
                l7Var.getClass();
                l7Var.f19415c.execute(new k7(l7Var, activity, consentRequestParameters, g2Var, g2Var2, 0));
                return;
            }
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + d3Var.b() + ", retryRequestIsInProgress=" + d3Var.c());
    }
}
