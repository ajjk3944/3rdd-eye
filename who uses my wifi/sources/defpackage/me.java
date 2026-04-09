package defpackage;

import com.github.mikephil.charting.charts.LineChart;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class me implements r10 {
    public LineChart a;
    public ArrayList b;

    public static float a(ArrayList arrayList, float f, int i) {
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            v00 v00Var = (v00) arrayList.get(i2);
            if (v00Var.f == i) {
                float fAbs = Math.abs(v00Var.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }
}
