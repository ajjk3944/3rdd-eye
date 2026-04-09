package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class p0 implements g8, h8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26708a;

    public /* synthetic */ void accept(double d10) {
        v3.D();
        throw null;
    }

    public /* synthetic */ void accept(int i4) {
        v3.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        v3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void end() {
    }

    public p0(boolean z3) {
        this.f26708a = z3;
    }

    @Override // j$.util.stream.g8
    public final int w() {
        if (this.f26708a) {
            return 0;
        }
        return a7.f26490r;
    }

    public final void a(v3 v3Var, Spliterator spliterator) {
        if (this.f26708a) {
            new q0(v3Var, spliterator, this).invoke();
        } else {
            new r0(v3Var, spliterator, v3Var.x0(this)).invoke();
        }
    }
}
