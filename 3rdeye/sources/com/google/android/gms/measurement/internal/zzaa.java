package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
final class zzaa extends zzkn {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkz zzkzVar) {
        super(zzkzVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i10) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:413:0x0a04, code lost:
    
        r0 = r46.zzs.zzay().zzk();
        r8 = com.google.android.gms.measurement.internal.zzeo.zzn(r46.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a18, code lost:
    
        if (r11.zzj() == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a1a, code lost:
    
        r10 = java.lang.Integer.valueOf(r11.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a23, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0a24, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r10));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0747 A[PHI: r0 r6 r20 r22
  0x0747: PHI (r0v111 java.util.Map) = (r0v113 java.util.Map), (r0v119 java.util.Map) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]
  0x0747: PHI (r6v21 android.database.Cursor) = (r6v22 android.database.Cursor), (r6v23 android.database.Cursor) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]
  0x0747: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]
  0x0747: PHI (r22v12 com.google.android.gms.measurement.internal.zzas) = (r22v13 com.google.android.gms.measurement.internal.zzas), (r22v15 com.google.android.gms.measurement.internal.zzas) binds: [B:306:0x0771, B:292:0x0745] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08f0 A[PHI: r0 r13 r18 r48
  0x08f0: PHI (r0v172 java.util.Map) = (r0v174 java.util.Map), (r0v180 java.util.Map) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]
  0x08f0: PHI (r13v14 android.database.Cursor) = (r13v15 android.database.Cursor), (r13v16 android.database.Cursor) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]
  0x08f0: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]
  0x08f0: PHI (r48v7 java.util.Iterator) = (r48v8 java.util.Iterator), (r48v11 java.util.Iterator) binds: [B:379:0x0914, B:369:0x08ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4 A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_LEAVE, TryCatch #13 {all -> 0x01b2, blocks: (B:59:0x019e, B:61:0x01a4, B:69:0x01be, B:70:0x01c3, B:71:0x01cd, B:72:0x01dd, B:81:0x0209, B:74:0x01ec, B:78:0x01fc, B:80:0x0202, B:98:0x0232), top: B:463:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_ENTER, TryCatch #13 {all -> 0x01b2, blocks: (B:59:0x019e, B:61:0x01a4, B:69:0x01be, B:70:0x01c3, B:71:0x01cd, B:72:0x01dd, B:81:0x0209, B:74:0x01ec, B:78:0x01fc, B:80:0x0202, B:98:0x0232), top: B:463:0x019e }] */
    /* JADX WARN: Type inference failed for: r0v51, types: [m0.a, m0.i] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v36, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zza(java.lang.String r47, java.util.List r48, java.util.List r49, java.lang.Long r50, java.lang.Long r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        return false;
    }
}
