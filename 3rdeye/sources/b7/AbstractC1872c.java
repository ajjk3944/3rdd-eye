package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import d7.C4278a;
import java.util.List;
import org.json.JSONException;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1872c extends AbstractC1892g {
    public AbstractC1872c() {
        super(EnumC1667d.COLOR);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object objA;
        Object objB = C1902i.b(c(), list, j());
        if (objB instanceof C4278a) {
            return objB;
        }
        if (!(objB instanceof String)) {
            C1902i.h(c(), list, this.f17781a, objB, j());
            throw null;
        }
        try {
            objA = new C4278a(C4278a.C0440a.a((String) objB));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) == null) {
            return objA;
        }
        C1902i.g(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }
}
