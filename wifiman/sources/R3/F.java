package r3;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class F extends H {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f60062f;

    /* synthetic */ F(Callable callable, G g10) {
        super();
        this.f60062f = callable;
    }

    @Override // r3.H
    final String a() {
        try {
            return (String) this.f60062f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
