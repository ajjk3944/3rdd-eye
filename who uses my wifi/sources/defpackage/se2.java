package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class se2 extends ae2 implements TextureView.SurfaceTextureListener, fe2 {
    public final ag2 h;
    public final ke2 i;
    public final je2 j;
    public final mv2 k;
    public ee2 l;
    public Surface m;
    public sf2 n;
    public String o;
    public String[] p;
    public boolean q;
    public int r;
    public ie2 s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public float y;

    public se2(Context context, ke2 ke2Var, ag2 ag2Var, boolean z, je2 je2Var, mv2 mv2Var) {
        super(context);
        this.r = 1;
        this.h = ag2Var;
        this.i = ke2Var;
        this.t = z;
        this.j = je2Var;
        ke2Var.a(this);
        this.k = mv2Var;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        ex0.q(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // defpackage.ae2
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.p = new String[]{str};
        } else {
            this.p = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.o;
        boolean z = false;
        if (this.j.k && str2 != null && !str.equals(str2) && this.r == 4) {
            z = true;
        }
        this.o = str;
        F(z, num);
    }

    @Override // defpackage.ae2
    public final void B(int i) {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            mf2 mf2Var = sf2Var.g;
            synchronized (mf2Var) {
                mf2Var.b = i * 1000;
            }
        }
    }

    @Override // defpackage.ae2
    public final void C(int i) {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            mf2 mf2Var = sf2Var.g;
            synchronized (mf2Var) {
                mf2Var.c = i * 1000;
            }
        }
    }

    public final boolean D() {
        sf2 sf2Var = this.n;
        return (sf2Var == null || sf2Var.l == null || this.q) ? false : true;
    }

    public final boolean E() {
        return D() && this.r != 1;
    }

    public final void F(boolean z, Integer num) {
        sf2 sf2Var = this.n;
        if (sf2Var != null && !z) {
            sf2Var.v = num;
            return;
        }
        if (this.o == null || this.m == null) {
            return;
        }
        if (z) {
            if (!D()) {
                gi2.i0("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            mc4 mc4Var = sf2Var.l;
            mc4Var.j.b();
            mc4Var.i.p();
            G();
        }
        if (this.o.startsWith("cache:")) {
            ff2 ff2VarW0 = this.h.w0(this.o);
            if (ff2VarW0 instanceof jf2) {
                jf2 jf2Var = (jf2) ff2VarW0;
                synchronized (jf2Var) {
                    jf2Var.l = true;
                    jf2Var.notify();
                }
                sf2 sf2Var2 = jf2Var.i;
                sf2Var2.o = null;
                jf2Var.i = null;
                this.n = sf2Var2;
                sf2Var2.v = num;
                if (sf2Var2.l == null) {
                    gi2.i0("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(ff2VarW0 instanceof if2)) {
                    gi2.i0("Stream cache miss: ".concat(String.valueOf(this.o)));
                    return;
                }
                if2 if2Var = (if2) ff2VarW0;
                ag2 ag2Var = this.h;
                hg4.C.c.D(ag2Var.getContext(), ag2Var.u().f);
                synchronized (if2Var.p) {
                    try {
                        ByteBuffer byteBuffer = if2Var.n;
                        if (byteBuffer != null && !if2Var.o) {
                            byteBuffer.flip();
                            if2Var.o = true;
                        }
                        if2Var.k = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = if2Var.n;
                boolean z2 = if2Var.s;
                String str = if2Var.i;
                if (str == null) {
                    gi2.i0("Stream cache URL is null.");
                    return;
                }
                je2 je2Var = this.j;
                ag2 ag2Var2 = this.h;
                sf2 sf2Var3 = new sf2(ag2Var2.getContext(), je2Var, ag2Var2, num);
                gi2.f0("ExoPlayerAdapter initialized.");
                this.n = sf2Var3;
                sf2Var3.u(new Uri[]{Uri.parse(str)}, byteBuffer2, z2);
            }
        } else {
            je2 je2Var2 = this.j;
            ag2 ag2Var3 = this.h;
            sf2 sf2Var4 = new sf2(ag2Var3.getContext(), je2Var2, ag2Var3, num);
            gi2.f0("ExoPlayerAdapter initialized.");
            this.n = sf2Var4;
            ag2 ag2Var4 = this.h;
            hg4.C.c.D(ag2Var4.getContext(), ag2Var4.u().f);
            Uri[] uriArr = new Uri[this.p.length];
            int i = 0;
            while (true) {
                String[] strArr = this.p;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            sf2 sf2Var5 = this.n;
            sf2Var5.getClass();
            sf2Var5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.n.o = this;
        H(this.m);
        mc4 mc4Var2 = this.n.l;
        if (mc4Var2 != null) {
            int iC1 = mc4Var2.C1();
            this.r = iC1;
            if (iC1 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.n != null) {
            H(null);
            sf2 sf2Var = this.n;
            if (sf2Var != null) {
                sf2Var.o = null;
                mc4 mc4Var = sf2Var.l;
                if (mc4Var != null) {
                    mc4Var.j.b();
                    mc4Var.i.W1(sf2Var);
                    mc4 mc4Var2 = sf2Var.l;
                    mc4Var2.j.b();
                    mc4Var2.i.X1();
                    sf2Var.l = null;
                    sf2.A.decrementAndGet();
                }
                this.n = null;
            }
            this.r = 1;
            this.q = false;
            this.u = false;
            this.v = false;
        }
    }

    public final void H(Surface surface) {
        sf2 sf2Var = this.n;
        if (sf2Var == null) {
            gi2.i0("Trying to set surface before player is initialized.");
            return;
        }
        try {
            mc4 mc4Var = sf2Var.l;
            if (mc4Var != null) {
                mc4Var.j.b();
                ya4 ya4Var = mc4Var.i;
                ya4Var.j2();
                ya4Var.h2(surface);
                int i = surface == null ? 0 : -1;
                ya4Var.i2(i, i);
            }
        } catch (IOException unused) {
            gi2.q0(5);
        }
    }

    public final void I() {
        if (this.u) {
            return;
        }
        this.u = true;
        lf4.l.post(new ne2(this, 0));
        m();
        ke2 ke2Var = this.i;
        if (ke2Var.i && !ke2Var.j) {
            pu1.t(ke2Var.e, ke2Var.d, "vfr2");
            ke2Var.j = true;
        }
        if (this.v) {
            h();
        }
    }

    @Override // defpackage.ae2
    public final void a(int i) {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            mf2 mf2Var = sf2Var.g;
            synchronized (mf2Var) {
                mf2Var.d = i * 1000;
            }
        }
    }

    @Override // defpackage.ae2
    public final void b(int i) {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            mf2 mf2Var = sf2Var.g;
            synchronized (mf2Var) {
                mf2Var.e = i * 1000;
            }
        }
    }

    @Override // defpackage.ae2
    public final void c(int i) throws SocketException {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            Iterator it = sf2Var.y.iterator();
            while (it.hasNext()) {
                lf2 lf2Var = (lf2) ((WeakReference) it.next()).get();
                if (lf2Var != null) {
                    lf2Var.w = i;
                    Iterator it2 = lf2Var.x.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(lf2Var.w);
                            } catch (SocketException unused) {
                                gi2.q0(5);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ae2
    public final String d() {
        return "ExoPlayer/2".concat(true != this.t ? "" : " spherical");
    }

    @Override // defpackage.ae2
    public final void e(ee2 ee2Var) {
        this.l = ee2Var;
    }

    @Override // defpackage.ae2
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // defpackage.fe2
    public final void f0(int i) {
        sf2 sf2Var;
        if (this.r != i) {
            this.r = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.j.a && (sf2Var = this.n) != null) {
                sf2Var.s(false);
            }
            this.i.m = false;
            me2 me2Var = this.g;
            me2Var.d = false;
            me2Var.a();
            lf4.l.post(new ne2(this, 2));
        }
    }

    @Override // defpackage.ae2
    public final void g() {
        if (D()) {
            mc4 mc4Var = this.n.l;
            mc4Var.j.b();
            mc4Var.i.p();
            G();
        }
        ke2 ke2Var = this.i;
        ke2Var.m = false;
        me2 me2Var = this.g;
        me2Var.d = false;
        me2Var.a();
        ke2Var.b();
    }

    @Override // defpackage.ae2
    public final void h() {
        sf2 sf2Var;
        if (!E()) {
            this.v = true;
            return;
        }
        if (this.j.a && (sf2Var = this.n) != null) {
            sf2Var.s(true);
        }
        mc4 mc4Var = this.n.l;
        mc4Var.j.b();
        mc4Var.i.l2(true);
        this.i.d();
        me2 me2Var = this.g;
        me2Var.d = true;
        me2Var.a();
        this.f.c = true;
        lf4.l.post(new ne2(this, 3));
    }

    @Override // defpackage.ae2
    public final void i() {
        sf2 sf2Var;
        if (E()) {
            if (this.j.a && (sf2Var = this.n) != null) {
                sf2Var.s(false);
            }
            mc4 mc4Var = this.n.l;
            mc4Var.j.b();
            mc4Var.i.l2(false);
            this.i.m = false;
            me2 me2Var = this.g;
            me2Var.d = false;
            me2Var.a();
            lf4.l.post(new ne2(this, 4));
        }
    }

    @Override // defpackage.ae2
    public final int j() {
        if (E()) {
            return (int) this.n.l.U1();
        }
        return 0;
    }

    @Override // defpackage.ae2
    public final int k() {
        if (E()) {
            return (int) this.n.l.Q1();
        }
        return 0;
    }

    @Override // defpackage.ae2
    public final void l(int i) {
        if (E()) {
            long j = i;
            mc4 mc4Var = this.n.l;
            mc4Var.u1(mc4Var.O1(), j);
        }
    }

    @Override // defpackage.le2
    public final void m() {
        lf4.l.post(new ne2(this, 7));
    }

    @Override // defpackage.ae2
    public final void n(float f, float f2) {
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.c(f, f2);
        }
    }

    @Override // defpackage.ae2
    public final int o() {
        return this.w;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.y;
        if (f != 0.0f && this.s == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws InterruptedException {
        sf2 sf2Var;
        float f;
        int i3;
        SurfaceTexture surfaceTexture2;
        mv2 mv2Var;
        if (this.t) {
            if (((Boolean) tw1.e.c.a(mz1.be)).booleanValue() && (mv2Var = this.k) != null) {
                lv2 lv2VarA = mv2Var.a();
                lv2VarA.k("action", "svp_aepv");
                lv2VarA.m();
            }
            ie2 ie2Var = new ie2(getContext());
            this.s = ie2Var;
            ie2Var.r = i;
            ie2Var.q = i2;
            ie2Var.t = surfaceTexture;
            ie2Var.start();
            if (ie2Var.t == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    ie2Var.y.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = ie2Var.s;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.s.b();
                this.s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.m = surface;
        if (this.n == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.j.a && (sf2Var = this.n) != null) {
                sf2Var.s(true);
            }
        }
        int i4 = this.w;
        if (i4 == 0 || (i3 = this.x) == 0) {
            f = i2 > 0 ? i / i2 : 1.0f;
            if (this.y != f) {
                this.y = f;
                requestLayout();
            }
        } else {
            f = i3 > 0 ? i4 / i3 : 1.0f;
            if (this.y != f) {
                this.y = f;
                requestLayout();
            }
        }
        lf4.l.post(new ne2(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.b();
            this.s = null;
        }
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            if (sf2Var != null) {
                sf2Var.s(false);
            }
            Surface surface = this.m;
            if (surface != null) {
                surface.release();
            }
            this.m = null;
            H(null);
        }
        lf4.l.post(new ne2(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ie2 ie2Var = this.s;
        if (ie2Var != null) {
            ie2Var.a(i, i2);
        }
        lf4.l.post(new xd2(this, i, i2, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.i.c(this);
        this.f.a(surfaceTexture, this.l);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        gi2.G(sb.toString());
        lf4.l.post(new cd(this, i, 8));
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.ae2
    public final int p() {
        return this.x;
    }

    @Override // defpackage.ae2
    public final long q() {
        sf2 sf2Var = this.n;
        if (sf2Var == null) {
            return -1L;
        }
        if (sf2Var.x == null || !sf2Var.x.u) {
            return sf2Var.p;
        }
        return 0L;
    }

    @Override // defpackage.ae2
    public final long r() {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            return sf2Var.q();
        }
        return -1L;
    }

    @Override // defpackage.ae2
    public final long s() {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            return sf2Var.r();
        }
        return -1L;
    }

    @Override // defpackage.fe2
    public final void t() {
        lf4.l.post(new ne2(this, 1));
    }

    @Override // defpackage.fe2
    public final void u(IOException iOException) {
        String strJ = J("onLoadException", iOException);
        gi2.i0("ExoPlayerAdapter exception: ".concat(strJ));
        hg4.C.h.e("AdExoPlayerView.onException", iOException);
        lf4.l.post(new oe2(this, strJ, 0));
    }

    @Override // defpackage.fe2
    public final void v(long j, boolean z) {
        if (this.h != null) {
            md2.f.execute(new re2(this, z, j, 0));
        }
    }

    @Override // defpackage.fe2
    public final void w(int i, int i2) {
        this.w = i;
        this.x = i2;
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.y != f) {
            this.y = f;
            requestLayout();
        }
    }

    @Override // defpackage.fe2
    public final void x(String str, Exception exc) {
        sf2 sf2Var;
        String strJ = J(str, exc);
        gi2.i0("ExoPlayerAdapter error: ".concat(strJ));
        this.q = true;
        if (this.j.a && (sf2Var = this.n) != null) {
            sf2Var.s(false);
        }
        lf4.l.post(new oe2(this, strJ, 1));
        hg4.C.h.e("AdExoPlayerView.onError", exc);
    }

    @Override // defpackage.ae2
    public final int y() {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            return sf2Var.q;
        }
        return -1;
    }

    @Override // defpackage.ae2
    public final Integer z() {
        sf2 sf2Var = this.n;
        if (sf2Var != null) {
            return sf2Var.v;
        }
        return null;
    }
}
