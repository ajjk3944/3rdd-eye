package i2;

import J8.C0693h;
import N7.C1154e9;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import j2.C5167a;
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
import kotlin.KotlinVersion;
import m2.C5318a;
import m2.C5319b;
import n2.C5351e;
import n2.C5354h;
import n2.InterfaceC5352f;
import o2.C5417h;
import p2.EnumC5447g;
import q2.e;
import t2.AbstractC5601b;
import u2.C5624c;
import u2.C5628g;
import u2.ChoreographerFrameCallbackC5626e;
import u2.ThreadFactoryC5625d;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public final class z extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: R, reason: collision with root package name */
    public static final boolean f38403R;

    /* renamed from: S, reason: collision with root package name */
    public static final List<String> f38404S;

    /* renamed from: T, reason: collision with root package name */
    public static final ThreadPoolExecutor f38405T;

    /* renamed from: A, reason: collision with root package name */
    public Canvas f38406A;

    /* renamed from: B, reason: collision with root package name */
    public Rect f38407B;

    /* renamed from: C, reason: collision with root package name */
    public RectF f38408C;

    /* renamed from: D, reason: collision with root package name */
    public C5167a f38409D;

    /* renamed from: E, reason: collision with root package name */
    public Rect f38410E;

    /* renamed from: F, reason: collision with root package name */
    public Rect f38411F;

    /* renamed from: G, reason: collision with root package name */
    public RectF f38412G;

    /* renamed from: H, reason: collision with root package name */
    public RectF f38413H;

    /* renamed from: I, reason: collision with root package name */
    public Matrix f38414I;

    /* renamed from: J, reason: collision with root package name */
    public Matrix f38415J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38416K;

    /* renamed from: L, reason: collision with root package name */
    public EnumC4441a f38417L;

    /* renamed from: M, reason: collision with root package name */
    public final Semaphore f38418M;

    /* renamed from: N, reason: collision with root package name */
    public Handler f38419N;

    /* renamed from: O, reason: collision with root package name */
    public t f38420O;

    /* renamed from: P, reason: collision with root package name */
    public final t f38421P;

    /* renamed from: Q, reason: collision with root package name */
    public float f38422Q;

    /* renamed from: b, reason: collision with root package name */
    public C4448h f38423b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoreographerFrameCallbackC5626e f38424c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38425d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f38427f;

    /* renamed from: g, reason: collision with root package name */
    public b f38428g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<a> f38429h;
    public C5319b i;

    /* renamed from: j, reason: collision with root package name */
    public String f38430j;

    /* renamed from: k, reason: collision with root package name */
    public C5318a f38431k;

    /* renamed from: l, reason: collision with root package name */
    public Map<String, Typeface> f38432l;

    /* renamed from: m, reason: collision with root package name */
    public String f38433m;

    /* renamed from: n, reason: collision with root package name */
    public final C4429B f38434n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38435o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38436p;

    /* renamed from: q, reason: collision with root package name */
    public q2.c f38437q;

    /* renamed from: r, reason: collision with root package name */
    public int f38438r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f38439s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38440t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38441u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38442v;

    /* renamed from: w, reason: collision with root package name */
    public EnumC4439L f38443w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f38444x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f38445y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f38446z;

    /* compiled from: LottieDrawable.java */
    public interface a {
        void run();
    }

    /* compiled from: LottieDrawable.java */
    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        f38403R = Build.VERSION.SDK_INT <= 25;
        f38404S = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f38405T = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5625d());
    }

    public z() {
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = new ChoreographerFrameCallbackC5626e();
        choreographerFrameCallbackC5626e.f46545e = 1.0f;
        choreographerFrameCallbackC5626e.f46546f = false;
        choreographerFrameCallbackC5626e.f46547g = 0L;
        choreographerFrameCallbackC5626e.f46548h = 0.0f;
        choreographerFrameCallbackC5626e.i = 0.0f;
        choreographerFrameCallbackC5626e.f46549j = 0;
        choreographerFrameCallbackC5626e.f46550k = -2.1474836E9f;
        choreographerFrameCallbackC5626e.f46551l = 2.1474836E9f;
        choreographerFrameCallbackC5626e.f46553n = false;
        choreographerFrameCallbackC5626e.f46554o = false;
        this.f38424c = choreographerFrameCallbackC5626e;
        this.f38425d = true;
        this.f38426e = false;
        this.f38427f = false;
        this.f38428g = b.NONE;
        this.f38429h = new ArrayList<>();
        this.f38434n = new C4429B();
        this.f38435o = false;
        this.f38436p = true;
        this.f38438r = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f38442v = false;
        this.f38443w = EnumC4439L.AUTOMATIC;
        this.f38444x = false;
        this.f38445y = new Matrix();
        this.f38416K = false;
        C0693h c0693h = new C0693h(this, 2);
        this.f38418M = new Semaphore(1);
        this.f38421P = new t(this, 1);
        this.f38422Q = -3.4028235E38f;
        choreographerFrameCallbackC5626e.addUpdateListener(c0693h);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final C5351e c5351e, final ColorFilter colorFilter, final B0.f fVar) {
        q2.c cVar = this.f38437q;
        if (cVar == null) {
            this.f38429h.add(new a() { // from class: i2.q
                @Override // i2.z.a
                public final void run() {
                    this.f38381a.a(c5351e, colorFilter, fVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c5351e == C5351e.f44269c) {
            cVar.c(colorFilter, fVar);
        } else {
            InterfaceC5352f interfaceC5352f = c5351e.f44271b;
            if (interfaceC5352f != null) {
                interfaceC5352f.c(colorFilter, fVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f38437q.g(c5351e, 0, arrayList, new C5351e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C5351e) arrayList.get(i)).f44271b.c(colorFilter, fVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == InterfaceC4433F.f38324z) {
                s(this.f38424c.d());
            }
        }
    }

    public final boolean b() {
        return this.f38425d || this.f38426e;
    }

    public final void c() {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            return;
        }
        AbstractC5601b.a aVar = s2.u.f46006a;
        Rect rect = c4448h.f38354k;
        List list = Collections.EMPTY_LIST;
        q2.c cVar = new q2.c(this, new q2.e(list, c4448h, "__container", -1L, e.a.PRE_COMP, -1L, null, list, new C5417h(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, e.b.NONE, null, false, null, null, EnumC5447g.NORMAL), c4448h.f38353j, c4448h);
        this.f38437q = cVar;
        if (this.f38440t) {
            cVar.r(true);
        }
        this.f38437q.f45365J = this.f38436p;
    }

    public final void d() {
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        if (choreographerFrameCallbackC5626e.f46553n) {
            choreographerFrameCallbackC5626e.cancel();
            if (!isVisible()) {
                this.f38428g = b.NONE;
            }
        }
        this.f38423b = null;
        this.f38437q = null;
        this.i = null;
        this.f38422Q = -3.4028235E38f;
        choreographerFrameCallbackC5626e.f46552m = null;
        choreographerFrameCallbackC5626e.f46550k = -2.1474836E9f;
        choreographerFrameCallbackC5626e.f46551l = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C4448h c4448h;
        q2.c cVar = this.f38437q;
        if (cVar == null) {
            return;
        }
        EnumC4441a enumC4441a = this.f38417L;
        if (enumC4441a == null) {
            enumC4441a = C4444d.f38338a;
        }
        boolean z10 = enumC4441a == EnumC4441a.ENABLED;
        ThreadPoolExecutor threadPoolExecutor = f38405T;
        Semaphore semaphore = this.f38418M;
        t tVar = this.f38421P;
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        if (z10) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                EnumC4441a enumC4441a2 = C4444d.f38338a;
                if (!z10) {
                    return;
                }
                semaphore.release();
                if (cVar.f45364I == choreographerFrameCallbackC5626e.d()) {
                    return;
                }
            } catch (Throwable th) {
                EnumC4441a enumC4441a3 = C4444d.f38338a;
                if (z10) {
                    semaphore.release();
                    if (cVar.f45364I != choreographerFrameCallbackC5626e.d()) {
                        threadPoolExecutor.execute(tVar);
                    }
                }
                throw th;
            }
        }
        EnumC4441a enumC4441a4 = C4444d.f38338a;
        if (z10 && (c4448h = this.f38423b) != null) {
            float f10 = this.f38422Q;
            float fD = choreographerFrameCallbackC5626e.d();
            this.f38422Q = fD;
            if (Math.abs(fD - f10) * c4448h.b() >= 50.0f) {
                s(choreographerFrameCallbackC5626e.d());
            }
        }
        if (this.f38427f) {
            try {
                if (this.f38444x) {
                    k(canvas, cVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                C5624c.f46540a.getClass();
                EnumC4441a enumC4441a5 = C4444d.f38338a;
            }
        } else if (this.f38444x) {
            k(canvas, cVar);
        } else {
            g(canvas);
        }
        this.f38416K = false;
        if (z10) {
            semaphore.release();
            if (cVar.f45364I == choreographerFrameCallbackC5626e.d()) {
                return;
            }
            threadPoolExecutor.execute(tVar);
        }
    }

    public final void e() {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            return;
        }
        this.f38444x = this.f38443w.useSoftwareRendering(Build.VERSION.SDK_INT, c4448h.f38358o, c4448h.f38359p);
    }

    public final void g(Canvas canvas) {
        q2.c cVar = this.f38437q;
        C4448h c4448h = this.f38423b;
        if (cVar == null || c4448h == null) {
            return;
        }
        Matrix matrix = this.f38445y;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / c4448h.f38354k.width(), r3.height() / c4448h.f38354k.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        cVar.h(canvas, matrix, this.f38438r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f38438r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            return -1;
        }
        return c4448h.f38354k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            return -1;
        }
        return c4448h.f38354k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final C5318a h() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f38431k == null) {
            C5318a c5318a = new C5318a(getCallback());
            this.f38431k = c5318a;
            String str = this.f38433m;
            if (str != null) {
                c5318a.f44053e = str;
            }
        }
        return this.f38431k;
    }

    public final void i() {
        this.f38429h.clear();
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        choreographerFrameCallbackC5626e.h(true);
        Iterator it = choreographerFrameCallbackC5626e.f46538d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC5626e);
        }
        if (isVisible()) {
            return;
        }
        this.f38428g = b.NONE;
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
        if (this.f38416K) {
            return;
        }
        this.f38416K = true;
        if ((!f38403R || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        if (choreographerFrameCallbackC5626e == null) {
            return false;
        }
        return choreographerFrameCallbackC5626e.f46553n;
    }

    public final void j() {
        if (this.f38437q == null) {
            this.f38429h.add(new u(this, 1));
            return;
        }
        e();
        boolean zB = b();
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        if (zB || choreographerFrameCallbackC5626e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC5626e.f46553n = true;
                boolean zG = choreographerFrameCallbackC5626e.g();
                Iterator it = choreographerFrameCallbackC5626e.f46537c.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC5626e, zG);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC5626e);
                    }
                }
                choreographerFrameCallbackC5626e.i((int) (choreographerFrameCallbackC5626e.g() ? choreographerFrameCallbackC5626e.e() : choreographerFrameCallbackC5626e.f()));
                choreographerFrameCallbackC5626e.f46547g = 0L;
                choreographerFrameCallbackC5626e.f46549j = 0;
                if (choreographerFrameCallbackC5626e.f46553n) {
                    choreographerFrameCallbackC5626e.h(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC5626e);
                }
                this.f38428g = b.NONE;
            } else {
                this.f38428g = b.PLAY;
            }
        }
        if (b()) {
            return;
        }
        Iterator<String> it2 = f38404S.iterator();
        C5354h c5354hD = null;
        while (it2.hasNext()) {
            c5354hD = this.f38423b.d(it2.next());
            if (c5354hD != null) {
                break;
            }
        }
        if (c5354hD != null) {
            m((int) c5354hD.f44275b);
        } else {
            m((int) (choreographerFrameCallbackC5626e.f46545e < 0.0f ? choreographerFrameCallbackC5626e.f() : choreographerFrameCallbackC5626e.e()));
        }
        choreographerFrameCallbackC5626e.h(true);
        choreographerFrameCallbackC5626e.a(choreographerFrameCallbackC5626e.g());
        if (isVisible()) {
            return;
        }
        this.f38428g = b.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r10, q2.c r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.z.k(android.graphics.Canvas, q2.c):void");
    }

    public final void l() {
        if (this.f38437q == null) {
            this.f38429h.add(new u(this, 0));
            return;
        }
        e();
        boolean zB = b();
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        if (zB || choreographerFrameCallbackC5626e.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC5626e.f46553n = true;
                choreographerFrameCallbackC5626e.h(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC5626e);
                choreographerFrameCallbackC5626e.f46547g = 0L;
                if (choreographerFrameCallbackC5626e.g() && choreographerFrameCallbackC5626e.i == choreographerFrameCallbackC5626e.f()) {
                    choreographerFrameCallbackC5626e.i(choreographerFrameCallbackC5626e.e());
                } else if (!choreographerFrameCallbackC5626e.g() && choreographerFrameCallbackC5626e.i == choreographerFrameCallbackC5626e.e()) {
                    choreographerFrameCallbackC5626e.i(choreographerFrameCallbackC5626e.f());
                }
                Iterator it = choreographerFrameCallbackC5626e.f46538d.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC5626e);
                }
                this.f38428g = b.NONE;
            } else {
                this.f38428g = b.RESUME;
            }
        }
        if (b()) {
            return;
        }
        m((int) (choreographerFrameCallbackC5626e.f46545e < 0.0f ? choreographerFrameCallbackC5626e.f() : choreographerFrameCallbackC5626e.e()));
        choreographerFrameCallbackC5626e.h(true);
        choreographerFrameCallbackC5626e.a(choreographerFrameCallbackC5626e.g());
        if (isVisible()) {
            return;
        }
        this.f38428g = b.NONE;
    }

    public final void m(final int i) {
        if (this.f38423b == null) {
            this.f38429h.add(new a() { // from class: i2.y
                @Override // i2.z.a
                public final void run() {
                    this.f38401a.m(i);
                }
            });
        } else {
            this.f38424c.i(i);
        }
    }

    public final void n(final int i) {
        if (this.f38423b == null) {
            this.f38429h.add(new a() { // from class: i2.o
                @Override // i2.z.a
                public final void run() {
                    this.f38377a.n(i);
                }
            });
            return;
        }
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        choreographerFrameCallbackC5626e.j(choreographerFrameCallbackC5626e.f46550k, i + 0.99f);
    }

    public final void o(final String str) {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            this.f38429h.add(new a() { // from class: i2.v
                @Override // i2.z.a
                public final void run() {
                    this.f38395a.o(str);
                }
            });
            return;
        }
        C5354h c5354hD = c4448h.d(str);
        if (c5354hD == null) {
            throw new IllegalArgumentException(C1154e9.i("Cannot find marker with name ", str, "."));
        }
        n((int) (c5354hD.f44275b + c5354hD.f44276c));
    }

    public final void p(final String str) {
        C4448h c4448h = this.f38423b;
        ArrayList<a> arrayList = this.f38429h;
        if (c4448h == null) {
            arrayList.add(new a() { // from class: i2.n
                @Override // i2.z.a
                public final void run() {
                    this.f38375a.p(str);
                }
            });
            return;
        }
        C5354h c5354hD = c4448h.d(str);
        if (c5354hD == null) {
            throw new IllegalArgumentException(C1154e9.i("Cannot find marker with name ", str, "."));
        }
        int i = (int) c5354hD.f44275b;
        int i10 = ((int) c5354hD.f44276c) + i;
        if (this.f38423b == null) {
            arrayList.add(new s(this, i, i10));
        } else {
            this.f38424c.j(i, i10 + 0.99f);
        }
    }

    public final void q(final int i) {
        if (this.f38423b == null) {
            this.f38429h.add(new a() { // from class: i2.p
                @Override // i2.z.a
                public final void run() {
                    this.f38379a.q(i);
                }
            });
        } else {
            this.f38424c.j(i, (int) r0.f46551l);
        }
    }

    public final void r(final String str) {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            this.f38429h.add(new a() { // from class: i2.w
                @Override // i2.z.a
                public final void run() {
                    this.f38397a.r(str);
                }
            });
            return;
        }
        C5354h c5354hD = c4448h.d(str);
        if (c5354hD == null) {
            throw new IllegalArgumentException(C1154e9.i("Cannot find marker with name ", str, "."));
        }
        q((int) c5354hD.f44275b);
    }

    public final void s(float f10) {
        C4448h c4448h = this.f38423b;
        if (c4448h == null) {
            this.f38429h.add(new r(this, f10, 1));
            return;
        }
        EnumC4441a enumC4441a = C4444d.f38338a;
        this.f38424c.i(C5628g.e(c4448h.f38355l, c4448h.f38356m, f10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f38438r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C5624c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f38428g;
            if (bVar == b.PLAY) {
                j();
                return visible;
            }
            if (bVar == b.RESUME) {
                l();
                return visible;
            }
        } else {
            if (this.f38424c.f46553n) {
                i();
                this.f38428g = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f38428g = b.NONE;
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
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f38429h.clear();
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = this.f38424c;
        choreographerFrameCallbackC5626e.h(true);
        choreographerFrameCallbackC5626e.a(choreographerFrameCallbackC5626e.g());
        if (isVisible()) {
            return;
        }
        this.f38428g = b.NONE;
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
