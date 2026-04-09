package V6;

import com.applovin.impl.C2145t;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.d;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements d.a, c.InterfaceC0318c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13002d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f12999a = obj;
        this.f13000b = obj2;
        this.f13001c = obj3;
        this.f13002d = obj4;
    }

    @Override // com.applovin.impl.sdk.d.a
    public void a(com.applovin.impl.sdk.ad.b bVar) {
        ((AppLovinAdServiceImpl) this.f12999a).a((AppLovinAdLoadListener) this.f13000b, (JSONObject) this.f13001c, (C2145t) this.f13002d, bVar);
    }

    @Override // com.applovin.impl.sdk.c.InterfaceC0318c
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        ((com.applovin.impl.sdk.d) this.f12999a).a((d.a) this.f13000b, (c.a) this.f13001c, (C2145t) this.f13002d, bVar, str);
    }
}
