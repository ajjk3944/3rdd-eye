package androidx.compose.ui.viewinterop;

import E0.m0;
import T.AbstractC3550q;
import Yg.J;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractC3901a;
import androidx.compose.ui.platform.B1;
import c0.InterfaceC4179h;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import x0.C8413b;

/* loaded from: classes.dex */
public final class i extends androidx.compose.ui.viewinterop.c implements B1 {

    /* renamed from: A, reason: collision with root package name */
    private final View f29854A;

    /* renamed from: B, reason: collision with root package name */
    private final C8413b f29855B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC4179h f29856C;

    /* renamed from: D, reason: collision with root package name */
    private final int f29857D;

    /* renamed from: E, reason: collision with root package name */
    private final String f29858E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC4179h.a f29859F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC6835l f29860G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC6835l f29861H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC6835l f29862I;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            i.this.f29854A.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        public final void a() {
            i.this.getReleaseBlock().invoke(i.this.f29854A);
            i.this.z();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        public final void a() {
            i.this.getResetBlock().invoke(i.this.f29854A);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        public final void a() {
            i.this.getUpdateBlock().invoke(i.this.f29854A);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* synthetic */ i(Context context, AbstractC3550q abstractC3550q, View view, C8413b c8413b, InterfaceC4179h interfaceC4179h, int i10, m0 m0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : abstractC3550q, view, (i11 & 8) != 0 ? new C8413b() : c8413b, interfaceC4179h, i10, m0Var);
    }

    private final void setSavableRegistryEntry(InterfaceC4179h.a aVar) {
        InterfaceC4179h.a aVar2 = this.f29859F;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.f29859F = aVar;
    }

    private final void y() {
        InterfaceC4179h interfaceC4179h = this.f29856C;
        if (interfaceC4179h != null) {
            setSavableRegistryEntry(interfaceC4179h.e(this.f29858E, new a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        setSavableRegistryEntry(null);
    }

    public final C8413b getDispatcher() {
        return this.f29855B;
    }

    public final InterfaceC6835l getReleaseBlock() {
        return this.f29862I;
    }

    public final InterfaceC6835l getResetBlock() {
        return this.f29861H;
    }

    @Override // androidx.compose.ui.platform.B1
    public /* bridge */ /* synthetic */ AbstractC3901a getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final InterfaceC6835l getUpdateBlock() {
        return this.f29860G;
    }

    @Override // androidx.compose.ui.platform.B1
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(InterfaceC6835l interfaceC6835l) {
        this.f29862I = interfaceC6835l;
        setRelease(new b());
    }

    public final void setResetBlock(InterfaceC6835l interfaceC6835l) {
        this.f29861H = interfaceC6835l;
        setReset(new c());
    }

    public final void setUpdateBlock(InterfaceC6835l interfaceC6835l) {
        this.f29860G = interfaceC6835l;
        setUpdate(new d());
    }

    private i(Context context, AbstractC3550q abstractC3550q, View view, C8413b c8413b, InterfaceC4179h interfaceC4179h, int i10, m0 m0Var) {
        super(context, abstractC3550q, i10, c8413b, view, m0Var);
        this.f29854A = view;
        this.f29855B = c8413b;
        this.f29856C = interfaceC4179h;
        this.f29857D = i10;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        this.f29858E = strValueOf;
        Object objC = interfaceC4179h != null ? interfaceC4179h.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        y();
        this.f29860G = e.e();
        this.f29861H = e.e();
        this.f29862I = e.e();
    }

    public i(Context context, InterfaceC6835l interfaceC6835l, AbstractC3550q abstractC3550q, InterfaceC4179h interfaceC4179h, int i10, m0 m0Var) {
        this(context, abstractC3550q, (View) interfaceC6835l.invoke(context), null, interfaceC4179h, i10, m0Var, 8, null);
    }
}
