package defpackage;

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
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i90 extends Drawable implements Drawable.Callback, Animatable {
    public static final List V = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor W = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new r90());
    public jp0 A;
    public boolean B;
    public final Matrix C;
    public Bitmap D;
    public Canvas E;
    public Rect F;
    public RectF G;
    public d50 H;
    public Rect I;
    public Rect J;
    public RectF K;
    public RectF L;
    public Matrix M;
    public final float[] N;
    public Matrix O;
    public boolean P;
    public x8 Q;
    public final Semaphore R;
    public final e2 S;
    public float T;
    public int U;
    public u80 f;
    public final s90 g;
    public final boolean h;
    public boolean i;
    public boolean j;
    public final ArrayList k;
    public xb4 l;
    public String m;
    public g4 n;
    public Map o;
    public String p;
    public final zs1 q;
    public boolean r;
    public boolean s;
    public fh t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public i90() {
        s90 s90Var = new s90();
        this.g = s90Var;
        this.h = true;
        this.i = false;
        this.j = false;
        this.U = 1;
        this.k = new ArrayList();
        this.q = new zs1(4);
        this.r = false;
        this.s = true;
        this.u = 255;
        this.z = false;
        this.A = jp0.f;
        this.B = false;
        this.C = new Matrix();
        this.N = new float[9];
        this.P = false;
        mo moVar = new mo(2, this);
        this.R = new Semaphore(1);
        this.S = new e2(10, this);
        this.T = -3.4028235E38f;
        s90Var.addUpdateListener(moVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final t40 t40Var, final Object obj, final vq2 vq2Var) {
        fh fhVar = this.t;
        if (fhVar == null) {
            this.k.add(new h90() { // from class: d90
                @Override // defpackage.h90
                public final void run() {
                    this.a.a(t40Var, obj, vq2Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (t40Var == t40.c) {
            fhVar.a(obj, vq2Var);
        } else {
            u40 u40Var = t40Var.b;
            if (u40Var != null) {
                u40Var.a(obj, vq2Var);
            } else {
                ArrayList arrayList = new ArrayList();
                this.t.h(t40Var, 0, arrayList, new t40(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((t40) arrayList.get(i)).b.a(obj, vq2Var);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == n90.z) {
                t(this.g.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.i) {
            return true;
        }
        if (!this.h) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = l41.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        u80 u80Var = this.f;
        if (u80Var == null) {
            return;
        }
        l92 l92Var = g50.a;
        Rect rect = u80Var.k;
        List list = Collections.EMPTY_LIST;
        fh fhVar = new fh(this, new f50(list, u80Var, "__container", -1L, 1, -1L, null, list, new h4(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), u80Var.j, u80Var);
        this.t = fhVar;
        if (this.w) {
            fhVar.q(true);
        }
        this.t.L = this.s;
    }

    public final void d() {
        s90 s90Var = this.g;
        if (s90Var.r) {
            s90Var.cancel();
            if (!isVisible()) {
                this.U = 1;
            }
        }
        this.f = null;
        this.t = null;
        this.l = null;
        this.T = -3.4028235E38f;
        s90Var.q = null;
        s90Var.o = -2.1474836E9f;
        s90Var.p = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        u80 u80Var;
        fh fhVar = this.t;
        if (fhVar == null) {
            return;
        }
        x8 x8Var = this.Q;
        if (x8Var == null) {
            x8Var = x8.f;
        }
        boolean z = x8Var == x8.g;
        e2 e2Var = this.S;
        ThreadPoolExecutor threadPoolExecutor = W;
        Semaphore semaphore = this.R;
        s90 s90Var = this.g;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (fhVar.K == s90Var.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (fhVar.K != s90Var.a()) {
                        threadPoolExecutor.execute(e2Var);
                    }
                }
                throw th;
            }
        }
        if (z && (u80Var = this.f) != null) {
            float f = this.T;
            float fA = s90Var.a();
            this.T = fA;
            if (Math.abs(fA - f) * u80Var.b() >= 50.0f) {
                t(s90Var.a());
            }
        }
        if (this.j) {
            try {
                if (this.B) {
                    l(canvas, fhVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                j80.a.getClass();
            }
        } else if (this.B) {
            l(canvas, fhVar);
        } else {
            g(canvas);
        }
        this.P = false;
        if (z) {
            semaphore.release();
            if (fhVar.K == s90Var.a()) {
                return;
            }
            threadPoolExecutor.execute(e2Var);
        }
    }

    public final void e() {
        u80 u80Var = this.f;
        if (u80Var == null) {
            return;
        }
        jp0 jp0Var = this.A;
        int i = Build.VERSION.SDK_INT;
        boolean z = u80Var.o;
        int i2 = u80Var.p;
        int iOrdinal = jp0Var.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4))) {
            z2 = true;
        }
        this.B = z2;
    }

    public final void g(Canvas canvas) {
        fh fhVar = this.t;
        u80 u80Var = this.f;
        if (fhVar == null || u80Var == null) {
            return;
        }
        Matrix matrix = this.C;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / u80Var.k.width(), r3.height() / u80Var.k.height());
        }
        fhVar.g(canvas, matrix, this.u, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        u80 u80Var = this.f;
        if (u80Var == null) {
            return -1;
        }
        return u80Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        u80 u80Var = this.f;
        if (u80Var == null) {
            return -1;
        }
        return u80Var.k.width();
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

    public final g4 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.n == null) {
            g4 g4Var = new g4(getCallback());
            this.n = g4Var;
            String str = this.p;
            if (str != null) {
                g4Var.k = str;
            }
        }
        return this.n;
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
        if (this.P) {
            return;
        }
        this.P = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        s90 s90Var = this.g;
        if (s90Var == null) {
            return false;
        }
        return s90Var.r;
    }

    public final void j() {
        this.k.clear();
        s90 s90Var = this.g;
        s90Var.g(true);
        Iterator it = s90Var.h.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(s90Var);
        }
        if (isVisible()) {
            return;
        }
        this.U = 1;
    }

    public final void k() {
        if (this.t == null) {
            this.k.add(new g90(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        s90 s90Var = this.g;
        if (zB || s90Var.getRepeatCount() == 0) {
            if (isVisible()) {
                s90Var.r = true;
                boolean zD = s90Var.d();
                Iterator it = s90Var.g.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(s90Var, zD);
                }
                s90Var.h((int) (s90Var.d() ? s90Var.b() : s90Var.c()));
                s90Var.k = 0L;
                s90Var.n = 0;
                if (s90Var.r) {
                    s90Var.g(false);
                    Choreographer.getInstance().postFrameCallback(s90Var);
                }
                this.U = 1;
            } else {
                this.U = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = V.iterator();
        hb0 hb0VarD = null;
        while (it2.hasNext()) {
            hb0VarD = this.f.d((String) it2.next());
            if (hb0VarD != null) {
                break;
            }
        }
        if (hb0VarD != null) {
            n((int) hb0VarD.b);
        } else {
            n((int) (s90Var.i < 0.0f ? s90Var.c() : s90Var.b()));
        }
        s90Var.g(true);
        s90Var.e(s90Var.d());
        if (isVisible()) {
            return;
        }
        this.U = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r11, defpackage.fh r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i90.l(android.graphics.Canvas, fh):void");
    }

    public final void m() {
        if (this.t == null) {
            this.k.add(new g90(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        s90 s90Var = this.g;
        if (zB || s90Var.getRepeatCount() == 0) {
            if (isVisible()) {
                s90Var.r = true;
                s90Var.g(false);
                Choreographer.getInstance().postFrameCallback(s90Var);
                s90Var.k = 0L;
                if (s90Var.d() && s90Var.m == s90Var.c()) {
                    s90Var.h(s90Var.b());
                } else if (!s90Var.d() && s90Var.m == s90Var.b()) {
                    s90Var.h(s90Var.c());
                }
                Iterator it = s90Var.h.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(s90Var);
                }
                this.U = 1;
            } else {
                this.U = 3;
            }
        }
        if (b(h())) {
            return;
        }
        n((int) (s90Var.i < 0.0f ? s90Var.c() : s90Var.b()));
        s90Var.g(true);
        s90Var.e(s90Var.d());
        if (isVisible()) {
            return;
        }
        this.U = 1;
    }

    public final void n(int i) {
        if (this.f != null) {
            this.g.h(i);
        } else {
            this.k.add(new c90(this, i, 2));
        }
    }

    public final void o(int i) {
        if (this.f == null) {
            this.k.add(new c90(this, i, 0));
        } else {
            s90 s90Var = this.g;
            s90Var.i(s90Var.o, i + 0.99f);
        }
    }

    public final void p(String str) {
        u80 u80Var = this.f;
        if (u80Var == null) {
            this.k.add(new b90(this, str, 1));
        } else {
            hb0 hb0VarD = u80Var.d(str);
            if (hb0VarD == null) {
                throw new IllegalArgumentException(ex0.h("Cannot find marker with name ", str, "."));
            }
            o((int) (hb0VarD.b + hb0VarD.c));
        }
    }

    public final void q(String str) {
        u80 u80Var = this.f;
        ArrayList arrayList = this.k;
        if (u80Var == null) {
            arrayList.add(new b90(this, str, 0));
            return;
        }
        hb0 hb0VarD = u80Var.d(str);
        if (hb0VarD == null) {
            throw new IllegalArgumentException(ex0.h("Cannot find marker with name ", str, "."));
        }
        int i = (int) hb0VarD.b;
        int i2 = ((int) hb0VarD.c) + i;
        if (this.f == null) {
            arrayList.add(new f90(this, i, i2));
        } else {
            this.g.i(i, i2 + 0.99f);
        }
    }

    public final void r(int i) {
        if (this.f == null) {
            this.k.add(new c90(this, i, 1));
        } else {
            this.g.i(i, (int) r0.p);
        }
    }

    public final void s(String str) {
        u80 u80Var = this.f;
        if (u80Var == null) {
            this.k.add(new b90(this, str, 2));
        } else {
            hb0 hb0VarD = u80Var.d(str);
            if (hb0VarD == null) {
                throw new IllegalArgumentException(ex0.h("Cannot find marker with name ", str, "."));
            }
            r((int) hb0VarD.b);
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
    public final void setAlpha(int i) {
        this.u = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        j80.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.U;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                m();
                return visible;
            }
        } else {
            if (this.g.r) {
                j();
                this.U = 3;
                return visible;
            }
            if (zIsVisible) {
                this.U = 1;
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
        this.k.clear();
        s90 s90Var = this.g;
        s90Var.g(true);
        s90Var.e(s90Var.d());
        if (isVisible()) {
            return;
        }
        this.U = 1;
    }

    public final void t(float f) {
        u80 u80Var = this.f;
        if (u80Var == null) {
            this.k.add(new e90(this, f, 2));
        } else {
            this.g.h(te0.f(u80Var.l, u80Var.m, f));
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
