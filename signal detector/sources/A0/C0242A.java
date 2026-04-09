package a0;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.InterfaceC3044u;

/* renamed from: a0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242A extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p5.p f4544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4545g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242A(p5.p pVar, Object obj, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4544f = pVar;
        this.f4545g = obj;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0242A) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C0242A(this.f4544f, this.f4545g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4543e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
            return obj;
        }
        R2.a.H(obj);
        this.f4543e = 1;
        Object objH = this.f4544f.h(this.f4545g, this);
        EnumC2380a enumC2380a = EnumC2380a.f20635a;
        return objH == enumC2380a ? enumC2380a : objH;
    }
}
