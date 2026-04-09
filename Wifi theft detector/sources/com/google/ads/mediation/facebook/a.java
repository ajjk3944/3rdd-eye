package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f9525d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9526a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9527b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9528c = new ArrayList();

    /* renamed from: com.google.ads.mediation.facebook.a$a, reason: collision with other inner class name */
    public interface InterfaceC0192a {
        void a(AdError adError);

        void onInitializeSuccess();
    }

    public static a a() {
        if (f9525d == null) {
            f9525d = new a();
        }
        return f9525d;
    }

    public void b(Context context, ArrayList arrayList, InterfaceC0192a interfaceC0192a) {
        if (this.f9526a) {
            this.f9528c.add(interfaceC0192a);
        } else {
            if (this.f9527b) {
                interfaceC0192a.onInitializeSuccess();
                return;
            }
            this.f9526a = true;
            a().f9528c.add(interfaceC0192a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        int i10 = 0;
        this.f9526a = false;
        this.f9527b = initResult.isSuccess();
        ArrayList arrayList = this.f9528c;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            InterfaceC0192a interfaceC0192a = (InterfaceC0192a) obj;
            if (initResult.isSuccess()) {
                interfaceC0192a.onInitializeSuccess();
            } else {
                interfaceC0192a.a(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f9528c.clear();
    }
}
