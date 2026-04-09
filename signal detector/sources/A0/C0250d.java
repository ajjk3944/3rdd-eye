package a0;

import c5.C0412i;
import h5.InterfaceC2370d;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250d extends j5.g implements p5.l {

    /* renamed from: e, reason: collision with root package name */
    public int f4570e;

    @Override // p5.l
    public final Object f(Object obj) throws Throwable {
        C0250d c0250d = new C0250d(1, (InterfaceC2370d) obj);
        C0412i c0412i = C0412i.f5929a;
        c0250d.l(c0412i);
        return c0412i;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4570e;
        if (i == 0) {
            R2.a.H(obj);
            this.f4570e = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        R2.a.H(obj);
        return C0412i.f5929a;
    }
}
