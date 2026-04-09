package b3;

import android.util.SparseArray;
import b3.C4066f;

/* loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(s sVar);

        public abstract a c(b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<b> valueMap;
        private final int value;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray<b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i10) {
            this.value = i10;
        }

        public static b forNumber(int i10) {
            return valueMap.get(i10);
        }

        public int getValue() {
            return this.value;
        }
    }

    public static a a() {
        return new C4066f.b();
    }

    public abstract s b();

    public abstract b c();
}
