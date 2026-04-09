package O4;

import c5.C0409f;
import c5.C0412i;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.net.URL;
import p5.p;
import q5.o;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class c extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f3071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f3072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3072f = oVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((c) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new c(this.f3072f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        o oVar = this.f3072f;
        int i = this.f3071e;
        C0412i c0412i = C0412i.f5929a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
            return c0412i;
        }
        R2.a.H(obj);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new String(a4.p.p(new URL(((WebSpeedBean) oVar.f23299a).getUrl())), y5.a.f24252a);
            ((WebSpeedBean) oVar.f23299a).setSpeed((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d);
            objD = c0412i;
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (C0409f.a(objD) != null) {
            ((WebSpeedBean) oVar.f23299a).setSpeed(-1.0d);
        }
        this.f3071e = 1;
        Object objE = AbstractC3046w.e(1000L, this);
        EnumC2380a enumC2380a = EnumC2380a.f20635a;
        return objE == enumC2380a ? enumC2380a : c0412i;
    }
}
