package J8;

import b9.C1992A;
import java.util.concurrent.TimeUnit;
import p9.InterfaceC5480a;
import va.a;

/* compiled from: TimeCapping.kt */
/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5480a<Long> f2843a;

    /* renamed from: b, reason: collision with root package name */
    public long f2844b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2845c;

    public S(InterfaceC5480a<Long> interfaceC5480a, long j4, boolean z10) {
        this.f2843a = interfaceC5480a;
        this.f2844b = j4;
        this.f2845c = z10;
    }

    public final boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = this.f2843a.invoke().longValue();
        if (jLongValue != 0) {
            if (jCurrentTimeMillis - this.f2844b <= jLongValue) {
                return false;
            }
            if (this.f2845c) {
                c();
            }
        }
        return true;
    }

    public final void b(InterfaceC5480a<C1992A> interfaceC5480a, InterfaceC5480a<C1992A> interfaceC5480a2) {
        if (a()) {
            interfaceC5480a.invoke();
            return;
        }
        a.b bVar = va.a.f47104a;
        bVar.o("TimeCapping");
        bVar.g("Skipped due to capping. Next in " + TimeUnit.MILLISECONDS.toSeconds((this.f2844b + this.f2843a.invoke().longValue()) - System.currentTimeMillis()) + "sec.", new Object[0]);
        interfaceC5480a2.invoke();
    }

    public final void c() {
        this.f2844b = System.currentTimeMillis();
    }
}
