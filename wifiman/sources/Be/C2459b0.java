package Be;

import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* renamed from: Be.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2459b0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f1527a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f1528b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f1529c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f1530d;

    public C2459b0(boolean z10, boolean z11, R0.Q query, InterfaceC6835l onQueryChanged) {
        AbstractC6492s.i(query, "query");
        AbstractC6492s.i(onQueryChanged, "onQueryChanged");
        this.f1527a = onQueryChanged;
        this.f1528b = t1.d(Boolean.valueOf(z10 || query.i().length() > 0), null, 2, null);
        this.f1529c = t1.d(Boolean.valueOf(z11), null, 2, null);
        this.f1530d = t1.d(query, null, 2, null);
    }

    public final InterfaceC3551q0 a() {
        return this.f1529c;
    }

    public final InterfaceC3551q0 b() {
        return this.f1530d;
    }

    public final InterfaceC3551q0 c() {
        return this.f1528b;
    }

    public final void d() {
        this.f1528b.setValue(Boolean.FALSE);
        f(new R0.Q("", 0L, (L0.S) null, 6, (DefaultConstructorMarker) null));
    }

    public final void e() {
        this.f1528b.setValue(Boolean.TRUE);
    }

    public final void f(R0.Q query) {
        AbstractC6492s.i(query, "query");
        if (AbstractC6492s.d(this.f1530d.getValue(), query)) {
            return;
        }
        this.f1530d.setValue(query);
        this.f1527a.invoke(query.i());
    }
}
