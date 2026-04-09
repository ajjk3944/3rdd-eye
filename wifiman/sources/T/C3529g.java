package T;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: T.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3529g extends AtomicInteger {
    public C3529g(int i10) {
        super(i10);
    }

    public final int a(int i10) {
        return addAndGet(i10);
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return c();
    }

    public byte c() {
        return (byte) intValue();
    }

    public /* bridge */ double d() {
        return super.doubleValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return d();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return g();
    }

    public /* bridge */ float g() {
        return super.floatValue();
    }

    public /* bridge */ int h() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return h();
    }

    public /* bridge */ long j() {
        return super.longValue();
    }

    public short l() {
        return (short) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return j();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return l();
    }
}
