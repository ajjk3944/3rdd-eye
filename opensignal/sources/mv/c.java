package mv;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum c {
    Single,
    Factory;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] cVarArrValuesCustom = values();
        return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
    }
}
