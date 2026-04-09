package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4427p0 implements I4 {
    UNSPECIFIED_TYPE(0),
    RAW_FILE_IO_TYPE(1),
    MOBSTORE_TYPE(2),
    SQLITE_OPEN_HELPER_TYPE(3),
    LEVEL_DB_TYPE(5),
    ROOM_TYPE(6),
    SHARED_PREFS_TYPE(7),
    PROTO_DATA_STORE_TYPE(8),
    UNRECOGNIZED(-1);

    private final int zzk;

    EnumC4427p0(int i10) {
        this.zzk = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(EnumC4427p0.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.I4
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzk;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
