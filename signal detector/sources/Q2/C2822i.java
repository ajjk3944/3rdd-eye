package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C1643ob;
import j$.util.Objects;

/* renamed from: q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2822i extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f23230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2834o f23232e;

    public C2822i(C2834o c2834o, Context context, d1 d1Var, String str) {
        this.f23229b = context;
        this.f23230c = d1Var;
        this.f23231d = str;
        Objects.requireNonNull(c2834o);
        this.f23232e = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23229b, "search");
        return new P0();
    }

    @Override // q2.AbstractC2838q
    public final /* synthetic */ Object b() {
        return ((C1643ob) this.f23232e.f23252b).D(this.f23229b, this.f23230c, this.f23231d, null, 3);
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.y2(new S2.b(this.f23229b), this.f23230c, this.f23231d, ModuleDescriptor.MODULE_VERSION);
    }
}
