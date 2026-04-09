package A9;

import b9.C1992A;

/* compiled from: CancellableContinuationImpl.kt */
/* renamed from: A9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0579h extends F0 {

    /* compiled from: CancellableContinuationImpl.kt */
    /* renamed from: A9.h$a */
    public static final class a implements InterfaceC0579h {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.internal.m f247b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p9.l<? super Throwable, C1992A> lVar) {
            this.f247b = (kotlin.jvm.internal.m) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // A9.InterfaceC0579h
        public final void a(Throwable th) {
            this.f247b.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f247b.getClass().getSimpleName() + '@' + I.x(this) + ']';
        }
    }

    void a(Throwable th);
}
