package O;

import N.s;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.S0;
import androidx.camera.core.impl.T0;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import v.C5664t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10164g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f10165h;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f10159b = i;
        this.f10160c = obj;
        this.f10161d = obj2;
        this.f10162e = obj3;
        this.f10163f = obj4;
        this.f10164g = obj5;
        this.f10165h = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10159b) {
            case 0:
                ((j) this.f10160c).a((J) this.f10161d, (J) this.f10162e, (s) this.f10163f, (s) this.f10164g, (Map.Entry) this.f10165h);
                break;
            case 1:
                com.applovin.impl.mediation.ads.a.a((String) this.f10160c, (String) this.f10161d, (MaxAdFormat) this.f10162e, (String) this.f10163f, (k) this.f10164g, (String) this.f10165h);
                break;
            default:
                C5664t c5664t = (C5664t) this.f10160c;
                c5664t.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = (String) this.f10161d;
                sb.append(str);
                sb.append(" ACTIVE");
                c5664t.u(sb.toString(), null);
                LinkedHashMap linkedHashMap = c5664t.f46872b.f14957b;
                S0.a aVar = (S0.a) linkedHashMap.get(str);
                H0 h02 = (H0) this.f10162e;
                T0<?> t02 = (T0) this.f10163f;
                L0 l02 = (L0) this.f10164g;
                ArrayList arrayList = (ArrayList) this.f10165h;
                if (aVar == null) {
                    aVar = new S0.a(h02, t02, l02, arrayList);
                    linkedHashMap.put(str, aVar);
                }
                aVar.f14963f = true;
                c5664t.f46872b.e(str, h02, t02, l02, arrayList);
                c5664t.L();
                break;
        }
    }
}
