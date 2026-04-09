package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1971w extends AbstractC1976x {

    /* renamed from: c, reason: collision with root package name */
    public final List<a7.j> f18019c;

    public AbstractC1971w() {
        super(EnumC1667d.COLOR);
        this.f18019c = C2092m.W(new a7.j(EnumC1667d.ARRAY, false), new a7.j(EnumC1667d.INTEGER, false), new a7.j(EnumC1667d.STRING, false));
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        C4278a c4278aD = C1902i.d(objC instanceof String ? (String) objC : null);
        if (c4278aD != null) {
            return c4278aD;
        }
        Object obj = list.get(2);
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
        C4278a c4278aD2 = C1902i.d((String) obj);
        if (c4278aD2 != null) {
            return c4278aD2;
        }
        C1902i.g(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }

    @Override // b7.AbstractC1976x, a7.g
    public final List<a7.j> b() {
        return this.f18019c;
    }
}
