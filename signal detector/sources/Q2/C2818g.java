package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C1643ob;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import j$.util.Objects;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2818g extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f23218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603Lc f23220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2834o f23221f;

    public C2818g(C2834o c2834o, Context context, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc) {
        this.f23217b = context;
        this.f23218c = d1Var;
        this.f23219d = str;
        this.f23220e = interfaceC0603Lc;
        Objects.requireNonNull(c2834o);
        this.f23221f = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23217b, "banner");
        return new P0();
    }

    @Override // q2.AbstractC2838q
    public final /* synthetic */ Object b() {
        return ((C1643ob) this.f23221f.f23252b).D(this.f23217b, this.f23218c, this.f23219d, this.f23220e, 1);
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.Y0(new S2.b(this.f23217b), this.f23218c, this.f23219d, this.f23220e, ModuleDescriptor.MODULE_VERSION);
    }
}
