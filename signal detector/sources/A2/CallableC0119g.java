package A2;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.C1068du;
import com.google.android.gms.internal.ads.F6;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.I6;
import j2.C2551g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: A2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0119g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f250d;

    public /* synthetic */ CallableC0119g(Object obj, Object obj2, Object obj3, int i) {
        this.f247a = i;
        this.f248b = obj;
        this.f250d = obj2;
        this.f249c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        C1068du c1068du;
        switch (this.f247a) {
            case 0:
                BinderC0126n binderC0126n = (BinderC0126n) this.f248b;
                List<Uri> list = (List) this.f250d;
                S2.a aVar = (S2.a) this.f249c;
                F6 f6 = binderC0126n.f291d.f8555b;
                String strI = f6 != null ? f6.i(binderC0126n.f290c, (View) S2.b.n1(aVar), null) : "";
                if (TextUtils.isEmpty(strI)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (BinderC0126n.O3(uri, binderC0126n.f281N, binderC0126n.f282O)) {
                        arrayList.add(BinderC0126n.R3(uri, "ms", strI));
                    } else {
                        u2.k.h("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 1:
                BinderC0126n binderC0126n2 = (BinderC0126n) this.f248b;
                Uri uriB = (Uri) this.f250d;
                S2.a aVar2 = (S2.a) this.f249c;
                try {
                    uriB = (!((Boolean) C2841s.f23267e.f23270c.a(H9.jd)).booleanValue() || (c1068du = binderC0126n2.f292e) == null) ? binderC0126n2.f291d.b(uriB, binderC0126n2.f290c, (View) S2.b.n1(aVar2), null) : c1068du.a(uriB, binderC0126n2.f290c, (View) S2.b.n1(aVar2), null);
                } catch (I6 e6) {
                    u2.k.i("", e6);
                }
                if (uriB.getQueryParameter("ms") != null) {
                    return uriB;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 2:
                C0117e.t(((L) this.f248b).f184c, (C2551g) this.f250d, (M) this.f249c);
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((Y2.B) this.f248b).b((String) this.f250d, (JSONObject) this.f249c));
        }
    }
}
