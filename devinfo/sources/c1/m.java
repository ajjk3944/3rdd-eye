package c1;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i4) {
        super(str);
        this.f2566a = i4;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2566a) {
            case 0:
                setStackTrace(n.f2567a);
                break;
            case 1:
                setStackTrace(f0.b.f23599a);
                break;
            default:
                setStackTrace(f2.b.f23627a);
                break;
        }
        return this;
    }
}
