package h9;

import f9.InterfaceC4347e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class h extends g implements kotlin.jvm.internal.i<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final int f38277l;

    public h(int i, InterfaceC4347e<Object> interfaceC4347e) {
        super(interfaceC4347e);
        this.f38277l = i;
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return this.f38277l;
    }

    @Override // h9.AbstractC4424a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        x.f43661a.getClass();
        String strA = y.a(this);
        l.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
