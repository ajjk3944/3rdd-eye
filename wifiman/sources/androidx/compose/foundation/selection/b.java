package androidx.compose.foundation.selection;

import E0.w0;
import J0.g;
import J0.t;
import J0.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import s.InterfaceC7836I;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
final class b extends androidx.compose.foundation.e {

    /* renamed from: J, reason: collision with root package name */
    private boolean f28452J;

    public /* synthetic */ b(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, interfaceC8558m, interfaceC7836I, z11, gVar, interfaceC6824a);
    }

    @Override // androidx.compose.foundation.a
    public void P2(w wVar) {
        t.j0(wVar, this.f28452J);
    }

    public final void e3(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6824a interfaceC6824a) {
        if (this.f28452J != z10) {
            this.f28452J = z10;
            w0.b(this);
        }
        super.d3(interfaceC8558m, interfaceC7836I, z11, null, gVar, interfaceC6824a);
    }

    private b(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6824a interfaceC6824a) {
        super(interfaceC8558m, interfaceC7836I, z11, null, gVar, interfaceC6824a, null);
        this.f28452J = z10;
    }
}
