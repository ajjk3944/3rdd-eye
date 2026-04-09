package i2;

import A3.o;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import h0.C2352b;
import java.util.ArrayList;
import java.util.HashMap;
import w2.InterfaceC2973e;
import w2.q;
import w2.w;

/* loaded from: classes.dex */
public final class k extends w {

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2973e f20573q;

    /* renamed from: r, reason: collision with root package name */
    public final h2.c f20574r;

    /* renamed from: s, reason: collision with root package name */
    public final h2.f f20575s;

    /* renamed from: t, reason: collision with root package name */
    public final h2.a f20576t;

    /* renamed from: u, reason: collision with root package name */
    public q f20577u;

    /* renamed from: v, reason: collision with root package name */
    public PAGNativeAd f20578v;

    public k(InterfaceC2973e interfaceC2973e, h2.c cVar, h2.f fVar, h2.a aVar) {
        this.f20573q = interfaceC2973e;
        this.f20574r = cVar;
        this.f20575s = fVar;
        this.f20576t = aVar;
    }

    @Override // w2.w
    public final void a(View view, HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.remove("3011");
        map2.remove("3012");
        View view2 = (View) map2.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f20578v.registerViewForInteraction((ViewGroup) view, new ArrayList(map2.values()), arrayList, (View) null, new C2352b(2, this));
        this.f23962k.setOnClickListener(new o(3, this));
    }
}
