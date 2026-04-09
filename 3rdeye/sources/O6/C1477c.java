package O6;

import K6.C0713c;
import N7.C1185ga;
import N7.H9;
import android.util.DisplayMetrics;

/* compiled from: DivBorderDrawer.kt */
/* renamed from: O6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477c {

    /* compiled from: DivBorderDrawer.kt */
    /* renamed from: O6.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10418a;

        static {
            int[] iArr = new int[H9.values().length];
            try {
                iArr[H9.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H9.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H9.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10418a = iArr;
        }
    }

    public static final float a(C1185ga c1185ga, A7.d expressionResolver, DisplayMetrics displayMetrics) {
        A7.b<Double> bVar;
        A7.b<H9> bVar2;
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        H9 h9A = (c1185ga == null || (bVar2 = c1185ga.f8301c) == null) ? null : bVar2.a(expressionResolver);
        int i = h9A == null ? -1 : a.f10418a[h9A.ordinal()];
        if (i == 1) {
            return C0713c.D(c1185ga.f8302d.a(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return C0713c.X(c1185ga.f8302d.a(expressionResolver), displayMetrics);
        }
        if (i == 3) {
            return (float) c1185ga.f8302d.a(expressionResolver).doubleValue();
        }
        if (c1185ga == null || (bVar = c1185ga.f8302d) == null) {
            return 0.0f;
        }
        return (float) bVar.a(expressionResolver).doubleValue();
    }
}
