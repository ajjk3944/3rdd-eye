package kotlin.coroutines.jvm.internal;

import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.InterfaceC6488n;
import kotlin.jvm.internal.O;

/* loaded from: classes4.dex */
public abstract class k extends j implements InterfaceC6488n {

    /* renamed from: a, reason: collision with root package name */
    private final int f51681a;

    public k(int i10, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        this.f51681a = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC6488n
    public int getArity() {
        return this.f51681a;
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
