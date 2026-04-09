package h7;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import e7.C5425a;
import gg.AbstractC5912b;
import hg.C6042b;
import i7.C6080c;
import k7.C6399b;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class j extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final a f48491g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private g f48492a;

    /* renamed from: b, reason: collision with root package name */
    private final e7.e f48493b;

    /* renamed from: c, reason: collision with root package name */
    private final k7.d f48494c;

    /* renamed from: d, reason: collision with root package name */
    private C6042b f48495d;

    /* renamed from: e, reason: collision with root package name */
    private final C6080c f48496e;

    /* renamed from: f, reason: collision with root package name */
    private m7.d f48497f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements InterfaceC6469f {
        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C6399b detectedObject) {
            AbstractC6492s.i(detectedObject, "detectedObject");
            j.this.getRequiredController().u().h(detectedObject);
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(C5425a position) {
            AbstractC6492s.i(position, "position");
            j.this.getRequiredController().W(new PointF(-position.a(), position.b()));
            j.this.getRequiredController().X(position.c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        AbstractC6492s.i(context, "context");
        e7.e eVar = new e7.e();
        this.f48493b = eVar;
        k7.d dVar = com.ubnt.usurvey.a.f39654r.a().getConfig().k() ? new k7.d(context, 0.8f, 500L) : null;
        this.f48494c = dVar;
        C6080c c6080c = new C6080c(context);
        c6080c.setFrameSpacePositionProcessor$ar_floorplan_release(eVar);
        c6080c.setFrameObjectDetector$ar_floorplan_release(dVar);
        this.f48496e = c6080c;
        setBackgroundColor(-16777216);
        addView(c6080c, -1, -1);
    }

    private final AbstractC5912b d() {
        gg.i iVarI;
        gg.i iVarF0;
        AbstractC5912b abstractC5912bE0;
        k7.d dVar = this.f48494c;
        if (dVar != null && (iVarI = dVar.i()) != null && (iVarF0 = iVarI.f0(new b())) != null && (abstractC5912bE0 = iVarF0.E0()) != null) {
            return abstractC5912bE0;
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.h(abstractC5912bM, "complete(...)");
        return abstractC5912bM;
    }

    private final AbstractC5912b e() {
        AbstractC5912b abstractC5912bE0 = this.f48493b.b().f0(new c()).E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        return abstractC5912bE0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g getRequiredController() {
        g gVar = this.f48492a;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("setup() needs to be called first");
    }

    private final void i() {
        C6042b c6042b = this.f48495d;
        if (c6042b == null || c6042b.isDisposed()) {
            InterfaceC6464a interfaceC6464a = new InterfaceC6464a() { // from class: h7.h
                @Override // kg.InterfaceC6464a
                public final void run() {
                    j.j();
                }
            };
            InterfaceC6469f interfaceC6469f = new InterfaceC6469f() { // from class: h7.i
                @Override // kg.InterfaceC6469f
                public final void accept(Object obj) throws Throwable {
                    j.setupArFrameProcessing$lambda$2((Throwable) obj);
                }
            };
            this.f48495d = new C6042b(e().W(Gg.a.a()).U(interfaceC6464a, interfaceC6469f), d().W(Gg.a.a()).U(interfaceC6464a, interfaceC6469f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
    }

    private final void k() {
        C6042b c6042b = this.f48495d;
        if (c6042b != null) {
            c6042b.dispose();
        }
        this.f48495d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupArFrameProcessing$lambda$2(Throwable it) throws Throwable {
        AbstractC6492s.i(it, "it");
        throw it;
    }

    public final void f() {
        Z7.b.h("FloorplanAR Paused", null, 2, null);
        this.f48496e.f();
        k();
    }

    public final void g(boolean z10) {
        Z7.b.h("FloorplanAR View resumed", null, 2, null);
        this.f48496e.g(z10);
        if (z10) {
            i();
        }
    }

    public final m7.d getGestureWrapper() {
        return this.f48497f;
    }

    public final C6080c getSurfaceView() {
        return this.f48496e;
    }

    public final void h(g controller, m7.e renderer) {
        AbstractC6492s.i(controller, "controller");
        AbstractC6492s.i(renderer, "renderer");
        this.f48492a = controller;
        controller.P(this.f48496e);
        Context context = getContext();
        AbstractC6492s.h(context, "getContext(...)");
        this.f48497f = new m7.d(context, renderer, controller);
        this.f48496e.setTilesRenderer(renderer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48496e.onDetachedFromWindow();
        g gVar = this.f48492a;
        if (gVar != null) {
            gVar.P(this.f48496e);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        m7.d dVar = this.f48497f;
        if (dVar != null) {
            AbstractC6492s.f(motionEvent);
            zL = dVar.l(motionEvent);
        } else {
            zL = false;
        }
        return zL || super.onTouchEvent(motionEvent);
    }

    public final void setGestureWrapper(m7.d dVar) {
        this.f48497f = dVar;
    }
}
