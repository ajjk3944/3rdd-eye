package O4;

import c5.C0409f;
import c5.C0412i;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.net.URL;
import java.util.regex.Matcher;
import p5.p;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class j extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f3086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f3087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3087f = lVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((j) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new j(this.f3087f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        Matcher matcher;
        int i = this.f3086e;
        C0412i c0412i = C0412i.f5929a;
        l lVar = this.f3087f;
        try {
            if (i == 0) {
                R2.a.H(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = new String(a4.p.p(new URL(lVar.f3099J0.getUrl())), y5.a.f24252a);
                lVar.f3099J0.setSpeed((System.currentTimeMillis() - jCurrentTimeMillis) / 1000.0d);
                WebSpeedBean webSpeedBean = lVar.f3099J0;
                String url = webSpeedBean.getUrl();
                q5.i.b(url);
                webSpeedBean.setLogo(l.g0(lVar, url, str));
                WebSpeedBean webSpeedBean2 = lVar.f3099J0;
                try {
                    matcher = lVar.f3097H0.matcher(str);
                    q5.i.d(matcher, "matcher(...)");
                } catch (Throwable th) {
                    R2.a.d(th);
                }
                String strGroup = matcher.find() ? matcher.group(1) : null;
                webSpeedBean2.setName(strGroup);
                this.f3086e = 1;
                Object objE = AbstractC3046w.e(1000L, this);
                EnumC2380a enumC2380a = EnumC2380a.f20635a;
                if (objE == enumC2380a) {
                    return enumC2380a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R2.a.H(obj);
            }
            objD = c0412i;
        } catch (Throwable th2) {
            objD = R2.a.d(th2);
        }
        if (C0409f.a(objD) != null) {
            lVar.f3099J0.setSpeed(-1.0d);
        }
        lVar.f3099J0.setLoad(true);
        lVar.f3099J0.setLoading(false);
        return c0412i;
    }
}
