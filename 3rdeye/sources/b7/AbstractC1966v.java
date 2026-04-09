package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import b9.m;
import d7.C4278a;
import java.util.List;

/* compiled from: ArrayFunctions.kt */
/* renamed from: b7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1966v extends AbstractC1976x {
    public AbstractC1966v() {
        super(EnumC1667d.COLOR);
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objA;
        Object objC = C1902i.c(c(), list);
        C4278a c4278a = objC instanceof C4278a ? (C4278a) objC : null;
        if (c4278a != null) {
            return c4278a;
        }
        String str = objC instanceof String ? (String) objC : null;
        if (str != null) {
            try {
                objA = new C4278a(C4278a.C0440a.a(str));
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            obj = (C4278a) (objA instanceof m.a ? null : objA);
        }
        return obj == null ? list.get(2) : obj;
    }
}
