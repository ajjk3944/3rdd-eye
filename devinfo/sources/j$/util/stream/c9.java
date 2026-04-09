package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class c9 extends d9 implements Consumer {

    /* renamed from: e, reason: collision with root package name */
    public final Predicate f26540e;

    /* renamed from: f, reason: collision with root package name */
    public Object f26541f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Spliterator spliterator, Predicate predicate, int i4) {
        super(spliterator);
        this.g = i4;
        this.f26540e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Spliterator spliterator, c9 c9Var, int i4) {
        super(spliterator, c9Var);
        this.g = i4;
        this.f26540e = c9Var.f26540e;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26562d = (this.f26562d + 1) & 63;
        this.f26541f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z3 = this.f26561c;
                Spliterator spliterator = this.f26559a;
                if (z3) {
                    boolean z10 = false;
                    this.f26561c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && a() && this.f26540e.test(this.f26541f)) {
                            z10 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z10) {
                        this.f26560b.set(true);
                    }
                    consumer.n(this.f26541f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f26561c && a() && this.f26559a.tryAdvance(this)) {
                    zTest = this.f26540e.test(this.f26541f);
                    if (zTest) {
                        consumer.n(this.f26541f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f26561c = false;
                if (!zTest) {
                    this.f26560b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.d9, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (!this.f26560b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.d9
    public final Spliterator b(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new c9(spliterator, this, 0);
            default:
                return new c9(spliterator, this, 1);
        }
    }
}
