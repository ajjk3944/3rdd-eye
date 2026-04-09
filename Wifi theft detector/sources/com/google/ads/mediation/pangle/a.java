package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import n3.c;

/* loaded from: classes.dex */
public class a implements PAGSdk.PAGInitCallback {

    /* renamed from: f, reason: collision with root package name */
    public static a f9558f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9559a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9560b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9561c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final c f9562d = new c();

    /* renamed from: e, reason: collision with root package name */
    public final n3.a f9563e = new n3.a();

    /* renamed from: com.google.ads.mediation.pangle.a$a, reason: collision with other inner class name */
    public interface InterfaceC0193a {
        void a(AdError adError);

        void onInitializeSuccess();
    }

    public static a a() {
        if (f9558f == null) {
            f9558f = new a();
        }
        return f9558f;
    }

    public void b(Context context, String str, InterfaceC0193a interfaceC0193a) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorA = PangleConstants.a(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
            interfaceC0193a.a(adErrorA);
        } else if (this.f9559a) {
            this.f9561c.add(interfaceC0193a);
        } else {
            if (this.f9560b) {
                interfaceC0193a.onInitializeSuccess();
                return;
            }
            this.f9559a = true;
            this.f9561c.add(interfaceC0193a);
            this.f9562d.c(context, this.f9563e.a().appId(str).setAdxId("207").setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", "7.8.5.2.0")).build(), this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i10, String str) {
        int i11 = 0;
        this.f9559a = false;
        this.f9560b = false;
        AdError adErrorC = PangleConstants.c(i10, str);
        ArrayList arrayList = this.f9561c;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((InterfaceC0193a) obj).a(adErrorC);
        }
        this.f9561c.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        int i10 = 0;
        this.f9559a = false;
        this.f9560b = true;
        ArrayList arrayList = this.f9561c;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC0193a) obj).onInitializeSuccess();
        }
        this.f9561c.clear();
    }
}
