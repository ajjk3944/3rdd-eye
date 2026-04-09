package ca;

import android.content.Context;
import android.net.ConnectivityManager;
import da.a0;
import da.b0;
import da.c0;
import da.e0;
import da.f;
import da.f0;
import da.g;
import da.h;
import da.i;
import da.i0;
import da.j;
import da.k;
import da.l;
import da.m;
import da.n;
import da.o;
import da.p;
import da.q;
import da.r;
import da.s;
import da.t;
import da.v;
import da.w;
import da.y;
import fa.e;
import java.net.MalformedURLException;
import java.net.URL;
import je.u;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f2832a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f2833b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2834c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f2835d;

    /* renamed from: e, reason: collision with root package name */
    public final na.a f2836e;

    /* renamed from: f, reason: collision with root package name */
    public final na.a f2837f;
    public final int g;

    public d(Context context, na.a aVar, na.a aVar2) {
        ye.d dVar = new ye.d();
        da.c cVar = da.c.f22099a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f22126a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        da.d dVar2 = da.d.f22101a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        da.b bVar = da.b.f22088a;
        dVar.a(da.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.f22118a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        da.e eVar = da.e.f22104a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        h hVar = h.f22114a;
        dVar.a(da.d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.f22110a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f22135a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.f22107a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f37580d = true;
        this.f2832a = new d0(22, dVar);
        this.f2834c = context;
        this.f2833b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2835d = b(a.f2820c);
        this.f2836e = aVar2;
        this.f2837f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(u.t("Invalid url: ", str), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ea.h a(ea.h r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.d.a(ea.h):ea.h");
    }
}
