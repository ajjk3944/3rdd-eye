package C;

import B.AbstractC2451o;
import B.InterfaceC2440d;
import B.J;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class p extends AbstractC2451o {

    /* renamed from: a, reason: collision with root package name */
    private final mh.r f2038a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f2039b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2040c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2440d f2041d;

    public p(mh.r rVar, InterfaceC6835l interfaceC6835l, int i10) {
        this.f2038a = rVar;
        this.f2039b = interfaceC6835l;
        this.f2040c = i10;
        J j10 = new J();
        j10.c(i10, new l(interfaceC6835l, rVar));
        this.f2041d = j10;
    }

    @Override // B.AbstractC2451o
    public InterfaceC2440d c() {
        return this.f2041d;
    }
}
