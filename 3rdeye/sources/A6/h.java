package A6;

import H6.C0675l;
import a9.InterfaceC1676a;
import android.os.SystemClock;
import b9.C1992A;
import c.C2023u;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import y5.C5812g;

/* compiled from: Ticker.kt */
/* loaded from: classes.dex */
public final class h extends m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f67h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i) {
        super(0);
        this.f66g = i;
        this.f67h = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f66g) {
            case 0:
                ((j) this.f67h).invoke();
                return C1992A.f18074a;
            case 1:
                F6.d dVar = (F6.d) this.f67h;
                return new F6.f(dVar.f1669a, dVar.f1670b);
            case 2:
                return new A2.l(new g((InterfaceC1676a) this.f67h, 2));
            case 3:
                e7.e histogramReporter = ((C0675l) this.f67h).getHistogramReporter();
                histogramReporter.getClass();
                histogramReporter.f37735g = Long.valueOf(SystemClock.uptimeMillis());
                return C1992A.f18074a;
            case 4:
                ((C2023u) this.f67h).d();
                return C1992A.f18074a;
            default:
                return new C5812g((X0.h) this.f67h);
        }
    }
}
