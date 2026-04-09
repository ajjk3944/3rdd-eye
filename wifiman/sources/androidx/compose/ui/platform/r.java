package androidx.compose.ui.platform;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.G;
import E0.InterfaceC2632j;
import F1.C2736a;
import Q0.AbstractC3434k;
import Q0.AbstractC3438o;
import Q0.InterfaceC3433j;
import T.InterfaceC3551q0;
import Yg.InterfaceC3661e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.r;
import androidx.compose.ui.platform.x1;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import f.AbstractC5487d;
import g0.AbstractC5842c;
import g0.C5840a;
import h0.ViewOnAttachStateChangeListenerC5938b;
import i0.AbstractC6058h;
import i0.C6051a;
import i0.InterfaceC6053c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.AbstractC6497x;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;
import m0.AbstractC6677M;
import m0.C6719o0;
import m0.InterfaceC6671H0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.smi.Counter32;
import p0.C7182c;
import q2.AbstractC7419g;
import q2.InterfaceC7418f;
import u0.C8125c;
import u0.InterfaceC8123a;
import v0.C8183a;
import v0.InterfaceC8184b;
import w0.AbstractC8249c;
import w0.AbstractC8250d;
import w0.C8247a;
import w0.C8248b;
import y0.AbstractC8564D;
import y0.AbstractC8574N;
import y0.C8561A;
import y0.C8562B;
import y0.C8563C;
import y0.C8571K;
import y0.C8586g;
import y0.InterfaceC8573M;
import y0.InterfaceC8578S;
import y0.InterfaceC8599t;
import y0.InterfaceC8601v;

/* loaded from: classes.dex */
public final class r extends ViewGroup implements E0.m0, C1, InterfaceC8573M, InterfaceC4007e {

    /* renamed from: V1, reason: collision with root package name */
    public static final a f29472V1 = new a(null);

    /* renamed from: W1, reason: collision with root package name */
    public static final int f29473W1 = 8;

    /* renamed from: X1, reason: collision with root package name */
    private static Class f29474X1;

    /* renamed from: Y1, reason: collision with root package name */
    private static Method f29475Y1;

    /* renamed from: A, reason: collision with root package name */
    private final C8586g f29476A;

    /* renamed from: A1, reason: collision with root package name */
    private final n1 f29477A1;

    /* renamed from: B, reason: collision with root package name */
    private final C8563C f29478B;

    /* renamed from: B1, reason: collision with root package name */
    private final InterfaceC3433j.a f29479B1;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC6835l f29480C;

    /* renamed from: C1, reason: collision with root package name */
    private final InterfaceC3551q0 f29481C1;

    /* renamed from: D, reason: collision with root package name */
    private final C5840a f29482D;

    /* renamed from: D1, reason: collision with root package name */
    private int f29483D1;

    /* renamed from: E, reason: collision with root package name */
    private boolean f29484E;

    /* renamed from: E1, reason: collision with root package name */
    private final InterfaceC3551q0 f29485E1;

    /* renamed from: F, reason: collision with root package name */
    private final C3931k f29486F;

    /* renamed from: F1, reason: collision with root package name */
    private final InterfaceC8123a f29487F1;

    /* renamed from: G, reason: collision with root package name */
    private final E0.o0 f29488G;

    /* renamed from: G1, reason: collision with root package name */
    private final v0.c f29489G1;

    /* renamed from: H, reason: collision with root package name */
    private boolean f29490H;

    /* renamed from: H1, reason: collision with root package name */
    private final D0.f f29491H1;

    /* renamed from: I, reason: collision with root package name */
    private Z f29492I;

    /* renamed from: I1, reason: collision with root package name */
    private final q1 f29493I1;

    /* renamed from: J, reason: collision with root package name */
    private C3948r0 f29494J;

    /* renamed from: J1, reason: collision with root package name */
    private MotionEvent f29495J1;

    /* renamed from: K1, reason: collision with root package name */
    private long f29496K1;

    /* renamed from: L1, reason: collision with root package name */
    private final D1 f29497L1;

    /* renamed from: M1, reason: collision with root package name */
    private final V.b f29498M1;

    /* renamed from: N, reason: collision with root package name */
    private Y0.b f29499N;

    /* renamed from: N1, reason: collision with root package name */
    private final u f29500N1;

    /* renamed from: O1, reason: collision with root package name */
    private final Runnable f29501O1;

    /* renamed from: P1, reason: collision with root package name */
    private boolean f29502P1;

    /* renamed from: Q1, reason: collision with root package name */
    private final InterfaceC6824a f29503Q1;

    /* renamed from: R1, reason: collision with root package name */
    private final InterfaceC3902a0 f29504R1;

    /* renamed from: S1, reason: collision with root package name */
    private boolean f29505S1;

    /* renamed from: T1, reason: collision with root package name */
    private final I0.l f29506T1;

    /* renamed from: U1, reason: collision with root package name */
    private final InterfaceC8601v f29507U1;

    /* renamed from: a, reason: collision with root package name */
    private long f29508a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29509b;

    /* renamed from: c, reason: collision with root package name */
    private final E0.I f29510c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f29511d;

    /* renamed from: e, reason: collision with root package name */
    private final J0.d f29512e;

    /* renamed from: f, reason: collision with root package name */
    private final EmptySemanticsElement f29513f;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f29514f1;

    /* renamed from: g, reason: collision with root package name */
    private final k0.g f29515g;

    /* renamed from: g1, reason: collision with root package name */
    private final E0.S f29516g1;

    /* renamed from: h, reason: collision with root package name */
    private final DragAndDropModifierOnDragListener f29517h;

    /* renamed from: h1, reason: collision with root package name */
    private final w1 f29518h1;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC5384i f29519i;

    /* renamed from: i1, reason: collision with root package name */
    private long f29520i1;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC6053c f29521j;

    /* renamed from: j1, reason: collision with root package name */
    private final int[] f29522j1;

    /* renamed from: k, reason: collision with root package name */
    private final F1 f29523k;

    /* renamed from: k1, reason: collision with root package name */
    private final float[] f29524k1;

    /* renamed from: l, reason: collision with root package name */
    private final androidx.compose.ui.e f29525l;

    /* renamed from: l1, reason: collision with root package name */
    private final float[] f29526l1;

    /* renamed from: m, reason: collision with root package name */
    private final androidx.compose.ui.e f29527m;

    /* renamed from: m1, reason: collision with root package name */
    private final float[] f29528m1;

    /* renamed from: n, reason: collision with root package name */
    private final C6719o0 f29529n;

    /* renamed from: n1, reason: collision with root package name */
    private long f29530n1;

    /* renamed from: o, reason: collision with root package name */
    private final E0.G f29531o;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f29532o1;

    /* renamed from: p, reason: collision with root package name */
    private final E0.u0 f29533p;

    /* renamed from: p1, reason: collision with root package name */
    private long f29534p1;

    /* renamed from: q, reason: collision with root package name */
    private final J0.p f29535q;

    /* renamed from: q1, reason: collision with root package name */
    private boolean f29536q1;

    /* renamed from: r, reason: collision with root package name */
    private final C3959x f29537r;

    /* renamed from: r1, reason: collision with root package name */
    private final InterfaceC3551q0 f29538r1;

    /* renamed from: s, reason: collision with root package name */
    private ViewOnAttachStateChangeListenerC5938b f29539s;

    /* renamed from: s1, reason: collision with root package name */
    private final T.z1 f29540s1;

