package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhby {
    public static final zzhby zza;
    public static final zzhby zzb;
    public static final zzhby zzc;
    public static final zzhby zzd;
    public static final zzhby zze;
    public static final zzhby zzf;
    public static final zzhby zzg;
    public static final zzhby zzh;
    public static final zzhby zzi;
    public static final zzhby zzj;
    public static final zzhby zzk;
    public static final zzhby zzl;
    public static final zzhby zzm;
    public static final zzhby zzn;
    public static final zzhby zzo;
    public static final zzhby zzp;
    public static final zzhby zzq;
    public static final zzhby zzr;
    private static final /* synthetic */ zzhby[] zzs;
    private final zzhbz zzt;

    static {
        zzhby zzhbyVar = new zzhby("DOUBLE", 0, zzhbz.DOUBLE, 1);
        zza = zzhbyVar;
        zzhby zzhbyVar2 = new zzhby("FLOAT", 1, zzhbz.FLOAT, 5);
        zzb = zzhbyVar2;
        zzhbz zzhbzVar = zzhbz.LONG;
        zzhby zzhbyVar3 = new zzhby("INT64", 2, zzhbzVar, 0);
        zzc = zzhbyVar3;
        zzhby zzhbyVar4 = new zzhby("UINT64", 3, zzhbzVar, 0);
        zzd = zzhbyVar4;
        zzhbz zzhbzVar2 = zzhbz.INT;
        zzhby zzhbyVar5 = new zzhby("INT32", 4, zzhbzVar2, 0);
        zze = zzhbyVar5;
        zzhby zzhbyVar6 = new zzhby("FIXED64", 5, zzhbzVar, 1);
        zzf = zzhbyVar6;
        zzhby zzhbyVar7 = new zzhby("FIXED32", 6, zzhbzVar2, 5);
        zzg = zzhbyVar7;
        zzhby zzhbyVar8 = new zzhby("BOOL", 7, zzhbz.BOOLEAN, 0);
        zzh = zzhbyVar8;
        zzhby zzhbyVar9 = new zzhby("STRING", 8, zzhbz.STRING, 2);
        zzi = zzhbyVar9;
        zzhbz zzhbzVar3 = zzhbz.MESSAGE;
        zzhby zzhbyVar10 = new zzhby("GROUP", 9, zzhbzVar3, 3);
        zzj = zzhbyVar10;
        zzhby zzhbyVar11 = new zzhby("MESSAGE", 10, zzhbzVar3, 2);
        zzk = zzhbyVar11;
        zzhby zzhbyVar12 = new zzhby("BYTES", 11, zzhbz.BYTE_STRING, 2);
        zzl = zzhbyVar12;
        zzhby zzhbyVar13 = new zzhby("UINT32", 12, zzhbzVar2, 0);
        zzm = zzhbyVar13;
        zzhby zzhbyVar14 = new zzhby("ENUM", 13, zzhbz.ENUM, 0);
        zzn = zzhbyVar14;
        zzhby zzhbyVar15 = new zzhby("SFIXED32", 14, zzhbzVar2, 5);
        zzo = zzhbyVar15;
        zzhby zzhbyVar16 = new zzhby("SFIXED64", 15, zzhbzVar, 1);
        zzp = zzhbyVar16;
        zzhby zzhbyVar17 = new zzhby("SINT32", 16, zzhbzVar2, 0);
        zzq = zzhbyVar17;
        zzhby zzhbyVar18 = new zzhby("SINT64", 17, zzhbzVar, 0);
        zzr = zzhbyVar18;
        zzs = new zzhby[]{zzhbyVar, zzhbyVar2, zzhbyVar3, zzhbyVar4, zzhbyVar5, zzhbyVar6, zzhbyVar7, zzhbyVar8, zzhbyVar9, zzhbyVar10, zzhbyVar11, zzhbyVar12, zzhbyVar13, zzhbyVar14, zzhbyVar15, zzhbyVar16, zzhbyVar17, zzhbyVar18};
    }

    private zzhby(String str, int i, zzhbz zzhbzVar, int i10) {
        this.zzt = zzhbzVar;
    }

    public static zzhby[] values() {
        return (zzhby[]) zzs.clone();
    }

    public final zzhbz zza() {
        return this.zzt;
    }
}
