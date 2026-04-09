package aa;

import android.view.View;
import android.view.ViewGroup;
import bb.a0;
import bb.t;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends a0 {

    /* renamed from: r, reason: collision with root package name */
    public final bb.e f285r;

    /* renamed from: s, reason: collision with root package name */
    public final z9.c f286s;

    /* renamed from: t, reason: collision with root package name */
    public final z9.e f287t;

    /* renamed from: u, reason: collision with root package name */
    public final z9.a f288u;

    /* renamed from: v, reason: collision with root package name */
    public t f289v;

    /* renamed from: w, reason: collision with root package name */
    public PAGNativeAd f290w;

    public l(bb.e eVar, z9.c cVar, z9.e eVar2, z9.a aVar) {
        this.f285r = eVar;
        this.f286s = cVar;
        this.f287t = eVar2;
        this.f288u = aVar;
    }

    @Override // bb.a0
    public final void a(View view, HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.remove("3011");
        map2.remove("3012");
        View view2 = (View) map2.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f290w.registerViewForInteraction((ViewGroup) view, new ArrayList(map2.values()), arrayList, (View) null, new o7.d(2, this));
        this.f2103l.setOnClickListener(new j(0, this));
    }
}
