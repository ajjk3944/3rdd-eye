package a0;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.util.List;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248b extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4563e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f4565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248b(List list, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4565g = list;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0248b) j((InterfaceC2370d) obj2, (u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C0248b c0248b = new C0248b(this.f4565g, interfaceC2370d);
        c0248b.f4564f = obj;
        return c0248b;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4563e;
        if (i == 0) {
            R2.a.H(obj);
            u uVar = (u) this.f4564f;
            this.f4563e = 1;
            Object objA = a4.t.a(this.f4565g, uVar, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objA == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        return C0412i.f5929a;
    }
}
