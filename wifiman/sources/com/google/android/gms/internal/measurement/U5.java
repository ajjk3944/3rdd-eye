package com.google.android.gms.internal.measurement;

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
/* loaded from: classes.dex */
public class U5 {
    public static final U5 zza;
    public static final U5 zzb;
    public static final U5 zzc;
    public static final U5 zzd;
    public static final U5 zze;
    public static final U5 zzf;
    public static final U5 zzg;
    public static final U5 zzh;
    public static final U5 zzi;
    public static final U5 zzj;
    public static final U5 zzk;
    public static final U5 zzl;
    public static final U5 zzm;
    public static final U5 zzn;
    public static final U5 zzo;
    public static final U5 zzp;
    public static final U5 zzq;
    public static final U5 zzr;
    private static final /* synthetic */ U5[] zzs;
    private final EnumC4313b6 zzt;
    private final int zzu;

    static {
        U5 u52 = new U5("DOUBLE", 0, EnumC4313b6.DOUBLE, 1);
        zza = u52;
        U5 u53 = new U5("FLOAT", 1, EnumC4313b6.FLOAT, 5);
        zzb = u53;
        EnumC4313b6 enumC4313b6 = EnumC4313b6.LONG;
        U5 u54 = new U5("INT64", 2, enumC4313b6, 0);
        zzc = u54;
        U5 u55 = new U5("UINT64", 3, enumC4313b6, 0);
        zzd = u55;
        EnumC4313b6 enumC4313b62 = EnumC4313b6.INT;
        U5 u56 = new U5("INT32", 4, enumC4313b62, 0);
        zze = u56;
        U5 u57 = new U5("FIXED64", 5, enumC4313b6, 1);
        zzf = u57;
        U5 u58 = new U5("FIXED32", 6, enumC4313b62, 5);
        zzg = u58;
        U5 u59 = new U5("BOOL", 7, EnumC4313b6.BOOLEAN, 0);
        zzh = u59;
        int i10 = 2;
        AbstractC4304a6 abstractC4304a6 = null;
        X5 x52 = new X5("STRING", EnumC4313b6.STRING);
        zzi = x52;
        EnumC4313b6 enumC4313b63 = EnumC4313b6.MESSAGE;
        W5 w52 = new W5("GROUP", enumC4313b63);
        zzj = w52;
        Z5 z52 = new Z5("MESSAGE", enumC4313b63);
        zzk = z52;
        Y5 y52 = new Y5("BYTES", EnumC4313b6.BYTE_STRING);
        zzl = y52;
        U5 u510 = new U5("UINT32", 12, enumC4313b62, 0);
        zzm = u510;
        U5 u511 = new U5("ENUM", 13, EnumC4313b6.ENUM, 0);
        zzn = u511;
        U5 u512 = new U5("SFIXED32", 14, enumC4313b62, 5);
        zzo = u512;
        U5 u513 = new U5("SFIXED64", 15, enumC4313b6, 1);
        zzp = u513;
        U5 u514 = new U5("SINT32", 16, enumC4313b62, 0);
        zzq = u514;
        U5 u515 = new U5("SINT64", 17, enumC4313b6, 0);
        zzr = u515;
        zzs = new U5[]{u52, u53, u54, u55, u56, u57, u58, u59, x52, w52, z52, y52, u510, u511, u512, u513, u514, u515};
    }

    public static U5[] values() {
        return (U5[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final EnumC4313b6 zzb() {
        return this.zzt;
    }

    private U5(String str, int i10, EnumC4313b6 enumC4313b6, int i11) {
        this.zzt = enumC4313b6;
        this.zzu = i11;
    }
}
