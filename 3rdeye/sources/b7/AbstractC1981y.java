package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1981y extends AbstractC1976x {
    public AbstractC1981y() {
        super(EnumC1667d.INTEGER);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        return objC instanceof Integer ? Long.valueOf(((Number) objC).intValue()) : objC instanceof Long ? objC : list.get(2);
    }
}
