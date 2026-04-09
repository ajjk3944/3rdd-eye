package Y4;

import c5.C0412i;
import com.lefan.signal.ui.wifi.SquatterActivity;
import h5.InterfaceC2370d;
import z5.InterfaceC3044u;

/* renamed from: Y4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231k extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SquatterActivity f4476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231k(SquatterActivity squatterActivity, String str, String str2, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4476e = squatterActivity;
        this.f4477f = str;
        this.f4478g = str2;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        C0231k c0231k = (C0231k) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj);
        C0412i c0412i = C0412i.f5929a;
        c0231k.l(c0412i);
        return c0412i;
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C0231k(this.f4476e, this.f4477f, this.f4478g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        int i = SquatterActivity.f19359d0;
        this.f4476e.C(this.f4477f, 0, this.f4478g, null);
        return C0412i.f5929a;
    }
}
