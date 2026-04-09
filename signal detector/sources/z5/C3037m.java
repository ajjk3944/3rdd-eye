package z5;

import java.util.concurrent.CancellationException;

/* renamed from: z5.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3037m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24539a;

    /* renamed from: b, reason: collision with root package name */
    public final C3028d f24540b;

    /* renamed from: c, reason: collision with root package name */
    public final p5.l f24541c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24542d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f24543e;

    public C3037m(Object obj, C3028d c3028d, p5.l lVar, Object obj2, Throwable th) {
        this.f24539a = obj;
        this.f24540b = c3028d;
        this.f24541c = lVar;
        this.f24542d = obj2;
        this.f24543e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C3037m a(C3037m c3037m, C3028d c3028d, CancellationException cancellationException, int i) {
        Object obj = c3037m.f24539a;
        if ((i & 2) != 0) {
            c3028d = c3037m.f24540b;
        }
        C3028d c3028d2 = c3028d;
        p5.l lVar = c3037m.f24541c;
        Object obj2 = c3037m.f24542d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c3037m.f24543e;
        }
        c3037m.getClass();
        return new C3037m(obj, c3028d2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3037m)) {
            return false;
        }
        C3037m c3037m = (C3037m) obj;
        return q5.i.a(this.f24539a, c3037m.f24539a) && q5.i.a(this.f24540b, c3037m.f24540b) && q5.i.a(this.f24541c, c3037m.f24541c) && q5.i.a(this.f24542d, c3037m.f24542d) && q5.i.a(this.f24543e, c3037m.f24543e);
    }

    public final int hashCode() {
        Object obj = this.f24539a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C3028d c3028d = this.f24540b;
        int iHashCode2 = (iHashCode + (c3028d == null ? 0 : c3028d.hashCode())) * 31;
        p5.l lVar = this.f24541c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f24542d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f24543e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f24539a + ", cancelHandler=" + this.f24540b + ", onCancellation=" + this.f24541c + ", idempotentResume=" + this.f24542d + ", cancelCause=" + this.f24543e + ')';
    }

    public /* synthetic */ C3037m(Object obj, C3028d c3028d, p5.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c3028d, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