    /* renamed from: t, reason: collision with root package name */
    private final C3928j f29541t;

    /* renamed from: t1, reason: collision with root package name */
    private InterfaceC6835l f29542t1;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC6671H0 f29543u;

    /* renamed from: u1, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f29544u1;

    /* renamed from: v, reason: collision with root package name */
    private final g0.i f29545v;

    /* renamed from: v1, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f29546v1;

    /* renamed from: w, reason: collision with root package name */
    private final List f29547w;

    /* renamed from: w1, reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f29548w1;

    /* renamed from: x, reason: collision with root package name */
    private List f29549x;

    /* renamed from: x1, reason: collision with root package name */
    private final R0.V f29550x1;

    /* renamed from: y, reason: collision with root package name */
    private boolean f29551y;

    /* renamed from: y1, reason: collision with root package name */
    private final R0.T f29552y1;

    /* renamed from: z, reason: collision with root package name */
    private boolean f29553z;

    /* renamed from: z1, reason: collision with root package name */
    private final AtomicReference f29554z1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (r.f29474X1 == null) {
                    r.f29474X1 = Class.forName("android.os.SystemProperties");
                    Class cls = r.f29474X1;
                    r.f29475Y1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = r.f29475Y1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4017o f29555a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC7418f f29556b;

        public b(InterfaceC4017o interfaceC4017o, InterfaceC7418f interfaceC7418f) {
            this.f29555a = interfaceC4017o;
            this.f29556b = interfaceC7418f;
        }

        public final InterfaceC4017o a() {
            return this.f29555a;
        }

        public final InterfaceC7418f b() {
            return this.f29556b;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final Boolean a(int i10) {
            C8183a.C2244a c2244a = C8183a.f63351b;
            return Boolean.valueOf(C8183a.f(i10, c2244a.b()) ? r.this.isInTouchMode() : C8183a.f(i10, c2244a.a()) ? r.this.isInTouchMode() ? r.this.requestFocusFromTouch() : true : false);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C8183a) obj).i());
        }
    }

    public static final class d extends C2736a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ E0.G f29559e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r f29560f;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29561a = new a();

            a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E0.G g10) {
                return Boolean.valueOf(g10.k0().q(E0.e0.a(8)));
            }
        }

        d(E0.G g10, r rVar) {
            this.f29559e = g10;
            this.f29560f = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
        @Override // F1.C2736a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(android.view.View r5, G1.t r6) {
            /*
                r4 = this;
                super.g(r5, r6)
                androidx.compose.ui.platform.r r5 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.x r5 = androidx.compose.ui.platform.r.K(r5)
                boolean r5 = r5.p0()
                if (r5 == 0) goto L13
                r5 = 0
                r6.T0(r5)
            L13:
                E0.G r5 = r4.f29559e
                androidx.compose.ui.platform.r$d$a r0 = androidx.compose.ui.platform.r.d.a.f29561a
                E0.G r5 = J0.o.f(r5, r0)
                if (r5 == 0) goto L26
                int r5 = r5.q0()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L27
            L26:
                r5 = 0
            L27:
                r0 = -1
                if (r5 == 0) goto L3e
                androidx.compose.ui.platform.r r1 = androidx.compose.ui.platform.r.this
                J0.p r1 = r1.getSemanticsOwner()
                J0.n r1 = r1.a()
                int r1 = r1.o()
                int r2 = r5.intValue()
                if (r2 != r1) goto L42
            L3e:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            L42:
                androidx.compose.ui.platform.r r1 = r4.f29560f
                int r5 = r5.intValue()
                r6.C0(r1, r5)
                E0.G r5 = r4.f29559e
                int r5 = r5.q0()
                androidx.compose.ui.platform.r r1 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.x r1 = androidx.compose.ui.platform.r.K(r1)
                o.x r1 = r1.e0()
                int r1 = r1.e(r5, r0)
                if (r1 == r0) goto L89
                androidx.compose.ui.platform.r r2 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.Z r2 = r2.getAndroidViewsHandler$ui_release()
                android.view.View r2 = androidx.compose.ui.platform.AbstractC3936l1.h(r2, r1)
                if (r2 == 0) goto L71
                r6.Q0(r2)
                goto L76
            L71:
                androidx.compose.ui.platform.r r2 = r4.f29560f
                r6.R0(r2, r1)
            L76:
                androidx.compose.ui.platform.r r1 = androidx.compose.ui.platform.r.this
                android.view.accessibility.AccessibilityNodeInfo r2 = r6.U0()
                androidx.compose.ui.platform.r r3 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.x r3 = androidx.compose.ui.platform.r.K(r3)
                java.lang.String r3 = r3.c0()
                androidx.compose.ui.platform.r.H(r1, r5, r2, r3)
            L89:
                androidx.compose.ui.platform.r r1 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.x r1 = androidx.compose.ui.platform.r.K(r1)
                o.x r1 = r1.d0()
                int r1 = r1.e(r5, r0)
                if (r1 == r0) goto Lc1
                androidx.compose.ui.platform.r r0 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.Z r0 = r0.getAndroidViewsHandler$ui_release()
                android.view.View r0 = androidx.compose.ui.platform.AbstractC3936l1.h(r0, r1)
                if (r0 == 0) goto La9
                r6.O0(r0)
                goto Lae
            La9:
                androidx.compose.ui.platform.r r0 = r4.f29560f
                r6.P0(r0, r1)
            Lae:
                androidx.compose.ui.platform.r r0 = androidx.compose.ui.platform.r.this
                android.view.accessibility.AccessibilityNodeInfo r6 = r6.U0()
                androidx.compose.ui.platform.r r1 = androidx.compose.ui.platform.r.this
                androidx.compose.ui.platform.x r1 = androidx.compose.ui.platform.r.K(r1)
                java.lang.String r1 = r1.b0()
                androidx.compose.ui.platform.r.H(r0, r5, r6, r1)
            Lc1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.d.g(android.view.View, G1.t):void");
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f29562a = new e();

        e() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return Yg.J.f24997a;
        }
    }

    /* synthetic */ class f extends C6490p implements InterfaceC6824a {
        f(Object obj) {
            super(0, obj, M.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.coreshims.c invoke() {
            return M.g((View) this.receiver);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyEvent f29564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(KeyEvent keyEvent) {
            super(0);
            this.f29564b = keyEvent;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(r.super.dispatchKeyEvent(this.f29564b));
        }
    }

    /* synthetic */ class h extends C6490p implements mh.q {
        h(Object obj) {
            super(3, obj, r.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean a(AbstractC6058h abstractC6058h, long j10, InterfaceC6835l interfaceC6835l) {
            return Boolean.valueOf(((r) this.receiver).T0(abstractC6058h, j10, interfaceC6835l));
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            AbstractC5487d.a(obj);
            return a(null, ((C6537m) obj2).m(), (InterfaceC6835l) obj3);
        }
    }

    /* synthetic */ class i extends C6490p implements InterfaceC6835l {
        i(Object obj) {
            super(1, obj, r.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public final void a(InterfaceC6824a interfaceC6824a) {
            ((r) this.receiver).k(interfaceC6824a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6824a) obj);
            return Yg.J.f24997a;
        }
    }

    /* synthetic */ class j extends C6490p implements InterfaceC6839p {
        j(Object obj) {
            super(2, obj, r.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.focus.d dVar, C6533i c6533i) {
            return Boolean.valueOf(((r) this.receiver).E0(dVar, c6533i));
        }
    }

    /* synthetic */ class k extends C6490p implements InterfaceC6835l {
        k(Object obj) {
            super(1, obj, r.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(((r) this.receiver).D0(i10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.focus.d) obj).o());
        }
    }

    /* synthetic */ class l extends C6490p implements InterfaceC6824a {
        l(Object obj) {
            super(0, obj, r.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        public final void a() {
            ((r) this.receiver).B0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* synthetic */ class m extends C6490p implements InterfaceC6824a {
        m(Object obj) {
            super(0, obj, r.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6533i invoke() {
            return ((r) this.receiver).C0();
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final o f29565a = new o();

        o() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6835l {

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f29567a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f29567a = dVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolK = androidx.compose.ui.focus.s.k(focusTargetNode, this.f29567a.o());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f29568a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f29568a = dVar;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolK = androidx.compose.ui.focus.s.k(focusTargetNode, this.f29568a.o());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        p() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.d dVarN0 = r.this.n0(keyEvent);
            if (dVarN0 == null || !AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a())) {
                return Boolean.FALSE;
            }
            C6533i c6533iC0 = r.this.C0();
            Boolean boolP = r.this.getFocusOwner().p(dVarN0.o(), c6533iC0, new b(dVarN0));
            if (boolP != null ? boolP.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.j.a(dVarN0.o())) {
                return Boolean.FALSE;
            }
            Integer numC = androidx.compose.ui.focus.h.c(dVarN0.o());
            if (numC == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            Rect rectB = c6533iC0 != null ? m0.b1.b(c6533iC0) : null;
            if (rectB == null) {
                throw new IllegalStateException("Invalid rect");
            }
            View viewL0 = r.this.l0(iIntValue);
            if (AbstractC6492s.d(viewL0, r.this)) {
                viewL0 = null;
            }
            if ((viewL0 == null || !androidx.compose.ui.focus.h.b(viewL0, Integer.valueOf(iIntValue), rectB)) && r.this.getFocusOwner().e(false, true, false, dVarN0.o())) {
                Boolean boolP2 = r.this.getFocusOwner().p(dVarN0.o(), null, new a(dVarN0));
                return Boolean.valueOf(boolP2 != null ? boolP2.booleanValue() : true);
            }
            return Boolean.TRUE;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C8248b) obj).f());
        }
    }

    public static final class q implements InterfaceC8601v {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC8599t f29569a = InterfaceC8599t.f66323a.a();

        q() {
        }

        @Override // y0.InterfaceC8601v
        public void a(InterfaceC8599t interfaceC8599t) {
            if (interfaceC8599t == null) {
                interfaceC8599t = InterfaceC8599t.f66323a.a();
            }
            this.f29569a = interfaceC8599t;
            K.f29214a.a(r.this, interfaceC8599t);
        }
    }

    /* renamed from: androidx.compose.ui.platform.r$r, reason: collision with other inner class name */
    static final class C1076r extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f29572b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1076r(androidx.compose.ui.viewinterop.c cVar) {
            super(0);
            this.f29572b = cVar;
        }

        public final void a() {
            r.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f29572b);
            HashMap<E0.G, androidx.compose.ui.viewinterop.c> layoutNodeToHolder = r.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            kotlin.jvm.internal.V.d(layoutNodeToHolder).remove(r.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f29572b));
            this.f29572b.setImportantForAccessibility(0);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class s extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29573a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i10) {
            super(1);
            this.f29573a = i10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean boolK = androidx.compose.ui.focus.s.k(focusTargetNode, this.f29573a);
            return Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    static final class t extends AbstractC6494u implements InterfaceC6824a {
        t() {
            super(0);
        }

        public final void a() {
            MotionEvent motionEvent = r.this.f29495J1;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    r.this.f29496K1 = SystemClock.uptimeMillis();
                    r rVar = r.this;
                    rVar.post(rVar.f29500N1);
                }
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public static final class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.removeCallbacks(this);
            MotionEvent motionEvent = r.this.f29495J1;
            if (motionEvent != null) {
                boolean z10 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i10 = 2;
                }
                r rVar = r.this;
                rVar.R0(motionEvent, i10, rVar.f29496K1, false);
            }
        }
    }

    static final class v extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final v f29576a = new v();

        v() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(A0.b bVar) {
            return Boolean.FALSE;
        }
    }

    static final class w extends AbstractC6494u implements InterfaceC6835l {
        w() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(InterfaceC6824a interfaceC6824a) {
            interfaceC6824a.invoke();
        }

        public final void c(final InterfaceC6824a interfaceC6824a) {
            Handler handler = r.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                interfaceC6824a.invoke();
                return;
            }
            Handler handler2 = r.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.w.h(interfaceC6824a);
                    }
                });
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((InterfaceC6824a) obj);
            return Yg.J.f24997a;
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f29578a;

        /* renamed from: c, reason: collision with root package name */
        int f29580c;

        x(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29578a = obj;
            this.f29580c |= PduHandle.NONE;
            return r.this.w(null, this);
        }
    }

    static final class y extends AbstractC6494u implements InterfaceC6835l {
        y() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke(Ii.N n10) {
            r rVar = r.this;
            return new O(rVar, rVar.getTextInputService(), n10);
        }
    }

    static final class z extends AbstractC6494u implements InterfaceC6824a {
        z() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return r.this.get_viewTreeOwners();
        }
    }

    public r(Context context, InterfaceC5384i interfaceC5384i) {
        super(context);
        C6531g.a aVar = C6531g.f52335b;
        this.f29508a = aVar.b();
        this.f29509b = true;
        byte b10 = 0;
        byte b11 = 0;
        this.f29510c = new E0.I(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.f29511d = T.o1.h(Y0.a.a(context), T.o1.m());
        J0.d dVar = new J0.d();
        this.f29512e = dVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        this.f29513f = emptySemanticsElement;
        this.f29515g = new FocusOwnerImpl(new i(this), new j(this), new k(this), new l(this), new m(this), new AbstractC6497x(this) { // from class: androidx.compose.ui.platform.r.n
            @Override // th.m
            public Object get() {
                return ((r) this.receiver).getLayoutDirection();
            }

            @Override // th.i
            public void set(Object obj) {
                ((r) this.receiver).setLayoutDirection((Y0.t) obj);
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new h(this));
        this.f29517h = dragAndDropModifierOnDragListener;
        this.f29519i = interfaceC5384i;
        this.f29521j = dragAndDropModifierOnDragListener;
        this.f29523k = new F1();
        e.a aVar2 = androidx.compose.ui.e.f28771b0;
        androidx.compose.ui.e eVarA = androidx.compose.ui.input.key.a.a(aVar2, new p());
        this.f29525l = eVarA;
        androidx.compose.ui.e eVarA2 = androidx.compose.ui.input.rotary.a.a(aVar2, v.f29576a);
        this.f29527m = eVarA2;
        this.f29529n = new C6719o0();
        E0.G g10 = new E0.G(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        g10.i(androidx.compose.ui.layout.v.f29070b);
        g10.a(getDensity());
        g10.g(aVar2.b0(emptySemanticsElement).b0(eVarA2).b0(eVarA).b0(getFocusOwner().b()).b0(dragAndDropModifierOnDragListener.d()));
        this.f29531o = g10;
        this.f29533p = this;
        this.f29535q = new J0.p(getRoot(), dVar);
        C3959x c3959x = new C3959x(this);
        this.f29537r = c3959x;
        this.f29539s = new ViewOnAttachStateChangeListenerC5938b(this, new f(this));
        this.f29541t = new C3928j(context);
        this.f29543u = AbstractC6677M.a(this);
        this.f29545v = new g0.i();
        this.f29547w = new ArrayList();
        this.f29476A = new C8586g();
        this.f29478B = new C8563C(getRoot());
        this.f29480C = e.f29562a;
        this.f29482D = d0() ? new C5840a(this, getAutofillTree()) : null;
        this.f29486F = new C3931k(context);
        this.f29488G = new E0.o0(new w());
        this.f29516g1 = new E0.S(getRoot());
        this.f29518h1 = new V(ViewConfiguration.get(context));
        this.f29520i1 = Y0.o.a(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID);
        this.f29522j1 = new int[]{0, 0};
        float[] fArrC = m0.O0.c(null, 1, null);
        this.f29524k1 = fArrC;
        this.f29526l1 = m0.O0.c(null, 1, null);
        this.f29528m1 = m0.O0.c(null, 1, null);
        this.f29530n1 = -1L;
        this.f29534p1 = aVar.a();
        this.f29536q1 = true;
        this.f29538r1 = T.t1.d(null, null, 2, null);
        this.f29540s1 = T.o1.e(new z());
        this.f29544u1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                r.p0(this.f29459a);
            }
        };
        this.f29546v1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                r.O0(this.f29460a);
            }
        };
        this.f29548w1 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                r.U0(this.f29463a, z10);
            }
        };
        R0.V v10 = new R0.V(getView(), this);
        this.f29550x1 = v10;
        this.f29552y1 = new R0.T((R0.L) M.h().invoke(v10));
        this.f29554z1 = f0.k.a();
        this.f29477A1 = new C3938m0(getTextInputService());
        this.f29479B1 = new N(context);
        this.f29481C1 = T.o1.h(AbstractC3438o.a(context), T.o1.m());
        this.f29483D1 = o0(context.getResources().getConfiguration());
        Y0.t tVarE = androidx.compose.ui.focus.h.e(context.getResources().getConfiguration().getLayoutDirection());
        this.f29485E1 = T.t1.d(tVarE == null ? Y0.t.Ltr : tVarE, null, 2, null);
        this.f29487F1 = new C8125c(this);
        this.f29489G1 = new v0.c(isInTouchMode() ? C8183a.f63351b.b() : C8183a.f63351b.a(), new c(), b11 == true ? 1 : 0);
        this.f29491H1 = new D0.f(this);
        this.f29493I1 = new P(this);
        this.f29497L1 = new D1();
        this.f29498M1 = new V.b(new InterfaceC6824a[16], 0);
        this.f29500N1 = new u();
        this.f29501O1 = new Runnable() { // from class: androidx.compose.ui.platform.q
            @Override // java.lang.Runnable
            public final void run() {
                r.P0(this.f29466a);
            }
        };
        this.f29503Q1 = new t();
        int i10 = Build.VERSION.SDK_INT;
        this.f29504R1 = i10 < 29 ? new C3905b0(fArrC, b10 == true ? 1 : 0) : new C3911d0();
        addOnAttachStateChangeListener(this.f29539s);
        setWillNotDraw(false);
        setFocusable(true);
        L.f29245a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        F1.W.m0(this, c3959x);
        InterfaceC6835l interfaceC6835lA = C1.f29133d0.a();
        if (interfaceC6835lA != null) {
            interfaceC6835lA.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().u(this);
        if (i10 >= 29) {
            D.f29136a.a(this);
        }
        this.f29506T1 = i10 >= 31 ? new I0.l() : null;
        this.f29507U1 = new q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6533i C0() {
        if (isFocused()) {
            return getFocusOwner().i();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.h.a(viewFindFocus);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D0(int i10) {
        d.a aVar = androidx.compose.ui.focus.d.f28823b;
        if (androidx.compose.ui.focus.d.l(i10, aVar.b()) || androidx.compose.ui.focus.d.l(i10, aVar.c())) {
            return false;
        }
        Integer numC = androidx.compose.ui.focus.h.c(i10);
        if (numC == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        C6533i c6533iC0 = C0();
        Rect rectB = c6533iC0 != null ? m0.b1.b(c6533iC0) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rectB == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectB, iIntValue);
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), rectB);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E0(androidx.compose.ui.focus.d dVar, C6533i c6533i) {
        Integer numC;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((dVar == null || (numC = androidx.compose.ui.focus.h.c(dVar.o())) == null) ? 130 : numC.intValue(), c6533i != null ? m0.b1.b(c6533i) : null);
    }

    private final long F0(int i10, int i11) {
        return Yg.E.b(Yg.E.b(i11) | Yg.E.b(Yg.E.b(i10) << 32));
    }

    private final void G0() {
        if (this.f29532o1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f29530n1) {
            this.f29530n1 = jCurrentAnimationTimeMillis;
            I0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f29522j1);
            int[] iArr = this.f29522j1;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f29522j1;
            this.f29534p1 = AbstractC6532h.a(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    private final void H0(MotionEvent motionEvent) {
        this.f29530n1 = AnimationUtils.currentAnimationTimeMillis();
        I0();
        long jF = m0.O0.f(this.f29526l1, AbstractC6532h.a(motionEvent.getX(), motionEvent.getY()));
        this.f29534p1 = AbstractC6532h.a(motionEvent.getRawX() - C6531g.m(jF), motionEvent.getRawY() - C6531g.n(jF));
    }

    private final void I0() {
        this.f29504R1.a(this, this.f29526l1);
        D0.a(this.f29526l1, this.f29528m1);
    }

    private final void M0(E0.G g10) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (g10 != null) {
            while (g10 != null && g10.f0() == G.g.InMeasureBlock && g0(g10)) {
                g10 = g10.o0();
            }
            if (g10 == getRoot()) {
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

    static /* synthetic */ void N0(r rVar, E0.G g10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = null;
        }
        rVar.M0(g10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(r rVar) {
        rVar.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(r rVar) {
        rVar.f29502P1 = false;
        MotionEvent motionEvent = rVar.f29495J1;
        AbstractC6492s.f(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        rVar.Q0(motionEvent);
    }

    private final int Q0(MotionEvent motionEvent) {
        Object obj;
        if (this.f29505S1) {
            this.f29505S1 = false;
            this.f29523k.b(C8571K.b(motionEvent.getMetaState()));
        }
        C8561A c8561aC = this.f29476A.c(motionEvent, this);
        if (c8561aC == null) {
            this.f29478B.c();
            return AbstractC8564D.a(false, false);
        }
        List listB = c8561aC.b();
        int size = listB.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                obj = listB.get(size);
                if (((C8562B) obj).b()) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            obj = null;
        } else {
            obj = null;
        }
        C8562B c8562b = (C8562B) obj;
        if (c8562b != null) {
            this.f29508a = c8562b.f();
        }
        int iB = this.f29478B.b(c8561aC, this, y0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || AbstractC8574N.c(iB)) {
            return iB;
        }
        this.f29476A.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jQ = q(AbstractC6532h.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C6531g.m(jQ);
            pointerCoords.y = C6531g.n(jQ);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C8561A c8561aC = this.f29476A.c(motionEventObtain, this);
        AbstractC6492s.f(c8561aC);
        this.f29478B.b(c8561aC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void S0(r rVar, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        rVar.R0(motionEvent, i10, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T0(AbstractC6058h abstractC6058h, long j10, InterfaceC6835l interfaceC6835l) {
        Resources resources = getContext().getResources();
        return E.f29145a.a(this, abstractC6058h, new C6051a(Y0.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j10, interfaceC6835l, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(r rVar, boolean z10) {
        rVar.f29489G1.b(z10 ? C8183a.f63351b.b() : C8183a.f63351b.a());
    }

    private final void V0() {
        getLocationOnScreen(this.f29522j1);
        long j10 = this.f29520i1;
        int iH = Y0.n.h(j10);
        int i10 = Y0.n.i(j10);
        int[] iArr = this.f29522j1;
        boolean z10 = false;
        int i11 = iArr[0];
        if (iH != i11 || i10 != iArr[1]) {
            this.f29520i1 = Y0.o.a(i11, iArr[1]);
            if (iH != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
                getRoot().U().I().S1();
                z10 = true;
            }
        }
        this.f29516g1.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iE;
        if (AbstractC6492s.d(str, this.f29537r.c0())) {
            int iE2 = this.f29537r.e0().e(i10, -1);
            if (iE2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iE2);
                return;
            }
            return;
        }
        if (!AbstractC6492s.d(str, this.f29537r.b0()) || (iE = this.f29537r.d0().e(i10, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iE);
    }

    private final boolean d0() {
        return true;
    }

    private final boolean g0(E0.G g10) {
        E0.G gO0;
        return this.f29514f1 || !((gO0 = g10.o0()) == null || gO0.N());
    }

    @InterfaceC3661e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.f29538r1.getValue();
    }

    private final void h0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof r) {
                ((r) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                h0((ViewGroup) childAt);
            }
        }
    }

    private final long i0(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return F0(0, size);
        }
        if (mode == 0) {
            return F0(0, MPv3.MAX_MESSAGE_ID);
        }
        if (mode == 1073741824) {
            return F0(size, size);
        }
        throw new IllegalStateException();
    }

    private final void j0() {
        if (this.f29553z) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f29553z = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View l0(int i10) {
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            AbstractC6492s.g(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i10);
            if (viewFindNextFocus != null && !M.e(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final View m0(int i10, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC6492s.d(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewM0 = m0(i10, viewGroup.getChildAt(i11));
                    if (viewM0 != null) {
                        return viewM0;
                    }
                }
            }
        }
        return null;
    }

    private final int o0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(r rVar) {
        rVar.V0();
    }

    private final int q0(MotionEvent motionEvent) {
        int i10;
        int i11;
        removeCallbacks(this.f29500N1);
        try {
            H0(motionEvent);
            this.f29532o1 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f29495J1;
                boolean z10 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 == null || !s0(motionEvent, motionEvent2)) {
                    i10 = 10;
                } else {
                    if (x0(motionEvent2)) {
                        this.f29478B.c();
                    } else if (motionEvent2.getActionMasked() != 10 && z10) {
                        i10 = 10;
                        S0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                    i10 = 10;
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked == 3 || actionMasked == 9 || !y0(motionEvent)) {
                    i11 = 9;
                } else {
                    i11 = 9;
                    S0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f29495J1;
                if (motionEvent3 != null && motionEvent3.getAction() == i10) {
                    MotionEvent motionEvent4 = this.f29495J1;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i11 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.f29476A.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f29495J1;
                        float x10 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f29495J1;
                        boolean z12 = (x10 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f29495J1;
                        boolean z13 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                this.f29476A.e(pointerId);
                            }
                            this.f29478B.a();
                        }
                    }
                }
                this.f29495J1 = MotionEvent.obtainNoHistory(motionEvent);
                int iQ0 = Q0(motionEvent);
                Trace.endSection();
                return iQ0;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } finally {
            this.f29532o1 = false;
        }
    }

    private final boolean r0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().l(new A0.b(f10 * F1.Z.h(viewConfiguration, getContext()), f10 * F1.Z.e(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean s0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private void setDensity(Y0.d dVar) {
        this.f29511d.setValue(dVar);
    }

    private void setFontFamilyResolver(AbstractC3434k.b bVar) {
        this.f29481C1.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutDirection(Y0.t tVar) {
        this.f29485E1.setValue(tVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f29538r1.setValue(bVar);
    }

    private final void u0(E0.G g10) {
        g10.E0();
        V.b bVarW0 = g10.w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                u0((E0.G) objArrM[i10]);
                i10++;
            } while (i10 < iO);
        }
    }

    private final void v0(E0.G g10) {
        int i10 = 0;
        E0.S.G(this.f29516g1, g10, false, 2, null);
        V.b bVarW0 = g10.w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            do {
                v0((E0.G) objArrM[i10]);
                i10++;
            } while (i10 < iO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:22:0x004c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EDGE_INSN: B:41:0x0085->B:40:0x0085 BREAK  A[LOOP:0: B:22:0x004c->B:39:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean w0(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.H0 r0 = androidx.compose.ui.platform.H0.f29159a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.w0(android.view.MotionEvent):boolean");
    }

    private final boolean x0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean y0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    private final boolean z0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f29495J1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // E0.m0
    public void A(E0.G g10, long j10) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f29516g1.s(g10, j10);
            if (!this.f29516g1.m()) {
                E0.S.d(this.f29516g1, false, 1, null);
                j0();
            }
            Yg.J j11 = Yg.J.f24997a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void A0(E0.l0 l0Var, boolean z10) {
        if (!z10) {
            if (this.f29551y) {
                return;
            }
            this.f29547w.remove(l0Var);
            List list = this.f29549x;
            if (list != null) {
                list.remove(l0Var);
                return;
            }
            return;
        }
        if (!this.f29551y) {
            this.f29547w.add(l0Var);
            return;
        }
        List arrayList = this.f29549x;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f29549x = arrayList;
        }
        arrayList.add(l0Var);
    }

    @Override // E0.m0
    public void C(E0.G g10, boolean z10, boolean z11) {
        if (z10) {
            if (this.f29516g1.B(g10, z11)) {
                N0(this, null, 1, null);
            }
        } else if (this.f29516g1.E(g10, z11)) {
            N0(this, null, 1, null);
        }
    }

    public final boolean J0(E0.l0 l0Var) {
        if (this.f29494J != null) {
            x1.f29707p.b();
        }
        this.f29497L1.c(l0Var);
        return true;
    }

    public final void K0(androidx.compose.ui.viewinterop.c cVar) {
        k(new C1076r(cVar));
    }

    public final void L0() {
        this.f29484E = true;
    }

    @Override // E0.m0
    public void a(boolean z10) {
        InterfaceC6824a interfaceC6824a;
        if (this.f29516g1.m() || this.f29516g1.n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    interfaceC6824a = this.f29503Q1;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                interfaceC6824a = null;
            }
            if (this.f29516g1.r(interfaceC6824a)) {
                requestLayout();
            }
            E0.S.d(this.f29516g1, false, 1, null);
            j0();
            Yg.J j10 = Yg.J.f24997a;
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        C5840a c5840a;
        if (!d0() || (c5840a = this.f29482D) == null) {
            return;
        }
        AbstractC5842c.a(c5840a, sparseArray);
    }

    @Override // E0.m0
    public void b(E0.G g10) {
        this.f29537r.t0(g10);
        this.f29539s.u(g10);
    }

    public final void b0(androidx.compose.ui.viewinterop.c cVar, E0.G g10) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(cVar, g10);
        getAndroidViewsHandler$ui_release().addView(cVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(g10, cVar);
        cVar.setImportantForAccessibility(1);
        F1.W.m0(cVar, new d(g10, this));
    }

    @Override // E0.m0
    public void c(E0.G g10) {
        this.f29516g1.D(g10);
        N0(this, null, 1, null);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f29537r.N(false, i10, this.f29508a);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f29537r.N(true, i10, this.f29508a);
    }

    @Override // E0.m0
    public long d(long j10) {
        G0();
        return m0.O0.f(this.f29526l1, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            u0(getRoot());
        }
        E0.m0.f(this, false, 1, null);
        androidx.compose.runtime.snapshots.g.f28632e.n();
        this.f29551y = true;
        C6719o0 c6719o0 = this.f29529n;
        Canvas canvasA = c6719o0.a().a();
        c6719o0.a().z(canvas);
        getRoot().B(c6719o0.a(), null);
        c6719o0.a().z(canvasA);
        if (!this.f29547w.isEmpty()) {
            int size = this.f29547w.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((E0.l0) this.f29547w.get(i10)).j();
            }
        }
        if (x1.f29707p.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f29547w.clear();
        this.f29551y = false;
        List list = this.f29549x;
        if (list != null) {
            AbstractC6492s.f(list);
            this.f29547w.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f29502P1) {
            removeCallbacks(this.f29501O1);
            if (motionEvent.getActionMasked() == 8) {
                this.f29502P1 = false;
            } else {
                this.f29501O1.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (w0(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? r0(motionEvent) : AbstractC8574N.c(q0(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f29502P1) {
            removeCallbacks(this.f29501O1);
            this.f29501O1.run();
        }
        if (w0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f29537r.V(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && y0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f29495J1;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f29495J1 = MotionEvent.obtainNoHistory(motionEvent);
                this.f29502P1 = true;
                postDelayed(this.f29501O1, 8L);
                return false;
            }
        } else if (!z0(motionEvent)) {
            return false;
        }
        return AbstractC8574N.c(q0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().h(C8248b.b(keyEvent), new g(keyEvent));
        }
        this.f29523k.b(C8571K.b(keyEvent.getMetaState()));
        return k0.g.d(getFocusOwner(), C8248b.b(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().m(C8248b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            B.f29131a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f29502P1) {
            removeCallbacks(this.f29501O1);
            MotionEvent motionEvent2 = this.f29495J1;
            AbstractC6492s.f(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || s0(motionEvent, motionEvent2)) {
                this.f29501O1.run();
            } else {
                this.f29502P1 = false;
            }
        }
        if (w0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !z0(motionEvent)) {
            return false;
        }
        int iQ0 = q0(motionEvent);
        if (AbstractC8574N.b(iQ0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return AbstractC8574N.c(iQ0);
    }

    @Override // E0.m0
    public long e(long j10) {
        G0();
        return m0.O0.f(this.f29528m1, j10);
    }

    public final Object e0(InterfaceC5380e interfaceC5380e) {
        Object objM = this.f29537r.M(interfaceC5380e);
        return objM == AbstractC5467b.g() ? objM : Yg.J.f24997a;
    }

    public final Object f0(InterfaceC5380e interfaceC5380e) {
        Object objB = this.f29539s.b(interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewM0 = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
                if (objInvoke instanceof View) {
                    viewM0 = (View) objInvoke;
                }
            } else {
                viewM0 = m0(i10, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewM0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        if (view != null) {
            C6533i c6533iA = androidx.compose.ui.focus.h.a(view);
            androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.h.d(i10);
            if (AbstractC6492s.d(getFocusOwner().p(dVarD != null ? dVarD.o() : androidx.compose.ui.focus.d.f28823b.a(), c6533iA, o.f29565a), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i10);
    }

    @Override // androidx.lifecycle.InterfaceC4007e
    public void g(InterfaceC4017o interfaceC4017o) {
        setShowLayoutBounds(f29472V1.b());
    }

    public final Z getAndroidViewsHandler$ui_release() {
        if (this.f29492I == null) {
            Z z10 = new Z(getContext());
            this.f29492I = z10;
            addView(z10);
            requestLayout();
        }
        Z z11 = this.f29492I;
        AbstractC6492s.f(z11);
        return z11;
    }

    @Override // E0.m0
    public g0.d getAutofill() {
        return this.f29482D;
    }

    @Override // E0.m0
    public g0.i getAutofillTree() {
        return this.f29545v;
    }

    public final InterfaceC6835l getConfigurationChangeObserver() {
        return this.f29480C;
    }

    public final ViewOnAttachStateChangeListenerC5938b getContentCaptureManager$ui_release() {
        return this.f29539s;
    }

    @Override // E0.m0
    public InterfaceC5384i getCoroutineContext() {
        return this.f29519i;
    }

    @Override // E0.m0
    public Y0.d getDensity() {
        return (Y0.d) this.f29511d.getValue();
    }

    @Override // E0.m0
    public InterfaceC6053c getDragAndDropManager() {
        return this.f29521j;
    }

    @Override // E0.m0
    public k0.g getFocusOwner() {
        return this.f29515g;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Yg.J j10;
        C6533i c6533iC0 = C0();
        if (c6533iC0 != null) {
            rect.left = Math.round(c6533iC0.k());
            rect.top = Math.round(c6533iC0.n());
            rect.right = Math.round(c6533iC0.l());
            rect.bottom = Math.round(c6533iC0.e());
            j10 = Yg.J.f24997a;
        } else {
            j10 = null;
        }
        if (j10 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // E0.m0
    public AbstractC3434k.b getFontFamilyResolver() {
        return (AbstractC3434k.b) this.f29481C1.getValue();
    }

    @Override // E0.m0
    public InterfaceC3433j.a getFontLoader() {
        return this.f29479B1;
    }

    @Override // E0.m0
    public InterfaceC6671H0 getGraphicsContext() {
        return this.f29543u;
    }

    @Override // E0.m0
    public InterfaceC8123a getHapticFeedBack() {
        return this.f29487F1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f29516g1.m();
    }

    @Override // E0.m0
    public InterfaceC8184b getInputModeManager() {
        return this.f29489G1;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f29530n1;
    }

    @Override // android.view.View, android.view.ViewParent, E0.m0
    public Y0.t getLayoutDirection() {
        return (Y0.t) this.f29485E1.getValue();
    }

    public long getMeasureIteration() {
        return this.f29516g1.q();
    }

    @Override // E0.m0
    public D0.f getModifierLocalManager() {
        return this.f29491H1;
    }

    @Override // E0.m0
    public t.a getPlacementScope() {
        return androidx.compose.ui.layout.u.b(this);
    }

    @Override // E0.m0
    public InterfaceC8601v getPointerIconService() {
        return this.f29507U1;
    }

    @Override // E0.m0
    public E0.G getRoot() {
        return this.f29531o;
    }

    public E0.u0 getRootForTest() {
        return this.f29533p;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        I0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f29506T1) == null) {
            return false;
        }
        return lVar.c();
    }

    public J0.p getSemanticsOwner() {
        return this.f29535q;
    }

    @Override // E0.m0
    public E0.I getSharedDrawScope() {
        return this.f29510c;
    }

    @Override // E0.m0
    public boolean getShowLayoutBounds() {
        return this.f29490H;
    }

    @Override // E0.m0
    public E0.o0 getSnapshotObserver() {
        return this.f29488G;
    }

    @Override // E0.m0
    public n1 getSoftwareKeyboardController() {
        return this.f29477A1;
    }

    @Override // E0.m0
    public R0.T getTextInputService() {
        return this.f29552y1;
    }

    @Override // E0.m0
    public q1 getTextToolbar() {
        return this.f29493I1;
    }

    public View getView() {
        return this;
    }

    @Override // E0.m0
    public w1 getViewConfiguration() {
        return this.f29518h1;
    }

    public final b getViewTreeOwners() {
        return (b) this.f29540s1.getValue();
    }

    @Override // E0.m0
    public E1 getWindowInfo() {
        return this.f29523k;
    }

    @Override // E0.m0
    public void i(E0.G g10) {
        this.f29516g1.v(g10);
        L0();
    }

    @Override // E0.m0
    public void k(InterfaceC6824a interfaceC6824a) {
        if (this.f29498M1.i(interfaceC6824a)) {
            return;
        }
        this.f29498M1.b(interfaceC6824a);
    }

    public final void k0(androidx.compose.ui.viewinterop.c cVar, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(cVar, canvas);
    }

    @Override // E0.m0
    public void l(View view) {
        this.f29553z = true;
    }

    public androidx.compose.ui.focus.d n0(KeyEvent keyEvent) {
        long jA = AbstractC8250d.a(keyEvent);
        C8247a.C2277a c2277a = C8247a.f64178b;
        if (C8247a.p(jA, c2277a.l())) {
            return androidx.compose.ui.focus.d.i(AbstractC8250d.f(keyEvent) ? androidx.compose.ui.focus.d.f28823b.f() : androidx.compose.ui.focus.d.f28823b.e());
        }
        if (C8247a.p(jA, c2277a.e())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.g());
        }
        if (C8247a.p(jA, c2277a.d())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.d());
        }
        if (C8247a.p(jA, c2277a.f()) ? true : C8247a.p(jA, c2277a.k())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.h());
        }
        if (C8247a.p(jA, c2277a.c()) ? true : C8247a.p(jA, c2277a.j())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.a());
        }
        if (C8247a.p(jA, c2277a.b()) ? true : C8247a.p(jA, c2277a.g()) ? true : C8247a.p(jA, c2277a.i())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.b());
        }
        if (C8247a.p(jA, c2277a.a()) ? true : C8247a.p(jA, c2277a.h())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f28823b.c());
        }
        return null;
    }

    @Override // E0.m0
    public void o(E0.G g10, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            if (this.f29516g1.C(g10, z11) && z12) {
                M0(g10);
                return;
            }
            return;
        }
        if (this.f29516g1.F(g10, z11) && z12) {
            M0(g10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        InterfaceC4017o interfaceC4017oA;
        AbstractC4013k abstractC4013kO;
        InterfaceC4017o interfaceC4017oA2;
        C5840a c5840a;
        super.onAttachedToWindow();
        this.f29523k.c(hasWindowFocus());
        v0(getRoot());
        u0(getRoot());
        getSnapshotObserver().k();
        if (d0() && (c5840a = this.f29482D) != null) {
            g0.g.f47371a.a(c5840a);
        }
        InterfaceC4017o interfaceC4017oA3 = androidx.lifecycle.T.a(this);
        InterfaceC7418f interfaceC7418fA = AbstractC7419g.a(this);
        b viewTreeOwners = getViewTreeOwners();
        AbstractC4013k abstractC4013kO2 = null;
        if (viewTreeOwners == null || (interfaceC4017oA3 != null && interfaceC7418fA != null && (interfaceC4017oA3 != viewTreeOwners.a() || interfaceC7418fA != viewTreeOwners.a()))) {
            if (interfaceC4017oA3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC7418fA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (interfaceC4017oA = viewTreeOwners.a()) != null && (abstractC4013kO = interfaceC4017oA.O()) != null) {
                abstractC4013kO.c(this);
            }
            interfaceC4017oA3.O().a(this);
            b bVar = new b(interfaceC4017oA3, interfaceC7418fA);
            set_viewTreeOwners(bVar);
            InterfaceC6835l interfaceC6835l = this.f29542t1;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(bVar);
            }
            this.f29542t1 = null;
        }
        this.f29489G1.b(isInTouchMode() ? C8183a.f63351b.b() : C8183a.f63351b.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (interfaceC4017oA2 = viewTreeOwners2.a()) != null) {
            abstractC4013kO2 = interfaceC4017oA2.O();
        }
        if (abstractC4013kO2 == null) {
            B0.a.c("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        abstractC4013kO2.a(this);
        abstractC4013kO2.a(this.f29539s);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f29544u1);
        getViewTreeObserver().addOnScrollChangedListener(this.f29546v1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f29548w1);
        if (Build.VERSION.SDK_INT >= 31) {
            J.f29184a.b(this);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        O o10 = (O) f0.k.c(this.f29554z1);
        return o10 == null ? this.f29550x1.r() : o10.f();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(Y0.a.a(getContext()));
        if (o0(configuration) != this.f29483D1) {
            this.f29483D1 = o0(configuration);
            setFontFamilyResolver(AbstractC3438o.a(getContext()));
        }
        this.f29480C.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        O o10 = (O) f0.k.c(this.f29554z1);
        return o10 == null ? this.f29550x1.o(editorInfo) : o10.e(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f29539s.s(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C5840a c5840a;
        InterfaceC4017o interfaceC4017oA;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        b viewTreeOwners = getViewTreeOwners();
        AbstractC4013k abstractC4013kO = (viewTreeOwners == null || (interfaceC4017oA = viewTreeOwners.a()) == null) ? null : interfaceC4017oA.O();
        if (abstractC4013kO == null) {
            B0.a.c("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        abstractC4013kO.c(this.f29539s);
        abstractC4013kO.c(this);
        if (d0() && (c5840a = this.f29482D) != null) {
            g0.g.f47371a.b(c5840a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f29544u1);
        getViewTreeObserver().removeOnScrollChangedListener(this.f29546v1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f29548w1);
        if (Build.VERSION.SDK_INT >= 31) {
            J.f29184a.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        getFocusOwner().n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f29516g1.r(this.f29503Q1);
        this.f29499N = null;
        V0();
        if (this.f29492I != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                v0(getRoot());
            }
            long jI0 = i0(i10);
            int iB = (int) Yg.E.b(jI0 >>> 32);
            int iB2 = (int) Yg.E.b(jI0 & Counter32.MAX_COUNTER32_VALUE);
            long jI02 = i0(i11);
            long jA = Y0.b.f24516b.a(iB, iB2, (int) Yg.E.b(jI02 >>> 32), (int) Yg.E.b(Counter32.MAX_COUNTER32_VALUE & jI02));
            Y0.b bVar = this.f29499N;
            boolean zF = false;
            if (bVar == null) {
                this.f29499N = Y0.b.a(jA);
                this.f29514f1 = false;
            } else {
                if (bVar != null) {
                    zF = Y0.b.f(bVar.r(), jA);
                }
                if (!zF) {
                    this.f29514f1 = true;
                }
            }
            this.f29516g1.H(jA);
            this.f29516g1.t();
            setMeasuredDimension(getRoot().t0(), getRoot().O());
            if (this.f29492I != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().t0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().O(), 1073741824));
            }
            Yg.J j10 = Yg.J.f24997a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        C5840a c5840a;
        if (!d0() || viewStructure == null || (c5840a = this.f29482D) == null) {
            return;
        }
        AbstractC5842c.b(c5840a, viewStructure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.f29509b) {
            Y0.t tVarE = androidx.compose.ui.focus.h.e(i10);
            if (tVarE == null) {
                tVarE = Y0.t.Ltr;
            }
            setLayoutDirection(tVarE);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        I0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f29506T1) == null) {
            return;
        }
        lVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b = this.f29539s;
        viewOnAttachStateChangeListenerC5938b.x(viewOnAttachStateChangeListenerC5938b, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean zB;
        this.f29523k.c(z10);
        this.f29505S1 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zB = f29472V1.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        t0();
    }

    @Override // y0.InterfaceC8573M
    public long q(long j10) {
        G0();
        long jF = m0.O0.f(this.f29526l1, j10);
        return AbstractC6532h.a(C6531g.m(jF) + C6531g.m(this.f29534p1), C6531g.n(jF) + C6531g.n(this.f29534p1));
    }

    @Override // y0.InterfaceC8573M
    public long r(long j10) {
        G0();
        return m0.O0.f(this.f29528m1, AbstractC6532h.a(C6531g.m(j10) - C6531g.m(this.f29534p1), C6531g.n(j10) - C6531g.n(this.f29534p1)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().f().getHasFocus()) {
            return super.requestFocus(i10, rect);
        }
        androidx.compose.ui.focus.d dVarD = androidx.compose.ui.focus.h.d(i10);
        int iO = dVarD != null ? dVarD.o() : androidx.compose.ui.focus.d.f28823b.b();
        Boolean boolP = getFocusOwner().p(iO, rect != null ? m0.b1.e(rect) : null, new s(iO));
        if (boolP != null) {
            return boolP.booleanValue();
        }
        return false;
    }

    @Override // E0.m0
    public void s(E0.G g10, boolean z10) {
        this.f29516g1.i(g10, z10);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f29537r.S0(j10);
    }

    public final void setConfigurationChangeObserver(InterfaceC6835l interfaceC6835l) {
        this.f29480C = interfaceC6835l;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC5938b viewOnAttachStateChangeListenerC5938b) {
        this.f29539s = viewOnAttachStateChangeListenerC5938b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public void setCoroutineContext(InterfaceC5384i interfaceC5384i) {
        this.f29519i = interfaceC5384i;
        InterfaceC2632j interfaceC2632jK = getRoot().k0().k();
        if (interfaceC2632jK instanceof InterfaceC8578S) {
            ((InterfaceC8578S) interfaceC2632jK).Z1();
        }
        int iA = E0.e0.a(16);
        if (!interfaceC2632jK.h1().k2()) {
            B0.a.b("visitSubtree called on an unattached node");
        }
        e.c cVarB2 = interfaceC2632jK.h1().b2();
        E0.G gM = AbstractC2633k.m(interfaceC2632jK);
        E0.Z z10 = new E0.Z();
        while (gM != null) {
            if (cVarB2 == null) {
                cVarB2 = gM.k0().k();
            }
            if ((cVarB2.a2() & iA) != 0) {
                while (cVarB2 != null) {
                    if ((cVarB2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarB2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof E0.s0) {
                                E0.s0 s0Var = (E0.s0) abstractC2635mG;
                                if (s0Var instanceof InterfaceC8578S) {
                                    ((InterfaceC8578S) s0Var).Z1();
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            abstractC2635mG = cVarE2;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (abstractC2635mG != 0) {
                                                bVar.b(abstractC2635mG);
                                                abstractC2635mG = 0;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.b2();
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarB2 = cVarB2.b2();
                }
            }
            z10.c(gM.w0());
            gM = z10.a() ? (E0.G) z10.b() : null;
            cVarB2 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f29530n1 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC6835l interfaceC6835l) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC6835l.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f29542t1 = interfaceC6835l;
    }

    @Override // E0.m0
    public void setShowLayoutBounds(boolean z10) {
        this.f29490H = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // y0.InterfaceC8573M
    public void t(float[] fArr) {
        G0();
        m0.O0.n(fArr, this.f29526l1);
        M.j(fArr, C6531g.m(this.f29534p1), C6531g.n(this.f29534p1), this.f29524k1);
    }

    public void t0() {
        u0(getRoot());
    }

    @Override // E0.m0
    public void u(E0.G g10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // E0.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(mh.InterfaceC6839p r5, dh.InterfaceC5380e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.r.x
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.r$x r0 = (androidx.compose.ui.platform.r.x) r0
            int r1 = r0.f29580c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29580c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.r$x r0 = new androidx.compose.ui.platform.r$x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29578a
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f29580c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            Yg.v.b(r6)
            goto L44
        L31:
            Yg.v.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.f29554z1
            androidx.compose.ui.platform.r$y r2 = new androidx.compose.ui.platform.r$y
            r2.<init>()
            r0.f29580c = r3
            java.lang.Object r5 = f0.k.d(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.w(mh.p, dh.e):java.lang.Object");
    }

    @Override // E0.m0
    public void x() {
        if (this.f29484E) {
            getSnapshotObserver().b();
            this.f29484E = false;
        }
        Z z10 = this.f29492I;
        if (z10 != null) {
            h0(z10);
        }
        while (this.f29498M1.u()) {
            int iO = this.f29498M1.o();
            for (int i10 = 0; i10 < iO; i10++) {
                InterfaceC6824a interfaceC6824a = (InterfaceC6824a) this.f29498M1.m()[i10];
                this.f29498M1.C(i10, null);
                if (interfaceC6824a != null) {
                    interfaceC6824a.invoke();
                }
            }
            this.f29498M1.A(0, iO);
        }
    }

    @Override // E0.m0
    public E0.l0 y(InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a, C7182c c7182c) {
        if (c7182c != null) {
            return new C3954u0(c7182c, null, this, interfaceC6839p, interfaceC6824a);
        }
        E0.l0 l0Var = (E0.l0) this.f29497L1.b();
        if (l0Var != null) {
            l0Var.g(interfaceC6839p, interfaceC6824a);
            return l0Var;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new C3954u0(getGraphicsContext().b(), getGraphicsContext(), this, interfaceC6839p, interfaceC6824a);
        }
        if (isHardwareAccelerated() && this.f29536q1) {
            try {
                return new C3918f1(this, interfaceC6839p, interfaceC6824a);
            } catch (Throwable unused) {
                this.f29536q1 = false;
            }
        }
        if (this.f29494J == null) {
            x1.c cVar = x1.f29707p;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            C3948r0 c3948r0 = cVar.b() ? new C3948r0(getContext()) : new y1(getContext());
            this.f29494J = c3948r0;
            addView(c3948r0);
        }
        C3948r0 c3948r02 = this.f29494J;
        AbstractC6492s.f(c3948r02);
        return new x1(this, c3948r02, interfaceC6839p, interfaceC6824a);
    }

    @Override // E0.m0
    public void z() {
        this.f29537r.u0();
        this.f29539s.v();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        AbstractC6492s.f(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i10, layoutParams);
    }

    @Override // E0.m0
    public C3928j getAccessibilityManager() {
        return this.f29541t;
    }

    @Override // E0.m0
    public C3931k getClipboardManager() {
        return this.f29486F;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        Yg.J j10 = Yg.J.f24997a;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }
}
