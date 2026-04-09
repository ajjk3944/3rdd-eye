package au;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class m extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10) {
        super(str);
        this.f2339a = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f2339a) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(v0.i.f23749a);
                break;
            case 2:
                setStackTrace(x.a.f24682a);
                break;
            default:
                setStackTrace(u1.b.f23138a);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m() {
        super("The coroutine scope left the composition");
        this.f2339a = 1;
    }
}
