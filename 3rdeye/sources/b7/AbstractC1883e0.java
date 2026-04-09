package b7;

import a7.AbstractC1664a;
import a7.C1666c;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: ColorFunctions.kt */
/* renamed from: b7.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1883e0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final Q f17740a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a7.j> f17741b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1667d f17742c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17743d;

    public AbstractC1883e0(Q componentSetter) {
        kotlin.jvm.internal.l.f(componentSetter, "componentSetter");
        this.f17740a = componentSetter;
        this.f17741b = C2092m.W(new a7.j(EnumC1667d.STRING, false), new a7.j(EnumC1667d.NUMBER, false));
        this.f17742c = EnumC1667d.COLOR;
        this.f17743d = true;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        try {
            return this.f17740a.e(nVar, abstractC1664a, C2092m.W(new C4278a(C4278a.C0440a.a((String) obj)), list.get(1)));
        } catch (IllegalArgumentException e4) {
            C1666c.d(c(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e4);
            throw null;
        }
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17741b;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17742c;
    }

    @Override // a7.g
    public final boolean f() {
        return this.f17743d;
    }
}
