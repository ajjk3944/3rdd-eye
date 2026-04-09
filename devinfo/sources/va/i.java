package va;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.yn;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f36116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f36118e;

    public i(o oVar, Context context, c3 c3Var, String str) {
        this.f36115b = context;
        this.f36116c = c3Var;
        this.f36117d = str;
        Objects.requireNonNull(oVar);
        this.f36118e = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36115b, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new o2();
    }

    @Override // va.q
    public final /* synthetic */ Object b() {
        return ((yn) this.f36118e.f36146b).y(this.f36115b, this.f36116c, this.f36117d, null, 3);
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.x2(new vb.b(this.f36115b), this.f36116c, this.f36117d, ModuleDescriptor.MODULE_VERSION);
    }
}
