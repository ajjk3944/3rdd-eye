package P4;

import c5.C0412i;
import h5.InterfaceC2370d;
import java.net.InetAddress;
import p5.p;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class f extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3159e = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((f) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new f(this.f3159e, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        String str = this.f3159e;
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName.isReachable(2000) && q5.i.a(byName.getHostName(), str)) {
                return null;
            }
            return byName.getHostName();
        } catch (Throwable th) {
            R2.a.d(th);
            return str;
        }
    }
}
