package dt;

import android.text.TextUtils;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7546a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7547b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7548c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7549d;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i10) {
        this.f7546a = i10;
        this.f7547b = obj;
        this.f7548c = obj2;
        this.f7549d = obj3;
    }

    public abstract String a();

    public abstract qs.c b();

    public nh.l c(String str, String str2) {
        return d(e(str, str2));
    }

    public abstract nh.l d(String str);

    public String e(String str, String str2) {
        qm.c cVar = (qm.c) this.f7548c;
        if (TextUtils.isEmpty(str) || !((q3.a) this.f7547b).K0()) {
            return "";
        }
        String str3 = String.format(str2, str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36");
        cVar.K();
        return cVar.w(str3, map);
    }

    public void f(o7.e eVar) {
        br.l.e(eVar, "statement");
        if (eVar == ((o7.e) ((lq.q) this.f7549d).getValue())) {
            ((AtomicBoolean) this.f7548c).set(false);
        }
    }

    public String toString() {
        switch (this.f7546a) {
            case 0:
                return getClass().getSimpleName() + ": " + b();
            default:
                return super.toString();
        }
    }

    public w(OpensignalDatabase_Impl opensignalDatabase_Impl) {
        this.f7546a = 1;
        this.f7547b = opensignalDatabase_Impl;
        this.f7548c = new AtomicBoolean(false);
        this.f7549d = kc.f.F(new ht.g(3, this));
    }
}
