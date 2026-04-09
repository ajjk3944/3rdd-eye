package com.google.ads.mediation.facebook;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FacebookInitializer.java */
/* loaded from: classes.dex */
public final class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f22428d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f22429a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22430b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0331a> f22431c = new ArrayList<>();

    /* compiled from: FacebookInitializer.java */
    /* renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    public interface InterfaceC0331a {
        void a(AdError adError);

        void onInitializeSuccess();
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f22429a = false;
        this.f22430b = initResult.isSuccess();
        ArrayList<InterfaceC0331a> arrayList = this.f22431c;
        Iterator<InterfaceC0331a> it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0331a next = it.next();
            if (initResult.isSuccess()) {
                next.onInitializeSuccess();
            } else {
                next.a(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        arrayList.clear();
    }
}
