package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2097r;
import d7.C4278a;
import java.util.List;

/* compiled from: ColorFunctions.kt */
/* renamed from: b7.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1878d0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final P f17719a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a7.j> f17720b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1667d f17721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17722d;

    public AbstractC1878d0(P componentGetter) {
        kotlin.jvm.internal.l.f(componentGetter, "componentGetter");
        this.f17719a = componentGetter;
        this.f17720b = E.u.G(new a7.j(EnumC1667d.STRING, false));
        this.f17721c = EnumC1667d.NUMBER;
        this.f17722d = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objP0 = C2097r.p0(list);
        kotlin.jvm.internal.l.d(objP0, "null cannot be cast to non-null type kotlin.String");
        try {
            return this.f17719a.e(nVar, abstractC1664a, E.u.G(new C4278a(C4278a.C0440a.a((String) objP0))));
        } catch (IllegalArgumentException e4) {
            C1666c.d(c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e4);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17720b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17721c;
    }

    @Override // a7.g
    public final boolean f() {
        return this.f17722d;
    }
}
