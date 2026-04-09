package E9;

import A9.C0609x;
import A9.E;
import A9.F;
import A9.G;
import C9.u;
import C9.w;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import N7.B8;
import b9.C1992A;
import c9.C2097r;
import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.ArrayList;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes3.dex */
public abstract class g<T> implements InterfaceC0644f {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4350h f1498b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1499c;

    /* renamed from: d, reason: collision with root package name */
    public final C9.a f1500d;

    public g(InterfaceC4350h interfaceC4350h, int i, C9.a aVar) {
        this.f1498b = interfaceC4350h;
        this.f1499c = i;
        this.f1500d = aVar;
    }

    @Override // D9.InterfaceC0644f
    public Object b(InterfaceC0645g<? super T> interfaceC0645g, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        Object objC = F.c(new e(interfaceC0645g, this, null), interfaceC4347e);
        return objC == g9.a.COROUTINE_SUSPENDED ? objC : C1992A.f18074a;
    }

    public String c() {
        return null;
    }

    public abstract Object d(u<? super T> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e);

    public InterfaceC0644f<T> e() {
        return null;
    }

    public w<T> f(E e4) {
        int i = this.f1499c;
        if (i == -3) {
            i = -2;
        }
        G g10 = G.ATOMIC;
        f fVar = new f(this, null);
        C9.t tVar = new C9.t(C0609x.b(e4, this.f1498b), C9.j.a(i, 4, this.f1500d));
        g10.invoke(fVar, tVar, tVar);
        return tVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        C4351i c4351i = C4351i.f37871b;
        InterfaceC4350h interfaceC4350h = this.f1498b;
        if (interfaceC4350h != c4351i) {
            arrayList.add("context=" + interfaceC4350h);
        }
        int i = this.f1499c;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        C9.a aVar = C9.a.SUSPEND;
        C9.a aVar2 = this.f1500d;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return B8.j(sb, C2097r.u0(arrayList, ", ", null, null, null, 62), ']');
    }
}
