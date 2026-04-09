package D9;

import A9.InterfaceC0594o0;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* compiled from: SharedFlow.kt */
@h9.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {382, 389, 392}, m = "collect$suspendImpl")
/* loaded from: classes3.dex */
public final class D<T> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C f1144l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0645g f1145m;

    /* renamed from: n, reason: collision with root package name */
    public F f1146n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0594o0 f1147o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1148p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C<T> f1149q;

    /* renamed from: r, reason: collision with root package name */
    public int f1150r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C<T> c10, InterfaceC4347e<? super D> interfaceC4347e) {
        super(interfaceC4347e);
        this.f1149q = c10;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f1148p = obj;
        this.f1150r |= RecyclerView.UNDEFINED_DURATION;
        return C.i(this.f1149q, null, this);
    }
}
