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
public final class M4 {
    public static final M4 zza;
    public static final M4 zzb;
    public static final M4 zzc;
    public static final M4 zzd;
    public static final M4 zze;
    public static final M4 zzf;
    public static final M4 zzg;
    public static final M4 zzh;
    public static final M4 zzi;
    public static final M4 zzj;
    private static final /* synthetic */ M4[] zzk;
    private final Class<?> zzl;

    static {
        M4 m42 = new M4("VOID", 0, Void.class, Void.class, null);
        zza = m42;
        Class cls = Integer.TYPE;
        M4 m43 = new M4("INT", 1, cls, Integer.class, 0);
        zzb = m43;
        M4 m44 = new M4("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = m44;
        M4 m45 = new M4("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = m45;
        M4 m46 = new M4("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = m46;
        M4 m47 = new M4("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = m47;
        M4 m48 = new M4("STRING", 6, String.class, String.class, "");
        zzg = m48;
        M4 m49 = new M4("BYTE_STRING", 7, V3.class, V3.class, V3.f35128b);
        zzh = m49;
        M4 m410 = new M4("ENUM", 8, cls, Integer.class, null);
        zzi = m410;
        M4 m411 = new M4("MESSAGE", 9, Object.class, Object.class, null);
        zzj = m411;
        zzk = new M4[]{m42, m43, m44, m45, m46, m47, m48, m49, m410, m411};
    }

    private M4(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static M4[] values() {
        return (M4[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
