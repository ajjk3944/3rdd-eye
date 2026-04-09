package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class zzgzm {
    public static final zzgzm zza;
    public static final zzgzm zzb;
    public static final zzgzm zzc;
    public static final zzgzm zzd;
    public static final zzgzm zze;
    public static final zzgzm zzf;
    public static final zzgzm zzg;
    public static final zzgzm zzh;
    public static final zzgzm zzi;
    public static final zzgzm zzj;
    private static final /* synthetic */ zzgzm[] zzk;
    private final Class zzl;

    static {
        zzgzm zzgzmVar = new zzgzm("VOID", 0, Void.class, Void.class, null);
        zza = zzgzmVar;
        Class cls = Integer.TYPE;
        zzgzm zzgzmVar2 = new zzgzm("INT", 1, cls, Integer.class, 0);
        zzb = zzgzmVar2;
        zzgzm zzgzmVar3 = new zzgzm("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgzmVar3;
        zzgzm zzgzmVar4 = new zzgzm("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgzmVar4;
        zzgzm zzgzmVar5 = new zzgzm("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgzmVar5;
        zzgzm zzgzmVar6 = new zzgzm("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgzmVar6;
        zzgzm zzgzmVar7 = new zzgzm("STRING", 6, String.class, String.class, "");
        zzg = zzgzmVar7;
        zzgzm zzgzmVar8 = new zzgzm("BYTE_STRING", 7, zzgxn.class, zzgxn.class, zzgxn.zzb);
        zzh = zzgzmVar8;
        zzgzm zzgzmVar9 = new zzgzm("ENUM", 8, cls, Integer.class, null);
        zzi = zzgzmVar9;
        zzgzm zzgzmVar10 = new zzgzm("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgzmVar10;
        zzk = new zzgzm[]{zzgzmVar, zzgzmVar2, zzgzmVar3, zzgzmVar4, zzgzmVar5, zzgzmVar6, zzgzmVar7, zzgzmVar8, zzgzmVar9, zzgzmVar10};
    }

    private zzgzm(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzgzm[] values() {
        return (zzgzm[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
