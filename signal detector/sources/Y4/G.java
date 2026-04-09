package Y4;

import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Locale;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class G extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(WifiDetectionActivity wifiDetectionActivity, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4406f = wifiDetectionActivity;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((G) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new G(this.f4406f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4405e;
        if (i == 0) {
            R2.a.H(obj);
            long j6 = this.f4406f.f19410f0;
            this.f4405e = 1;
            Object objE = AbstractC3046w.e(j6, this);
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
        try {
            URLConnection uRLConnectionOpenConnection = new URL("http://tools.3g.qq.com/wifi/ssl").openConnection();
            q5.i.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            List<String> list = httpURLConnection.getHeaderFields().get("Location");
            if (list != null && list.size() == 1) {
                String str = list.get(0);
                q5.i.d(str, "get(...)");
                Locale locale = Locale.ROOT;
                q5.i.d(locale, "ROOT");
                q5.i.d(str.toLowerCase(locale), "toLowerCase(...)");
                return Boolean.valueOf(!r6.startsWith("https://tools.3g.qq.com/wifi/ssl"));
            }
            return responseCode == 200 ? Boolean.TRUE : Boolean.FALSE;
        } catch (Throwable th) {
            R2.a.d(th);
            return Boolean.TRUE;
        }
    }
}
