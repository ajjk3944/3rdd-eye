package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6494u implements InterfaceC6488n, Serializable {
    private final int arity;

    public AbstractC6494u(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC6488n
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strK = O.k(this);
        AbstractC6492s.h(strK, "renderLambdaToString(...)");
        return strK;
    }
}
