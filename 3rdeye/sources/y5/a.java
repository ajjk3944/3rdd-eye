package Y5;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Demographic.kt */
/* loaded from: classes2.dex */
public enum a {
    AGE_18_20(1, new v9.g(18, 20, 1)),
    AGE_21_30(2, new v9.g(21, 30, 1)),
    AGE_31_40(3, new v9.g(31, 40, 1)),
    AGE_41_50(4, new v9.g(41, 50, 1)),
    AGE_51_60(5, new v9.g(51, 60, 1)),
    AGE_61_70(6, new v9.g(61, 70, 1)),
    AGE_71_75(7, new v9.g(71, 75, 1)),
    OTHERS(0, new v9.g(RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 1));

    public static final C0200a Companion = new C0200a(null);
    private final int id;
    private final v9.g range;

    /* compiled from: Demographic.kt */
    /* renamed from: Y5.a$a, reason: collision with other inner class name */
    public static final class C0200a {
        public /* synthetic */ C0200a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a fromAge$vungle_ads_release(int i) {
            a aVar;
            a[] aVarArrValues = a.values();
            int length = aVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i10];
                v9.g range = aVar.getRange();
                int i11 = range.f47096b;
                if (i <= range.f47097c && i11 <= i) {
                    break;
                }
                i10++;
            }
            return aVar == null ? a.OTHERS : aVar;
        }

        private C0200a() {
        }
    }

    a(int i, v9.g gVar) {
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
