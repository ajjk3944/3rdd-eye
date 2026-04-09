package j2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.measurement.z3;
import com.liuzh.deviceinfo.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends ViewGroup implements i2.m1, i2.t1, androidx.lifecycle.h, i2.k1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, n1.f {
    public static Class J0;
    public static Method K0;
    public static Method L0;
    public static final x.a0 M0 = new x.a0();
    public static bg.a N0;
    public static Method O0;
    public final f A;
    public final i A0;
    public final p1.f B;
    public boolean B0;
    public final j1.l C;
    public final com.google.android.gms.common.api.internal.k C0;
    public final x.a0 D;
    public final o D0;
    public x.a0 E;
    public final s0 E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public final e4.d G0;
    public final c2.f H;
    public View H0;
    public final c2.s I;
    public final j1 I0;
    public final u0.d1 J;
    public final j1.a K;
    public final j1.c L;
    public boolean M;
    public final h N;
    public final g O;
    public final i2.o1 P;
    public boolean Q;
    public o0 R;
    public d3.a S;
    public boolean T;
    public final i2.s0 U;
    public long V;
    public final int[] W;

    /* renamed from: a, reason: collision with root package name */
    public long f27252a;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f27253a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27254b;

    /* renamed from: b0, reason: collision with root package name */
    public final float[] f27255b0;

    /* renamed from: c, reason: collision with root package name */
    public z1.a f27256c;

    /* renamed from: c0, reason: collision with root package name */
    public long f27257c0;

    /* renamed from: d, reason: collision with root package name */
    public final i2.g0 f27258d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f27259d0;

    /* renamed from: e, reason: collision with root package name */
    public l1 f27260e;

    /* renamed from: e0, reason: collision with root package name */
    public long f27261e0;

    /* renamed from: f, reason: collision with root package name */
    public m1 f27262f;

    /* renamed from: f0, reason: collision with root package name */
    public final u0.d1 f27263f0;
    public d1.d g;

    /* renamed from: g0, reason: collision with root package name */
    public final u0.d0 f27264g0;

    /* renamed from: h, reason: collision with root package name */
    public final zj.l f27265h;

    /* renamed from: h0, reason: collision with root package name */
    public mk.c f27266h0;

    /* renamed from: i, reason: collision with root package name */
    public final i f27267i;

    /* renamed from: i0, reason: collision with root package name */
    public final km.o f27268i0;
    public final u0.d1 j;

    /* renamed from: j0, reason: collision with root package name */
    public final w2.d f27269j0;

    /* renamed from: k, reason: collision with root package name */
    public final View f27270k;

    /* renamed from: k0, reason: collision with root package name */
    public final AtomicReference f27271k0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27272l;

    /* renamed from: l0, reason: collision with root package name */
    public final j1 f27273l0;

    /* renamed from: m, reason: collision with root package name */
    public final xz f27274m;

    /* renamed from: m0, reason: collision with root package name */
    public final b8.e f27275m0;

    /* renamed from: n, reason: collision with root package name */
    public ck.h f27276n;

    /* renamed from: n0, reason: collision with root package name */
    public final u0.d1 f27277n0;

    /* renamed from: o, reason: collision with root package name */
    public final l1.b f27278o;

    /* renamed from: o0, reason: collision with root package name */
    public final u0.d1 f27279o0;

    /* renamed from: p, reason: collision with root package name */
    public final k1 f27280p;

    /* renamed from: p0, reason: collision with root package name */
    public final x1.b f27281p0;

    /* renamed from: q, reason: collision with root package name */
    public final p1.r f27282q;

    /* renamed from: q0, reason: collision with root package name */
    public final y1.c f27283q0;

    /* renamed from: r, reason: collision with root package name */
    public final n0 f27284r;

    /* renamed from: r0, reason: collision with root package name */
    public final h2.b f27285r0;

    /* renamed from: s, reason: collision with root package name */
    public final g2.p f27286s;

    /* renamed from: s0, reason: collision with root package name */
    public final j1 f27287s0;

    /* renamed from: t, reason: collision with root package name */
    public final i2.e0 f27288t;

    /* renamed from: t0, reason: collision with root package name */
    public MotionEvent f27289t0;

    /* renamed from: u, reason: collision with root package name */
    public final x.u f27290u;

    /* renamed from: u0, reason: collision with root package name */
    public long f27291u0;

    /* renamed from: v, reason: collision with root package name */
    public final q2.b f27292v;

    /* renamed from: v0, reason: collision with root package name */
    public final y4.a f27293v0;

    /* renamed from: w, reason: collision with root package name */
    public final r f27294w;

    /* renamed from: w0, reason: collision with root package name */
    public final x.a0 f27295w0;

    /* renamed from: x, reason: collision with root package name */
    public final p2.r f27296x;

    /* renamed from: x0, reason: collision with root package name */
    public float f27297x0;

    /* renamed from: y, reason: collision with root package name */
    public final x f27298y;

    /* renamed from: y0, reason: collision with root package name */
    public float f27299y0;

    /* renamed from: z, reason: collision with root package name */
    public k1.e f27300z;

    /* renamed from: z0, reason: collision with root package name */
    public final b5.o f27301z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, ck.h hVar) {
        j1.c cVar;
        super(context);
        r rVar = this;
        rVar.f27252a = 9205357640488583168L;
        rVar.f27254b = true;
        rVar.f27258d = new i2.g0();
        rVar.g = d1.a.f21930a;
        rVar.f27265h = new zj.l();
        rVar.f27267i = new i(rVar, 0);
        d3.e eVarA = com.bumptech.glide.f.a(context);
        u0.e eVar = u0.e.f34770e;
        rVar.j = new u0.d1(eVarA, eVar);
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = i4 >= 35;
        rVar.f27272l = z3;
        p2.e eVar2 = new p2.e();
        rVar.f27274m = new xz(rVar, rVar);
        rVar.f27276n = hVar;
        rVar.f27278o = new l1.b();
        rVar.f27280p = new k1();
        rVar.f27282q = new p1.r();
        rVar.f27284r = new n0(ViewConfiguration.get(context));
        rVar.f27286s = new g2.p();
        i2.e0 e0Var = new i2.e0(3);
        e0Var.c0(g2.w0.f24428b);
        e0Var.Z(rVar.getDensity());
        e0Var.e0(rVar.getViewConfiguration());
        e0Var.d0(d.h.j(new q(rVar), (n1.i) ((xz) rVar.getFocusOwner()).f18588e).b(rVar.m191getDragAndDropManager().f28540c));
        rVar.f27288t = e0Var;
        x.u uVar = x.k.f36911a;
        rVar.f27290u = new x.u();
        rVar.getLayoutNodes();
        rVar.f27292v = new q2.b();
        rVar.f27294w = rVar;
        rVar.f27296x = new p2.r(rVar.getRoot(), eVar2, rVar.getLayoutNodes());
        x xVar = new x(rVar);
        rVar.f27298y = xVar;
        rVar.f27300z = new k1.e(rVar, new c0.h0(0, rVar, d0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 1));
        f fVar = new f();
        Object systemService = context.getSystemService("accessibility");
        nk.k.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        rVar.A = fVar;
        rVar.B = new p1.f(rVar);
        rVar.C = new j1.l();
        rVar.D = new x.a0();
        rVar.H = new c2.f(0);
        i2.e0 root = rVar.getRoot();
        c2.s sVar = new c2.s();
        sVar.f2684b = root;
        sVar.f2685c = new c2.d((i2.q) root.G.f19257d);
        sVar.f2686d = new jf.c(5);
        sVar.f2687e = new i2.o();
        rVar.I = sVar;
        rVar.J = u0.q.r(new Configuration(context.getResources().getConfiguration()));
        rVar.K = i() ? new j1.a(rVar, rVar.getAutofillTree()) : null;
        if (i()) {
            AutofillManager autofillManagerF = f4.b.f(context.getSystemService(f4.b.i()));
            if (autofillManagerF == null) {
                throw d.h.o("Autofill service could not be located.");
            }
            rVar = this;
            cVar = new j1.c(new j1.q(autofillManagerF), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            cVar = null;
        }
        rVar.L = cVar;
        rVar.N = new h(context);
        rVar.m190getClipboardManager();
        rVar.O = new g();
        rVar.P = new i2.o1(new n(rVar, 1));
        rVar.U = new i2.s0(rVar.getRoot());
        long j = Integer.MAX_VALUE;
        rVar.V = (j & 4294967295L) | (j << 32);
        rVar.W = new int[]{0, 0};
        float[] fArrI = p1.z.i();
        rVar.f27253a0 = p1.z.i();
        rVar.f27255b0 = p1.z.i();
        rVar.f27257c0 = -1L;
        rVar.f27261e0 = 9187343241974906880L;
        rVar.f27263f0 = u0.q.r(null);
        rVar.f27264g0 = u0.q.l(new o(rVar, 2));
        View view = rVar.getView();
        new km.n(view);
        Choreographer.getInstance();
        km.o oVar = new km.o();
        oVar.f28445a = view;
        long j8 = s2.g0.f33386b;
        int length = new s2.e("").f33365b.length();
        int i10 = s2.g0.f33387c;
        int i11 = (int) (j8 >> 32);
        int i12 = i11 < 0 ? 0 : i11;
        i12 = i12 > length ? length : i12;
        int i13 = (int) (j8 & 4294967295L);
        int i14 = i13 < 0 ? 0 : i13;
        length = i14 <= length ? i14 : length;
        if (i12 != i11 || length != i13) {
            s2.z.b(i12, length);
        }
        int i15 = w2.b.f36417e;
        new ArrayList();
        oVar.f28446b = a.a.t(yj.g.f37636b, new w2.c(1, oVar));
        new CursorAnchorInfo.Builder();
        new Matrix();
        rVar.f27268i0 = oVar;
        w2.d dVar = new w2.d();
        new AtomicReference(null);
        rVar.f27269j0 = dVar;
        rVar.f27271k0 = new AtomicReference(null);
        rVar.getTextInputService();
        rVar.f27273l0 = new j1();
        rVar.f27275m0 = new b8.e(context);
        rVar.f27277n0 = new u0.d1(u6.t.h(context), eVar);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = n1.d.f29515a;
        d3.l lVar = d3.l.f21966a;
        d3.l lVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : d3.l.f21967b : lVar;
        rVar.f27279o0 = u0.q.r(lVar2 != null ? lVar2 : lVar);
        rVar.f27281p0 = new x1.b();
        rVar.f27283q0 = new y1.c(rVar.isInTouchMode() ? 1 : 2);
        h2.b bVar = new h2.b();
        new w0.e(new i2.b[16]);
        new w0.e(new com.google.android.gms.internal.play_billing.m1[16]);
        new w0.e(new i2.e0[16]);
        new w0.e(new com.google.android.gms.internal.play_billing.m1[16]);
        rVar.f27285r0 = bVar;
        rVar.f27287s0 = new j1();
        rVar.f27293v0 = new y4.a(26);
        rVar.f27295w0 = new x.a0();
        rVar.f27301z0 = new b5.o(21, rVar);
        int i16 = 1;
        rVar.A0 = new i(rVar, i16);
        rVar.C0 = new com.google.android.gms.common.api.internal.k(context, new n(rVar, 0));
        rVar.D0 = new o(rVar, i16);
        rVar.E0 = i4 < 29 ? new t0(fArrI) : new u0();
        rVar.addOnAttachStateChangeListener(rVar.f27300z);
        rVar.setWillNotDraw(false);
        rVar.setFocusable(true);
        if (i4 >= 26) {
            c0.f27101a.a(rVar, 1, false);
        }
        rVar.setFocusableInTouchMode(true);
        rVar.setClipChildren(false);
        e4.v0.o(rVar, xVar);
        rVar.setOnDragListener(rVar.m191getDragAndDropManager());
        rVar.getRoot().d(rVar);
        if (i4 >= 29) {
            z.f27360a.a(rVar);
        }
        if (z3) {
            View view2 = new View(context);
            view2.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view2.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            rVar.f27270k = view2;
            rVar.addView(view2, -1);
        }
        rVar.G0 = i4 >= 31 ? new e4.d() : null;
        j1 j1Var = new j1();
        c2.n.f2657a.getClass();
        rVar.I0 = j1Var;
    }

    public static final void b(r rVar, int i4, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        x xVar = rVar.f27298y;
        if (nk.k.a(str, xVar.E)) {
            int iD2 = xVar.C.d(i4);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!nk.k.a(str, xVar.F) || (iD = xVar.D.d(i4)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k get_viewTreeOwners() {
        return (k) this.f27263f0.getValue();
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt instanceof r) {
                ((r) childAt).A();
            } else if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt);
            }
        }
    }

    public static long k(int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View n(int i4, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (nk.k.a(declaredMethod.invoke(view, null), Integer.valueOf(i4))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View viewN = n(i4, viewGroup.getChildAt(i10));
                    if (viewN != null) {
                        return viewN;
                    }
                }
            }
        }
        return null;
    }

    public static void q(i2.e0 e0Var) {
        e0Var.D();
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            q((i2.e0) objArr[i10]);
        }
    }

    public static boolean s(MotionEvent motionEvent) {
        boolean z3 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z3) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 1; i4 < pointerCount; i4++) {
                z3 = (Float.floatToRawIntBits(motionEvent.getX(i4)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i4)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !p1.f27250a.a(motionEvent, i4));
                if (z3) {
                    break;
                }
            }
        }
        return z3;
    }

    private void setDensity(d3.c cVar) {
        this.j.setValue(cVar);
    }

    private void setFontFamilyResolver(v2.d dVar) {
        this.f27277n0.setValue(dVar);
    }

    private void setLayoutDirection(d3.l lVar) {
        this.f27279o0.setValue(lVar);
    }

    private final void set_viewTreeOwners(k kVar) {
        this.f27263f0.setValue(kVar);
    }

    public final void A() {
        j1.c cVar;
        if (this.M) {
            g1.u uVar = getSnapshotObserver().f25732a;
            synchronized (uVar.g) {
                try {
                    w0.e eVar = uVar.f24291f;
                    int i4 = eVar.f36399c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i4; i11++) {
                        g1.t tVar = (g1.t) eVar.f36397a[i11];
                        tVar.d();
                        if (!tVar.f24280f.j()) {
                            i10++;
                        } else if (i10 > 0) {
                            Object[] objArr = eVar.f36397a;
                            objArr[i11 - i10] = objArr[i11];
                        }
                    }
                    int i12 = i4 - i10;
                    Arrays.fill(eVar.f36397a, i12, i4, (Object) null);
                    eVar.f36399c = i12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.M = false;
        }
        o0 o0Var = this.R;
        if (o0Var != null) {
            j(o0Var);
        }
        if (i() && (cVar = this.L) != null) {
            x.v vVar = cVar.g;
            if (vVar.f36950d == 0 && cVar.f27047h) {
                cVar.f27041a.b();
                cVar.f27047h = false;
            }
            if (vVar.f36950d != 0) {
                cVar.f27047h = true;
            }
        }
        while (this.f27295w0.i() && this.f27295w0.f(0) != null) {
            int i13 = this.f27295w0.f36847b;
            for (int i14 = 0; i14 < i13; i14++) {
                mk.a aVar = (mk.a) this.f27295w0.f(i14);
                x.a0 a0Var = this.f27295w0;
                if (i14 < 0 || i14 >= a0Var.f36847b) {
                    a0Var.n(i14);
                    throw null;
                }
                Object[] objArr2 = a0Var.f36846a;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f27295w0.l(0, i13);
        }
    }

    public final void B(i2.e0 e0Var) {
        x xVar = this.f27298y;
        xVar.f27355y = true;
        if (xVar.v()) {
            xVar.w(e0Var);
        }
        k1.e eVar = this.f27300z;
        eVar.g = true;
        if (eVar.h()) {
            eVar.f27798h.l(yj.u.f37649a);
        }
    }

    public final void C(i2.e0 e0Var, boolean z3, boolean z10, boolean z11) {
        i2.e0 e0VarV;
        i2.e0 e0VarV2;
        i2.s0 s0Var = this.U;
        if (!z3) {
            if (s0Var.p(e0Var, z10) && z11) {
                I(e0Var);
                return;
            }
            return;
        }
        i0.f fVar = s0Var.f25777b;
        i2.e0 e0Var2 = e0Var.f25634i;
        i2.i0 i0Var = e0Var.H;
        if (e0Var2 == null) {
            f2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = i0Var.f25677d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new ac.m();
                }
                if (!i0Var.f25678e || z10) {
                    i0Var.f25678e = true;
                    i0Var.f25687p.f25799u = true;
                    if (e0Var.R) {
                        return;
                    }
                    if ((nk.k.a(e0Var.J(), Boolean.TRUE) || i2.s0.h(e0Var)) && ((e0VarV = e0Var.v()) == null || !e0VarV.H.f25678e)) {
                        fVar.p(e0Var, i2.r.f25762a);
                    } else if ((e0Var.I() || i2.s0.i(e0Var)) && ((e0VarV2 = e0Var.v()) == null || !e0VarV2.r())) {
                        fVar.p(e0Var, i2.r.f25764c);
                    }
                    if (s0Var.f25779d || !z11) {
                        return;
                    }
                    I(e0Var);
                    return;
                }
                return;
            }
        }
        s0Var.f25782h.b(new i2.r0(e0Var, true, z10));
    }

    public final void D(i2.e0 e0Var, boolean z3, boolean z10) {
        i2.i0 i0Var = e0Var.H;
        i2.r rVar = i2.r.f25765d;
        i2.s0 s0Var = this.U;
        if (!z3) {
            s0Var.getClass();
            int iOrdinal = i0Var.f25677d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new ac.m();
            }
            i2.e0 e0VarV = e0Var.v();
            boolean z11 = e0VarV == null || e0VarV.I();
            if (!z10) {
                if (e0Var.r()) {
                    return;
                }
                if (e0Var.q() && e0Var.I() == z11 && e0Var.I() == i0Var.f25687p.f25798t) {
                    return;
                }
            }
            i2.u0 u0Var = i0Var.f25687p;
            u0Var.f25800v = true;
            u0Var.f25801w = true;
            if (!e0Var.R && u0Var.f25798t && z11) {
                if ((e0VarV == null || !e0VarV.q()) && (e0VarV == null || !e0VarV.r())) {
                    s0Var.f25777b.p(e0Var, rVar);
                }
                if (s0Var.f25779d) {
                    return;
                }
                I(null);
                return;
            }
            return;
        }
        i0.f fVar = s0Var.f25777b;
        int iOrdinal2 = i0Var.f25677d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new ac.m();
                }
            }
        }
        if ((i0Var.f25678e || i0Var.f25679f) && !z10) {
            return;
        }
        i0Var.f25679f = true;
        i0Var.g = true;
        i2.u0 u0Var2 = i0Var.f25687p;
        u0Var2.f25800v = true;
        u0Var2.f25801w = true;
        if (e0Var.R) {
            return;
        }
        i2.e0 e0VarV2 = e0Var.v();
        if (nk.k.a(e0Var.J(), Boolean.TRUE) && ((e0VarV2 == null || !e0VarV2.H.f25678e) && (e0VarV2 == null || !e0VarV2.H.f25679f))) {
            fVar.p(e0Var, i2.r.f25763b);
        } else if (e0Var.I() && ((e0VarV2 == null || !e0VarV2.q()) && (e0VarV2 == null || !e0VarV2.r()))) {
            fVar.p(e0Var, rVar);
        }
        if (s0Var.f25779d) {
            return;
        }
        I(null);
    }

    public final void E() {
        x xVar = this.f27298y;
        xVar.f27355y = true;
        if (xVar.v() && !xVar.J) {
            xVar.J = true;
            xVar.j.post(xVar.L);
        }
        k1.e eVar = this.f27300z;
        eVar.g = true;
        if (!eVar.h() || eVar.f27803n) {
            return;
        }
        eVar.f27803n = true;
        eVar.f27799i.post(eVar.f27804o);
    }

    public final void F() {
        if (this.f27259d0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f27257c0) {
            this.f27257c0 = jCurrentAnimationTimeMillis;
            s0 s0Var = this.E0;
            float[] fArr = this.f27253a0;
            s0Var.a(this, fArr);
            d0.m(fArr, this.f27255b0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.W;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = iArr[0];
            float f13 = f11 - iArr[1];
            this.f27261e0 = (Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        }
    }

    public final void G(MotionEvent motionEvent) {
        this.f27257c0 = AnimationUtils.currentAnimationTimeMillis();
        s0 s0Var = this.E0;
        float[] fArr = this.f27253a0;
        s0Var.a(this, fArr);
        d0.m(fArr, this.f27255b0);
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jP = p1.z.p(fArr, (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jP >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jP & 4294967295L));
        this.f27261e0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean H() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void I(i2.e0 e0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (e0Var != null) {
            while (e0Var != null && e0Var.s() == i2.c0.f25587a) {
                if (!this.T) {
                    i2.e0 e0VarV = e0Var.v();
                    if (e0VarV == null) {
                        break;
                    }
                    long j = ((i2.q) e0VarV.G.f19257d).f24411d;
                    if (d3.a.f(j) && d3.a.e(j)) {
                        break;
                    }
                }
                e0Var = e0Var.v();
            }
            if (e0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long J(long j) {
        F();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f27261e0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f27261e0 & 4294967295L));
        return p1.z.p(this.f27255b0, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final int K(MotionEvent motionEvent) {
        Object obj;
        if (this.F0) {
            this.F0 = false;
            int metaState = motionEvent.getMetaState();
            this.f27280p.getClass();
            c2.f27105a.setValue(new c2.b0(metaState));
        }
        c2.f fVar = this.H;
        yb.i iVarC = fVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        c2.s sVar = this.I;
        if (iVarC == null) {
            if (!sVar.f2683a) {
                ((x.o) ((jf.c) sVar.f2686d).f27642b).b();
                ((c2.d) sVar.f2685c).c();
            }
            return 0;
        }
        List list = (List) iVarC.f37516b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                obj = list.get(size);
                if (((c2.r) obj).f2678e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
            obj = null;
        } else {
            obj = null;
        }
        c2.r rVar = (c2.r) obj;
        if (rVar != null) {
            this.f27252a = rVar.f2677d;
        }
        int iA = sVar.a(iVarC, this, t(motionEvent));
        iVarC.f37517c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ((SparseBooleanArray) fVar.f2609e).delete(pointerId);
        ((SparseLongArray) fVar.f2608d).delete(pointerId);
        return iA;
    }

    public final void L(MotionEvent motionEvent, int i4, long j, boolean z3) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i4 != 9 && i4 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            float f10 = pointerCoords.x;
            long jV = v((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jV >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jV & 4294967295L));
            i12++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i4, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z3 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        yb.i iVarC = this.H.c(motionEventObtain, this);
        nk.k.b(iVarC);
        this.I.a(iVarC, this, true);
        motionEventObtain.recycle();
    }

    public final void M(Configuration configuration) {
        u0.d1 d1Var;
        Configuration configuration2 = getConfiguration();
        if (nk.k.a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(com.bumptech.glide.f.a(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (d1Var = this.f27280p.f27210b) != null) {
            d1Var.setValue(d0.e(this));
        }
        int i4 = Build.VERSION.SDK_INT;
        if ((i4 >= 31 ? configuration2.fontWeightAdjustment : 0) != (i4 >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(u6.t.h(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.r.N():void");
    }

    public final void O(float f10) {
        if (this.f27272l) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.f27297x0) || f10 > this.f27297x0) {
                    this.f27297x0 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.f27299y0) || f10 < this.f27299y0) {
                    this.f27299y0 = f10;
                }
            }
        }
    }

    @Override // n1.f
    public final void a(n1.s sVar, n1.s sVar2) {
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        com.google.android.gms.internal.consent_sdk.a0 a0Var2;
        if (sVar != null) {
            n1.s sVar3 = sVar;
            if (!sVar3.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            i1.m mVar = sVar3.f25554a;
            i2.e0 e0VarS = i2.k.s(sVar);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (e0VarS != null) {
                if ((((i1.m) e0VarS.G.g).f25557d & 2097152) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & 2097152) != 0) {
                            i1.m mVarE = mVar;
                            w0.e eVar = null;
                            while (mVarE != null) {
                                if (mVarE instanceof z1.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(mVarE);
                                } else if ((mVarE.f25556c & 2097152) != 0 && (mVarE instanceof i2.j)) {
                                    int i4 = 0;
                                    for (i1.m mVar2 = ((i2.j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                                        if ((mVar2.f25556c & 2097152) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                mVarE = mVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (mVarE != null) {
                                                    eVar.b(mVarE);
                                                    mVarE = null;
                                                }
                                                eVar.b(mVar2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                mVarE = i2.k.e(eVar);
                            }
                        }
                        mVar = mVar.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var2 = e0VarS.G) == null) ? null : (i2.w1) a0Var2.f19259f;
            }
            if (arrayList == null) {
                return;
            }
            if (sVar2 != null) {
                if (!sVar2.f25554a.f25565n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                i1.m mVar3 = sVar2.f25554a;
                i2.e0 e0VarS2 = i2.k.s(sVar2);
                LinkedHashSet linkedHashSet2 = null;
                while (e0VarS2 != null) {
                    if ((((i1.m) e0VarS2.G.g).f25557d & 2097152) != 0) {
                        while (mVar3 != null) {
                            if ((mVar3.f25556c & 2097152) != 0) {
                                i1.m mVarE2 = mVar3;
                                w0.e eVar2 = null;
                                while (mVarE2 != null) {
                                    if (mVarE2 instanceof z1.c) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(mVarE2);
                                    } else if ((mVarE2.f25556c & 2097152) != 0 && (mVarE2 instanceof i2.j)) {
                                        int i10 = 0;
                                        for (i1.m mVar4 = ((i2.j) mVarE2).f25691p; mVar4 != null; mVar4 = mVar4.f25559f) {
                                            if ((mVar4.f25556c & 2097152) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    mVarE2 = mVar4;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new w0.e(new i1.m[16]);
                                                    }
                                                    if (mVarE2 != null) {
                                                        eVar2.b(mVarE2);
                                                        mVarE2 = null;
                                                    }
                                                    eVar2.b(mVar4);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    mVarE2 = i2.k.e(eVar2);
                                }
                            }
                            mVar3 = mVar3.f25558e;
                        }
                    }
                    e0VarS2 = e0VarS2.v();
                    mVar3 = (e0VarS2 == null || (a0Var = e0VarS2.G) == null) ? null : (i2.w1) a0Var.f19259f;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                z1.c cVar = (z1.c) arrayList.get(i11);
                if (!(linkedHashSet != null ? linkedHashSet.contains(cVar) : false)) {
                    cVar.K();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i10) {
        n1.s sVar = (n1.s) ((xz) getFocusOwner()).f18586c;
        if (!sVar.f25565n) {
            return;
        }
        if (!sVar.f25554a.f25565n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        w0.e eVar = new w0.e(new i1.m[16]);
        i1.m mVar = sVar.f25554a;
        i1.m mVar2 = mVar.f25559f;
        if (mVar2 == null) {
            i2.k.b(eVar, mVar);
        } else {
            eVar.b(mVar2);
        }
        while (true) {
            int i11 = eVar.f36399c;
            if (i11 == 0) {
                return;
            }
            i1.m mVar3 = (i1.m) eVar.l(i11 - 1);
            if ((mVar3.f25557d & Segment.SHARE_MINIMUM) != 0) {
                for (i1.m mVar4 = mVar3; mVar4 != null && mVar4.f25565n; mVar4 = mVar4.f25559f) {
                    if ((mVar4.f25556c & Segment.SHARE_MINIMUM) != 0) {
                        i1.m mVarE = mVar4;
                        w0.e eVar2 = null;
                        while (mVarE != null) {
                            int i12 = 0;
                            if (mVarE instanceof n1.s) {
                                n1.s sVar2 = (n1.s) mVarE;
                                if (sVar2.f25565n && sVar2.r0().f29530a) {
                                    super.addFocusables(arrayList, i4, i10);
                                    n1.s sVar3 = (n1.s) ((xz) getFocusOwner()).f18586c;
                                    if (sVar3.f25565n) {
                                        if (!sVar3.f25554a.f25565n) {
                                            f2.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        w0.e eVar3 = new w0.e(new i1.m[16]);
                                        i1.m mVar5 = sVar3.f25554a;
                                        i1.m mVar6 = mVar5.f25559f;
                                        if (mVar6 == null) {
                                            i2.k.b(eVar3, mVar5);
                                        } else {
                                            eVar3.b(mVar6);
                                        }
                                        while (true) {
                                            int i13 = eVar3.f36399c;
                                            if (i13 == 0) {
                                                break;
                                            }
                                            i1.m mVar7 = (i1.m) eVar3.l(i13 - 1);
                                            if ((mVar7.f25557d & Segment.SHARE_MINIMUM) != 0) {
                                                for (i1.m mVar8 = mVar7; mVar8 != null && mVar8.f25565n; mVar8 = mVar8.f25559f) {
                                                    if ((mVar8.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                                        i1.m mVarE2 = mVar8;
                                                        w0.e eVar4 = null;
                                                        while (mVarE2 != null) {
                                                            if (mVarE2 instanceof n1.s) {
                                                                n1.s sVar4 = (n1.s) mVarE2;
                                                                if (sVar4.f25565n) {
                                                                    n1.n nVarR0 = sVar4.r0();
                                                                    if (sVar4.f25565n && !sVar4.f29549o && nVarR0.f29530a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((mVarE2.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE2 instanceof i2.j)) {
                                                                int i14 = 0;
                                                                for (i1.m mVar9 = ((i2.j) mVarE2).f25691p; mVar9 != null; mVar9 = mVar9.f25559f) {
                                                                    if ((mVar9.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                                                        i14++;
                                                                        if (i14 == 1) {
                                                                            mVarE2 = mVar9;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new w0.e(new i1.m[16]);
                                                                            }
                                                                            if (mVarE2 != null) {
                                                                                eVar4.b(mVarE2);
                                                                                mVarE2 = null;
                                                                            }
                                                                            eVar4.b(mVar9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i14 == 1) {
                                                                }
                                                            }
                                                            mVarE2 = i2.k.e(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            i2.k.b(eVar3, mVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                for (i1.m mVar10 = ((i2.j) mVarE).f25691p; mVar10 != null; mVar10 = mVar10.f25559f) {
                                    if ((mVar10.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            mVarE = mVar10;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar2.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar2.b(mVar10);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar2);
                        }
                    }
                }
            }
            i2.k.b(eVar, mVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (i()) {
            j1.c cVar = this.L;
            if (cVar != null) {
                cVar.b(sparseArray);
            }
            j1.a aVar = this.K;
            if (aVar != null) {
                ub.a.l(aVar, sparseArray);
            }
        }
    }

    @Override // androidx.lifecycle.h
    public final void c(androidx.lifecycle.a0 a0Var) {
        u0.f fVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(d0.k());
        }
        m1 m1Var = this.f27262f;
        if (m1Var != null) {
            l1 l1Var = this.f27260e;
            nk.k.b(l1Var);
            o7.d dVar = m1Var.f27232a;
            d1.c cVar = (d1.c) dVar.f30421b;
            if (!cVar.f21932a || cVar.f21934c) {
                return;
            }
            try {
                fVarS = ((n2) l1Var).f27240a.s(new b2.b(16, m1Var));
            } catch (CancellationException unused) {
                d1.c cVar2 = (d1.c) dVar.f30421b;
                if (!cVar2.f21933b) {
                    if (cVar2.f21934c) {
                        e1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar2.a();
                    cVar2.f21934c = true;
                }
                fVarS = null;
            }
            u0.f fVar = m1Var.f27235d;
            if (fVar != null) {
                fVar.cancel();
            }
            m1Var.f27235d = fVarS;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i4) {
        return this.f27298y.m(this.f27252a, i4, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i4) {
        return this.f27298y.m(this.f27252a, i4, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            q(getRoot());
        }
        w(true);
        g1.m.j().m();
        this.F = true;
        p1.r rVar = this.f27282q;
        p1.c cVar = rVar.f31012a;
        Canvas canvas2 = cVar.f30949a;
        cVar.f30949a = canvas;
        getRoot().j(cVar, null);
        rVar.f31012a.f30949a = canvas2;
        x.a0 a0Var = this.D;
        if (a0Var.i()) {
            int i4 = a0Var.f36847b;
            for (int i10 = 0; i10 < i4; i10++) {
                ((g1) ((i2.l1) a0Var.f(i10))).g();
            }
        }
        int i11 = a2.f27088a;
        a0Var.d();
        this.F = false;
        x.a0 a0Var2 = this.E;
        if (a0Var2 != null) {
            a0Var.c(a0Var2);
            a0Var2.d();
        }
        if (this.f27272l) {
            q0.a(this, this.f27297x0);
            View view = this.f27270k;
            if (view == null) {
                nk.k.k("frameRateCategoryView");
                throw null;
            }
            q0.a(view, this.f27299y0);
            if (!Float.isNaN(this.f27299y0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f27297x0 = Float.NaN;
            this.f27299y0 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:327:0x050b A[PHI: r6
  0x050b: PHI (r6v52 w0.e) = (r6v75 w0.e), (r6v76 w0.e), (r6v77 w0.e) binds: [B:308:0x04cd, B:310:0x04d1, B:325:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x06e6 A[PHI: r5
  0x06e6: PHI (r5v38 w0.e) = (r5v94 w0.e), (r5v95 w0.e), (r5v96 w0.e) binds: [B:443:0x06ac, B:445:0x06b0, B:460:0x06e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r5v86 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 2019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.r.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.r.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((xz) getFocusOwner()).f(keyEvent, new c2.c(8, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f27280p.getClass();
        c2.f27105a.setValue(new c2.b0(metaState));
        return ((xz) getFocusOwner()).f(keyEvent, n1.g.f29522a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        if (isFocused()) {
            xz xzVar = (xz) getFocusOwner();
            if (((n1.e) xzVar.f18587d).f29521e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                n1.s sVarE = z3.e((n1.s) xzVar.f18586c);
                if (sVarE != null) {
                    if (!sVarE.f25554a.f25565n) {
                        f2.a.b("visitAncestors called on an unattached node");
                    }
                    i1.m mVar = sVarE.f25554a;
                    i2.e0 e0VarS = i2.k.s(sVarE);
                    while (e0VarS != null) {
                        if ((((i1.m) e0VarS.G.g).f25557d & 131072) != 0) {
                            while (mVar != null) {
                                if ((mVar.f25556c & 131072) != 0) {
                                    i1.m mVarE = mVar;
                                    w0.e eVar = null;
                                    while (mVarE != null) {
                                        if ((mVarE.f25556c & 131072) != 0 && (mVarE instanceof i2.j)) {
                                            int i4 = 0;
                                            for (i1.m mVar2 = ((i2.j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                                                if ((mVar2.f25556c & 131072) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        mVarE = mVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new w0.e(new i1.m[16]);
                                                        }
                                                        if (mVarE != null) {
                                                            eVar.b(mVarE);
                                                            mVarE = null;
                                                        }
                                                        eVar.b(mVar2);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        mVarE = i2.k.e(eVar);
                                    }
                                }
                                mVar = mVar.f25558e;
                            }
                        }
                        e0VarS = e0VarS.v();
                        mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (i2.w1) a0Var.f19259f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            y.f27358a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object r0Var;
        n1.s sVarH;
        if (this.B0) {
            i iVar = this.A0;
            removeCallbacks(iVar);
            MotionEvent motionEvent2 = this.f27289t0;
            nk.k.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.B0 = false;
            } else {
                iVar.run();
            }
        }
        if (!s(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || u(motionEvent))) {
            int iP = p(motionEvent);
            if ((iP & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z3 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z10 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z3 && z10) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (r0Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    r0Var = new r0(1);
                }
                if (r0Var.equals(new r0(1)) && (sVarH = ((xz) getFocusOwner()).h()) != null) {
                    i2.d1 d1VarR = i2.k.r(sVarH);
                    o1.c cVarR = g2.n0.f(d1VarR).r(d1VarR, true);
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L);
                    cVarR.getClass();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (!((fIntBitsToFloat < cVarR.f30368c) & (fIntBitsToFloat >= cVarR.f30366a) & (fIntBitsToFloat2 >= cVarR.f30367b) & (fIntBitsToFloat2 < cVarR.f30369d))) {
                        ((xz) getFocusOwner()).d(8, false, true);
                    }
                }
            }
            if ((iP & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return n(i4, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i4));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i4) {
        o1.c cVarA;
        if (view == null || this.U.f25778c) {
            return super.focusSearch(view, i4);
        }
        View rootView = getRootView();
        nk.k.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i4);
        if (viewFindNextFocus == null || !d0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            n1.s sVarE = z3.e((n1.s) ((xz) getFocusOwner()).f18586c);
            cVarA = sVarE != null ? z3.h(sVarE) : null;
            if (cVarA == null) {
                cVarA = n1.d.a(view, this);
            }
        } else {
            cVarA = n1.d.a(view, this);
        }
        n1.c cVarD = n1.d.d(i4);
        int i10 = cVarD != null ? cVarD.f29514a : 6;
        nk.u uVar = new nk.u();
        if (((xz) getFocusOwner()).g(i10, cVarA, new b2.k(uVar, 1)) == null) {
            return view;
        }
        Object obj = uVar.f29986a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i4);
            }
        } else if (viewFindNextFocus == null || i10 == 1 || i10 == 2 || com.google.android.gms.internal.play_billing.m1.v(z3.h((n1.s) obj), n1.d.a(viewFindNextFocus, this), cVarA, i10)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final o0 getAndroidViewsHandler$ui() {
        if (this.R == null) {
            o0 o0Var = new o0(getContext());
            this.R = o0Var;
            addView(o0Var, -1);
            requestLayout();
        }
        o0 o0Var2 = this.R;
        nk.k.b(o0Var2);
        return o0Var2;
    }

    public j1.g getAutofill() {
        return this.K;
    }

    public j1.k getAutofillManager() {
        return this.L;
    }

    public j1.l getAutofillTree() {
        return this.C;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.J.getValue();
    }

    public final k1.e getContentCaptureManager$ui() {
        return this.f27300z;
    }

    public ck.h getCoroutineContext() {
        return this.f27276n;
    }

    public d3.c getDensity() {
        return (d3.c) this.j.getValue();
    }

    public o1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            n1.s sVarE = z3.e((n1.s) ((xz) getFocusOwner()).f18586c);
            if (sVarE != null) {
                return z3.h(sVarE);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return n1.d.a(viewFindFocus, this);
        }
        return null;
    }

    public n1.h getFocusOwner() {
        return this.f27274m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        o1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f30366a);
            rect.top = Math.round(embeddedViewFocusRect.f30367b);
            rect.right = Math.round(embeddedViewFocusRect.f30368c);
            rect.bottom = Math.round(embeddedViewFocusRect.f30369d);
            return;
        }
        if (nk.k.a(((xz) getFocusOwner()).g(6, null, m.f27226b), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        }
    }

    public v2.d getFontFamilyResolver() {
        return (v2.d) this.f27277n0.getValue();
    }

    public v2.c getFontLoader() {
        return this.f27275m0;
    }

    public final l1 getFrameEndScheduler$ui() {
        return this.f27260e;
    }

    public p1.x getGraphicsContext() {
        return this.B;
    }

    public x1.a getHapticFeedBack() {
        return this.f27281p0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.U.f25777b.H() || !this.f27265h.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public y1.b getInputModeManager() {
        return this.f27283q0;
    }

    public final g2.p getInsetsListener() {
        return this.f27286s;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f27257c0;
    }

    @Override // android.view.View, android.view.ViewParent
    public d3.l getLayoutDirection() {
        return (d3.l) this.f27279o0.getValue();
    }

    public long getMeasureIteration() {
        i2.s0 s0Var = this.U;
        if (!s0Var.f25778c) {
            f2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return s0Var.g;
    }

    public h2.b getModifierLocalManager() {
        return this.f27285r0;
    }

    public g2.r0 getPlacementScope() {
        int i4 = g2.u0.f24423b;
        return new g2.g0(1, this);
    }

    public c2.o getPointerIconService() {
        return this.I0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final z1.a m186getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f27256c;
    }

    public q2.b getRectManager() {
        return this.f27292v;
    }

    public d1.d getRetainedValuesStore() {
        return this.g;
    }

    public i2.e0 getRoot() {
        return this.f27288t;
    }

    public i2.t1 getRootForTest() {
        return this.f27294w;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        e4.d dVar;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.G0) == null) {
            return false;
        }
        return ((Boolean) ((u0.d1) dVar.f22317b).getValue()).booleanValue();
    }

    public p2.r getSemanticsOwner() {
        return this.f27296x;
    }

    public i2.g0 getSharedDrawScope() {
        return this.f27258d;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? p0.f27249a.a(this) : this.Q;
    }

    public i2.o1 getSnapshotObserver() {
        return this.P;
    }

    public t1 getSoftwareKeyboardController() {
        return this.f27273l0;
    }

    public w2.d getTextInputService() {
        return this.f27269j0;
    }

    public u1 getTextToolbar() {
        return this.f27287s0;
    }

    public final i2.s1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public y1 getViewConfiguration() {
        return this.f27284r;
    }

    public final k getViewTreeOwners() {
        return (k) this.f27264g0.getValue();
    }

    public b2 getWindowInfo() {
        return this.f27280p;
    }

    public final j1.c get_autofillManager$ui() {
        return this.L;
    }

    public final i2.l1 l(mk.e eVar, i2.a1 a1Var, s1.b bVar) {
        w0.e eVar2;
        Reference referencePoll;
        Object obj;
        if (bVar != null) {
            return new g1(bVar, null, this, eVar, a1Var);
        }
        do {
            y4.a aVar = this.f27293v0;
            ReferenceQueue referenceQueue = (ReferenceQueue) aVar.f37324b;
            eVar2 = (w0.e) aVar.f37323a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar2.k(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i4 = eVar2.f36399c;
            if (i4 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar2.l(i4 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        i2.l1 l1Var = (i2.l1) obj;
        if (l1Var == null) {
            return new g1(getGraphicsContext().b(), getGraphicsContext(), this, eVar, a1Var);
        }
        g1 g1Var = (g1) l1Var;
        p1.x xVar = g1Var.f27145b;
        if (xVar == null) {
            throw d.h.o("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!g1Var.f27144a.f33247s) {
            f2.a.a("layer should have been released before reuse");
        }
        g1Var.f27144a = xVar.b();
        g1Var.g = false;
        g1Var.f27147d = eVar;
        g1Var.f27148e = a1Var;
        g1Var.f27158q = false;
        g1Var.f27159r = false;
        g1Var.f27160s = true;
        p1.z.r(g1Var.f27150h);
        float[] fArr = g1Var.f27151i;
        if (fArr != null) {
            p1.z.r(fArr);
        }
        g1Var.f27156o = p1.m0.f31006a;
        g1Var.f27161t = false;
        long j = Integer.MAX_VALUE;
        g1Var.f27149f = (j & 4294967295L) | (j << 32);
        g1Var.f27157p = null;
        g1Var.f27155n = 0;
        return l1Var;
    }

    public final void o(i2.e0 e0Var, boolean z3) {
        this.U.f(e0Var, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a6.f fVar;
        androidx.lifecycle.k1 k1Var;
        d1.d dVar;
        androidx.lifecycle.c0 c0VarJ;
        Object obj;
        j1.a aVar;
        super.onAttachedToWindow();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            setShowLayoutBounds(d0.k());
        }
        this.f27286s.onViewAttachedToWindow(this);
        int i10 = 0;
        if (i4 > 28) {
            if (N0 == null) {
                bg.a aVar2 = new bg.a(4);
                N0 = aVar2;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (J0 == null) {
                        J0 = Class.forName("android.os.SystemProperties");
                    }
                    if (L0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = J0;
                        L0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = L0;
                    if (method != null) {
                        method.invoke(null, aVar2);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            x.a0 a0Var = M0;
            synchronized (a0Var) {
                a0Var.a(this);
            }
        }
        this.f27280p.f27211c.setValue(Boolean.valueOf(hasWindowFocus()));
        k1 k1Var2 = this.f27280p;
        o oVar = new o(this, i10);
        u0.d1 d1Var = k1Var2.f27210b;
        if (d1Var == null) {
            k1Var2.f27209a = oVar;
        }
        if (d1Var != null) {
            d1Var.setValue(d0.e(this));
        }
        r(getRoot());
        q(getRoot());
        getSnapshotObserver().a();
        if (i() && (aVar = this.K) != null) {
            j1.j.f27051a.a(aVar);
        }
        androidx.lifecycle.a0 a0VarE = androidx.lifecycle.y0.e(this);
        View view = this;
        while (true) {
            if (view == null) {
                fVar = null;
                break;
            }
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            fVar = tag instanceof a6.f ? (a6.f) tag : null;
            if (fVar != null) {
                break;
            }
            Object objD = com.bumptech.glide.e.D(view);
            view = objD instanceof View ? (View) objD : null;
        }
        View view2 = this;
        while (true) {
            if (view2 == null) {
                k1Var = null;
                break;
            }
            Object tag2 = view2.getTag(R.id.view_tree_view_model_store_owner);
            k1Var = tag2 instanceof androidx.lifecycle.k1 ? (androidx.lifecycle.k1) tag2 : null;
            if (k1Var != null) {
                break;
            }
            Object objD2 = com.bumptech.glide.e.D(view2);
            view2 = objD2 instanceof View ? (View) objD2 : null;
        }
        l1 l1Var = this.f27260e;
        if (a0VarE == null || k1Var == null || l1Var == null) {
            dVar = null;
        } else {
            androidx.lifecycle.j1 j1VarE = k1Var.e();
            androidx.lifecycle.x0 x0Var = new androidx.lifecycle.x0(i);
            h5.a aVar3 = h5.a.f24879b;
            nk.k.e(j1VarE, "store");
            nk.k.e(aVar3, "extras");
            a0.x0 x0Var2 = new a0.x0(j1VarE, x0Var, aVar3);
            nk.e eVarA = nk.v.a(n1.class);
            String strB = eVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            n1 n1Var = (n1) x0Var2.D(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            nk.k.c(parent, "null cannot be cast to non-null type android.view.View");
            int id2 = ((View) parent).getId();
            x.u uVar = n1Var.f27239b;
            Object objB = uVar.b(id2);
            if (objB == null) {
                objB = new x.a0(1);
                uVar.h(id2, objB);
            }
            x.a0 a0Var2 = (x.a0) objB;
            Object[] objArr = a0Var2.f36846a;
            int i11 = a0Var2.f36847b;
            while (true) {
                if (i10 >= i11) {
                    obj = null;
                    break;
                }
                obj = objArr[i10];
                if (!((m1) obj).f27234c) {
                    break;
                } else {
                    i10++;
                }
            }
            m1 m1Var = (m1) obj;
            if (m1Var == null) {
                m1Var = new m1();
                a0Var2.a(m1Var);
            }
            m1Var.f27234c = true;
            this.f27262f = m1Var;
            dVar = m1Var.f27233b;
        }
        if (dVar == null) {
            dVar = d1.a.f21930a;
        }
        this.g = dVar;
        k viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (a0VarE != null && fVar != null && (a0VarE != viewTreeOwners.f27204a || fVar != viewTreeOwners.f27205b || k1Var != viewTreeOwners.f27206c))) {
            if (a0VarE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVar == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (c0VarJ = viewTreeOwners.f27204a.j()) != null) {
                c0VarJ.b(this);
            }
            a0VarE.j().a(this);
            k kVar = new k(a0VarE, fVar, k1Var);
            set_viewTreeOwners(kVar);
            mk.c cVar = this.f27266h0;
            if (cVar != null) {
                cVar.invoke(kVar);
            }
            this.f27266h0 = null;
        }
        this.f27283q0.f37314a.setValue(new y1.a(isInTouchMode() ? 1 : 2));
        k viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.c0 c0VarJ2 = viewTreeOwners2 != null ? viewTreeOwners2.f27204a.j() : null;
        if (c0VarJ2 == null) {
            throw d.h.o("No lifecycle owner exists");
        }
        c0VarJ2.a(this);
        c0VarJ2.a(this.f27300z);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            b0.f27095a.b(this);
        }
        j1.c cVar2 = this.L;
        if (cVar2 != null) {
            ((x.a0) ((xz) getFocusOwner()).g).a(cVar2);
            getSemanticsOwner().f31112d.a(cVar2);
        }
        ((x.a0) ((xz) getFocusOwner()).g).a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f27271k0.get() != null) {
            throw new ClassCastException();
        }
        this.f27268i0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f27271k0.get() != null) {
            throw new ClassCastException();
        }
        this.f27268i0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        k1.e eVar = this.f27300z;
        eVar.getClass();
        bd.e.d(eVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j1.a aVar;
        super.onDetachedFromWindow();
        this.f27286s.onViewDetachedFromWindow(this);
        if (this.f27272l) {
            View view = this.f27270k;
            if (view == null) {
                nk.k.k("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 28) {
            x.a0 a0Var = M0;
            synchronized (a0Var) {
                a0Var.j(this);
            }
        }
        getSnapshotObserver().b();
        k1 k1Var = this.f27280p;
        if (k1Var.f27210b == null) {
            k1Var.f27209a = null;
        }
        k viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.c0 c0VarJ = viewTreeOwners != null ? viewTreeOwners.f27204a.j() : null;
        if (c0VarJ == null) {
            throw d.h.o("No lifecycle owner exists");
        }
        c0VarJ.b(this.f27300z);
        c0VarJ.b(this);
        if (i() && (aVar = this.K) != null) {
            j1.j.f27051a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        m1 m1Var = this.f27262f;
        if (m1Var != null) {
            m1Var.f27234c = false;
        }
        this.f27262f = null;
        if (i4 >= 31) {
            b0.f27095a.a(this);
        }
        j1.c cVar = this.L;
        if (cVar != null) {
            getSemanticsOwner().f31112d.j(cVar);
            ((x.a0) ((xz) getFocusOwner()).g).j(cVar);
        }
        q2.b rectManager = getRectManager();
        g3.a aVar2 = rectManager.g;
        if (aVar2 != null) {
            Handler handler = i1.a.f25530a;
            if ((a0.g.C(aVar2) ? aVar2 : null) != null) {
                i1.a.f25530a.removeCallbacks(aVar2);
            }
            rectManager.g = null;
        }
        ((x.a0) ((xz) getFocusOwner()).g).j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (z3 || hasFocus()) {
            return;
        }
        xz xzVar = (xz) getFocusOwner();
        com.bumptech.glide.f.h((n1.s) xzVar.f18586c, true);
        if (xzVar.h() != null) {
            n1.s sVarH = xzVar.h();
            xzVar.j(null);
            if (sVarH != null) {
                sVarH.q0(n1.q.f29544a, n1.q.f29546c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f27257c0 = 0L;
        N();
        int i4 = Build.VERSION.SDK_INT;
        if (32 > i4 || i4 >= 34) {
            return;
        }
        M(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        this.f27257c0 = 0L;
        this.U.j(this.D0);
        this.S = null;
        N();
        if (this.R != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i11 - i4, i12 - i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        i2.s0 s0Var = this.U;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                r(getRoot());
            }
            long jK = k(i4);
            long jK2 = k(i10);
            long jF = z3.f((int) (jK >>> 32), (int) (jK & 4294967295L), (int) (jK2 >>> 32), (int) (4294967295L & jK2));
            d3.a aVar = this.S;
            if (aVar == null) {
                this.S = new d3.a(jF);
                this.T = false;
            } else if (!d3.a.b(aVar.f21951a, jF)) {
                this.T = true;
            }
            s0Var.q(jF);
            s0Var.l();
            setMeasuredDimension(getRoot().H.f25687p.f24408a, getRoot().H.f25687p.f24409b);
            if (this.R != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().H.f25687p.f24408a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().H.f25687p.f24409b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.r.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        int toolType = motionEvent.getToolType(i4);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        if (this.f27254b) {
            int[] iArr = n1.d.f29515a;
            d3.l lVar = d3.l.f21966a;
            d3.l lVar2 = i4 != 0 ? i4 != 1 ? null : d3.l.f21967b : lVar;
            if (lVar2 != null) {
                lVar = lVar2;
            }
            setLayoutDirection(lVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        e4.d dVar;
        if (Build.VERSION.SDK_INT < 31 || (dVar = this.G0) == null) {
            return;
        }
        dVar.c(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        N();
    }

    @Override // androidx.lifecycle.h
    public final void onStop(androidx.lifecycle.a0 a0Var) {
        m1 m1Var = this.f27262f;
        if (m1Var != null) {
            d1.c cVar = (d1.c) m1Var.f27232a.f30421b;
            if (cVar.f21932a && !cVar.f21934c) {
                u0.f fVar = m1Var.f27235d;
                if (fVar != null) {
                    fVar.cancel();
                }
                m1Var.f27235d = null;
                return;
            }
            if (cVar.f21933b) {
                return;
            }
            if (!cVar.f21934c) {
                e1.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cVar.f21935d.i()) {
                e1.a.a("Attempted to start retaining exited values with pending exited values");
            }
            cVar.f21934c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z3) {
        this.f27283q0.f37314a.setValue(new y1.a(z3 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        k1.e eVar = this.f27300z;
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (nk.k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            bd.e.a(eVar, longSparseArray);
        } else {
            eVar.f27792a.post(new k1.b(0, eVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        boolean zK;
        this.f27280p.f27211c.setValue(Boolean.valueOf(z3));
        this.F0 = true;
        super.onWindowFocusChanged(z3);
        if (!z3 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zK = d0.k())) {
            return;
        }
        setShowLayoutBounds(zK);
        q(getRoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.r.p(android.view.MotionEvent):int");
    }

    public final void r(i2.e0 e0Var) {
        this.U.p(e0Var, false);
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            r((i2.e0) objArr[i10]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (!isFocused()) {
            n1.c cVarD = n1.d.d(i4);
            int i10 = cVarD != null ? cVarD.f29514a : 7;
            Boolean boolG = ((xz) getFocusOwner()).g(i10, rect != null ? p1.z.v(rect) : null, new p(i10, 0));
            Boolean bool = Boolean.TRUE;
            if (!nk.k.a(boolG, bool)) {
                if (!nk.k.a(((xz) getFocusOwner()).g(i10, null, new p(i10, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i10 == 1 || i10 == 2) {
                        return ((xz) getFocusOwner()).i(i10);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f27298y.f27339h = j;
    }

    public final void setConfiguration(Configuration configuration) {
        this.J.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(k1.e eVar) {
        this.f27300z = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(ck.h hVar) {
        this.f27276n = hVar;
        i1.m mVar = (i1.m) getRoot().G.g;
        if (mVar instanceof c2.m0) {
            ((c2.m0) mVar).q0();
        }
        if (!mVar.f25554a.f25565n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        w0.e eVar = new w0.e(new i1.m[16]);
        i1.m mVar2 = mVar.f25554a;
        i1.m mVar3 = mVar2.f25559f;
        if (mVar3 == null) {
            i2.k.b(eVar, mVar2);
        } else {
            eVar.b(mVar3);
        }
        while (true) {
            int i4 = eVar.f36399c;
            if (i4 == 0) {
                return;
            }
            i1.m mVar4 = (i1.m) eVar.l(i4 - 1);
            if ((mVar4.f25557d & 16) != 0) {
                for (i1.m mVar5 = mVar4; mVar5 != null && mVar5.f25565n; mVar5 = mVar5.f25559f) {
                    if ((mVar5.f25556c & 16) != 0) {
                        i2.j jVarE = mVar5;
                        ?? eVar2 = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof i2.r1) {
                                i2.r1 r1Var = (i2.r1) jVarE;
                                if (r1Var instanceof c2.m0) {
                                    ((c2.m0) r1Var).q0();
                                }
                            } else if ((jVarE.f25556c & 16) != 0 && (jVarE instanceof i2.j)) {
                                i1.m mVar6 = jVarE.f25691p;
                                int i10 = 0;
                                jVarE = jVarE;
                                eVar2 = eVar2;
                                while (mVar6 != null) {
                                    if ((mVar6.f25556c & 16) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            jVarE = mVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar2.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar2.b(mVar6);
                                        }
                                    }
                                    mVar6 = mVar6.f25559f;
                                    jVarE = jVarE;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVarE = i2.k.e(eVar2);
                        }
                    }
                }
            }
            i2.k.b(eVar, mVar4);
        }
    }

    public final void setFrameEndScheduler$ui(l1 l1Var) {
        this.f27260e = l1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f27257c0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(mk.c cVar) {
        k viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f27266h0 = cVar;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m187setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(z1.a aVar) {
        this.f27256c = aVar;
    }

    public void setShowLayoutBounds(boolean z3) {
        this.Q = z3;
    }

    public void setUncaughtExceptionHandler(i2.s1 s1Var) {
        this.U.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f27289t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long v(long j) {
        F();
        long jP = p1.z.p(this.f27253a0, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f27261e0 >> 32)) + Float.intBitsToFloat((int) (jP >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f27261e0 & 4294967295L)) + Float.intBitsToFloat((int) (jP & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void w(boolean z3) {
        o oVar;
        i2.s0 s0Var = this.U;
        if (s0Var.f25777b.H() || ((w0.e) s0Var.f25780e.f37323a).f36399c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z3) {
                try {
                    oVar = this.D0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                oVar = null;
            }
            if (s0Var.j(oVar)) {
                requestLayout();
            }
            s0Var.a(false);
            if (this.G) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.G = false;
            }
            Trace.endSection();
        }
    }

    public final void x(i2.e0 e0Var, long j) {
        i2.s0 s0Var = this.U;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            s0Var.k(e0Var, j);
            if (!s0Var.f25777b.H()) {
                s0Var.a(false);
                if (this.G) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.G = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean y(int i4) {
        if (i4 == 7 || i4 == 8) {
            return false;
        }
        Integer numC = n1.d.c(i4);
        if (numC == null) {
            throw d.h.o("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        n1.s sVarH = ((xz) getFocusOwner()).h();
        if (sVarH == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numC2 = n1.d.c(i4);
        if (numC2 == null) {
            throw d.h.o("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        g3.x xVar = i2.k.s(sVarH).f25640p;
        View interopView = xVar != null ? xVar.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        nk.k.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !d0.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return n1.d.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    public final void z(i2.l1 l1Var, boolean z3) {
        x.a0 a0Var = this.D;
        if (!z3) {
            if (this.F) {
                return;
            }
            a0Var.j(l1Var);
            x.a0 a0Var2 = this.E;
            if (a0Var2 != null) {
                a0Var2.j(l1Var);
                return;
            }
            return;
        }
        if (!this.F) {
            a0Var.a(l1Var);
            return;
        }
        x.a0 a0Var3 = this.E;
        if (a0Var3 == null) {
            a0Var3 = new x.a0();
            this.E = a0Var3;
        }
        a0Var3.a(l1Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        nk.k.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i4, layoutParams, true);
    }

    public f getAccessibilityManager() {
        return this.A;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public g m189getClipboard() {
        return this.O;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public h m190getClipboardManager() {
        return this.N;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public l1.b m191getDragAndDropManager() {
        return this.f27278o;
    }

    public x.u getLayoutNodes() {
        return this.f27290u;
    }

    public r getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, int i10) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i4;
        layoutParamsGenerateDefaultLayoutParams.height = i10;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i4, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @yj.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m185getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @yj.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // androidx.lifecycle.h
    public final void e(androidx.lifecycle.a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final /* synthetic */ void m(androidx.lifecycle.a0 a0Var) {
    }

    @Override // androidx.lifecycle.h
    public final void onDestroy(androidx.lifecycle.a0 a0Var) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // androidx.lifecycle.h
    public final /* synthetic */ void onStart(androidx.lifecycle.a0 a0Var) {
    }

    public final void setUncaughtExceptionHandler$ui(i2.s1 s1Var) {
    }
}
