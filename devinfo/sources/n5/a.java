package n5;

import al.p;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import l5.b;
import nk.k;
import p5.c;
import p5.e;
import p5.f;
import p5.g;
import u6.t;
import xk.g0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final t f29765a;

    public a(t tVar) {
        this.f29765a = tVar;
    }

    public static final a b(Context context) {
        t cVar;
        Object objInvoke;
        k.e(context, "context");
        StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
        int i4 = Build.VERSION.SDK_INT;
        b bVar = b.f28590a;
        sb2.append(i4 >= 33 ? bVar.a() : 0);
        Log.d("MeasurementManager", sb2.toString());
        if ((i4 >= 33 ? bVar.a() : 0) >= 5) {
            cVar = new c(context, 1);
        } else {
            l5.a aVar = l5.a.f28589a;
            if (((i4 == 31 || i4 == 32) ? aVar.a() : 0) >= 9) {
                try {
                    objInvoke = new p5.b(context, 0).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i10 = Build.VERSION.SDK_INT;
                    sb3.append((i10 == 31 || i10 == 32) ? aVar.a() : 0);
                    Log.d("MeasurementManager", sb3.toString());
                    objInvoke = null;
                }
                cVar = (t) objInvoke;
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            return new a(cVar);
        }
        return null;
    }

    public vd.b a(p5.a aVar) {
        k.e(aVar, "deletionRequest");
        throw null;
    }

    public vd.b c() {
        return t.b(x.e(x.b(g0.f37189a), new al.k(this, null, 11)));
    }

    public vd.b d(Uri uri, InputEvent inputEvent) {
        k.e(uri, "attributionSource");
        return t.b(x.e(x.b(g0.f37189a), new bh.t(this, uri, inputEvent, null, 17)));
    }

    public vd.b e(e eVar) {
        k.e(eVar, "request");
        throw null;
    }

    public vd.b f(Uri uri) {
        k.e(uri, "trigger");
        return t.b(x.e(x.b(g0.f37189a), new p(this, uri, null, 23)));
    }

    public vd.b g(f fVar) {
        k.e(fVar, "request");
        throw null;
    }

    public vd.b h(g gVar) {
        k.e(gVar, "request");
        throw null;
    }
}
