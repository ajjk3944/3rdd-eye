package V4;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class r extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f3929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f3930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f3931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f3932h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, double d6, double d7, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3930f = uVar;
        this.f3931g = d6;
        this.f3932h = d7;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((r) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new r(this.f3930f, this.f3931g, this.f3932h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f3929e;
        u uVar = this.f3930f;
        if (i == 0) {
            R2.a.H(obj);
            this.f3929e = 1;
            obj = u.e(uVar, this.f3931g, this.f3932h, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (obj == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        uVar.f3942c.j((String) obj);
        return C0412i.f5929a;
    }
}
