package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C1643ob;
import j$.util.Objects;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2824j extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f23234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0569Jc f23236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2834o f23237f;

    public C2824j(C2834o c2834o, Context context, d1 d1Var, String str, BinderC0569Jc binderC0569Jc) {
        this.f23233b = context;
        this.f23234c = d1Var;
        this.f23235d = str;
        this.f23236e = binderC0569Jc;
        Objects.requireNonNull(c2834o);
        this.f23237f = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23233b, "interstitial");
        return new P0();
    }

    @Override // q2.AbstractC2838q
    public final /* synthetic */ Object b() {
        return ((C1643ob) this.f23237f.f23252b).D(this.f23233b, this.f23234c, this.f23235d, this.f23236e, 2);
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.H0(new S2.b(this.f23233b), this.f23234c, this.f23235d, this.f23236e, ModuleDescriptor.MODULE_VERSION);
    }
}
