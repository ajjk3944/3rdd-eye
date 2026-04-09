package va;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.yn;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f36095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ar f36097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f36098f;

    public g(o oVar, Context context, c3 c3Var, String str, ar arVar) {
        this.f36094b = context;
        this.f36095c = c3Var;
        this.f36096d = str;
        this.f36097e = arVar;
        Objects.requireNonNull(oVar);
        this.f36098f = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36094b, "banner");
        return new o2();
    }

    @Override // va.q
    public final /* synthetic */ Object b() {
        return ((yn) this.f36098f.f36146b).y(this.f36094b, this.f36095c, this.f36096d, this.f36097e, 1);
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.H2(new vb.b(this.f36094b), this.f36095c, this.f36096d, this.f36097e, ModuleDescriptor.MODULE_VERSION);
    }
}
