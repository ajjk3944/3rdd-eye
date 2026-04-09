package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class e2 extends kotlin.coroutines.a implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f22358a = new e2();

    public e2() {
        super(r1.H8);
    }

    @Override // kotlinx.coroutines.r1
    public y0 U(l9.l lVar) {
        return f2.f22359a;
    }

    @Override // kotlinx.coroutines.r1
    public u W(w wVar) {
        return f2.f22359a;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.channels.n
    public void a(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.r1
    public boolean d() {
        return false;
    }

    @Override // kotlinx.coroutines.r1
    public y0 f(boolean z10, boolean z11, l9.l lVar) {
        return f2.f22359a;
    }

    @Override // kotlinx.coroutines.r1
    public r1 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.r1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.r1
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.r1
    public CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.r1
    public boolean start() {
        return false;
    }

    @Override // kotlinx.coroutines.r1
    public Object t(c9.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public String toString() {
        return "NonCancellable";
    }
}
