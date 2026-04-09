package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.d;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.d;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements s2.a, d.b, UserMessagingPlatform.OnConsentFormLoadSuccessListener, d.a, c.InterfaceC0020c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5269d;

    public /* synthetic */ r9(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar) {
        this.f5269d = r2Var;
        this.f5266a = nVar;
        this.f5267b = oVar;
        this.f5268c = kVar;
    }

    @Override // com.applovin.impl.d.b
    public void a(Activity activity) {
        l.a((r2) this.f5269d, (n) this.f5266a, (o) this.f5267b, (com.applovin.impl.sdk.k) this.f5268c, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((com.applovin.impl.privacy.cmp.a) this.f5269d).a((a.InterfaceC0017a) this.f5268c, (FormError) this.f5266a, (k0) this.f5267b, consentForm);
    }

    public /* synthetic */ r9(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f5269d = obj;
        this.f5268c = obj2;
        this.f5266a = obj3;
        this.f5267b = obj4;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        ((l) this.f5269d).a((com.applovin.impl.sdk.k) this.f5268c, (n) this.f5266a, (o) this.f5267b, j2Var, r2Var);
    }

    @Override // com.applovin.impl.sdk.d.a
    public void a(com.applovin.impl.sdk.ad.b bVar) {
        ((AppLovinAdServiceImpl) this.f5269d).a((AppLovinAdLoadListener) this.f5268c, (JSONObject) this.f5266a, (u) this.f5267b, bVar);
    }

    @Override // com.applovin.impl.sdk.c.InterfaceC0020c
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        ((com.applovin.impl.sdk.d) this.f5269d).a((d.a) this.f5268c, (c.a) this.f5266a, (u) this.f5267b, bVar, str);
    }
}
