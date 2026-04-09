package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC2419e {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2510w1 f20986h;

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2419e abstractC2419e = this.f21059d;
        if (abstractC2419e != null) {
            R1 r12 = (R1) ((Y1) abstractC2419e).f21061f;
            r12.i((R1) ((Y1) this.f21060e).f21061f);
            this.f21061f = r12;
        }
        super.onCompletion(countedCompleter);
    }

    public Y1(AbstractC2510w1 abstractC2510w1, AbstractC2510w1 abstractC2510w12, Spliterator spliterator) {
        super(abstractC2510w12, spliterator);
        this.f20986h = abstractC2510w1;
    }

    public Y1(Y1 y12, Spliterator spliterator) {
        super(y12, spliterator);
        this.f20986h = y12.f20986h;
    }

    @Override // j$.util.stream.AbstractC2419e
    public final AbstractC2419e c(Spliterator spliterator) {
        return new Y1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2419e
    public final Object a() {
        AbstractC2510w1 abstractC2510w1 = this.f21056a;
        R1 r1V0 = this.f20986h.v0();
        abstractC2510w1.w0(this.f21057b, r1V0);
        return r1V0;
    }
}
