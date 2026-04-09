package A6;

import b9.C1992A;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: FixedRateScheduler.kt */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f43b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f44c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f45d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, long j4, InterfaceC5480a<C1992A> interfaceC5480a) {
        this.f43b = dVar;
        this.f44c = j4;
        this.f45d = (m) interfaceC5480a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.m, p9.a] */
    @Override // java.lang.Runnable
    public final void run() {
        this.f43b.f46a.postDelayed(this, this.f44c);
        this.f45d.invoke();
    }
}
