package va;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.yn;
import com.google.android.gms.internal.ads.yq;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f36120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yq f36122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f36123f;

    public j(o oVar, Context context, c3 c3Var, String str, yq yqVar) {
        this.f36119b = context;
        this.f36120c = c3Var;
        this.f36121d = str;
        this.f36122e = yqVar;
        Objects.requireNonNull(oVar);
        this.f36123f = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36119b, "interstitial");
        return new o2();
    }

    @Override // va.q
    public final /* synthetic */ Object b() {
        return ((yn) this.f36123f.f36146b).y(this.f36119b, this.f36120c, this.f36121d, this.f36122e, 2);
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.V3(new vb.b(this.f36119b), this.f36120c, this.f36121d, this.f36122e, ModuleDescriptor.MODULE_VERSION);
    }
}
