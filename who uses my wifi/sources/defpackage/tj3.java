package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tj3 implements th3 {
    public final Context f;
    public final ArrayList g = new ArrayList();
    public final bl3 h;
    public fm3 i;
    public jd3 j;
    public xf3 k;
    public th3 l;
    public ut3 m;
    public ig3 n;
    public xf3 o;
    public th3 p;

    public tj3(Context context, bl3 bl3Var) {
        this.f = context.getApplicationContext();
        this.h = bl3Var;
    }

    public static final void e(th3 th3Var, ws3 ws3Var) {
        if (th3Var != null) {
            th3Var.b(ws3Var);
        }
    }

    @Override // defpackage.th3
    public final long a(ij3 ij3Var) {
        zt0.b0(this.p == null);
        Uri uri = ij3Var.a;
        String scheme = uri.getScheme();
        String str = v23.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.i == null) {
                    fm3 fm3Var = new fm3(false);
                    this.i = fm3Var;
                    c(fm3Var);
                }
                this.p = this.i;
            } else {
                if (this.j == null) {
                    jd3 jd3Var = new jd3(context);
                    this.j = jd3Var;
                    c(jd3Var);
                }
                this.p = this.j;
            }
        } else if ("asset".equals(scheme)) {
            if (this.j == null) {
                jd3 jd3Var2 = new jd3(context);
                this.j = jd3Var2;
                c(jd3Var2);
            }
            this.p = this.j;
        } else if ("content".equals(scheme)) {
            if (this.k == null) {
                xf3 xf3Var = new xf3(context, 0);
                this.k = xf3Var;
                c(xf3Var);
            }
            this.p = this.k;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            bl3 bl3Var = this.h;
            if (zEquals) {
                if (this.l == null) {
                    try {
                        th3 th3Var = (th3) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.l = th3Var;
                        c(th3Var);
                    } catch (ClassNotFoundException unused) {
                        a30.x("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.l == null) {
                        this.l = bl3Var;
                    }
                }
                this.p = this.l;
            } else if ("udp".equals(scheme)) {
                if (this.m == null) {
                    ut3 ut3Var = new ut3();
                    this.m = ut3Var;
                    c(ut3Var);
                }
                this.p = this.m;
            } else if ("data".equals(scheme)) {
                if (this.n == null) {
                    ig3 ig3Var = new ig3(false);
                    this.n = ig3Var;
                    c(ig3Var);
                }
                this.p = this.n;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.o == null) {
                    xf3 xf3Var2 = new xf3(context, 1);
                    this.o = xf3Var2;
                    c(xf3Var2);
                }
                this.p = this.o;
            } else {
                this.p = bl3Var;
            }
        }
        return this.p.a(ij3Var);
    }

    @Override // defpackage.th3
    public final void b(ws3 ws3Var) {
        ws3Var.getClass();
        this.h.b(ws3Var);
        this.g.add(ws3Var);
        e(this.i, ws3Var);
        e(this.j, ws3Var);
        e(this.k, ws3Var);
        e(this.l, ws3Var);
        e(this.m, ws3Var);
        e(this.n, ws3Var);
        e(this.o, ws3Var);
    }

    public final void c(th3 th3Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            th3Var.b((ws3) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ua4
    public final int d(byte[] bArr, int i, int i2) {
        th3 th3Var = this.p;
        th3Var.getClass();
        return th3Var.d(bArr, i, i2);
    }

    @Override // defpackage.th3
    public final Map g() {
        th3 th3Var = this.p;
        return th3Var == null ? Collections.EMPTY_MAP : th3Var.g();
    }

    @Override // defpackage.th3
    public final Uri h() {
        th3 th3Var = this.p;
        if (th3Var == null) {
            return null;
        }
        return th3Var.h();
    }

    @Override // defpackage.th3
    public final void l() {
        th3 th3Var = this.p;
        if (th3Var != null) {
            try {
                th3Var.l();
            } finally {
                this.p = null;
            }
        }
    }
}
