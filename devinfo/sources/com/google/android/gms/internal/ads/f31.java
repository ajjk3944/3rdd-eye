package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f31 implements d31 {

    /* renamed from: a, reason: collision with root package name */
    public static final f31 f10977a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f31[] f10978b;

    static {
        f31 f31Var = new f31("ALWAYS_TRUE", 0);
        f10977a = f31Var;
        f10978b = new f31[]{f31Var, new f31("ALWAYS_FALSE", 1), new f31("IS_NULL", 2), new f31("NOT_NULL", 3)};
    }

    public static f31[] values() {
        return (f31[]) f10978b.clone();
    }

    @Override // com.google.android.gms.internal.ads.d31
    public final /* synthetic */ boolean c(Object obj) {
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
