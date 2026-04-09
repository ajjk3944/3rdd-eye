package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2491s2 extends Z {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f21159s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f21160t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2491s2(AbstractC2405b0 abstractC2405b0, int i, long j6, long j7) {
        super(abstractC2405b0, i);
        this.f21159s = j6;
        this.f21160t = j7;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        long jI0 = abstractC2404b.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) abstractC2404b.y0(spliterator);
            long j6 = this.f21159s;
            return new C2497t3(ofInt, j6, AbstractC2526z2.c(j6, this.f21160t));
        }
        if (EnumC2413c3.ORDERED.d(abstractC2404b.f21006m)) {
            return ((G0) new C2521y2(this, abstractC2404b, spliterator, new Z1(1), this.f21159s, this.f21160t).invoke()).spliterator();
        }
        Spliterator.OfInt ofInt2 = (Spliterator.OfInt) abstractC2404b.y0(spliterator);
        long j7 = this.f21159s;
        long j8 = this.f21160t;
        if (j7 <= jI0) {
            long jMin = jI0 - j7;
            if (j8 >= 0) {
                jMin = Math.min(j8, jMin);
            }
            j8 = jMin;
            j7 = 0;
        }
        return new C2527z3(ofInt2, j7, j8);
    }

    @Override // j$.util.stream.AbstractC2404b
    public final G0 E0(AbstractC2510w1 abstractC2510w1, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j6;
        long jI0 = abstractC2510w1.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(16384)) {
            AbstractC2404b abstractC2404b = (AbstractC2404b) abstractC2510w1;
            while (abstractC2404b.f21005l > 0) {
                abstractC2404b = abstractC2404b.i;
            }
            return AbstractC2510w1.a0(abstractC2510w1, AbstractC2526z2.b(abstractC2404b.D0(), spliterator, this.f21159s, this.f21160t), true);
        }
        if (!EnumC2413c3.ORDERED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) abstractC2510w1.y0(spliterator);
            long j7 = this.f21159s;
            long j8 = this.f21160t;
            if (j7 <= jI0) {
                long j9 = jI0 - j7;
                jMin = j8 >= 0 ? Math.min(j8, j9) : j9;
                j6 = 0;
            } else {
                jMin = j8;
                j6 = j7;
            }
            return AbstractC2510w1.a0(this, new C2527z3(ofInt, j6, jMin), true);
        }
        return (G0) new C2521y2(this, abstractC2510w1, spliterator, intFunction, this.f21159s, this.f21160t).invoke();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        return new C2486r2(this, interfaceC2472o2);
    }
}
