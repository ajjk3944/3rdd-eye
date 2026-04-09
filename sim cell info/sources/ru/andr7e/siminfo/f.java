package ru.andr7e.siminfo;

/* loaded from: classes.dex */
public class f {
    public static String A(String str, String str2) {
        if (!y(str) || !y(str2)) {
            return "-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2.length() == 1) {
            sb.append(0);
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void B(b bVar, StringBuilder sb) {
        int i2;
        String str;
        int i3 = bVar.f3244h;
        sb.append(b.c(i3));
        sb.append(" ");
        sb.append(t(bVar.f3248l, bVar.f3249m));
        if (i3 != 3) {
            if (i3 == 4) {
                i2 = bVar.f3258v;
                str = " csirsrq";
            }
            c(sb, " rssi", bVar.f3259w, false);
            i(bVar, sb, true);
        }
        i2 = bVar.f3258v;
        str = " rsrq";
        c(sb, str, i2, false);
        c(sb, " rssi", bVar.f3259w, false);
        i(bVar, sb, true);
    }

    public static void C(b bVar, StringBuilder sb) {
        D(bVar, sb, false);
        sb.append("\n");
        B(bVar, sb);
    }

    public static void D(b bVar, StringBuilder sb, boolean z2) {
        sb.append(bVar.f3247k);
        sb.append(")");
        if (!z2) {
            sb.append(" ");
            sb.append(bVar.f3245i ? "A" : "N");
        }
        sb.append(" ");
        String strS = s(bVar.f3237a, bVar.f3238b);
        String strA = bVar.a();
        if (strA != null && strA.length() > 1) {
            sb.append(strA);
            sb.append(" ");
        }
        if (strS != null) {
            sb.append(strS);
        }
    }

    static void a(StringBuilder sb, String str, int i2, boolean z2) {
        boolean z3 = i2 != Integer.MAX_VALUE;
        if (z2 || z3) {
            sb.append(str);
            sb.append(":");
            sb.append(" ");
            if (z3) {
                sb.append(i2);
            } else {
                sb.append("-");
            }
        }
    }

    static void b(StringBuilder sb, String str, long j2, boolean z2) {
        boolean z3 = j2 != Long.MAX_VALUE;
        if (z2 || z3) {
            sb.append(str);
            sb.append(":");
            sb.append(" ");
            if (z3) {
                sb.append(j2);
            } else {
                sb.append("-");
            }
        }
    }

    static void c(StringBuilder sb, String str, int i2, boolean z2) {
        boolean z3 = i2 != Integer.MAX_VALUE;
        if (z2 || z3) {
            sb.append(str);
            sb.append(" ");
            if (z3) {
                sb.append(i2);
            } else {
                sb.append("-");
            }
        }
    }

    static void d(StringBuilder sb, String str, String str2, boolean z2) {
        boolean z3 = (str2 == null || str2.isEmpty()) ? false : true;
        if (z2 || z3) {
            sb.append(str);
            sb.append(":");
            sb.append(" ");
            if (z3) {
                sb.append(str2);
            } else {
                sb.append("-");
            }
        }
    }

    static void e(StringBuilder sb, int i2, int i3) {
        if (w(i3)) {
            String strB = b.b(i2);
            String strU = u(i3);
            sb.append(strB);
            sb.append(":");
            sb.append(" ");
            sb.append(strU);
        }
    }

    public static String f(int[] iArr, boolean z2) {
        boolean z3 = true;
        boolean z4 = z2 && n0.b.g();
        boolean z5 = !z2 && n0.b.f();
        if (!z4 && !z5) {
            z3 = false;
        }
        if (iArr == null || iArr.length <= 0 || !z3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("API: ");
        int i2 = 0;
        for (int i3 : iArr) {
            if (i2 > 0) {
                sb.append(", ");
            }
            q(i3, sb, z2 ? 4 : 3);
            i2++;
        }
        return sb.toString();
    }

    public static String g(int i2) {
        return h(i2, " MHz");
    }

    public static String h(int i2, String str) {
        if (i2 <= 0 || !w(i2)) {
            return null;
        }
        int i3 = i2 / 1000;
        int i4 = i2 % 1000;
        if (i4 == 0) {
            return i3 + str;
        }
        return i3 + "." + (i4 / 100) + str;
    }

    public static void i(b bVar, StringBuilder sb, boolean z2) {
        int i2;
        boolean z3;
        String str;
        int i3 = bVar.f3244h;
        if (z2) {
            l(bVar, sb);
        }
        if (z2) {
            sb.append("\n");
        }
        String str2 = "TAC";
        String str3 = "CI";
        String str4 = null;
        boolean z4 = true;
        if (i3 == 1) {
            str2 = "LAC";
            str3 = "CID";
        } else if (i3 == 2) {
            str4 = "PSC";
            str2 = "LAC";
            str3 = "CID";
        } else {
            if (i3 != 3 && i3 != 4) {
                str2 = null;
                str3 = null;
            }
            str4 = "PCI";
        }
        int i4 = bVar.f3239c;
        if (!z(i4)) {
            i4 = Integer.MAX_VALUE;
        }
        a(sb, str2, i4, true);
        sb.append(" ");
        int i5 = bVar.f3240d;
        long j2 = bVar.f3241e;
        if (bVar.f3244h == 4) {
            if (j2 >= 68719476735L) {
                j2 = Long.MAX_VALUE;
            }
            b(sb, str3, j2, true);
        } else {
            if (!x(i5)) {
                i5 = Integer.MAX_VALUE;
            }
            a(sb, str3, i5, true);
        }
        sb.append(" ");
        if (str4 != null) {
            a(sb, str4, bVar.f3242f, true);
            sb.append(" ");
        }
        if (bVar.f3244h == 3 && w(bVar.f3250n) && z2) {
            a(sb, "TA", bVar.f3250n, false);
            sb.append(" ");
        }
        if (i3 == 3) {
            if (i5 != Integer.MAX_VALUE) {
                sb.append("\n");
                int i6 = i5 / 256;
                i2 = i5 - (i6 * 256);
                a(sb, "eNB", i6, true);
                sb.append(" ");
                a(sb, "CID", i2, true);
                z3 = true;
            }
            z3 = false;
        } else {
            if (i3 == 4) {
                if (j2 != Long.MAX_VALUE && n0.b.h()) {
                    sb.append("\n");
                    long jPow = (int) Math.pow(2.0d, 36 - MyApplication.e().d());
                    long j3 = j2 / jPow;
                    b(sb, "gNB", j3, true);
                    sb.append(" ");
                    a(sb, "CID", (int) (j2 - (jPow * j3)), true);
                    z3 = true;
                }
            } else if (i3 == 2 && i5 != Integer.MAX_VALUE) {
                sb.append("\n");
                int i7 = i5 / 65536;
                i2 = i5 % 65536;
                a(sb, "RNC", i7, true);
                sb.append(" ");
                a(sb, "CID", i2, true);
                z3 = true;
            }
            z3 = false;
        }
        String str5 = bVar.f3256t;
        boolean z5 = (str5 == null && bVar.f3257u == null) ? false : true;
        if ((!z3 || str5 == null) && bVar.f3257u == null) {
            z4 = z5;
        }
        if (z4) {
            if (z3) {
                sb.append(" ");
            } else {
                sb.append("\n");
            }
        }
        String str6 = bVar.f3256t;
        if (str6 != null) {
            sb.append(str6);
            sb.append(" ");
        }
        if (bVar.f3244h == 3 && (str = bVar.f3257u) != null) {
            d(sb, "BW", str, false);
        }
        if (z2) {
            return;
        }
        l(bVar, sb);
    }

    public static void j(b bVar, StringBuilder sb, String str) {
        String strA = bVar.a();
        String strC = b.c(bVar.f3244h);
        sb.append(strA);
        sb.append(str);
        sb.append(strC);
    }

    public static void k(b bVar) {
        int i2 = bVar.f3244h;
        if (i2 == 3) {
            o(bVar);
            return;
        }
        if (i2 == 4) {
            p(bVar);
        } else if (i2 == 2) {
            n(bVar);
        } else if (i2 == 1) {
            m(bVar);
        }
    }

    static void l(b bVar, StringBuilder sb) {
        int i2 = bVar.f3253q;
        int i3 = bVar.f3244h;
        if (i2 <= 0 || !(i3 == 3 || i3 == 2)) {
            String str = bVar.f3254r;
            if (str != null && i3 == 4) {
                sb.append("\n");
                sb.append(bVar.f3254r);
                if (bVar.f3243g != Integer.MAX_VALUE) {
                    sb.append(" ");
                    e(sb, i3, bVar.f3243g);
                }
                if (bVar.f3255s == null) {
                    return;
                }
            } else {
                if (str == null || i3 != 1) {
                    if (bVar.f3243g != Integer.MAX_VALUE) {
                        sb.append(" ");
                        e(sb, i3, bVar.f3243g);
                        return;
                    }
                    return;
                }
                sb.append("\n");
                sb.append(bVar.f3254r);
                if (bVar.f3243g != Integer.MAX_VALUE) {
                    sb.append(" ");
                    e(sb, i3, bVar.f3243g);
                }
                if (bVar.f3255s == null) {
                    return;
                }
            }
        } else {
            sb.append("\n");
            q(i2, sb, bVar.f3244h);
            if (bVar.f3243g != Integer.MAX_VALUE) {
                sb.append(" ");
                e(sb, i3, bVar.f3243g);
            }
            if (bVar.f3255s == null) {
                return;
            }
        }
        sb.append(" ");
        sb.append(bVar.f3255s);
    }

    private static void m(b bVar) {
        int i2 = bVar.f3243g;
        if (w(i2)) {
            bVar.h(n0.c.e(i2));
        }
    }

    private static void n(b bVar) {
        int iA;
        String strB;
        int i2 = bVar.f3243g;
        if (w(i2)) {
            int iC = n0.e.c(i2);
            if (iC >= 0) {
                int iA2 = n0.e.a(iC);
                if (iA2 <= 0) {
                    return;
                }
                bVar.e(iA2);
                strB = n0.e.b(iC, i2);
            } else {
                int iC2 = n0.d.c(i2);
                if (iC2 < 0 || (iA = n0.d.a(iC2)) <= 0) {
                    return;
                }
                bVar.e(iA);
                strB = n0.d.b(iC2, i2);
            }
            bVar.g(strB);
        }
    }

    private static void o(b bVar) {
        int iD;
        int iB;
        int i2 = bVar.f3243g;
        if (!w(i2) || (iD = n0.f.d(i2)) < 0 || (iB = n0.f.b(iD)) <= 0) {
            return;
        }
        bVar.e(iB);
        bVar.g(n0.f.c(iD, i2));
    }

    private static void p(b bVar) {
        int iB;
        String strE;
        int i2 = bVar.f3243g;
        if (!w(i2) || (iB = a.b(i2)) < 0 || (strE = a.e(a.f(iB, i2), i2, bVar)) == null) {
            return;
        }
        bVar.h(strE);
    }

    public static void q(int i2, StringBuilder sb, int i3) {
        String str;
        if (i3 == 3 || i3 == 2) {
            sb.append("B");
            str = i2 < 10 ? "0" : "n";
            sb.append(i2);
        } else if (i3 != 4) {
            return;
        }
        sb.append(str);
        sb.append(i2);
    }

    public static String r(int i2, int i3) {
        return "LAC:" + u(i2) + " CID:" + u(i3);
    }

    public static String s(String str, String str2) {
        return "MCC: " + v(str) + " MNC: " + v(str2);
    }

    public static String t(int i2, int i3) {
        return u(i2) + " dBm asu " + u(i3);
    }

    public static String u(int i2) {
        return i2 == Integer.MAX_VALUE ? "-" : String.valueOf(i2);
    }

    private static String v(String str) {
        return (str != null && y(str)) ? str : "-";
    }

    public static boolean w(int i2) {
        return i2 != Integer.MAX_VALUE;
    }

    private static boolean x(int i2) {
        return i2 != 268435455;
    }

    static boolean y(String str) {
        return (str == null || str.equals("00") || str.equals("000")) ? false : true;
    }

    private static boolean z(int i2) {
        return i2 != 65535;
    }
}
