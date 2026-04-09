package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6529e;
import l0.C6531g;
import m0.AbstractC6737x0;
import m0.C6668G;
import m0.C6719o0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import p0.C7182c;

/* loaded from: classes.dex */
public final class x1 extends View implements E0.l0 {

    /* renamed from: p, reason: collision with root package name */
    public static final c f29707p = new c(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f29708q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final InterfaceC6839p f29709r = b.f29730a;

    /* renamed from: s, reason: collision with root package name */
    private static final ViewOutlineProvider f29710s = new a();

    /* renamed from: t, reason: collision with root package name */
    private static Method f29711t;

    /* renamed from: u, reason: collision with root package name */
    private static Field f29712u;

    /* renamed from: v, reason: collision with root package name */
    private static boolean f29713v;

    /* renamed from: w, reason: collision with root package name */
    private static boolean f29714w;

    /* renamed from: a, reason: collision with root package name */
    private final r f29715a;

    /* renamed from: b, reason: collision with root package name */
    private final C3948r0 f29716b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6839p f29717c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6824a f29718d;

    /* renamed from: e, reason: collision with root package name */
    private final K0 f29719e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29720f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f29721g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29722h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29723i;

    /* renamed from: j, reason: collision with root package name */
    private final C6719o0 f29724j;

    /* renamed from: k, reason: collision with root package name */
    private final F0 f29725k;

    /* renamed from: l, reason: collision with root package name */
    private long f29726l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29727m;

    /* renamed from: n, reason: collision with root package name */
    private final long f29728n;

    /* renamed from: o, reason: collision with root package name */
    private int f29729o;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC6492s.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((x1) view).f29719e.b();
            AbstractC6492s.f(outlineB);
            outline.set(outlineB);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29730a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return Yg.J.f24997a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return x1.f29713v;
        }

        public final boolean b() {
            return x1.f29714w;
        }

        public final void c(boolean z10) {
            x1.f29714w = z10;
        }

