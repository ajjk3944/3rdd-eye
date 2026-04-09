package x0;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import j5.g;
import p5.p;
import z0.C3014a;
import z0.f;
import z5.InterfaceC3044u;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2986a extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f24031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2987b f24032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3014a f24033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2986a(C2987b c2987b, C3014a c3014a, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f24032f = c2987b;
        this.f24033g = c3014a;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C2986a) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C2986a(this.f24032f, this.f24033g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f24031e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
            return obj;
        }
        R2.a.H(obj);
        f fVar = this.f24032f.f24034a;
        this.f24031e = 1;
        Object objB = fVar.b(this.f24033g, this);
        EnumC2380a enumC2380a = EnumC2380a.f20635a;
        return objB == enumC2380a ? enumC2380a : objB;
    }
}
