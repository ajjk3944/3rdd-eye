package l9;

import android.util.SparseArray;

/* loaded from: classes.dex */
public enum z {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<z> valueMap;
    private final int value;

    static {
        z zVar = NOT_SET;
        z zVar2 = EVENT_OVERRIDE;
        SparseArray<z> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, zVar);
        sparseArray.put(5, zVar2);
    }

    z(int i10) {
        this.value = i10;
    }

    public static z forNumber(int i10) {
        return valueMap.get(i10);
    }

    public int getValue() {
        return this.value;
    }
}
