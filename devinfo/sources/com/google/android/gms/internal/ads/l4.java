package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f13366b;

    /* renamed from: c, reason: collision with root package name */
    public final x41 f13367c;

    public l4(String str, String str2, u51 u51Var) {
        super(str);
        mq0.m(!u51Var.isEmpty());
        this.f13366b = str2;
        x41 x41VarQ = x41.q(u51Var);
        this.f13367c = x41VarQ;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, blocks: (B:69:0x0115, B:82:0x015f, B:84:0x0168, B:86:0x0174, B:102:0x01b8), top: B:113:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0173  */
    @Override // com.google.android.gms.internal.ads.g4, com.google.android.gms.internal.ads.c8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.ads.o6 r8) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l4.a(com.google.android.gms.internal.ads.o6):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4.class == obj.getClass()) {
            l4 l4Var = (l4) obj;
            if (Objects.equals(this.f11366a, l4Var.f11366a) && Objects.equals(this.f13366b, l4Var.f13366b) && this.f13367c.equals(l4Var.f13367c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11366a.hashCode() + 527;
        String str = this.f13366b;
        return this.f13367c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String strValueOf = String.valueOf(this.f13367c);
        String str = this.f11366a;
        int length = String.valueOf(str).length();
        String str2 = this.f13366b;
        StringBuilder sb2 = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        je.u.B(sb2, str, ": description=", str2, ": values=");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
