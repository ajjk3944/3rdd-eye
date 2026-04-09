package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.util.HashSet;
import java.util.Queue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d3 implements ConsentInformation {

    /* renamed from: a, reason: collision with root package name */
    public final h f19308a;

    /* renamed from: b, reason: collision with root package name */
    public final l7 f19309b;

    /* renamed from: c, reason: collision with root package name */
    public final q f19310c;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f19313f;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19311d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final Object f19312e = new Object();
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19314h = false;

    /* renamed from: i, reason: collision with root package name */
    public ConsentRequestParameters f19315i = new ConsentRequestParameters.Builder().build();

    public d3(h hVar, l7 l7Var, q qVar, e0 e0Var) {
        this.f19308a = hVar;
        this.f19309b = l7Var;
        this.f19310c = qVar;
        this.f19313f = e0Var;
    }

    public final void a(boolean z3) {
        synchronized (this.f19312e) {
            this.f19314h = z3;
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f19311d) {
            z3 = this.g;
        }
        return z3;
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.f19312e) {
            z3 = this.f19314h;
        }
        return z3;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        h hVar = this.f19308a;
        if (!hVar.f19367b.getBoolean("is_pub_misconfigured", false)) {
            int i4 = !b() ? 0 : hVar.f19367b.getInt("consent_status", 0);
            if (i4 != 1 && i4 != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (b()) {
            return this.f19308a.f19367b.getInt("consent_status", 0);
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        if (!b()) {
            return ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;
        }
        h hVar = this.f19308a;
        hVar.getClass();
        return ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(hVar.f19367b.getString("privacy_options_requirement_status", ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.f19310c.f19471c.get() != null;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        synchronized (this.f19311d) {
            this.g = true;
        }
        this.f19315i = consentRequestParameters;
        ((Queue) this.f19313f.f19328f.get()).add(Long.valueOf(System.currentTimeMillis()));
        l7 l7Var = this.f19309b;
        l7Var.getClass();
        l7Var.f19415c.execute(new k7(l7Var, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener, 0));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.f19310c.f19471c.set(null);
        h hVar = this.f19308a;
        Application application = hVar.f19366a;
        HashSet hashSet = hVar.f19368c;
        l0.e(application, hashSet);
        hashSet.clear();
        hVar.f19367b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
        synchronized (this.f19311d) {
            this.g = false;
        }
    }
}
