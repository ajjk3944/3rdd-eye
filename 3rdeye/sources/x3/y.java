package x3;

import android.util.SparseArray;

/* compiled from: ComplianceData.java */
/* loaded from: classes.dex */
public abstract class y {

    /* compiled from: ComplianceData.java */
    public enum a {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<a> valueMap;
        private final int value;

        static {
            a aVar = NOT_SET;
            a aVar2 = EVENT_OVERRIDE;
            SparseArray<a> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, aVar);
            sparseArray.put(5, aVar2);
        }

        a(int i) {
            this.value = i;
        }

        public static a forNumber(int i) {
            return valueMap.get(i);
        }

        public int getValue() {
            return this.value;
        }
    }

    public abstract B a();

    public abstract a b();
}
