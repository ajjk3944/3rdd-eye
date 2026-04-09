package z5;

import c5.C0412i;
import java.util.concurrent.ScheduledFuture;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3028d implements f0, p5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24525a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24526b;

    public /* synthetic */ C3028d(int i, Object obj) {
        this.f24525a = i;
        this.f24526b = obj;
    }

    public final void a(Throwable th) {
        switch (this.f24525a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f24526b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((E) this.f24526b).g();
                break;
            default:
                ((p5.l) this.f24526b).f(th);
                break;
        }
    }

    @Override // p5.l
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        switch (this.f24525a) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return C0412i.f5929a;
    }

    public final String toString() {
        switch (this.f24525a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f24526b) + ']';
            case 1:
                return "DisposeOnCancel[" + ((E) this.f24526b) + ']';
            default:
                return "InvokeOnCancel[" + ((p5.l) this.f24526b).getClass().getSimpleName() + '@' + AbstractC3046w.h(this) + ']';
        }
    }
}
