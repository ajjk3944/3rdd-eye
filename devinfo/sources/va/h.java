package va;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.yn;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f36102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ar f36104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f36105f;

    public h(o oVar, Context context, c3 c3Var, String str, ar arVar) {
        this.f36101b = context;
        this.f36102c = c3Var;
        this.f36103d = str;
        this.f36104e = arVar;
        Objects.requireNonNull(oVar);
        this.f36105f = oVar;
    }

    @Override // va.q
    public final Object a() {
        o.t(this.f36101b, "app_open");
        return new o2();
    }

    @Override // va.q
    public final /* synthetic */ Object b() {
        return ((yn) this.f36105f.f36146b).y(this.f36101b, this.f36102c, this.f36103d, this.f36104e, 4);
    }

    @Override // va.q
    public final Object c(x0 x0Var) {
        return x0Var.A0(new vb.b(this.f36101b), this.f36102c, this.f36103d, this.f36104e, ModuleDescriptor.MODULE_VERSION);
    }
}
