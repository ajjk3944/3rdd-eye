package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4465u implements InterfaceC4449s, Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final String f35486a;

    public C4465u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f35486a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb A[PHI: r6 r7 r14 r15
  0x00cb: PHI (r6v31 java.lang.String) = 
  (r6v4 java.lang.String)
  (r6v5 java.lang.String)
  (r6v6 java.lang.String)
  (r6v7 java.lang.String)
  (r6v32 java.lang.String)
 binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r7v13 java.lang.String) = 
  (r7v1 java.lang.String)
  (r7v2 java.lang.String)
  (r7v3 java.lang.String)
  (r7v4 java.lang.String)
  (r7v14 java.lang.String)
 binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r14v10 java.lang.String) = 
  (r14v1 java.lang.String)
  (r14v2 java.lang.String)
  (r14v3 java.lang.String)
  (r14v4 java.lang.String)
  (r14v11 java.lang.String)
 binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r15v7 java.lang.String) = 
  (r15v1 java.lang.String)
  (r15v2 java.lang.String)
  (r15v3 java.lang.String)
  (r15v4 java.lang.String)
  (r15v8 java.lang.String)
 binds: [B:111:0x019c, B:107:0x018a, B:103:0x0178, B:99:0x0166, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC4449s e(java.lang.String r22, com.google.android.gms.internal.measurement.Z2 r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4465u.e(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4465u) {
            return this.f35486a.equals(((C4465u) obj).f35486a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35486a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4481w(this);
    }

    public final String toString() {
        return "\"" + this.f35486a + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s zzc() {
        return new C4465u(this.f35486a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f35486a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Double zze() {
        if (this.f35486a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f35486a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final String zzf() {
        return this.f35486a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4449s
    public final Iterator zzh() {
        return new C4489x(this);
    }
}
