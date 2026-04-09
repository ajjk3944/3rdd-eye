package A9;

import b9.C1992A;
import java.util.concurrent.CancellationException;

/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: A9.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0600s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f266a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0579h f267b;

    /* renamed from: c, reason: collision with root package name */
    public final p9.l<Throwable, C1992A> f268c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f269d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f270e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0600s(Object obj, InterfaceC0579h interfaceC0579h, p9.l<? super Throwable, C1992A> lVar, Object obj2, Throwable th) {
        this.f266a = obj;
        this.f267b = interfaceC0579h;
        this.f268c = lVar;
        this.f269d = obj2;
        this.f270e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0600s a(C0600s c0600s, InterfaceC0579h interfaceC0579h, CancellationException cancellationException, int i) {
        Object obj = c0600s.f266a;
        if ((i & 2) != 0) {
            interfaceC0579h = c0600s.f267b;
        }
        InterfaceC0579h interfaceC0579h2 = interfaceC0579h;
        p9.l<Throwable, C1992A> lVar = c0600s.f268c;
        Object obj2 = c0600s.f269d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0600s.f270e;
        }
        c0600s.getClass();
        return new C0600s(obj, interfaceC0579h2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0600s)) {
            return false;
        }
        C0600s c0600s = (C0600s) obj;
        return kotlin.jvm.internal.l.b(this.f266a, c0600s.f266a) && kotlin.jvm.internal.l.b(this.f267b, c0600s.f267b) && kotlin.jvm.internal.l.b(this.f268c, c0600s.f268c) && kotlin.jvm.internal.l.b(this.f269d, c0600s.f269d) && kotlin.jvm.internal.l.b(this.f270e, c0600s.f270e);
    }

    public final int hashCode() {
        Object obj = this.f266a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0579h interfaceC0579h = this.f267b;
        int iHashCode2 = (iHashCode + (interfaceC0579h == null ? 0 : interfaceC0579h.hashCode())) * 31;
        p9.l<Throwable, C1992A> lVar = this.f268c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f269d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f270e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f266a + ", cancelHandler=" + this.f267b + ", onCancellation=" + this.f268c + ", idempotentResume=" + this.f269d + ", cancelCause=" + this.f270e + ')';
    }

    public /* synthetic */ C0600s(Object obj, InterfaceC0579h interfaceC0579h, p9.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC0579h, (p9.l<? super Throwable, C1992A>) ((i & 4) != 0 ? null : lVar), (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
