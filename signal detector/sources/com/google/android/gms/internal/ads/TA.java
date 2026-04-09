package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TA implements RA {

    /* renamed from: a, reason: collision with root package name */
    public static final TA f11354a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TA[] f11355b;

    static {
        TA ta = new TA("ALWAYS_TRUE", 0);
        f11354a = ta;
        f11355b = new TA[]{ta, new TA("ALWAYS_FALSE", 1), new TA("IS_NULL", 2), new TA("NOT_NULL", 3)};
    }

    public static TA[] values() {
        return (TA[]) f11355b.clone();
    }

    @Override // com.google.android.gms.internal.ads.RA
    public final /* synthetic */ boolean b(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