        public final void d(View view) {
            try {
                if (!a()) {
                    x1.f29713v = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        x1.f29711t = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        x1.f29712u = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        x1.f29711t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        x1.f29712u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = x1.f29711t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = x1.f29712u;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = x1.f29712u;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = x1.f29711t;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private c() {
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f29731a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public x1(r rVar, C3948r0 c3948r0, InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a) {
        super(rVar.getContext());
        this.f29715a = rVar;
        this.f29716b = c3948r0;
        this.f29717c = interfaceC6839p;
        this.f29718d = interfaceC6824a;
        this.f29719e = new K0();
        this.f29724j = new C6719o0();
        this.f29725k = new F0(f29709r);
        this.f29726l = androidx.compose.ui.graphics.f.f28939b.a();
        this.f29727m = true;
        setWillNotDraw(false);
        c3948r0.addView(this);
        this.f29728n = View.generateViewId();
    }

    private final m0.U0 getManualClipPath() {
        if (!getClipToOutline() || this.f29719e.e()) {
            return null;
        }
        return this.f29719e.d();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f29722h) {
            this.f29722h = z10;
            this.f29715a.A0(this, z10);
        }
    }

    private final void v() {
        Rect rect;
        if (this.f29720f) {
            Rect rect2 = this.f29721g;
            if (rect2 == null) {
                this.f29721g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC6492s.f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f29721g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void w() {
        setOutlineProvider(this.f29719e.b() != null ? f29710s : null);
    }

    @Override // E0.l0
    public void a(float[] fArr) {
        m0.O0.n(fArr, this.f29725k.b(this));
    }

    @Override // E0.l0
    public boolean b(long j10) {
        float fM = C6531g.m(j10);
        float fN = C6531g.n(j10);
        if (this.f29720f) {
            return 0.0f <= fM && fM < ((float) getWidth()) && 0.0f <= fN && fN < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f29719e.f(j10);
        }
        return true;
    }

    @Override // E0.l0
    public void c(androidx.compose.ui.graphics.d dVar) {
        InterfaceC6824a interfaceC6824a;
        int iZ = dVar.z() | this.f29729o;
        if ((iZ & 4096) != 0) {
            long jT1 = dVar.t1();
            this.f29726l = jT1;
            setPivotX(androidx.compose.ui.graphics.f.f(jT1) * getWidth());
            setPivotY(androidx.compose.ui.graphics.f.g(this.f29726l) * getHeight());
        }
        if ((iZ & 1) != 0) {
            setScaleX(dVar.n());
        }
        if ((iZ & 2) != 0) {
            setScaleY(dVar.K());
        }
        if ((iZ & 4) != 0) {
            setAlpha(dVar.b());
        }
        if ((iZ & 8) != 0) {
            setTranslationX(dVar.F());
        }
        if ((iZ & 16) != 0) {
            setTranslationY(dVar.C());
        }
        if ((iZ & 32) != 0) {
            setElevation(dVar.J());
        }
        if ((iZ & 1024) != 0) {
            setRotation(dVar.w());
        }
        if ((iZ & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            setRotationX(dVar.H());
        }
        if ((iZ & 512) != 0) {
            setRotationY(dVar.u());
        }
        if ((iZ & 2048) != 0) {
            setCameraDistancePx(dVar.E());
        }
        boolean z10 = false;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = dVar.q() && dVar.L() != m0.c1.a();
        if ((iZ & 24576) != 0) {
            this.f29720f = dVar.q() && dVar.L() == m0.c1.a();
            v();
            setClipToOutline(z12);
        }
        boolean zH = this.f29719e.h(dVar.A(), dVar.b(), z12, dVar.J(), dVar.c());
        if (this.f29719e.c()) {
            w();
        }
        boolean z13 = getManualClipPath() != null;
        if (z11 != z13 || (z13 && zH)) {
            invalidate();
        }
        if (!this.f29723i && getElevation() > 0.0f && (interfaceC6824a = this.f29718d) != null) {
            interfaceC6824a.invoke();
        }
        if ((iZ & 7963) != 0) {
            this.f29725k.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((iZ & 64) != 0) {
                z1.f29740a.a(this, AbstractC6737x0.j(dVar.p()));
            }
            if ((iZ & 128) != 0) {
                z1.f29740a.b(this, AbstractC6737x0.j(dVar.M()));
            }
        }
        if (i10 >= 31 && (131072 & iZ) != 0) {
            A1 a12 = A1.f29098a;
            dVar.B();
            a12.a(this, null);
        }
        if ((iZ & 32768) != 0) {
            int iR = dVar.r();
            a.C1065a c1065a = androidx.compose.ui.graphics.a.f28894a;
            if (androidx.compose.ui.graphics.a.e(iR, c1065a.c())) {
                setLayerType(2, null);
            } else if (androidx.compose.ui.graphics.a.e(iR, c1065a.b())) {
                setLayerType(0, null);
                this.f29727m = z10;
            } else {
                setLayerType(0, null);
            }
            z10 = true;
            this.f29727m = z10;
        }
        this.f29729o = dVar.z();
    }

    @Override // E0.l0
    public void d(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        boolean z10 = getElevation() > 0.0f;
        this.f29723i = z10;
        if (z10) {
            interfaceC6717n0.y();
        }
        this.f29716b.a(interfaceC6717n0, this, getDrawingTime());
        if (this.f29723i) {
            interfaceC6717n0.k();
        }
    }

    @Override // E0.l0
    public void destroy() {
        setInvalidated(false);
        this.f29715a.L0();
        this.f29717c = null;
        this.f29718d = null;
        this.f29715a.J0(this);
        this.f29716b.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z10;
        C6719o0 c6719o0 = this.f29724j;
        Canvas canvasA = c6719o0.a().a();
        c6719o0.a().z(canvas);
        C6668G c6668gA = c6719o0.a();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            c6668gA.j();
            this.f29719e.a(c6668gA);
            z10 = true;
        }
        InterfaceC6839p interfaceC6839p = this.f29717c;
        if (interfaceC6839p != null) {
            interfaceC6839p.invoke(c6668gA, null);
        }
        if (z10) {
            c6668gA.r();
        }
        c6719o0.a().z(canvasA);
        setInvalidated(false);
    }

    @Override // E0.l0
    public long e(long j10, boolean z10) {
        if (!z10) {
            return m0.O0.f(this.f29725k.b(this), j10);
        }
        float[] fArrA = this.f29725k.a(this);
        return fArrA != null ? m0.O0.f(fArrA, j10) : C6531g.f52335b.a();
    }

    @Override // E0.l0
    public void f(long j10) {
        int iG = Y0.r.g(j10);
        int iF = Y0.r.f(j10);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.f.f(this.f29726l) * iG);
        setPivotY(androidx.compose.ui.graphics.f.g(this.f29726l) * iF);
        w();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        v();
        this.f29725k.c();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // E0.l0
    public void g(InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a) {
        this.f29716b.addView(this);
        this.f29720f = false;
        this.f29723i = false;
        this.f29726l = androidx.compose.ui.graphics.f.f28939b.a();
        this.f29717c = interfaceC6839p;
        this.f29718d = interfaceC6824a;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C3948r0 getContainer() {
        return this.f29716b;
    }

    public long getLayerId() {
        return this.f29728n;
    }

    public final r getOwnerView() {
        return this.f29715a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f29715a);
        }
        return -1L;
    }

    @Override // E0.l0
    public void h(float[] fArr) {
        float[] fArrA = this.f29725k.a(this);
        if (fArrA != null) {
            m0.O0.n(fArr, fArrA);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f29727m;
    }

    @Override // E0.l0
    public void i(long j10) {
        int iH = Y0.n.h(j10);
        if (iH != getLeft()) {
            offsetLeftAndRight(iH - getLeft());
            this.f29725k.c();
        }
        int i10 = Y0.n.i(j10);
        if (i10 != getTop()) {
            offsetTopAndBottom(i10 - getTop());
            this.f29725k.c();
        }
    }

    @Override // android.view.View, E0.l0
    public void invalidate() {
        if (this.f29722h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f29715a.invalidate();
    }

    @Override // E0.l0
    public void j() {
        if (!this.f29722h || f29714w) {
            return;
        }
        f29707p.d(this);
        setInvalidated(false);
    }

    @Override // E0.l0
    public void k(C6529e c6529e, boolean z10) {
        if (!z10) {
            m0.O0.g(this.f29725k.b(this), c6529e);
            return;
        }
        float[] fArrA = this.f29725k.a(this);
        if (fArrA != null) {
            m0.O0.g(fArrA, c6529e);
        } else {
            c6529e.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    public final boolean u() {
        return this.f29722h;
    }
}
