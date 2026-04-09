package zc;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27140a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2 f27141d;

    public /* synthetic */ s1(d2 d2Var, int i10) {
        this.f27140a = i10;
        this.f27141d = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f27140a) {
            case 0:
                this.f27141d.P1();
                break;
            case 1:
                y9.u uVar = this.f27141d.O;
                c1 c1Var = (c1) uVar.f25996d;
                a1 a1Var = c1Var.B;
                d2 d2Var = c1Var.I;
                r0 r0Var = c1Var.f26888x;
                c1.g(a1Var);
                a1Var.s1();
                if (uVar.l()) {
                    if (uVar.k()) {
                        c1.e(r0Var);
                        r0Var.T.o(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        c1.f(d2Var);
                        d2Var.z1("auto", "_cmpx", bundle);
                    } else {
                        c1.e(r0Var);
                        d8.a aVar = r0Var.T;
                        String strN = aVar.n();
                        if (TextUtils.isEmpty(strN)) {
                            j0 j0Var = c1Var.f26889y;
                            c1.g(j0Var);
                            j0Var.D.b("Cache still valid but referrer not found");
                        } else {
                            long jE = r0Var.U.e() / 3600000;
                            Uri uri = Uri.parse(strN);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jE - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            c1.f(d2Var);
                            d2Var.z1(str2, "_cmp", (Bundle) pair.second);
                        }
                        aVar.o(null);
                    }
                    c1.e(r0Var);
                    r0Var.U.f(0L);
                    break;
                }
                break;
            case 2:
                d2 d2Var2 = this.f27141d;
                d2Var2.s1();
                c1 c1Var2 = (c1) d2Var2.f1504d;
                r0 r0Var2 = c1Var2.f26888x;
                j0 j0Var2 = c1Var2.f26889y;
                c1.e(r0Var2);
                p0 p0Var = r0Var2.Q;
                if (p0Var.a()) {
                    c1.g(j0Var2);
                    j0Var2.J.b("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    d5.y0 y0Var = r0Var2.R;
                    long jE2 = y0Var.e();
                    y0Var.f(1 + jE2);
                    if (jE2 >= 5) {
                        c1.g(j0Var2);
                        j0Var2.F.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        p0Var.b(true);
                        break;
                    } else {
                        if (d2Var2.Q == null) {
                            d2Var2.Q = new t1(d2Var2, c1Var2, 3);
                        }
                        d2Var2.Q.b(0L);
                        break;
                    }
                }
            default:
                this.f27141d.P1();
                break;
        }
    }
}
