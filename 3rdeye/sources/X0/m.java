package X0;

import A9.E;
import X0.o;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: SimpleActor.kt */
@h9.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public o.e f13445l;

    /* renamed from: m, reason: collision with root package name */
    public int f13446m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f13447n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC4347e<? super m> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13447n = nVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new m(this.f13447n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((m) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0124, code lost:
    
        if (r3 == C9.f.f994n) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        r6.b();
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0157 -> B:80:0x0158). Please report as a decompilation issue!!! */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
