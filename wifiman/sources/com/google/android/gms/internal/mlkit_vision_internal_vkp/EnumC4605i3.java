package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4605i3 {
    public static final EnumC4605i3 zza;
    public static final EnumC4605i3 zzb;
    public static final EnumC4605i3 zzc;
    public static final EnumC4605i3 zzd;
    public static final EnumC4605i3 zze;
    public static final EnumC4605i3 zzf;
    public static final EnumC4605i3 zzg;
    public static final EnumC4605i3 zzh;
    public static final EnumC4605i3 zzi;
    public static final EnumC4605i3 zzj;
    public static final EnumC4605i3 zzk;
    public static final EnumC4605i3 zzl;
    public static final EnumC4605i3 zzm;
    public static final EnumC4605i3 zzn;
    public static final EnumC4605i3 zzo;
    public static final EnumC4605i3 zzp;
    public static final EnumC4605i3 zzq;
    public static final EnumC4605i3 zzr;
    private static final /* synthetic */ EnumC4605i3[] zzs;
    private final EnumC4616j3 zzt;
    private final int zzu;

    static {
        EnumC4605i3 enumC4605i3 = new EnumC4605i3("DOUBLE", 0, EnumC4616j3.DOUBLE, 1);
        zza = enumC4605i3;
        EnumC4605i3 enumC4605i32 = new EnumC4605i3("FLOAT", 1, EnumC4616j3.FLOAT, 5);
        zzb = enumC4605i32;
        EnumC4616j3 enumC4616j3 = EnumC4616j3.LONG;
        EnumC4605i3 enumC4605i33 = new EnumC4605i3("INT64", 2, enumC4616j3, 0);
        zzc = enumC4605i33;
        EnumC4605i3 enumC4605i34 = new EnumC4605i3("UINT64", 3, enumC4616j3, 0);
        zzd = enumC4605i34;
        EnumC4616j3 enumC4616j32 = EnumC4616j3.INT;
        EnumC4605i3 enumC4605i35 = new EnumC4605i3("INT32", 4, enumC4616j32, 0);
        zze = enumC4605i35;
        EnumC4605i3 enumC4605i36 = new EnumC4605i3("FIXED64", 5, enumC4616j3, 1);
        zzf = enumC4605i36;
        EnumC4605i3 enumC4605i37 = new EnumC4605i3("FIXED32", 6, enumC4616j32, 5);
        zzg = enumC4605i37;
        EnumC4605i3 enumC4605i38 = new EnumC4605i3("BOOL", 7, EnumC4616j3.BOOLEAN, 0);
        zzh = enumC4605i38;
        EnumC4605i3 enumC4605i39 = new EnumC4605i3("STRING", 8, EnumC4616j3.STRING, 2);
        zzi = enumC4605i39;
        EnumC4616j3 enumC4616j33 = EnumC4616j3.MESSAGE;
        EnumC4605i3 enumC4605i310 = new EnumC4605i3("GROUP", 9, enumC4616j33, 3);
        zzj = enumC4605i310;
        EnumC4605i3 enumC4605i311 = new EnumC4605i3("MESSAGE", 10, enumC4616j33, 2);
        zzk = enumC4605i311;
        EnumC4605i3 enumC4605i312 = new EnumC4605i3("BYTES", 11, EnumC4616j3.BYTE_STRING, 2);
        zzl = enumC4605i312;
        EnumC4605i3 enumC4605i313 = new EnumC4605i3("UINT32", 12, enumC4616j32, 0);
        zzm = enumC4605i313;
        EnumC4605i3 enumC4605i314 = new EnumC4605i3("ENUM", 13, EnumC4616j3.ENUM, 0);
        zzn = enumC4605i314;
        EnumC4605i3 enumC4605i315 = new EnumC4605i3("SFIXED32", 14, enumC4616j32, 5);
        zzo = enumC4605i315;
        EnumC4605i3 enumC4605i316 = new EnumC4605i3("SFIXED64", 15, enumC4616j3, 1);
        zzp = enumC4605i316;
        EnumC4605i3 enumC4605i317 = new EnumC4605i3("SINT32", 16, enumC4616j32, 0);
        zzq = enumC4605i317;
        EnumC4605i3 enumC4605i318 = new EnumC4605i3("SINT64", 17, enumC4616j3, 0);
        zzr = enumC4605i318;
        zzs = new EnumC4605i3[]{enumC4605i3, enumC4605i32, enumC4605i33, enumC4605i34, enumC4605i35, enumC4605i36, enumC4605i37, enumC4605i38, enumC4605i39, enumC4605i310, enumC4605i311, enumC4605i312, enumC4605i313, enumC4605i314, enumC4605i315, enumC4605i316, enumC4605i317, enumC4605i318};
    }

    private EnumC4605i3(String str, int i10, EnumC4616j3 enumC4616j3, int i11) {
        this.zzt = enumC4616j3;
        this.zzu = i11;
    }

    public static EnumC4605i3[] values() {
        return (EnumC4605i3[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final EnumC4616j3 zzb() {
        return this.zzt;
    }
}
