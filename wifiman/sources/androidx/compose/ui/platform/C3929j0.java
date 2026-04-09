package androidx.compose.ui.platform;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3929j0 extends AbstractC3901a {

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f29403i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29404j;

    /* renamed from: androidx.compose.ui.platform.j0$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f29406b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f29406b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            C3929j0.this.a(interfaceC3540l, T.L0.a(this.f29406b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ C3929j0(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    public void a(InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(420213850);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            InterfaceC6839p interfaceC6839p = (InterfaceC6839p) this.f29403i.getValue();
            if (interfaceC6839p == null) {
                interfaceC3540lR.U(358373017);
            } else {
                interfaceC3540lR.U(150107752);
                interfaceC6839p.invoke(interfaceC3540lR, 0);
            }
            interfaceC3540lR.J();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C3929j0.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractC3901a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f29404j;
    }

    public final void setContent(InterfaceC6839p interfaceC6839p) {
        this.f29404j = true;
        this.f29403i.setValue(interfaceC6839p);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public C3929j0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29403i = T.t1.d(null, null, 2, null);
    }
}
