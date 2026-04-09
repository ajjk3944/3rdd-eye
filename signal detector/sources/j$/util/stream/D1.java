package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class D1 extends AbstractC2510w1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20842h;

    public /* synthetic */ D1(int i) {
        this.f20842h = i;
    }

    @Override // j$.util.stream.AbstractC2510w1
    public final R1 v0() {
        switch (this.f20842h) {
            case 0:
                return new V1();
            case 1:
                return new T1();
            case 2:
                return new W1();
            default:
                return new U1();
        }
    }

    @Override // j$.util.stream.AbstractC2510w1, j$.util.stream.I3
    public final Object f(AbstractC2404b abstractC2404b, Spliterator spliterator) {
        switch (this.f20842h) {
            case 0:
                if (!EnumC2413c3.SIZED.d(abstractC2404b.f21006m)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC2413c3.SIZED.d(abstractC2404b.f21006m)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC2413c3.SIZED.d(abstractC2404b.f21006m)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC2413c3.SIZED.d(abstractC2404b.f21006m)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.f(abstractC2404b, spliterator);
    }

    @Override // j$.util.stream.AbstractC2510w1, j$.util.stream.I3
    public final Object j(AbstractC2510w1 abstractC2510w1, Spliterator spliterator) {
        switch (this.f20842h) {
            case 0:
                if (!EnumC2413c3.SIZED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!EnumC2413c3.SIZED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!EnumC2413c3.SIZED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!EnumC2413c3.SIZED.d(((AbstractC2404b) abstractC2510w1).f21006m)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.j(abstractC2510w1, spliterator);
    }

    @Override // j$.util.stream.AbstractC2510w1, j$.util.stream.I3
    public final int v() {
        switch (this.f20842h) {
        }
        return EnumC2413c3.f21038r;
    }
}
