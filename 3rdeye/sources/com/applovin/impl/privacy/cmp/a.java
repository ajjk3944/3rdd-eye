package com.applovin.impl.privacy.cmp;

import C.f0;
import P7.u;
import android.app.Activity;
import android.os.Bundle;
import androidx.work.s;
import com.applovin.impl.C2120g0;
import com.applovin.impl.a7;
import com.applovin.impl.l4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import g0.C4356c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final k f20713a;

    /* renamed from: b, reason: collision with root package name */
    private final o f20714b;

    /* renamed from: c, reason: collision with root package name */
    private ConsentForm f20715c;

    /* renamed from: d, reason: collision with root package name */
    private int f20716d;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0315a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.f20713a = kVar;
        this.f20714b = kVar.O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.o());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.f20715c != null) {
            this.f20715c = null;
        }
        this.f20716d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.o()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0315a interfaceC0315a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0315a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.f20713a.c(l4.f20049v6).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f20713a.a(l4.f20041u6);
        return num.intValue() < 0 || this.f20716d < num.intValue();
    }

    public void a(Activity activity, C2120g0 c2120g0, InterfaceC0315a interfaceC0315a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (a7.c(this.f20713a) && c2120g0.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f20713a.n0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new F3.k(this, activity, interfaceC0315a), new b(this, interfaceC0315a));
    }

    public void b(Activity activity, C2120g0 c2120g0, InterfaceC0315a interfaceC0315a) {
        if (this.f20715c == null) {
            b("Failed to show - not ready yet");
            interfaceC0315a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f20715c.show(activity, new u(this, c2120g0, interfaceC0315a, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(FormError formError, C2120g0 c2120g0, InterfaceC0315a interfaceC0315a) {
        a("Retrying to load and show consent form...");
        this.f20716d++;
        UserMessagingPlatform.loadConsentForm(k.o(), new c(this, interfaceC0315a, formError, c2120g0), new V7.a(this, interfaceC0315a, formError, 3));
    }

    private void b(String str) {
        if (o.a()) {
            this.f20714b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, InterfaceC0315a interfaceC0315a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0315a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
        } else if (consentStatus != 2) {
            b(C4356c.h(consentStatus, "Failed to load with consent status: "));
            interfaceC0315a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, C4356c.h(consentStatus, "Consent form not required for consent status: ")));
        } else {
            a("Successfully requested consent info");
            a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new f0(6, this, interfaceC0315a), new b(this, interfaceC0315a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0315a interfaceC0315a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.f20715c = consentForm;
        interfaceC0315a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0315a interfaceC0315a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0315a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C2120g0 c2120g0, InterfaceC0315a interfaceC0315a, FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f20713a.E().a(y1.f21820t0, "googleConsentFormDismissed", map);
            if (c(strValueOf)) {
                a(s.d("Consent form was dismissed due to error: ", message));
                AppLovinSdkUtils.runOnUiThread(new D3.a(this, formError, c2120g0, interfaceC0315a, 4));
                return;
            } else {
                b(s.d("Failed to show with error: ", message));
                interfaceC0315a.onFlowShowFailed(a(formError, "Consent form show failed"));
                return;
            }
        }
        a("Consent form finished showing");
        interfaceC0315a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0315a interfaceC0315a, FormError formError, C2120g0 c2120g0, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.f20715c = consentForm;
        Activity activityU0 = this.f20713a.u0();
        if (activityU0 == null) {
            interfaceC0315a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(activityU0, c2120g0, interfaceC0315a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0315a interfaceC0315a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0315a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    private void a(String str) {
        if (o.a()) {
            this.f20714b.a("GoogleCmpAdapter", str);
        }
    }
}
