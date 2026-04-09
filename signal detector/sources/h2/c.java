package h2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import j2.C2545a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements PAGSdk.PAGInitCallback {

    /* renamed from: f, reason: collision with root package name */
    public static c f20466f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20467a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20468b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20469c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final f f20470d = new f();

    /* renamed from: e, reason: collision with root package name */
    public final a f20471e = new a();

    public final void a(Context context, String str, b bVar) {
        if (TextUtils.isEmpty(str)) {
            C2545a c2545aE = R3.b.e(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, c2545aE.toString());
            bVar.b(c2545aE);
            return;
        }
        boolean z6 = this.f20467a;
        ArrayList arrayList = this.f20469c;
        if (z6) {
            arrayList.add(bVar);
            return;
        }
        if (this.f20468b) {
            bVar.a();
            return;
        }
        this.f20467a = true;
        arrayList.add(bVar);
        this.f20471e.getClass();
        PAGConfig pAGConfigBuild = new PAGConfig.Builder().appId(str).setAdxId("207").setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setUserData("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"7.8.5.2.0\"}]").build();
        this.f20470d.getClass();
        PAGSdk.init(context, pAGConfigBuild, this);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i, String str) {
        int i3 = 0;
        this.f20467a = false;
        this.f20468b = false;
        C2545a c2545aG = R3.b.g(i, str);
        ArrayList arrayList = this.f20469c;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((b) obj).b(c2545aG);
        }
        arrayList.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        int i = 0;
        this.f20467a = false;
        this.f20468b = true;
        ArrayList arrayList = this.f20469c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b) obj).a();
        }
        arrayList.clear();
    }
}
