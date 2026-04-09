package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.B;
import com.vungle.ads.VungleAds;
import com.vungle.ads.k0;
import com.vungle.ads.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;

/* compiled from: VungleInitializer.java */
/* loaded from: classes.dex */
public final class a implements B {

    /* renamed from: c, reason: collision with root package name */
    public static final a f22436c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f22437a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<InterfaceC0332a> f22438b = new ArrayList<>();

    /* compiled from: VungleInitializer.java */
    /* renamed from: com.google.ads.mediation.vungle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0332a {
        void a(AdError adError);

        void onInitializeSuccess();
    }

    public a() {
        VungleAds.setIntegrationName(VungleAds.WrapperFramework.admob, "7.4.1.0".replace('.', '_'));
    }

    public static void b(int i) {
        if (i == 0) {
            l0.setCOPPAStatus(false);
        } else {
            if (i != 1) {
                return;
            }
            l0.setCOPPAStatus(true);
        }
    }

    public final void a(String appId, Context context, InterfaceC0332a interfaceC0332a) {
        VungleAds.a aVar = VungleAds.Companion;
        if (aVar.isInitialized()) {
            interfaceC0332a.onInitializeSuccess();
            return;
        }
        boolean andSet = this.f22437a.getAndSet(true);
        ArrayList<InterfaceC0332a> arrayList = this.f22438b;
        if (andSet) {
            arrayList.add(interfaceC0332a);
            return;
        }
        b(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        l.f(context, "context");
        l.f(appId, "appId");
        aVar.init(context, appId, this);
        arrayList.add(interfaceC0332a);
    }

    @Override // com.vungle.ads.B
    public final void onError(k0 k0Var) {
        AdError adError = VungleMediationAdapter.getAdError(k0Var);
        ArrayList<InterfaceC0332a> arrayList = this.f22438b;
        Iterator<InterfaceC0332a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(adError);
        }
        arrayList.clear();
        this.f22437a.set(false);
    }

    @Override // com.vungle.ads.B
    public final void onSuccess() {
        ArrayList<InterfaceC0332a> arrayList = this.f22438b;
        Iterator<InterfaceC0332a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        arrayList.clear();
        this.f22437a.set(false);
    }
}
