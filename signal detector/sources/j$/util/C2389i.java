package j$.util;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2389i implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public double f20805a;

    /* renamed from: b, reason: collision with root package name */
    public double f20806b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d6) {
        this.count++;
        this.f20806b += d6;
        b(d6);
        this.min = Math.min(this.min, d6);
        this.max = Math.max(this.max, d6);
    }

    public final void a(C2389i c2389i) {
        this.count += c2389i.count;
        this.f20806b += c2389i.f20806b;
        b(c2389i.sum);
        b(c2389i.f20805a);
        this.min = Math.min(this.min, c2389i.min);
        this.max = Math.max(this.max, c2389i.max);
    }

    public final void b(double d6) {
        double d7 = d6 - this.f20805a;
        double d8 = this.sum;
        double d9 = d8 + d7;
        this.f20805a = (d9 - d8) - d7;
        this.sum = d9;
    }

    public final String toString() {
        double d6;
        String simpleName = C2389i.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d7 = this.sum + this.f20805a;
        if (Double.isNaN(d7) && Double.isInfinite(this.f20806b)) {
            d7 = this.f20806b;
        }
        Double dValueOf = Double.valueOf(d7);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d8 = this.sum + this.f20805a;
            if (Double.isNaN(d8) && Double.isInfinite(this.f20806b)) {
                d8 = this.f20806b;
            }
            d6 = d8 / this.count;
        } else {
            d6 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d6), Double.valueOf(this.max));
    }
}
