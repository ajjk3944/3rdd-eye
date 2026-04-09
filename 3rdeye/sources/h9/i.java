package h9;

import f9.InterfaceC4347e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class i extends c implements kotlin.jvm.internal.i<Object> {
    private final int arity;

    public i(int i, InterfaceC4347e<Object> interfaceC4347e) {
        super(interfaceC4347e);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    @Override // h9.AbstractC4424a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        x.f43661a.getClass();
        String strA = y.a(this);
        l.e(strA, "renderLambdaToString(...)");
        return strA;
    }

    public i(int i) {
        this(i, null);
    }
}
