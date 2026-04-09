package com.google.android.gms.internal.measurement;

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
/* loaded from: classes.dex */
public final class r5 {
    public static final r5 zza;
    public static final r5 zzb;
    public static final r5 zzc;
    public static final r5 zzd;
    public static final r5 zze;
    public static final r5 zzf;
    public static final r5 zzg;
    public static final r5 zzh;
    public static final r5 zzi;
    public static final r5 zzj;
    private static final /* synthetic */ r5[] zzl;
    private final Class zzk;

    static {
        r5 r5Var = new r5("VOID", 0, Void.class, Void.class, null);
        zza = r5Var;
        Class cls = Integer.TYPE;
        r5 r5Var2 = new r5("INT", 1, cls, Integer.class, 0);
        zzb = r5Var2;
        r5 r5Var3 = new r5("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = r5Var3;
        r5 r5Var4 = new r5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = r5Var4;
        r5 r5Var5 = new r5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = r5Var5;
        r5 r5Var6 = new r5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = r5Var6;
        r5 r5Var7 = new r5("STRING", 6, String.class, String.class, "");
        zzg = r5Var7;
        r5 r5Var8 = new r5("BYTE_STRING", 7, y4.class, y4.class, y4.f5268g);
        zzh = r5Var8;
        r5 r5Var9 = new r5("ENUM", 8, cls, Integer.class, null);
        zzi = r5Var9;
        r5 r5Var10 = new r5("MESSAGE", 9, Object.class, Object.class, null);
        zzj = r5Var10;
        zzl = new r5[]{r5Var, r5Var2, r5Var3, r5Var4, r5Var5, r5Var6, r5Var7, r5Var8, r5Var9, r5Var10};
    }

    private r5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static r5[] values() {
        return (r5[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
