package Y5;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Demographic.kt */
/* loaded from: classes2.dex */
public enum d {
    LESS_THAN_ONE_YEAR(0, new v9.g(RecyclerView.UNDEFINED_DURATION, 0, 1)),
    ONE_TO_FIVE_YEARS(1, new v9.g(1, 5, 1)),
    SIX_TO_TEN_YEARS(2, new v9.g(6, 10, 1)),
    ELEVEN_TO_TWENTY_YEARS(3, new v9.g(11, 20, 1)),
    TWENTY_ONE_TO_THIRTY_YEARS(4, new v9.g(21, 30, 1)),
    THIRTY_ONE_TO_FORTY_YEARS(5, new v9.g(31, 40, 1)),
    FORTY_ONE_TO_FIFTY_YEARS(6, new v9.g(41, 50, 1)),
    FIFTY_ONE_TO_SIXTY_YEARS(7, new v9.g(51, 60, 1)),
    SIXTY_ONE_TO_SEVENTY_YEARS(8, new v9.g(61, 70, 1)),
    OVER_SEVENTY_ONE_YEARS(9, new v9.g(71, Integer.MAX_VALUE, 1));

    public static final a Companion = new a(null);
    private final int id;
    private final v9.g range;

    /* compiled from: Demographic.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d fromYears$vungle_ads_release(int i) {
            d dVar;
            d[] dVarArrValues = d.values();
            int length = dVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i10];
                v9.g range = dVar.getRange();
                int i11 = range.f47096b;
                if (i <= range.f47097c && i11 <= i) {
                    break;
                }
                i10++;
            }
            return dVar == null ? d.LESS_THAN_ONE_YEAR : dVar;
        }

        private a() {
        }
    }

    d(int i, v9.g gVar) {
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
