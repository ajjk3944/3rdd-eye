package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gy extends px implements TextureView.SurfaceTextureListener, tx {

    /* renamed from: c, reason: collision with root package name */
    public final qz f11634c;

    /* renamed from: d, reason: collision with root package name */
    public final zx f11635d;

    /* renamed from: e, reason: collision with root package name */
    public final yx f11636e;

    /* renamed from: f, reason: collision with root package name */
    public final qd0 f11637f;
    public sx g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f11638h;

    /* renamed from: i, reason: collision with root package name */
    public fz f11639i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String[] f11640k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11641l;

    /* renamed from: m, reason: collision with root package name */
    public int f11642m;

    /* renamed from: n, reason: collision with root package name */
    public xx f11643n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11644o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11645p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11646q;

    /* renamed from: r, reason: collision with root package name */
    public int f11647r;

    /* renamed from: s, reason: collision with root package name */
    public int f11648s;

    /* renamed from: t, reason: collision with root package name */
    public float f11649t;

    public gy(Context context, zx zxVar, qz qzVar, boolean z3, yx yxVar, qd0 qd0Var) {
        super(context);
        this.f11642m = 1;
        this.f11634c = qzVar;
        this.f11635d = zxVar;
        this.f11644o = z3;
        this.f11636e = yxVar;
        zxVar.a(this);
        this.f11637f = qd0Var;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        je.u.B(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void A(int i4) {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            bz bzVar = fzVar.f11295b;
            synchronized (bzVar) {
                bzVar.f9856b = i4 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void B(int i4) {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            bz bzVar = fzVar.f11295b;
            synchronized (bzVar) {
                bzVar.f9857c = i4 * 1000;
            }
        }
    }

    public final boolean C() {
        fz fzVar = this.f11639i;
        return (fzVar == null || fzVar.g == null || this.f11641l) ? false : true;
    }

    public final boolean D() {
        return C() && this.f11642m != 1;
    }

    public final void E(boolean z3, Integer num) {
        fz fzVar = this.f11639i;
        if (fzVar != null && !z3) {
            fzVar.f11308q = num;
            return;
        }
        if (this.j == null || this.f11638h == null) {
            return;
        }
        if (z3) {
            if (!C()) {
                za.i.h("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            ou1 ou1Var = fzVar.g;
            ou1Var.f14807d.d();
            ou1Var.f14806c.H1();
            G();
        }
        if (this.j.startsWith("cache:")) {
            uy uyVarP = this.f11634c.P(this.j);
            if (uyVarP instanceof yy) {
                yy yyVar = (yy) uyVarP;
                synchronized (yyVar) {
                    yyVar.g = true;
                    yyVar.notify();
                }
                fz fzVar2 = yyVar.f18927d;
                fzVar2.j = null;
                yyVar.f18927d = null;
                this.f11639i = fzVar2;
                fzVar2.f11308q = num;
                if (fzVar2.g == null) {
                    za.i.h("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(uyVarP instanceof xy)) {
                    za.i.h("Stream cache miss: ".concat(String.valueOf(this.j)));
                    return;
                }
                xy xyVar = (xy) uyVarP;
                qz qzVar = this.f11634c;
                ua.j.C.f35261c.F(qzVar.getContext(), qzVar.J1().f38129a);
                ByteBuffer byteBufferT = xyVar.t();
                boolean z10 = xyVar.f18572n;
                String str = xyVar.f18564d;
                if (str == null) {
                    za.i.h("Stream cache URL is null.");
                    return;
                }
                yx yxVar = this.f11636e;
                qz qzVar2 = this.f11634c;
                fz fzVar3 = new fz(qzVar2.getContext(), yxVar, qzVar2, num);
                za.i.g("ExoPlayerAdapter initialized.");
                this.f11639i = fzVar3;
                fzVar3.t(new Uri[]{Uri.parse(str)}, byteBufferT, z10);
            }
        } else {
            yx yxVar2 = this.f11636e;
            qz qzVar3 = this.f11634c;
            fz fzVar4 = new fz(qzVar3.getContext(), yxVar2, qzVar3, num);
            za.i.g("ExoPlayerAdapter initialized.");
            this.f11639i = fzVar4;
            qz qzVar4 = this.f11634c;
            ua.j.C.f35261c.F(qzVar4.getContext(), qzVar4.J1().f38129a);
            Uri[] uriArr = new Uri[this.f11640k.length];
            int i4 = 0;
            while (true) {
                String[] strArr = this.f11640k;
                if (i4 >= strArr.length) {
                    break;
                }
                uriArr[i4] = Uri.parse(strArr[i4]);
                i4++;
            }
            fz fzVar5 = this.f11639i;
            fzVar5.getClass();
            fzVar5.t(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f11639i.j = this;
        H(this.f11638h);
        ou1 ou1Var2 = this.f11639i.g;
        if (ou1Var2 != null) {
            int iE1 = ou1Var2.e1();
            this.f11642m = iE1;
            if (iE1 == 3) {
                I();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ay
    public final void E1() {
        ya.f0.f37440l.post(new dy(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void F(int i4) {
        fz fzVar;
        if (this.f11642m != i4) {
            this.f11642m = i4;
            if (i4 == 3) {
                I();
                return;
            }
            if (i4 != 4) {
                return;
            }
            if (this.f11636e.f18913a && (fzVar = this.f11639i) != null) {
                fzVar.r(false);
            }
            this.f11635d.f19223m = false;
            cy cyVar = this.f15133b;
            cyVar.f10256d = false;
            cyVar.a();
            ya.f0.f37440l.post(new dy(this, 2));
        }
    }

    public final void G() {
        if (this.f11639i != null) {
            H(null);
            fz fzVar = this.f11639i;
            if (fzVar != null) {
                fzVar.j = null;
                ou1 ou1Var = fzVar.g;
                if (ou1Var != null) {
                    ou1Var.f14807d.d();
                    ou1Var.f14806c.x1(fzVar);
                    ou1 ou1Var2 = fzVar.g;
                    ou1Var2.f14807d.d();
                    ou1Var2.f14806c.y1();
                    fzVar.g = null;
                    fz.f11293v.decrementAndGet();
                }
                this.f11639i = null;
            }
            this.f11642m = 1;
            this.f11641l = false;
            this.f11645p = false;
            this.f11646q = false;
        }
    }

    public final void H(Surface surface) {
        fz fzVar = this.f11639i;
        if (fzVar == null) {
            za.i.h("Trying to set surface before player is initialized.");
            return;
        }
        try {
            ou1 ou1Var = fzVar.g;
            if (ou1Var != null) {
                ou1Var.f14807d.d();
                it1 it1Var = ou1Var.f14806c;
                it1Var.o0();
                it1Var.V1(surface);
                int i4 = surface == null ? 0 : -1;
                it1Var.W1(i4, i4);
            }
        } catch (IOException e2) {
            za.i.i("", e2);
        }
    }

    public final void I() {
        if (this.f11645p) {
            return;
        }
        this.f11645p = true;
        ya.f0.f37440l.post(new dy(this, 0));
        E1();
        zx zxVar = this.f11635d;
        if (zxVar.f19220i && !zxVar.j) {
            a80.h(zxVar.f19217e, zxVar.f19216d, "vfr2");
            zxVar.j = true;
        }
        if (this.f11646q) {
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void a(int i4) {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            bz bzVar = fzVar.f11295b;
            synchronized (bzVar) {
                bzVar.f9858d = i4 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void b(int i4) {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            bz bzVar = fzVar.f11295b;
            synchronized (bzVar) {
                bzVar.f9859e = i4 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void c(int i4) throws SocketException {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            Iterator it = fzVar.f11311t.iterator();
            while (it.hasNext()) {
                az azVar = (az) ((WeakReference) it.next()).get();
                if (azVar != null) {
                    azVar.f9501r = i4;
                    Iterator it2 = azVar.f9502s.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(azVar.f9501r);
                            } catch (SocketException e2) {
                                za.i.i("Failed to update receive buffer size.", e2);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final String d() {
        return "ExoPlayer/2".concat(true != this.f11644o ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void e(sx sxVar) {
        this.g = sxVar;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void f(String str) {
        if (str != null) {
            z(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void g() {
        if (C()) {
            ou1 ou1Var = this.f11639i.g;
            ou1Var.f14807d.d();
            ou1Var.f14806c.H1();
            G();
        }
        zx zxVar = this.f11635d;
        zxVar.f19223m = false;
        cy cyVar = this.f15133b;
        cyVar.f10256d = false;
        cyVar.a();
        zxVar.b();
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void h() {
        fz fzVar;
        if (!D()) {
            this.f11646q = true;
            return;
        }
        if (this.f11636e.f18913a && (fzVar = this.f11639i) != null) {
            fzVar.r(true);
        }
        ou1 ou1Var = this.f11639i.g;
        ou1Var.f14807d.d();
        ou1Var.f14806c.Y1(true);
        this.f11635d.d();
        cy cyVar = this.f15133b;
        cyVar.f10256d = true;
        cyVar.a();
        this.f15132a.f17376c = true;
        ya.f0.f37440l.post(new dy(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void i() {
        ya.f0.f37440l.post(new dy(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void j(long j, boolean z3) {
        if (this.f11634c != null) {
            fx.f11279f.execute(new fy(this, z3, j, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void k(int i4, int i10) {
        this.f11647r = i4;
        this.f11648s = i10;
        float f10 = i10 > 0 ? i4 / i10 : 1.0f;
        if (this.f11649t != f10) {
            this.f11649t = f10;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void l(String str, Exception exc) {
        fz fzVar;
        String strJ = J(str, exc);
        za.i.h("ExoPlayerAdapter error: ".concat(strJ));
        this.f11641l = true;
        if (this.f11636e.f18913a && (fzVar = this.f11639i) != null) {
            fzVar.r(false);
        }
        ya.f0.f37440l.post(new ey(this, strJ, 1));
        ua.j.C.f35265h.g("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.tx
    public final void m(IOException iOException) {
        String strJ = J("onLoadException", iOException);
        za.i.h("ExoPlayerAdapter exception: ".concat(strJ));
        ua.j.C.f35265h.g("AdExoPlayerView.onException", iOException);
        ya.f0.f37440l.post(new ey(this, strJ, 0));
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void n() {
        fz fzVar;
        if (D()) {
            if (this.f11636e.f18913a && (fzVar = this.f11639i) != null) {
                fzVar.r(false);
            }
            ou1 ou1Var = this.f11639i.g;
            ou1Var.f14807d.d();
            ou1Var.f14806c.Y1(false);
            this.f11635d.f19223m = false;
            cy cyVar = this.f15133b;
            cyVar.f10256d = false;
            cyVar.a();
            ya.f0.f37440l.post(new dy(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int o() {
        if (D()) {
            return (int) this.f11639i.g.v1();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.f11649t;
        if (f10 != 0.0f && this.f11643n == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        xx xxVar = this.f11643n;
        if (xxVar != null) {
            xxVar.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i10) throws InterruptedException {
        fz fzVar;
        float f10;
        int i11;
        SurfaceTexture surfaceTexture2;
        qd0 qd0Var;
        if (this.f11644o) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Ae)).booleanValue() && (qd0Var = this.f11637f) != null) {
                rt rtVarA = qd0Var.a();
                rtVarA.u("action", "svp_aepv");
                rtVarA.v();
            }
            xx xxVar = new xx(getContext());
            this.f11643n = xxVar;
            xxVar.f18547m = i4;
            xxVar.f18546l = i10;
            xxVar.f18549o = surfaceTexture;
            xxVar.start();
            if (xxVar.f18549o == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    xxVar.f18554t.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = xxVar.f18548n;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f11643n.c();
                this.f11643n = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f11638h = surface;
        if (this.f11639i == null) {
            E(false, null);
        } else {
            H(surface);
            if (!this.f11636e.f18913a && (fzVar = this.f11639i) != null) {
                fzVar.r(true);
            }
        }
        int i12 = this.f11647r;
        if (i12 == 0 || (i11 = this.f11648s) == 0) {
            f10 = i10 > 0 ? i4 / i10 : 1.0f;
            if (this.f11649t != f10) {
                this.f11649t = f10;
                requestLayout();
            }
        } else {
            f10 = i11 > 0 ? i12 / i11 : 1.0f;
            if (this.f11649t != f10) {
                this.f11649t = f10;
                requestLayout();
            }
        }
        ya.f0.f37440l.post(new dy(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n();
        xx xxVar = this.f11643n;
        if (xxVar != null) {
            xxVar.c();
            this.f11643n = null;
        }
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            if (fzVar != null) {
                fzVar.r(false);
            }
            Surface surface = this.f11638h;
            if (surface != null) {
                surface.release();
            }
            this.f11638h = null;
            H(null);
        }
        ya.f0.f37440l.post(new dy(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i10) {
        xx xxVar = this.f11643n;
        if (xxVar != null) {
            xxVar.b(i4, i10);
        }
        ya.f0.f37440l.post(new mx(this, i4, i10, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f11635d.c(this);
        this.f15132a.a(surfaceTexture, this.g);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i4);
        ya.a0.m(sb2.toString());
        ya.f0.f37440l.post(new b4.a(this, i4, 6));
        super.onWindowVisibilityChanged(i4);
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int p() {
        if (D()) {
            return (int) this.f11639i.g.q1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void q(int i4) {
        if (D()) {
            long j = i4;
            ou1 ou1Var = this.f11639i.g;
            ou1Var.L(ou1Var.o1(), j);
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void r(float f10, float f11) {
        xx xxVar = this.f11643n;
        if (xxVar != null) {
            xxVar.d(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int s() {
        return this.f11647r;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int t() {
        return this.f11648s;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long u() {
        fz fzVar = this.f11639i;
        if (fzVar == null) {
            return -1L;
        }
        if (fzVar.f11310s == null || !fzVar.f11310s.f10272p) {
            return fzVar.f11302k;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long v() {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            return fzVar.p();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long w() {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            return fzVar.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int x() {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            return fzVar.f11303l;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final Integer y() {
        fz fzVar = this.f11639i;
        if (fzVar != null) {
            return fzVar.f11308q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void z(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f11640k = new String[]{str};
        } else {
            this.f11640k = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.j;
        boolean z3 = false;
        if (this.f11636e.f18921k && str2 != null && !str.equals(str2) && this.f11642m == 4) {
            z3 = true;
        }
        this.j = str;
        E(z3, num);
    }
}
