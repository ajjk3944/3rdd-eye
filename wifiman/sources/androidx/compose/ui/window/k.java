package androidx.compose.ui.window;

import C0.AbstractC2538s;
import T.AbstractC3546o;
import T.AbstractC3550q;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.o1;
import T.t1;
import T.z1;
import Yg.J;
import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractC3901a;
import androidx.compose.ui.platform.B1;
import androidx.compose.ui.window.k;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;
import q2.AbstractC7419g;

/* loaded from: classes.dex */
public final class k extends AbstractC3901a implements B1 {

    /* renamed from: C, reason: collision with root package name */
    private static final c f29954C = new c(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f29955D = 8;

    /* renamed from: E, reason: collision with root package name */
    private static final InterfaceC6835l f29956E = b.f29977a;

    /* renamed from: A, reason: collision with root package name */
    private boolean f29957A;

    /* renamed from: B, reason: collision with root package name */
    private final int[] f29958B;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6824a f29959i;

    /* renamed from: j, reason: collision with root package name */
    private r f29960j;

    /* renamed from: k, reason: collision with root package name */
    private String f29961k;

    /* renamed from: l, reason: collision with root package name */
    private final View f29962l;

    /* renamed from: m, reason: collision with root package name */
    private final m f29963m;

    /* renamed from: n, reason: collision with root package name */
    private final WindowManager f29964n;

    /* renamed from: o, reason: collision with root package name */
    private final WindowManager.LayoutParams f29965o;

    /* renamed from: p, reason: collision with root package name */
    private q f29966p;

    /* renamed from: q, reason: collision with root package name */
    private Y0.t f29967q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3551q0 f29968r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3551q0 f29969s;

    /* renamed from: t, reason: collision with root package name */
    private Y0.p f29970t;

    /* renamed from: u, reason: collision with root package name */
    private final z1 f29971u;

    /* renamed from: v, reason: collision with root package name */
    private final float f29972v;

    /* renamed from: w, reason: collision with root package name */
    private final Rect f29973w;

    /* renamed from: x, reason: collision with root package name */
    private final androidx.compose.runtime.snapshots.l f29974x;

    /* renamed from: y, reason: collision with root package name */
    private Object f29975y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3551q0 f29976z;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29977a = new b();

        b() {
            super(1);
        }

        public final void a(k kVar) {
            if (kVar.isAttachedToWindow()) {
                kVar.x();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((k) obj);
            return J.f24997a;
        }
    }

    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(2);
            this.f29979b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            k.this.a(interfaceC3540l, L0.a(this.f29979b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29980a;

        static {
            int[] iArr = new int[Y0.t.values().length];
            try {
                iArr[Y0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29980a = iArr;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {
        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C0.r parentLayoutCoordinates = k.this.getParentLayoutCoordinates();
            if (parentLayoutCoordinates == null || !parentLayoutCoordinates.M()) {
                parentLayoutCoordinates = null;
            }
            return Boolean.valueOf((parentLayoutCoordinates == null || k.this.m4getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(InterfaceC6824a interfaceC6824a) {
            interfaceC6824a.invoke();
        }

        public final void c(final InterfaceC6824a interfaceC6824a) {
            Handler handler = k.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                interfaceC6824a.invoke();
                return;
            }
            Handler handler2 = k.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.window.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.g.h(interfaceC6824a);
                    }
                });
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((InterfaceC6824a) obj);
            return J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f29983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f29984b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y0.p f29985c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f29986d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f29987e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(M m10, k kVar, Y0.p pVar, long j10, long j11) {
            super(0);
            this.f29983a = m10;
            this.f29984b = kVar;
            this.f29985c = pVar;
            this.f29986d = j10;
            this.f29987e = j11;
        }

        public final void a() {
            this.f29983a.f51688a = this.f29984b.getPositionProvider().a(this.f29985c, this.f29986d, this.f29984b.getParentLayoutDirection(), this.f29987e);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(InterfaceC6824a interfaceC6824a, r rVar, String str, View view, Y0.d dVar, q qVar, UUID uuid, m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        m oVar;
        if ((i10 & 128) != 0) {
            oVar = Build.VERSION.SDK_INT >= 29 ? new o() : new p();
        } else {
            oVar = mVar;
        }
        this(interfaceC6824a, rVar, str, view, dVar, qVar, uuid, oVar);
    }

    private final InterfaceC6839p getContent() {
        return (InterfaceC6839p) this.f29976z.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0.r getParentLayoutCoordinates() {
        return (C0.r) this.f29969s.getValue();
    }

    private final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = androidx.compose.ui.window.b.h(this.f29960j, androidx.compose.ui.window.b.i(this.f29962l));
        layoutParams.type = 1002;
        layoutParams.token = this.f29962l.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f29962l.getContext().getResources().getString(f0.i.f46641d));
        return layoutParams;
    }

    private final void n() {
        if (!this.f29960j.a() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f29975y == null) {
            this.f29975y = androidx.compose.ui.window.e.b(this.f29959i);
        }
        androidx.compose.ui.window.e.d(this, this.f29975y);
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.window.e.e(this, this.f29975y);
        }
        this.f29975y = null;
    }

    private final void s(Y0.t tVar) {
        int i10 = e.f29980a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    private final void setContent(InterfaceC6839p interfaceC6839p) {
        this.f29976z.setValue(interfaceC6839p);
    }

    private final void setParentLayoutCoordinates(C0.r rVar) {
        this.f29969s.setValue(rVar);
    }

    private final void w(r rVar) {
        if (AbstractC6492s.d(this.f29960j, rVar)) {
            return;
        }
        if (rVar.f() && !this.f29960j.f()) {
            WindowManager.LayoutParams layoutParams = this.f29965o;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.f29960j = rVar;
        this.f29965o.flags = androidx.compose.ui.window.b.h(rVar, androidx.compose.ui.window.b.i(this.f29962l));
        this.f29963m.a(this.f29964n, this, this.f29965o);
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void a(InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f29960j.a()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC6824a interfaceC6824a = this.f29959i;
                if (interfaceC6824a != null) {
                    interfaceC6824a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.g(z10, i10, i11, i12, i13);
        if (this.f29960j.f() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f29965o.width = childAt.getMeasuredWidth();
        this.f29965o.height = childAt.getMeasuredHeight();
        this.f29963m.a(this.f29964n, this, this.f29965o);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f29971u.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f29965o;
    }

    public final Y0.t getParentLayoutDirection() {
        return this.f29967q;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final Y0.r m4getPopupContentSizebOM6tXw() {
        return (Y0.r) this.f29968r.getValue();
    }

    public final q getPositionProvider() {
        return this.f29966p;
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f29957A;
    }

    @Override // androidx.compose.ui.platform.B1
    public AbstractC3901a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f29961k;
    }

    @Override // androidx.compose.ui.platform.B1
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void h(int i10, int i11) {
        if (this.f29960j.f()) {
            super.h(i10, i11);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), PduHandle.NONE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), PduHandle.NONE));
        }
    }

    public final void m() {
        T.b(this, null);
        this.f29964n.removeViewImmediate(this);
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29974x.s();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29974x.t();
        this.f29974x.j();
        o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29960j.b()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC6824a interfaceC6824a = this.f29959i;
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC6824a interfaceC6824a2 = this.f29959i;
        if (interfaceC6824a2 != null) {
            interfaceC6824a2.invoke();
        }
        return true;
    }

    public final void p() {
        int[] iArr = this.f29958B;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.f29962l.getLocationOnScreen(iArr);
        int[] iArr2 = this.f29958B;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        u();
    }

    public final void q(AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        setParentCompositionContext(abstractC3550q);
        setContent(interfaceC6839p);
        this.f29957A = true;
    }

    public final void r() {
        this.f29964n.addView(this, this.f29965o);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(Y0.t tVar) {
        this.f29967q = tVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5setPopupContentSizefhxjrPA(Y0.r rVar) {
        this.f29968r.setValue(rVar);
    }

    public final void setPositionProvider(q qVar) {
        this.f29966p = qVar;
    }

    public final void setTestTag(String str) {
        this.f29961k = str;
    }

    public final void t(InterfaceC6824a interfaceC6824a, r rVar, String str, Y0.t tVar) {
        this.f29959i = interfaceC6824a;
        this.f29961k = str;
        w(rVar);
        s(tVar);
    }

    public final void u() {
        C0.r parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.M()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jH = parentLayoutCoordinates.h();
            long jF = AbstractC2538s.f(parentLayoutCoordinates);
            Y0.p pVarA = Y0.q.a(Y0.o.a(Math.round(C6531g.m(jF)), Math.round(C6531g.n(jF))), jH);
            if (AbstractC6492s.d(pVarA, this.f29970t)) {
                return;
            }
            this.f29970t = pVarA;
            x();
        }
    }

    public final void v(C0.r rVar) {
        setParentLayoutCoordinates(rVar);
        u();
    }

    public final void x() {
        Y0.r rVarM4getPopupContentSizebOM6tXw;
        Y0.p pVar = this.f29970t;
        if (pVar == null || (rVarM4getPopupContentSizebOM6tXw = m4getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j10 = rVarM4getPopupContentSizebOM6tXw.j();
        Rect rect = this.f29973w;
        this.f29963m.c(this.f29962l, rect);
        Y0.p pVarJ = androidx.compose.ui.window.b.j(rect);
        long jA = Y0.s.a(pVarJ.j(), pVarJ.e());
        M m10 = new M();
        m10.f51688a = Y0.n.f24536b.a();
        this.f29974x.o(this, f29956E, new h(m10, this, pVar, jA, j10));
        this.f29965o.x = Y0.n.h(m10.f51688a);
        this.f29965o.y = Y0.n.i(m10.f51688a);
        if (this.f29960j.c()) {
            this.f29963m.b(this, Y0.r.g(jA), Y0.r.f(jA));
        }
        this.f29963m.a(this.f29964n, this, this.f29965o);
    }

    public k(InterfaceC6824a interfaceC6824a, r rVar, String str, View view, Y0.d dVar, q qVar, UUID uuid, m mVar) {
        super(view.getContext(), null, 0, 6, null);
        this.f29959i = interfaceC6824a;
        this.f29960j = rVar;
        this.f29961k = str;
        this.f29962l = view;
        this.f29963m = mVar;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f29964n = (WindowManager) systemService;
        this.f29965o = l();
        this.f29966p = qVar;
        this.f29967q = Y0.t.Ltr;
        this.f29968r = t1.d(null, null, 2, null);
        this.f29969s = t1.d(null, null, 2, null);
        this.f29971u = o1.e(new f());
        float fJ = Y0.h.j(8);
        this.f29972v = fJ;
        this.f29973w = new Rect();
        this.f29974x = new androidx.compose.runtime.snapshots.l(new g());
        setId(R.id.content);
        T.b(this, T.a(view));
        U.b(this, U.a(view));
        AbstractC7419g.b(this, AbstractC7419g.a(view));
        setTag(f0.h.f46607H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.d1(fJ));
        setOutlineProvider(new a());
        this.f29976z = t1.d(androidx.compose.ui.window.g.f29932a.a(), null, 2, null);
        this.f29958B = new int[2];
    }
}
