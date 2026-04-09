package pb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements n {
    public n B;
    public v0 D;
    public l E;
    public s0 F;
    public n G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20417a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20418d;

    /* renamed from: g, reason: collision with root package name */
    public final n f20419g;

    /* renamed from: r, reason: collision with root package name */
    public x f20420r;

    /* renamed from: x, reason: collision with root package name */
    public d f20421x;

    /* renamed from: y, reason: collision with root package name */
    public j f20422y;

    public s(Context context, n nVar) {
        this.f20417a = context.getApplicationContext();
        nVar.getClass();
        this.f20419g = nVar;
        this.f20418d = new ArrayList();
    }

    public static void e(n nVar, u0 u0Var) {
        if (nVar != null) {
            nVar.s(u0Var);
        }
    }

    public final void a(n nVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f20418d;
            if (i10 >= arrayList.size()) {
                return;
            }
            nVar.s((u0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // pb.n
    public final void close() {
        n nVar = this.G;
        if (nVar != null) {
            try {
                nVar.close();
            } finally {
                this.G = null;
            }
        }
    }

    @Override // pb.n
    public final Map k() {
        n nVar = this.G;
        return nVar == null ? Collections.EMPTY_MAP : nVar.k();
    }

    @Override // pb.n
    public final Uri o() {
        n nVar = this.G;
        if (nVar == null) {
            return null;
        }
        return nVar.o();
    }

    @Override // pb.n
    public final long q(na.c cVar) {
        qb.b.j(this.G == null);
        Uri uri = (Uri) cVar.f17422f;
        String scheme = uri.getScheme();
        int i10 = qb.v.f20828a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f20417a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f20420r == null) {
                    x xVar = new x(false);
                    this.f20420r = xVar;
                    a(xVar);
                }
                this.G = this.f20420r;
            } else {
                if (this.f20421x == null) {
                    d dVar = new d(context);
                    this.f20421x = dVar;
                    a(dVar);
                }
                this.G = this.f20421x;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f20421x == null) {
                d dVar2 = new d(context);
                this.f20421x = dVar2;
                a(dVar2);
            }
            this.G = this.f20421x;
        } else if ("content".equals(scheme)) {
            if (this.f20422y == null) {
                j jVar = new j(context);
                this.f20422y = jVar;
                a(jVar);
            }
            this.G = this.f20422y;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            n nVar = this.f20419g;
            if (zEquals) {
                if (this.B == null) {
                    try {
                        n nVar2 = (n) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.B = nVar2;
                        a(nVar2);
                    } catch (ClassNotFoundException unused) {
                        io.sentry.android.core.e0.p("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating RTMP extension", e4);
                    }
                    if (this.B == null) {
                        this.B = nVar;
                    }
                }
                this.G = this.B;
            } else if ("udp".equals(scheme)) {
                if (this.D == null) {
                    v0 v0Var = new v0();
                    this.D = v0Var;
                    a(v0Var);
                }
                this.G = this.D;
            } else if ("data".equals(scheme)) {
                if (this.E == null) {
                    l lVar = new l(false);
                    this.E = lVar;
                    a(lVar);
                }
                this.G = this.E;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.F == null) {
                    s0 s0Var = new s0(context);
                    this.F = s0Var;
                    a(s0Var);
                }
                this.G = this.F;
            } else {
                this.G = nVar;
            }
        }
        return this.G.q(cVar);
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) {
        n nVar = this.G;
        nVar.getClass();
        return nVar.read(bArr, i10, i11);
    }

    @Override // pb.n
    public final void s(u0 u0Var) {
        u0Var.getClass();
        this.f20419g.s(u0Var);
        this.f20418d.add(u0Var);
        e(this.f20420r, u0Var);
        e(this.f20421x, u0Var);
        e(this.f20422y, u0Var);
        e(this.B, u0Var);
        e(this.D, u0Var);
        e(this.E, u0Var);
        e(this.F, u0Var);
    }
}
