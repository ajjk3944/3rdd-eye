package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes3.dex */
public abstract class m<R> implements i<R>, Serializable {
    private final int arity;

    public m(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        x.f43661a.getClass();
        String strA = y.a(this);
        l.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
