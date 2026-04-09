package f7;

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
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.f1;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean S;
    public static final List T;
    public static final ThreadPoolExecutor U;
    public Rect A;
    public RectF B;
    public g7.a C;
    public Rect D;
    public Rect E;
    public RectF F;
    public RectF G;
    public Matrix H;
    public final float[] I;
    public Matrix J;
    public boolean K;
    public a L;
    public final Semaphore M;
    public Handler N;
    public u O;
    public final u P;
    public float Q;
    public int R;

    /* renamed from: a, reason: collision with root package name */
    public j f23801a;

    /* renamed from: b, reason: collision with root package name */
    public final r7.f f23802b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23803c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23804d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23805e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f23806f;
    public j7.a g;

    /* renamed from: h, reason: collision with root package name */
    public String f23807h;

    /* renamed from: i, reason: collision with root package name */
    public f1 f23808i;
    public Map j;

    /* renamed from: k, reason: collision with root package name */
    public String f23809k;

    /* renamed from: l, reason: collision with root package name */
    public final o7.d f23810l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23811m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23812n;

    /* renamed from: o, reason: collision with root package name */
    public n7.b f23813o;

    /* renamed from: p, reason: collision with root package name */
    public int f23814p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23815q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23816r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23817s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23818t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23819u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f23820v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23821w;

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f23822x;

    /* renamed from: y, reason: collision with root package name */
    public Bitmap f23823y;

    /* renamed from: z, reason: collision with root package name */
    public Canvas f23824z;

    static {
        S = Build.VERSION.SDK_INT <= 25;
        T = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        U = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new r7.e());
    }

    public x() {
        r7.f fVar = new r7.f();
        fVar.f32857d = 1.0f;
        fVar.f32858e = false;
        fVar.f32859f = 0L;
        fVar.g = 0.0f;
        fVar.f32860h = 0.0f;
        fVar.f32861i = 0;
        fVar.j = -2.1474836E9f;
        fVar.f32862k = 2.1474836E9f;
        fVar.f32864m = false;
        fVar.f32865n = false;
        this.f23802b = fVar;
        this.f23803c = true;
        this.f23804d = false;
        this.f23805e = false;
        this.R = 1;
        this.f23806f = new ArrayList();
        this.f23810l = new o7.d(19);
        this.f23811m = false;
        this.f23812n = true;
        this.f23814p = 255;
        this.f23819u = false;
        this.f23820v = h0.f23744a;
        this.f23821w = false;
        this.f23822x = new Matrix();
        this.I = new float[9];
        this.K = false;
        eh.a aVar = new eh.a(1, this);
        this.M = new Semaphore(1);
        this.P = new u(this, 1);
        this.Q = -3.4028235E38f;
        fVar.addUpdateListener(aVar);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f10) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? false : true;
    }

    public final void a(final k7.e eVar, final Object obj, final km.o oVar) {
        n7.b bVar = this.f23813o;
        if (bVar == null) {
            this.f23806f.add(new w() { // from class: f7.r
                @Override // f7.w
                public final void run() {
                    this.f23787a.a(eVar, obj, oVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == k7.e.f28061c) {
            bVar.f(obj, oVar);
        } else {
            k7.f fVar = eVar.f28063b;
            if (fVar != null) {
                fVar.f(obj, oVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f23813o.g(eVar, 0, arrayList, new k7.e(new String[0]));
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((k7.e) arrayList.get(i4)).f28063b.f(obj, oVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == b0.C) {
                u(this.f23802b.e());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.f23804d) {
            return true;
        }
        if (!this.f23803c) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = r7.j.f32892a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        j jVar = this.f23801a;
        if (jVar == null) {
            return;
        }
        km.n nVar = p7.q.f31437a;
        Rect rect = jVar.f23758k;
        List list = Collections.EMPTY_LIST;
        n7.b bVar = new n7.b(this, new n7.d(list, jVar, "__container", -1L, 1, -1L, null, list, new l7.e(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), jVar.j, jVar);
        this.f23813o = bVar;
        if (this.f23816r) {
            bVar.q(true);
        }
        this.f23813o.L = this.f23812n;
    }

    public final void d() {
        r7.f fVar = this.f23802b;
        if (fVar.f32864m) {
            fVar.cancel();
            if (!isVisible()) {
                this.R = 1;
            }
        }
        this.f23801a = null;
        this.f23813o = null;
        this.g = null;
        this.Q = -3.4028235E38f;
        fVar.f32863l = null;
        fVar.j = -2.1474836E9f;
        fVar.f32862k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j jVar;
        n7.b bVar = this.f23813o;
        if (bVar == null) {
            return;
        }
        a aVar = this.L;
        if (aVar == null) {
            aVar = a.f23689a;
        }
        boolean z3 = aVar == a.f23690b;
        u uVar = this.P;
        ThreadPoolExecutor threadPoolExecutor = U;
        Semaphore semaphore = this.M;
        r7.f fVar = this.f23802b;
        if (z3) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z3) {
                    return;
                }
                semaphore.release();
                if (bVar.K == fVar.e()) {
                    return;
                }
            } catch (Throwable th2) {
                if (z3) {
                    semaphore.release();
                    if (bVar.K != fVar.e()) {
                        threadPoolExecutor.execute(uVar);
                    }
                }
                throw th2;
            }
        }
        if (z3 && (jVar = this.f23801a) != null) {
            float f10 = this.Q;
            float fE = fVar.e();
            this.Q = fE;
            if (Math.abs(fE - f10) * jVar.b() >= 50.0f) {
                u(fVar.e());
            }
        }
        if (this.f23805e) {
            try {
                if (this.f23821w) {
                    m(canvas, bVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                r7.d.f32852a.getClass();
            }
        } else if (this.f23821w) {
            m(canvas, bVar);
        } else {
            g(canvas);
        }
        this.K = false;
        if (z3) {
            semaphore.release();
            if (bVar.K == fVar.e()) {
                return;
            }
            threadPoolExecutor.execute(uVar);
        }
    }

    public final void e() {
        j jVar = this.f23801a;
        if (jVar == null) {
            return;
        }
        h0 h0Var = this.f23820v;
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = jVar.f23762o;
        int i10 = jVar.f23763p;
        int iOrdinal = h0Var.ordinal();
        boolean z10 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z3 && i4 < 28) || i10 > 4 || i4 <= 25))) {
            z10 = true;
        }
        this.f23821w = z10;
    }

    public final void g(Canvas canvas) {
        n7.b bVar = this.f23813o;
        j jVar = this.f23801a;
        if (bVar == null || jVar == null) {
            return;
        }
        Matrix matrix = this.f23822x;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / jVar.f23758k.width(), r3.height() / jVar.f23758k.height());
        }
        bVar.h(canvas, matrix, this.f23814p, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f23814p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        j jVar = this.f23801a;
        if (jVar == null) {
            return -1;
        }
        return jVar.f23758k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        j jVar = this.f23801a;
        if (jVar == null) {
            return -1;
        }
        return jVar.f23758k.width();
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

    public final f1 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f23808i == null) {
            f1 f1Var = new f1(getCallback());
            this.f23808i = f1Var;
            String str = this.f23809k;
            if (str != null) {
                f1Var.f1138f = str;
            }
        }
        return this.f23808i;
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
        if (this.K) {
            return;
        }
        this.K = true;
        if ((!S || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        r7.f fVar = this.f23802b;
        if (fVar == null) {
            return false;
        }
        return fVar.f32864m;
    }

    public final void k() {
        this.f23806f.clear();
        r7.f fVar = this.f23802b;
        fVar.i(true);
        Iterator it = fVar.f32845c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(fVar);
        }
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    public final void l() {
        if (this.f23813o == null) {
            this.f23806f.add(new v(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        r7.f fVar = this.f23802b;
        if (zB || fVar.getRepeatCount() == 0) {
            if (isVisible()) {
                fVar.f32864m = true;
                fVar.b(fVar.h());
                fVar.j((int) (fVar.h() ? fVar.f() : fVar.g()));
                fVar.f32859f = 0L;
                fVar.f32861i = 0;
                if (fVar.f32864m) {
                    fVar.i(false);
                    Choreographer.getInstance().postFrameCallback(fVar);
                }
                this.R = 1;
            } else {
                this.R = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = T.iterator();
        k7.h hVarD = null;
        while (it.hasNext()) {
            hVarD = this.f23801a.d((String) it.next());
            if (hVarD != null) {
                break;
            }
        }
        if (hVarD != null) {
            o((int) hVarD.f28067b);
        } else {
            o((int) (fVar.f32857d < 0.0f ? fVar.g() : fVar.f()));
        }
        fVar.i(true);
        fVar.a(fVar.h());
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.graphics.Canvas r12, n7.b r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.x.m(android.graphics.Canvas, n7.b):void");
    }

    public final void n() {
        if (this.f23813o == null) {
            this.f23806f.add(new v(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        r7.f fVar = this.f23802b;
        if (zB || fVar.getRepeatCount() == 0) {
            if (isVisible()) {
                fVar.f32864m = true;
                fVar.i(false);
                Choreographer.getInstance().postFrameCallback(fVar);
                fVar.f32859f = 0L;
                if (fVar.h() && fVar.f32860h == fVar.g()) {
                    fVar.j(fVar.f());
                } else if (!fVar.h() && fVar.f32860h == fVar.f()) {
                    fVar.j(fVar.g());
                }
                Iterator it = fVar.f32845c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(fVar);
                }
                this.R = 1;
            } else {
                this.R = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (fVar.f32857d < 0.0f ? fVar.g() : fVar.f()));
        fVar.i(true);
        fVar.a(fVar.h());
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    public final void o(int i4) {
        if (this.f23801a != null) {
            this.f23802b.j(i4);
        } else {
            this.f23806f.add(new q(this, i4, 2));
        }
    }

    public final void p(int i4) {
        if (this.f23801a == null) {
            this.f23806f.add(new q(this, i4, 0));
        } else {
            r7.f fVar = this.f23802b;
            fVar.k(fVar.j, i4 + 0.99f);
        }
    }

    public final void q(String str) {
        j jVar = this.f23801a;
        if (jVar == null) {
            this.f23806f.add(new p(this, str, 1));
        } else {
            k7.h hVarD = jVar.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(d.h.t("Cannot find marker with name ", str, "."));
            }
            p((int) (hVarD.f28067b + hVarD.f28068c));
        }
    }

    public final void r(String str) {
        j jVar = this.f23801a;
        ArrayList arrayList = this.f23806f;
        if (jVar == null) {
            arrayList.add(new p(this, str, 0));
            return;
        }
        k7.h hVarD = jVar.d(str);
        if (hVarD == null) {
            throw new IllegalArgumentException(d.h.t("Cannot find marker with name ", str, "."));
        }
        int i4 = (int) hVarD.f28067b;
        int i10 = ((int) hVarD.f28068c) + i4;
        if (this.f23801a == null) {
            arrayList.add(new t(this, i4, i10));
        } else {
            this.f23802b.k(i4, i10 + 0.99f);
        }
    }

    public final void s(int i4) {
        if (this.f23801a == null) {
            this.f23806f.add(new q(this, i4, 1));
        } else {
            this.f23802b.k(i4, (int) r0.f32862k);
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
    public final void setAlpha(int i4) {
        this.f23814p = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        r7.d.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z10) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z3, z10);
        if (z3) {
            int i4 = this.R;
            if (i4 == 2) {
                l();
                return visible;
            }
            if (i4 == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f23802b.f32864m) {
                k();
                this.R = 3;
                return visible;
            }
            if (zIsVisible) {
                this.R = 1;
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
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f23806f.clear();
        r7.f fVar = this.f23802b;
        fVar.i(true);
        fVar.a(fVar.h());
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    public final void t(String str) {
        j jVar = this.f23801a;
        if (jVar == null) {
            this.f23806f.add(new p(this, str, 2));
        } else {
            k7.h hVarD = jVar.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(d.h.t("Cannot find marker with name ", str, "."));
            }
            s((int) hVarD.f28067b);
        }
    }

    public final void u(float f10) {
        j jVar = this.f23801a;
        if (jVar == null) {
            this.f23806f.add(new s(this, f10, 2));
        } else {
            this.f23802b.j(r7.h.f(jVar.f23759l, jVar.f23760m, f10));
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
