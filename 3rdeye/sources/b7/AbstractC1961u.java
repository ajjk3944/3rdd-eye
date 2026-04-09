package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1961u extends AbstractC1976x {
    public AbstractC1961u() {
        super(EnumC1667d.BOOLEAN);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        Boolean bool = objC instanceof Boolean ? (Boolean) objC : null;
        return bool == null ? list.get(2) : bool;
    }
}
