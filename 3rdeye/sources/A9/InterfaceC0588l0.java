package A9;

import b9.C1992A;

/* compiled from: CompletionHandler.common.kt */
/* renamed from: A9.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0588l0 {

    /* compiled from: CompletionHandler.common.kt */
    /* renamed from: A9.l0$a */
    public static final class a implements InterfaceC0588l0 {

        /* renamed from: b, reason: collision with root package name */
        public final Object f257b;

        public a(p9.l<? super Throwable, C1992A> lVar) {
            this.f257b = lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p9.l] */
        @Override // A9.InterfaceC0588l0
        public final void a(Throwable th) {
            this.f257b.invoke(th);
        }

        public final String toString() {
            return "InternalCompletionHandler.UserSupplied[" + this.f257b.getClass().getSimpleName() + '@' + I.x(this) + ']';
        }
    }

    void a(Throwable th);
}
