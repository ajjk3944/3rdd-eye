package x3;

import android.util.SparseArray;

/* compiled from: QosTier.java */
/* loaded from: classes.dex */
public enum G {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    private static final SparseArray<G> valueMap;
    private final int value;

    static {
        G g10 = DEFAULT;
        G g11 = UNMETERED_ONLY;
        G g12 = UNMETERED_OR_DAILY;
        G g13 = FAST_IF_RADIO_AWAKE;
        G g14 = NEVER;
        G g15 = UNRECOGNIZED;
        SparseArray<G> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, g10);
        sparseArray.put(1, g11);
        sparseArray.put(2, g12);
        sparseArray.put(3, g13);
        sparseArray.put(4, g14);
        sparseArray.put(-1, g15);
    }

    G(int i) {
        this.value = i;
    }

    public static G forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public final int getNumber() {
        return this.value;
    }
}
