package kotlin.coroutines.jvm.internal;

import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.InterfaceC6488n;
import kotlin.jvm.internal.O;

/* loaded from: classes4.dex */
public abstract class l extends d implements InterfaceC6488n {
    private final int arity;

    public l(int i10, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC6488n
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strJ = O.j(this);
        AbstractC6492s.h(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
