package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9418b;

    /* renamed from: c, reason: collision with root package name */
    public final LB f9419c;

    public K1(String str, String str2, C1197gC c1197gC) {
        super(str);
        AbstractC0582Jp.m(!c1197gC.isEmpty());
        this.f9418b = str2;
        LB lbM = LB.m(c1197gC);
        this.f9419c = lbM;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    @Override // com.google.android.gms.internal.ads.F1, com.google.android.gms.internal.ads.B3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.O2 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.K1.a(com.google.android.gms.internal.ads.O2):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K1.class == obj.getClass()) {
            K1 k12 = (K1) obj;
            if (Objects.equals(this.f8061a, k12.f8061a) && Objects.equals(this.f9418b, k12.f9418b) && this.f9419c.equals(k12.f9419c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8061a.hashCode() + 527;
        String str = this.f9418b;
        return this.f9419c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F1
    public final String toString() {
        String strValueOf = String.valueOf(this.f9419c);
        String str = this.f8061a;
        int length = String.valueOf(str).length();
        String str2 = this.f9418b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        A.f.w(sb, str, ": description=", str2, ": values=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
