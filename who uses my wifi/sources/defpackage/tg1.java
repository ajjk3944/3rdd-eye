package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tg1 implements ng1 {
    public final xm3 a;
    public final int b;

    public tg1(int i, sn3 sn3Var) {
        this.b = i;
        this.a = sn3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static tg1 b(int i, kz2 kz2Var) {
        String str;
        ng1 ug1Var;
        String str2;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = kz2Var.c;
        int iB = -2;
        int i3 = 0;
        while (kz2Var.B() > 8) {
            int iC = kz2Var.c();
            int iC2 = kz2Var.b + kz2Var.c();
            kz2Var.C(iC2);
            if (iC != 1414744396) {
                rg1 rg1Var = null;
                switch (iC) {
                    case 1718776947:
                        if (iB == 2) {
                            kz2Var.G(4);
                            int iC3 = kz2Var.c();
                            int iC4 = kz2Var.c();
                            kz2Var.G(4);
                            int iC5 = kz2Var.c();
                            switch (iC5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                gg4 gg4Var = new gg4();
                                gg4Var.s = iC3;
                                gg4Var.t = iC4;
                                gg4Var.e(str2);
                                ug1Var = new ug1(new ph4(gg4Var));
                                break;
                            } else {
                                ga1.q(new StringBuilder(String.valueOf(iC5).length() + 44), iC5, "Ignoring track with unsupported compression ");
                                ug1Var = rg1Var;
                                break;
                            }
                        } else {
                            if (iB == 1) {
                                int iM = kz2Var.M();
                                String str3 = iM != 1 ? iM != 85 ? iM != 255 ? iM != 8192 ? iM != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str3 != null) {
                                    int iM2 = kz2Var.M();
                                    int iC6 = kz2Var.c();
                                    kz2Var.G(6);
                                    int iY = v23.y(kz2Var.M(), ByteOrder.LITTLE_ENDIAN);
                                    int iM3 = kz2Var.B() > 0 ? kz2Var.M() : 0;
                                    gg4 gg4Var2 = new gg4();
                                    gg4Var2.e(str3);
                                    gg4Var2.D = iM2;
                                    gg4Var2.E = iC6;
                                    if (str3.equals("audio/raw") && iY != 0) {
                                        gg4Var2.F = iY;
                                    }
                                    if (str3.equals("audio/mp4a-latm") && iM3 > 0) {
                                        byte[] bArr = new byte[iM3];
                                        kz2Var.H(bArr, 0, iM3);
                                        gg4Var2.o = xm3.i(bArr);
                                    }
                                    ug1Var = new ug1(new ph4(gg4Var2));
                                    break;
                                } else {
                                    ga1.q(new StringBuilder(String.valueOf(iM).length() + 43), iM, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                String str4 = v23.a;
                                switch (iB) {
                                    case -2:
                                        str = "none";
                                        break;
                                    case -1:
                                        str = "unknown";
                                        break;
                                    case 0:
                                        str = "default";
                                        break;
                                    case 1:
                                        str = "audio";
                                        break;
                                    case 2:
                                        str = "video";
                                        break;
                                    case 3:
                                        str = "text";
                                        break;
                                    case 4:
                                        str = "image";
                                        break;
                                    case 5:
                                        str = "metadata";
                                        break;
                                    default:
                                        str = "camera motion";
                                        break;
                                }
                                a30.x("Ignoring strf box for unsupported track type: ".concat(str));
                            }
                            ug1Var = rg1Var;
                        }
                    case 1751742049:
                        int iC7 = kz2Var.c();
                        kz2Var.G(8);
                        int iC8 = kz2Var.c();
                        int iC9 = kz2Var.c();
                        kz2Var.G(4);
                        kz2Var.c();
                        kz2Var.G(12);
                        ug1Var = new pg1(iC7, iC8, iC9);
                        break;
                    case 1752331379:
                        int iC10 = kz2Var.c();
                        kz2Var.G(12);
                        kz2Var.c();
                        int iC11 = kz2Var.c();
                        int iC12 = kz2Var.c();
                        kz2Var.G(4);
                        int iC13 = kz2Var.c();
                        int iC14 = kz2Var.c();
                        kz2Var.G(4);
                        rg1Var = new rg1(iC10, iC11, iC12, iC13, iC14, kz2Var.c());
                        ug1Var = rg1Var;
                        break;
                    case 1852994675:
                        ug1Var = new vg1(kz2Var.k(kz2Var.B(), StandardCharsets.UTF_8));
                        break;
                    default:
                        ug1Var = rg1Var;
                        break;
                }
            } else {
                ug1Var = b(kz2Var.c(), kz2Var);
            }
            if (ug1Var != null) {
                if (ug1Var.a() == 1752331379) {
                    iB = ((rg1) ug1Var).b();
                }
                int length = objArrCopyOf.length;
                int i4 = i3 + 1;
                int iD = rm3.d(length, i4);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i3] = ug1Var;
                i3 = i4;
            }
            kz2Var.E(iC2);
            kz2Var.C(i2);
        }
        return new tg1(i, xm3.o(objArrCopyOf, i3));
    }

    @Override // defpackage.ng1
    public final int a() {
        return this.b;
    }

    public final ng1 c(Class cls) {
        xm3 xm3Var = this.a;
        int size = xm3Var.size();
        int i = 0;
        while (i < size) {
            ng1 ng1Var = (ng1) xm3Var.get(i);
            i++;
            if (ng1Var.getClass() == cls) {
                return ng1Var;
            }
        }
        return null;
    }
}
