package androidx.compose.foundation.selection;

import E0.w0;
import J0.g;
import J0.t;
import J0.w;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import s.InterfaceC7836I;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
final class d extends androidx.compose.foundation.e {

    /* renamed from: J, reason: collision with root package name */
    private boolean f28463J;

    /* renamed from: N, reason: collision with root package name */
    private InterfaceC6835l f28464N;

    /* renamed from: X, reason: collision with root package name */
    private final InterfaceC6824a f28465X;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f28467b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l, boolean z10) {
            super(0);
            this.f28466a = interfaceC6835l;
            this.f28467b = z10;
        }

        public final void a() {
            this.f28466a.invoke(Boolean.valueOf(!this.f28467b));
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        public final void a() {
            d.this.f28464N.invoke(Boolean.valueOf(!d.this.f28463J));
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public /* synthetic */ d(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, interfaceC8558m, interfaceC7836I, z11, gVar, interfaceC6835l);
    }

    @Override // androidx.compose.foundation.a
    public void P2(w wVar) {
        t.v0(wVar, K0.b.a(this.f28463J));
    }

    public final void g3(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6835l interfaceC6835l) {
        if (this.f28463J != z10) {
            this.f28463J = z10;
            w0.b(this);
        }
        this.f28464N = interfaceC6835l;
        super.d3(interfaceC8558m, interfaceC7836I, z11, null, gVar, this.f28465X);
    }

    private d(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6835l interfaceC6835l) {
        super(interfaceC8558m, interfaceC7836I, z11, null, gVar, new a(interfaceC6835l, z10), null);
        this.f28463J = z10;
        this.f28464N = interfaceC6835l;
        this.f28465X = new b();
    }
}
