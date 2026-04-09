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
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC1648og extends AbstractC0827Yf implements TextureView.SurfaceTextureListener, InterfaceC1000cg {

    /* renamed from: C, reason: collision with root package name */
    public final boolean f15971C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f15972D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f15973E;

    /* renamed from: F, reason: collision with root package name */
    public int f15974F;

    /* renamed from: G, reason: collision with root package name */
    public int f15975G;

    /* renamed from: H, reason: collision with root package name */
    public float f15976H;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0828Yg f15977c;

    /* renamed from: d, reason: collision with root package name */
    public final C1325ig f15978d;

    /* renamed from: e, reason: collision with root package name */
    public final C1272hg f15979e;

    /* renamed from: f, reason: collision with root package name */
    public final C0784Vn f15980f;

    /* renamed from: g, reason: collision with root package name */
    public C0946bg f15981g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f15982h;
    public C0641Ng i;

    /* renamed from: j, reason: collision with root package name */
    public String f15983j;

    /* renamed from: k, reason: collision with root package name */
    public String[] f15984k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15985l;

    /* renamed from: m, reason: collision with root package name */
    public int f15986m;

    /* renamed from: n, reason: collision with root package name */
    public C1218gg f15987n;

    public TextureViewSurfaceTextureListenerC1648og(Context context, C1325ig c1325ig, InterfaceC0828Yg interfaceC0828Yg, boolean z6, C1272hg c1272hg, C0784Vn c0784Vn) {
        super(context);
        this.f15986m = 1;
        this.f15977c = interfaceC0828Yg;
        this.f15978d = c1325ig;
        this.f15971C = z6;
        this.f15979e = c1272hg;
        c1325ig.a(this);
        this.f15980f = c0784Vn;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        A.f.w(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f15984k = new String[]{str};
        } else {
            this.f15984k = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f15983j;
        boolean z6 = false;
        if (this.f15979e.f14528k && str2 != null && !str.equals(str2) && this.f15986m == 4) {
            z6 = true;
        }
        this.f15983j = str;
        F(z6, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void B(int i) {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            C0573Jg c0573Jg = c0641Ng.f10021b;
            synchronized (c0573Jg) {
                c0573Jg.f9327b = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void C(int i) {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            C0573Jg c0573Jg = c0641Ng.f10021b;
            synchronized (c0573Jg) {
                c0573Jg.f9328c = i * 1000;
            }
        }
    }

    public final boolean D() {
        C0641Ng c0641Ng = this.i;
        return (c0641Ng == null || c0641Ng.f10026g == null || this.f15985l) ? false : true;
    }

    public final boolean E() {
        return D() && this.f15986m != 1;
    }

    public final void F(boolean z6, Integer num) {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null && !z6) {
            c0641Ng.f10016E = num;
            return;
        }
        if (this.f15983j == null || this.f15982h == null) {
            return;
        }
        if (z6) {
            if (!D()) {
                u2.k.h("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            C2232zO c2232zO = c0641Ng.f10026g;
            c2232zO.f17873d.d();
            c2232zO.f17872c.p();
            G();
        }
        if (this.f15983j.startsWith("cache:")) {
            AbstractC0454Cg abstractC0454CgY0 = this.f15977c.Y0(this.f15983j);
            if (abstractC0454CgY0 instanceof C0522Gg) {
                C0522Gg c0522Gg = (C0522Gg) abstractC0454CgY0;
                synchronized (c0522Gg) {
                    c0522Gg.f8414g = true;
                    c0522Gg.notify();
                }
                C0641Ng c0641Ng2 = c0522Gg.f8411d;
                c0641Ng2.f10028j = null;
                c0522Gg.f8411d = null;
                this.i = c0641Ng2;
                c0641Ng2.f10016E = num;
                if (c0641Ng2.f10026g == null) {
                    u2.k.h("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC0454CgY0 instanceof C0505Fg)) {
                    u2.k.h("Stream cache miss: ".concat(String.valueOf(this.f15983j)));
                    return;
                }
                C0505Fg c0505Fg = (C0505Fg) abstractC0454CgY0;
                InterfaceC0828Yg interfaceC0828Yg = this.f15977c;
                p2.j.f22785C.f22790c.F(interfaceC0828Yg.getContext(), interfaceC0828Yg.r().f23784a);
                ByteBuffer byteBufferO = c0505Fg.o();
                boolean z7 = c0505Fg.f8156n;
                String str = c0505Fg.f8147d;
                if (str == null) {
                    u2.k.h("Stream cache URL is null.");
                    return;
                }
                C1272hg c1272hg = this.f15979e;
                InterfaceC0828Yg interfaceC0828Yg2 = this.f15977c;
                C0641Ng c0641Ng3 = new C0641Ng(interfaceC0828Yg2.getContext(), c1272hg, interfaceC0828Yg2, num);
                u2.k.g("ExoPlayerAdapter initialized.");
                this.i = c0641Ng3;
                c0641Ng3.u(new Uri[]{Uri.parse(str)}, byteBufferO, z7);
            }
        } else {
            C1272hg c1272hg2 = this.f15979e;
            InterfaceC0828Yg interfaceC0828Yg3 = this.f15977c;
            C0641Ng c0641Ng4 = new C0641Ng(interfaceC0828Yg3.getContext(), c1272hg2, interfaceC0828Yg3, num);
            u2.k.g("ExoPlayerAdapter initialized.");
            this.i = c0641Ng4;
            InterfaceC0828Yg interfaceC0828Yg4 = this.f15977c;
            p2.j.f22785C.f22790c.F(interfaceC0828Yg4.getContext(), interfaceC0828Yg4.r().f23784a);
            Uri[] uriArr = new Uri[this.f15984k.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f15984k;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            C0641Ng c0641Ng5 = this.i;
            c0641Ng5.getClass();
            c0641Ng5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.i.f10028j = this;
        H(this.f15982h);
        C2232zO c2232zO2 = this.i.f10026g;
        if (c2232zO2 != null) {
            int iR1 = c2232zO2.r1();
            this.f15986m = iR1;
            if (iR1 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.i != null) {
            H(null);
            C0641Ng c0641Ng = this.i;
            if (c0641Ng != null) {
                c0641Ng.f10028j = null;
                C2232zO c2232zO = c0641Ng.f10026g;
                if (c2232zO != null) {
                    c2232zO.f17873d.d();
                    c2232zO.f17872c.J1(c0641Ng);
                    C2232zO c2232zO2 = c0641Ng.f10026g;
                    c2232zO2.f17873d.d();
                    c2232zO2.f17872c.L1();
                    c0641Ng.f10026g = null;
                    C0641Ng.f10013J.decrementAndGet();
                }
                this.i = null;
            }
            this.f15986m = 1;
            this.f15985l = false;
            this.f15972D = false;
            this.f15973E = false;
        }
    }

    public final void H(Surface surface) {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng == null) {
            u2.k.h("Trying to set surface before player is initialized.");
            return;
        }
        try {
            C2232zO c2232zO = c0641Ng.f10026g;
            if (c2232zO != null) {
                c2232zO.f17873d.d();
                UN un = c2232zO.f17872c;
                un.A0();
                un.X1(surface);
                int i = surface == null ? 0 : -1;
                un.Y1(i, i);
            }
        } catch (IOException e6) {
            u2.k.i("", e6);
        }
    }

    public final void I() {
        if (this.f15972D) {
            return;
        }
        this.f15972D = true;
        C2911G.f23576l.post(new RunnableC1486lg(this, 0));
        l();
        C1325ig c1325ig = this.f15978d;
        if (c1325ig.i && !c1325ig.f14741j) {
            AbstractC0933bL.g(c1325ig.f14737e, c1325ig.f14736d, "vfr2");
            c1325ig.f14741j = true;
        }
        if (this.f15973E) {
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void U(int i) {
        C0641Ng c0641Ng;
        if (this.f15986m != i) {
            this.f15986m = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f15979e.f14519a && (c0641Ng = this.i) != null) {
                c0641Ng.s(false);
            }
            this.f15978d.f14744m = false;
            C1432kg c1432kg = this.f12647b;
            c1432kg.f15180d = false;
            c1432kg.a();
            C2911G.f23576l.post(new RunnableC1486lg(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void a(int i) {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            C0573Jg c0573Jg = c0641Ng.f10021b;
            synchronized (c0573Jg) {
                c0573Jg.f9329d = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void b(int i) {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            C0573Jg c0573Jg = c0641Ng.f10021b;
            synchronized (c0573Jg) {
                c0573Jg.f9330e = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void c(int i) throws SocketException {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            Iterator it = c0641Ng.f10019H.iterator();
            while (it.hasNext()) {
                C0556Ig c0556Ig = (C0556Ig) ((WeakReference) it.next()).get();
                if (c0556Ig != null) {
                    c0556Ig.f9126F = i;
                    Iterator it2 = c0556Ig.f9127G.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c0556Ig.f9126F);
                            } catch (SocketException e6) {
                                u2.k.i("Failed to update receive buffer size.", e6);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final String d() {
        return "ExoPlayer/2".concat(true != this.f15971C ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void e(C0946bg c0946bg) {
        this.f15981g = c0946bg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void g() {
        if (D()) {
            C2232zO c2232zO = this.i.f10026g;
            c2232zO.f17873d.d();
            c2232zO.f17872c.p();
            G();
        }
        C1325ig c1325ig = this.f15978d;
        c1325ig.f14744m = false;
        C1432kg c1432kg = this.f12647b;
        c1432kg.f15180d = false;
        c1432kg.a();
        c1325ig.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void h() {
        C0641Ng c0641Ng;
        if (!E()) {
            this.f15973E = true;
            return;
        }
        if (this.f15979e.f14519a && (c0641Ng = this.i) != null) {
            c0641Ng.s(true);
        }
        C2232zO c2232zO = this.i.f10026g;
        c2232zO.f17873d.d();
        c2232zO.f17872c.a2(true);
        this.f15978d.d();
        C1432kg c1432kg = this.f12647b;
        c1432kg.f15180d = true;
        c1432kg.a();
        this.f12646a.f13790c = true;
        C2911G.f23576l.post(new RunnableC1486lg(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void i() {
        C0641Ng c0641Ng;
        if (E()) {
            if (this.f15979e.f14519a && (c0641Ng = this.i) != null) {
                c0641Ng.s(false);
            }
            C2232zO c2232zO = this.i.f10026g;
            c2232zO.f17873d.d();
            c2232zO.f17872c.a2(false);
            this.f15978d.f14744m = false;
            C1432kg c1432kg = this.f12647b;
            c1432kg.f15180d = false;
            c1432kg.a();
            C2911G.f23576l.post(new RunnableC1486lg(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int j() {
        if (E()) {
            return (int) this.i.f10026g.H1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int k() {
        if (E()) {
            return (int) this.i.f10026g.D1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1378jg
    public final void l() {
        C2911G.f23576l.post(new RunnableC1486lg(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void m(int i) {
        if (E()) {
            long j6 = i;
            C2232zO c2232zO = this.i.f10026g;
            c2232zO.X(c2232zO.B1(), j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void n(float f2, float f5) {
        C1218gg c1218gg = this.f15987n;
        if (c1218gg != null) {
            c1218gg.d(f2, f5);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int o() {
        return this.f15974F;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.f15976H;
        if (f2 != 0.0f && this.f15987n == null) {
            float f5 = measuredWidth;
            float f6 = f5 / measuredHeight;
            if (f2 > f6) {
                measuredHeight = (int) (f5 / f2);
            }
            if (f2 < f6) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C1218gg c1218gg = this.f15987n;
        if (c1218gg != null) {
            c1218gg.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i3) throws InterruptedException {
        C0641Ng c0641Ng;
        float f2;
        int i6;
        SurfaceTexture surfaceTexture2;
        C0784Vn c0784Vn;
        if (this.f15971C) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.ye)).booleanValue() && (c0784Vn = this.f15980f) != null) {
                C0697Ql c0697QlA = c0784Vn.a();
                c0697QlA.r("action", "svp_aepv");
                c0697QlA.s();
            }
            C1218gg c1218gg = new C1218gg(getContext());
            this.f15987n = c1218gg;
            c1218gg.f14360m = i;
            c1218gg.f14359l = i3;
            c1218gg.f14337C = surfaceTexture;
            c1218gg.start();
            if (c1218gg.f14337C == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c1218gg.f14342H.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c1218gg.f14361n;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f15987n.c();
                this.f15987n = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f15982h = surface;
        if (this.i == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f15979e.f14519a && (c0641Ng = this.i) != null) {
                c0641Ng.s(true);
            }
        }
        int i7 = this.f15974F;
        if (i7 == 0 || (i6 = this.f15975G) == 0) {
            f2 = i3 > 0 ? i / i3 : 1.0f;
            if (this.f15976H != f2) {
                this.f15976H = f2;
                requestLayout();
            }
        } else {
            f2 = i6 > 0 ? i7 / i6 : 1.0f;
            if (this.f15976H != f2) {
                this.f15976H = f2;
                requestLayout();
            }
        }
        C2911G.f23576l.post(new RunnableC1486lg(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        C1218gg c1218gg = this.f15987n;
        if (c1218gg != null) {
            c1218gg.c();
            this.f15987n = null;
        }
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            if (c0641Ng != null) {
                c0641Ng.s(false);
            }
            Surface surface = this.f15982h;
            if (surface != null) {
                surface.release();
            }
            this.f15982h = null;
            H(null);
        }
        C2911G.f23576l.post(new RunnableC1486lg(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i3) {
        C1218gg c1218gg = this.f15987n;
        if (c1218gg != null) {
            c1218gg.b(i, i3);
        }
        C2911G.f23576l.post(new RunnableC0759Uf(this, i, i3, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f15978d.c(this);
        this.f12646a.a(surfaceTexture, this.f15981g);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        AbstractC2907C.m(sb.toString());
        C2911G.f23576l.post(new A3.h(i, 9, this));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int p() {
        return this.f15975G;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long q() {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng == null) {
            return -1L;
        }
        if (c0641Ng.f10018G == null || !c0641Ng.f10018G.f9498D) {
            return c0641Ng.f10029k;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long r() {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            return c0641Ng.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long s() {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            return c0641Ng.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void t() {
        C2911G.f23576l.post(new RunnableC1486lg(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void u(long j6, boolean z6) {
        if (this.f15977c != null) {
            AbstractC0640Nf.f10010f.execute(new RunnableC1594ng(this, z6, j6, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void v(int i, int i3) {
        this.f15974F = i;
        this.f15975G = i3;
        float f2 = i3 > 0 ? i / i3 : 1.0f;
        if (this.f15976H != f2) {
            this.f15976H = f2;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void w(String str, Exception exc) {
        C0641Ng c0641Ng;
        String strJ = J(str, exc);
        u2.k.h("ExoPlayerAdapter error: ".concat(strJ));
        this.f15985l = true;
        if (this.f15979e.f14519a && (c0641Ng = this.i) != null) {
            c0641Ng.s(false);
        }
        C2911G.f23576l.post(new RunnableC1540mg(this, strJ, 1));
        p2.j.f22785C.f22795h.g("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1000cg
    public final void x(IOException iOException) {
        String strJ = J("onLoadException", iOException);
        u2.k.h("ExoPlayerAdapter exception: ".concat(strJ));
        p2.j.f22785C.f22795h.g("AdExoPlayerView.onException", iOException);
        C2911G.f23576l.post(new RunnableC1540mg(this, strJ, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int y() {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            return c0641Ng.f10030l;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final Integer z() {
        C0641Ng c0641Ng = this.i;
        if (c0641Ng != null) {
            return c0641Ng.f10016E;
        }
        return null;
    }
}
