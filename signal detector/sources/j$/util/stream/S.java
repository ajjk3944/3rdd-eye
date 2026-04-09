package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class S extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public Spliterator f20958a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2472o2 f20959b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2510w1 f20960c;

    /* renamed from: d, reason: collision with root package name */
    public long f20961d;

    public S(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, InterfaceC2472o2 interfaceC2472o2) {
        super(null);
        this.f20959b = interfaceC2472o2;
        this.f20960c = abstractC2510w1;
        this.f20958a = spliterator;
        this.f20961d = 0L;
    }

    public S(S s5, Spliterator spliterator) {
        super(s5);
        this.f20958a = spliterator;
        this.f20959b = s5.f20959b;
        this.f20961d = s5.f20961d;
        this.f20960c = s5.f20960c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f20958a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f20961d;
        if (jE == 0) {
            jE = AbstractC2419e.e(jEstimateSize);
            this.f20961d = jE;
        }
        boolean zD = EnumC2413c3.SHORT_CIRCUIT.d(((AbstractC2404b) this.f20960c).f21006m);
        InterfaceC2472o2 interfaceC2472o2 = this.f20959b;
        boolean z6 = false;
        S s5 = this;
        while (true) {
            if (zD && interfaceC2472o2.e()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            S s6 = new S(s5, spliteratorTrySplit);
            s5.addToPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
            } else {
                S s7 = s5;
                s5 = s6;
                s6 = s7;
            }
            z6 = !z6;
            s5.fork();
            s5 = s6;
            jEstimateSize = spliterator.estimateSize();
        }
        s5.f20960c.d0(spliterator, interfaceC2472o2);
        s5.f20958a = null;
        s5.propagateCompletion();
    }
}
