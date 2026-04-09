package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f19543a;

    /* renamed from: b, reason: collision with root package name */
    public final h f19544b;

    public v4(Application application, h hVar) {
        this.f19543a = application;
        this.f19544b = hVar;
    }

    public final a0 a(Activity activity, ConsentRequestParameters consentRequestParameters) {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.f19543a).build();
        }
        return k5.a(new k5(this, activity, consentDebugSettings, consentRequestParameters));
    }
}
