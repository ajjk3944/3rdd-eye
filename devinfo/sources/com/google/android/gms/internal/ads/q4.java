package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q4 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15202b;

    public q4(String str, String str2) {
        this.f15201a = mq0.u(str);
        this.f15202b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.c8
    public final void a(o6 o6Var) {
        Integer numR;
        Integer numR2;
        Integer numR3;
        Integer numR4;
        String str = this.f15201a;
        int iHashCode = str.hashCode();
        String str2 = this.f15202b;
        switch (iHashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numR = al0.R(str2)) != null) {
                    o6Var.f14573i = numR;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numR2 = al0.R(str2)) != null) {
                    o6Var.f14585v = numR2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numR3 = al0.R(str2)) != null) {
                    o6Var.f14572h = numR3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    o6Var.f14568c = str2;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    o6Var.f14586w = str2;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    o6Var.f14566a = str2;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    o6Var.f14570e = str2;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numR4 = al0.R(str2)) != null) {
                    o6Var.f14584u = numR4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    o6Var.f14569d = str2;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    o6Var.f14567b = str2;
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q4.class == obj.getClass()) {
            q4 q4Var = (q4) obj;
            if (this.f15201a.equals(q4Var.f15201a) && this.f15202b.equals(q4Var.f15202b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15202b.hashCode() + ((this.f15201a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f15201a;
        int length = String.valueOf(str).length();
        String str2 = this.f15202b;
        return a0.g.p(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
