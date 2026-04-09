package Y5;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Demographic.kt */
/* loaded from: classes2.dex */
public enum f {
    UNDER_100K(0, new v9.g(RecyclerView.UNDEFINED_DURATION, 100000, 1)),
    FROM_100K_TO_300K(1, new v9.g(100001, 300000, 1)),
    FROM_300K_TO_500K(2, new v9.g(300001, 500000, 1)),
    FROM_500K_TO_700K(3, new v9.g(500001, 700000, 1)),
    FROM_700K_TO_900K(4, new v9.g(700001, 900000, 1)),
    FROM_900K_TO_1M1(5, new v9.g(900001, 1100000, 1)),
    FROM_1M1_TO_1M3(6, new v9.g(1100001, 1300000, 1)),
    FROM_1M3_TO_1M5(7, new v9.g(1300001, 1500000, 1)),
    FROM_1M5_TO_1M7(8, new v9.g(1500001, 1700000, 1)),
    OVER_1M7(9, new v9.g(1700001, Integer.MAX_VALUE, 1));

    public static final a Companion = new a(null);
    private final int id;
    private final v9.g range;

    /* compiled from: Demographic.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f fromPrice$vungle_ads_release(int i) {
            f fVar;
            f[] fVarArrValues = f.values();
            int length = fVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    fVar = null;
                    break;
                }
                fVar = fVarArrValues[i10];
                v9.g range = fVar.getRange();
                int i11 = range.f47096b;
                if (i <= range.f47097c && i11 <= i) {
                    break;
                }
                i10++;
            }
            return fVar == null ? f.UNDER_100K : fVar;
        }

        private a() {
        }
    }

    f(int i, v9.g gVar) {
        this.id = i;
        this.range = gVar;
    }

    public final int getId() {
        return this.id;
    }

    public final v9.g getRange() {
        return this.range;
    }
}
