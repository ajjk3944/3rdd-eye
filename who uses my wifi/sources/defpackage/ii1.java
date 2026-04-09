package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ii1 implements en1 {
    public final String a;
    public final String b;

    public ii1(String str, String str2) {
        this.a = um.H(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.en1
    public final void a(vl1 vl1Var) {
        Integer numA0;
        Integer numA02;
        Integer numA03;
        Integer numA04;
        String str = this.a;
        int iHashCode = str.hashCode();
        String str2 = this.b;
        switch (iHashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numA0 = zt0.a0(str2)) != null) {
                    vl1Var.i = numA0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numA02 = zt0.a0(str2)) != null) {
                    vl1Var.v = numA02;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numA03 = zt0.a0(str2)) != null) {
                    vl1Var.h = numA03;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    vl1Var.c = str2;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    vl1Var.w = str2;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    vl1Var.a = str2;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    vl1Var.e = str2;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numA04 = zt0.a0(str2)) != null) {
                    vl1Var.u = numA04;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    vl1Var.d = str2;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    vl1Var.b = str2;
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ii1.class == obj.getClass()) {
            ii1 ii1Var = (ii1) obj;
            if (this.a.equals(ii1Var.a) && this.b.equals(ii1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        return ex0.m(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
