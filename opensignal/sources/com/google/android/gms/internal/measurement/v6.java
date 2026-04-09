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
public final class v6 {
    public static final v6 zza;
    public static final v6 zzb;
    public static final v6 zzc;
    public static final v6 zzd;
    public static final v6 zze;
    public static final v6 zzf;
    public static final v6 zzg;
    public static final v6 zzh;
    public static final v6 zzi;
    public static final v6 zzj;
    public static final v6 zzk;
    public static final v6 zzl;
    public static final v6 zzm;
    public static final v6 zzn;
    public static final v6 zzo;
    public static final v6 zzp;
    public static final v6 zzq;
    public static final v6 zzr;
    private static final /* synthetic */ v6[] zzu;
    private final w6 zzs;
    private final int zzt;

    static {
        v6 v6Var = new v6("DOUBLE", 0, w6.DOUBLE, 1);
        zza = v6Var;
        v6 v6Var2 = new v6("FLOAT", 1, w6.FLOAT, 5);
        zzb = v6Var2;
        w6 w6Var = w6.LONG;
        v6 v6Var3 = new v6("INT64", 2, w6Var, 0);
        zzc = v6Var3;
        v6 v6Var4 = new v6("UINT64", 3, w6Var, 0);
        zzd = v6Var4;
        w6 w6Var2 = w6.INT;
        v6 v6Var5 = new v6("INT32", 4, w6Var2, 0);
        zze = v6Var5;
        v6 v6Var6 = new v6("FIXED64", 5, w6Var, 1);
        zzf = v6Var6;
        v6 v6Var7 = new v6("FIXED32", 6, w6Var2, 5);
        zzg = v6Var7;
        v6 v6Var8 = new v6("BOOL", 7, w6.BOOLEAN, 0);
        zzh = v6Var8;
        v6 v6Var9 = new v6("STRING", 8, w6.STRING, 2);
        zzi = v6Var9;
        w6 w6Var3 = w6.MESSAGE;
        v6 v6Var10 = new v6("GROUP", 9, w6Var3, 3);
        zzj = v6Var10;
        v6 v6Var11 = new v6("MESSAGE", 10, w6Var3, 2);
        zzk = v6Var11;
        v6 v6Var12 = new v6("BYTES", 11, w6.BYTE_STRING, 2);
        zzl = v6Var12;
        v6 v6Var13 = new v6("UINT32", 12, w6Var2, 0);
        zzm = v6Var13;
        v6 v6Var14 = new v6("ENUM", 13, w6.ENUM, 0);
        zzn = v6Var14;
        v6 v6Var15 = new v6("SFIXED32", 14, w6Var2, 5);
        zzo = v6Var15;
        v6 v6Var16 = new v6("SFIXED64", 15, w6Var, 1);
        zzp = v6Var16;
        v6 v6Var17 = new v6("SINT32", 16, w6Var2, 0);
        zzq = v6Var17;
        v6 v6Var18 = new v6("SINT64", 17, w6Var, 0);
        zzr = v6Var18;
        zzu = new v6[]{v6Var, v6Var2, v6Var3, v6Var4, v6Var5, v6Var6, v6Var7, v6Var8, v6Var9, v6Var10, v6Var11, v6Var12, v6Var13, v6Var14, v6Var15, v6Var16, v6Var17, v6Var18};
    }

    private v6(String str, int i10, w6 w6Var, int i11) {
        this.zzs = w6Var;
        this.zzt = i11;
    }

    public static v6[] values() {
        return (v6[]) zzu.clone();
    }

    public final w6 zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
