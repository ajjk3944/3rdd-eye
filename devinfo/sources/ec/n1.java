package ec;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f22908a;

    public /* synthetic */ n1(o1 o1Var) {
        this.f22908a = o1Var;
    }

    public void a(Bundle bundle, String str) {
        String string;
        o1 o1Var = this.f22908a;
        l1 l1Var = o1Var.g;
        b1 b1Var = o1Var.f22953e;
        o1.m(l1Var);
        l1Var.B();
        if (o1Var.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        o1.k(b1Var);
        b1Var.f22575x.n(string);
        a1 a1Var = b1Var.f22576y;
        o1Var.f22957k.getClass();
        a1Var.b(System.currentTimeMillis());
    }

    @Override // ec.s2
    public /* synthetic */ void b(String str, int i4, Throwable th2, byte[] bArr, Map map) {
        this.f22908a.i(i4, th2, bArr);
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        o1 o1Var = this.f22908a;
        o1Var.f22957k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b1 b1Var = o1Var.f22953e;
        o1.k(b1Var);
        return jCurrentTimeMillis - b1Var.f22576y.a() > o1Var.f22952d.I(null, d0.f22645k0);
    }

    public boolean d() {
        b1 b1Var = this.f22908a.f22953e;
        o1.k(b1Var);
        return b1Var.f22576y.a() > 0;
    }
}
