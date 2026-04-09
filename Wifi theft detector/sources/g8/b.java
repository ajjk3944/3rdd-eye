package g8;

import com.wifihacker.detector.HackerApplication;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f21208b;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21209a;

    public static b c() {
        if (f21208b == null) {
            f21208b = new b();
        }
        return f21208b;
    }

    public final boolean a(String str) {
        return s.m(HackerApplication.l(), str);
    }

    public a b() {
        d();
        if (this.f21209a.size() == 1) {
            return (a) this.f21209a.get(0);
        }
        return (a) this.f21209a.get(((int) (Math.random() * 10.0d)) % this.f21209a.size());
    }

    public final void d() {
        this.f21209a = new ArrayList();
        if (!a("com.wifispeedtest.wifisignalmeter") && !a("com.speedmeter.internetspeedtest.wifispeedtest.wifimeter")) {
            this.f21209a.add(new a("com.speedmeter.internetspeedtest.wifispeedtest.wifimeter", R.string.test_speed));
        }
        if (!a(e8.a.f20993d)) {
            this.f21209a.add(new a(e8.a.f20993d, R.string.duplicate_remover_12));
        }
        if (!a(e8.a.f20992c)) {
            this.f21209a.add(new a(e8.a.f20992c, R.string.app_killer_13));
        }
        if (this.f21209a.size() == 0) {
            this.f21209a.add(new a(e8.a.f20992c, R.string.app_killer_13));
        }
    }
}
