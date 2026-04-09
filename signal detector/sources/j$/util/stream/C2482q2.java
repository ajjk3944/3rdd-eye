package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2482q2 extends AbstractC2422e2 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f21141s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f21142t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2482q2(AbstractC2432g2 abstractC2432g2, int i, long j6, long j7) {
        super(abstractC2432g2, i);
        this.f21141s = j6;
        this.f21142t = j7;
    }

    @Override // j$.util.stream.AbstractC2404b
    public final Spliterator F0(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        long jI0 = abstractC2404b.i0(spliterator);
        if (jI0 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorY0 = abstractC2404b.y0(spliterator);
            long j6 = this.f21141s;
            return new C2512w3(spliteratorY0, j6, AbstractC2526z2.c(j6, this.f21142t));
        }
        if (EnumC2413c3.ORDERED.d(abstractC2404b.f21006m)) {
            return ((G0) new C2521y2(this, abstractC2404b, spliterator, new T(22), this.f21141s, this.f21142t).invoke()).spliterator();
        }
        Spliterator spliteratorY02 = abstractC2404b.y0(spliterator);
        long j7 = this.f21141s;
        long j8 = this.f21142t;
        if (j7 <= jI0) {
            long jMin = jI0 - j7;
            if (j8 >= 0) {
                jMin = Math.min(j8, jMin);
            }
            j8 = jMin;
            j7 = 0;
        }
        return new C3(spliteratorY02, j7, j8);
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
            return AbstractC2510w1.Y(abstractC2510w1, AbstractC2526z2.b(abstractC2404b.D0(), spliterator, this.f21141s, this.f21142t), true, intFunction);
        }
        if (!EnumC2413c3.ORDERED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
            Spliterator spliteratorY0 = abstractC2510w1.y0(spliterator);
            long j7 = this.f21141s;
            long j8 = this.f21142t;
            if (j7 <= jI0) {
                long j9 = jI0 - j7;
                jMin = j8 >= 0 ? Math.min(j8, j9) : j9;
                j6 = 0;
            } else {
                jMin = j8;
                j6 = j7;
            }
            return AbstractC2510w1.Y(this, new C3(spliteratorY0, j6, jMin), true, intFunction);
        }
        return (G0) new C2521y2(this, abstractC2510w1, spliterator, intFunction, this.f21141s, this.f21142t).invoke();
    }

    @Override // j$.util.stream.AbstractC2404b
    public final InterfaceC2472o2 H0(int i, InterfaceC2472o2 interfaceC2472o2) {
        return new C2477p2(this, interfaceC2472o2);
    }
}
