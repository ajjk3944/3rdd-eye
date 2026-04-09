package com.google.android.gms.internal.mlkit_vision_internal_vkp;

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
/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4604i2 {
    public static final EnumC4604i2 zza;
    public static final EnumC4604i2 zzb;
    public static final EnumC4604i2 zzc;
    public static final EnumC4604i2 zzd;
    public static final EnumC4604i2 zze;
    public static final EnumC4604i2 zzf;
    public static final EnumC4604i2 zzg;
    public static final EnumC4604i2 zzh;
    public static final EnumC4604i2 zzi;
    public static final EnumC4604i2 zzj;
    private static final /* synthetic */ EnumC4604i2[] zzk;
    private final Class zzl;

    static {
        EnumC4604i2 enumC4604i2 = new EnumC4604i2("VOID", 0, Void.class, Void.class, null);
        zza = enumC4604i2;
        Class cls = Integer.TYPE;
        EnumC4604i2 enumC4604i22 = new EnumC4604i2("INT", 1, cls, Integer.class, 0);
        zzb = enumC4604i22;
        EnumC4604i2 enumC4604i23 = new EnumC4604i2("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC4604i23;
        EnumC4604i2 enumC4604i24 = new EnumC4604i2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC4604i24;
        EnumC4604i2 enumC4604i25 = new EnumC4604i2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC4604i25;
        EnumC4604i2 enumC4604i26 = new EnumC4604i2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC4604i26;
        EnumC4604i2 enumC4604i27 = new EnumC4604i2("STRING", 6, String.class, String.class, "");
        zzg = enumC4604i27;
        EnumC4604i2 enumC4604i28 = new EnumC4604i2("BYTE_STRING", 7, B1.class, B1.class, B1.f35555b);
        zzh = enumC4604i28;
        EnumC4604i2 enumC4604i29 = new EnumC4604i2("ENUM", 8, cls, Integer.class, null);
        zzi = enumC4604i29;
        EnumC4604i2 enumC4604i210 = new EnumC4604i2("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC4604i210;
        zzk = new EnumC4604i2[]{enumC4604i2, enumC4604i22, enumC4604i23, enumC4604i24, enumC4604i25, enumC4604i26, enumC4604i27, enumC4604i28, enumC4604i29, enumC4604i210};
    }

    private EnumC4604i2(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static EnumC4604i2[] values() {
        return (EnumC4604i2[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
