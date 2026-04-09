package b5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements h {
    public h B;
    public d0 D;
    public f E;
    public z F;
    public h G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2451a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2452d;

    /* renamed from: g, reason: collision with root package name */
    public final h f2453g;

    /* renamed from: r, reason: collision with root package name */
    public s f2454r;

    /* renamed from: x, reason: collision with root package name */
    public b f2455x;

    /* renamed from: y, reason: collision with root package name */
    public e f2456y;

    public l(Context context, h hVar) {
        this.f2451a = context.getApplicationContext();
        hVar.getClass();
        this.f2453g = hVar;
        this.f2452d = new ArrayList();
    }

    public static void e(h hVar, b0 b0Var) {
        if (hVar != null) {
            hVar.w(b0Var);
        }
    }

    public final void a(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2452d;
            if (i10 >= arrayList.size()) {
                return;
            }
            hVar.w((b0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // b5.h
    public final void close() {
        h hVar = this.G;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.G = null;
            }
        }
    }

    @Override // b5.h
    public final Map k() {
        h hVar = this.G;
        return hVar == null ? Collections.EMPTY_MAP : hVar.k();
    }

    @Override // b5.h
    public final Uri o() {
        h hVar = this.G;
        if (hVar == null) {
            return null;
        }
        return hVar.o();
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.G;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }

    @Override // b5.h
    public final long t(k kVar) {
        a5.a.i(this.G == null);
        Uri uri = kVar.f2443a;
        String scheme = uri.getScheme();
        int i10 = a5.d0.f105a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f2451a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f2454r == null) {
                    s sVar = new s(false);
                    this.f2454r = sVar;
                    a(sVar);
                }
                this.G = this.f2454r;
            } else {
                if (this.f2455x == null) {
                    b bVar = new b(context);
                    this.f2455x = bVar;
                    a(bVar);
                }
                this.G = this.f2455x;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f2455x == null) {
                b bVar2 = new b(context);
                this.f2455x = bVar2;
                a(bVar2);
            }
            this.G = this.f2455x;
        } else if ("content".equals(scheme)) {
            if (this.f2456y == null) {
                e eVar = new e(context);
                this.f2456y = eVar;
                a(eVar);
            }
            this.G = this.f2456y;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f2453g;
            if (zEquals) {
                if (this.B == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.B = hVar2;
                        a(hVar2);
                    } catch (ClassNotFoundException unused) {
                        a5.a.B("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating RTMP extension", e4);
                    }
                    if (this.B == null) {
                        this.B = hVar;
                    }
                }
                this.G = this.B;
            } else if ("udp".equals(scheme)) {
                if (this.D == null) {
                    d0 d0Var = new d0();
                    this.D = d0Var;
                    a(d0Var);
                }
                this.G = this.D;
            } else if ("data".equals(scheme)) {
                if (this.E == null) {
                    f fVar = new f(false);
                    this.E = fVar;
                    a(fVar);
                }
                this.G = this.E;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.F == null) {
                    z zVar = new z(context);
                    this.F = zVar;
                    a(zVar);
                }
                this.G = this.F;
            } else {
                this.G = hVar;
            }
        }
        return this.G.t(kVar);
    }

    @Override // b5.h
    public final void w(b0 b0Var) {
        b0Var.getClass();
        this.f2453g.w(b0Var);
        this.f2452d.add(b0Var);
        e(this.f2454r, b0Var);
        e(this.f2455x, b0Var);
        e(this.f2456y, b0Var);
        e(this.B, b0Var);
        e(this.D, b0Var);
        e(this.E, b0Var);
        e(this.F, b0Var);
    }
}
