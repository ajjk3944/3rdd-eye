package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class h4 extends i4 implements Consumer {

    /* renamed from: e, reason: collision with root package name */
    public final Predicate f21084e;

    /* renamed from: f, reason: collision with root package name */
    public Object f21085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21086g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Spliterator spliterator, Predicate predicate, int i) {
        super(spliterator);
        this.f21086g = i;
        this.f21084e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Spliterator spliterator, h4 h4Var, int i) {
        super(spliterator, h4Var);
        this.f21086g = i;
        this.f21084e = h4Var.f21084e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f21093d = (this.f21093d + 1) & 63;
        this.f21085f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f21086g) {
            case 0:
                boolean z6 = this.f21092c;
                Spliterator spliterator = this.f21090a;
                if (z6) {
                    boolean z7 = false;
                    this.f21092c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && a() && this.f21084e.test(this.f21085f)) {
                            z7 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z7) {
                        this.f21091b.set(true);
                    }
                    consumer.accept(this.f21085f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f21092c && a() && this.f21090a.tryAdvance(this)) {
                    zTest = this.f21084e.test(this.f21085f);
                    if (zTest) {
                        consumer.accept(this.f21085f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f21092c = false;
                if (!zTest) {
                    this.f21091b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.i4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f21086g) {
            case 1:
                if (!this.f21091b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.i4
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f21086g) {
            case 0:
                return new h4(spliterator, this, 0);
            default:
                return new h4(spliterator, this, 1);
        }
    }
}
