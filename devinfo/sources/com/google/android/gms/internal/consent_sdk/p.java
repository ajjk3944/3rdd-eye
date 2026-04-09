package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.os.Handler;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19457a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19458b;

    public /* synthetic */ p(Object obj, Object obj2) {
        this.f19457a = obj;
        this.f19458b = obj2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u a() {
        v vVar = (v) ((h7) this.f19457a).a();
        Handler handler = j0.f19383a;
        l0.c(handler);
        return new u(vVar, handler, ((va.o) this.f19458b).a());
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        consentForm.show((Activity) this.f19457a, (ConsentForm.OnConsentFormDismissedListener) this.f19458b);
    }
}
