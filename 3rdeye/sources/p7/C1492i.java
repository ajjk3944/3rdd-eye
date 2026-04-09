package P7;

import A9.C0583j;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* compiled from: AdManager.kt */
/* renamed from: P7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1492i implements AppLovinSdk.SdkInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1484a f10749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0583j f10750b;

    public C1492i(C1484a c1484a, C0583j c0583j) {
        this.f10749a = c1484a;
        this.f10750b = c0583j;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        this.f10749a.e().a("AppLovin onInitialization complete called", new Object[0]);
        C0583j c0583j = this.f10750b;
        if (c0583j.isActive()) {
            c0583j.resumeWith(Boolean.TRUE);
        }
    }
}
