package qi;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.f1;
import nk.k;
import pi.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements pi.f {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f32428a = new Handler(Looper.getMainLooper());

    public static void a(g gVar, mk.a aVar) {
        new f1(System.currentTimeMillis(), aVar, gVar).run();
    }

    @Override // pi.f
    public final void b(Context context, cm.g gVar, pi.a aVar) {
        k.e(context, "context");
        k.e(aVar, "adItem");
        g gVar2 = (g) gVar;
        a(gVar2, new a(context, aVar, gVar2, 2));
    }

    @Override // pi.f
    public final void q(Context context, cm.g gVar, pi.a aVar) {
        k.e(context, "context");
        k.e(aVar, "adItem");
        g gVar2 = (g) gVar;
        a(gVar2, new a(context, aVar, gVar2, 1));
    }

    @Override // pi.f
    public final void r(Context context, cm.g gVar, pi.a aVar) {
        k.e(context, "context");
        k.e(aVar, "adItem");
        g gVar2 = (g) gVar;
        a(gVar2, new a(context, aVar, gVar2, 3));
    }

    @Override // pi.f
    public final void s(Context context, cm.g gVar, pi.a aVar) {
        k.e(context, "context");
        k.e(aVar, "adItem");
        g gVar2 = (g) gVar;
        a(gVar2, new a(context, aVar, gVar2, 4));
    }

    @Override // pi.f
    public final void w(Context context, cm.g gVar, pi.a aVar) {
        k.e(context, "context");
        k.e(aVar, "adItem");
        g gVar2 = (g) gVar;
        a(gVar2, new a(context, aVar, gVar2, 0));
    }
}
