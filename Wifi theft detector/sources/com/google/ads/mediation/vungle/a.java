package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VungleWrapperFramework;
import com.vungle.ads.b0;
import com.vungle.ads.c0;
import com.vungle.ads.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import q3.c;

/* loaded from: classes.dex */
public class a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final a f9629c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f9630a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9631b = new ArrayList();

    /* renamed from: com.google.ads.mediation.vungle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0194a {
        void a(AdError adError);

        void onInitializeSuccess();
    }

    public a() {
        b0.setIntegrationName(VungleWrapperFramework.admob, "7.6.3.0".replace('.', '_'));
    }

    public static a a() {
        return f9629c;
    }

    public void b(String str, Context context, InterfaceC0194a interfaceC0194a) {
        if (c.f24017b.isInitialized()) {
            interfaceC0194a.onInitializeSuccess();
        } else {
            if (this.f9630a.getAndSet(true)) {
                this.f9631b.add(interfaceC0194a);
                return;
            }
            c(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
            c.f24017b.a(context, str, this);
            this.f9631b.add(interfaceC0194a);
        }
    }

    public void c(int i10) {
        if (i10 == 0) {
            c0.setCOPPAStatus(false);
        } else {
            if (i10 != 1) {
                return;
            }
            c0.setCOPPAStatus(true);
        }
    }

    @Override // com.vungle.ads.l
    public void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        ArrayList arrayList = this.f9631b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC0194a) obj).a(adError);
        }
        this.f9631b.clear();
        this.f9630a.set(false);
    }

    @Override // com.vungle.ads.l
    public void onSuccess() {
        ArrayList arrayList = this.f9631b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC0194a) obj).onInitializeSuccess();
        }
        this.f9631b.clear();
        this.f9630a.set(false);
    }
}
