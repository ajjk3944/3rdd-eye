package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;
import org.json.JSONException;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1956t extends AbstractC1892g {
    public AbstractC1956t() {
        super(EnumC1667d.NUMBER);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) throws JSONException {
        Object objB = C1902i.b(c(), list, j());
        Number number = objB instanceof Number ? (Number) objB : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        C1902i.h(c(), list, this.f17781a, objB, j());
        throw null;
    }
}
