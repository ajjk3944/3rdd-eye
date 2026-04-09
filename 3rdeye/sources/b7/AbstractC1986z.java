package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1986z extends AbstractC1976x {
    public AbstractC1986z() {
        super(EnumC1667d.NUMBER);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        Number number = objC instanceof Number ? (Number) objC : null;
        return number != null ? Double.valueOf(number.doubleValue()) : list.get(2);
    }
}
