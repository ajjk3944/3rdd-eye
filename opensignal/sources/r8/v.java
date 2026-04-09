package r8;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f21372o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final List f21373p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final ThreadPoolExecutor f21374q0;
    public final ArrayList B;
    public w8.a D;
    public String E;
    public tv.b F;
    public Map G;
    public String H;
    public final ng.c I;
    public boolean J;
    public boolean K;
    public a9.d L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public g0 S;
    public boolean T;
    public final Matrix U;
    public Bitmap V;
    public Canvas W;
    public Rect X;
    public RectF Y;
    public a9.l Z;

    /* renamed from: a, reason: collision with root package name */
    public h f21375a;

    /* renamed from: a0, reason: collision with root package name */
    public Rect f21376a0;

    /* renamed from: b0, reason: collision with root package name */
    public Rect f21377b0;

    /* renamed from: c0, reason: collision with root package name */
    public RectF f21378c0;

    /* renamed from: d, reason: collision with root package name */
    public final e9.e f21379d;

    /* renamed from: d0, reason: collision with root package name */
    public RectF f21380d0;

    /* renamed from: e0, reason: collision with root package name */
    public Matrix f21381e0;

    /* renamed from: f0, reason: collision with root package name */
    public final float[] f21382f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21383g;

    /* renamed from: g0, reason: collision with root package name */
    public Matrix f21384g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f21385h0;

    /* renamed from: i0, reason: collision with root package name */
    public a f21386i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Semaphore f21387j0;

    /* renamed from: k0, reason: collision with root package name */
    public Handler f21388k0;

    /* renamed from: l0, reason: collision with root package name */
    public r f21389l0;

    /* renamed from: m0, reason: collision with root package name */
    public final r f21390m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f21391n0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21392r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21393x;

    /* renamed from: y, reason: collision with root package name */
    public u f21394y;

    static {
        f21372o0 = Build.VERSION.SDK_INT <= 25;
        f21373p0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f21374q0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new e9.d());
    }

    public v() {
        e9.e eVar = new e9.e();
        this.f21379d = eVar;
        this.f21383g = true;
        this.f21392r = false;
        this.f21393x = false;
        this.f21394y = u.NONE;
        this.B = new ArrayList();
        this.I = new ng.c(1);
        this.J = false;
        this.K = true;
        this.M = 255;
        this.R = false;
        this.S = g0.AUTOMATIC;
        this.T = false;
        this.U = new Matrix();
        this.f21382f0 = new float[9];
        this.f21385h0 = false;
        bq.b bVar = new bq.b(5, this);
        this.f21387j0 = new Semaphore(1);
        this.f21390m0 = new r(this, 1);
        this.f21391n0 = -3.4028235E38f;
        eVar.addUpdateListener(bVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final x8.f fVar, final Object obj, final bm.e eVar) {
        a9.d dVar = this.L;
        if (dVar == null) {
            this.B.add(new t() { // from class: r8.o
                @Override // r8.t
                public final void run() {
                    this.f21358a.a(fVar, obj, eVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (fVar == x8.f.f25091c) {
            dVar.f(eVar, obj);
        } else {
            x8.g gVar = fVar.f25093b;
            if (gVar != null) {
                gVar.f(eVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.L.c(fVar, 0, arrayList, new x8.f(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((x8.f) arrayList.get(i10)).f25093b.f(eVar, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == z.C) {
                t(this.f21379d.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.content.Context r3) {
        /*
            r2 = this;
            boolean r0 = r2.f21392r
            if (r0 == 0) goto L5
            goto L2d
        L5:
            boolean r0 = r2.f21383g
            if (r0 == 0) goto L2f
            df.c r0 = r8.d.f21315d
            r0.getClass()
            if (r3 == 0) goto L27
            android.graphics.Matrix r0 = e9.j.f8019a
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r0 = "animator_duration_scale"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r0, r1)
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L24
            goto L27
        L24:
            v8.a r3 = v8.a.REDUCED_MOTION
            goto L29
        L27:
            v8.a r3 = v8.a.STANDARD_MOTION
        L29:
            v8.a r0 = v8.a.STANDARD_MOTION
            if (r3 != r0) goto L2f
        L2d:
            r3 = 1
            return r3
        L2f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.v.b(android.content.Context):boolean");
    }

    public final void c() {
        h hVar = this.f21375a;
        if (hVar == null) {
            return;
        }
        io.sentry.internal.debugmeta.c cVar = c9.t.f3434a;
        Rect rect = hVar.k;
        List list = Collections.EMPTY_LIST;
        a9.d dVar = new a9.d(this, new a9.h(list, hVar, "__container", -1L, a9.f.PRE_COMP, -1L, null, list, new y8.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, a9.g.NONE, null, false, null, null, z8.g.NORMAL), hVar.j, hVar);
        this.L = dVar;
        if (this.O) {
            dVar.q(true);
        }
        this.L.L = this.K;
    }

    public final void d() {
        e9.e eVar = this.f21379d;
        if (eVar.I) {
            eVar.cancel();
            if (!isVisible()) {
                this.f21394y = u.NONE;
            }
        }
        this.f21375a = null;
        this.L = null;
        this.D = null;
        this.f21391n0 = -3.4028235E38f;
        eVar.H = null;
        eVar.F = -2.1474836E9f;
        eVar.G = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        h hVar;
        a9.d dVar = this.L;
        if (dVar == null) {
            return;
        }
        a aVar = this.f21386i0;
        if (aVar == null) {
            aVar = d.f21312a;
        }
        boolean z10 = aVar == a.ENABLED;
        r rVar = this.f21390m0;
        ThreadPoolExecutor threadPoolExecutor = f21374q0;
        Semaphore semaphore = this.f21387j0;
        e9.e eVar = this.f21379d;
        if (z10) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                a aVar2 = d.f21312a;
                if (!z10) {
                    return;
                }
                semaphore.release();
                if (dVar.K == eVar.a()) {
                    return;
                }
            } catch (Throwable th2) {
                a aVar3 = d.f21312a;
                if (z10) {
                    semaphore.release();
                    if (dVar.K != eVar.a()) {
                        threadPoolExecutor.execute(rVar);
                    }
                }
                throw th2;
            }
        }
        a aVar4 = d.f21312a;
        if (z10 && (hVar = this.f21375a) != null) {
            float f10 = this.f21391n0;
            float fA = eVar.a();
            this.f21391n0 = fA;
            if (Math.abs(fA - f10) * hVar.b() >= 50.0f) {
                t(eVar.a());
            }
        }
        if (this.f21393x) {
            try {
                if (this.T) {
                    l(canvas, dVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                e9.c.f7982a.getClass();
                a aVar5 = d.f21312a;
            }
        } else if (this.T) {
            l(canvas, dVar);
        } else {
            g(canvas);
        }
        this.f21385h0 = false;
        if (z10) {
            semaphore.release();
            if (dVar.K == eVar.a()) {
                return;
            }
            threadPoolExecutor.execute(rVar);
        }
    }

    public final void e() {
        h hVar = this.f21375a;
        if (hVar == null) {
            return;
        }
        this.T = this.S.useSoftwareRendering(Build.VERSION.SDK_INT, hVar.f21335o, hVar.f21336p);
    }

    public final void g(Canvas canvas) {
        a9.d dVar = this.L;
        h hVar = this.f21375a;
        if (dVar == null || hVar == null) {
            return;
        }
        Matrix matrix = this.U;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / hVar.k.width(), r3.height() / hVar.k.height());
        }
        dVar.h(canvas, matrix, this.M, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.f21375a;
        if (hVar == null) {
            return -1;
        }
        return hVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.f21375a;
        if (hVar == null) {
            return -1;
        }
        return hVar.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final tv.b i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.F == null) {
            Drawable.Callback callback = getCallback();
            tv.b bVar = new tv.b();
            bVar.f23029g = new ef.c();
            bVar.f23027a = new HashMap();
            bVar.f23028d = new HashMap();
            bVar.f23031x = ".ttf";
            if (callback instanceof View) {
                bVar.f23030r = ((View) callback).getContext().getAssets();
            } else {
                e9.c.b("LottieDrawable must be inside of a view for images to work.");
                bVar.f23030r = null;
            }
            this.F = bVar;
            String str = this.H;
            if (str != null) {
                bVar.f23031x = str;
            }
        }
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f21385h0) {
            return;
        }
        this.f21385h0 = true;
        if ((!f21372o0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        e9.e eVar = this.f21379d;
        if (eVar == null) {
            return false;
        }
        return eVar.I;
    }

    public final void j() {
        this.B.clear();
        e9.e eVar = this.f21379d;
        eVar.g(true);
        Iterator it = eVar.f7989g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f21394y = u.NONE;
    }

    public final void k() {
        if (this.L == null) {
            this.B.add(new s(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        e9.e eVar = this.f21379d;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.I = true;
                boolean zD = eVar.d();
                Iterator it = eVar.f7988d.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, zD);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                eVar.h((int) (eVar.d() ? eVar.b() : eVar.c()));
                eVar.f7992y = 0L;
                eVar.E = 0;
                if (eVar.I) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f21394y = u.NONE;
            } else {
                this.f21394y = u.PLAY;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = f21373p0.iterator();
        x8.i iVarD = null;
        while (it2.hasNext()) {
            iVarD = this.f21375a.d((String) it2.next());
            if (iVarD != null) {
                break;
            }
        }
        if (iVarD != null) {
            n((int) iVarD.f25097b);
        } else {
            n((int) (eVar.f7990r < 0.0f ? eVar.c() : eVar.b()));
        }
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f21394y = u.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r11, a9.d r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.v.l(android.graphics.Canvas, a9.d):void");
    }

    public final void m() {
        if (this.L == null) {
            this.B.add(new s(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        e9.e eVar = this.f21379d;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.I = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f7992y = 0L;
                if (eVar.d() && eVar.D == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.D == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f7989g.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f21394y = u.NONE;
            } else {
                this.f21394y = u.RESUME;
            }
        }
        if (b(h())) {
            return;
        }
        n((int) (eVar.f7990r < 0.0f ? eVar.c() : eVar.b()));
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f21394y = u.NONE;
    }

    public final void n(int i10) {
        if (this.f21375a != null) {
            this.f21379d.h(i10);
        } else {
            this.B.add(new n(this, i10, 2));
        }
    }

    public final void o(int i10) {
        if (this.f21375a == null) {
            this.B.add(new n(this, i10, 0));
        } else {
            e9.e eVar = this.f21379d;
            eVar.i(eVar.F, i10 + 0.99f);
        }
    }

    public final void p(String str) {
        h hVar = this.f21375a;
        if (hVar == null) {
            this.B.add(new m(this, str, 1));
        } else {
            x8.i iVarD = hVar.d(str);
            if (iVarD == null) {
                throw new IllegalArgumentException(h0.b.o("Cannot find marker with name ", str, "."));
            }
            o((int) (iVarD.f25097b + iVarD.f25098c));
        }
    }

    public final void q(String str) {
        h hVar = this.f21375a;
        ArrayList arrayList = this.B;
        if (hVar == null) {
            arrayList.add(new m(this, str, 0));
            return;
        }
        x8.i iVarD = hVar.d(str);
        if (iVarD == null) {
            throw new IllegalArgumentException(h0.b.o("Cannot find marker with name ", str, "."));
        }
        int i10 = (int) iVarD.f25097b;
        int i11 = ((int) iVarD.f25098c) + i10;
        if (this.f21375a == null) {
            arrayList.add(new q(this, i10, i11));
        } else {
            this.f21379d.i(i10, i11 + 0.99f);
        }
    }

    public final void r(int i10) {
        if (this.f21375a == null) {
            this.B.add(new n(this, i10, 1));
        } else {
            this.f21379d.i(i10, (int) r0.G);
        }
    }

    public final void s(String str) {
        h hVar = this.f21375a;
        if (hVar == null) {
            this.B.add(new m(this, str, 2));
        } else {
            x8.i iVarD = hVar.d(str);
            if (iVarD == null) {
                throw new IllegalArgumentException(h0.b.o("Cannot find marker with name ", str, "."));
            }
            r((int) iVarD.f25097b);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.M = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        e9.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            u uVar = this.f21394y;
            if (uVar == u.PLAY) {
                k();
                return visible;
            }
            if (uVar == u.RESUME) {
                m();
                return visible;
            }
        } else {
            if (this.f21379d.I) {
                j();
                this.f21394y = u.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f21394y = u.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.B.clear();
        e9.e eVar = this.f21379d;
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f21394y = u.NONE;
    }

    public final void t(float f10) {
        h hVar = this.f21375a;
        if (hVar == null) {
            this.B.add(new p(this, f10, 2));
        } else {
            a aVar = d.f21312a;
            this.f21379d.h(e9.g.f(hVar.f21332l, hVar.f21333m, f10));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
