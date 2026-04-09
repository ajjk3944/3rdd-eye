package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2501u2 extends AbstractC2435h0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f21172s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f21173t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2501u2(AbstractC2445j0 abstractC2445j0, int i, long j6, long j7) {
        super(abstractC2445j0, i);
        this.f21172s = j6;
        this.f21173t = j7;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        long jI0 = abstractC2404b.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.K k6 = (j$.util.K) abstractC2404b.y0(spliterator);
            long j6 = this.f21172s;
            return new C2502u3(k6, j6, AbstractC2526z2.c(j6, this.f21173t));
        }
        if (EnumC2413c3.ORDERED.d(abstractC2404b.f21006m)) {
            return ((G0) new C2521y2(this, abstractC2404b, spliterator, new Z1(2), this.f21172s, this.f21173t).invoke()).spliterator();
        }
        j$.util.K k7 = (j$.util.K) abstractC2404b.y0(spliterator);
        long j7 = this.f21172s;
        long j8 = this.f21173t;
        if (j7 <= jI0) {
            long jMin = jI0 - j7;
            if (j8 >= 0) {
                jMin = Math.min(j8, jMin);
            }
            j8 = jMin;
            j7 = 0;
        }
        return new A3(k7, j7, j8);
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
            return AbstractC2510w1.b0(abstractC2510w1, AbstractC2526z2.b(abstractC2404b.D0(), spliterator, this.f21172s, this.f21173t), true);
        }
        if (!EnumC2413c3.ORDERED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
            j$.util.K k6 = (j$.util.K) abstractC2510w1.y0(spliterator);
            long j7 = this.f21172s;
            long j8 = this.f21173t;
            if (j7 <= jI0) {
                long j9 = jI0 - j7;
                jMin = j8 >= 0 ? Math.min(j8, j9) : j9;
                j6 = 0;
            } else {
                jMin = j8;
                j6 = j7;
            }
            return AbstractC2510w1.b0(this, new A3(k6, j6, jMin), true);
        }
        return (G0) new C2521y2(this, abstractC2510w1, spliterator, intFunction, this.f21172s, this.f21173t).invoke();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        return new C2496t2(this, interfaceC2472o2);
    }
}
