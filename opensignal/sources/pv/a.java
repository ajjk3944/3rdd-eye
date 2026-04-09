package pv;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum a {
    DEBUG,
    INFO,
    ERROR,
    NONE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
    }
}
