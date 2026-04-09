package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1856A extends AbstractC1976x {
    public AbstractC1856A() {
        super(EnumC1667d.STRING);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        String str = objC instanceof String ? (String) objC : null;
        return str == null ? list.get(2) : str;
    }
}
