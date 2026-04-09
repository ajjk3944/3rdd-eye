package t2;

import com.google.android.gms.internal.ads.A4;
import com.google.android.gms.internal.ads.AbstractC2022vd;
import com.google.android.gms.internal.ads.C0657Of;
import com.google.android.gms.internal.ads.C4;
import h0.C2352b;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class t extends C4 {

    /* renamed from: m, reason: collision with root package name */
    public final C0657Of f23655m;

    /* renamed from: n, reason: collision with root package name */
    public final u2.h f23656n;

    public t(String str, C0657Of c0657Of) throws IOException {
        super(0, str, new C2352b(13, c0657Of));
        this.f23655m = c0657Of;
        u2.h hVar = new u2.h();
        this.f23656n = hVar;
        if (u2.h.c()) {
            Object obj = null;
            hVar.e("onNetworkRequest", new c1.g(str, "GET", obj, obj, 26));
        }
    }

    @Override // com.google.android.gms.internal.ads.C4
    public final A1.s i(A4 a42) {
        return new A1.s(a42, AbstractC2022vd.c(a42));
    }

    @Override // com.google.android.gms.internal.ads.C4
    public final void j(Object obj) throws IOException {
        A4 a42 = (A4) obj;
        Map map = a42.f6928c;
        int i = a42.f6926a;
        u2.h hVar = this.f23656n;
        hVar.getClass();
        if (u2.h.c()) {
            hVar.e("onNetworkResponse", new L2.w(i, map));
            if (i < 200 || i >= 300) {
                hVar.e("onNetworkRequestError", new B2.a(null, 7));
            }
        }
        byte[] bArr = a42.f6927b;
        if (u2.h.c() && bArr != null) {
            hVar.e("onNetworkResponseBody", new h2.d(bArr));
        }
        this.f23655m.b(a42);
    }
}
