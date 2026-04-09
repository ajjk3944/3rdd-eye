package p9;

import com.github.mikephil.charting.charts.PieChart;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f31509a;

    /* renamed from: b, reason: collision with root package name */
    public PieChart f31510b;

    @Override // p9.d
    public final String b(float f10) {
        return this.f31509a.format(f10) + " %";
    }

    @Override // p9.d
    public final String c(float f10) {
        PieChart pieChart = this.f31510b;
        return (pieChart == null || !pieChart.N) ? this.f31509a.format(f10) : b(f10);
    }
}
