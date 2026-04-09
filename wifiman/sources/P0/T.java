package p0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6538n;
import m0.C6668G;
import m0.C6719o0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6835l;
import o0.AbstractC7038e;
import o0.C7034a;
import o0.InterfaceC7037d;

/* loaded from: classes.dex */
public final class T extends View {

    /* renamed from: k, reason: collision with root package name */
    public static final b f57361k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    private static final ViewOutlineProvider f57362l = new a();

    /* renamed from: a, reason: collision with root package name */
    private final View f57363a;

    /* renamed from: b, reason: collision with root package name */
    private final C6719o0 f57364b;

    /* renamed from: c, reason: collision with root package name */
    private final C7034a f57365c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f57366d;

    /* renamed from: e, reason: collision with root package name */
    private Outline f57367e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f57368f;

    /* renamed from: g, reason: collision with root package name */
    private Y0.d f57369g;

    /* renamed from: h, reason: collision with root package name */
    private Y0.t f57370h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6835l f57371i;

    /* renamed from: j, reason: collision with root package name */
    private C7182c f57372j;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof T) || (outline2 = ((T) view).f57367e) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public T(View view, C6719o0 c6719o0, C7034a c7034a) {
        super(view.getContext());
        this.f57363a = view;
        this.f57364b = c6719o0;
        this.f57365c = c7034a;
        setOutlineProvider(f57362l);
        this.f57368f = true;
        this.f57369g = AbstractC7038e.a();
        this.f57370h = Y0.t.Ltr;
        this.f57371i = InterfaceC7183d.f57411a.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final void b(Y0.d dVar, Y0.t tVar, C7182c c7182c, InterfaceC6835l interfaceC6835l) {
        this.f57369g = dVar;
        this.f57370h = tVar;
        this.f57371i = interfaceC6835l;
        this.f57372j = c7182c;
    }

    public final boolean c(Outline outline) {
        this.f57367e = outline;
        return K.f57355a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C6719o0 c6719o0 = this.f57364b;
        Canvas canvasA = c6719o0.a().a();
        c6719o0.a().z(canvas);
        C6668G c6668gA = c6719o0.a();
        C7034a c7034a = this.f57365c;
        Y0.d dVar = this.f57369g;
        Y0.t tVar = this.f57370h;
        long jA = AbstractC6538n.a(getWidth(), getHeight());
        C7182c c7182c = this.f57372j;
        InterfaceC6835l interfaceC6835l = this.f57371i;
        Y0.d density = c7034a.k1().getDensity();
        Y0.t layoutDirection = c7034a.k1().getLayoutDirection();
        InterfaceC6717n0 interfaceC6717n0D = c7034a.k1().d();
        long jC = c7034a.k1().c();
        C7182c c7182cG = c7034a.k1().g();
        InterfaceC7037d interfaceC7037dK1 = c7034a.k1();
        interfaceC7037dK1.a(dVar);
        interfaceC7037dK1.b(tVar);
        interfaceC7037dK1.i(c6668gA);
        interfaceC7037dK1.f(jA);
        interfaceC7037dK1.h(c7182c);
        c6668gA.j();
        try {
            interfaceC6835l.invoke(c7034a);
            c6668gA.r();
            InterfaceC7037d interfaceC7037dK12 = c7034a.k1();
            interfaceC7037dK12.a(density);
            interfaceC7037dK12.b(layoutDirection);
            interfaceC7037dK12.i(interfaceC6717n0D);
            interfaceC7037dK12.f(jC);
            interfaceC7037dK12.h(c7182cG);
            c6719o0.a().z(canvasA);
            this.f57366d = false;
        } catch (Throwable th2) {
            c6668gA.r();
            InterfaceC7037d interfaceC7037dK13 = c7034a.k1();
            interfaceC7037dK13.a(density);
            interfaceC7037dK13.b(layoutDirection);
            interfaceC7037dK13.i(interfaceC6717n0D);
            interfaceC7037dK13.f(jC);
            interfaceC7037dK13.h(c7182cG);
            throw th2;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f57368f;
    }

    public final C6719o0 getCanvasHolder() {
        return this.f57364b;
    }

    public final View getOwnerView() {
        return this.f57363a;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f57368f;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f57366d) {
            return;
        }
        this.f57366d = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f57368f != z10) {
            this.f57368f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f57366d = z10;
    }
}
