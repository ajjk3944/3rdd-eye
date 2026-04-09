package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class d5 {
    public static final d5 zzA;
    public static final d5 zzB;
    public static final d5 zzC;
    public static final d5 zzD;
    public static final d5 zzE;
    public static final d5 zzF;
    public static final d5 zzG;
    public static final d5 zzH;
    public static final d5 zzI;
    public static final d5 zzJ;
    public static final d5 zzK;
    public static final d5 zzL;
    public static final d5 zzM;
    public static final d5 zzN;
    public static final d5 zzO;
    public static final d5 zzP;
    public static final d5 zzQ;
    public static final d5 zzR;
    public static final d5 zzS;
    public static final d5 zzT;
    public static final d5 zzU;
    public static final d5 zzV;
    public static final d5 zzW;
    public static final d5 zzX;
    public static final d5 zzY;
    public static final d5 zza;
    private static final d5[] zzaa;
    private static final /* synthetic */ d5[] zzab;
    public static final d5 zzb;
    public static final d5 zzc;
    public static final d5 zzd;
    public static final d5 zze;
    public static final d5 zzf;
    public static final d5 zzg;
    public static final d5 zzh;
    public static final d5 zzi;
    public static final d5 zzj;
    public static final d5 zzk;
    public static final d5 zzl;
    public static final d5 zzm;
    public static final d5 zzn;
    public static final d5 zzo;
    public static final d5 zzp;
    public static final d5 zzq;
    public static final d5 zzr;
    public static final d5 zzs;
    public static final d5 zzt;
    public static final d5 zzu;
    public static final d5 zzv;
    public static final d5 zzw;
    public static final d5 zzx;
    public static final d5 zzy;
    public static final d5 zzz;
    private final int zzZ;

    static {
        r5 r5Var = r5.zze;
        d5 d5Var = new d5("DOUBLE", 0, 0, 1, r5Var);
        zza = d5Var;
        r5 r5Var2 = r5.zzd;
        d5 d5Var2 = new d5("FLOAT", 1, 1, 1, r5Var2);
        zzb = d5Var2;
        r5 r5Var3 = r5.zzc;
        d5 d5Var3 = new d5("INT64", 2, 2, 1, r5Var3);
        zzc = d5Var3;
        d5 d5Var4 = new d5("UINT64", 3, 3, 1, r5Var3);
        zzd = d5Var4;
        r5 r5Var4 = r5.zzb;
        d5 d5Var5 = new d5("INT32", 4, 4, 1, r5Var4);
        zze = d5Var5;
        d5 d5Var6 = new d5("FIXED64", 5, 5, 1, r5Var3);
        zzf = d5Var6;
        d5 d5Var7 = new d5("FIXED32", 6, 6, 1, r5Var4);
        zzg = d5Var7;
        r5 r5Var5 = r5.zzf;
        d5 d5Var8 = new d5("BOOL", 7, 7, 1, r5Var5);
        zzh = d5Var8;
        r5 r5Var6 = r5.zzg;
        d5 d5Var9 = new d5("STRING", 8, 8, 1, r5Var6);
        zzi = d5Var9;
        r5 r5Var7 = r5.zzj;
        d5 d5Var10 = new d5("MESSAGE", 9, 9, 1, r5Var7);
        zzj = d5Var10;
        r5 r5Var8 = r5.zzh;
        d5 d5Var11 = new d5("BYTES", 10, 10, 1, r5Var8);
        zzk = d5Var11;
        d5 d5Var12 = new d5("UINT32", 11, 11, 1, r5Var4);
        zzl = d5Var12;
        r5 r5Var9 = r5.zzi;
        d5 d5Var13 = new d5("ENUM", 12, 12, 1, r5Var9);
        zzm = d5Var13;
        d5 d5Var14 = new d5("SFIXED32", 13, 13, 1, r5Var4);
        zzn = d5Var14;
        d5 d5Var15 = new d5("SFIXED64", 14, 14, 1, r5Var3);
        zzo = d5Var15;
        d5 d5Var16 = new d5("SINT32", 15, 15, 1, r5Var4);
        zzp = d5Var16;
        d5 d5Var17 = new d5("SINT64", 16, 16, 1, r5Var3);
        zzq = d5Var17;
        d5 d5Var18 = new d5("GROUP", 17, 17, 1, r5Var7);
        zzr = d5Var18;
        d5 d5Var19 = new d5("DOUBLE_LIST", 18, 18, 2, r5Var);
        zzs = d5Var19;
        d5 d5Var20 = new d5("FLOAT_LIST", 19, 19, 2, r5Var2);
        zzt = d5Var20;
        d5 d5Var21 = new d5("INT64_LIST", 20, 20, 2, r5Var3);
        zzu = d5Var21;
        d5 d5Var22 = new d5("UINT64_LIST", 21, 21, 2, r5Var3);
        zzv = d5Var22;
        d5 d5Var23 = new d5("INT32_LIST", 22, 22, 2, r5Var4);
        zzw = d5Var23;
        d5 d5Var24 = new d5("FIXED64_LIST", 23, 23, 2, r5Var3);
        zzx = d5Var24;
        d5 d5Var25 = new d5("FIXED32_LIST", 24, 24, 2, r5Var4);
        zzy = d5Var25;
        d5 d5Var26 = new d5("BOOL_LIST", 25, 25, 2, r5Var5);
        zzz = d5Var26;
        d5 d5Var27 = new d5("STRING_LIST", 26, 26, 2, r5Var6);
        zzA = d5Var27;
        d5 d5Var28 = new d5("MESSAGE_LIST", 27, 27, 2, r5Var7);
        zzB = d5Var28;
        d5 d5Var29 = new d5("BYTES_LIST", 28, 28, 2, r5Var8);
        zzC = d5Var29;
        d5 d5Var30 = new d5("UINT32_LIST", 29, 29, 2, r5Var4);
        zzD = d5Var30;
        d5 d5Var31 = new d5("ENUM_LIST", 30, 30, 2, r5Var9);
        zzE = d5Var31;
        d5 d5Var32 = new d5("SFIXED32_LIST", 31, 31, 2, r5Var4);
        zzF = d5Var32;
        d5 d5Var33 = new d5("SFIXED64_LIST", 32, 32, 2, r5Var3);
        zzG = d5Var33;
        d5 d5Var34 = new d5("SINT32_LIST", 33, 33, 2, r5Var4);
        zzH = d5Var34;
        d5 d5Var35 = new d5("SINT64_LIST", 34, 34, 2, r5Var3);
        zzI = d5Var35;
        d5 d5Var36 = new d5("DOUBLE_LIST_PACKED", 35, 35, 3, r5Var);
        zzJ = d5Var36;
        d5 d5Var37 = new d5("FLOAT_LIST_PACKED", 36, 36, 3, r5Var2);
        zzK = d5Var37;
        d5 d5Var38 = new d5("INT64_LIST_PACKED", 37, 37, 3, r5Var3);
        zzL = d5Var38;
        d5 d5Var39 = new d5("UINT64_LIST_PACKED", 38, 38, 3, r5Var3);
        zzM = d5Var39;
        d5 d5Var40 = new d5("INT32_LIST_PACKED", 39, 39, 3, r5Var4);
        zzN = d5Var40;
        d5 d5Var41 = new d5("FIXED64_LIST_PACKED", 40, 40, 3, r5Var3);
        zzO = d5Var41;
        d5 d5Var42 = new d5("FIXED32_LIST_PACKED", 41, 41, 3, r5Var4);
        zzP = d5Var42;
        d5 d5Var43 = new d5("BOOL_LIST_PACKED", 42, 42, 3, r5Var5);
        zzQ = d5Var43;
        d5 d5Var44 = new d5("UINT32_LIST_PACKED", 43, 43, 3, r5Var4);
        zzR = d5Var44;
        d5 d5Var45 = new d5("ENUM_LIST_PACKED", 44, 44, 3, r5Var9);
        zzS = d5Var45;
        d5 d5Var46 = new d5("SFIXED32_LIST_PACKED", 45, 45, 3, r5Var4);
        zzT = d5Var46;
        d5 d5Var47 = new d5("SFIXED64_LIST_PACKED", 46, 46, 3, r5Var3);
        zzU = d5Var47;
        d5 d5Var48 = new d5("SINT32_LIST_PACKED", 47, 47, 3, r5Var4);
        zzV = d5Var48;
        d5 d5Var49 = new d5("SINT64_LIST_PACKED", 48, 48, 3, r5Var3);
        zzW = d5Var49;
        d5 d5Var50 = new d5("GROUP_LIST", 49, 49, 2, r5Var7);
        zzX = d5Var50;
        d5 d5Var51 = new d5("MAP", 50, 50, 4, r5.zza);
        zzY = d5Var51;
        zzab = new d5[]{d5Var, d5Var2, d5Var3, d5Var4, d5Var5, d5Var6, d5Var7, d5Var8, d5Var9, d5Var10, d5Var11, d5Var12, d5Var13, d5Var14, d5Var15, d5Var16, d5Var17, d5Var18, d5Var19, d5Var20, d5Var21, d5Var22, d5Var23, d5Var24, d5Var25, d5Var26, d5Var27, d5Var28, d5Var29, d5Var30, d5Var31, d5Var32, d5Var33, d5Var34, d5Var35, d5Var36, d5Var37, d5Var38, d5Var39, d5Var40, d5Var41, d5Var42, d5Var43, d5Var44, d5Var45, d5Var46, d5Var47, d5Var48, d5Var49, d5Var50, d5Var51};
        d5[] d5VarArrValues = values();
        zzaa = new d5[d5VarArrValues.length];
        for (d5 d5Var52 : d5VarArrValues) {
            zzaa[d5Var52.zzZ] = d5Var52;
        }
    }

    private d5(String str, int i10, int i11, int i12, r5 r5Var) {
        this.zzZ = i11;
        int i13 = i12 - 1;
        if (i13 == 1 || i13 == 3) {
            r5Var.zza();
        }
        if (i12 == 1) {
            r5 r5Var2 = r5.zza;
            r5Var.ordinal();
        }
    }

    public static d5[] values() {
        return (d5[]) zzab.clone();
    }

    public final int zza() {
        return this.zzZ;
    }
}
