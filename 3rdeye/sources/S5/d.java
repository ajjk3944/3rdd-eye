package S5;

/* compiled from: AutoDismissRunnable.kt */
/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final f f11915b;

    public d(f balloon) {
        kotlin.jvm.internal.l.f(balloon, "balloon");
        this.f11915b = balloon;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11915b.d();
    }
}
