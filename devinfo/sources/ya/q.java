package ya;

import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.ha;
import com.google.android.gms.internal.ads.ls;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends ha {

    /* renamed from: m, reason: collision with root package name */
    public final gx f37483m;

    /* renamed from: n, reason: collision with root package name */
    public final za.f f37484n;

    public q(String str, gx gxVar) throws IOException {
        super(0, str, new km.y(28, gxVar));
        this.f37483m = gxVar;
        za.f fVar = new za.f();
        this.f37484n = fVar;
        if (za.f.c()) {
            fVar.e("onNetworkRequest", new se.b(str, "GET", null, null));
        }
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final b5.i0 i(fa faVar) {
        return new b5.i0(faVar, ls.e(faVar));
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void j(Object obj) throws IOException {
        fa faVar = (fa) obj;
        Map map = faVar.f11076c;
        int i4 = faVar.f11074a;
        za.f fVar = this.f37484n;
        fVar.getClass();
        if (za.f.c()) {
            fVar.e("onNetworkResponse", new t7.m(i4, map, 23));
            if (i4 < 200 || i4 >= 300) {
                fVar.e("onNetworkRequestError", new gb.a((String) null));
            }
        }
        byte[] bArr = faVar.f11075b;
        if (za.f.c() && bArr != null) {
            fVar.e("onNetworkResponseBody", new nm.d0(24, bArr));
        }
        this.f37483m.b(faVar);
    }
}
