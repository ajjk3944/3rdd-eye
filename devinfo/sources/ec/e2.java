package ec;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f22699b;

    public /* synthetic */ e2(q2 q2Var, int i4) {
        this.f22698a = i4;
        this.f22699b = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22698a) {
            case 0:
                this.f22699b.Y();
                break;
            case 1:
                n1 n1Var = this.f22699b.f23022s;
                o1 o1Var = n1Var.f22908a;
                l1 l1Var = o1Var.g;
                q2 q2Var = o1Var.f22959m;
                b1 b1Var = o1Var.f22953e;
                o1.m(l1Var);
                l1Var.B();
                if (n1Var.d()) {
                    if (n1Var.c()) {
                        o1.k(b1Var);
                        b1Var.f22575x.n(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        o1.l(q2Var);
                        q2Var.I("auto", "_cmpx", bundle);
                    } else {
                        o1.k(b1Var);
                        b5.i0 i0Var = b1Var.f22575x;
                        String strK = i0Var.k();
                        if (TextUtils.isEmpty(strK)) {
                            s0 s0Var = o1Var.f22954f;
                            o1.m(s0Var);
                            s0Var.f23054h.d("Cache still valid but referrer not found");
                        } else {
                            long jA = b1Var.f22576y.a() / 3600000;
                            Uri uri = Uri.parse(strK);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            o1.l(q2Var);
                            q2Var.I(str2, "_cmp", (Bundle) pair.second);
                        }
                        i0Var.n(null);
                    }
                    o1.k(b1Var);
                    b1Var.f22576y.b(0L);
                    break;
                }
                break;
            case 2:
                q2 q2Var2 = this.f22699b;
                q2Var2.B();
                o1 o1Var2 = (o1) q2Var2.f218b;
                b1 b1Var2 = o1Var2.f22953e;
                s0 s0Var2 = o1Var2.f22954f;
                o1.k(b1Var2);
                z0 z0Var = b1Var2.f22572u;
                if (z0Var.a()) {
                    o1.m(s0Var2);
                    s0Var2.f23059n.d("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    a1 a1Var = b1Var2.f22573v;
                    long jA2 = a1Var.a();
                    a1Var.b(1 + jA2);
                    if (jA2 >= 5) {
                        o1.m(s0Var2);
                        s0Var2.j.d("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        z0Var.b(true);
                        break;
                    } else {
                        if (q2Var2.f23024u == null) {
                            q2Var2.f23024u = new f2(q2Var2, o1Var2, 3);
                        }
                        q2Var2.f23024u.b(0L);
                        break;
                    }
                }
            default:
                this.f22699b.Y();
                break;
        }
    }
}
