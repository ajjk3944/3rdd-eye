package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import d7.C4280c;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1858C extends AbstractC1976x {
    public AbstractC1858C() {
        super(EnumC1667d.URL);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objC = C1902i.c(c(), list);
        String strE = C1902i.e(objC instanceof String ? (String) objC : null);
        return strE != null ? new C4280c(strE) : list.get(2);
    }
}
