package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
public class M0 extends AbstractC2419e {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC2510w1 f20912h;
    public final LongFunction i;

    /* renamed from: j, reason: collision with root package name */
    public final BinaryOperator f20913j;

    @Override // j$.util.stream.AbstractC2419e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2419e abstractC2419e = this.f21059d;
        if (abstractC2419e != null) {
            this.f21061f = (G0) this.f20913j.apply((G0) ((M0) abstractC2419e).f21061f, (G0) ((M0) this.f21060e).f21061f);
        }
        super.onCompletion(countedCompleter);
    }

    public M0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC2510w1, spliterator);
        this.f20912h = abstractC2510w1;
        this.i = longFunction;
        this.f20913j = binaryOperator;
    }

    public M0(M0 m02, Spliterator spliterator) {
        super(m02, spliterator);
        this.f20912h = m02.f20912h;
        this.i = m02.i;
        this.f20913j = m02.f20913j;
    }

    @Override // j$.util.stream.AbstractC2419e
    public AbstractC2419e c(Spliterator spliterator) {
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2419e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final G0 a() {
        InterfaceC2519y0 interfaceC2519y0 = (InterfaceC2519y0) this.i.apply(this.f20912h.i0(this.f21057b));
        this.f20912h.w0(this.f21057b, interfaceC2519y0);
        return interfaceC2519y0.build();
    }
}
