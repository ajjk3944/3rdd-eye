package p7;

import br.l;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f20320a;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f20321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Throwable th2) {
        super(th2);
        l.e(fVar, "callbackName");
        this.f20320a = fVar;
        this.f20321d = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f20321d;
    }
}
