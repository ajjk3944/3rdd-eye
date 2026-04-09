package z9;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements PAGSdk.PAGInitCallback {

    /* renamed from: f, reason: collision with root package name */
    public static c f38122f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f38123a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38124b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f38125c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final e f38126d = new e();

    /* renamed from: e, reason: collision with root package name */
    public final a f38127e = new a();

    public final void a(Context context, String str, b bVar) {
        if (TextUtils.isEmpty(str)) {
            pa.a aVarJ = wb.e.j(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, aVarJ.toString());
            bVar.a(aVarJ);
            return;
        }
        boolean z3 = this.f38123a;
        ArrayList arrayList = this.f38125c;
        if (z3) {
            arrayList.add(bVar);
            return;
        }
        if (this.f38124b) {
            bVar.onInitializeSuccess();
            return;
        }
        this.f38123a = true;
        arrayList.add(bVar);
        this.f38127e.getClass();
        PAGConfig pAGConfigBuild = new PAGConfig.Builder().appId(str).setAdxId("207").setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setUserData("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"7.8.0.8.0\"}]").build();
        this.f38126d.getClass();
        PAGSdk.init(context, pAGConfigBuild, this);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i4, String str) {
        int i10 = 0;
        this.f38123a = false;
        this.f38124b = false;
        pa.a aVarM = wb.e.m(i4, str);
        ArrayList arrayList = this.f38125c;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((b) obj).a(aVarM);
        }
        arrayList.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        int i4 = 0;
        this.f38123a = false;
        this.f38124b = true;
        ArrayList arrayList = this.f38125c;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((b) obj).onInitializeSuccess();
        }
        arrayList.clear();
    }
}
