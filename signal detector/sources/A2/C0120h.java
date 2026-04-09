package A2;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.C1807re;
import com.google.android.gms.internal.ads.C1818rp;
import com.google.android.gms.internal.ads.InterfaceC1736qD;
import com.google.android.gms.internal.ads.NA;
import f4.InterfaceFutureC2326a;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: A2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0120h implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f252b;

    public /* synthetic */ C0120h(int i, Object obj) {
        this.f251a = i;
        this.f252b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        switch (this.f251a) {
            case 0:
                final BinderC0126n binderC0126n = (BinderC0126n) this.f252b;
                final ArrayList arrayList = (ArrayList) obj;
                return AbstractC1984ut.G(binderC0126n.Q3("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new NA() { // from class: A2.i
                    @Override // com.google.android.gms.internal.ads.NA
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri : arrayList) {
                            BinderC0126n binderC0126n2 = binderC0126n;
                            if (!BinderC0126n.O3(uri, binderC0126n2.f281N, binderC0126n2.f282O) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri);
                            } else {
                                arrayList2.add(BinderC0126n.R3(uri, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, binderC0126n.f294g);
            case 1:
                BinderC0126n binderC0126n2 = (BinderC0126n) this.f252b;
                final Uri uri = (Uri) obj;
                return AbstractC1984ut.G(binderC0126n2.Q3("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new NA() { // from class: A2.j
                    @Override // com.google.android.gms.internal.ads.NA
                    public final /* synthetic */ Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = uri;
                        return !zIsEmpty ? BinderC0126n.R3(uri2, "nas", str) : uri2;
                    }
                }, binderC0126n2.f294g);
            default:
                C1818rp c1818rp = (C1818rp) obj;
                w wVar = new w(new JsonReader(new InputStreamReader(c1818rp.f16618a)), c1818rp.f16619b);
                C1807re c1807re = (C1807re) this.f252b;
                try {
                    wVar.f341b = q2.r.f23260g.f23261a.k(c1807re.f16576a).toString();
                } catch (JSONException unused) {
                    wVar.f341b = "{}";
                }
                Bundle bundle = c1807re.f16588n;
                if (!bundle.isEmpty()) {
                    try {
                        wVar.f342c = q2.r.f23260g.f23261a.k(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return AbstractC1984ut.e(wVar);
        }
    }
}
