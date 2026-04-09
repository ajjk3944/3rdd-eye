package ns;

import rs.q;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public final q[] f18524d;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i10, q[] qVarArr) {
        if (qVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i11 = 1;
        int length = qVarArr.length - 1;
        if (length != 0) {
            for (int i12 = 31; i12 >= 0; i12--) {
                if (((1 << i12) & length) != 0) {
                    i11 = 1 + i12;
                }
            }
            throw new IllegalStateException("Empty enum: " + qVarArr.getClass());
        }
        super(i10, i11, 0, (byte) 0);
        this.f18524d = qVarArr;
    }

    public final Object e(int i10) {
        int i11 = (1 << this.f18527c) - 1;
        int i12 = this.f18526b;
        int i13 = (i10 & (i11 << i12)) >> i12;
        for (q qVar : this.f18524d) {
            if (qVar.getNumber() == i13) {
                return qVar;
            }
        }
        return null;
    }
}
