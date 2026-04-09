package q2;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C1643ob;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import j$.util.Objects;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2820h extends AbstractC2838q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f23225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603Lc f23227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2834o f23228f;

    public C2820h(C2834o c2834o, Context context, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc) {
        this.f23224b = context;
        this.f23225c = d1Var;
        this.f23226d = str;
        this.f23227e = interfaceC0603Lc;
        Objects.requireNonNull(c2834o);
        this.f23228f = c2834o;
    }

    @Override // q2.AbstractC2838q
    public final Object a() {
        C2834o.h(this.f23224b, "app_open");
        return new P0();
    }

    @Override // q2.AbstractC2838q
    public final /* synthetic */ Object b() {
        return ((C1643ob) this.f23228f.f23252b).D(this.f23224b, this.f23225c, this.f23226d, this.f23227e, 4);
    }

    @Override // q2.AbstractC2838q
    public final Object c(Y y3) {
        return y3.U1(new S2.b(this.f23224b), this.f23225c, this.f23226d, this.f23227e, ModuleDescriptor.MODULE_VERSION);
    }
}
