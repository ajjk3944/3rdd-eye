package u1;

import io.appmetrica.analytics.impl.Oo;

/* compiled from: FileSectionType.java */
/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5621d {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    EnumC5621d(long j4) {
        this.mValue = j4;
    }

    public static EnumC5621d fromValue(long j4) {
        EnumC5621d[] enumC5621dArrValues = values();
        for (int i = 0; i < enumC5621dArrValues.length; i++) {
            if (enumC5621dArrValues[i].getValue() == j4) {
                return enumC5621dArrValues[i];
            }
        }
        throw new IllegalArgumentException(Oo.d(j4, "Unsupported FileSection Type "));
    }

    public long getValue() {
        return this.mValue;
    }
}
