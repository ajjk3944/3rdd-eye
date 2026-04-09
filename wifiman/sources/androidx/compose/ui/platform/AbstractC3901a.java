package androidx.compose.ui.platform;

import T.AbstractC3546o;
import T.AbstractC3550q;
import T.InterfaceC3540l;
import T.InterfaceC3548p;
import T.N0;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3901a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f29322a;

    /* renamed from: b, reason: collision with root package name */
    private IBinder f29323b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3548p f29324c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3550q f29325d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6824a f29326e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29327f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29328g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29329h;

    /* renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    static final class C1074a extends AbstractC6494u implements InterfaceC6839p {
        C1074a() {
            super(2);
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
            }
            AbstractC3901a.this.a(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ AbstractC3901a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final AbstractC3550q b(AbstractC3550q abstractC3550q) {
        AbstractC3550q abstractC3550q2 = i(abstractC3550q) ? abstractC3550q : null;
        if (abstractC3550q2 != null) {
            this.f29322a = new WeakReference(abstractC3550q2);
        }
        return abstractC3550q;
    }

    private final void c() {
        if (this.f29328g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.f29324c == null) {
            try {
                this.f29328g = true;
                this.f29324c = M1.c(this, j(), b0.c.c(-656146368, true, new C1074a()));
            } finally {
                this.f29328g = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean i(AbstractC3550q abstractC3550q) {
        return !(abstractC3550q instanceof T.N0) || ((N0.d) ((T.N0) abstractC3550q).d0().getValue()).compareTo(N0.d.ShuttingDown) > 0;
    }

    private final AbstractC3550q j() {
        AbstractC3550q abstractC3550q;
        AbstractC3550q abstractC3550q2 = this.f29325d;
        if (abstractC3550q2 != null) {
            return abstractC3550q2;
        }
        AbstractC3550q abstractC3550qD = J1.d(this);
        AbstractC3550q abstractC3550q3 = null;
        AbstractC3550q abstractC3550qB = abstractC3550qD != null ? b(abstractC3550qD) : null;
        if (abstractC3550qB != null) {
            return abstractC3550qB;
        }
        WeakReference weakReference = this.f29322a;
        if (weakReference != null && (abstractC3550q = (AbstractC3550q) weakReference.get()) != null && i(abstractC3550q)) {
            abstractC3550q3 = abstractC3550q;
        }
        AbstractC3550q abstractC3550q4 = abstractC3550q3;
        return abstractC3550q4 == null ? b(J1.h(this)) : abstractC3550q4;
    }

    private final void setParentContext(AbstractC3550q abstractC3550q) {
        if (this.f29325d != abstractC3550q) {
            this.f29325d = abstractC3550q;
            if (abstractC3550q != null) {
                this.f29322a = null;
            }
            InterfaceC3548p interfaceC3548p = this.f29324c;
            if (interfaceC3548p != null) {
                interfaceC3548p.dispose();
                this.f29324c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f29323b != iBinder) {
            this.f29323b = iBinder;
            this.f29322a = null;
        }
    }

    public abstract void a(InterfaceC3540l interfaceC3540l, int i10);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void d() {
        if (this.f29325d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        InterfaceC3548p interfaceC3548p = this.f29324c;
        if (interfaceC3548p != null) {
            interfaceC3548p.dispose();
        }
        this.f29324c = null;
        requestLayout();
    }

    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f29324c != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f29327f;
    }

    public void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f29329h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        f();
        h(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(AbstractC3550q abstractC3550q) {
        setParentContext(abstractC3550q);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f29327f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((E0.m0) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f29329h = true;
    }

    public final void setViewCompositionStrategy(u1 u1Var) {
        InterfaceC6824a interfaceC6824a = this.f29326e;
        if (interfaceC6824a != null) {
            interfaceC6824a.invoke();
        }
        this.f29326e = u1Var.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC3901a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        this.f29326e = u1.f29619a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        c();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        c();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        c();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i10, layoutParams);
    }
}
