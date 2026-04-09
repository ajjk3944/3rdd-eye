package com.vungle.ads.fpd;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import q9.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/fpd/AgeRange;", "", "", "id", "Lq9/c;", "range", "<init>", "(Ljava/lang/String;IILq9/c;)V", "I", "getId", "()I", "Lq9/c;", "getRange", "()Lq9/c;", "Companion", "a", "AGE_18_20", "AGE_21_30", "AGE_31_40", "AGE_41_50", "AGE_51_60", "AGE_61_70", "AGE_71_75", "OTHERS", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum AgeRange {
    AGE_18_20(1, new c(18, 20)),
    AGE_21_30(2, new c(21, 30)),
    AGE_31_40(3, new c(31, 40)),
    AGE_41_50(4, new c(41, 50)),
    AGE_51_60(5, new c(51, 60)),
    AGE_61_70(6, new c(61, 70)),
    AGE_71_75(7, new c(71, 75)),
    OTHERS(0, new c(Integer.MIN_VALUE, Integer.MAX_VALUE));


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int id;

    @NotNull
    private final c range;

    /* renamed from: com.vungle.ads.fpd.AgeRange$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final AgeRange fromAge$vungle_ads_release(int i10) {
            AgeRange ageRange;
            AgeRange[] ageRangeArrValues = AgeRange.values();
            int length = ageRangeArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    ageRange = null;
                    break;
                }
                ageRange = ageRangeArrValues[i11];
                c range = ageRange.getRange();
                int iC = range.c();
                if (i10 <= range.d() && iC <= i10) {
                    break;
                }
                i11++;
            }
            return ageRange == null ? AgeRange.OTHERS : ageRange;
        }

        private Companion() {
        }
    }

    AgeRange(int i10, c cVar) {
        this.id = i10;
        this.range = cVar;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final c getRange() {
        return this.range;
    }
}
