package androidx.compose.ui.window;

import T.AbstractC3546o;
import T.AbstractC3550q;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.X0;
import T.t1;
import Yg.J;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractC3901a;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
final class h extends AbstractC3901a {

    /* renamed from: i, reason: collision with root package name */
    private final Window f29935i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3551q0 f29936j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29937k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29938l;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29940b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f29940b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            h.this.a(interfaceC3540l, L0.a(this.f29940b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public h(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.f29935i = window;
        this.f29936j = t1.d(f.f29929a.a(), null, 2, null);
    }

    private final InterfaceC6839p getContent() {
        return (InterfaceC6839p) this.f29936j.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(InterfaceC6839p interfaceC6839p) {
        this.f29936j.setValue(interfaceC6839p);
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void a(InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1735448596);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1735448596, i11, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)");
            }
            getContent().invoke(interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(i10));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.g(z10, i10, i11, i12, i13);
        if (this.f29937k || (childAt = getChildAt(0)) == null) {
            return;
        }
        l().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f29938l;
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void h(int i10, int i11) {
        if (this.f29937k) {
            super.h(i10, i11);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), PduHandle.NONE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), PduHandle.NONE));
        }
    }

    public final boolean k() {
        return this.f29937k;
    }

    public Window l() {
        return this.f29935i;
    }

    public final void m(AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        setParentCompositionContext(abstractC3550q);
        setContent(interfaceC6839p);
        this.f29938l = true;
        d();
    }

    public final void n(boolean z10) {
        this.f29937k = z10;
    }
}
