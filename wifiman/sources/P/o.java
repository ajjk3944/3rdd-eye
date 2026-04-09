package P;

import Ii.N;
import T.z1;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import o0.InterfaceC7039f;
import s.InterfaceC7835H;
import y.InterfaceC8555j;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC7835H {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17948a;

    /* renamed from: b, reason: collision with root package name */
    private final u f17949b;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f17950a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1 z1Var) {
            super(0);
            this.f17950a = z1Var;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return (g) this.f17950a.getValue();
        }
    }

    public o(boolean z10, z1 z1Var) {
        this.f17948a = z10;
        this.f17949b = new u(z10, new a(z1Var));
    }

    public abstract void e(InterfaceC8560o.b bVar, N n10);

    public final void f(InterfaceC7039f interfaceC7039f, float f10, long j10) {
        this.f17949b.b(interfaceC7039f, Float.isNaN(f10) ? i.a(interfaceC7039f, this.f17948a, interfaceC7039f.c()) : interfaceC7039f.d1(f10), j10);
    }

    public abstract void g(InterfaceC8560o.b bVar);

    public final void h(InterfaceC8555j interfaceC8555j, N n10) {
        this.f17949b.c(interfaceC8555j, n10);
    }
}
