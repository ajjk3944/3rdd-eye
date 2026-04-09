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
final class e extends androidx.compose.foundation.e {

    /* renamed from: J, reason: collision with root package name */
    private K0.a f28469J;

    public /* synthetic */ e(K0.a aVar, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, g gVar, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, interfaceC8558m, interfaceC7836I, z10, gVar, interfaceC6824a);
    }

    @Override // androidx.compose.foundation.a
    public void P2(w wVar) {
        t.v0(wVar, this.f28469J);
    }

    public final void e3(K0.a aVar, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, g gVar, InterfaceC6824a interfaceC6824a) {
        if (this.f28469J != aVar) {
            this.f28469J = aVar;
            w0.b(this);
        }
        super.d3(interfaceC8558m, interfaceC7836I, z10, null, gVar, interfaceC6824a);
    }

    private e(K0.a aVar, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, g gVar, InterfaceC6824a interfaceC6824a) {
        super(interfaceC8558m, interfaceC7836I, z10, null, gVar, interfaceC6824a, null);
        this.f28469J = aVar;
    }
}
