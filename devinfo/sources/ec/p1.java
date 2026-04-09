package ec;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.sk;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22988c;

    public /* synthetic */ p1(int i4, Context context, Object obj) {
        this.f22986a = i4;
        this.f22988c = obj;
        this.f22987b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        int i4 = this.f22986a;
        boolean z3 = false;
        Object obj = this.f22988c;
        Object obj2 = this.f22987b;
        switch (i4) {
            case 0:
                u1 u1Var = (u1) obj2;
                u1Var.f23089a.B();
                m mVar = u1Var.f23089a.f22733c;
                g4.U(mVar);
                return mVar.w0((String) obj);
            case 1:
                u1 u1Var2 = (u1) obj2;
                u1Var2.f23089a.B();
                return new i(u1Var2.f23089a.p0(((n4) obj).f22915a));
            case 2:
                n4 n4Var = (n4) obj;
                String str = n4Var.f22915a;
                pb.y.h(str);
                g4 g4Var = (g4) obj2;
                a2 a2VarE = g4Var.e(str);
                z1 z1Var = z1.ANALYTICS_STORAGE;
                if (a2VarE.i(z1Var) && a2.c(100, n4Var.f22931s).i(z1Var)) {
                    return g4Var.c0(n4Var).E();
                }
                g4Var.a().f23060o.d("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 3:
                return ((fb.a) obj2).getClickSignals((String) obj);
            case 4:
                return ((ua.e) obj).k((Context) obj2);
            case 5:
                Context context = (Context) obj;
                Context context2 = (Context) obj2;
                if (context != null) {
                    ya.a0.m("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    ya.a0.m("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z3 = true;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    ya.a0.m("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z3) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        ya.a0.m("Persisting user agent.");
                    }
                }
                return string;
            default:
                ya.b0 b0Var = ya.f0.f37440l;
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setDatabasePath(((Context) obj2).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16163i1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ p1(int i4, Object obj, Object obj2) {
        this.f22986a = i4;
        this.f22988c = obj2;
        this.f22987b = obj;
    }

    public p1(g4 g4Var, n4 n4Var) {
        this.f22986a = 2;
        this.f22988c = n4Var;
        Objects.requireNonNull(g4Var);
        this.f22987b = g4Var;
    }
}
