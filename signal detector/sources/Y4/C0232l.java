package Y4;

import c5.C0412i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.lefan.signal.ui.wifi.SquatterActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.net.InetAddress;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* renamed from: Y4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232l extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SquatterActivity f4481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232l(String str, SquatterActivity squatterActivity, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4480f = str;
        this.f4481g = squatterActivity;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0232l) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C0232l(this.f4480f, this.f4481g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4479e;
        try {
            if (i == 0) {
                R2.a.H(obj);
                String str = this.f4480f;
                SquatterActivity squatterActivity = this.f4481g;
                InetAddress byName = InetAddress.getByName(str);
                if (byName.isReachable(TTAdConstant.STYLE_SIZE_RADIO_1_1)) {
                    String hostAddress = byName.getHostAddress();
                    String hostName = q5.i.a(hostAddress, byName.getHostName()) ? null : byName.getHostName();
                    G5.e eVar = z5.D.f24485a;
                    A5.d dVar = E5.o.f1409a;
                    C0231k c0231k = new C0231k(squatterActivity, hostAddress, hostName, null);
                    this.f4479e = 1;
                    Object objR = AbstractC3046w.r(dVar, this, c0231k);
                    EnumC2380a enumC2380a = EnumC2380a.f20635a;
                    if (objR == enumC2380a) {
                        return enumC2380a;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R2.a.H(obj);
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
        return C0412i.f5929a;
    }
}
