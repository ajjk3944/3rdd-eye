package w0;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import j5.g;
import p5.p;
import y0.C3008b;
import z5.InterfaceC3044u;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2965a extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f23931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2968d f23932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2965a(C2968d c2968d, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f23932f = c2968d;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C2965a) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C2965a(this.f23932f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f23931e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
            return obj;
        }
        R2.a.H(obj);
        C3008b c3008b = this.f23932f.f23940a;
        this.f23931e = 1;
        Object objB = c3008b.b(this);
        EnumC2380a enumC2380a = EnumC2380a.f20635a;
        return objB == enumC2380a ? enumC2380a : objB;
    }
}
