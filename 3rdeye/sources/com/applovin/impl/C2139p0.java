package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C2139p0;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2139p0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20647a;

    /* renamed from: b, reason: collision with root package name */
    private final C2148u0 f20648b;

    /* renamed from: com.applovin.impl.p0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20649a;

        static {
            int[] iArr = new int[AppLovinSdkConfiguration.ConsentFlowUserGeography.values().length];
            f20649a = iArr;
            try {
                iArr[AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20649a[AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20649a[AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.applovin.impl.p0$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20650a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20651b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20652c;

        /* renamed from: d, reason: collision with root package name */
        private AppLovinCmpError f20653d;

        /* renamed from: e, reason: collision with root package name */
        private C2137o0 f20654e;

        public b() {
        }

        public boolean b() {
            return this.f20650a;
        }

        public void c() {
            this.f20652c = true;
            this.f20650a = true;
        }

        public void d() {
            this.f20651b = true;
            this.f20650a = true;
        }

        public b(C2137o0 c2137o0) {
            this.f20654e = c2137o0;
        }

        public boolean a() {
            return this.f20652c;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            this.f20653d = appLovinCmpError;
        }

        public void a(C2137o0 c2137o0) {
            this.f20654e = c2137o0;
        }
    }

    /* renamed from: com.applovin.impl.p0$c */
    public interface c {
        void a(b bVar);
    }

    public C2139p0(com.applovin.impl.sdk.k kVar) {
        this.f20647a = kVar;
        this.f20648b = new C2148u0(kVar);
        if (a7.i(com.applovin.impl.sdk.k.o())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public Uri f() {
        return c().getPrivacyPolicyUri();
    }

    public String g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return c().getTermsOfServiceUri();
    }

    public boolean i() {
        return this.f20648b.a();
    }

    public boolean j() {
        Map<String, String> extraParameters = this.f20647a.n0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) : c().isEnabled();
    }

    public boolean k() {
        if (a7.c(this.f20647a)) {
            int i = a.f20649a[d().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
        }
        return this.f20647a.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
    }

    public boolean l() {
        return this.f20647a.n0().getExtraParameters().containsKey("terms_flow_settings");
    }

    public boolean m() {
        return c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f20648b.a(this.f20647a.u0(), new c() { // from class: com.applovin.impl.B0
            @Override // com.applovin.impl.C2139p0.c
            public final void a(C2139p0.b bVar) {
                this.f18784b.a(bVar);
            }
        });
    }

    public static TermsAndPrivacyPolicyFlowSettingsImpl a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String strA = a7.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.k) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, uri);
    }

    private TermsAndPrivacyPolicyFlowSettingsImpl c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.f20647a.n0().getTermsAndPrivacyPolicyFlowSettings();
    }

    public JSONObject b() throws JSONException {
        TermsAndPrivacyPolicyFlowSettingsImpl termsAndPrivacyPolicyFlowSettingsImplC = c();
        Uri privacyPolicyUri = termsAndPrivacyPolicyFlowSettingsImplC.getPrivacyPolicyUri();
        Uri termsOfServiceUri = termsAndPrivacyPolicyFlowSettingsImplC.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography d() {
        return c().getDebugUserGeography();
    }

    public String e() {
        Object objF = f();
        Object objH = h();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(j());
        sb.append("\nTerms of Service - ");
        if (objH == null) {
            objH = "undefined";
        }
        sb.append(objH);
        sb.append("\nPrivacy Policy - ");
        if (objF == null) {
            objF = "undefined";
        }
        sb.append(objF);
        return sb.toString();
    }

    private void b(Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new D(4, this, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public void a(Activity activity, c cVar) {
        if (!j()) {
            cVar.a(new b(new C2137o0(C2137o0.f20614c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (c().getPrivacyPolicyUri() == null) {
            b(activity);
        } else {
            this.f20648b.a(activity, new C.e0(7, this, cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.f20654e == null) {
            this.f20647a.b(n4.f20584r, Boolean.FALSE);
        }
        cVar.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        if (bVar.f20654e == null) {
            this.f20647a.b(n4.f20584r, Boolean.FALSE);
        }
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        final Uri uriA = a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.C0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f18790b.a(uriA, dialogInterface, i);
            }
        }).setNegativeButton("DISMISS", new C2.d(uriA, 2)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i) {
        x6.a(uri, com.applovin.impl.sdk.k.o(), this.f20647a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    private Uri a() {
        return Uri.parse((String) this.f20647a.a(this.f20647a.H0() ? l4.f20025s6 : l4.f20017r6));
    }
}
