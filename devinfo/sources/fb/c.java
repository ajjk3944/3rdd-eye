package fb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.e81;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.ads.z21;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23882b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f23881a = i4;
        this.f23882b = obj;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        switch (this.f23881a) {
            case 0:
                final h hVar = (h) this.f23882b;
                final ArrayList arrayList = (ArrayList) obj;
                return yo0.G(hVar.n4("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new z21() { // from class: fb.d
                    @Override // com.google.android.gms.internal.ads.z21
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri : arrayList) {
                            h hVar2 = hVar;
                            if (!h.l4(uri, hVar2.f23934z, hVar2.A) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri);
                            } else {
                                arrayList2.add(h.o4(uri, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, hVar.g);
            case 1:
                h hVar2 = (h) this.f23882b;
                final Uri uri = (Uri) obj;
                return yo0.G(hVar2.n4("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new z21() { // from class: fb.e
                    @Override // com.google.android.gms.internal.ads.z21
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !zIsEmpty ? h.o4(uri2, "nas", str) : uri2;
                    }
                }, hVar2.g);
            default:
                pg0 pg0Var = (pg0) obj;
                o oVar = new o(new JsonReader(new InputStreamReader(pg0Var.f15002a)), pg0Var.f15003b);
                iu iuVar = (iu) this.f23882b;
                try {
                    oVar.f23954b = va.r.g.f36157a.k(iuVar.f12473a).toString();
                } catch (JSONException unused) {
                    oVar.f23954b = JsonUtils.EMPTY_JSON;
                }
                Bundle bundle = iuVar.f12484n;
                if (!bundle.isEmpty()) {
                    try {
                        oVar.f23955c = va.r.g.f36157a.k(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return yo0.e(oVar);
        }
    }
}
